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


    # Enter a parse tree produced by LanguageParser#terminal.
    def enterTerminal(self, ctx:LanguageParser.TerminalContext):
        pass

    # Exit a parse tree produced by LanguageParser#terminal.
    def exitTerminal(self, ctx:LanguageParser.TerminalContext):
        pass


    # Enter a parse tree produced by LanguageParser#terminable.
    def enterTerminable(self, ctx:LanguageParser.TerminableContext):
        pass

    # Exit a parse tree produced by LanguageParser#terminable.
    def exitTerminable(self, ctx:LanguageParser.TerminableContext):
        pass


    # Enter a parse tree produced by LanguageParser#expressionValue.
    def enterExpressionValue(self, ctx:LanguageParser.ExpressionValueContext):
        pass

    # Exit a parse tree produced by LanguageParser#expressionValue.
    def exitExpressionValue(self, ctx:LanguageParser.ExpressionValueContext):
        pass


    # Enter a parse tree produced by LanguageParser#expressionBool.
    def enterExpressionBool(self, ctx:LanguageParser.ExpressionBoolContext):
        pass

    # Exit a parse tree produced by LanguageParser#expressionBool.
    def exitExpressionBool(self, ctx:LanguageParser.ExpressionBoolContext):
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


    # Enter a parse tree produced by LanguageParser#argument.
    def enterArgument(self, ctx:LanguageParser.ArgumentContext):
        pass

    # Exit a parse tree produced by LanguageParser#argument.
    def exitArgument(self, ctx:LanguageParser.ArgumentContext):
        pass


    # Enter a parse tree produced by LanguageParser#n_clas.
    def enterN_clas(self, ctx:LanguageParser.N_clasContext):
        pass

    # Exit a parse tree produced by LanguageParser#n_clas.
    def exitN_clas(self, ctx:LanguageParser.N_clasContext):
        pass


    # Enter a parse tree produced by LanguageParser#n_struct.
    def enterN_struct(self, ctx:LanguageParser.N_structContext):
        pass

    # Exit a parse tree produced by LanguageParser#n_struct.
    def exitN_struct(self, ctx:LanguageParser.N_structContext):
        pass


    # Enter a parse tree produced by LanguageParser#arg_typs.
    def enterArg_typs(self, ctx:LanguageParser.Arg_typsContext):
        pass

    # Exit a parse tree produced by LanguageParser#arg_typs.
    def exitArg_typs(self, ctx:LanguageParser.Arg_typsContext):
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


    # Enter a parse tree produced by LanguageParser#array.
    def enterArray(self, ctx:LanguageParser.ArrayContext):
        pass

    # Exit a parse tree produced by LanguageParser#array.
    def exitArray(self, ctx:LanguageParser.ArrayContext):
        pass


    # Enter a parse tree produced by LanguageParser#functionCall.
    def enterFunctionCall(self, ctx:LanguageParser.FunctionCallContext):
        pass

    # Exit a parse tree produced by LanguageParser#functionCall.
    def exitFunctionCall(self, ctx:LanguageParser.FunctionCallContext):
        pass


    # Enter a parse tree produced by LanguageParser#classCall.
    def enterClassCall(self, ctx:LanguageParser.ClassCallContext):
        pass

    # Exit a parse tree produced by LanguageParser#classCall.
    def exitClassCall(self, ctx:LanguageParser.ClassCallContext):
        pass


    # Enter a parse tree produced by LanguageParser#array_range.
    def enterArray_range(self, ctx:LanguageParser.Array_rangeContext):
        pass

    # Exit a parse tree produced by LanguageParser#array_range.
    def exitArray_range(self, ctx:LanguageParser.Array_rangeContext):
        pass


    # Enter a parse tree produced by LanguageParser#valueBool.
    def enterValueBool(self, ctx:LanguageParser.ValueBoolContext):
        pass

    # Exit a parse tree produced by LanguageParser#valueBool.
    def exitValueBool(self, ctx:LanguageParser.ValueBoolContext):
        pass


    # Enter a parse tree produced by LanguageParser#valueID.
    def enterValueID(self, ctx:LanguageParser.ValueIDContext):
        pass

    # Exit a parse tree produced by LanguageParser#valueID.
    def exitValueID(self, ctx:LanguageParser.ValueIDContext):
        pass


    # Enter a parse tree produced by LanguageParser#valueDecimal.
    def enterValueDecimal(self, ctx:LanguageParser.ValueDecimalContext):
        pass

    # Exit a parse tree produced by LanguageParser#valueDecimal.
    def exitValueDecimal(self, ctx:LanguageParser.ValueDecimalContext):
        pass


    # Enter a parse tree produced by LanguageParser#valueInt.
    def enterValueInt(self, ctx:LanguageParser.ValueIntContext):
        pass

    # Exit a parse tree produced by LanguageParser#valueInt.
    def exitValueInt(self, ctx:LanguageParser.ValueIntContext):
        pass


    # Enter a parse tree produced by LanguageParser#valueString.
    def enterValueString(self, ctx:LanguageParser.ValueStringContext):
        pass

    # Exit a parse tree produced by LanguageParser#valueString.
    def exitValueString(self, ctx:LanguageParser.ValueStringContext):
        pass


    # Enter a parse tree produced by LanguageParser#valueArray.
    def enterValueArray(self, ctx:LanguageParser.ValueArrayContext):
        pass

    # Exit a parse tree produced by LanguageParser#valueArray.
    def exitValueArray(self, ctx:LanguageParser.ValueArrayContext):
        pass


    # Enter a parse tree produced by LanguageParser#valueCall.
    def enterValueCall(self, ctx:LanguageParser.ValueCallContext):
        pass

    # Exit a parse tree produced by LanguageParser#valueCall.
    def exitValueCall(self, ctx:LanguageParser.ValueCallContext):
        pass


    # Enter a parse tree produced by LanguageParser#assignEvaluate.
    def enterAssignEvaluate(self, ctx:LanguageParser.AssignEvaluateContext):
        pass

    # Exit a parse tree produced by LanguageParser#assignEvaluate.
    def exitAssignEvaluate(self, ctx:LanguageParser.AssignEvaluateContext):
        pass


    # Enter a parse tree produced by LanguageParser#assignID.
    def enterAssignID(self, ctx:LanguageParser.AssignIDContext):
        pass

    # Exit a parse tree produced by LanguageParser#assignID.
    def exitAssignID(self, ctx:LanguageParser.AssignIDContext):
        pass


    # Enter a parse tree produced by LanguageParser#assignUninit.
    def enterAssignUninit(self, ctx:LanguageParser.AssignUninitContext):
        pass

    # Exit a parse tree produced by LanguageParser#assignUninit.
    def exitAssignUninit(self, ctx:LanguageParser.AssignUninitContext):
        pass



del LanguageParser