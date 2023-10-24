// Generated from c:/Users/nazar/OneDrive/Рабочий стол/унік/Прога/ООП/MyExcel/src/DemoParser.Parsing/LabCalculator.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class LabCalculatorParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, NUMBER=2, IDENTIFIER=3, INT=4, EXPONENT=5, MULTIPLY=6, DIVIDE=7, 
		SUBTRACT=8, ADD=9, LPAREN=10, RPAREN=11, MMAX=12, MMIN=13, MAX=14, MIN=15, 
		WS=16;
	public static final int
		RULE_compileUnit = 0, RULE_expression = 1, RULE_arglist = 2;
	private static String[] makeRuleNames() {
		return new String[] {
			"compileUnit", "expression", "arglist"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", null, null, null, "'^'", "'*'", "'/'", "'-'", "'+'", "'('", 
			"')'", "'mmax'", "'mmin'", "'max'", "'min'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "NUMBER", "IDENTIFIER", "INT", "EXPONENT", "MULTIPLY", "DIVIDE", 
			"SUBTRACT", "ADD", "LPAREN", "RPAREN", "MMAX", "MMIN", "MAX", "MIN", 
			"WS"
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
	public String getGrammarFileName() { return "LabCalculator.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LabCalculatorParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CompileUnitContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode EOF() { return getToken(LabCalculatorParser.EOF, 0); }
		public CompileUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compileUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabCalculatorListener ) ((LabCalculatorListener)listener).enterCompileUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabCalculatorListener ) ((LabCalculatorListener)listener).exitCompileUnit(this);
		}
	}

	public final CompileUnitContext compileUnit() throws RecognitionException {
		CompileUnitContext _localctx = new CompileUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compileUnit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(6);
			expression(0);
			setState(7);
			match(EOF);
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

	@SuppressWarnings("CheckReturnValue")
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
	@SuppressWarnings("CheckReturnValue")
	public static class MultiplicativeExprContext extends ExpressionContext {
		public Token operatorToken;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MULTIPLY() { return getToken(LabCalculatorParser.MULTIPLY, 0); }
		public TerminalNode DIVIDE() { return getToken(LabCalculatorParser.DIVIDE, 0); }
		public MultiplicativeExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabCalculatorListener ) ((LabCalculatorListener)listener).enterMultiplicativeExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabCalculatorListener ) ((LabCalculatorListener)listener).exitMultiplicativeExpr(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExponentialExprContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode EXPONENT() { return getToken(LabCalculatorParser.EXPONENT, 0); }
		public ExponentialExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabCalculatorListener ) ((LabCalculatorListener)listener).enterExponentialExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabCalculatorListener ) ((LabCalculatorListener)listener).exitExponentialExpr(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AdditiveExprContext extends ExpressionContext {
		public Token operatorToken;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ADD() { return getToken(LabCalculatorParser.ADD, 0); }
		public TerminalNode SUBTRACT() { return getToken(LabCalculatorParser.SUBTRACT, 0); }
		public AdditiveExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabCalculatorListener ) ((LabCalculatorListener)listener).enterAdditiveExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabCalculatorListener ) ((LabCalculatorListener)listener).exitAdditiveExpr(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumberExprContext extends ExpressionContext {
		public TerminalNode NUMBER() { return getToken(LabCalculatorParser.NUMBER, 0); }
		public NumberExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabCalculatorListener ) ((LabCalculatorListener)listener).enterNumberExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabCalculatorListener ) ((LabCalculatorListener)listener).exitNumberExpr(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierExprContext extends ExpressionContext {
		public TerminalNode IDENTIFIER() { return getToken(LabCalculatorParser.IDENTIFIER, 0); }
		public IdentifierExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabCalculatorListener ) ((LabCalculatorListener)listener).enterIdentifierExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabCalculatorListener ) ((LabCalculatorListener)listener).exitIdentifierExpr(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MminExprContext extends ExpressionContext {
		public ArglistContext paramlist;
		public TerminalNode MMIN() { return getToken(LabCalculatorParser.MMIN, 0); }
		public TerminalNode LPAREN() { return getToken(LabCalculatorParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(LabCalculatorParser.RPAREN, 0); }
		public ArglistContext arglist() {
			return getRuleContext(ArglistContext.class,0);
		}
		public MminExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabCalculatorListener ) ((LabCalculatorListener)listener).enterMminExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabCalculatorListener ) ((LabCalculatorListener)listener).exitMminExpr(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MmaxExprContext extends ExpressionContext {
		public ArglistContext paramlist;
		public TerminalNode MMAX() { return getToken(LabCalculatorParser.MMAX, 0); }
		public TerminalNode LPAREN() { return getToken(LabCalculatorParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(LabCalculatorParser.RPAREN, 0); }
		public ArglistContext arglist() {
			return getRuleContext(ArglistContext.class,0);
		}
		public MmaxExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabCalculatorListener ) ((LabCalculatorListener)listener).enterMmaxExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabCalculatorListener ) ((LabCalculatorListener)listener).exitMmaxExpr(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParenthesizedExprContext extends ExpressionContext {
		public TerminalNode LPAREN() { return getToken(LabCalculatorParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(LabCalculatorParser.RPAREN, 0); }
		public ParenthesizedExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabCalculatorListener ) ((LabCalculatorListener)listener).enterParenthesizedExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabCalculatorListener ) ((LabCalculatorListener)listener).exitParenthesizedExpr(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MaxExprContext extends ExpressionContext {
		public TerminalNode MAX() { return getToken(LabCalculatorParser.MAX, 0); }
		public TerminalNode LPAREN() { return getToken(LabCalculatorParser.LPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(LabCalculatorParser.RPAREN, 0); }
		public MaxExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabCalculatorListener ) ((LabCalculatorListener)listener).enterMaxExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabCalculatorListener ) ((LabCalculatorListener)listener).exitMaxExpr(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MinExprContext extends ExpressionContext {
		public TerminalNode MIN() { return getToken(LabCalculatorParser.MIN, 0); }
		public TerminalNode LPAREN() { return getToken(LabCalculatorParser.LPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(LabCalculatorParser.RPAREN, 0); }
		public MinExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabCalculatorListener ) ((LabCalculatorListener)listener).enterMinExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabCalculatorListener ) ((LabCalculatorListener)listener).exitMinExpr(this);
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
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				{
				_localctx = new ParenthesizedExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(10);
				match(LPAREN);
				setState(11);
				expression(0);
				setState(12);
				match(RPAREN);
				}
				break;
			case MMAX:
				{
				_localctx = new MmaxExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(14);
				match(MMAX);
				setState(15);
				match(LPAREN);
				setState(16);
				((MmaxExprContext)_localctx).paramlist = arglist();
				setState(17);
				match(RPAREN);
				}
				break;
			case MMIN:
				{
				_localctx = new MminExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(19);
				match(MMIN);
				setState(20);
				match(LPAREN);
				setState(21);
				((MminExprContext)_localctx).paramlist = arglist();
				setState(22);
				match(RPAREN);
				}
				break;
			case MAX:
				{
				_localctx = new MaxExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(24);
				match(MAX);
				setState(25);
				match(LPAREN);
				setState(26);
				expression(0);
				setState(27);
				match(T__0);
				setState(28);
				expression(0);
				setState(29);
				match(RPAREN);
				}
				break;
			case MIN:
				{
				_localctx = new MinExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(31);
				match(MIN);
				setState(32);
				match(LPAREN);
				setState(33);
				expression(0);
				setState(34);
				match(T__0);
				setState(35);
				expression(0);
				setState(36);
				match(RPAREN);
				}
				break;
			case NUMBER:
				{
				_localctx = new NumberExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(38);
				match(NUMBER);
				}
				break;
			case IDENTIFIER:
				{
				_localctx = new IdentifierExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(39);
				match(IDENTIFIER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(53);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(51);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						_localctx = new ExponentialExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(42);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(43);
						match(EXPONENT);
						setState(44);
						expression(10);
						}
						break;
					case 2:
						{
						_localctx = new MultiplicativeExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(45);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(46);
						((MultiplicativeExprContext)_localctx).operatorToken = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MULTIPLY || _la==DIVIDE) ) {
							((MultiplicativeExprContext)_localctx).operatorToken = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(47);
						expression(9);
						}
						break;
					case 3:
						{
						_localctx = new AdditiveExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(48);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(49);
						((AdditiveExprContext)_localctx).operatorToken = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==SUBTRACT || _la==ADD) ) {
							((AdditiveExprContext)_localctx).operatorToken = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(50);
						expression(8);
						}
						break;
					}
					} 
				}
				setState(55);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArglistContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArglistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arglist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabCalculatorListener ) ((LabCalculatorListener)listener).enterArglist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabCalculatorListener ) ((LabCalculatorListener)listener).exitArglist(this);
		}
	}

	public final ArglistContext arglist() throws RecognitionException {
		ArglistContext _localctx = new ArglistContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_arglist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			expression(0);
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(57);
				match(T__0);
				setState(58);
				expression(0);
				}
				}
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
		case 1:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 9);
		case 1:
			return precpred(_ctx, 8);
		case 2:
			return precpred(_ctx, 7);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0010A\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003"+
		"\u0001)\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u00014\b"+
		"\u0001\n\u0001\f\u00017\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0005"+
		"\u0002<\b\u0002\n\u0002\f\u0002?\t\u0002\u0001\u0002\u0000\u0001\u0002"+
		"\u0003\u0000\u0002\u0004\u0000\u0002\u0001\u0000\u0006\u0007\u0001\u0000"+
		"\b\tG\u0000\u0006\u0001\u0000\u0000\u0000\u0002(\u0001\u0000\u0000\u0000"+
		"\u00048\u0001\u0000\u0000\u0000\u0006\u0007\u0003\u0002\u0001\u0000\u0007"+
		"\b\u0005\u0000\u0000\u0001\b\u0001\u0001\u0000\u0000\u0000\t\n\u0006\u0001"+
		"\uffff\uffff\u0000\n\u000b\u0005\n\u0000\u0000\u000b\f\u0003\u0002\u0001"+
		"\u0000\f\r\u0005\u000b\u0000\u0000\r)\u0001\u0000\u0000\u0000\u000e\u000f"+
		"\u0005\f\u0000\u0000\u000f\u0010\u0005\n\u0000\u0000\u0010\u0011\u0003"+
		"\u0004\u0002\u0000\u0011\u0012\u0005\u000b\u0000\u0000\u0012)\u0001\u0000"+
		"\u0000\u0000\u0013\u0014\u0005\r\u0000\u0000\u0014\u0015\u0005\n\u0000"+
		"\u0000\u0015\u0016\u0003\u0004\u0002\u0000\u0016\u0017\u0005\u000b\u0000"+
		"\u0000\u0017)\u0001\u0000\u0000\u0000\u0018\u0019\u0005\u000e\u0000\u0000"+
		"\u0019\u001a\u0005\n\u0000\u0000\u001a\u001b\u0003\u0002\u0001\u0000\u001b"+
		"\u001c\u0005\u0001\u0000\u0000\u001c\u001d\u0003\u0002\u0001\u0000\u001d"+
		"\u001e\u0005\u000b\u0000\u0000\u001e)\u0001\u0000\u0000\u0000\u001f \u0005"+
		"\u000f\u0000\u0000 !\u0005\n\u0000\u0000!\"\u0003\u0002\u0001\u0000\""+
		"#\u0005\u0001\u0000\u0000#$\u0003\u0002\u0001\u0000$%\u0005\u000b\u0000"+
		"\u0000%)\u0001\u0000\u0000\u0000&)\u0005\u0002\u0000\u0000\')\u0005\u0003"+
		"\u0000\u0000(\t\u0001\u0000\u0000\u0000(\u000e\u0001\u0000\u0000\u0000"+
		"(\u0013\u0001\u0000\u0000\u0000(\u0018\u0001\u0000\u0000\u0000(\u001f"+
		"\u0001\u0000\u0000\u0000(&\u0001\u0000\u0000\u0000(\'\u0001\u0000\u0000"+
		"\u0000)5\u0001\u0000\u0000\u0000*+\n\t\u0000\u0000+,\u0005\u0005\u0000"+
		"\u0000,4\u0003\u0002\u0001\n-.\n\b\u0000\u0000./\u0007\u0000\u0000\u0000"+
		"/4\u0003\u0002\u0001\t01\n\u0007\u0000\u000012\u0007\u0001\u0000\u0000"+
		"24\u0003\u0002\u0001\b3*\u0001\u0000\u0000\u00003-\u0001\u0000\u0000\u0000"+
		"30\u0001\u0000\u0000\u000047\u0001\u0000\u0000\u000053\u0001\u0000\u0000"+
		"\u000056\u0001\u0000\u0000\u00006\u0003\u0001\u0000\u0000\u000075\u0001"+
		"\u0000\u0000\u00008=\u0003\u0002\u0001\u00009:\u0005\u0001\u0000\u0000"+
		":<\u0003\u0002\u0001\u0000;9\u0001\u0000\u0000\u0000<?\u0001\u0000\u0000"+
		"\u0000=;\u0001\u0000\u0000\u0000=>\u0001\u0000\u0000\u0000>\u0005\u0001"+
		"\u0000\u0000\u0000?=\u0001\u0000\u0000\u0000\u0004(35=";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}