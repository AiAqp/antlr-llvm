class ValueStack: 

    def __init__(self):
        self.value_stack = []
    
    def pop(self) -> str:
        if self.value_stack:
            return self.value_stack.pop()
        else: 
            print('Warning: stack empty')
            return 'Empty'


    def push(self,value:str,type:str):
        self.value_stack.append((value,type))
    

    def push_row(self, elements:int):
        value = []
        row_value = []
        type = ''
        for i in range(elements):
            row_value.append(self.value_stack.pop())
            value.append((row_value[i])[0])
            if i>0:
                if (row_value[i])[1] != (row_value[i-1])[1]:
                    print('type mismatch in array declaration')
                    type = 'struct'
            else: 
                type = row_value[i][1]
        self.value_stack.append((value,type))


    def status(self):
        print ("Stack:",self.value_stack)
        

    

    