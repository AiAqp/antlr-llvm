class NameSpace:

    def __init__(self) -> None:
        self.namespace = {}

    def convert_value(self, type:str, value:str):
        if type == 'bool': return 0 
        if type == 'int': return int(value)
        if type == 'double': return float(value)
        # add error

    def convert_agregate(self, obj_type:str, dat_type:str, value:str):
        if obj_type == 'array':
            if dat_type == 'bool': return 0
            if dat_type == 'int': return [int(i) for i in reversed(value)]
            if dat_type == 'double': return [float(i) for i in reversed(value)]
        if obj_type == 'struct': return 0
        # add error

            
    def init_object(self,id,scope:str,type:str,stack:tuple[str,str]):
        stack_value, stack_type = stack

        if type == stack_type:
            if id in self.namespace: print('Warning: already declared')
            if type == 'str':
                self.namespace[id] = (scope, type, stack_value)
            else:
                self.namespace[id] = (scope, type, self.convert_value(type, stack_value))
        elif type == 'array' or 'struct':
            self.namespace[id] = (scope, type, self.convert_agregate(type,stack_type,stack_value))  
        else: print('Error: mismatch, expected',type,'recieved',stack_type) 


    def new_string(self):
        pass

    def init_value(self):
        # compare input value - convert/error
        pass

    def init_func(self):
        pass

    def status(self):
        if self.namespace:
            for i in self.namespace: 
                print(i,'=',self.namespace[i])
        else:
            print('Namespace empty!')

