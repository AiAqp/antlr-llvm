// Generated from Language.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LanguageParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, N_STRING=15, EXPLCT=16, 
		INT_seqc=17, TYP=18, DECIMAL=19, INT=20, ID=21, BOOL=22, PLS=23, MNS=24, 
		MUL=25, DIV=26, EXP=27, LRB=28, RRB=29, LSB=30, RSB=31, LCB=32, RCB=33, 
		EQ=34, NEQ=35, GT=36, GTE=37, LS=38, LSE=39, AND=40, OR=41, NOT=42, ASN=43, 
		DOT=44, COL=45, COM=46, SEM=47, RET=48, APO=49, COMMENT=50, LINE_COMMENT=51, 
		WS=52;
	public static final int
		RULE_start = 0, RULE_instr = 1, RULE_expression = 2, RULE_n_func = 3, 
		RULE_n_clas = 4, RULE_n_array = 5, RULE_n_if = 6, RULE_n_for = 7, RULE_array_row = 8, 
		RULE_call = 9, RULE_clas = 10, RULE_func_clas = 11, RULE_array = 12, RULE_array_range = 13, 
		RULE_value = 14, RULE_assign = 15, RULE_seqc = 16, RULE_number = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "instr", "expression", "n_func", "n_clas", "n_array", "n_if", 
			"n_for", "array_row", "call", "clas", "func_clas", "array", "array_range", 
			"value", "assign", "seqc", "number"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'function'", "'init'", "'print'", "'scan'", "'main'", "'end'", 
			"'class'", "'is'", "'if'", "'then'", "'elif'", "'else'", "'for'", "'go'", 
			null, null, null, null, null, null, null, null, "'+'", "'-'", "'*'", 
			"'/'", "'^'", "'('", "')'", "'['", "']'", "'{'", "'}'", "'=='", null, 
			"'>'", null, "'<'", null, "'&&'", "'||'", "'!'", "'='", "'.'", "':'", 
			"','", "';'", "'return'", "'''"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "N_STRING", "EXPLCT", "INT_seqc", "TYP", "DECIMAL", 
			"INT", "ID", "BOOL", "PLS", "MNS", "MUL", "DIV", "EXP", "LRB", "RRB", 
			"LSB", "RSB", "LCB", "RCB", "EQ", "NEQ", "GT", "GTE", "LS", "LSE", "AND", 
			"OR", "NOT", "ASN", "DOT", "COL", "COM", "SEM", "RET", "APO", "COMMENT", 
			"LINE_COMMENT", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Language.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LanguageParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public List<N_funcContext> n_func() {
			return getRuleContexts(N_funcContext.class);
		}
		public N_funcContext n_func(int i) {
			return getRuleContext(N_funcContext.class,i);
		}
		public List<N_clasContext> n_clas() {
			return getRuleContexts(N_clasContext.class);
		}
		public N_clasContext n_clas(int i) {
			return getRuleContext(N_clasContext.class,i);
		}
		public List<InstrContext> instr() {
			return getRuleContexts(InstrContext.class);
		}
		public InstrContext instr(int i) {
			return getRuleContext(InstrContext.class,i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(39);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
					{
					setState(36);
					n_func();
					}
					break;
				case T__6:
					{
					setState(37);
					n_clas();
					}
					break;
				case T__2:
				case T__8:
				case T__12:
				case EXPLCT:
				case ID:
				case RET:
					{
					setState(38);
					instr();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(41); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__6) | (1L << T__8) | (1L << T__12) | (1L << EXPLCT) | (1L << ID) | (1L << RET))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstrContext extends ParserRuleContext {
		public List<AssignContext> assign() {
			return getRuleContexts(AssignContext.class);
		}
		public AssignContext assign(int i) {
			return getRuleContext(AssignContext.class,i);
		}
		public List<CallContext> call() {
			return getRuleContexts(CallContext.class);
		}
		public CallContext call(int i) {
			return getRuleContext(CallContext.class,i);
		}
		public List<N_ifContext> n_if() {
			return getRuleContexts(N_ifContext.class);
		}
		public N_ifContext n_if(int i) {
			return getRuleContext(N_ifContext.class,i);
		}
		public List<N_forContext> n_for() {
			return getRuleContexts(N_forContext.class);
		}
		public N_forContext n_for(int i) {
			return getRuleContext(N_forContext.class,i);
		}
		public List<TerminalNode> RET() { return getTokens(LanguageParser.RET); }
		public TerminalNode RET(int i) {
			return getToken(LanguageParser.RET, i);
		}
		public InstrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterInstr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitInstr(this);
		}
	}

	public final InstrContext instr() throws RecognitionException {
		InstrContext _localctx = new InstrContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_instr);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(52); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(44);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==RET) {
						{
						setState(43);
						match(RET);
						}
					}

					setState(50);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						setState(46);
						assign();
						}
						break;
					case 2:
						{
						setState(47);
						call();
						}
						break;
					case 3:
						{
						setState(48);
						n_if();
						}
						break;
					case 4:
						{
						setState(49);
						n_for();
						}
						break;
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(54); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExpressionBoolContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode EQ() { return getToken(LanguageParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(LanguageParser.NEQ, 0); }
		public TerminalNode GT() { return getToken(LanguageParser.GT, 0); }
		public TerminalNode GTE() { return getToken(LanguageParser.GTE, 0); }
		public TerminalNode LS() { return getToken(LanguageParser.LS, 0); }
		public TerminalNode LSE() { return getToken(LanguageParser.LSE, 0); }
		public TerminalNode NOT() { return getToken(LanguageParser.NOT, 0); }
		public TerminalNode AND() { return getToken(LanguageParser.AND, 0); }
		public TerminalNode OR() { return getToken(LanguageParser.OR, 0); }
		public ExpressionBoolContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterExpressionBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitExpressionBool(this);
		}
	}
	public static class ExpressionnumberContext extends ExpressionContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ExpressionnumberContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterExpressionnumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitExpressionnumber(this);
		}
	}
	public static class ExpressionArithmContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> PLS() { return getTokens(LanguageParser.PLS); }
		public TerminalNode PLS(int i) {
			return getToken(LanguageParser.PLS, i);
		}
		public List<TerminalNode> MNS() { return getTokens(LanguageParser.MNS); }
		public TerminalNode MNS(int i) {
			return getToken(LanguageParser.MNS, i);
		}
		public List<TerminalNode> MUL() { return getTokens(LanguageParser.MUL); }
		public TerminalNode MUL(int i) {
			return getToken(LanguageParser.MUL, i);
		}
		public List<TerminalNode> DIV() { return getTokens(LanguageParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(LanguageParser.DIV, i);
		}
		public List<TerminalNode> EXP() { return getTokens(LanguageParser.EXP); }
		public TerminalNode EXP(int i) {
			return getToken(LanguageParser.EXP, i);
		}
		public ExpressionArithmContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterExpressionArithm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitExpressionArithm(this);
		}
	}
	public static class ExpressionNestedContext extends ExpressionContext {
		public TerminalNode LRB() { return getToken(LanguageParser.LRB, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RRB() { return getToken(LanguageParser.RRB, 0); }
		public ExpressionNestedContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterExpressionNested(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitExpressionNested(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LRB:
				{
				_localctx = new ExpressionNestedContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(57);
				match(LRB);
				setState(58);
				expression(0);
				setState(59);
				match(RRB);
				}
				break;
			case T__2:
			case N_STRING:
			case DECIMAL:
			case INT:
			case ID:
			case BOOL:
			case MNS:
			case LCB:
				{
				_localctx = new ExpressionnumberContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(61);
				value();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(76);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(74);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionBoolContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(64);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(65);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << NEQ) | (1L << GT) | (1L << GTE) | (1L << LS) | (1L << LSE) | (1L << AND) | (1L << OR) | (1L << NOT))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(66);
						expression(4);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionArithmContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(67);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(70); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(68);
								_la = _input.LA(1);
								if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLS) | (1L << MNS) | (1L << MUL) | (1L << DIV) | (1L << EXP))) != 0)) ) {
								_errHandler.recoverInline(this);
								}
								else {
									if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
									_errHandler.reportMatch(this);
									consume();
								}
								setState(69);
								expression(0);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(72); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						}
						break;
					}
					} 
				}
				setState(78);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class N_funcContext extends ParserRuleContext {
		public TerminalNode LRB() { return getToken(LanguageParser.LRB, 0); }
		public TerminalNode RRB() { return getToken(LanguageParser.RRB, 0); }
		public List<TerminalNode> ID() { return getTokens(LanguageParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(LanguageParser.ID, i);
		}
		public List<AssignContext> assign() {
			return getRuleContexts(AssignContext.class);
		}
		public AssignContext assign(int i) {
			return getRuleContext(AssignContext.class,i);
		}
		public List<TerminalNode> COM() { return getTokens(LanguageParser.COM); }
		public TerminalNode COM(int i) {
			return getToken(LanguageParser.COM, i);
		}
		public List<InstrContext> instr() {
			return getRuleContexts(InstrContext.class);
		}
		public InstrContext instr(int i) {
			return getRuleContext(InstrContext.class,i);
		}
		public N_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_n_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterN_func(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitN_func(this);
		}
	}

	public final N_funcContext n_func() throws RecognitionException {
		N_funcContext _localctx = new N_funcContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_n_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(T__0);
			setState(80);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << ID))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(81);
			match(LRB);
			setState(84);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(82);
				match(ID);
				}
				break;
			case 2:
				{
				setState(83);
				assign();
				}
				break;
			}
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COM) {
				{
				{
				setState(86);
				match(COM);
				setState(89);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(87);
					match(ID);
					}
					break;
				case 2:
					{
					setState(88);
					assign();
					}
					break;
				}
				}
				}
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(96);
			match(RRB);
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__8) | (1L << T__12) | (1L << EXPLCT) | (1L << ID) | (1L << RET))) != 0)) {
				{
				{
				setState(97);
				instr();
				}
				}
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(103);
			match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class N_clasContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LanguageParser.ID, 0); }
		public List<AssignContext> assign() {
			return getRuleContexts(AssignContext.class);
		}
		public AssignContext assign(int i) {
			return getRuleContext(AssignContext.class,i);
		}
		public List<N_funcContext> n_func() {
			return getRuleContexts(N_funcContext.class);
		}
		public N_funcContext n_func(int i) {
			return getRuleContext(N_funcContext.class,i);
		}
		public N_clasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_n_clas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterN_clas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitN_clas(this);
		}
	}

	public final N_clasContext n_clas() throws RecognitionException {
		N_clasContext _localctx = new N_clasContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_n_clas);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(T__6);
			setState(106);
			match(ID);
			setState(107);
			match(T__7);
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EXPLCT || _la==ID) {
				{
				{
				setState(108);
				assign();
				}
				}
				setState(113);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(114);
				n_func();
				}
				}
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(120);
			match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class N_arrayContext extends ParserRuleContext {
		public TerminalNode LCB() { return getToken(LanguageParser.LCB, 0); }
		public List<Array_rowContext> array_row() {
			return getRuleContexts(Array_rowContext.class);
		}
		public Array_rowContext array_row(int i) {
			return getRuleContext(Array_rowContext.class,i);
		}
		public TerminalNode RCB() { return getToken(LanguageParser.RCB, 0); }
		public List<TerminalNode> SEM() { return getTokens(LanguageParser.SEM); }
		public TerminalNode SEM(int i) {
			return getToken(LanguageParser.SEM, i);
		}
		public N_arrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_n_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterN_array(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitN_array(this);
		}
	}

	public final N_arrayContext n_array() throws RecognitionException {
		N_arrayContext _localctx = new N_arrayContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_n_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(LCB);
			setState(123);
			array_row();
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEM) {
				{
				{
				setState(124);
				match(SEM);
				setState(125);
				array_row();
				}
				}
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(131);
			match(RCB);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class N_ifContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<InstrContext> instr() {
			return getRuleContexts(InstrContext.class);
		}
		public InstrContext instr(int i) {
			return getRuleContext(InstrContext.class,i);
		}
		public N_ifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_n_if; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterN_if(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitN_if(this);
		}
	}

	public final N_ifContext n_if() throws RecognitionException {
		N_ifContext _localctx = new N_ifContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_n_if);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(T__8);
			setState(134);
			expression(0);
			setState(135);
			match(T__9);
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__8) | (1L << T__12) | (1L << EXPLCT) | (1L << ID) | (1L << RET))) != 0)) {
				{
				{
				setState(136);
				instr();
				}
				}
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10) {
				{
				{
				setState(142);
				match(T__10);
				setState(143);
				expression(0);
				setState(144);
				match(T__9);
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__8) | (1L << T__12) | (1L << EXPLCT) | (1L << ID) | (1L << RET))) != 0)) {
					{
					{
					setState(145);
					instr();
					}
					}
					setState(150);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(156);
				match(T__11);
				setState(160);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__8) | (1L << T__12) | (1L << EXPLCT) | (1L << ID) | (1L << RET))) != 0)) {
					{
					{
					setState(157);
					instr();
					}
					}
					setState(162);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(165);
			match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class N_forContext extends ParserRuleContext {
		public TerminalNode INT_seqc() { return getToken(LanguageParser.INT_seqc, 0); }
		public TerminalNode INT() { return getToken(LanguageParser.INT, 0); }
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public List<InstrContext> instr() {
			return getRuleContexts(InstrContext.class);
		}
		public InstrContext instr(int i) {
			return getRuleContext(InstrContext.class,i);
		}
		public N_forContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_n_for; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterN_for(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitN_for(this);
		}
	}

	public final N_forContext n_for() throws RecognitionException {
		N_forContext _localctx = new N_forContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_n_for);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(T__12);
			setState(171);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_seqc:
				{
				setState(168);
				match(INT_seqc);
				}
				break;
			case INT:
				{
				setState(169);
				match(INT);
				}
				break;
			case EXPLCT:
			case ID:
				{
				setState(170);
				assign();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(173);
			match(T__13);
			setState(177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__8) | (1L << T__12) | (1L << EXPLCT) | (1L << ID) | (1L << RET))) != 0)) {
				{
				{
				setState(174);
				instr();
				}
				}
				setState(179);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(180);
			match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Array_rowContext extends ParserRuleContext {
		public SeqcContext seqc() {
			return getRuleContext(SeqcContext.class,0);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<TerminalNode> COM() { return getTokens(LanguageParser.COM); }
		public TerminalNode COM(int i) {
			return getToken(LanguageParser.COM, i);
		}
		public Array_rowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_row; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterArray_row(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitArray_row(this);
		}
	}

	public final Array_rowContext array_row() throws RecognitionException {
		Array_rowContext _localctx = new Array_rowContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_array_row);
		int _la;
		try {
			setState(191);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(182);
				seqc();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(183);
				value();
				setState(188);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COM) {
					{
					{
					setState(184);
					match(COM);
					setState(185);
					value();
					}
					}
					setState(190);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CallContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LanguageParser.ID, 0); }
		public ClasContext clas() {
			return getRuleContext(ClasContext.class,0);
		}
		public Func_clasContext func_clas() {
			return getRuleContext(Func_clasContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public CallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitCall(this);
		}
	}

	public final CallContext call() throws RecognitionException {
		CallContext _localctx = new CallContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			_la = _input.LA(1);
			if ( !(_la==T__2 || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(197);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOT:
				{
				setState(194);
				clas();
				}
				break;
			case LRB:
				{
				setState(195);
				func_clas();
				}
				break;
			case LSB:
				{
				setState(196);
				array();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClasContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(LanguageParser.DOT, 0); }
		public Func_clasContext func_clas() {
			return getRuleContext(Func_clasContext.class,0);
		}
		public TerminalNode ID() { return getToken(LanguageParser.ID, 0); }
		public ClasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterClas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitClas(this);
		}
	}

	public final ClasContext clas() throws RecognitionException {
		ClasContext _localctx = new ClasContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_clas);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(DOT);
			setState(202);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LRB:
				{
				setState(200);
				func_clas();
				}
				break;
			case ID:
				{
				setState(201);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Func_clasContext extends ParserRuleContext {
		public TerminalNode LRB() { return getToken(LanguageParser.LRB, 0); }
		public TerminalNode RRB() { return getToken(LanguageParser.RRB, 0); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<AssignContext> assign() {
			return getRuleContexts(AssignContext.class);
		}
		public AssignContext assign(int i) {
			return getRuleContext(AssignContext.class,i);
		}
		public List<TerminalNode> COM() { return getTokens(LanguageParser.COM); }
		public TerminalNode COM(int i) {
			return getToken(LanguageParser.COM, i);
		}
		public Func_clasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_clas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterFunc_clas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitFunc_clas(this);
		}
	}

	public final Func_clasContext func_clas() throws RecognitionException {
		Func_clasContext _localctx = new Func_clasContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_func_clas);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(LRB);
			setState(217);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(205);
				value();
				}
				break;
			case 2:
				{
				setState(206);
				assign();
				setState(214);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COM) {
					{
					{
					setState(207);
					match(COM);
					setState(210);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
					case 1:
						{
						setState(208);
						value();
						}
						break;
					case 2:
						{
						setState(209);
						assign();
						}
						break;
					}
					}
					}
					setState(216);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(219);
			match(RRB);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayContext extends ParserRuleContext {
		public TerminalNode LSB() { return getToken(LanguageParser.LSB, 0); }
		public List<Array_rangeContext> array_range() {
			return getRuleContexts(Array_rangeContext.class);
		}
		public Array_rangeContext array_range(int i) {
			return getRuleContext(Array_rangeContext.class,i);
		}
		public TerminalNode RSB() { return getToken(LanguageParser.RSB, 0); }
		public TerminalNode SEM() { return getToken(LanguageParser.SEM, 0); }
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitArray(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			match(LSB);
			setState(222);
			array_range();
			setState(225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEM) {
				{
				setState(223);
				match(SEM);
				setState(224);
				array_range();
				}
			}

			setState(227);
			match(RSB);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Array_rangeContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(LanguageParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(LanguageParser.INT, i);
		}
		public List<TerminalNode> COM() { return getTokens(LanguageParser.COM); }
		public TerminalNode COM(int i) {
			return getToken(LanguageParser.COM, i);
		}
		public TerminalNode COL() { return getToken(LanguageParser.COL, 0); }
		public TerminalNode INT_seqc() { return getToken(LanguageParser.INT_seqc, 0); }
		public Array_rangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_range; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterArray_range(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitArray_range(this);
		}
	}

	public final Array_rangeContext array_range() throws RecognitionException {
		Array_rangeContext _localctx = new Array_rangeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_array_range);
		int _la;
		try {
			setState(239);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(229);
				match(INT);
				setState(234);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COM) {
					{
					{
					setState(230);
					match(COM);
					setState(231);
					match(INT);
					}
					}
					setState(236);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case COL:
				enterOuterAlt(_localctx, 2);
				{
				setState(237);
				match(COL);
				}
				break;
			case INT_seqc:
				enterOuterAlt(_localctx, 3);
				{
				setState(238);
				match(INT_seqc);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode BOOL() { return getToken(LanguageParser.BOOL, 0); }
		public TerminalNode ID() { return getToken(LanguageParser.ID, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode N_STRING() { return getToken(LanguageParser.N_STRING, 0); }
		public N_arrayContext n_array() {
			return getRuleContext(N_arrayContext.class,0);
		}
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(241);
				match(BOOL);
				}
				break;
			case 2:
				{
				setState(242);
				match(ID);
				}
				break;
			case 3:
				{
				setState(243);
				number();
				}
				break;
			case 4:
				{
				setState(244);
				match(N_STRING);
				}
				break;
			case 5:
				{
				setState(245);
				n_array();
				}
				break;
			case 6:
				{
				setState(246);
				call();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LanguageParser.ID, 0); }
		public TerminalNode ASN() { return getToken(LanguageParser.ASN, 0); }
		public List<TerminalNode> EXPLCT() { return getTokens(LanguageParser.EXPLCT); }
		public TerminalNode EXPLCT(int i) {
			return getToken(LanguageParser.EXPLCT, i);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitAssign(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_assign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(249);
				match(EXPLCT);
				}
				break;
			}
			setState(253);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXPLCT) {
				{
				setState(252);
				match(EXPLCT);
				}
			}

			setState(262);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(255);
				match(ID);
				setState(256);
				match(ASN);
				setState(259);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
				case 1:
					{
					setState(257);
					value();
					}
					break;
				case 2:
					{
					setState(258);
					expression(0);
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(261);
				match(ID);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SeqcContext extends ParserRuleContext {
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public List<TerminalNode> COL() { return getTokens(LanguageParser.COL); }
		public TerminalNode COL(int i) {
			return getToken(LanguageParser.COL, i);
		}
		public SeqcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_seqc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterSeqc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitSeqc(this);
		}
	}

	public final SeqcContext seqc() throws RecognitionException {
		SeqcContext _localctx = new SeqcContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_seqc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			number();
			setState(265);
			match(COL);
			setState(266);
			number();
			setState(269);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COL) {
				{
				setState(267);
				match(COL);
				setState(268);
				number();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumberContext extends ParserRuleContext {
		public TerminalNode DECIMAL() { return getToken(LanguageParser.DECIMAL, 0); }
		public TerminalNode INT() { return getToken(LanguageParser.INT, 0); }
		public TerminalNode MNS() { return getToken(LanguageParser.MNS, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitNumber(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MNS) {
				{
				setState(271);
				match(MNS);
				}
			}

			setState(274);
			_la = _input.LA(1);
			if ( !(_la==DECIMAL || _la==INT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\66\u0117\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\2\6\2*\n\2\r\2\16\2+\3\3\5\3/\n\3\3\3\3\3\3\3\3\3"+
		"\5\3\65\n\3\6\3\67\n\3\r\3\16\38\3\4\3\4\3\4\3\4\3\4\3\4\5\4A\n\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\6\4I\n\4\r\4\16\4J\7\4M\n\4\f\4\16\4P\13\4\3\5\3"+
		"\5\3\5\3\5\3\5\5\5W\n\5\3\5\3\5\3\5\5\5\\\n\5\7\5^\n\5\f\5\16\5a\13\5"+
		"\3\5\3\5\7\5e\n\5\f\5\16\5h\13\5\3\5\3\5\3\6\3\6\3\6\3\6\7\6p\n\6\f\6"+
		"\16\6s\13\6\3\6\7\6v\n\6\f\6\16\6y\13\6\3\6\3\6\3\7\3\7\3\7\3\7\7\7\u0081"+
		"\n\7\f\7\16\7\u0084\13\7\3\7\3\7\3\b\3\b\3\b\3\b\7\b\u008c\n\b\f\b\16"+
		"\b\u008f\13\b\3\b\3\b\3\b\3\b\7\b\u0095\n\b\f\b\16\b\u0098\13\b\7\b\u009a"+
		"\n\b\f\b\16\b\u009d\13\b\3\b\3\b\7\b\u00a1\n\b\f\b\16\b\u00a4\13\b\5\b"+
		"\u00a6\n\b\3\b\3\b\3\t\3\t\3\t\3\t\5\t\u00ae\n\t\3\t\3\t\7\t\u00b2\n\t"+
		"\f\t\16\t\u00b5\13\t\3\t\3\t\3\n\3\n\3\n\3\n\7\n\u00bd\n\n\f\n\16\n\u00c0"+
		"\13\n\5\n\u00c2\n\n\3\13\3\13\3\13\3\13\5\13\u00c8\n\13\3\f\3\f\3\f\5"+
		"\f\u00cd\n\f\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00d5\n\r\7\r\u00d7\n\r\f\r\16"+
		"\r\u00da\13\r\5\r\u00dc\n\r\3\r\3\r\3\16\3\16\3\16\3\16\5\16\u00e4\n\16"+
		"\3\16\3\16\3\17\3\17\3\17\7\17\u00eb\n\17\f\17\16\17\u00ee\13\17\3\17"+
		"\3\17\5\17\u00f2\n\17\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00fa\n\20\3"+
		"\21\5\21\u00fd\n\21\3\21\5\21\u0100\n\21\3\21\3\21\3\21\3\21\5\21\u0106"+
		"\n\21\3\21\5\21\u0109\n\21\3\22\3\22\3\22\3\22\3\22\5\22\u0110\n\22\3"+
		"\23\5\23\u0113\n\23\3\23\3\23\3\23\2\3\6\24\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$\2\7\3\2$,\3\2\31\35\4\2\4\7\27\27\4\2\5\5\27\27\3\2\25"+
		"\26\2\u0137\2)\3\2\2\2\4\66\3\2\2\2\6@\3\2\2\2\bQ\3\2\2\2\nk\3\2\2\2\f"+
		"|\3\2\2\2\16\u0087\3\2\2\2\20\u00a9\3\2\2\2\22\u00c1\3\2\2\2\24\u00c3"+
		"\3\2\2\2\26\u00c9\3\2\2\2\30\u00ce\3\2\2\2\32\u00df\3\2\2\2\34\u00f1\3"+
		"\2\2\2\36\u00f9\3\2\2\2 \u00fc\3\2\2\2\"\u010a\3\2\2\2$\u0112\3\2\2\2"+
		"&*\5\b\5\2\'*\5\n\6\2(*\5\4\3\2)&\3\2\2\2)\'\3\2\2\2)(\3\2\2\2*+\3\2\2"+
		"\2+)\3\2\2\2+,\3\2\2\2,\3\3\2\2\2-/\7\62\2\2.-\3\2\2\2./\3\2\2\2/\64\3"+
		"\2\2\2\60\65\5 \21\2\61\65\5\24\13\2\62\65\5\16\b\2\63\65\5\20\t\2\64"+
		"\60\3\2\2\2\64\61\3\2\2\2\64\62\3\2\2\2\64\63\3\2\2\2\65\67\3\2\2\2\66"+
		".\3\2\2\2\678\3\2\2\28\66\3\2\2\289\3\2\2\29\5\3\2\2\2:;\b\4\1\2;<\7\36"+
		"\2\2<=\5\6\4\2=>\7\37\2\2>A\3\2\2\2?A\5\36\20\2@:\3\2\2\2@?\3\2\2\2AN"+
		"\3\2\2\2BC\f\5\2\2CD\t\2\2\2DM\5\6\4\6EH\f\6\2\2FG\t\3\2\2GI\5\6\4\2H"+
		"F\3\2\2\2IJ\3\2\2\2JH\3\2\2\2JK\3\2\2\2KM\3\2\2\2LB\3\2\2\2LE\3\2\2\2"+
		"MP\3\2\2\2NL\3\2\2\2NO\3\2\2\2O\7\3\2\2\2PN\3\2\2\2QR\7\3\2\2RS\t\4\2"+
		"\2SV\7\36\2\2TW\7\27\2\2UW\5 \21\2VT\3\2\2\2VU\3\2\2\2W_\3\2\2\2X[\7\60"+
		"\2\2Y\\\7\27\2\2Z\\\5 \21\2[Y\3\2\2\2[Z\3\2\2\2\\^\3\2\2\2]X\3\2\2\2^"+
		"a\3\2\2\2_]\3\2\2\2_`\3\2\2\2`b\3\2\2\2a_\3\2\2\2bf\7\37\2\2ce\5\4\3\2"+
		"dc\3\2\2\2eh\3\2\2\2fd\3\2\2\2fg\3\2\2\2gi\3\2\2\2hf\3\2\2\2ij\7\b\2\2"+
		"j\t\3\2\2\2kl\7\t\2\2lm\7\27\2\2mq\7\n\2\2np\5 \21\2on\3\2\2\2ps\3\2\2"+
		"\2qo\3\2\2\2qr\3\2\2\2rw\3\2\2\2sq\3\2\2\2tv\5\b\5\2ut\3\2\2\2vy\3\2\2"+
		"\2wu\3\2\2\2wx\3\2\2\2xz\3\2\2\2yw\3\2\2\2z{\7\b\2\2{\13\3\2\2\2|}\7\""+
		"\2\2}\u0082\5\22\n\2~\177\7\61\2\2\177\u0081\5\22\n\2\u0080~\3\2\2\2\u0081"+
		"\u0084\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0085\3\2"+
		"\2\2\u0084\u0082\3\2\2\2\u0085\u0086\7#\2\2\u0086\r\3\2\2\2\u0087\u0088"+
		"\7\13\2\2\u0088\u0089\5\6\4\2\u0089\u008d\7\f\2\2\u008a\u008c\5\4\3\2"+
		"\u008b\u008a\3\2\2\2\u008c\u008f\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e"+
		"\3\2\2\2\u008e\u009b\3\2\2\2\u008f\u008d\3\2\2\2\u0090\u0091\7\r\2\2\u0091"+
		"\u0092\5\6\4\2\u0092\u0096\7\f\2\2\u0093\u0095\5\4\3\2\u0094\u0093\3\2"+
		"\2\2\u0095\u0098\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097"+
		"\u009a\3\2\2\2\u0098\u0096\3\2\2\2\u0099\u0090\3\2\2\2\u009a\u009d\3\2"+
		"\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u00a5\3\2\2\2\u009d"+
		"\u009b\3\2\2\2\u009e\u00a2\7\16\2\2\u009f\u00a1\5\4\3\2\u00a0\u009f\3"+
		"\2\2\2\u00a1\u00a4\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3"+
		"\u00a6\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5\u009e\3\2\2\2\u00a5\u00a6\3\2"+
		"\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a8\7\b\2\2\u00a8\17\3\2\2\2\u00a9\u00ad"+
		"\7\17\2\2\u00aa\u00ae\7\23\2\2\u00ab\u00ae\7\26\2\2\u00ac\u00ae\5 \21"+
		"\2\u00ad\u00aa\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ac\3\2\2\2\u00ae\u00af"+
		"\3\2\2\2\u00af\u00b3\7\20\2\2\u00b0\u00b2\5\4\3\2\u00b1\u00b0\3\2\2\2"+
		"\u00b2\u00b5\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b6"+
		"\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b6\u00b7\7\b\2\2\u00b7\21\3\2\2\2\u00b8"+
		"\u00c2\5\"\22\2\u00b9\u00be\5\36\20\2\u00ba\u00bb\7\60\2\2\u00bb\u00bd"+
		"\5\36\20\2\u00bc\u00ba\3\2\2\2\u00bd\u00c0\3\2\2\2\u00be\u00bc\3\2\2\2"+
		"\u00be\u00bf\3\2\2\2\u00bf\u00c2\3\2\2\2\u00c0\u00be\3\2\2\2\u00c1\u00b8"+
		"\3\2\2\2\u00c1\u00b9\3\2\2\2\u00c2\23\3\2\2\2\u00c3\u00c7\t\5\2\2\u00c4"+
		"\u00c8\5\26\f\2\u00c5\u00c8\5\30\r\2\u00c6\u00c8\5\32\16\2\u00c7\u00c4"+
		"\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c6\3\2\2\2\u00c8\25\3\2\2\2\u00c9"+
		"\u00cc\7.\2\2\u00ca\u00cd\5\30\r\2\u00cb\u00cd\7\27\2\2\u00cc\u00ca\3"+
		"\2\2\2\u00cc\u00cb\3\2\2\2\u00cd\27\3\2\2\2\u00ce\u00db\7\36\2\2\u00cf"+
		"\u00dc\5\36\20\2\u00d0\u00d8\5 \21\2\u00d1\u00d4\7\60\2\2\u00d2\u00d5"+
		"\5\36\20\2\u00d3\u00d5\5 \21\2\u00d4\u00d2\3\2\2\2\u00d4\u00d3\3\2\2\2"+
		"\u00d5\u00d7\3\2\2\2\u00d6\u00d1\3\2\2\2\u00d7\u00da\3\2\2\2\u00d8\u00d6"+
		"\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00dc\3\2\2\2\u00da\u00d8\3\2\2\2\u00db"+
		"\u00cf\3\2\2\2\u00db\u00d0\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00dd\3\2"+
		"\2\2\u00dd\u00de\7\37\2\2\u00de\31\3\2\2\2\u00df\u00e0\7 \2\2\u00e0\u00e3"+
		"\5\34\17\2\u00e1\u00e2\7\61\2\2\u00e2\u00e4\5\34\17\2\u00e3\u00e1\3\2"+
		"\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e6\7!\2\2\u00e6"+
		"\33\3\2\2\2\u00e7\u00ec\7\26\2\2\u00e8\u00e9\7\60\2\2\u00e9\u00eb\7\26"+
		"\2\2\u00ea\u00e8\3\2\2\2\u00eb\u00ee\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec"+
		"\u00ed\3\2\2\2\u00ed\u00f2\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ef\u00f2\7/"+
		"\2\2\u00f0\u00f2\7\23\2\2\u00f1\u00e7\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1"+
		"\u00f0\3\2\2\2\u00f2\35\3\2\2\2\u00f3\u00fa\7\30\2\2\u00f4\u00fa\7\27"+
		"\2\2\u00f5\u00fa\5$\23\2\u00f6\u00fa\7\21\2\2\u00f7\u00fa\5\f\7\2\u00f8"+
		"\u00fa\5\24\13\2\u00f9\u00f3\3\2\2\2\u00f9\u00f4\3\2\2\2\u00f9\u00f5\3"+
		"\2\2\2\u00f9\u00f6\3\2\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00f8\3\2\2\2\u00fa"+
		"\37\3\2\2\2\u00fb\u00fd\7\22\2\2\u00fc\u00fb\3\2\2\2\u00fc\u00fd\3\2\2"+
		"\2\u00fd\u00ff\3\2\2\2\u00fe\u0100\7\22\2\2\u00ff\u00fe\3\2\2\2\u00ff"+
		"\u0100\3\2\2\2\u0100\u0108\3\2\2\2\u0101\u0102\7\27\2\2\u0102\u0105\7"+
		"-\2\2\u0103\u0106\5\36\20\2\u0104\u0106\5\6\4\2\u0105\u0103\3\2\2\2\u0105"+
		"\u0104\3\2\2\2\u0106\u0109\3\2\2\2\u0107\u0109\7\27\2\2\u0108\u0101\3"+
		"\2\2\2\u0108\u0107\3\2\2\2\u0109!\3\2\2\2\u010a\u010b\5$\23\2\u010b\u010c"+
		"\7/\2\2\u010c\u010f\5$\23\2\u010d\u010e\7/\2\2\u010e\u0110\5$\23\2\u010f"+
		"\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110#\3\2\2\2\u0111\u0113\7\32\2\2"+
		"\u0112\u0111\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0115"+
		"\t\6\2\2\u0115%\3\2\2\2*)+.\648@JLNV[_fqw\u0082\u008d\u0096\u009b\u00a2"+
		"\u00a5\u00ad\u00b3\u00be\u00c1\u00c7\u00cc\u00d4\u00d8\u00db\u00e3\u00ec"+
		"\u00f1\u00f9\u00fc\u00ff\u0105\u0108\u010f\u0112";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}