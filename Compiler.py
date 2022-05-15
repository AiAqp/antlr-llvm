from llvmlite import ir

class Compiler:

    def __init__(self):
        self.inhibit_push = 0
        self.active_class = False
        self.value_stack = []
        self.globalspace = {}
        self.localspace = {}
        self.builder = None 
        
        self.type_map = {
            'bool': lambda v: 0,
            'int': lambda v: int(v),
            'double': lambda v: float(v),
            'array' : lambda vt: [self.type_map[vt[1]](i) for i in reversed(vt[0])],
            'struct' : lambda v: 0
        } 
        self.ir_type_map = {
            'bool': ir.IntType(64),
            'int': ir.IntType(64),
            'double': ir.DoubleType(),
            '*void': ir.IntType(8).as_pointer(),
            'voidf': ir.FunctionType(ir.VoidType(), []),
            'void': ir.FunctionType(ir.VoidType(), []),
            'str': lambda v: ir.Constant(ir.ArrayType(ir.IntType(8), len(v)), bytearray(v.encode("utf8"))), 
            'array' : lambda t, n: ir.ArrayType(self.ir_type_map[t], n)
        }
        self.module = ir.Module(name=__file__)
    
    def arithemtic(self):
        a = self.stack_pop()
        b = self.stack_pop()
        if self.builder:
            if a and b:
                v = self.builder.add(a,b)
                self.value_stack.append(v)
            else:
                print('Error: cant add function values',a,b)
        else:
            if a and b:
                c = a.add(b)
                self.value_stack.append(c)
            else:
                print('Error: cant add values',a,b)
         

    def init_main(self):
        self.main_f = ir.Function(self.module, self.ir_type_map['voidf'], name = 'main')
        self.main_b = self.main_f.append_basic_block(name='entry main')
        self.main = ir.IRBuilder(self.main_b) 
    
    def new_function(self, id:str, type:str, arg_len:int):
        types = []
        ids = []
        while arg_len > 0:
            v = self.value_stack.pop()
            types.append(v[1])
            ids.append(v[0])
            arg_len -= 1
        f_type = ir.FunctionType(self.ir_type_map[type],types)
        f = ir.Function(self.module, f_type, name=id)
        for i in f.args:
            x = ids.pop(0)
            print('!!!',i,x)
            self.localspace[x] = i
        self.globalspace[id] = f
        block = f.append_basic_block(name='start '+id)
        self.builder = ir.IRBuilder(block)
    

    def new_builder(self,id: str,arg_ids):
        block = self.globalspace[id].append_basic_block(name='start '+id)
        args = self.globalspace[id].args
        
        for i in args:
            
            x = arg_ids.pop(0)
            print('!!!',i,x)
            self.localspace[x] = i
        self.builder = ir.IRBuilder(block)
        print('exit builder ->',self.localspace)

    def terminate(self):
        v = self.stack_pop()
        print('TERMINATOR -->',v)
        self.builder.ret(v)
        self.builder = None

    def new_struct(self, id:str, len:int):
        types = []
        ctx = ir.global_context
        structure = ctx.get_identified_type(id)
        while len > 0:
            v = self.value_stack.pop()[1]
            types.insert(0,v)
            len -= 1
        structure.set_body(*types)
        self.globalspace[id] = structure

    def new_class(self, id:str):
        int32 = ir.IntType(32)
        class_typ = self.globalspace[id]
        ptr_typ = ir.PointerType(class_typ)
        f_t = ir.FunctionType(ir.VoidType(),[ptr_typ],var_arg=True)
        f = ir.Function(self.module, f_t, name='initializer')
        block = f.append_basic_block(name='initializer')
        l_builder = ir.IRBuilder(block)
        class_self = f.args[0]
        instance_p = l_builder.gep(class_self, [int32(0), int32(0)], inbounds=True)
        l_builder.store(int32(0),instance_p,align=1)
        l_builder.ret_void
    
    def terminate_class(self):
        self.active_class = True

    # Value stack methods

    def stack_pop(self):
        if self.value_stack:
            return self.value_stack.pop()
        else: 
            print('Warning: reading from empty stack')
            return None

    def stack_push(self, value = '',type = '', id = ''):
        if self.inhibit_push > 0:
            print('inhibit',id)
            self.inhibit_push -=1
            return
        if id and self.builder:
            if id in self.localspace:
                self.value_stack.append(self.localspace[id])
                print('local - - - - -',self.value_stack)
            elif id in self.globalspace:
                print('global - - - - -',self.value_stack)
                self.value_stack.append(self.globalspace[id])
            else:
                print('Error, no variable', id)
                self.value_stack.append(None)
            return
        if id:
            if id in self.globalspace:
                self.value_stack.append(self.globalspace[id])
            else:
                print('Error, no variable', id)
                self.value_stack.append(None)
            return
        self.value_stack.append(self.ir_type_map[type](value))       

    def stack_push_typ(self, id, typ):
        self.value_stack.append((id, self.ir_type_map[typ]))

    def stack_row(self, len:int):
        n = len
        row = []
        while len > 0:
            row.append(self.value_stack.pop())
            len -= 1
        self.value_stack.append(ir.ArrayType(row[0].type, n)(row))

    # Name space methods 

    def new_var(self, id:str, type:str = ''):
        if self.builder:
            pass
        else:
            if type:
                self.globalspace[id] = ir.GlobalVariable(self.module, self.ir_type_map[type], name=id)
            else:
                c = self.stack_pop()
                if c:
                    self.globalspace[id] = ir.GlobalVariable(self.module, c.type, name=id)
                    self.globalspace[id].initializer = c
                else:
                    print('Error: no constant declared for '+id)
            self.globalspace[id].linkage = 'internal'
    

    def init_func(self):
        pass

    def status(self):
        for i in self.globalspace: 
            print(i,'=',self.globalspace[i])
        for i in self.value_stack:
            print(i)

    def ir_to_ll(self):
        self.main.ret_void()
        with open("%s.ll" % "main", "w") as o:
            o.write(str(self.module))

