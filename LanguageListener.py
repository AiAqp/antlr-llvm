from Compiler import Compiler
from generated.LanguageListener import LanguageListener
from generated.LanguageLexer import LanguageLexer
from generated.LanguageParser import LanguageParser

class LanguageListener(LanguageListener):

    def __init__(self):
        self.compiler = Compiler()

# START

    def enterStart(self, ctx:LanguageParser.StartContext):
        pass

    def exitStart(self, ctx:LanguageParser.StartContext):
        self.compiler.status()
        self.compiler.ir_to_ll()

# ASSIGN

    def exitAssignEvaluate(self, ctx:LanguageParser.AssignEvaluateContext):
        # str(ctx.ID()),str(ctx.SCOPE()),str(ctx.TYP())
        id = str(ctx.ID())
        var = self.compiler.new_variable(id)
        self.compiler.init_variable(id, var)

    def exitAssignID(self, ctx:LanguageParser.AssignIDContext):
        pass

    def exitAssignUninit(self, ctx:LanguageParser.AssignUninitContext):
        pass

# VALUE

    def exitValueBool(self, ctx:LanguageParser.ValueBoolContext):
        self.compiler.stack_push(ctx.getText(),'bool')

    def exitValueID(self, ctx:LanguageParser.ValueIDContext):
        print('ID --> '+ctx.getText())
        


    def exitValueDecimal(self, ctx:LanguageParser.ValueDecimalContext):
        self.compiler.stack_push(ctx.getText(),'double')


    def exitValueInt(self, ctx:LanguageParser.ValueIntContext):
        self.compiler.stack_push(ctx.getText(), 'int')


    def exitValueString(self, ctx:LanguageParser.ValueStringContext):
        # self.compiler.stack_push(ctx.getText()[1:-1], 'str')
        pass


    def exitValueArray(self, ctx:LanguageParser.ValueArrayContext):
        pass


    def exitValueCall(self, ctx:LanguageParser.ValueCallContext):
        pass

# ARRAY Body 

    def exitArray_row(self, ctx:LanguageParser.Array_rowContext):
        self.compiler.stack_row(len(ctx.COM())+1)

# INSTRUCTION

    def exitInstr(self, ctx:LanguageParser.InstrContext):
        pass

# EXPRESSION

    def exitExpressionValue(self, ctx:LanguageParser.ExpressionValueContext):
        pass


    def exitExpressionBool(self, ctx:LanguageParser.ExpressionBoolContext):
        pass


    def exitExpressionArithm(self, ctx:LanguageParser.ExpressionArithmContext):
        pass


    def exitExpressionNested(self, ctx:LanguageParser.ExpressionNestedContext):
        pass
    
# FUNCTION

    def enterN_func(self, ctx:LanguageParser.N_funcContext):
        ids = ctx.ID()
        id_ = ids[0]
        for i in ids[1:]: print('Function: ', id_, 'takes: ', i)
        pass


    def exitN_func(self, ctx:LanguageParser.N_funcContext):
        pass

# CLASS

    def enterN_clas(self, ctx:LanguageParser.N_clasContext):
        pass


    def exitN_clas(self, ctx:LanguageParser.N_clasContext):
        pass



    def exitN_array(self, ctx:LanguageParser.N_arrayContext):
        pass



    def exitN_if(self, ctx:LanguageParser.N_ifContext):
        pass



    def exitN_for(self, ctx:LanguageParser.N_forContext):
        pass



    def exitCall(self, ctx:LanguageParser.CallContext):
        pass



    def exitClas(self, ctx:LanguageParser.ClasContext):
        pass



    def exitFunc_clas(self, ctx:LanguageParser.Func_clasContext):
        pass



    def exitArray(self, ctx:LanguageParser.ArrayContext):
        pass



    def exitArray_range(self, ctx:LanguageParser.Array_rangeContext):
        pass
        

    

 