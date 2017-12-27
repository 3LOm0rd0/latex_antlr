// Generated from C:/Uczelnia/S5/JFK/latex_antlr/antlr\Latex.g4 by ANTLR 4.7
package antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LatexLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, DOLLAR=4, STRING=5, LICZBA=6, PLUS=7, MINUS=8, 
		MNOZENIE=9, DZIELENIE=10, POTEGA=11, PIERWIASTEK=12, ULAMEK=13, DOL=14, 
		LIM=15, SUMA=16, ILOCZYN=17, CALKA=18, P=19, K=20, NL=21, NP=22, RARROW=23, 
		SIN=24, COS=25, TG=26, CTG=27, DX=28;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "DOLLAR", "STRING", "LICZBA", "PLUS", "MINUS", 
		"MNOZENIE", "DZIELENIE", "POTEGA", "PIERWIASTEK", "ULAMEK", "DOL", "LIM", 
		"SUMA", "ILOCZYN", "CALKA", "P", "K", "NL", "NP", "RARROW", "SIN", "COS", 
		"TG", "CTG", "DX"
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


	public LatexLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Latex.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\36\u00ad\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\3\3\3\3\4\3\4"+
		"\3\5\3\5\3\6\6\6E\n\6\r\6\16\6F\3\7\6\7J\n\7\r\7\16\7K\3\b\3\b\3\t\3\t"+
		"\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24"+
		"\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32"+
		"\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\2\2\36\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\65\34\67\359\36\3\2\4\4\2C\\c|\3\2\62;\2\u00ae\2\3\3"+
		"\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2"+
		"\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3"+
		"\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2"+
		"%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61"+
		"\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\3;\3\2\2\2"+
		"\5=\3\2\2\2\7?\3\2\2\2\tA\3\2\2\2\13D\3\2\2\2\rI\3\2\2\2\17M\3\2\2\2\21"+
		"O\3\2\2\2\23Q\3\2\2\2\25S\3\2\2\2\27U\3\2\2\2\31W\3\2\2\2\33]\3\2\2\2"+
		"\35c\3\2\2\2\37e\3\2\2\2!k\3\2\2\2#p\3\2\2\2%v\3\2\2\2\'{\3\2\2\2)}\3"+
		"\2\2\2+\177\3\2\2\2-\u0081\3\2\2\2/\u0083\3\2\2\2\61\u008f\3\2\2\2\63"+
		"\u0094\3\2\2\2\65\u0099\3\2\2\2\67\u009d\3\2\2\29\u00a2\3\2\2\2;<\7\""+
		"\2\2<\4\3\2\2\2=>\7?\2\2>\6\3\2\2\2?@\7f\2\2@\b\3\2\2\2AB\7&\2\2B\n\3"+
		"\2\2\2CE\t\2\2\2DC\3\2\2\2EF\3\2\2\2FD\3\2\2\2FG\3\2\2\2G\f\3\2\2\2HJ"+
		"\t\3\2\2IH\3\2\2\2JK\3\2\2\2KI\3\2\2\2KL\3\2\2\2L\16\3\2\2\2MN\7-\2\2"+
		"N\20\3\2\2\2OP\7/\2\2P\22\3\2\2\2QR\7,\2\2R\24\3\2\2\2ST\7\61\2\2T\26"+
		"\3\2\2\2UV\7`\2\2V\30\3\2\2\2WX\7^\2\2XY\7u\2\2YZ\7s\2\2Z[\7t\2\2[\\\7"+
		"v\2\2\\\32\3\2\2\2]^\7^\2\2^_\7h\2\2_`\7t\2\2`a\7c\2\2ab\7e\2\2b\34\3"+
		"\2\2\2cd\7a\2\2d\36\3\2\2\2ef\7^\2\2fg\7n\2\2gh\7k\2\2hi\7o\2\2ij\7a\2"+
		"\2j \3\2\2\2kl\7^\2\2lm\7u\2\2mn\7w\2\2no\7o\2\2o\"\3\2\2\2pq\7^\2\2q"+
		"r\7r\2\2rs\7t\2\2st\7q\2\2tu\7f\2\2u$\3\2\2\2vw\7^\2\2wx\7k\2\2xy\7p\2"+
		"\2yz\7v\2\2z&\3\2\2\2{|\7}\2\2|(\3\2\2\2}~\7\177\2\2~*\3\2\2\2\177\u0080"+
		"\7*\2\2\u0080,\3\2\2\2\u0081\u0082\7+\2\2\u0082.\3\2\2\2\u0083\u0084\7"+
		"^\2\2\u0084\u0085\7t\2\2\u0085\u0086\7k\2\2\u0086\u0087\7i\2\2\u0087\u0088"+
		"\7j\2\2\u0088\u0089\7v\2\2\u0089\u008a\7c\2\2\u008a\u008b\7t\2\2\u008b"+
		"\u008c\7t\2\2\u008c\u008d\7q\2\2\u008d\u008e\7y\2\2\u008e\60\3\2\2\2\u008f"+
		"\u0090\7^\2\2\u0090\u0091\7u\2\2\u0091\u0092\7k\2\2\u0092\u0093\7p\2\2"+
		"\u0093\62\3\2\2\2\u0094\u0095\7^\2\2\u0095\u0096\7e\2\2\u0096\u0097\7"+
		"q\2\2\u0097\u0098\7u\2\2\u0098\64\3\2\2\2\u0099\u009a\7^\2\2\u009a\u009b"+
		"\7v\2\2\u009b\u009c\7i\2\2\u009c\66\3\2\2\2\u009d\u009e\7^\2\2\u009e\u009f"+
		"\7e\2\2\u009f\u00a0\7v\2\2\u00a0\u00a1\7i\2\2\u00a18\3\2\2\2\u00a2\u00a3"+
		"\7^\2\2\u00a3\u00a4\7.\2\2\u00a4\u00a5\7\"\2\2\u00a5\u00a6\7^\2\2\u00a6"+
		"\u00a7\7o\2\2\u00a7\u00a8\7c\2\2\u00a8\u00a9\7v\2\2\u00a9\u00aa\7j\2\2"+
		"\u00aa\u00ab\7t\2\2\u00ab\u00ac\7o\2\2\u00ac:\3\2\2\2\6\2DFK\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}