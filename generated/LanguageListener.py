# Generated from Language.g4 by ANTLR 4.9.3
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .LanguageParser import LanguageParser
else:
    from LanguageParser import LanguageParser

# This class defines a complete listener for a parse tree produced by LanguageParser.
class LanguageListener(ParseTreeListener):

    # Enter a parse tree produced by LanguageParser#start.
    def enterStart(self, ctx:LanguageParser.StartContext):
        pass

    # Exit a parse tree produced by LanguageParser#start.
    def exitStart(self, ctx:LanguageParser.StartContext):
        pass


    # Enter a parse tree produced by LanguageParser#instr.
    def enterInstr(self, ctx:LanguageParser.InstrContext):
        pass

    # Exit a parse tree produced by LanguageParser#instr.
    def exitInstr(self, ctx:LanguageParser.InstrContext):
        pass


    # Enter a parse tree produced by LanguageParser#expressionBool.
    def enterExpressionBool(self, ctx:LanguageParser.ExpressionBoolContext):
        pass

    # Exit a parse tree produced by LanguageParser#expressionBool.
    def exitExpressionBool(self, ctx:LanguageParser.ExpressionBoolContext):
        pass


    # Enter a parse tree produced by LanguageParser#expressionnumber.
    def enterExpressionnumber(self, ctx:LanguageParser.ExpressionnumberContext):
        pass

    # Exit a parse tree produced by LanguageParser#expressionnumber.
    def exitExpressionnumber(self, ctx:LanguageParser.ExpressionnumberContext):
        pass


    # Enter a parse tree produced by LanguageParser#expressionArithm.
    def enterExpressionArithm(self, ctx:LanguageParser.ExpressionArithmContext):
        pass

    # Exit a parse tree produced by LanguageParser#expressionArithm.
    def exitExpressionArithm(self, ctx:LanguageParser.ExpressionArithmContext):
        pass


    # Enter a parse tree produced by LanguageParser#expressionNested.
    def enterExpressionNested(self, ctx:LanguageParser.ExpressionNestedContext):
        pass

    # Exit a parse tree produced by LanguageParser#expressionNested.
    def exitExpressionNested(self, ctx:LanguageParser.ExpressionNestedContext):
        pass


    # Enter a parse tree produced by LanguageParser#n_func.
    def enterN_func(self, ctx:LanguageParser.N_funcContext):
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


    # Enter a parse tree produced by LanguageParser#n_array.
    def enterN_array(self, ctx:LanguageParser.N_arrayContext):
        pass

    # Exit a parse tree produced by LanguageParser#n_array.
    def exitN_array(self, ctx:LanguageParser.N_arrayContext):
        pass


    # Enter a parse tree produced by LanguageParser#n_if.
    def enterN_if(self, ctx:LanguageParser.N_ifContext):
        pass

    # Exit a parse tree produced by LanguageParser#n_if.
    def exitN_if(self, ctx:LanguageParser.N_ifContext):
        pass


    # Enter a parse tree produced by LanguageParser#n_for.
    def enterN_for(self, ctx:LanguageParser.N_forContext):
        pass

    # Exit a parse tree produced by LanguageParser#n_for.
    def exitN_for(self, ctx:LanguageParser.N_forContext):
        pass


    # Enter a parse tree produced by LanguageParser#array_row.
    def enterArray_row(self, ctx:LanguageParser.Array_rowContext):
        pass

    # Exit a parse tree produced by LanguageParser#array_row.
    def exitArray_row(self, ctx:LanguageParser.Array_rowContext):
        pass


    # Enter a parse tree produced by LanguageParser#call.
    def enterCall(self, ctx:LanguageParser.CallContext):
        pass

    # Exit a parse tree produced by LanguageParser#call.
    def exitCall(self, ctx:LanguageParser.CallContext):
        pass


    # Enter a parse tree produced by LanguageParser#clas.
    def enterClas(self, ctx:LanguageParser.ClasContext):
        pass

    # Exit a parse tree produced by LanguageParser#clas.
    def exitClas(self, ctx:LanguageParser.ClasContext):
        pass


    # Enter a parse tree produced by LanguageParser#func_clas.
    def enterFunc_clas(self, ctx:LanguageParser.Func_clasContext):
        pass

    # Exit a parse tree produced by LanguageParser#func_clas.
    def exitFunc_clas(self, ctx:LanguageParser.Func_clasContext):
        pass


    # Enter a parse tree produced by LanguageParser#array.
    def enterArray(self, ctx:LanguageParser.ArrayContext):
        pass

    # Exit a parse tree produced by LanguageParser#array.
    def exitArray(self, ctx:LanguageParser.ArrayContext):
        pass


    # Enter a parse tree produced by LanguageParser#array_range.
    def enterArray_range(self, ctx:LanguageParser.Array_rangeContext):
        pass

    # Exit a parse tree produced by LanguageParser#array_range.
    def exitArray_range(self, ctx:LanguageParser.Array_rangeContext):
        pass


    # Enter a parse tree produced by LanguageParser#value.
    def enterValue(self, ctx:LanguageParser.ValueContext):
        pass

    # Exit a parse tree produced by LanguageParser#value.
    def exitValue(self, ctx:LanguageParser.ValueContext):
        pass


    # Enter a parse tree produced by LanguageParser#assign.
    def enterAssign(self, ctx:LanguageParser.AssignContext):
        pass

    # Exit a parse tree produced by LanguageParser#assign.
    def exitAssign(self, ctx:LanguageParser.AssignContext):
        pass


    # Enter a parse tree produced by LanguageParser#seqc.
    def enterSeqc(self, ctx:LanguageParser.SeqcContext):
        pass

    # Exit a parse tree produced by LanguageParser#seqc.
    def exitSeqc(self, ctx:LanguageParser.SeqcContext):
        pass


    # Enter a parse tree produced by LanguageParser#number.
    def enterNumber(self, ctx:LanguageParser.NumberContext):
        pass

    # Exit a parse tree produced by LanguageParser#number.
    def exitNumber(self, ctx:LanguageParser.NumberContext):
        pass



del LanguageParser