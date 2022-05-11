from llvmlite import ir

class Compiler:

    def __init__(self):
        self.value_stack = []
        self.namespace = {} #scope, type, value
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

    # Value stack methods

    def stack_pop(self):
        if self.value_stack:
            return self.value_stack.pop()
        else: 
            print('Warning: stack empty')
            return 'Empty'

    def stack_push(self,value:str,type:str):
        self.value_stack.append(self.ir_type_map[type](value))
    
    def stack_row(self, elements:int):
        n = elements
        row = []
        while elements > 0:
            row.append(self.value_stack.pop())
            elements -= 1
        self.value_stack.append(ir.ArrayType(row[0].type, n)(row))

    # Name space methods 

    def new_variable(self,id:str):
        c = self.stack_pop()
        self.namespace[id] = ir.GlobalVariable(self.module, c.type, name=id)
        return c
        
    def init_variable(self,id:str,value):
        self.namespace[id].linkage = 'internal'
        self.namespace[id].initializer = value
    

    def init_func(self):
        pass

    def status(self):
        for i in self.namespace: 
            print(i,'=',self.namespace[i])
        for i in self.value_stack:
            print(i)

    def ir_to_ll(self):
        with open("%s.ll" % "main", "w") as o:
            o.write(str(self.module))

