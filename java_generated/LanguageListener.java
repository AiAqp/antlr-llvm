// Generated from Language.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LanguageParser}.
 */
public interface LanguageListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LanguageParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(LanguageParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(LanguageParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#instr}.
	 * @param ctx the parse tree
	 */
	void enterInstr(LanguageParser.InstrContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#instr}.
	 * @param ctx the parse tree
	 */
	void exitInstr(LanguageParser.InstrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionBool}
	 * labeled alternative in {@link LanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionBool(LanguageParser.ExpressionBoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionBool}
	 * labeled alternative in {@link LanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionBool(LanguageParser.ExpressionBoolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionnumber}
	 * labeled alternative in {@link LanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionnumber(LanguageParser.ExpressionnumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionnumber}
	 * labeled alternative in {@link LanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionnumber(LanguageParser.ExpressionnumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionArithm}
	 * labeled alternative in {@link LanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionArithm(LanguageParser.ExpressionArithmContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionArithm}
	 * labeled alternative in {@link LanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionArithm(LanguageParser.ExpressionArithmContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionNested}
	 * labeled alternative in {@link LanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionNested(LanguageParser.ExpressionNestedContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionNested}
	 * labeled alternative in {@link LanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionNested(LanguageParser.ExpressionNestedContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#n_func}.
	 * @param ctx the parse tree
	 */
	void enterN_func(LanguageParser.N_funcContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#n_func}.
	 * @param ctx the parse tree
	 */
	void exitN_func(LanguageParser.N_funcContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#n_clas}.
	 * @param ctx the parse tree
	 */
	void enterN_clas(LanguageParser.N_clasContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#n_clas}.
	 * @param ctx the parse tree
	 */
	void exitN_clas(LanguageParser.N_clasContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#n_array}.
	 * @param ctx the parse tree
	 */
	void enterN_array(LanguageParser.N_arrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#n_array}.
	 * @param ctx the parse tree
	 */
	void exitN_array(LanguageParser.N_arrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#n_if}.
	 * @param ctx the parse tree
	 */
	void enterN_if(LanguageParser.N_ifContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#n_if}.
	 * @param ctx the parse tree
	 */
	void exitN_if(LanguageParser.N_ifContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#n_for}.
	 * @param ctx the parse tree
	 */
	void enterN_for(LanguageParser.N_forContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#n_for}.
	 * @param ctx the parse tree
	 */
	void exitN_for(LanguageParser.N_forContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#array_row}.
	 * @param ctx the parse tree
	 */
	void enterArray_row(LanguageParser.Array_rowContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#array_row}.
	 * @param ctx the parse tree
	 */
	void exitArray_row(LanguageParser.Array_rowContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#call}.
	 * @param ctx the parse tree
	 */
	void enterCall(LanguageParser.CallContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#call}.
	 * @param ctx the parse tree
	 */
	void exitCall(LanguageParser.CallContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#clas}.
	 * @param ctx the parse tree
	 */
	void enterClas(LanguageParser.ClasContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#clas}.
	 * @param ctx the parse tree
	 */
	void exitClas(LanguageParser.ClasContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#func_clas}.
	 * @param ctx the parse tree
	 */
	void enterFunc_clas(LanguageParser.Func_clasContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#func_clas}.
	 * @param ctx the parse tree
	 */
	void exitFunc_clas(LanguageParser.Func_clasContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(LanguageParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(LanguageParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#array_range}.
	 * @param ctx the parse tree
	 */
	void enterArray_range(LanguageParser.Array_rangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#array_range}.
	 * @param ctx the parse tree
	 */
	void exitArray_range(LanguageParser.Array_rangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(LanguageParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(LanguageParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(LanguageParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(LanguageParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#seqc}.
	 * @param ctx the parse tree
	 */
	void enterSeqc(LanguageParser.SeqcContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#seqc}.
	 * @param ctx the parse tree
	 */
	void exitSeqc(LanguageParser.SeqcContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(LanguageParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(LanguageParser.NumberContext ctx);
}