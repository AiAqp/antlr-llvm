from Compiler import Compiler
from generated.LanguageListener import LanguageListener
from generated.LanguageLexer import LanguageLexer
from generated.LanguageParser import LanguageParser

class LanguageListener(LanguageListener):

    def __init__(self):
        self.compiler = Compiler()

# START

    def enterStart(self, ctx:LanguageParser.StartContext):
        self.compiler.init_main()

    def exitStart(self, ctx:LanguageParser.StartContext):
        self.compiler.status()
        self.compiler.ir_to_ll()

# ASSIGN
    def exitArgument(self, ctx:LanguageParser.ArgumentContext):
        self.compiler.stack_push_typ(str(ctx.ID()),str(ctx.TYP()))

    def exitAssignEvaluate(self, ctx:LanguageParser.AssignEvaluateContext):
        # str(ctx.ID()),str(ctx.SCOPE()),str(ctx.TYP())
        self.compiler.new_var(str(ctx.ID()))

    def exitAssignID(self, ctx:LanguageParser.AssignIDContext):
        print ('WWWW',self.compiler.inhibit_push,str(ctx.ID()))
        self.compiler.globalspace[str(ctx.ID())] = None

    def exitAssignUninit(self, ctx:LanguageParser.AssignUninitContext):
        self.compiler.new_var(str(ctx.ID()),str(ctx.TYP()))

# VALUE

    def exitValueBool(self, ctx:LanguageParser.ValueBoolContext):
        self.compiler.stack_push(ctx.getText(),'bool')

    def exitValueID(self, ctx:LanguageParser.ValueIDContext):
        self.compiler.stack_push(id =ctx.getText())
        

    def exitValueDecimal(self, ctx:LanguageParser.ValueDecimalContext):
        self.compiler.stack_push(ctx.getText(),'double')


    def exitValueInt(self, ctx:LanguageParser.ValueIntContext):
        self.compiler.stack_push(ctx.getText(), 'int')


    def exitValueString(self, ctx:LanguageParser.ValueStringContext):
        self.compiler.stack_push(ctx.getText()[1:-1], 'str')
        


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
        self.compiler.arithemtic()
        

    def exitExpressionNested(self, ctx:LanguageParser.ExpressionNestedContext):
        pass
    
# FUNCTION

    def exitArg_func(self, ctx:LanguageParser.Arg_funcContext):
        self.compiler.new_function(str(ctx.ID()), str(ctx.TYP()), len(ctx.argument()))
        

    def enterN_func(self, ctx:LanguageParser.N_funcContext):
        # arg_typ = []
        # arg_id = []
        # for arg in ctx.argument():
        #     arg_typ.append(str(arg.TYP()))
        #     arg_id.append(str(arg.ID()))
        # self.compiler.new_function(str(ctx.ID()),str(ctx.TYP()),arg_typ)
        # self.compiler.new_builder(str(ctx.ID()),arg_id)
        pass

    def exitN_func(self, ctx:LanguageParser.N_funcContext):
        # self.compiler.terminate()
        pass

    def exitTerminal(self, ctx:LanguageParser.TerminalContext):
        print('terminal',ctx.getText())
        self.compiler.terminate()


    def exitTerminable(self, ctx:LanguageParser.TerminableContext):
        print(ctx.getText())

# CLASS
    def exitN_struct(self, ctx:LanguageParser.N_structContext):
        pass
        # self.compiler.new_struct()

    def enterN_clas(self, ctx:LanguageParser.N_clasContext):
        # self.compiler.new_class()
        pass


    def exitN_clas(self, ctx:LanguageParser.N_clasContext):
        pass


    def enterArg_typs(self, ctx:LanguageParser.Arg_typsContext):
        pass


    def exitArg_typs(self, ctx:LanguageParser.Arg_typsContext):
        self.compiler.new_struct(str(ctx.ID()), len(ctx.argument()))
        

# Aggregates

    def exitN_array(self, ctx:LanguageParser.N_arrayContext):
        pass



    def exitN_if(self, ctx:LanguageParser.N_ifContext):
        pass



    def exitN_for(self, ctx:LanguageParser.N_forContext):
        pass



    def exitCall(self, ctx:LanguageParser.CallContext):
        pass


    def exitArray(self, ctx:LanguageParser.ArrayContext):
        pass



    def exitArray_range(self, ctx:LanguageParser.Array_rangeContext):
        pass
        

    

 