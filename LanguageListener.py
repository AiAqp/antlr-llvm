from NameSpace import NameSpace
from ValueStack import ValueStack
from generated.LanguageListener import LanguageListener
from generated.LanguageLexer import LanguageLexer
from generated.LanguageParser import LanguageParser
from llvmlite import ir
import sys 

class LanguageListener(LanguageListener):

    def __init__(self):
        self.stack = ValueStack()
        self.main_space = NameSpace()

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

        self.stack.status()
        self.main_space.status()

# ASSIGN

    def exitAssignEvaluate(self, ctx:LanguageParser.AssignEvaluateContext):
        self.main_space.init_object(str(ctx.ID()),str(ctx.SCOPE()),str(ctx.TYP()),self.stack.pop())
        pass

    def exitAssignID(self, ctx:LanguageParser.AssignIDContext):
        pass

    def exitAssignUninit(self, ctx:LanguageParser.AssignUninitContext):
        pass

# VALUE

    def exitValueBool(self, ctx:LanguageParser.ValueBoolContext):
        self.stack.push(ctx.getText(),'bool')


    def exitValueID(self, ctx:LanguageParser.ValueIDContext):
        print('ID --> '+ctx.getText())
        


    def exitValueDecimal(self, ctx:LanguageParser.ValueDecimalContext):
        self.stack.push(ctx.getText(), 'double')


    def exitValueInt(self, ctx:LanguageParser.ValueIntContext):
        self.stack.push(ctx.getText(), 'int')


    def exitValueString(self, ctx:LanguageParser.ValueStringContext):
        self.stack.push(ctx.getText()[1:-1], 'str')


    def exitValueArray(self, ctx:LanguageParser.ValueArrayContext):
        pass


    def exitValueCall(self, ctx:LanguageParser.ValueCallContext):
        pass

# ARRAY Body 

    def exitArray_row(self, ctx:LanguageParser.Array_rowContext):
        self.stack.push_row(len(ctx.COM())+1)

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
        

    

 