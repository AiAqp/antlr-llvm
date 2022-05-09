from generated.LanguageListener import LanguageListener
from generated.LanguageLexer import LanguageLexer
from generated.LanguageParser import LanguageParser
from llvmlite import ir

class LanguageListener(LanguageListener):

    def __init__(self):
        self.value_stack = []
        self.mainspace = {}
        self.module = ir.Module(name=__file__)
        # atomic types 
        self.voidptr_ty = ir.IntType(8).as_pointer()
        self.typ_void = ir.FunctionType(ir.VoidType(), [])
        self.int64 = ir.IntType(64)
        self.double = ir.DoubleType()

# START

    def enterStart(self, ctx:LanguageParser.StartContext):
        pass

    def exitStart(self, ctx:LanguageParser.StartContext):
        llvm_ir = str(self.module)
        with open("%s.ll" % "main", "w") as o:
            o.write(llvm_ir)

        print ("Value stack:",self.value_stack)
        for i in self.mainspace: 
            print(i,'=',self.mainspace[i])

# ASSIGN

    def exitAssignEvaluate(self, ctx:LanguageParser.AssignEvaluateContext):
        id_ = str(ctx.ID())
        scope_ = str(ctx.SCOPE())
        type_ = str(ctx.TYP())
        if self.value_stack:
            value_ = self.value_stack.pop()
            if value_[1] == type_:
                self.mainspace[id_] = (scope_,type_,value_[0])
            else: print ("type mismatch, recieved ", value_[1], "expected", type_)
        else: self.mainspace[id_] = (scope_,type_,'none')
        

    def exitAssignID(self, ctx:LanguageParser.AssignIDContext):
        pass

    def exitAssignUninit(self, ctx:LanguageParser.AssignUninitContext):
        pass

# VALUE

    def exitValueBool(self, ctx:LanguageParser.ValueBoolContext):
        value_ = ctx.BOOL()
        self.value_stack.append((value_,'bool'))


    def exitValueID(self, ctx:LanguageParser.ValueIDContext):
        pass


    def exitValueDecimal(self, ctx:LanguageParser.ValueDecimalContext):
        value_ = ctx.getText()
        self.value_stack.append((value_,'double'))


    def exitValueInt(self, ctx:LanguageParser.ValueIntContext):
        value_ = ctx.getText()
        self.value_stack.append((value_,'int'))


    def exitValueString(self, ctx:LanguageParser.ValueStringContext):
        value_ = str(ctx.N_STRING())
        self.value_stack.append((value_,'str'))


    def exitValueArray(self, ctx:LanguageParser.ValueArrayContext):
        pass


    def exitValueCall(self, ctx:LanguageParser.ValueCallContext):
        pass

# ARRAY Body 

    def exitArray_row(self, ctx:LanguageParser.Array_rowContext):
        count_ = len(ctx.COM())+1 
        value_ = []
        row_value_ = []
        type_ = ''
        for i in range(count_):
            row_value_.append(self.value_stack.pop())
            value_.append((row_value_[i])[0])
            if i>0:
                if (row_value_[i-1])[1] != (row_value_[i-1])[1]:
                    print('type mismatch in array declaration')
                    type_ = 'array?'
            else: 
                type_ = row_value_[i][1]
        type_ = 'array'
        self.value_stack.append((value_,type_))

                
                
        



    # def exitValue(self, ctx:LanguageParser.ValueContext):
    #     self.value_stack.append(ctx.getText())
    #     # d_bool = ctx.BOOL().getText()
    #     # d_id = ctx.ID().getText()
    #     # d_string = ctx.N_STRING().getText()
    #     # print(d_bool)
    #     pass

    # Exit a parse tree produced by LanguageParser#instr.
    def exitInstr(self, ctx:LanguageParser.InstrContext):
        pass


    # Exit a parse tree produced by LanguageParser#expressionValue.
    def exitExpressionValue(self, ctx:LanguageParser.ExpressionValueContext):
        pass


    # Exit a parse tree produced by LanguageParser#expressionBool.
    def exitExpressionBool(self, ctx:LanguageParser.ExpressionBoolContext):
        pass


    # Exit a parse tree produced by LanguageParser#expressionArithm.
    def exitExpressionArithm(self, ctx:LanguageParser.ExpressionArithmContext):
        pass


    # Exit a parse tree produced by LanguageParser#expressionNested.
    def exitExpressionNested(self, ctx:LanguageParser.ExpressionNestedContext):
        pass
    
    # Enter a parse tree produced by LanguageParser#n_func.
    def enterN_func(self, ctx:LanguageParser.N_funcContext):

        ids = ctx.ID()
        id_ = ids[0]
        for i in ids[1:]: print('Function: ', id_, 'takes: ', i)
        pass

    # Exit a parse tree produced by LanguageParser#n_func.
    def exitN_func(self, ctx:LanguageParser.N_funcContext):
        pass

    # Enter a parse tree produced by LanguageParser#n_clas.
    def enterN_clas(self, ctx:LanguageParser.N_clasContext):
        pass

    # Exit a parse tree produced by LanguageParser#n_clas.
    def exitN_clas(self, ctx:LanguageParser.N_clasContext):
        pass


    # Exit a parse tree produced by LanguageParser#n_array.
    def exitN_array(self, ctx:LanguageParser.N_arrayContext):
        pass


    # Exit a parse tree produced by LanguageParser#n_if.
    def exitN_if(self, ctx:LanguageParser.N_ifContext):
        pass


    # Exit a parse tree produced by LanguageParser#n_for.
    def exitN_for(self, ctx:LanguageParser.N_forContext):
        pass


    # Exit a parse tree produced by LanguageParser#call.
    def exitCall(self, ctx:LanguageParser.CallContext):
        pass


    # Exit a parse tree produced by LanguageParser#clas.
    def exitClas(self, ctx:LanguageParser.ClasContext):
        pass


    # Exit a parse tree produced by LanguageParser#func_clas.
    def exitFunc_clas(self, ctx:LanguageParser.Func_clasContext):
        pass


    # Exit a parse tree produced by LanguageParser#array.
    def exitArray(self, ctx:LanguageParser.ArrayContext):
        pass


    # Exit a parse tree produced by LanguageParser#array_range.
    def exitArray_range(self, ctx:LanguageParser.Array_rangeContext):
        pass
        

    

 