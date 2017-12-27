// Generated from C:/Uczelnia/S5/JFK/latex_antlr/antlr\Latex.g4 by ANTLR 4.7
package antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LatexParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, DOLLAR=4, STRING=5, LICZBA=6, PLUS=7, MINUS=8, 
		MNOZENIE=9, DZIELENIE=10, POTEGA=11, PIERWIASTEK=12, ULAMEK=13, DOL=14, 
		LIM=15, SUMA=16, ILOCZYN=17, CALKA=18, P=19, K=20, NL=21, NP=22, RARROW=23, 
		SIN=24, COS=25, TG=26, CTG=27, DX=28;
	public static final int
		RULE_dzialanie1 = 0, RULE_dzialanie2 = 1, RULE_dzialanie3 = 2, RULE_dzialanie4 = 3, 
		RULE_dzialanie5 = 4, RULE_operacja = 5, RULE_rownanie = 6;
	public static final String[] ruleNames = {
		"dzialanie1", "dzialanie2", "dzialanie3", "dzialanie4", "dzialanie5", 
		"operacja", "rownanie"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "' '", "'='", "'d'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, "DOLLAR", "STRING", "LICZBA", "PLUS", "MINUS", 
		"MNOZENIE", "DZIELENIE", "POTEGA", "PIERWIASTEK", "ULAMEK", "DOL", "LIM", 
		"SUMA", "ILOCZYN", "CALKA", "P", "K", "NL", "NP", "RARROW", "SIN", "COS", 
		"TG", "CTG", "DX"
	};
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
	public String getGrammarFileName() { return "Latex.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LatexParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class Dzialanie1Context extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(LatexParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(LatexParser.MINUS, 0); }
		public Dzialanie1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dzialanie1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatexListener ) ((LatexListener)listener).enterDzialanie1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatexListener ) ((LatexListener)listener).exitDzialanie1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatexVisitor ) return ((LatexVisitor<? extends T>)visitor).visitDzialanie1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dzialanie1Context dzialanie1() throws RecognitionException {
		Dzialanie1Context _localctx = new Dzialanie1Context(_ctx, getState());
		enterRule(_localctx, 0, RULE_dzialanie1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			_la = _input.LA(1);
			if ( !(_la==PLUS || _la==MINUS) ) {
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

	public static class Dzialanie2Context extends ParserRuleContext {
		public TerminalNode MNOZENIE() { return getToken(LatexParser.MNOZENIE, 0); }
		public TerminalNode DZIELENIE() { return getToken(LatexParser.DZIELENIE, 0); }
		public Dzialanie2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dzialanie2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatexListener ) ((LatexListener)listener).enterDzialanie2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatexListener ) ((LatexListener)listener).exitDzialanie2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatexVisitor ) return ((LatexVisitor<? extends T>)visitor).visitDzialanie2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dzialanie2Context dzialanie2() throws RecognitionException {
		Dzialanie2Context _localctx = new Dzialanie2Context(_ctx, getState());
		enterRule(_localctx, 2, RULE_dzialanie2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			_la = _input.LA(1);
			if ( !(_la==MNOZENIE || _la==DZIELENIE) ) {
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

	public static class Dzialanie3Context extends ParserRuleContext {
		public TerminalNode POTEGA() { return getToken(LatexParser.POTEGA, 0); }
		public TerminalNode PIERWIASTEK() { return getToken(LatexParser.PIERWIASTEK, 0); }
		public Dzialanie3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dzialanie3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatexListener ) ((LatexListener)listener).enterDzialanie3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatexListener ) ((LatexListener)listener).exitDzialanie3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatexVisitor ) return ((LatexVisitor<? extends T>)visitor).visitDzialanie3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dzialanie3Context dzialanie3() throws RecognitionException {
		Dzialanie3Context _localctx = new Dzialanie3Context(_ctx, getState());
		enterRule(_localctx, 4, RULE_dzialanie3);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			_la = _input.LA(1);
			if ( !(_la==POTEGA || _la==PIERWIASTEK) ) {
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

	public static class Dzialanie4Context extends ParserRuleContext {
		public TerminalNode NL() { return getToken(LatexParser.NL, 0); }
		public TerminalNode NP() { return getToken(LatexParser.NP, 0); }
		public Dzialanie4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dzialanie4; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatexListener ) ((LatexListener)listener).enterDzialanie4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatexListener ) ((LatexListener)listener).exitDzialanie4(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatexVisitor ) return ((LatexVisitor<? extends T>)visitor).visitDzialanie4(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dzialanie4Context dzialanie4() throws RecognitionException {
		Dzialanie4Context _localctx = new Dzialanie4Context(_ctx, getState());
		enterRule(_localctx, 6, RULE_dzialanie4);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			_la = _input.LA(1);
			if ( !(_la==NL || _la==NP) ) {
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

	public static class Dzialanie5Context extends ParserRuleContext {
		public TerminalNode COS() { return getToken(LatexParser.COS, 0); }
		public TerminalNode SIN() { return getToken(LatexParser.SIN, 0); }
		public TerminalNode TG() { return getToken(LatexParser.TG, 0); }
		public TerminalNode CTG() { return getToken(LatexParser.CTG, 0); }
		public Dzialanie5Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dzialanie5; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatexListener ) ((LatexListener)listener).enterDzialanie5(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatexListener ) ((LatexListener)listener).exitDzialanie5(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatexVisitor ) return ((LatexVisitor<? extends T>)visitor).visitDzialanie5(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dzialanie5Context dzialanie5() throws RecognitionException {
		Dzialanie5Context _localctx = new Dzialanie5Context(_ctx, getState());
		enterRule(_localctx, 8, RULE_dzialanie5);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SIN) | (1L << COS) | (1L << TG) | (1L << CTG))) != 0)) ) {
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

	public static class OperacjaContext extends ParserRuleContext {
		public Dzialanie3Context dzialanie3() {
			return getRuleContext(Dzialanie3Context.class,0);
		}
		public List<TerminalNode> P() { return getTokens(LatexParser.P); }
		public TerminalNode P(int i) {
			return getToken(LatexParser.P, i);
		}
		public List<OperacjaContext> operacja() {
			return getRuleContexts(OperacjaContext.class);
		}
		public OperacjaContext operacja(int i) {
			return getRuleContext(OperacjaContext.class,i);
		}
		public List<TerminalNode> K() { return getTokens(LatexParser.K); }
		public TerminalNode K(int i) {
			return getToken(LatexParser.K, i);
		}
		public Dzialanie5Context dzialanie5() {
			return getRuleContext(Dzialanie5Context.class,0);
		}
		public TerminalNode NL() { return getToken(LatexParser.NL, 0); }
		public TerminalNode NP() { return getToken(LatexParser.NP, 0); }
		public List<TerminalNode> MINUS() { return getTokens(LatexParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(LatexParser.MINUS, i);
		}
		public TerminalNode LICZBA() { return getToken(LatexParser.LICZBA, 0); }
		public TerminalNode STRING() { return getToken(LatexParser.STRING, 0); }
		public TerminalNode DOL() { return getToken(LatexParser.DOL, 0); }
		public TerminalNode ULAMEK() { return getToken(LatexParser.ULAMEK, 0); }
		public TerminalNode LIM() { return getToken(LatexParser.LIM, 0); }
		public TerminalNode RARROW() { return getToken(LatexParser.RARROW, 0); }
		public TerminalNode SUMA() { return getToken(LatexParser.SUMA, 0); }
		public TerminalNode POTEGA() { return getToken(LatexParser.POTEGA, 0); }
		public TerminalNode ILOCZYN() { return getToken(LatexParser.ILOCZYN, 0); }
		public TerminalNode CALKA() { return getToken(LatexParser.CALKA, 0); }
		public TerminalNode DX() { return getToken(LatexParser.DX, 0); }
		public Dzialanie2Context dzialanie2() {
			return getRuleContext(Dzialanie2Context.class,0);
		}
		public Dzialanie1Context dzialanie1() {
			return getRuleContext(Dzialanie1Context.class,0);
		}
		public Dzialanie4Context dzialanie4() {
			return getRuleContext(Dzialanie4Context.class,0);
		}
		public OperacjaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operacja; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatexListener ) ((LatexListener)listener).enterOperacja(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatexListener ) ((LatexListener)listener).exitOperacja(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatexVisitor ) return ((LatexVisitor<? extends T>)visitor).visitOperacja(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperacjaContext operacja() throws RecognitionException {
		return operacja(0);
	}

	private OperacjaContext operacja(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		OperacjaContext _localctx = new OperacjaContext(_ctx, _parentState);
		OperacjaContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_operacja, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(25);
				dzialanie3();
				setState(26);
				match(P);
				setState(27);
				operacja(0);
				setState(28);
				match(K);
				}
				break;
			case 2:
				{
				setState(30);
				dzialanie5();
				{
				setState(31);
				match(T__0);
				}
				setState(32);
				operacja(15);
				}
				break;
			case 3:
				{
				setState(35);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(34);
					match(MINUS);
					}
				}

				setState(37);
				match(NL);
				setState(38);
				operacja(0);
				setState(39);
				match(NP);
				}
				break;
			case 4:
				{
				setState(42);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(41);
					match(MINUS);
					}
				}

				setState(44);
				match(NL);
				setState(45);
				match(MINUS);
				setState(46);
				operacja(0);
				setState(47);
				match(NP);
				}
				break;
			case 5:
				{
				setState(49);
				match(LICZBA);
				}
				break;
			case 6:
				{
				setState(50);
				match(STRING);
				setState(56);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(51);
					match(DOL);
					setState(52);
					match(P);
					setState(53);
					operacja(0);
					setState(54);
					match(K);
					}
					break;
				}
				}
				break;
			case 7:
				{
				setState(58);
				match(ULAMEK);
				setState(59);
				match(P);
				setState(60);
				operacja(0);
				setState(61);
				match(K);
				setState(62);
				match(P);
				setState(63);
				operacja(0);
				setState(64);
				match(K);
				}
				break;
			case 8:
				{
				setState(66);
				match(MINUS);
				setState(67);
				match(LICZBA);
				}
				break;
			case 9:
				{
				setState(68);
				match(MINUS);
				setState(69);
				match(STRING);
				}
				break;
			case 10:
				{
				setState(70);
				match(LIM);
				setState(71);
				match(P);
				setState(72);
				operacja(0);
				{
				setState(73);
				match(T__0);
				}
				setState(74);
				match(RARROW);
				{
				setState(75);
				match(T__0);
				}
				setState(76);
				operacja(0);
				setState(77);
				match(K);
				setState(78);
				operacja(5);
				}
				break;
			case 11:
				{
				setState(80);
				match(SUMA);
				setState(81);
				match(DOL);
				setState(82);
				match(P);
				setState(83);
				operacja(0);
				{
				setState(84);
				match(T__1);
				}
				setState(85);
				operacja(0);
				setState(86);
				match(K);
				setState(87);
				match(POTEGA);
				setState(88);
				match(P);
				setState(89);
				operacja(0);
				setState(90);
				match(K);
				}
				break;
			case 12:
				{
				setState(92);
				match(ILOCZYN);
				setState(93);
				match(DOL);
				setState(94);
				match(P);
				setState(95);
				operacja(0);
				{
				setState(96);
				match(T__1);
				}
				setState(97);
				operacja(0);
				setState(98);
				match(K);
				setState(99);
				match(POTEGA);
				setState(100);
				match(P);
				setState(101);
				operacja(0);
				setState(102);
				match(K);
				}
				break;
			case 13:
				{
				setState(104);
				match(CALKA);
				{
				setState(105);
				match(T__0);
				}
				setState(106);
				operacja(0);
				setState(107);
				match(DX);
				setState(108);
				match(P);
				setState(109);
				match(T__2);
				setState(110);
				match(K);
				setState(111);
				match(STRING);
				}
				break;
			case 14:
				{
				setState(113);
				match(CALKA);
				setState(114);
				match(DOL);
				setState(115);
				match(P);
				setState(116);
				operacja(0);
				setState(117);
				match(K);
				setState(118);
				match(POTEGA);
				setState(119);
				match(P);
				setState(120);
				operacja(0);
				setState(121);
				match(K);
				{
				setState(122);
				match(T__0);
				}
				setState(123);
				operacja(0);
				setState(124);
				match(DX);
				setState(125);
				match(P);
				setState(126);
				match(T__2);
				setState(127);
				match(K);
				setState(128);
				match(STRING);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(150);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(148);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new OperacjaContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_operacja);
						setState(132);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(133);
						dzialanie2();
						setState(134);
						operacja(15);
						}
						break;
					case 2:
						{
						_localctx = new OperacjaContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_operacja);
						setState(136);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(137);
						dzialanie1();
						setState(138);
						operacja(14);
						}
						break;
					case 3:
						{
						_localctx = new OperacjaContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_operacja);
						setState(140);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(141);
						dzialanie4();
						}
						break;
					case 4:
						{
						_localctx = new OperacjaContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_operacja);
						setState(142);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(143);
						dzialanie3();
						setState(144);
						match(P);
						setState(145);
						operacja(0);
						setState(146);
						match(K);
						}
						break;
					}
					} 
				}
				setState(152);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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

	public static class RownanieContext extends ParserRuleContext {
		public List<TerminalNode> DOLLAR() { return getTokens(LatexParser.DOLLAR); }
		public TerminalNode DOLLAR(int i) {
			return getToken(LatexParser.DOLLAR, i);
		}
		public List<OperacjaContext> operacja() {
			return getRuleContexts(OperacjaContext.class);
		}
		public OperacjaContext operacja(int i) {
			return getRuleContext(OperacjaContext.class,i);
		}
		public RownanieContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rownanie; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LatexListener ) ((LatexListener)listener).enterRownanie(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LatexListener ) ((LatexListener)listener).exitRownanie(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LatexVisitor ) return ((LatexVisitor<? extends T>)visitor).visitRownanie(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RownanieContext rownanie() throws RecognitionException {
		RownanieContext _localctx = new RownanieContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_rownanie);
		try {
			setState(163);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(153);
				match(DOLLAR);
				setState(154);
				operacja(0);
				{
				setState(155);
				match(T__1);
				}
				setState(156);
				operacja(0);
				setState(157);
				match(DOLLAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(159);
				match(DOLLAR);
				setState(160);
				operacja(0);
				setState(161);
				match(DOLLAR);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 5:
			return operacja_sempred((OperacjaContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean operacja_sempred(OperacjaContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 14);
		case 1:
			return precpred(_ctx, 13);
		case 2:
			return precpred(_ctx, 18);
		case 3:
			return precpred(_ctx, 17);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\36\u00a8\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\3\3\3\3\4\3"+
		"\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7&\n"+
		"\7\3\7\3\7\3\7\3\7\3\7\5\7-\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\5\7;\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0085\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u0097\n\7\f\7\16\7\u009a\13\7"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00a6\n\b\3\b\2\3\f\t\2\4"+
		"\6\b\n\f\16\2\7\3\2\t\n\3\2\13\f\3\2\r\16\3\2\27\30\3\2\32\35\2\u00b5"+
		"\2\20\3\2\2\2\4\22\3\2\2\2\6\24\3\2\2\2\b\26\3\2\2\2\n\30\3\2\2\2\f\u0084"+
		"\3\2\2\2\16\u00a5\3\2\2\2\20\21\t\2\2\2\21\3\3\2\2\2\22\23\t\3\2\2\23"+
		"\5\3\2\2\2\24\25\t\4\2\2\25\7\3\2\2\2\26\27\t\5\2\2\27\t\3\2\2\2\30\31"+
		"\t\6\2\2\31\13\3\2\2\2\32\33\b\7\1\2\33\34\5\6\4\2\34\35\7\25\2\2\35\36"+
		"\5\f\7\2\36\37\7\26\2\2\37\u0085\3\2\2\2 !\5\n\6\2!\"\7\3\2\2\"#\5\f\7"+
		"\21#\u0085\3\2\2\2$&\7\n\2\2%$\3\2\2\2%&\3\2\2\2&\'\3\2\2\2\'(\7\27\2"+
		"\2()\5\f\7\2)*\7\30\2\2*\u0085\3\2\2\2+-\7\n\2\2,+\3\2\2\2,-\3\2\2\2-"+
		".\3\2\2\2./\7\27\2\2/\60\7\n\2\2\60\61\5\f\7\2\61\62\7\30\2\2\62\u0085"+
		"\3\2\2\2\63\u0085\7\b\2\2\64:\7\7\2\2\65\66\7\20\2\2\66\67\7\25\2\2\67"+
		"8\5\f\7\289\7\26\2\29;\3\2\2\2:\65\3\2\2\2:;\3\2\2\2;\u0085\3\2\2\2<="+
		"\7\17\2\2=>\7\25\2\2>?\5\f\7\2?@\7\26\2\2@A\7\25\2\2AB\5\f\7\2BC\7\26"+
		"\2\2C\u0085\3\2\2\2DE\7\n\2\2E\u0085\7\b\2\2FG\7\n\2\2G\u0085\7\7\2\2"+
		"HI\7\21\2\2IJ\7\25\2\2JK\5\f\7\2KL\7\3\2\2LM\7\31\2\2MN\7\3\2\2NO\5\f"+
		"\7\2OP\7\26\2\2PQ\5\f\7\7Q\u0085\3\2\2\2RS\7\22\2\2ST\7\20\2\2TU\7\25"+
		"\2\2UV\5\f\7\2VW\7\4\2\2WX\5\f\7\2XY\7\26\2\2YZ\7\r\2\2Z[\7\25\2\2[\\"+
		"\5\f\7\2\\]\7\26\2\2]\u0085\3\2\2\2^_\7\23\2\2_`\7\20\2\2`a\7\25\2\2a"+
		"b\5\f\7\2bc\7\4\2\2cd\5\f\7\2de\7\26\2\2ef\7\r\2\2fg\7\25\2\2gh\5\f\7"+
		"\2hi\7\26\2\2i\u0085\3\2\2\2jk\7\24\2\2kl\7\3\2\2lm\5\f\7\2mn\7\36\2\2"+
		"no\7\25\2\2op\7\5\2\2pq\7\26\2\2qr\7\7\2\2r\u0085\3\2\2\2st\7\24\2\2t"+
		"u\7\20\2\2uv\7\25\2\2vw\5\f\7\2wx\7\26\2\2xy\7\r\2\2yz\7\25\2\2z{\5\f"+
		"\7\2{|\7\26\2\2|}\7\3\2\2}~\5\f\7\2~\177\7\36\2\2\177\u0080\7\25\2\2\u0080"+
		"\u0081\7\5\2\2\u0081\u0082\7\26\2\2\u0082\u0083\7\7\2\2\u0083\u0085\3"+
		"\2\2\2\u0084\32\3\2\2\2\u0084 \3\2\2\2\u0084%\3\2\2\2\u0084,\3\2\2\2\u0084"+
		"\63\3\2\2\2\u0084\64\3\2\2\2\u0084<\3\2\2\2\u0084D\3\2\2\2\u0084F\3\2"+
		"\2\2\u0084H\3\2\2\2\u0084R\3\2\2\2\u0084^\3\2\2\2\u0084j\3\2\2\2\u0084"+
		"s\3\2\2\2\u0085\u0098\3\2\2\2\u0086\u0087\f\20\2\2\u0087\u0088\5\4\3\2"+
		"\u0088\u0089\5\f\7\21\u0089\u0097\3\2\2\2\u008a\u008b\f\17\2\2\u008b\u008c"+
		"\5\2\2\2\u008c\u008d\5\f\7\20\u008d\u0097\3\2\2\2\u008e\u008f\f\24\2\2"+
		"\u008f\u0097\5\b\5\2\u0090\u0091\f\23\2\2\u0091\u0092\5\6\4\2\u0092\u0093"+
		"\7\25\2\2\u0093\u0094\5\f\7\2\u0094\u0095\7\26\2\2\u0095\u0097\3\2\2\2"+
		"\u0096\u0086\3\2\2\2\u0096\u008a\3\2\2\2\u0096\u008e\3\2\2\2\u0096\u0090"+
		"\3\2\2\2\u0097\u009a\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099"+
		"\r\3\2\2\2\u009a\u0098\3\2\2\2\u009b\u009c\7\6\2\2\u009c\u009d\5\f\7\2"+
		"\u009d\u009e\7\4\2\2\u009e\u009f\5\f\7\2\u009f\u00a0\7\6\2\2\u00a0\u00a6"+
		"\3\2\2\2\u00a1\u00a2\7\6\2\2\u00a2\u00a3\5\f\7\2\u00a3\u00a4\7\6\2\2\u00a4"+
		"\u00a6\3\2\2\2\u00a5\u009b\3\2\2\2\u00a5\u00a1\3\2\2\2\u00a6\17\3\2\2"+
		"\2\t%,:\u0084\u0096\u0098\u00a5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}