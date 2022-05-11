from llvmlite import ir

class ValueStack: 

    def __init__(self):
        self.module = ir.Module(name=__file__) 
        self.namespace = {}
        self.value_stack = [] #value, type 
        self.ir_value_stack = []
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
            'voidf': ir.FunctionType(ir.VoidType(), [])
        }
    
    def pop(self):
        if self.value_stack:
            return self.value_stack.pop()
        else: 
            print('Warning: stack empty')
            return 'Empty'


    def push(self,value:str,type:str):
        self.value_stack.append((value,type))
        
    def ir_push(self,value:str,type:str):
        self.ir_value_stack.append(self.ir_type_map[type](value))
    

    def push_row(self, elements:int):
        row = []
        v_0,t_0 = self.value_stack.pop()
        row.append(self.type_map[t_0](v_0))
        i = elements - 1
        while i  > 0:
            i -= 1
            v,t = self.value_stack.pop()
            if t == t_0:
                row.append(self.type_map[t](v))
            else:
                print('Error: row type mismatch')
        self.value_stack.append((row,ir.ArrayType(self.ir_type_map[t_0], elements)))
        self.ir_value_stack.append(ir.ArrayType(self.ir_type_map[t_0], elements)(row))

    def ir_push_row(self, elements:int):
        n = elements
        row = []
        while elements > 0:
            row.append(self.ir_value_stack.pop())
            elements -= 1
            print('grinding..')
        self.ir_value_stack.append(ir.ArrayType(row[0].type, n)(row))

    def ir_new(self,id:str,value):
        c = value
        self.namespace[id] = ir.GlobalVariable(self.module, c.type, name=id)
    
    def ir_init(self,id:str,value):
        self.namespace[id].linkage = 'internal'
        self.namespace[id].initializer = value

    def status(self):
        print ("Stack:",self.value_stack)

    def ir_to_ll(self):
        with open("%s.ll" % "main", "w") as o:
            o.write(str(self.module))

test = ValueStack()
test.push('10','int')
test.push('11','int')
test.push('12','int')
test.ir_push('10','int')
test.ir_push('1','int')
test.ir_push('102','int')
test.ir_push('101','int')
test.ir_push_row(3)

# for i in test.ir_value_stack: print(i)


if test.ir_value_stack[0].type == test.ir_value_stack[0].type:
    print('eq')
else: 
    print('not eq')

val = test.ir_value_stack[-1]
val0 = test.ir_value_stack[0]
# print(val)
# print(val0)

test.ir_new('var1',val)
test.ir_init('var1',val)
test.ir_new('var2',val0)
test.ir_init('var2',val0)
test.ir_to_ll()



    

    