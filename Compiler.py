from llvmlite import ir

class Compiler:

    def __init__(self):
        self.inhibit_push = 0
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
            'str': lambda v: ir.Constant(ir.ArrayType(ir.IntType(8), len(v)), bytearray(v.encode("utf8"))), 
            'array' : lambda t, n: ir.ArrayType(self.ir_type_map[t], n)
        }
        self.module = ir.Module(name=__file__)
    
    def arithemtic(self):
        a = self.stack_pop()
        b = self.stack_pop()
        c = a.add(b)
        self.value_stack.append(c)
        return a 


    def init_main(self):
        self.main_f = ir.Function(self.module, self.ir_type_map['voidf'], name = 'main')
        self.main_b = self.main_f.append_basic_block(name='entry main')
        self.main = ir.IRBuilder(self.main_b) 
    
    def new_function(self, id: str, type:str, arg_types):
        arg_typ = []
        self.inhibit_push = len(arg_types)
        for i in arg_types:
            arg_typ.append(self.ir_type_map[i])
        f_type = ir.FunctionType(self.ir_type_map[type],arg_typ)
        f = ir.Function(self.module, f_type, name=id)
        self.globalspace[id] = f

    def new_builder(self,id: str,arg_ids):
        block = self.globalspace[id].append_basic_block(name='start '+id)
        args = self.globalspace[id].args
        for i in args:
            self.localspace[arg_ids.pop(0)] = i
        self.builder = ir.IRBuilder(block)

    def terminate(self):
        self.builder = None
        
    # Value stack methods

    def stack_pop(self):
        if self.value_stack:
            return self.value_stack.pop()
        else: 
            print('Warning: stack empty')
            return 'Empty'

    def stack_push(self,value:str,type:str):
        if self.inhibit_push == 0:
            self.value_stack.append(self.ir_type_map[type](value))
        else:
            self.inhibit_push -=1
    
    def stack_row(self, elements:int):
        n = elements
        row = []
        while elements > 0:
            row.append(self.value_stack.pop())
            elements -= 1
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
                if c == 'Empty':
                    print('Error: no constant declared for '+id)
                else:
                    self.globalspace[id] = ir.GlobalVariable(self.module, c.type, name=id)
                    self.globalspace[id].initializer = c
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

