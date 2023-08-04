// Generated from java-escape by ANTLR 4.11.1
package org.ehrbase.aql.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class AqlParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		EHR=1, AND=2, OR=3, XOR=4, NOT=5, IN=6, MATCHES=7, TERMINOLOGY=8, LIKE=9, 
		ILIKE=10, SIMILARTO=11, SELECT=12, TOP=13, FORWARD=14, BACKWARD=15, AS=16, 
		CONTAINS=17, WHERE=18, ORDERBY=19, OFFSET=20, LIMIT=21, FROM=22, DESCENDING=23, 
		ASCENDING=24, DESC=25, ASC=26, EXISTS=27, VERSION=28, VERSIONED_OBJECT=29, 
		ALL_VERSIONS=30, LATEST_VERSION=31, DISTINCT=32, JOINON=33, ANY=34, ALL=35, 
		SOME=36, BETWEEN=37, IS=38, NULL=39, UNKNOWN=40, TRUE=41, FALSE=42, PERSON=43, 
		AGENT=44, ORGANISATION=45, GROUP=46, FUNCTION_IDENTIFIER=47, CAST_FUNCTION_IDENTIFIER=48, 
		EXTENSION_IDENTIFIER=49, BOOLEAN=50, NODEID=51, ARCHETYPEID=52, IDENTIFIER=53, 
		DEMOGRAPHIC=54, INTEGER=55, FLOAT=56, REAL=57, DATE=58, PARAMETER=59, 
		UNIQUEID=60, COMPARABLEOPERATOR=61, URIVALUE=62, REGEXPATTERN=63, STRING=64, 
		EXP_STRING=65, SLASH=66, COMMA=67, SEMICOLON=68, OPEN_BRACKET=69, CLOSE_BRACKET=70, 
		OPEN_PAR=71, CLOSE_PAR=72, OPEN_CURLY=73, CLOSE_CURLY=74, ARITHMETIC_BINOP=75, 
		COUNT=76, AVG=77, BOOL_AND=78, BOOL_OR=79, EVERY=80, MAX=81, MIN=82, SUM=83, 
		SUBSTR=84, STRPOS=85, SPLIT_PART=86, BTRIM=87, CONCAT=88, CONCAT_WS=89, 
		DECODE=90, ENCODE=91, FORMAT=92, INITCAP=93, LEFT=94, LENGTH=95, LPAD=96, 
		LTRIM=97, REGEXP_MATCH=98, REGEXP_REPLACE=99, REGEXP_SPLIT_TO_ARRAY=100, 
		REGEXP_SPLIT_TO_TABLE=101, REPEAT=102, REPLACE=103, REVERSE=104, RIGHT=105, 
		RPAD=106, RTRIM=107, TRANSLATE=108, CORR=109, COVAR_POP=110, COVAR_SAMP=111, 
		REGR_AVGX=112, REGR_AVGY=113, REGR_COUNT=114, REGR_INTERCEPT=115, REGR_R2=116, 
		REGR_SLOPE=117, REGR_SXX=118, REGR_SXY=119, REGR_SYY=120, STDDEV=121, 
		STDDEV_POP=122, STDDEV_SAMP=123, VARIANCE=124, VAR_POP=125, VAR_SAMP=126, 
		RAW_COMPOSITION_ENCODE=127, CAST=128, NOW=129, AGE=130, CURRENT_TIME=131, 
		CURRENT_DATE=132, WS=133;
	public static final int
		RULE_query = 0, RULE_queryExpr = 1, RULE_select = 2, RULE_topExpr = 3, 
		RULE_function = 4, RULE_castFunction = 5, RULE_extension = 6, RULE_where = 7, 
		RULE_orderBy = 8, RULE_limit = 9, RULE_offset = 10, RULE_orderBySeq = 11, 
		RULE_orderByExpr = 12, RULE_selectExpr = 13, RULE_stdExpression = 14, 
		RULE_from = 15, RULE_fromEHR = 16, RULE_fromForeignData = 17, RULE_fromExpr = 18, 
		RULE_containsExpression = 19, RULE_containExpressionBool = 20, RULE_contains = 21, 
		RULE_identifiedExpr = 22, RULE_identifiedEquality = 23, RULE_identifiedOperand = 24, 
		RULE_identifiedPath = 25, RULE_predicate = 26, RULE_nodePredicateOr = 27, 
		RULE_nodePredicateAnd = 28, RULE_nodePredicateComparable = 29, RULE_nodePredicateRegEx = 30, 
		RULE_matchesOperand = 31, RULE_valueListItems = 32, RULE_versionpredicate = 33, 
		RULE_versionpredicateOptions = 34, RULE_standardPredicate = 35, RULE_joinPredicate = 36, 
		RULE_predicateExpr = 37, RULE_predicateAnd = 38, RULE_predicateEquality = 39, 
		RULE_predicateOperand = 40, RULE_operand = 41, RULE_invokeOperand = 42, 
		RULE_invokeExpr = 43, RULE_objectPath = 44, RULE_pathPart = 45, RULE_classExpr = 46, 
		RULE_simpleClassExpr = 47, RULE_archetypedClassExpr = 48, RULE_versionedClassExpr = 49, 
		RULE_versionClassExpr = 50;
	private static String[] makeRuleNames() {
		return new String[] {
			"query", "queryExpr", "select", "topExpr", "function", "castFunction", 
			"extension", "where", "orderBy", "limit", "offset", "orderBySeq", "orderByExpr", 
			"selectExpr", "stdExpression", "from", "fromEHR", "fromForeignData", 
			"fromExpr", "containsExpression", "containExpressionBool", "contains", 
			"identifiedExpr", "identifiedEquality", "identifiedOperand", "identifiedPath", 
			"predicate", "nodePredicateOr", "nodePredicateAnd", "nodePredicateComparable", 
			"nodePredicateRegEx", "matchesOperand", "valueListItems", "versionpredicate", 
			"versionpredicateOptions", "standardPredicate", "joinPredicate", "predicateExpr", 
			"predicateAnd", "predicateEquality", "predicateOperand", "operand", "invokeOperand", 
			"invokeExpr", "objectPath", "pathPart", "classExpr", "simpleClassExpr", 
			"archetypedClassExpr", "versionedClassExpr", "versionClassExpr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "'/'", "','", "';'", "'['", "']'", 
			"'('", "')'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "EHR", "AND", "OR", "XOR", "NOT", "IN", "MATCHES", "TERMINOLOGY", 
			"LIKE", "ILIKE", "SIMILARTO", "SELECT", "TOP", "FORWARD", "BACKWARD", 
			"AS", "CONTAINS", "WHERE", "ORDERBY", "OFFSET", "LIMIT", "FROM", "DESCENDING", 
			"ASCENDING", "DESC", "ASC", "EXISTS", "VERSION", "VERSIONED_OBJECT", 
			"ALL_VERSIONS", "LATEST_VERSION", "DISTINCT", "JOINON", "ANY", "ALL", 
			"SOME", "BETWEEN", "IS", "NULL", "UNKNOWN", "TRUE", "FALSE", "PERSON", 
			"AGENT", "ORGANISATION", "GROUP", "FUNCTION_IDENTIFIER", "CAST_FUNCTION_IDENTIFIER", 
			"EXTENSION_IDENTIFIER", "BOOLEAN", "NODEID", "ARCHETYPEID", "IDENTIFIER", 
			"DEMOGRAPHIC", "INTEGER", "FLOAT", "REAL", "DATE", "PARAMETER", "UNIQUEID", 
			"COMPARABLEOPERATOR", "URIVALUE", "REGEXPATTERN", "STRING", "EXP_STRING", 
			"SLASH", "COMMA", "SEMICOLON", "OPEN_BRACKET", "CLOSE_BRACKET", "OPEN_PAR", 
			"CLOSE_PAR", "OPEN_CURLY", "CLOSE_CURLY", "ARITHMETIC_BINOP", "COUNT", 
			"AVG", "BOOL_AND", "BOOL_OR", "EVERY", "MAX", "MIN", "SUM", "SUBSTR", 
			"STRPOS", "SPLIT_PART", "BTRIM", "CONCAT", "CONCAT_WS", "DECODE", "ENCODE", 
			"FORMAT", "INITCAP", "LEFT", "LENGTH", "LPAD", "LTRIM", "REGEXP_MATCH", 
			"REGEXP_REPLACE", "REGEXP_SPLIT_TO_ARRAY", "REGEXP_SPLIT_TO_TABLE", "REPEAT", 
			"REPLACE", "REVERSE", "RIGHT", "RPAD", "RTRIM", "TRANSLATE", "CORR", 
			"COVAR_POP", "COVAR_SAMP", "REGR_AVGX", "REGR_AVGY", "REGR_COUNT", "REGR_INTERCEPT", 
			"REGR_R2", "REGR_SLOPE", "REGR_SXX", "REGR_SXY", "REGR_SYY", "STDDEV", 
			"STDDEV_POP", "STDDEV_SAMP", "VARIANCE", "VAR_POP", "VAR_SAMP", "RAW_COMPOSITION_ENCODE", 
			"CAST", "NOW", "AGE", "CURRENT_TIME", "CURRENT_DATE", "WS"
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
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AqlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QueryContext extends ParserRuleContext {
		public QueryExprContext queryExpr() {
			return getRuleContext(QueryExprContext.class,0);
		}
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).enterQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).exitQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AqlVisitor ) return ((AqlVisitor<? extends T>)visitor).visitQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_query);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			queryExpr();
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
	public static class QueryExprContext extends ParserRuleContext {
		public SelectContext select() {
			return getRuleContext(SelectContext.class,0);
		}
		public FromContext from() {
			return getRuleContext(FromContext.class,0);
		}
		public TerminalNode EOF() { return getToken(AqlParser.EOF, 0); }
		public WhereContext where() {
			return getRuleContext(WhereContext.class,0);
		}
		public OrderByContext orderBy() {
			return getRuleContext(OrderByContext.class,0);
		}
		public LimitContext limit() {
			return getRuleContext(LimitContext.class,0);
		}
		public OffsetContext offset() {
			return getRuleContext(OffsetContext.class,0);
		}
		public QueryExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).enterQueryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).exitQueryExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AqlVisitor ) return ((AqlVisitor<? extends T>)visitor).visitQueryExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryExprContext queryExpr() throws RecognitionException {
		QueryExprContext _localctx = new QueryExprContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_queryExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			select();
			setState(105);
			from();
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(106);
				where();
				}
			}

			setState(123);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ORDERBY:
				{
				setState(109);
				orderBy();
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIMIT) {
					{
					setState(110);
					limit();
					setState(112);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==OFFSET) {
						{
						setState(111);
						offset();
						}
					}

					}
				}

				}
				break;
			case LIMIT:
				{
				{
				setState(116);
				limit();
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OFFSET) {
					{
					setState(117);
					offset();
					}
				}

				}
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ORDERBY) {
					{
					setState(120);
					orderBy();
					}
				}

				}
				break;
			case EOF:
				break;
			default:
				break;
			}
			setState(125);
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
	public static class SelectContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(AqlParser.SELECT, 0); }
		public SelectExprContext selectExpr() {
			return getRuleContext(SelectExprContext.class,0);
		}
		public TopExprContext topExpr() {
			return getRuleContext(TopExprContext.class,0);
		}
		public SelectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).enterSelect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).exitSelect(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AqlVisitor ) return ((AqlVisitor<? extends T>)visitor).visitSelect(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectContext select() throws RecognitionException {
		SelectContext _localctx = new SelectContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_select);
		try {
			setState(133);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				match(SELECT);
				setState(128);
				selectExpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(129);
				match(SELECT);
				setState(130);
				topExpr();
				setState(131);
				selectExpr();
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

	@SuppressWarnings("CheckReturnValue")
	public static class TopExprContext extends ParserRuleContext {
		public TerminalNode TOP() { return getToken(AqlParser.TOP, 0); }
		public TerminalNode INTEGER() { return getToken(AqlParser.INTEGER, 0); }
		public TerminalNode BACKWARD() { return getToken(AqlParser.BACKWARD, 0); }
		public TerminalNode FORWARD() { return getToken(AqlParser.FORWARD, 0); }
		public TopExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_topExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).enterTopExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).exitTopExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AqlVisitor ) return ((AqlVisitor<? extends T>)visitor).visitTopExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TopExprContext topExpr() throws RecognitionException {
		TopExprContext _localctx = new TopExprContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_topExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(TOP);
			setState(136);
			match(INTEGER);
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FORWARD || _la==BACKWARD) {
				{
				setState(137);
				_la = _input.LA(1);
				if ( !(_la==FORWARD || _la==BACKWARD) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode FUNCTION_IDENTIFIER() { return getToken(AqlParser.FUNCTION_IDENTIFIER, 0); }
		public TerminalNode OPEN_PAR() { return getToken(AqlParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(AqlParser.CLOSE_PAR, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(AqlParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AqlParser.IDENTIFIER, i);
		}
		public List<IdentifiedPathContext> identifiedPath() {
			return getRuleContexts(IdentifiedPathContext.class);
		}
		public IdentifiedPathContext identifiedPath(int i) {
			return getRuleContext(IdentifiedPathContext.class,i);
		}
		public List<OperandContext> operand() {
			return getRuleContexts(OperandContext.class);
		}
		public OperandContext operand(int i) {
			return getRuleContext(OperandContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AqlParser.COMMA, i);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AqlVisitor ) return ((AqlVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(FUNCTION_IDENTIFIER);
			setState(141);
			match(OPEN_PAR);
			setState(146);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(142);
				match(IDENTIFIER);
				}
				break;
			case 2:
				{
				setState(143);
				identifiedPath();
				}
				break;
			case 3:
				{
				setState(144);
				operand();
				}
				break;
			case 4:
				{
				}
				break;
			}
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(148);
				match(COMMA);
				setState(152);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(149);
					match(IDENTIFIER);
					}
					break;
				case 2:
					{
					setState(150);
					identifiedPath();
					}
					break;
				case 3:
					{
					setState(151);
					operand();
					}
					break;
				}
				}
				}
				setState(158);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(159);
			match(CLOSE_PAR);
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
	public static class CastFunctionContext extends ParserRuleContext {
		public TerminalNode CAST_FUNCTION_IDENTIFIER() { return getToken(AqlParser.CAST_FUNCTION_IDENTIFIER, 0); }
		public TerminalNode OPEN_PAR() { return getToken(AqlParser.OPEN_PAR, 0); }
		public TerminalNode AS() { return getToken(AqlParser.AS, 0); }
		public TerminalNode STRING() { return getToken(AqlParser.STRING, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(AqlParser.CLOSE_PAR, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AqlParser.IDENTIFIER, 0); }
		public IdentifiedPathContext identifiedPath() {
			return getRuleContext(IdentifiedPathContext.class,0);
		}
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public CastFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).enterCastFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).exitCastFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AqlVisitor ) return ((AqlVisitor<? extends T>)visitor).visitCastFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CastFunctionContext castFunction() throws RecognitionException {
		CastFunctionContext _localctx = new CastFunctionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_castFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			match(CAST_FUNCTION_IDENTIFIER);
			setState(162);
			match(OPEN_PAR);
			setState(166);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(163);
				match(IDENTIFIER);
				}
				break;
			case 2:
				{
				setState(164);
				identifiedPath();
				}
				break;
			case 3:
				{
				setState(165);
				operand();
				}
				break;
			}
			setState(168);
			match(AS);
			setState(169);
			match(STRING);
			setState(170);
			match(CLOSE_PAR);
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
	public static class ExtensionContext extends ParserRuleContext {
		public TerminalNode EXTENSION_IDENTIFIER() { return getToken(AqlParser.EXTENSION_IDENTIFIER, 0); }
		public TerminalNode OPEN_PAR() { return getToken(AqlParser.OPEN_PAR, 0); }
		public List<TerminalNode> STRING() { return getTokens(AqlParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(AqlParser.STRING, i);
		}
		public TerminalNode COMMA() { return getToken(AqlParser.COMMA, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(AqlParser.CLOSE_PAR, 0); }
		public ExtensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extension; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).enterExtension(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).exitExtension(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AqlVisitor ) return ((AqlVisitor<? extends T>)visitor).visitExtension(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExtensionContext extension() throws RecognitionException {
		ExtensionContext _localctx = new ExtensionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_extension);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(EXTENSION_IDENTIFIER);
			setState(173);
			match(OPEN_PAR);
			setState(174);
			match(STRING);
			setState(175);
			match(COMMA);
			setState(176);
			match(STRING);
			setState(177);
			match(CLOSE_PAR);
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
	public static class WhereContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(AqlParser.WHERE, 0); }
		public IdentifiedExprContext identifiedExpr() {
			return getRuleContext(IdentifiedExprContext.class,0);
		}
		public WhereContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_where; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).enterWhere(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).exitWhere(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AqlVisitor ) return ((AqlVisitor<? extends T>)visitor).visitWhere(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhereContext where() throws RecognitionException {
		WhereContext _localctx = new WhereContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_where);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(WHERE);
			setState(180);
			identifiedExpr();
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
	public static class OrderByContext extends ParserRuleContext {
		public TerminalNode ORDERBY() { return getToken(AqlParser.ORDERBY, 0); }
		public OrderBySeqContext orderBySeq() {
			return getRuleContext(OrderBySeqContext.class,0);
		}
		public OrderByContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderBy; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).enterOrderBy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).exitOrderBy(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AqlVisitor ) return ((AqlVisitor<? extends T>)visitor).visitOrderBy(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderByContext orderBy() throws RecognitionException {
		OrderByContext _localctx = new OrderByContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_orderBy);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			match(ORDERBY);
			setState(183);
			orderBySeq();
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
	public static class LimitContext extends ParserRuleContext {
		public TerminalNode LIMIT() { return getToken(AqlParser.LIMIT, 0); }
		public TerminalNode INTEGER() { return getToken(AqlParser.INTEGER, 0); }
		public LimitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).enterLimit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).exitLimit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AqlVisitor ) return ((AqlVisitor<? extends T>)visitor).visitLimit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LimitContext limit() throws RecognitionException {
		LimitContext _localctx = new LimitContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_limit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(LIMIT);
			setState(186);
			match(INTEGER);
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
	public static class OffsetContext extends ParserRuleContext {
		public TerminalNode OFFSET() { return getToken(AqlParser.OFFSET, 0); }
		public TerminalNode INTEGER() { return getToken(AqlParser.INTEGER, 0); }
		public OffsetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_offset; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).enterOffset(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).exitOffset(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AqlVisitor ) return ((AqlVisitor<? extends T>)visitor).visitOffset(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OffsetContext offset() throws RecognitionException {
		OffsetContext _localctx = new OffsetContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_offset);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(OFFSET);
			setState(189);
			match(INTEGER);
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
	public static class OrderBySeqContext extends ParserRuleContext {
		public OrderByExprContext orderByExpr() {
			return getRuleContext(OrderByExprContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(AqlParser.COMMA, 0); }
		public OrderBySeqContext orderBySeq() {
			return getRuleContext(OrderBySeqContext.class,0);
		}
		public OrderBySeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderBySeq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).enterOrderBySeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).exitOrderBySeq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AqlVisitor ) return ((AqlVisitor<? extends T>)visitor).visitOrderBySeq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderBySeqContext orderBySeq() throws RecognitionException {
		OrderBySeqContext _localctx = new OrderBySeqContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_orderBySeq);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			orderByExpr();
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(192);
				match(COMMA);
				setState(193);
				orderBySeq();
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

	@SuppressWarnings("CheckReturnValue")
	public static class OrderByExprContext extends ParserRuleContext {
		public IdentifiedPathContext identifiedPath() {
			return getRuleContext(IdentifiedPathContext.class,0);
		}
		public TerminalNode DESCENDING() { return getToken(AqlParser.DESCENDING, 0); }
		public TerminalNode ASCENDING() { return getToken(AqlParser.ASCENDING, 0); }
		public TerminalNode DESC() { return getToken(AqlParser.DESC, 0); }
		public TerminalNode ASC() { return getToken(AqlParser.ASC, 0); }
		public OrderByExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderByExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).enterOrderByExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).exitOrderByExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AqlVisitor ) return ((AqlVisitor<? extends T>)visitor).visitOrderByExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderByExprContext orderByExpr() throws RecognitionException {
		OrderByExprContext _localctx = new OrderByExprContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_orderByExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			identifiedPath();
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 125829120L) != 0) {
				{
				setState(197);
				_la = _input.LA(1);
				if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 125829120L) != 0) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class SelectExprContext extends ParserRuleContext {
		public IdentifiedPathContext identifiedPath() {
			return getRuleContext(IdentifiedPathContext.class,0);
		}
		public TerminalNode DISTINCT() { return getToken(AqlParser.DISTINCT, 0); }
		public TerminalNode AS() { return getToken(AqlParser.AS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AqlParser.IDENTIFIER, 0); }
		public TerminalNode COMMA() { return getToken(AqlParser.COMMA, 0); }
		public SelectExprContext selectExpr() {
			return getRuleContext(SelectExprContext.class,0);
		}
		public StdExpressionContext stdExpression() {
			return getRuleContext(StdExpressionContext.class,0);
		}
		public SelectExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).enterSelectExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).exitSelectExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AqlVisitor ) return ((AqlVisitor<? extends T>)visitor).visitSelectExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectExprContext selectExpr() throws RecognitionException {
		SelectExprContext _localctx = new SelectExprContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_selectExpr);
		int _la;
		try {
			setState(224);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DISTINCT) {
					{
					setState(200);
					match(DISTINCT);
					}
				}

				setState(203);
				identifiedPath();
				setState(206);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(204);
					match(AS);
					setState(205);
					match(IDENTIFIER);
					}
				}

				setState(210);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(208);
					match(COMMA);
					setState(209);
					selectExpr();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(213);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DISTINCT) {
					{
					setState(212);
					match(DISTINCT);
					}
				}

				setState(215);
				stdExpression();
				setState(218);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(216);
					match(AS);
					setState(217);
					match(IDENTIFIER);
					}
				}

				setState(222);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(220);
					match(COMMA);
					setState(221);
					selectExpr();
					}
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

	@SuppressWarnings("CheckReturnValue")
	public static class StdExpressionContext extends ParserRuleContext {
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public CastFunctionContext castFunction() {
			return getRuleContext(CastFunctionContext.class,0);
		}
		public ExtensionContext extension() {
			return getRuleContext(ExtensionContext.class,0);
		}
		public TerminalNode INTEGER() { return getToken(AqlParser.INTEGER, 0); }
		public TerminalNode STRING() { return getToken(AqlParser.STRING, 0); }
		public TerminalNode FLOAT() { return getToken(AqlParser.FLOAT, 0); }
		public TerminalNode REAL() { return getToken(AqlParser.REAL, 0); }
		public TerminalNode DATE() { return getToken(AqlParser.DATE, 0); }
		public TerminalNode PARAMETER() { return getToken(AqlParser.PARAMETER, 0); }
		public TerminalNode BOOLEAN() { return getToken(AqlParser.BOOLEAN, 0); }
		public TerminalNode TRUE() { return getToken(AqlParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(AqlParser.FALSE, 0); }
		public TerminalNode NULL() { return getToken(AqlParser.NULL, 0); }
		public TerminalNode UNKNOWN() { return getToken(AqlParser.UNKNOWN, 0); }
		public StdExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stdExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).enterStdExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).exitStdExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AqlVisitor ) return ((AqlVisitor<? extends T>)visitor).visitStdExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StdExpressionContext stdExpression() throws RecognitionException {
		StdExpressionContext _localctx = new StdExpressionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_stdExpression);
		try {
			setState(240);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUNCTION_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(226);
				function();
				}
				break;
			case CAST_FUNCTION_IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(227);
				castFunction();
				}
				break;
			case EXTENSION_IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
				setState(228);
				extension();
				}
				break;
			case INTEGER:
				enterOuterAlt(_localctx, 4);
				{
				setState(229);
				match(INTEGER);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 5);
				{
				setState(230);
				match(STRING);
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 6);
				{
				setState(231);
				match(FLOAT);
				}
				break;
			case REAL:
				enterOuterAlt(_localctx, 7);
				{
				setState(232);
				match(REAL);
				}
				break;
			case DATE:
				enterOuterAlt(_localctx, 8);
				{
				setState(233);
				match(DATE);
				}
				break;
			case PARAMETER:
				enterOuterAlt(_localctx, 9);
				{
				setState(234);
				match(PARAMETER);
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 10);
				{
				setState(235);
				match(BOOLEAN);
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 11);
				{
				setState(236);
				match(TRUE);
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 12);
				{
				setState(237);
				match(FALSE);
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 13);
				{
				setState(238);
				match(NULL);
				}
				break;
			case UNKNOWN:
				enterOuterAlt(_localctx, 14);
				{
				setState(239);
				match(UNKNOWN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FromContext extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(AqlParser.FROM, 0); }
		public FromExprContext fromExpr() {
			return getRuleContext(FromExprContext.class,0);
		}
		public FromEHRContext fromEHR() {
			return getRuleContext(FromEHRContext.class,0);
		}
		public TerminalNode CONTAINS() { return getToken(AqlParser.CONTAINS, 0); }
		public ContainsExpressionContext containsExpression() {
			return getRuleContext(ContainsExpressionContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(AqlParser.COMMA, 0); }
		public List<FromForeignDataContext> fromForeignData() {
			return getRuleContexts(FromForeignDataContext.class);
		}
		public FromForeignDataContext fromForeignData(int i) {
			return getRuleContext(FromForeignDataContext.class,i);
		}
		public FromContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).enterFrom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).exitFrom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AqlVisitor ) return ((AqlVisitor<? extends T>)visitor).visitFrom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FromContext from() throws RecognitionException {
		FromContext _localctx = new FromContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_from);
		int _la;
		try {
			setState(260);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(242);
				match(FROM);
				setState(243);
				fromExpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(244);
				match(FROM);
				setState(245);
				fromEHR();
				setState(248);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CONTAINS) {
					{
					setState(246);
					match(CONTAINS);
					setState(247);
					containsExpression();
					}
				}

				setState(252);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(250);
					match(COMMA);
					setState(251);
					fromForeignData();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(254);
				match(FROM);
				setState(255);
				fromForeignData();
				setState(258);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(256);
					match(COMMA);
					setState(257);
					fromForeignData();
					}
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

	@SuppressWarnings("CheckReturnValue")
	public static class FromEHRContext extends ParserRuleContext {
		public TerminalNode EHR() { return getToken(AqlParser.EHR, 0); }
		public StandardPredicateContext standardPredicate() {
			return getRuleContext(StandardPredicateContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(AqlParser.IDENTIFIER, 0); }
		public FromEHRContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromEHR; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).enterFromEHR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).exitFromEHR(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AqlVisitor ) return ((AqlVisitor<? extends T>)visitor).visitFromEHR(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FromEHRContext fromEHR() throws RecognitionException {
		FromEHRContext _localctx = new FromEHRContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_fromEHR);
		try {
			setState(269);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(262);
				match(EHR);
				setState(263);
				standardPredicate();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(264);
				match(EHR);
				setState(265);
				match(IDENTIFIER);
				setState(266);
				standardPredicate();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(267);
				match(EHR);
				setState(268);
				match(IDENTIFIER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FromForeignDataContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(AqlParser.IDENTIFIER, 0); }
		public JoinPredicateContext joinPredicate() {
			return getRuleContext(JoinPredicateContext.class,0);
		}
		public TerminalNode AGENT() { return getToken(AqlParser.AGENT, 0); }
		public TerminalNode GROUP() { return getToken(AqlParser.GROUP, 0); }
		public TerminalNode ORGANISATION() { return getToken(AqlParser.ORGANISATION, 0); }
		public TerminalNode PERSON() { return getToken(AqlParser.PERSON, 0); }
		public FromForeignDataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromForeignData; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).enterFromForeignData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).exitFromForeignData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AqlVisitor ) return ((AqlVisitor<? extends T>)visitor).visitFromForeignData(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FromForeignDataContext fromForeignData() throws RecognitionException {
		FromForeignDataContext _localctx = new FromForeignDataContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_fromForeignData);
		int _la;
		try {
			setState(276);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(271);
				_la = _input.LA(1);
				if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 131941395333120L) != 0) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(272);
				match(IDENTIFIER);
				setState(273);
				joinPredicate();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(274);
				_la = _input.LA(1);
				if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 131941395333120L) != 0) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(275);
				match(IDENTIFIER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FromExprContext extends ParserRuleContext {
		public ContainsExpressionContext containsExpression() {
			return getRuleContext(ContainsExpressionContext.class,0);
		}
		public FromExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).enterFromExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).exitFromExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AqlVisitor ) return ((AqlVisitor<? extends T>)visitor).visitFromExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FromExprContext fromExpr() throws RecognitionException {
		FromExprContext _localctx = new FromExprContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_fromExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			containsExpression();
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
	public static class ContainsExpressionContext extends ParserRuleContext {
		public ContainExpressionBoolContext containExpressionBool() {
			return getRuleContext(ContainExpressionBoolContext.class,0);
		}
		public ContainsExpressionContext containsExpression() {
			return getRuleContext(ContainsExpressionContext.class,0);
		}
		public TerminalNode AND() { return getToken(AqlParser.AND, 0); }
		public TerminalNode OR() { return getToken(AqlParser.OR, 0); }
		public TerminalNode XOR() { return getToken(AqlParser.XOR, 0); }
		public ContainsExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_containsExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).enterContainsExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).exitContainsExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AqlVisitor ) return ((AqlVisitor<? extends T>)visitor).visitContainsExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContainsExpressionContext containsExpression() throws RecognitionException {
		ContainsExpressionContext _localctx = new ContainsExpressionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_containsExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			containExpressionBool();
			setState(283);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(281);
				_la = _input.LA(1);
				if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 28L) != 0) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(282);
				containsExpression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ContainExpressionBoolContext extends ParserRuleContext {
		public ContainsContext contains() {
			return getRuleContext(ContainsContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(AqlParser.OPEN_PAR, 0); }
		public ContainsExpressionContext containsExpression() {
			return getRuleContext(ContainsExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(AqlParser.CLOSE_PAR, 0); }
		public ContainExpressionBoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_containExpressionBool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).enterContainExpressionBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).exitContainExpressionBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AqlVisitor ) return ((AqlVisitor<? extends T>)visitor).visitContainExpressionBool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContainExpressionBoolContext containExpressionBool() throws RecognitionException {
		ContainExpressionBoolContext _localctx = new ContainExpressionBoolContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_containExpressionBool);
		try {
			setState(290);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VERSION:
			case VERSIONED_OBJECT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(285);
				contains();
				}
				break;
			case OPEN_PAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(286);
				match(OPEN_PAR);
				setState(287);
				containsExpression();
				setState(288);
				match(CLOSE_PAR);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ContainsContext extends ParserRuleContext {
		public SimpleClassExprContext simpleClassExpr() {
			return getRuleContext(SimpleClassExprContext.class,0);
		}
		public TerminalNode CONTAINS() { return getToken(AqlParser.CONTAINS, 0); }
		public ContainsExpressionContext containsExpression() {
			return getRuleContext(ContainsExpressionContext.class,0);
		}
		public ContainsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contains; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).enterContains(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).exitContains(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AqlVisitor ) return ((AqlVisitor<? extends T>)visitor).visitContains(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContainsContext contains() throws RecognitionException {
		ContainsContext _localctx = new ContainsContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_contains);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			simpleClassExpr();
			setState(295);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONTAINS) {
				{
				setState(293);
				match(CONTAINS);
				setState(294);
				containsExpression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class IdentifiedExprContext extends ParserRuleContext {
		public List<IdentifiedEqualityContext> identifiedEquality() {
			return getRuleContexts(IdentifiedEqualityContext.class);
		}
		public IdentifiedEqualityContext identifiedEquality(int i) {
			return getRuleContext(IdentifiedEqualityContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(AqlParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(AqlParser.OR, i);
		}
		public List<TerminalNode> XOR() { return getTokens(AqlParser.XOR); }
		public TerminalNode XOR(int i) {
			return getToken(AqlParser.XOR, i);
		}
		public List<TerminalNode> AND() { return getTokens(AqlParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(AqlParser.AND, i);
		}
		public TerminalNode OPEN_PAR() { return getToken(AqlParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(AqlParser.CLOSE_PAR, 0); }
		public IdentifiedExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifiedExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).enterIdentifiedExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).exitIdentifiedExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AqlVisitor ) return ((AqlVisitor<? extends T>)visitor).visitIdentifiedExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifiedExprContext identifiedExpr() throws RecognitionException {
		IdentifiedExprContext _localctx = new IdentifiedExprContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_identifiedExpr);
		int _la;
		try {
			int _alt;
			setState(316);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(297);
				identifiedEquality();
				setState(302);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(298);
						_la = _input.LA(1);
						if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 28L) != 0) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(299);
						identifiedEquality();
						}
						} 
					}
					setState(304);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(305);
				match(OPEN_PAR);
				setState(306);
				identifiedEquality();
				setState(311);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & 28L) != 0) {
					{
					{
					setState(307);
					_la = _input.LA(1);
					if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 28L) != 0) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(308);
					identifiedEquality();
					}
					}
					setState(313);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(314);
				match(CLOSE_PAR);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IdentifiedEqualityContext extends ParserRuleContext {
		public List<IdentifiedOperandContext> identifiedOperand() {
			return getRuleContexts(IdentifiedOperandContext.class);
		}
		public IdentifiedOperandContext identifiedOperand(int i) {
			return getRuleContext(IdentifiedOperandContext.class,i);
		}
		public TerminalNode COMPARABLEOPERATOR() { return getToken(AqlParser.COMPARABLEOPERATOR, 0); }
		public List<TerminalNode> OPEN_PAR() { return getTokens(AqlParser.OPEN_PAR); }
		public TerminalNode OPEN_PAR(int i) {
			return getToken(AqlParser.OPEN_PAR, i);
		}
		public TerminalNode NOT() { return getToken(AqlParser.NOT, 0); }
		public List<TerminalNode> CLOSE_PAR() { return getTokens(AqlParser.CLOSE_PAR); }
		public TerminalNode CLOSE_PAR(int i) {
			return getToken(AqlParser.CLOSE_PAR, i);
		}
		public TerminalNode MATCHES() { return getToken(AqlParser.MATCHES, 0); }
		public TerminalNode OPEN_CURLY() { return getToken(AqlParser.OPEN_CURLY, 0); }
		public MatchesOperandContext matchesOperand() {
			return getRuleContext(MatchesOperandContext.class,0);
		}
		public TerminalNode CLOSE_CURLY() { return getToken(AqlParser.CLOSE_CURLY, 0); }
		public TerminalNode REGEXPATTERN() { return getToken(AqlParser.REGEXPATTERN, 0); }
		public TerminalNode LIKE() { return getToken(AqlParser.LIKE, 0); }
		public TerminalNode STRING() { return getToken(AqlParser.STRING, 0); }
		public TerminalNode ILIKE() { return getToken(AqlParser.ILIKE, 0); }
		public TerminalNode SIMILARTO() { return getToken(AqlParser.SIMILARTO, 0); }
		public TerminalNode IN() { return getToken(AqlParser.IN, 0); }
		public TerminalNode ANY() { return getToken(AqlParser.ANY, 0); }
		public TerminalNode ALL() { return getToken(AqlParser.ALL, 0); }
		public TerminalNode SOME() { return getToken(AqlParser.SOME, 0); }
		public TerminalNode BETWEEN() { return getToken(AqlParser.BETWEEN, 0); }
		public TerminalNode AND() { return getToken(AqlParser.AND, 0); }
		public TerminalNode IS() { return getToken(AqlParser.IS, 0); }
		public TerminalNode NULL() { return getToken(AqlParser.NULL, 0); }
		public TerminalNode UNKNOWN() { return getToken(AqlParser.UNKNOWN, 0); }
		public TerminalNode TRUE() { return getToken(AqlParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(AqlParser.FALSE, 0); }
		public TerminalNode DISTINCT() { return getToken(AqlParser.DISTINCT, 0); }
		public TerminalNode FROM() { return getToken(AqlParser.FROM, 0); }
		public IdentifiedExprContext identifiedExpr() {
			return getRuleContext(IdentifiedExprContext.class,0);
		}
		public TerminalNode EXISTS() { return getToken(AqlParser.EXISTS, 0); }
		public IdentifiedPathContext identifiedPath() {
			return getRuleContext(IdentifiedPathContext.class,0);
		}
		public IdentifiedEqualityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifiedEquality; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).enterIdentifiedEquality(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).exitIdentifiedEquality(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AqlVisitor ) return ((AqlVisitor<? extends T>)visitor).visitIdentifiedEquality(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifiedEqualityContext identifiedEquality() throws RecognitionException {
		IdentifiedEqualityContext _localctx = new IdentifiedEqualityContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_identifiedEquality);
		int _la;
		try {
			int _alt;
			setState(621);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(321);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==OPEN_PAR) {
					{
					{
					setState(318);
					match(OPEN_PAR);
					}
					}
					setState(323);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(325);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(324);
					match(NOT);
					}
				}

				setState(327);
				identifiedOperand();
				setState(328);
				match(COMPARABLEOPERATOR);
				setState(329);
				identifiedOperand();
				setState(333);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(330);
						match(CLOSE_PAR);
						}
						} 
					}
					setState(335);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(339);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==OPEN_PAR) {
					{
					{
					setState(336);
					match(OPEN_PAR);
					}
					}
					setState(341);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(343);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(342);
					match(NOT);
					}
				}

				setState(345);
				identifiedOperand();
				setState(346);
				match(MATCHES);
				setState(347);
				match(OPEN_CURLY);
				setState(348);
				matchesOperand();
				setState(349);
				match(CLOSE_CURLY);
				setState(353);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(350);
						match(CLOSE_PAR);
						}
						} 
					}
					setState(355);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(359);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==OPEN_PAR) {
					{
					{
					setState(356);
					match(OPEN_PAR);
					}
					}
					setState(361);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(363);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(362);
					match(NOT);
					}
				}

				setState(365);
				identifiedOperand();
				setState(366);
				match(MATCHES);
				setState(367);
				match(REGEXPATTERN);
				setState(371);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(368);
						match(CLOSE_PAR);
						}
						} 
					}
					setState(373);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(377);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==OPEN_PAR) {
					{
					{
					setState(374);
					match(OPEN_PAR);
					}
					}
					setState(379);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(381);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(380);
					match(NOT);
					}
				}

				setState(383);
				identifiedOperand();
				setState(384);
				match(LIKE);
				setState(385);
				match(STRING);
				setState(389);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(386);
						match(CLOSE_PAR);
						}
						} 
					}
					setState(391);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(395);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==OPEN_PAR) {
					{
					{
					setState(392);
					match(OPEN_PAR);
					}
					}
					setState(397);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(399);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(398);
					match(NOT);
					}
				}

				setState(401);
				identifiedOperand();
				setState(402);
				match(ILIKE);
				setState(403);
				match(STRING);
				setState(407);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(404);
						match(CLOSE_PAR);
						}
						} 
					}
					setState(409);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(413);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==OPEN_PAR) {
					{
					{
					setState(410);
					match(OPEN_PAR);
					}
					}
					setState(415);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(417);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(416);
					match(NOT);
					}
				}

				setState(419);
				identifiedOperand();
				setState(420);
				match(SIMILARTO);
				setState(421);
				match(STRING);
				setState(425);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(422);
						match(CLOSE_PAR);
						}
						} 
					}
					setState(427);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(431);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==OPEN_PAR) {
					{
					{
					setState(428);
					match(OPEN_PAR);
					}
					}
					setState(433);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(434);
				identifiedOperand();
				setState(436);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(435);
					match(NOT);
					}
				}

				setState(438);
				match(IN);
				setState(439);
				match(OPEN_PAR);
				setState(442);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
				case 1:
					{
					setState(440);
					identifiedOperand();
					}
					break;
				case 2:
					{
					setState(441);
					matchesOperand();
					}
					break;
				}
				setState(444);
				match(CLOSE_PAR);
				setState(448);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(445);
						match(CLOSE_PAR);
						}
						} 
					}
					setState(450);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
				}
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(454);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==OPEN_PAR) {
					{
					{
					setState(451);
					match(OPEN_PAR);
					}
					}
					setState(456);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(458);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(457);
					match(NOT);
					}
				}

				setState(460);
				identifiedOperand();
				setState(461);
				_la = _input.LA(1);
				if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 2305843009213695488L) != 0) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(462);
				_la = _input.LA(1);
				if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 120259084288L) != 0) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(463);
				match(OPEN_PAR);
				setState(466);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
				case 1:
					{
					setState(464);
					identifiedOperand();
					}
					break;
				case 2:
					{
					setState(465);
					matchesOperand();
					}
					break;
				}
				setState(468);
				match(CLOSE_PAR);
				setState(472);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(469);
						match(CLOSE_PAR);
						}
						} 
					}
					setState(474);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
				}
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(478);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==OPEN_PAR) {
					{
					{
					setState(475);
					match(OPEN_PAR);
					}
					}
					setState(480);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(481);
				identifiedOperand();
				setState(483);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(482);
					match(NOT);
					}
				}

				setState(485);
				match(BETWEEN);
				setState(486);
				identifiedOperand();
				setState(487);
				match(AND);
				setState(488);
				identifiedOperand();
				setState(492);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(489);
						match(CLOSE_PAR);
						}
						} 
					}
					setState(494);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
				}
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(498);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==OPEN_PAR) {
					{
					{
					setState(495);
					match(OPEN_PAR);
					}
					}
					setState(500);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(501);
				identifiedOperand();
				setState(502);
				match(IS);
				setState(504);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(503);
					match(NOT);
					}
				}

				setState(506);
				match(NULL);
				setState(510);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(507);
						match(CLOSE_PAR);
						}
						} 
					}
					setState(512);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
				}
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(516);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==OPEN_PAR) {
					{
					{
					setState(513);
					match(OPEN_PAR);
					}
					}
					setState(518);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(519);
				identifiedOperand();
				setState(520);
				match(IS);
				setState(522);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(521);
					match(NOT);
					}
				}

				setState(524);
				match(UNKNOWN);
				setState(528);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(525);
						match(CLOSE_PAR);
						}
						} 
					}
					setState(530);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
				}
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(534);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==OPEN_PAR) {
					{
					{
					setState(531);
					match(OPEN_PAR);
					}
					}
					setState(536);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(537);
				identifiedOperand();
				setState(538);
				match(IS);
				setState(540);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(539);
					match(NOT);
					}
				}

				setState(542);
				_la = _input.LA(1);
				if ( !(_la==TRUE || _la==FALSE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(546);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(543);
						match(CLOSE_PAR);
						}
						} 
					}
					setState(548);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
				}
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(552);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==OPEN_PAR) {
					{
					{
					setState(549);
					match(OPEN_PAR);
					}
					}
					setState(554);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(555);
				identifiedOperand();
				setState(556);
				match(IS);
				setState(558);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(557);
					match(NOT);
					}
				}

				setState(560);
				match(DISTINCT);
				setState(561);
				match(FROM);
				setState(562);
				identifiedOperand();
				setState(566);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(563);
						match(CLOSE_PAR);
						}
						} 
					}
					setState(568);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
				}
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(572);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(569);
						match(OPEN_PAR);
						}
						} 
					}
					setState(574);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
				}
				setState(576);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(575);
					match(NOT);
					}
				}

				setState(578);
				match(OPEN_PAR);
				setState(579);
				identifiedExpr();
				setState(580);
				match(CLOSE_PAR);
				setState(584);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(581);
						match(CLOSE_PAR);
						}
						} 
					}
					setState(586);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
				}
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(590);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==OPEN_PAR) {
					{
					{
					setState(587);
					match(OPEN_PAR);
					}
					}
					setState(592);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(594);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(593);
					match(NOT);
					}
				}

				setState(596);
				match(EXISTS);
				setState(597);
				identifiedPath();
				setState(601);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(598);
						match(CLOSE_PAR);
						}
						} 
					}
					setState(603);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
				}
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(607);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==OPEN_PAR) {
					{
					{
					setState(604);
					match(OPEN_PAR);
					}
					}
					setState(609);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(611);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(610);
					match(NOT);
					}
				}

				setState(613);
				match(EXISTS);
				setState(614);
				identifiedExpr();
				setState(618);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(615);
						match(CLOSE_PAR);
						}
						} 
					}
					setState(620);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IdentifiedOperandContext extends ParserRuleContext {
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public IdentifiedPathContext identifiedPath() {
			return getRuleContext(IdentifiedPathContext.class,0);
		}
		public StdExpressionContext stdExpression() {
			return getRuleContext(StdExpressionContext.class,0);
		}
		public IdentifiedOperandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifiedOperand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).enterIdentifiedOperand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).exitIdentifiedOperand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AqlVisitor ) return ((AqlVisitor<? extends T>)visitor).visitIdentifiedOperand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifiedOperandContext identifiedOperand() throws RecognitionException {
		IdentifiedOperandContext _localctx = new IdentifiedOperandContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_identifiedOperand);
		try {
			setState(626);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(623);
				operand();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(624);
				identifiedPath();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(625);
				stdExpression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class IdentifiedPathContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(AqlParser.IDENTIFIER, 0); }
		public TerminalNode SLASH() { return getToken(AqlParser.SLASH, 0); }
		public ObjectPathContext objectPath() {
			return getRuleContext(ObjectPathContext.class,0);
		}
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public IdentifiedPathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifiedPath; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).enterIdentifiedPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).exitIdentifiedPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AqlVisitor ) return ((AqlVisitor<? extends T>)visitor).visitIdentifiedPath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifiedPathContext identifiedPath() throws RecognitionException {
		IdentifiedPathContext _localctx = new IdentifiedPathContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_identifiedPath);
		int _la;
		try {
			setState(639);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(628);
				match(IDENTIFIER);
				setState(631);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SLASH) {
					{
					setState(629);
					match(SLASH);
					setState(630);
					objectPath();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(633);
				match(IDENTIFIER);
				setState(634);
				predicate();
				setState(637);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SLASH) {
					{
					setState(635);
					match(SLASH);
					setState(636);
					objectPath();
					}
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

	@SuppressWarnings("CheckReturnValue")
	public static class PredicateContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACKET() { return getToken(AqlParser.OPEN_BRACKET, 0); }
		public NodePredicateOrContext nodePredicateOr() {
			return getRuleContext(NodePredicateOrContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(AqlParser.CLOSE_BRACKET, 0); }
		public PredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).enterPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).exitPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AqlVisitor ) return ((AqlVisitor<? extends T>)visitor).visitPredicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicateContext predicate() throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_predicate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(641);
			match(OPEN_BRACKET);
			setState(642);
			nodePredicateOr();
			setState(643);
			match(CLOSE_BRACKET);
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
	public static class NodePredicateOrContext extends ParserRuleContext {
		public List<NodePredicateAndContext> nodePredicateAnd() {
			return getRuleContexts(NodePredicateAndContext.class);
		}
		public NodePredicateAndContext nodePredicateAnd(int i) {
			return getRuleContext(NodePredicateAndContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(AqlParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(AqlParser.OR, i);
		}
		public NodePredicateOrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nodePredicateOr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).enterNodePredicateOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).exitNodePredicateOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AqlVisitor ) return ((AqlVisitor<? extends T>)visitor).visitNodePredicateOr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NodePredicateOrContext nodePredicateOr() throws RecognitionException {
		NodePredicateOrContext _localctx = new NodePredicateOrContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_nodePredicateOr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(645);
			nodePredicateAnd();
			setState(650);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(646);
				match(OR);
				setState(647);
				nodePredicateAnd();
				}
				}
				setState(652);
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

	@SuppressWarnings("CheckReturnValue")
	public static class NodePredicateAndContext extends ParserRuleContext {
		public List<NodePredicateComparableContext> nodePredicateComparable() {
			return getRuleContexts(NodePredicateComparableContext.class);
		}
		public NodePredicateComparableContext nodePredicateComparable(int i) {
			return getRuleContext(NodePredicateComparableContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(AqlParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(AqlParser.AND, i);
		}
		public NodePredicateAndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nodePredicateAnd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).enterNodePredicateAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).exitNodePredicateAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AqlVisitor ) return ((AqlVisitor<? extends T>)visitor).visitNodePredicateAnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NodePredicateAndContext nodePredicateAnd() throws RecognitionException {
		NodePredicateAndContext _localctx = new NodePredicateAndContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_nodePredicateAnd);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(653);
			nodePredicateComparable();
			setState(658);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(654);
				match(AND);
				setState(655);
				nodePredicateComparable();
				}
				}
				setState(660);
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

	@SuppressWarnings("CheckReturnValue")
	public static class NodePredicateComparableContext extends ParserRuleContext {
		public TerminalNode NODEID() { return getToken(AqlParser.NODEID, 0); }
		public TerminalNode COMMA() { return getToken(AqlParser.COMMA, 0); }
		public TerminalNode STRING() { return getToken(AqlParser.STRING, 0); }
		public List<TerminalNode> PARAMETER() { return getTokens(AqlParser.PARAMETER); }
		public TerminalNode PARAMETER(int i) {
			return getToken(AqlParser.PARAMETER, i);
		}
		public TerminalNode ARCHETYPEID() { return getToken(AqlParser.ARCHETYPEID, 0); }
		public List<PredicateOperandContext> predicateOperand() {
			return getRuleContexts(PredicateOperandContext.class);
		}
		public PredicateOperandContext predicateOperand(int i) {
			return getRuleContext(PredicateOperandContext.class,i);
		}
		public TerminalNode COMPARABLEOPERATOR() { return getToken(AqlParser.COMPARABLEOPERATOR, 0); }
		public TerminalNode MATCHES() { return getToken(AqlParser.MATCHES, 0); }
		public TerminalNode REGEXPATTERN() { return getToken(AqlParser.REGEXPATTERN, 0); }
		public NodePredicateComparableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nodePredicateComparable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).enterNodePredicateComparable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).exitNodePredicateComparable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AqlVisitor ) return ((AqlVisitor<? extends T>)visitor).visitNodePredicateComparable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NodePredicateComparableContext nodePredicateComparable() throws RecognitionException {
		NodePredicateComparableContext _localctx = new NodePredicateComparableContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_nodePredicateComparable);
		int _la;
		try {
			setState(684);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(661);
				match(NODEID);
				setState(664);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(662);
					match(COMMA);
					setState(663);
					_la = _input.LA(1);
					if ( !(_la==PARAMETER || _la==STRING) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(666);
				match(ARCHETYPEID);
				setState(669);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(667);
					match(COMMA);
					setState(668);
					_la = _input.LA(1);
					if ( !(_la==PARAMETER || _la==STRING) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(671);
				predicateOperand();
				setState(676);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case COMPARABLEOPERATOR:
					{
					{
					setState(672);
					match(COMPARABLEOPERATOR);
					setState(673);
					predicateOperand();
					}
					}
					break;
				case MATCHES:
					{
					{
					setState(674);
					match(MATCHES);
					setState(675);
					match(REGEXPATTERN);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(678);
				match(REGEXPATTERN);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(679);
				match(PARAMETER);
				setState(682);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(680);
					match(COMMA);
					setState(681);
					_la = _input.LA(1);
					if ( !(_la==PARAMETER || _la==STRING) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
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

	@SuppressWarnings("CheckReturnValue")
	public static class NodePredicateRegExContext extends ParserRuleContext {
		public TerminalNode REGEXPATTERN() { return getToken(AqlParser.REGEXPATTERN, 0); }
		public PredicateOperandContext predicateOperand() {
			return getRuleContext(PredicateOperandContext.class,0);
		}
		public TerminalNode MATCHES() { return getToken(AqlParser.MATCHES, 0); }
		public NodePredicateRegExContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nodePredicateRegEx; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).enterNodePredicateRegEx(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).exitNodePredicateRegEx(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AqlVisitor ) return ((AqlVisitor<? extends T>)visitor).visitNodePredicateRegEx(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NodePredicateRegExContext nodePredicateRegEx() throws RecognitionException {
		NodePredicateRegExContext _localctx = new NodePredicateRegExContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_nodePredicateRegEx);
		try {
			setState(691);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case REGEXPATTERN:
				enterOuterAlt(_localctx, 1);
				{
				setState(686);
				match(REGEXPATTERN);
				}
				break;
			case TERMINOLOGY:
			case NULL:
			case UNKNOWN:
			case TRUE:
			case FALSE:
			case FUNCTION_IDENTIFIER:
			case CAST_FUNCTION_IDENTIFIER:
			case BOOLEAN:
			case IDENTIFIER:
			case INTEGER:
			case FLOAT:
			case REAL:
			case DATE:
			case PARAMETER:
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(687);
				predicateOperand();
				setState(688);
				match(MATCHES);
				setState(689);
				match(REGEXPATTERN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MatchesOperandContext extends ParserRuleContext {
		public ValueListItemsContext valueListItems() {
			return getRuleContext(ValueListItemsContext.class,0);
		}
		public IdentifiedPathContext identifiedPath() {
			return getRuleContext(IdentifiedPathContext.class,0);
		}
		public TerminalNode URIVALUE() { return getToken(AqlParser.URIVALUE, 0); }
		public MatchesOperandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matchesOperand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).enterMatchesOperand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).exitMatchesOperand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AqlVisitor ) return ((AqlVisitor<? extends T>)visitor).visitMatchesOperand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatchesOperandContext matchesOperand() throws RecognitionException {
		MatchesOperandContext _localctx = new MatchesOperandContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_matchesOperand);
		try {
			setState(696);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TERMINOLOGY:
			case NULL:
			case UNKNOWN:
			case TRUE:
			case FALSE:
			case FUNCTION_IDENTIFIER:
			case CAST_FUNCTION_IDENTIFIER:
			case BOOLEAN:
			case INTEGER:
			case FLOAT:
			case REAL:
			case DATE:
			case PARAMETER:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(693);
				valueListItems();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(694);
				identifiedPath();
				}
				break;
			case URIVALUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(695);
				match(URIVALUE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ValueListItemsContext extends ParserRuleContext {
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(AqlParser.COMMA, 0); }
		public ValueListItemsContext valueListItems() {
			return getRuleContext(ValueListItemsContext.class,0);
		}
		public ValueListItemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueListItems; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).enterValueListItems(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).exitValueListItems(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AqlVisitor ) return ((AqlVisitor<? extends T>)visitor).visitValueListItems(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueListItemsContext valueListItems() throws RecognitionException {
		ValueListItemsContext _localctx = new ValueListItemsContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_valueListItems);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(698);
			operand();
			setState(701);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(699);
				match(COMMA);
				setState(700);
				valueListItems();
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

	@SuppressWarnings("CheckReturnValue")
	public static class VersionpredicateContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACKET() { return getToken(AqlParser.OPEN_BRACKET, 0); }
		public VersionpredicateOptionsContext versionpredicateOptions() {
			return getRuleContext(VersionpredicateOptionsContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(AqlParser.CLOSE_BRACKET, 0); }
		public VersionpredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_versionpredicate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).enterVersionpredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).exitVersionpredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AqlVisitor ) return ((AqlVisitor<? extends T>)visitor).visitVersionpredicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VersionpredicateContext versionpredicate() throws RecognitionException {
		VersionpredicateContext _localctx = new VersionpredicateContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_versionpredicate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(703);
			match(OPEN_BRACKET);
			setState(704);
			versionpredicateOptions();
			setState(705);
			match(CLOSE_BRACKET);
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
	public static class VersionpredicateOptionsContext extends ParserRuleContext {
		public TerminalNode LATEST_VERSION() { return getToken(AqlParser.LATEST_VERSION, 0); }
		public TerminalNode ALL_VERSIONS() { return getToken(AqlParser.ALL_VERSIONS, 0); }
		public VersionpredicateOptionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_versionpredicateOptions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).enterVersionpredicateOptions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).exitVersionpredicateOptions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AqlVisitor ) return ((AqlVisitor<? extends T>)visitor).visitVersionpredicateOptions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VersionpredicateOptionsContext versionpredicateOptions() throws RecognitionException {
		VersionpredicateOptionsContext _localctx = new VersionpredicateOptionsContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_versionpredicateOptions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(707);
			_la = _input.LA(1);
			if ( !(_la==ALL_VERSIONS || _la==LATEST_VERSION) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class StandardPredicateContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACKET() { return getToken(AqlParser.OPEN_BRACKET, 0); }
		public PredicateExprContext predicateExpr() {
			return getRuleContext(PredicateExprContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(AqlParser.CLOSE_BRACKET, 0); }
		public StandardPredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_standardPredicate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).enterStandardPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).exitStandardPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AqlVisitor ) return ((AqlVisitor<? extends T>)visitor).visitStandardPredicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StandardPredicateContext standardPredicate() throws RecognitionException {
		StandardPredicateContext _localctx = new StandardPredicateContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_standardPredicate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(709);
			match(OPEN_BRACKET);
			setState(710);
			predicateExpr();
			setState(711);
			match(CLOSE_BRACKET);
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
	public static class JoinPredicateContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACKET() { return getToken(AqlParser.OPEN_BRACKET, 0); }
		public TerminalNode JOINON() { return getToken(AqlParser.JOINON, 0); }
		public PredicateEqualityContext predicateEquality() {
			return getRuleContext(PredicateEqualityContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(AqlParser.CLOSE_BRACKET, 0); }
		public JoinPredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinPredicate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).enterJoinPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).exitJoinPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AqlVisitor ) return ((AqlVisitor<? extends T>)visitor).visitJoinPredicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinPredicateContext joinPredicate() throws RecognitionException {
		JoinPredicateContext _localctx = new JoinPredicateContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_joinPredicate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(713);
			match(OPEN_BRACKET);
			setState(714);
			match(JOINON);
			setState(715);
			predicateEquality();
			setState(716);
			match(CLOSE_BRACKET);
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
	public static class PredicateExprContext extends ParserRuleContext {
		public List<PredicateAndContext> predicateAnd() {
			return getRuleContexts(PredicateAndContext.class);
		}
		public PredicateAndContext predicateAnd(int i) {
			return getRuleContext(PredicateAndContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(AqlParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(AqlParser.OR, i);
		}
		public PredicateExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicateExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).enterPredicateExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).exitPredicateExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AqlVisitor ) return ((AqlVisitor<? extends T>)visitor).visitPredicateExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicateExprContext predicateExpr() throws RecognitionException {
		PredicateExprContext _localctx = new PredicateExprContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_predicateExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(718);
			predicateAnd();
			setState(723);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(719);
				match(OR);
				setState(720);
				predicateAnd();
				}
				}
				setState(725);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PredicateAndContext extends ParserRuleContext {
		public List<PredicateEqualityContext> predicateEquality() {
			return getRuleContexts(PredicateEqualityContext.class);
		}
		public PredicateEqualityContext predicateEquality(int i) {
			return getRuleContext(PredicateEqualityContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(AqlParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(AqlParser.AND, i);
		}
		public PredicateAndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicateAnd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).enterPredicateAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).exitPredicateAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AqlVisitor ) return ((AqlVisitor<? extends T>)visitor).visitPredicateAnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicateAndContext predicateAnd() throws RecognitionException {
		PredicateAndContext _localctx = new PredicateAndContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_predicateAnd);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(726);
			predicateEquality();
			setState(731);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(727);
				match(AND);
				setState(728);
				predicateEquality();
				}
				}
				setState(733);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PredicateEqualityContext extends ParserRuleContext {
		public List<PredicateOperandContext> predicateOperand() {
			return getRuleContexts(PredicateOperandContext.class);
		}
		public PredicateOperandContext predicateOperand(int i) {
			return getRuleContext(PredicateOperandContext.class,i);
		}
		public TerminalNode COMPARABLEOPERATOR() { return getToken(AqlParser.COMPARABLEOPERATOR, 0); }
		public PredicateEqualityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicateEquality; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).enterPredicateEquality(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).exitPredicateEquality(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AqlVisitor ) return ((AqlVisitor<? extends T>)visitor).visitPredicateEquality(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicateEqualityContext predicateEquality() throws RecognitionException {
		PredicateEqualityContext _localctx = new PredicateEqualityContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_predicateEquality);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(734);
			predicateOperand();
			setState(735);
			match(COMPARABLEOPERATOR);
			setState(736);
			predicateOperand();
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
	public static class PredicateOperandContext extends ParserRuleContext {
		public ObjectPathContext objectPath() {
			return getRuleContext(ObjectPathContext.class,0);
		}
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public PredicateOperandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicateOperand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).enterPredicateOperand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).exitPredicateOperand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AqlVisitor ) return ((AqlVisitor<? extends T>)visitor).visitPredicateOperand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicateOperandContext predicateOperand() throws RecognitionException {
		PredicateOperandContext _localctx = new PredicateOperandContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_predicateOperand);
		try {
			setState(740);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(738);
				objectPath();
				}
				break;
			case TERMINOLOGY:
			case NULL:
			case UNKNOWN:
			case TRUE:
			case FALSE:
			case FUNCTION_IDENTIFIER:
			case CAST_FUNCTION_IDENTIFIER:
			case BOOLEAN:
			case INTEGER:
			case FLOAT:
			case REAL:
			case DATE:
			case PARAMETER:
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(739);
				operand();
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

	@SuppressWarnings("CheckReturnValue")
	public static class OperandContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(AqlParser.STRING, 0); }
		public TerminalNode INTEGER() { return getToken(AqlParser.INTEGER, 0); }
		public TerminalNode FLOAT() { return getToken(AqlParser.FLOAT, 0); }
		public TerminalNode REAL() { return getToken(AqlParser.REAL, 0); }
		public TerminalNode DATE() { return getToken(AqlParser.DATE, 0); }
		public TerminalNode PARAMETER() { return getToken(AqlParser.PARAMETER, 0); }
		public TerminalNode BOOLEAN() { return getToken(AqlParser.BOOLEAN, 0); }
		public TerminalNode TRUE() { return getToken(AqlParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(AqlParser.FALSE, 0); }
		public TerminalNode NULL() { return getToken(AqlParser.NULL, 0); }
		public TerminalNode UNKNOWN() { return getToken(AqlParser.UNKNOWN, 0); }
		public InvokeOperandContext invokeOperand() {
			return getRuleContext(InvokeOperandContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public CastFunctionContext castFunction() {
			return getRuleContext(CastFunctionContext.class,0);
		}
		public OperandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).enterOperand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).exitOperand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AqlVisitor ) return ((AqlVisitor<? extends T>)visitor).visitOperand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperandContext operand() throws RecognitionException {
		OperandContext _localctx = new OperandContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_operand);
		try {
			setState(756);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(742);
				match(STRING);
				}
				break;
			case INTEGER:
				enterOuterAlt(_localctx, 2);
				{
				setState(743);
				match(INTEGER);
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 3);
				{
				setState(744);
				match(FLOAT);
				}
				break;
			case REAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(745);
				match(REAL);
				}
				break;
			case DATE:
				enterOuterAlt(_localctx, 5);
				{
				setState(746);
				match(DATE);
				}
				break;
			case PARAMETER:
				enterOuterAlt(_localctx, 6);
				{
				setState(747);
				match(PARAMETER);
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 7);
				{
				setState(748);
				match(BOOLEAN);
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 8);
				{
				setState(749);
				match(TRUE);
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 9);
				{
				setState(750);
				match(FALSE);
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 10);
				{
				setState(751);
				match(NULL);
				}
				break;
			case UNKNOWN:
				enterOuterAlt(_localctx, 11);
				{
				setState(752);
				match(UNKNOWN);
				}
				break;
			case TERMINOLOGY:
				enterOuterAlt(_localctx, 12);
				{
				setState(753);
				invokeOperand();
				}
				break;
			case FUNCTION_IDENTIFIER:
				enterOuterAlt(_localctx, 13);
				{
				setState(754);
				function();
				}
				break;
			case CAST_FUNCTION_IDENTIFIER:
				enterOuterAlt(_localctx, 14);
				{
				setState(755);
				castFunction();
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

	@SuppressWarnings("CheckReturnValue")
	public static class InvokeOperandContext extends ParserRuleContext {
		public InvokeExprContext invokeExpr() {
			return getRuleContext(InvokeExprContext.class,0);
		}
		public InvokeOperandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_invokeOperand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).enterInvokeOperand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).exitInvokeOperand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AqlVisitor ) return ((AqlVisitor<? extends T>)visitor).visitInvokeOperand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InvokeOperandContext invokeOperand() throws RecognitionException {
		InvokeOperandContext _localctx = new InvokeOperandContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_invokeOperand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(758);
			invokeExpr();
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
	public static class InvokeExprContext extends ParserRuleContext {
		public TerminalNode TERMINOLOGY() { return getToken(AqlParser.TERMINOLOGY, 0); }
		public TerminalNode OPEN_PAR() { return getToken(AqlParser.OPEN_PAR, 0); }
		public List<TerminalNode> STRING() { return getTokens(AqlParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(AqlParser.STRING, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AqlParser.COMMA, i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(AqlParser.CLOSE_PAR, 0); }
		public InvokeExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_invokeExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).enterInvokeExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).exitInvokeExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AqlVisitor ) return ((AqlVisitor<? extends T>)visitor).visitInvokeExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InvokeExprContext invokeExpr() throws RecognitionException {
		InvokeExprContext _localctx = new InvokeExprContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_invokeExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(760);
			match(TERMINOLOGY);
			setState(761);
			match(OPEN_PAR);
			setState(762);
			match(STRING);
			setState(763);
			match(COMMA);
			setState(764);
			match(STRING);
			setState(765);
			match(COMMA);
			setState(766);
			match(STRING);
			setState(767);
			match(CLOSE_PAR);
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
	public static class ObjectPathContext extends ParserRuleContext {
		public List<PathPartContext> pathPart() {
			return getRuleContexts(PathPartContext.class);
		}
		public PathPartContext pathPart(int i) {
			return getRuleContext(PathPartContext.class,i);
		}
		public List<TerminalNode> SLASH() { return getTokens(AqlParser.SLASH); }
		public TerminalNode SLASH(int i) {
			return getToken(AqlParser.SLASH, i);
		}
		public ObjectPathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectPath; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).enterObjectPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).exitObjectPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AqlVisitor ) return ((AqlVisitor<? extends T>)visitor).visitObjectPath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectPathContext objectPath() throws RecognitionException {
		ObjectPathContext _localctx = new ObjectPathContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_objectPath);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(769);
			pathPart();
			setState(774);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SLASH) {
				{
				{
				setState(770);
				match(SLASH);
				setState(771);
				pathPart();
				}
				}
				setState(776);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PathPartContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(AqlParser.IDENTIFIER, 0); }
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public PathPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pathPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).enterPathPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).exitPathPart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AqlVisitor ) return ((AqlVisitor<? extends T>)visitor).visitPathPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PathPartContext pathPart() throws RecognitionException {
		PathPartContext _localctx = new PathPartContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_pathPart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(777);
			match(IDENTIFIER);
			setState(779);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_BRACKET) {
				{
				setState(778);
				predicate();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ClassExprContext extends ParserRuleContext {
		public TerminalNode OPEN_PAR() { return getToken(AqlParser.OPEN_PAR, 0); }
		public SimpleClassExprContext simpleClassExpr() {
			return getRuleContext(SimpleClassExprContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(AqlParser.CLOSE_PAR, 0); }
		public ClassExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).enterClassExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).exitClassExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AqlVisitor ) return ((AqlVisitor<? extends T>)visitor).visitClassExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassExprContext classExpr() throws RecognitionException {
		ClassExprContext _localctx = new ClassExprContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_classExpr);
		try {
			setState(786);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(781);
				match(OPEN_PAR);
				setState(782);
				simpleClassExpr();
				setState(783);
				match(CLOSE_PAR);
				}
				break;
			case VERSION:
			case VERSIONED_OBJECT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(785);
				simpleClassExpr();
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

	@SuppressWarnings("CheckReturnValue")
	public static class SimpleClassExprContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(AqlParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AqlParser.IDENTIFIER, i);
		}
		public ArchetypedClassExprContext archetypedClassExpr() {
			return getRuleContext(ArchetypedClassExprContext.class,0);
		}
		public VersionedClassExprContext versionedClassExpr() {
			return getRuleContext(VersionedClassExprContext.class,0);
		}
		public VersionClassExprContext versionClassExpr() {
			return getRuleContext(VersionClassExprContext.class,0);
		}
		public SimpleClassExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleClassExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).enterSimpleClassExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).exitSimpleClassExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AqlVisitor ) return ((AqlVisitor<? extends T>)visitor).visitSimpleClassExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleClassExprContext simpleClassExpr() throws RecognitionException {
		SimpleClassExprContext _localctx = new SimpleClassExprContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_simpleClassExpr);
		int _la;
		try {
			setState(795);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(788);
				match(IDENTIFIER);
				setState(790);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(789);
					match(IDENTIFIER);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(792);
				archetypedClassExpr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(793);
				versionedClassExpr();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(794);
				versionClassExpr();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArchetypedClassExprContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(AqlParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AqlParser.IDENTIFIER, i);
		}
		public TerminalNode OPEN_BRACKET() { return getToken(AqlParser.OPEN_BRACKET, 0); }
		public TerminalNode ARCHETYPEID() { return getToken(AqlParser.ARCHETYPEID, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(AqlParser.CLOSE_BRACKET, 0); }
		public ArchetypedClassExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_archetypedClassExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).enterArchetypedClassExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).exitArchetypedClassExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AqlVisitor ) return ((AqlVisitor<? extends T>)visitor).visitArchetypedClassExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArchetypedClassExprContext archetypedClassExpr() throws RecognitionException {
		ArchetypedClassExprContext _localctx = new ArchetypedClassExprContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_archetypedClassExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(797);
			match(IDENTIFIER);
			setState(799);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(798);
				match(IDENTIFIER);
				}
			}

			setState(804);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_BRACKET) {
				{
				setState(801);
				match(OPEN_BRACKET);
				setState(802);
				match(ARCHETYPEID);
				setState(803);
				match(CLOSE_BRACKET);
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

	@SuppressWarnings("CheckReturnValue")
	public static class VersionedClassExprContext extends ParserRuleContext {
		public TerminalNode VERSIONED_OBJECT() { return getToken(AqlParser.VERSIONED_OBJECT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AqlParser.IDENTIFIER, 0); }
		public StandardPredicateContext standardPredicate() {
			return getRuleContext(StandardPredicateContext.class,0);
		}
		public VersionedClassExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_versionedClassExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).enterVersionedClassExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).exitVersionedClassExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AqlVisitor ) return ((AqlVisitor<? extends T>)visitor).visitVersionedClassExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VersionedClassExprContext versionedClassExpr() throws RecognitionException {
		VersionedClassExprContext _localctx = new VersionedClassExprContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_versionedClassExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(806);
			match(VERSIONED_OBJECT);
			setState(808);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(807);
				match(IDENTIFIER);
				}
			}

			setState(811);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_BRACKET) {
				{
				setState(810);
				standardPredicate();
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

	@SuppressWarnings("CheckReturnValue")
	public static class VersionClassExprContext extends ParserRuleContext {
		public TerminalNode VERSION() { return getToken(AqlParser.VERSION, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AqlParser.IDENTIFIER, 0); }
		public StandardPredicateContext standardPredicate() {
			return getRuleContext(StandardPredicateContext.class,0);
		}
		public VersionpredicateContext versionpredicate() {
			return getRuleContext(VersionpredicateContext.class,0);
		}
		public VersionClassExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_versionClassExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).enterVersionClassExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AqlListener ) ((AqlListener)listener).exitVersionClassExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AqlVisitor ) return ((AqlVisitor<? extends T>)visitor).visitVersionClassExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VersionClassExprContext versionClassExpr() throws RecognitionException {
		VersionClassExprContext _localctx = new VersionClassExprContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_versionClassExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(813);
			match(VERSION);
			setState(815);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(814);
				match(IDENTIFIER);
				}
			}

			setState(819);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
			case 1:
				{
				setState(817);
				standardPredicate();
				}
				break;
			case 2:
				{
				setState(818);
				versionpredicate();
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

	public static final String _serializedATN =
		"\u0004\u0001\u0085\u0336\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007"+
		"\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007"+
		"\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007"+
		"\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007"+
		",\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u0007"+
		"1\u00022\u00072\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0003\u0001l\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003"+
		"\u0001q\b\u0001\u0003\u0001s\b\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"w\b\u0001\u0001\u0001\u0003\u0001z\b\u0001\u0003\u0001|\b\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0003\u0002\u0086\b\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0003\u0003\u008b\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u0093\b\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u0099\b\u0004\u0005\u0004\u009b"+
		"\b\u0004\n\u0004\f\u0004\u009e\t\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u00a7\b\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b"+
		"\u00c3\b\u000b\u0001\f\u0001\f\u0003\f\u00c7\b\f\u0001\r\u0003\r\u00ca"+
		"\b\r\u0001\r\u0001\r\u0001\r\u0003\r\u00cf\b\r\u0001\r\u0001\r\u0003\r"+
		"\u00d3\b\r\u0001\r\u0003\r\u00d6\b\r\u0001\r\u0001\r\u0001\r\u0003\r\u00db"+
		"\b\r\u0001\r\u0001\r\u0003\r\u00df\b\r\u0003\r\u00e1\b\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0003\u000e\u00f1\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00f9\b\u000f\u0001\u000f\u0001"+
		"\u000f\u0003\u000f\u00fd\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0003\u000f\u0103\b\u000f\u0003\u000f\u0105\b\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0003\u0010\u010e\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0003\u0011\u0115\b\u0011\u0001\u0012\u0001\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0003\u0013\u011c\b\u0013\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u0123\b\u0014\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0003\u0015\u0128\b\u0015\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0005\u0016\u012d\b\u0016\n\u0016\f\u0016\u0130\t\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0005\u0016\u0136\b\u0016\n"+
		"\u0016\f\u0016\u0139\t\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u013d"+
		"\b\u0016\u0001\u0017\u0005\u0017\u0140\b\u0017\n\u0017\f\u0017\u0143\t"+
		"\u0017\u0001\u0017\u0003\u0017\u0146\b\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0005\u0017\u014c\b\u0017\n\u0017\f\u0017\u014f\t\u0017"+
		"\u0001\u0017\u0005\u0017\u0152\b\u0017\n\u0017\f\u0017\u0155\t\u0017\u0001"+
		"\u0017\u0003\u0017\u0158\b\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0005\u0017\u0160\b\u0017\n\u0017\f\u0017"+
		"\u0163\t\u0017\u0001\u0017\u0005\u0017\u0166\b\u0017\n\u0017\f\u0017\u0169"+
		"\t\u0017\u0001\u0017\u0003\u0017\u016c\b\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0005\u0017\u0172\b\u0017\n\u0017\f\u0017\u0175"+
		"\t\u0017\u0001\u0017\u0005\u0017\u0178\b\u0017\n\u0017\f\u0017\u017b\t"+
		"\u0017\u0001\u0017\u0003\u0017\u017e\b\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0005\u0017\u0184\b\u0017\n\u0017\f\u0017\u0187\t\u0017"+
		"\u0001\u0017\u0005\u0017\u018a\b\u0017\n\u0017\f\u0017\u018d\t\u0017\u0001"+
		"\u0017\u0003\u0017\u0190\b\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0005\u0017\u0196\b\u0017\n\u0017\f\u0017\u0199\t\u0017\u0001\u0017"+
		"\u0005\u0017\u019c\b\u0017\n\u0017\f\u0017\u019f\t\u0017\u0001\u0017\u0003"+
		"\u0017\u01a2\b\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0005"+
		"\u0017\u01a8\b\u0017\n\u0017\f\u0017\u01ab\t\u0017\u0001\u0017\u0005\u0017"+
		"\u01ae\b\u0017\n\u0017\f\u0017\u01b1\t\u0017\u0001\u0017\u0001\u0017\u0003"+
		"\u0017\u01b5\b\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003"+
		"\u0017\u01bb\b\u0017\u0001\u0017\u0001\u0017\u0005\u0017\u01bf\b\u0017"+
		"\n\u0017\f\u0017\u01c2\t\u0017\u0001\u0017\u0005\u0017\u01c5\b\u0017\n"+
		"\u0017\f\u0017\u01c8\t\u0017\u0001\u0017\u0003\u0017\u01cb\b\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003"+
		"\u0017\u01d3\b\u0017\u0001\u0017\u0001\u0017\u0005\u0017\u01d7\b\u0017"+
		"\n\u0017\f\u0017\u01da\t\u0017\u0001\u0017\u0005\u0017\u01dd\b\u0017\n"+
		"\u0017\f\u0017\u01e0\t\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u01e4"+
		"\b\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0005"+
		"\u0017\u01eb\b\u0017\n\u0017\f\u0017\u01ee\t\u0017\u0001\u0017\u0005\u0017"+
		"\u01f1\b\u0017\n\u0017\f\u0017\u01f4\t\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0003\u0017\u01f9\b\u0017\u0001\u0017\u0001\u0017\u0005\u0017\u01fd"+
		"\b\u0017\n\u0017\f\u0017\u0200\t\u0017\u0001\u0017\u0005\u0017\u0203\b"+
		"\u0017\n\u0017\f\u0017\u0206\t\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0003\u0017\u020b\b\u0017\u0001\u0017\u0001\u0017\u0005\u0017\u020f\b"+
		"\u0017\n\u0017\f\u0017\u0212\t\u0017\u0001\u0017\u0005\u0017\u0215\b\u0017"+
		"\n\u0017\f\u0017\u0218\t\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003"+
		"\u0017\u021d\b\u0017\u0001\u0017\u0001\u0017\u0005\u0017\u0221\b\u0017"+
		"\n\u0017\f\u0017\u0224\t\u0017\u0001\u0017\u0005\u0017\u0227\b\u0017\n"+
		"\u0017\f\u0017\u022a\t\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003"+
		"\u0017\u022f\b\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0005"+
		"\u0017\u0235\b\u0017\n\u0017\f\u0017\u0238\t\u0017\u0001\u0017\u0005\u0017"+
		"\u023b\b\u0017\n\u0017\f\u0017\u023e\t\u0017\u0001\u0017\u0003\u0017\u0241"+
		"\b\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0005\u0017\u0247"+
		"\b\u0017\n\u0017\f\u0017\u024a\t\u0017\u0001\u0017\u0005\u0017\u024d\b"+
		"\u0017\n\u0017\f\u0017\u0250\t\u0017\u0001\u0017\u0003\u0017\u0253\b\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0005\u0017\u0258\b\u0017\n\u0017"+
		"\f\u0017\u025b\t\u0017\u0001\u0017\u0005\u0017\u025e\b\u0017\n\u0017\f"+
		"\u0017\u0261\t\u0017\u0001\u0017\u0003\u0017\u0264\b\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0005\u0017\u0269\b\u0017\n\u0017\f\u0017\u026c"+
		"\t\u0017\u0003\u0017\u026e\b\u0017\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0003\u0018\u0273\b\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019"+
		"\u0278\b\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019"+
		"\u027e\b\u0019\u0003\u0019\u0280\b\u0019\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0005\u001b\u0289"+
		"\b\u001b\n\u001b\f\u001b\u028c\t\u001b\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0005\u001c\u0291\b\u001c\n\u001c\f\u001c\u0294\t\u001c\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0003\u001d\u0299\b\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0003\u001d\u029e\b\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0003\u001d\u02a5\b\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0003\u001d\u02ab\b\u001d\u0003\u001d\u02ad\b\u001d"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e"+
		"\u02b4\b\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u02b9\b"+
		"\u001f\u0001 \u0001 \u0001 \u0003 \u02be\b \u0001!\u0001!\u0001!\u0001"+
		"!\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0001#\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001%\u0001%\u0001%\u0005%\u02d2\b%\n%\f%\u02d5\t%\u0001&\u0001"+
		"&\u0001&\u0005&\u02da\b&\n&\f&\u02dd\t&\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001(\u0001(\u0003(\u02e5\b(\u0001)\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0003)\u02f5"+
		"\b)\u0001*\u0001*\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001"+
		"+\u0001+\u0001,\u0001,\u0001,\u0005,\u0305\b,\n,\f,\u0308\t,\u0001-\u0001"+
		"-\u0003-\u030c\b-\u0001.\u0001.\u0001.\u0001.\u0001.\u0003.\u0313\b.\u0001"+
		"/\u0001/\u0003/\u0317\b/\u0001/\u0001/\u0001/\u0003/\u031c\b/\u00010\u0001"+
		"0\u00030\u0320\b0\u00010\u00010\u00010\u00030\u0325\b0\u00011\u00011\u0003"+
		"1\u0329\b1\u00011\u00031\u032c\b1\u00012\u00012\u00032\u0330\b2\u0001"+
		"2\u00012\u00032\u0334\b2\u00012\u0000\u00003\u0000\u0002\u0004\u0006\b"+
		"\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02"+
		"468:<>@BDFHJLNPRTVXZ\\^`bd\u0000\t\u0001\u0000\u000e\u000f\u0001\u0000"+
		"\u0017\u001a\u0001\u0000+.\u0001\u0000\u0002\u0004\u0002\u0000\t\n==\u0001"+
		"\u0000\"$\u0001\u0000)*\u0002\u0000;;@@\u0001\u0000\u001e\u001f\u03a9"+
		"\u0000f\u0001\u0000\u0000\u0000\u0002h\u0001\u0000\u0000\u0000\u0004\u0085"+
		"\u0001\u0000\u0000\u0000\u0006\u0087\u0001\u0000\u0000\u0000\b\u008c\u0001"+
		"\u0000\u0000\u0000\n\u00a1\u0001\u0000\u0000\u0000\f\u00ac\u0001\u0000"+
		"\u0000\u0000\u000e\u00b3\u0001\u0000\u0000\u0000\u0010\u00b6\u0001\u0000"+
		"\u0000\u0000\u0012\u00b9\u0001\u0000\u0000\u0000\u0014\u00bc\u0001\u0000"+
		"\u0000\u0000\u0016\u00bf\u0001\u0000\u0000\u0000\u0018\u00c4\u0001\u0000"+
		"\u0000\u0000\u001a\u00e0\u0001\u0000\u0000\u0000\u001c\u00f0\u0001\u0000"+
		"\u0000\u0000\u001e\u0104\u0001\u0000\u0000\u0000 \u010d\u0001\u0000\u0000"+
		"\u0000\"\u0114\u0001\u0000\u0000\u0000$\u0116\u0001\u0000\u0000\u0000"+
		"&\u0118\u0001\u0000\u0000\u0000(\u0122\u0001\u0000\u0000\u0000*\u0124"+
		"\u0001\u0000\u0000\u0000,\u013c\u0001\u0000\u0000\u0000.\u026d\u0001\u0000"+
		"\u0000\u00000\u0272\u0001\u0000\u0000\u00002\u027f\u0001\u0000\u0000\u0000"+
		"4\u0281\u0001\u0000\u0000\u00006\u0285\u0001\u0000\u0000\u00008\u028d"+
		"\u0001\u0000\u0000\u0000:\u02ac\u0001\u0000\u0000\u0000<\u02b3\u0001\u0000"+
		"\u0000\u0000>\u02b8\u0001\u0000\u0000\u0000@\u02ba\u0001\u0000\u0000\u0000"+
		"B\u02bf\u0001\u0000\u0000\u0000D\u02c3\u0001\u0000\u0000\u0000F\u02c5"+
		"\u0001\u0000\u0000\u0000H\u02c9\u0001\u0000\u0000\u0000J\u02ce\u0001\u0000"+
		"\u0000\u0000L\u02d6\u0001\u0000\u0000\u0000N\u02de\u0001\u0000\u0000\u0000"+
		"P\u02e4\u0001\u0000\u0000\u0000R\u02f4\u0001\u0000\u0000\u0000T\u02f6"+
		"\u0001\u0000\u0000\u0000V\u02f8\u0001\u0000\u0000\u0000X\u0301\u0001\u0000"+
		"\u0000\u0000Z\u0309\u0001\u0000\u0000\u0000\\\u0312\u0001\u0000\u0000"+
		"\u0000^\u031b\u0001\u0000\u0000\u0000`\u031d\u0001\u0000\u0000\u0000b"+
		"\u0326\u0001\u0000\u0000\u0000d\u032d\u0001\u0000\u0000\u0000fg\u0003"+
		"\u0002\u0001\u0000g\u0001\u0001\u0000\u0000\u0000hi\u0003\u0004\u0002"+
		"\u0000ik\u0003\u001e\u000f\u0000jl\u0003\u000e\u0007\u0000kj\u0001\u0000"+
		"\u0000\u0000kl\u0001\u0000\u0000\u0000l{\u0001\u0000\u0000\u0000mr\u0003"+
		"\u0010\b\u0000np\u0003\u0012\t\u0000oq\u0003\u0014\n\u0000po\u0001\u0000"+
		"\u0000\u0000pq\u0001\u0000\u0000\u0000qs\u0001\u0000\u0000\u0000rn\u0001"+
		"\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000s|\u0001\u0000\u0000\u0000"+
		"tv\u0003\u0012\t\u0000uw\u0003\u0014\n\u0000vu\u0001\u0000\u0000\u0000"+
		"vw\u0001\u0000\u0000\u0000wy\u0001\u0000\u0000\u0000xz\u0003\u0010\b\u0000"+
		"yx\u0001\u0000\u0000\u0000yz\u0001\u0000\u0000\u0000z|\u0001\u0000\u0000"+
		"\u0000{m\u0001\u0000\u0000\u0000{t\u0001\u0000\u0000\u0000{|\u0001\u0000"+
		"\u0000\u0000|}\u0001\u0000\u0000\u0000}~\u0005\u0000\u0000\u0001~\u0003"+
		"\u0001\u0000\u0000\u0000\u007f\u0080\u0005\f\u0000\u0000\u0080\u0086\u0003"+
		"\u001a\r\u0000\u0081\u0082\u0005\f\u0000\u0000\u0082\u0083\u0003\u0006"+
		"\u0003\u0000\u0083\u0084\u0003\u001a\r\u0000\u0084\u0086\u0001\u0000\u0000"+
		"\u0000\u0085\u007f\u0001\u0000\u0000\u0000\u0085\u0081\u0001\u0000\u0000"+
		"\u0000\u0086\u0005\u0001\u0000\u0000\u0000\u0087\u0088\u0005\r\u0000\u0000"+
		"\u0088\u008a\u00057\u0000\u0000\u0089\u008b\u0007\u0000\u0000\u0000\u008a"+
		"\u0089\u0001\u0000\u0000\u0000\u008a\u008b\u0001\u0000\u0000\u0000\u008b"+
		"\u0007\u0001\u0000\u0000\u0000\u008c\u008d\u0005/\u0000\u0000\u008d\u0092"+
		"\u0005G\u0000\u0000\u008e\u0093\u00055\u0000\u0000\u008f\u0093\u00032"+
		"\u0019\u0000\u0090\u0093\u0003R)\u0000\u0091\u0093\u0001\u0000\u0000\u0000"+
		"\u0092\u008e\u0001\u0000\u0000\u0000\u0092\u008f\u0001\u0000\u0000\u0000"+
		"\u0092\u0090\u0001\u0000\u0000\u0000\u0092\u0091\u0001\u0000\u0000\u0000"+
		"\u0093\u009c\u0001\u0000\u0000\u0000\u0094\u0098\u0005C\u0000\u0000\u0095"+
		"\u0099\u00055\u0000\u0000\u0096\u0099\u00032\u0019\u0000\u0097\u0099\u0003"+
		"R)\u0000\u0098\u0095\u0001\u0000\u0000\u0000\u0098\u0096\u0001\u0000\u0000"+
		"\u0000\u0098\u0097\u0001\u0000\u0000\u0000\u0099\u009b\u0001\u0000\u0000"+
		"\u0000\u009a\u0094\u0001\u0000\u0000\u0000\u009b\u009e\u0001\u0000\u0000"+
		"\u0000\u009c\u009a\u0001\u0000\u0000\u0000\u009c\u009d\u0001\u0000\u0000"+
		"\u0000\u009d\u009f\u0001\u0000\u0000\u0000\u009e\u009c\u0001\u0000\u0000"+
		"\u0000\u009f\u00a0\u0005H\u0000\u0000\u00a0\t\u0001\u0000\u0000\u0000"+
		"\u00a1\u00a2\u00050\u0000\u0000\u00a2\u00a6\u0005G\u0000\u0000\u00a3\u00a7"+
		"\u00055\u0000\u0000\u00a4\u00a7\u00032\u0019\u0000\u00a5\u00a7\u0003R"+
		")\u0000\u00a6\u00a3\u0001\u0000\u0000\u0000\u00a6\u00a4\u0001\u0000\u0000"+
		"\u0000\u00a6\u00a5\u0001\u0000\u0000\u0000\u00a7\u00a8\u0001\u0000\u0000"+
		"\u0000\u00a8\u00a9\u0005\u0010\u0000\u0000\u00a9\u00aa\u0005@\u0000\u0000"+
		"\u00aa\u00ab\u0005H\u0000\u0000\u00ab\u000b\u0001\u0000\u0000\u0000\u00ac"+
		"\u00ad\u00051\u0000\u0000\u00ad\u00ae\u0005G\u0000\u0000\u00ae\u00af\u0005"+
		"@\u0000\u0000\u00af\u00b0\u0005C\u0000\u0000\u00b0\u00b1\u0005@\u0000"+
		"\u0000\u00b1\u00b2\u0005H\u0000\u0000\u00b2\r\u0001\u0000\u0000\u0000"+
		"\u00b3\u00b4\u0005\u0012\u0000\u0000\u00b4\u00b5\u0003,\u0016\u0000\u00b5"+
		"\u000f\u0001\u0000\u0000\u0000\u00b6\u00b7\u0005\u0013\u0000\u0000\u00b7"+
		"\u00b8\u0003\u0016\u000b\u0000\u00b8\u0011\u0001\u0000\u0000\u0000\u00b9"+
		"\u00ba\u0005\u0015\u0000\u0000\u00ba\u00bb\u00057\u0000\u0000\u00bb\u0013"+
		"\u0001\u0000\u0000\u0000\u00bc\u00bd\u0005\u0014\u0000\u0000\u00bd\u00be"+
		"\u00057\u0000\u0000\u00be\u0015\u0001\u0000\u0000\u0000\u00bf\u00c2\u0003"+
		"\u0018\f\u0000\u00c0\u00c1\u0005C\u0000\u0000\u00c1\u00c3\u0003\u0016"+
		"\u000b\u0000\u00c2\u00c0\u0001\u0000\u0000\u0000\u00c2\u00c3\u0001\u0000"+
		"\u0000\u0000\u00c3\u0017\u0001\u0000\u0000\u0000\u00c4\u00c6\u00032\u0019"+
		"\u0000\u00c5\u00c7\u0007\u0001\u0000\u0000\u00c6\u00c5\u0001\u0000\u0000"+
		"\u0000\u00c6\u00c7\u0001\u0000\u0000\u0000\u00c7\u0019\u0001\u0000\u0000"+
		"\u0000\u00c8\u00ca\u0005 \u0000\u0000\u00c9\u00c8\u0001\u0000\u0000\u0000"+
		"\u00c9\u00ca\u0001\u0000\u0000\u0000\u00ca\u00cb\u0001\u0000\u0000\u0000"+
		"\u00cb\u00ce\u00032\u0019\u0000\u00cc\u00cd\u0005\u0010\u0000\u0000\u00cd"+
		"\u00cf\u00055\u0000\u0000\u00ce\u00cc\u0001\u0000\u0000\u0000\u00ce\u00cf"+
		"\u0001\u0000\u0000\u0000\u00cf\u00d2\u0001\u0000\u0000\u0000\u00d0\u00d1"+
		"\u0005C\u0000\u0000\u00d1\u00d3\u0003\u001a\r\u0000\u00d2\u00d0\u0001"+
		"\u0000\u0000\u0000\u00d2\u00d3\u0001\u0000\u0000\u0000\u00d3\u00e1\u0001"+
		"\u0000\u0000\u0000\u00d4\u00d6\u0005 \u0000\u0000\u00d5\u00d4\u0001\u0000"+
		"\u0000\u0000\u00d5\u00d6\u0001\u0000\u0000\u0000\u00d6\u00d7\u0001\u0000"+
		"\u0000\u0000\u00d7\u00da\u0003\u001c\u000e\u0000\u00d8\u00d9\u0005\u0010"+
		"\u0000\u0000\u00d9\u00db\u00055\u0000\u0000\u00da\u00d8\u0001\u0000\u0000"+
		"\u0000\u00da\u00db\u0001\u0000\u0000\u0000\u00db\u00de\u0001\u0000\u0000"+
		"\u0000\u00dc\u00dd\u0005C\u0000\u0000\u00dd\u00df\u0003\u001a\r\u0000"+
		"\u00de\u00dc\u0001\u0000\u0000\u0000\u00de\u00df\u0001\u0000\u0000\u0000"+
		"\u00df\u00e1\u0001\u0000\u0000\u0000\u00e0\u00c9\u0001\u0000\u0000\u0000"+
		"\u00e0\u00d5\u0001\u0000\u0000\u0000\u00e1\u001b\u0001\u0000\u0000\u0000"+
		"\u00e2\u00f1\u0003\b\u0004\u0000\u00e3\u00f1\u0003\n\u0005\u0000\u00e4"+
		"\u00f1\u0003\f\u0006\u0000\u00e5\u00f1\u00057\u0000\u0000\u00e6\u00f1"+
		"\u0005@\u0000\u0000\u00e7\u00f1\u00058\u0000\u0000\u00e8\u00f1\u00059"+
		"\u0000\u0000\u00e9\u00f1\u0005:\u0000\u0000\u00ea\u00f1\u0005;\u0000\u0000"+
		"\u00eb\u00f1\u00052\u0000\u0000\u00ec\u00f1\u0005)\u0000\u0000\u00ed\u00f1"+
		"\u0005*\u0000\u0000\u00ee\u00f1\u0005\'\u0000\u0000\u00ef\u00f1\u0005"+
		"(\u0000\u0000\u00f0\u00e2\u0001\u0000\u0000\u0000\u00f0\u00e3\u0001\u0000"+
		"\u0000\u0000\u00f0\u00e4\u0001\u0000\u0000\u0000\u00f0\u00e5\u0001\u0000"+
		"\u0000\u0000\u00f0\u00e6\u0001\u0000\u0000\u0000\u00f0\u00e7\u0001\u0000"+
		"\u0000\u0000\u00f0\u00e8\u0001\u0000\u0000\u0000\u00f0\u00e9\u0001\u0000"+
		"\u0000\u0000\u00f0\u00ea\u0001\u0000\u0000\u0000\u00f0\u00eb\u0001\u0000"+
		"\u0000\u0000\u00f0\u00ec\u0001\u0000\u0000\u0000\u00f0\u00ed\u0001\u0000"+
		"\u0000\u0000\u00f0\u00ee\u0001\u0000\u0000\u0000\u00f0\u00ef\u0001\u0000"+
		"\u0000\u0000\u00f1\u001d\u0001\u0000\u0000\u0000\u00f2\u00f3\u0005\u0016"+
		"\u0000\u0000\u00f3\u0105\u0003$\u0012\u0000\u00f4\u00f5\u0005\u0016\u0000"+
		"\u0000\u00f5\u00f8\u0003 \u0010\u0000\u00f6\u00f7\u0005\u0011\u0000\u0000"+
		"\u00f7\u00f9\u0003&\u0013\u0000\u00f8\u00f6\u0001\u0000\u0000\u0000\u00f8"+
		"\u00f9\u0001\u0000\u0000\u0000\u00f9\u00fc\u0001\u0000\u0000\u0000\u00fa"+
		"\u00fb\u0005C\u0000\u0000\u00fb\u00fd\u0003\"\u0011\u0000\u00fc\u00fa"+
		"\u0001\u0000\u0000\u0000\u00fc\u00fd\u0001\u0000\u0000\u0000\u00fd\u0105"+
		"\u0001\u0000\u0000\u0000\u00fe\u00ff\u0005\u0016\u0000\u0000\u00ff\u0102"+
		"\u0003\"\u0011\u0000\u0100\u0101\u0005C\u0000\u0000\u0101\u0103\u0003"+
		"\"\u0011\u0000\u0102\u0100\u0001\u0000\u0000\u0000\u0102\u0103\u0001\u0000"+
		"\u0000\u0000\u0103\u0105\u0001\u0000\u0000\u0000\u0104\u00f2\u0001\u0000"+
		"\u0000\u0000\u0104\u00f4\u0001\u0000\u0000\u0000\u0104\u00fe\u0001\u0000"+
		"\u0000\u0000\u0105\u001f\u0001\u0000\u0000\u0000\u0106\u0107\u0005\u0001"+
		"\u0000\u0000\u0107\u010e\u0003F#\u0000\u0108\u0109\u0005\u0001\u0000\u0000"+
		"\u0109\u010a\u00055\u0000\u0000\u010a\u010e\u0003F#\u0000\u010b\u010c"+
		"\u0005\u0001\u0000\u0000\u010c\u010e\u00055\u0000\u0000\u010d\u0106\u0001"+
		"\u0000\u0000\u0000\u010d\u0108\u0001\u0000\u0000\u0000\u010d\u010b\u0001"+
		"\u0000\u0000\u0000\u010e!\u0001\u0000\u0000\u0000\u010f\u0110\u0007\u0002"+
		"\u0000\u0000\u0110\u0111\u00055\u0000\u0000\u0111\u0115\u0003H$\u0000"+
		"\u0112\u0113\u0007\u0002\u0000\u0000\u0113\u0115\u00055\u0000\u0000\u0114"+
		"\u010f\u0001\u0000\u0000\u0000\u0114\u0112\u0001\u0000\u0000\u0000\u0115"+
		"#\u0001\u0000\u0000\u0000\u0116\u0117\u0003&\u0013\u0000\u0117%\u0001"+
		"\u0000\u0000\u0000\u0118\u011b\u0003(\u0014\u0000\u0119\u011a\u0007\u0003"+
		"\u0000\u0000\u011a\u011c\u0003&\u0013\u0000\u011b\u0119\u0001\u0000\u0000"+
		"\u0000\u011b\u011c\u0001\u0000\u0000\u0000\u011c\'\u0001\u0000\u0000\u0000"+
		"\u011d\u0123\u0003*\u0015\u0000\u011e\u011f\u0005G\u0000\u0000\u011f\u0120"+
		"\u0003&\u0013\u0000\u0120\u0121\u0005H\u0000\u0000\u0121\u0123\u0001\u0000"+
		"\u0000\u0000\u0122\u011d\u0001\u0000\u0000\u0000\u0122\u011e\u0001\u0000"+
		"\u0000\u0000\u0123)\u0001\u0000\u0000\u0000\u0124\u0127\u0003^/\u0000"+
		"\u0125\u0126\u0005\u0011\u0000\u0000\u0126\u0128\u0003&\u0013\u0000\u0127"+
		"\u0125\u0001\u0000\u0000\u0000\u0127\u0128\u0001\u0000\u0000\u0000\u0128"+
		"+\u0001\u0000\u0000\u0000\u0129\u012e\u0003.\u0017\u0000\u012a\u012b\u0007"+
		"\u0003\u0000\u0000\u012b\u012d\u0003.\u0017\u0000\u012c\u012a\u0001\u0000"+
		"\u0000\u0000\u012d\u0130\u0001\u0000\u0000\u0000\u012e\u012c\u0001\u0000"+
		"\u0000\u0000\u012e\u012f\u0001\u0000\u0000\u0000\u012f\u013d\u0001\u0000"+
		"\u0000\u0000\u0130\u012e\u0001\u0000\u0000\u0000\u0131\u0132\u0005G\u0000"+
		"\u0000\u0132\u0137\u0003.\u0017\u0000\u0133\u0134\u0007\u0003\u0000\u0000"+
		"\u0134\u0136\u0003.\u0017\u0000\u0135\u0133\u0001\u0000\u0000\u0000\u0136"+
		"\u0139\u0001\u0000\u0000\u0000\u0137\u0135\u0001\u0000\u0000\u0000\u0137"+
		"\u0138\u0001\u0000\u0000\u0000\u0138\u013a\u0001\u0000\u0000\u0000\u0139"+
		"\u0137\u0001\u0000\u0000\u0000\u013a\u013b\u0005H\u0000\u0000\u013b\u013d"+
		"\u0001\u0000\u0000\u0000\u013c\u0129\u0001\u0000\u0000\u0000\u013c\u0131"+
		"\u0001\u0000\u0000\u0000\u013d-\u0001\u0000\u0000\u0000\u013e\u0140\u0005"+
		"G\u0000\u0000\u013f\u013e\u0001\u0000\u0000\u0000\u0140\u0143\u0001\u0000"+
		"\u0000\u0000\u0141\u013f\u0001\u0000\u0000\u0000\u0141\u0142\u0001\u0000"+
		"\u0000\u0000\u0142\u0145\u0001\u0000\u0000\u0000\u0143\u0141\u0001\u0000"+
		"\u0000\u0000\u0144\u0146\u0005\u0005\u0000\u0000\u0145\u0144\u0001\u0000"+
		"\u0000\u0000\u0145\u0146\u0001\u0000\u0000\u0000\u0146\u0147\u0001\u0000"+
		"\u0000\u0000\u0147\u0148\u00030\u0018\u0000\u0148\u0149\u0005=\u0000\u0000"+
		"\u0149\u014d\u00030\u0018\u0000\u014a\u014c\u0005H\u0000\u0000\u014b\u014a"+
		"\u0001\u0000\u0000\u0000\u014c\u014f\u0001\u0000\u0000\u0000\u014d\u014b"+
		"\u0001\u0000\u0000\u0000\u014d\u014e\u0001\u0000\u0000\u0000\u014e\u026e"+
		"\u0001\u0000\u0000\u0000\u014f\u014d\u0001\u0000\u0000\u0000\u0150\u0152"+
		"\u0005G\u0000\u0000\u0151\u0150\u0001\u0000\u0000\u0000\u0152\u0155\u0001"+
		"\u0000\u0000\u0000\u0153\u0151\u0001\u0000\u0000\u0000\u0153\u0154\u0001"+
		"\u0000\u0000\u0000\u0154\u0157\u0001\u0000\u0000\u0000\u0155\u0153\u0001"+
		"\u0000\u0000\u0000\u0156\u0158\u0005\u0005\u0000\u0000\u0157\u0156\u0001"+
		"\u0000\u0000\u0000\u0157\u0158\u0001\u0000\u0000\u0000\u0158\u0159\u0001"+
		"\u0000\u0000\u0000\u0159\u015a\u00030\u0018\u0000\u015a\u015b\u0005\u0007"+
		"\u0000\u0000\u015b\u015c\u0005I\u0000\u0000\u015c\u015d\u0003>\u001f\u0000"+
		"\u015d\u0161\u0005J\u0000\u0000\u015e\u0160\u0005H\u0000\u0000\u015f\u015e"+
		"\u0001\u0000\u0000\u0000\u0160\u0163\u0001\u0000\u0000\u0000\u0161\u015f"+
		"\u0001\u0000\u0000\u0000\u0161\u0162\u0001\u0000\u0000\u0000\u0162\u026e"+
		"\u0001\u0000\u0000\u0000\u0163\u0161\u0001\u0000\u0000\u0000\u0164\u0166"+
		"\u0005G\u0000\u0000\u0165\u0164\u0001\u0000\u0000\u0000\u0166\u0169\u0001"+
		"\u0000\u0000\u0000\u0167\u0165\u0001\u0000\u0000\u0000\u0167\u0168\u0001"+
		"\u0000\u0000\u0000\u0168\u016b\u0001\u0000\u0000\u0000\u0169\u0167\u0001"+
		"\u0000\u0000\u0000\u016a\u016c\u0005\u0005\u0000\u0000\u016b\u016a\u0001"+
		"\u0000\u0000\u0000\u016b\u016c\u0001\u0000\u0000\u0000\u016c\u016d\u0001"+
		"\u0000\u0000\u0000\u016d\u016e\u00030\u0018\u0000\u016e\u016f\u0005\u0007"+
		"\u0000\u0000\u016f\u0173\u0005?\u0000\u0000\u0170\u0172\u0005H\u0000\u0000"+
		"\u0171\u0170\u0001\u0000\u0000\u0000\u0172\u0175\u0001\u0000\u0000\u0000"+
		"\u0173\u0171\u0001\u0000\u0000\u0000\u0173\u0174\u0001\u0000\u0000\u0000"+
		"\u0174\u026e\u0001\u0000\u0000\u0000\u0175\u0173\u0001\u0000\u0000\u0000"+
		"\u0176\u0178\u0005G\u0000\u0000\u0177\u0176\u0001\u0000\u0000\u0000\u0178"+
		"\u017b\u0001\u0000\u0000\u0000\u0179\u0177\u0001\u0000\u0000\u0000\u0179"+
		"\u017a\u0001\u0000\u0000\u0000\u017a\u017d\u0001\u0000\u0000\u0000\u017b"+
		"\u0179\u0001\u0000\u0000\u0000\u017c\u017e\u0005\u0005\u0000\u0000\u017d"+
		"\u017c\u0001\u0000\u0000\u0000\u017d\u017e\u0001\u0000\u0000\u0000\u017e"+
		"\u017f\u0001\u0000\u0000\u0000\u017f\u0180\u00030\u0018\u0000\u0180\u0181"+
		"\u0005\t\u0000\u0000\u0181\u0185\u0005@\u0000\u0000\u0182\u0184\u0005"+
		"H\u0000\u0000\u0183\u0182\u0001\u0000\u0000\u0000\u0184\u0187\u0001\u0000"+
		"\u0000\u0000\u0185\u0183\u0001\u0000\u0000\u0000\u0185\u0186\u0001\u0000"+
		"\u0000\u0000\u0186\u026e\u0001\u0000\u0000\u0000\u0187\u0185\u0001\u0000"+
		"\u0000\u0000\u0188\u018a\u0005G\u0000\u0000\u0189\u0188\u0001\u0000\u0000"+
		"\u0000\u018a\u018d\u0001\u0000\u0000\u0000\u018b\u0189\u0001\u0000\u0000"+
		"\u0000\u018b\u018c\u0001\u0000\u0000\u0000\u018c\u018f\u0001\u0000\u0000"+
		"\u0000\u018d\u018b\u0001\u0000\u0000\u0000\u018e\u0190\u0005\u0005\u0000"+
		"\u0000\u018f\u018e\u0001\u0000\u0000\u0000\u018f\u0190\u0001\u0000\u0000"+
		"\u0000\u0190\u0191\u0001\u0000\u0000\u0000\u0191\u0192\u00030\u0018\u0000"+
		"\u0192\u0193\u0005\n\u0000\u0000\u0193\u0197\u0005@\u0000\u0000\u0194"+
		"\u0196\u0005H\u0000\u0000\u0195\u0194\u0001\u0000\u0000\u0000\u0196\u0199"+
		"\u0001\u0000\u0000\u0000\u0197\u0195\u0001\u0000\u0000\u0000\u0197\u0198"+
		"\u0001\u0000\u0000\u0000\u0198\u026e\u0001\u0000\u0000\u0000\u0199\u0197"+
		"\u0001\u0000\u0000\u0000\u019a\u019c\u0005G\u0000\u0000\u019b\u019a\u0001"+
		"\u0000\u0000\u0000\u019c\u019f\u0001\u0000\u0000\u0000\u019d\u019b\u0001"+
		"\u0000\u0000\u0000\u019d\u019e\u0001\u0000\u0000\u0000\u019e\u01a1\u0001"+
		"\u0000\u0000\u0000\u019f\u019d\u0001\u0000\u0000\u0000\u01a0\u01a2\u0005"+
		"\u0005\u0000\u0000\u01a1\u01a0\u0001\u0000\u0000\u0000\u01a1\u01a2\u0001"+
		"\u0000\u0000\u0000\u01a2\u01a3\u0001\u0000\u0000\u0000\u01a3\u01a4\u0003"+
		"0\u0018\u0000\u01a4\u01a5\u0005\u000b\u0000\u0000\u01a5\u01a9\u0005@\u0000"+
		"\u0000\u01a6\u01a8\u0005H\u0000\u0000\u01a7\u01a6\u0001\u0000\u0000\u0000"+
		"\u01a8\u01ab\u0001\u0000\u0000\u0000\u01a9\u01a7\u0001\u0000\u0000\u0000"+
		"\u01a9\u01aa\u0001\u0000\u0000\u0000\u01aa\u026e\u0001\u0000\u0000\u0000"+
		"\u01ab\u01a9\u0001\u0000\u0000\u0000\u01ac\u01ae\u0005G\u0000\u0000\u01ad"+
		"\u01ac\u0001\u0000\u0000\u0000\u01ae\u01b1\u0001\u0000\u0000\u0000\u01af"+
		"\u01ad\u0001\u0000\u0000\u0000\u01af\u01b0\u0001\u0000\u0000\u0000\u01b0"+
		"\u01b2\u0001\u0000\u0000\u0000\u01b1\u01af\u0001\u0000\u0000\u0000\u01b2"+
		"\u01b4\u00030\u0018\u0000\u01b3\u01b5\u0005\u0005\u0000\u0000\u01b4\u01b3"+
		"\u0001\u0000\u0000\u0000\u01b4\u01b5\u0001\u0000\u0000\u0000\u01b5\u01b6"+
		"\u0001\u0000\u0000\u0000\u01b6\u01b7\u0005\u0006\u0000\u0000\u01b7\u01ba"+
		"\u0005G\u0000\u0000\u01b8\u01bb\u00030\u0018\u0000\u01b9\u01bb\u0003>"+
		"\u001f\u0000\u01ba\u01b8\u0001\u0000\u0000\u0000\u01ba\u01b9\u0001\u0000"+
		"\u0000\u0000\u01bb\u01bc\u0001\u0000\u0000\u0000\u01bc\u01c0\u0005H\u0000"+
		"\u0000\u01bd\u01bf\u0005H\u0000\u0000\u01be\u01bd\u0001\u0000\u0000\u0000"+
		"\u01bf\u01c2\u0001\u0000\u0000\u0000\u01c0\u01be\u0001\u0000\u0000\u0000"+
		"\u01c0\u01c1\u0001\u0000\u0000\u0000\u01c1\u026e\u0001\u0000\u0000\u0000"+
		"\u01c2\u01c0\u0001\u0000\u0000\u0000\u01c3\u01c5\u0005G\u0000\u0000\u01c4"+
		"\u01c3\u0001\u0000\u0000\u0000\u01c5\u01c8\u0001\u0000\u0000\u0000\u01c6"+
		"\u01c4\u0001\u0000\u0000\u0000\u01c6\u01c7\u0001\u0000\u0000\u0000\u01c7"+
		"\u01ca\u0001\u0000\u0000\u0000\u01c8\u01c6\u0001\u0000\u0000\u0000\u01c9"+
		"\u01cb\u0005\u0005\u0000\u0000\u01ca\u01c9\u0001\u0000\u0000\u0000\u01ca"+
		"\u01cb\u0001\u0000\u0000\u0000\u01cb\u01cc\u0001\u0000\u0000\u0000\u01cc"+
		"\u01cd\u00030\u0018\u0000\u01cd\u01ce\u0007\u0004\u0000\u0000\u01ce\u01cf"+
		"\u0007\u0005\u0000\u0000\u01cf\u01d2\u0005G\u0000\u0000\u01d0\u01d3\u0003"+
		"0\u0018\u0000\u01d1\u01d3\u0003>\u001f\u0000\u01d2\u01d0\u0001\u0000\u0000"+
		"\u0000\u01d2\u01d1\u0001\u0000\u0000\u0000\u01d3\u01d4\u0001\u0000\u0000"+
		"\u0000\u01d4\u01d8\u0005H\u0000\u0000\u01d5\u01d7\u0005H\u0000\u0000\u01d6"+
		"\u01d5\u0001\u0000\u0000\u0000\u01d7\u01da\u0001\u0000\u0000\u0000\u01d8"+
		"\u01d6\u0001\u0000\u0000\u0000\u01d8\u01d9\u0001\u0000\u0000\u0000\u01d9"+
		"\u026e\u0001\u0000\u0000\u0000\u01da\u01d8\u0001\u0000\u0000\u0000\u01db"+
		"\u01dd\u0005G\u0000\u0000\u01dc\u01db\u0001\u0000\u0000\u0000\u01dd\u01e0"+
		"\u0001\u0000\u0000\u0000\u01de\u01dc\u0001\u0000\u0000\u0000\u01de\u01df"+
		"\u0001\u0000\u0000\u0000\u01df\u01e1\u0001\u0000\u0000\u0000\u01e0\u01de"+
		"\u0001\u0000\u0000\u0000\u01e1\u01e3\u00030\u0018\u0000\u01e2\u01e4\u0005"+
		"\u0005\u0000\u0000\u01e3\u01e2\u0001\u0000\u0000\u0000\u01e3\u01e4\u0001"+
		"\u0000\u0000\u0000\u01e4\u01e5\u0001\u0000\u0000\u0000\u01e5\u01e6\u0005"+
		"%\u0000\u0000\u01e6\u01e7\u00030\u0018\u0000\u01e7\u01e8\u0005\u0002\u0000"+
		"\u0000\u01e8\u01ec\u00030\u0018\u0000\u01e9\u01eb\u0005H\u0000\u0000\u01ea"+
		"\u01e9\u0001\u0000\u0000\u0000\u01eb\u01ee\u0001\u0000\u0000\u0000\u01ec"+
		"\u01ea\u0001\u0000\u0000\u0000\u01ec\u01ed\u0001\u0000\u0000\u0000\u01ed"+
		"\u026e\u0001\u0000\u0000\u0000\u01ee\u01ec\u0001\u0000\u0000\u0000\u01ef"+
		"\u01f1\u0005G\u0000\u0000\u01f0\u01ef\u0001\u0000\u0000\u0000\u01f1\u01f4"+
		"\u0001\u0000\u0000\u0000\u01f2\u01f0\u0001\u0000\u0000\u0000\u01f2\u01f3"+
		"\u0001\u0000\u0000\u0000\u01f3\u01f5\u0001\u0000\u0000\u0000\u01f4\u01f2"+
		"\u0001\u0000\u0000\u0000\u01f5\u01f6\u00030\u0018\u0000\u01f6\u01f8\u0005"+
		"&\u0000\u0000\u01f7\u01f9\u0005\u0005\u0000\u0000\u01f8\u01f7\u0001\u0000"+
		"\u0000\u0000\u01f8\u01f9\u0001\u0000\u0000\u0000\u01f9\u01fa\u0001\u0000"+
		"\u0000\u0000\u01fa\u01fe\u0005\'\u0000\u0000\u01fb\u01fd\u0005H\u0000"+
		"\u0000\u01fc\u01fb\u0001\u0000\u0000\u0000\u01fd\u0200\u0001\u0000\u0000"+
		"\u0000\u01fe\u01fc\u0001\u0000\u0000\u0000\u01fe\u01ff\u0001\u0000\u0000"+
		"\u0000\u01ff\u026e\u0001\u0000\u0000\u0000\u0200\u01fe\u0001\u0000\u0000"+
		"\u0000\u0201\u0203\u0005G\u0000\u0000\u0202\u0201\u0001\u0000\u0000\u0000"+
		"\u0203\u0206\u0001\u0000\u0000\u0000\u0204\u0202\u0001\u0000\u0000\u0000"+
		"\u0204\u0205\u0001\u0000\u0000\u0000\u0205\u0207\u0001\u0000\u0000\u0000"+
		"\u0206\u0204\u0001\u0000\u0000\u0000\u0207\u0208\u00030\u0018\u0000\u0208"+
		"\u020a\u0005&\u0000\u0000\u0209\u020b\u0005\u0005\u0000\u0000\u020a\u0209"+
		"\u0001\u0000\u0000\u0000\u020a\u020b\u0001\u0000\u0000\u0000\u020b\u020c"+
		"\u0001\u0000\u0000\u0000\u020c\u0210\u0005(\u0000\u0000\u020d\u020f\u0005"+
		"H\u0000\u0000\u020e\u020d\u0001\u0000\u0000\u0000\u020f\u0212\u0001\u0000"+
		"\u0000\u0000\u0210\u020e\u0001\u0000\u0000\u0000\u0210\u0211\u0001\u0000"+
		"\u0000\u0000\u0211\u026e\u0001\u0000\u0000\u0000\u0212\u0210\u0001\u0000"+
		"\u0000\u0000\u0213\u0215\u0005G\u0000\u0000\u0214\u0213\u0001\u0000\u0000"+
		"\u0000\u0215\u0218\u0001\u0000\u0000\u0000\u0216\u0214\u0001\u0000\u0000"+
		"\u0000\u0216\u0217\u0001\u0000\u0000\u0000\u0217\u0219\u0001\u0000\u0000"+
		"\u0000\u0218\u0216\u0001\u0000\u0000\u0000\u0219\u021a\u00030\u0018\u0000"+
		"\u021a\u021c\u0005&\u0000\u0000\u021b\u021d\u0005\u0005\u0000\u0000\u021c"+
		"\u021b\u0001\u0000\u0000\u0000\u021c\u021d\u0001\u0000\u0000\u0000\u021d"+
		"\u021e\u0001\u0000\u0000\u0000\u021e\u0222\u0007\u0006\u0000\u0000\u021f"+
		"\u0221\u0005H\u0000\u0000\u0220\u021f\u0001\u0000\u0000\u0000\u0221\u0224"+
		"\u0001\u0000\u0000\u0000\u0222\u0220\u0001\u0000\u0000\u0000\u0222\u0223"+
		"\u0001\u0000\u0000\u0000\u0223\u026e\u0001\u0000\u0000\u0000\u0224\u0222"+
		"\u0001\u0000\u0000\u0000\u0225\u0227\u0005G\u0000\u0000\u0226\u0225\u0001"+
		"\u0000\u0000\u0000\u0227\u022a\u0001\u0000\u0000\u0000\u0228\u0226\u0001"+
		"\u0000\u0000\u0000\u0228\u0229\u0001\u0000\u0000\u0000\u0229\u022b\u0001"+
		"\u0000\u0000\u0000\u022a\u0228\u0001\u0000\u0000\u0000\u022b\u022c\u0003"+
		"0\u0018\u0000\u022c\u022e\u0005&\u0000\u0000\u022d\u022f\u0005\u0005\u0000"+
		"\u0000\u022e\u022d\u0001\u0000\u0000\u0000\u022e\u022f\u0001\u0000\u0000"+
		"\u0000\u022f\u0230\u0001\u0000\u0000\u0000\u0230\u0231\u0005 \u0000\u0000"+
		"\u0231\u0232\u0005\u0016\u0000\u0000\u0232\u0236\u00030\u0018\u0000\u0233"+
		"\u0235\u0005H\u0000\u0000\u0234\u0233\u0001\u0000\u0000\u0000\u0235\u0238"+
		"\u0001\u0000\u0000\u0000\u0236\u0234\u0001\u0000\u0000\u0000\u0236\u0237"+
		"\u0001\u0000\u0000\u0000\u0237\u026e\u0001\u0000\u0000\u0000\u0238\u0236"+
		"\u0001\u0000\u0000\u0000\u0239\u023b\u0005G\u0000\u0000\u023a\u0239\u0001"+
		"\u0000\u0000\u0000\u023b\u023e\u0001\u0000\u0000\u0000\u023c\u023a\u0001"+
		"\u0000\u0000\u0000\u023c\u023d\u0001\u0000\u0000\u0000\u023d\u0240\u0001"+
		"\u0000\u0000\u0000\u023e\u023c\u0001\u0000\u0000\u0000\u023f\u0241\u0005"+
		"\u0005\u0000\u0000\u0240\u023f\u0001\u0000\u0000\u0000\u0240\u0241\u0001"+
		"\u0000\u0000\u0000\u0241\u0242\u0001\u0000\u0000\u0000\u0242\u0243\u0005"+
		"G\u0000\u0000\u0243\u0244\u0003,\u0016\u0000\u0244\u0248\u0005H\u0000"+
		"\u0000\u0245\u0247\u0005H\u0000\u0000\u0246\u0245\u0001\u0000\u0000\u0000"+
		"\u0247\u024a\u0001\u0000\u0000\u0000\u0248\u0246\u0001\u0000\u0000\u0000"+
		"\u0248\u0249\u0001\u0000\u0000\u0000\u0249\u026e\u0001\u0000\u0000\u0000"+
		"\u024a\u0248\u0001\u0000\u0000\u0000\u024b\u024d\u0005G\u0000\u0000\u024c"+
		"\u024b\u0001\u0000\u0000\u0000\u024d\u0250\u0001\u0000\u0000\u0000\u024e"+
		"\u024c\u0001\u0000\u0000\u0000\u024e\u024f\u0001\u0000\u0000\u0000\u024f"+
		"\u0252\u0001\u0000\u0000\u0000\u0250\u024e\u0001\u0000\u0000\u0000\u0251"+
		"\u0253\u0005\u0005\u0000\u0000\u0252\u0251\u0001\u0000\u0000\u0000\u0252"+
		"\u0253\u0001\u0000\u0000\u0000\u0253\u0254\u0001\u0000\u0000\u0000\u0254"+
		"\u0255\u0005\u001b\u0000\u0000\u0255\u0259\u00032\u0019\u0000\u0256\u0258"+
		"\u0005H\u0000\u0000\u0257\u0256\u0001\u0000\u0000\u0000\u0258\u025b\u0001"+
		"\u0000\u0000\u0000\u0259\u0257\u0001\u0000\u0000\u0000\u0259\u025a\u0001"+
		"\u0000\u0000\u0000\u025a\u026e\u0001\u0000\u0000\u0000\u025b\u0259\u0001"+
		"\u0000\u0000\u0000\u025c\u025e\u0005G\u0000\u0000\u025d\u025c\u0001\u0000"+
		"\u0000\u0000\u025e\u0261\u0001\u0000\u0000\u0000\u025f\u025d\u0001\u0000"+
		"\u0000\u0000\u025f\u0260\u0001\u0000\u0000\u0000\u0260\u0263\u0001\u0000"+
		"\u0000\u0000\u0261\u025f\u0001\u0000\u0000\u0000\u0262\u0264\u0005\u0005"+
		"\u0000\u0000\u0263\u0262\u0001\u0000\u0000\u0000\u0263\u0264\u0001\u0000"+
		"\u0000\u0000\u0264\u0265\u0001\u0000\u0000\u0000\u0265\u0266\u0005\u001b"+
		"\u0000\u0000\u0266\u026a\u0003,\u0016\u0000\u0267\u0269\u0005H\u0000\u0000"+
		"\u0268\u0267\u0001\u0000\u0000\u0000\u0269\u026c\u0001\u0000\u0000\u0000"+
		"\u026a\u0268\u0001\u0000\u0000\u0000\u026a\u026b\u0001\u0000\u0000\u0000"+
		"\u026b\u026e\u0001\u0000\u0000\u0000\u026c\u026a\u0001\u0000\u0000\u0000"+
		"\u026d\u0141\u0001\u0000\u0000\u0000\u026d\u0153\u0001\u0000\u0000\u0000"+
		"\u026d\u0167\u0001\u0000\u0000\u0000\u026d\u0179\u0001\u0000\u0000\u0000"+
		"\u026d\u018b\u0001\u0000\u0000\u0000\u026d\u019d\u0001\u0000\u0000\u0000"+
		"\u026d\u01af\u0001\u0000\u0000\u0000\u026d\u01c6\u0001\u0000\u0000\u0000"+
		"\u026d\u01de\u0001\u0000\u0000\u0000\u026d\u01f2\u0001\u0000\u0000\u0000"+
		"\u026d\u0204\u0001\u0000\u0000\u0000\u026d\u0216\u0001\u0000\u0000\u0000"+
		"\u026d\u0228\u0001\u0000\u0000\u0000\u026d\u023c\u0001\u0000\u0000\u0000"+
		"\u026d\u024e\u0001\u0000\u0000\u0000\u026d\u025f\u0001\u0000\u0000\u0000"+
		"\u026e/\u0001\u0000\u0000\u0000\u026f\u0273\u0003R)\u0000\u0270\u0273"+
		"\u00032\u0019\u0000\u0271\u0273\u0003\u001c\u000e\u0000\u0272\u026f\u0001"+
		"\u0000\u0000\u0000\u0272\u0270\u0001\u0000\u0000\u0000\u0272\u0271\u0001"+
		"\u0000\u0000\u0000\u02731\u0001\u0000\u0000\u0000\u0274\u0277\u00055\u0000"+
		"\u0000\u0275\u0276\u0005B\u0000\u0000\u0276\u0278\u0003X,\u0000\u0277"+
		"\u0275\u0001\u0000\u0000\u0000\u0277\u0278\u0001\u0000\u0000\u0000\u0278"+
		"\u0280\u0001\u0000\u0000\u0000\u0279\u027a\u00055\u0000\u0000\u027a\u027d"+
		"\u00034\u001a\u0000\u027b\u027c\u0005B\u0000\u0000\u027c\u027e\u0003X"+
		",\u0000\u027d\u027b\u0001\u0000\u0000\u0000\u027d\u027e\u0001\u0000\u0000"+
		"\u0000\u027e\u0280\u0001\u0000\u0000\u0000\u027f\u0274\u0001\u0000\u0000"+
		"\u0000\u027f\u0279\u0001\u0000\u0000\u0000\u02803\u0001\u0000\u0000\u0000"+
		"\u0281\u0282\u0005E\u0000\u0000\u0282\u0283\u00036\u001b\u0000\u0283\u0284"+
		"\u0005F\u0000\u0000\u02845\u0001\u0000\u0000\u0000\u0285\u028a\u00038"+
		"\u001c\u0000\u0286\u0287\u0005\u0003\u0000\u0000\u0287\u0289\u00038\u001c"+
		"\u0000\u0288\u0286\u0001\u0000\u0000\u0000\u0289\u028c\u0001\u0000\u0000"+
		"\u0000\u028a\u0288\u0001\u0000\u0000\u0000\u028a\u028b\u0001\u0000\u0000"+
		"\u0000\u028b7\u0001\u0000\u0000\u0000\u028c\u028a\u0001\u0000\u0000\u0000"+
		"\u028d\u0292\u0003:\u001d\u0000\u028e\u028f\u0005\u0002\u0000\u0000\u028f"+
		"\u0291\u0003:\u001d\u0000\u0290\u028e\u0001\u0000\u0000\u0000\u0291\u0294"+
		"\u0001\u0000\u0000\u0000\u0292\u0290\u0001\u0000\u0000\u0000\u0292\u0293"+
		"\u0001\u0000\u0000\u0000\u02939\u0001\u0000\u0000\u0000\u0294\u0292\u0001"+
		"\u0000\u0000\u0000\u0295\u0298\u00053\u0000\u0000\u0296\u0297\u0005C\u0000"+
		"\u0000\u0297\u0299\u0007\u0007\u0000\u0000\u0298\u0296\u0001\u0000\u0000"+
		"\u0000\u0298\u0299\u0001\u0000\u0000\u0000\u0299\u02ad\u0001\u0000\u0000"+
		"\u0000\u029a\u029d\u00054\u0000\u0000\u029b\u029c\u0005C\u0000\u0000\u029c"+
		"\u029e\u0007\u0007\u0000\u0000\u029d\u029b\u0001\u0000\u0000\u0000\u029d"+
		"\u029e\u0001\u0000\u0000\u0000\u029e\u02ad\u0001\u0000\u0000\u0000\u029f"+
		"\u02a4\u0003P(\u0000\u02a0\u02a1\u0005=\u0000\u0000\u02a1\u02a5\u0003"+
		"P(\u0000\u02a2\u02a3\u0005\u0007\u0000\u0000\u02a3\u02a5\u0005?\u0000"+
		"\u0000\u02a4\u02a0\u0001\u0000\u0000\u0000\u02a4\u02a2\u0001\u0000\u0000"+
		"\u0000\u02a5\u02ad\u0001\u0000\u0000\u0000\u02a6\u02ad\u0005?\u0000\u0000"+
		"\u02a7\u02aa\u0005;\u0000\u0000\u02a8\u02a9\u0005C\u0000\u0000\u02a9\u02ab"+
		"\u0007\u0007\u0000\u0000\u02aa\u02a8\u0001\u0000\u0000\u0000\u02aa\u02ab"+
		"\u0001\u0000\u0000\u0000\u02ab\u02ad\u0001\u0000\u0000\u0000\u02ac\u0295"+
		"\u0001\u0000\u0000\u0000\u02ac\u029a\u0001\u0000\u0000\u0000\u02ac\u029f"+
		"\u0001\u0000\u0000\u0000\u02ac\u02a6\u0001\u0000\u0000\u0000\u02ac\u02a7"+
		"\u0001\u0000\u0000\u0000\u02ad;\u0001\u0000\u0000\u0000\u02ae\u02b4\u0005"+
		"?\u0000\u0000\u02af\u02b0\u0003P(\u0000\u02b0\u02b1\u0005\u0007\u0000"+
		"\u0000\u02b1\u02b2\u0005?\u0000\u0000\u02b2\u02b4\u0001\u0000\u0000\u0000"+
		"\u02b3\u02ae\u0001\u0000\u0000\u0000\u02b3\u02af\u0001\u0000\u0000\u0000"+
		"\u02b4=\u0001\u0000\u0000\u0000\u02b5\u02b9\u0003@ \u0000\u02b6\u02b9"+
		"\u00032\u0019\u0000\u02b7\u02b9\u0005>\u0000\u0000\u02b8\u02b5\u0001\u0000"+
		"\u0000\u0000\u02b8\u02b6\u0001\u0000\u0000\u0000\u02b8\u02b7\u0001\u0000"+
		"\u0000\u0000\u02b9?\u0001\u0000\u0000\u0000\u02ba\u02bd\u0003R)\u0000"+
		"\u02bb\u02bc\u0005C\u0000\u0000\u02bc\u02be\u0003@ \u0000\u02bd\u02bb"+
		"\u0001\u0000\u0000\u0000\u02bd\u02be\u0001\u0000\u0000\u0000\u02beA\u0001"+
		"\u0000\u0000\u0000\u02bf\u02c0\u0005E\u0000\u0000\u02c0\u02c1\u0003D\""+
		"\u0000\u02c1\u02c2\u0005F\u0000\u0000\u02c2C\u0001\u0000\u0000\u0000\u02c3"+
		"\u02c4\u0007\b\u0000\u0000\u02c4E\u0001\u0000\u0000\u0000\u02c5\u02c6"+
		"\u0005E\u0000\u0000\u02c6\u02c7\u0003J%\u0000\u02c7\u02c8\u0005F\u0000"+
		"\u0000\u02c8G\u0001\u0000\u0000\u0000\u02c9\u02ca\u0005E\u0000\u0000\u02ca"+
		"\u02cb\u0005!\u0000\u0000\u02cb\u02cc\u0003N\'\u0000\u02cc\u02cd\u0005"+
		"F\u0000\u0000\u02cdI\u0001\u0000\u0000\u0000\u02ce\u02d3\u0003L&\u0000"+
		"\u02cf\u02d0\u0005\u0003\u0000\u0000\u02d0\u02d2\u0003L&\u0000\u02d1\u02cf"+
		"\u0001\u0000\u0000\u0000\u02d2\u02d5\u0001\u0000\u0000\u0000\u02d3\u02d1"+
		"\u0001\u0000\u0000\u0000\u02d3\u02d4\u0001\u0000\u0000\u0000\u02d4K\u0001"+
		"\u0000\u0000\u0000\u02d5\u02d3\u0001\u0000\u0000\u0000\u02d6\u02db\u0003"+
		"N\'\u0000\u02d7\u02d8\u0005\u0002\u0000\u0000\u02d8\u02da\u0003N\'\u0000"+
		"\u02d9\u02d7\u0001\u0000\u0000\u0000\u02da\u02dd\u0001\u0000\u0000\u0000"+
		"\u02db\u02d9\u0001\u0000\u0000\u0000\u02db\u02dc\u0001\u0000\u0000\u0000"+
		"\u02dcM\u0001\u0000\u0000\u0000\u02dd\u02db\u0001\u0000\u0000\u0000\u02de"+
		"\u02df\u0003P(\u0000\u02df\u02e0\u0005=\u0000\u0000\u02e0\u02e1\u0003"+
		"P(\u0000\u02e1O\u0001\u0000\u0000\u0000\u02e2\u02e5\u0003X,\u0000\u02e3"+
		"\u02e5\u0003R)\u0000\u02e4\u02e2\u0001\u0000\u0000\u0000\u02e4\u02e3\u0001"+
		"\u0000\u0000\u0000\u02e5Q\u0001\u0000\u0000\u0000\u02e6\u02f5\u0005@\u0000"+
		"\u0000\u02e7\u02f5\u00057\u0000\u0000\u02e8\u02f5\u00058\u0000\u0000\u02e9"+
		"\u02f5\u00059\u0000\u0000\u02ea\u02f5\u0005:\u0000\u0000\u02eb\u02f5\u0005"+
		";\u0000\u0000\u02ec\u02f5\u00052\u0000\u0000\u02ed\u02f5\u0005)\u0000"+
		"\u0000\u02ee\u02f5\u0005*\u0000\u0000\u02ef\u02f5\u0005\'\u0000\u0000"+
		"\u02f0\u02f5\u0005(\u0000\u0000\u02f1\u02f5\u0003T*\u0000\u02f2\u02f5"+
		"\u0003\b\u0004\u0000\u02f3\u02f5\u0003\n\u0005\u0000\u02f4\u02e6\u0001"+
		"\u0000\u0000\u0000\u02f4\u02e7\u0001\u0000\u0000\u0000\u02f4\u02e8\u0001"+
		"\u0000\u0000\u0000\u02f4\u02e9\u0001\u0000\u0000\u0000\u02f4\u02ea\u0001"+
		"\u0000\u0000\u0000\u02f4\u02eb\u0001\u0000\u0000\u0000\u02f4\u02ec\u0001"+
		"\u0000\u0000\u0000\u02f4\u02ed\u0001\u0000\u0000\u0000\u02f4\u02ee\u0001"+
		"\u0000\u0000\u0000\u02f4\u02ef\u0001\u0000\u0000\u0000\u02f4\u02f0\u0001"+
		"\u0000\u0000\u0000\u02f4\u02f1\u0001\u0000\u0000\u0000\u02f4\u02f2\u0001"+
		"\u0000\u0000\u0000\u02f4\u02f3\u0001\u0000\u0000\u0000\u02f5S\u0001\u0000"+
		"\u0000\u0000\u02f6\u02f7\u0003V+\u0000\u02f7U\u0001\u0000\u0000\u0000"+
		"\u02f8\u02f9\u0005\b\u0000\u0000\u02f9\u02fa\u0005G\u0000\u0000\u02fa"+
		"\u02fb\u0005@\u0000\u0000\u02fb\u02fc\u0005C\u0000\u0000\u02fc\u02fd\u0005"+
		"@\u0000\u0000\u02fd\u02fe\u0005C\u0000\u0000\u02fe\u02ff\u0005@\u0000"+
		"\u0000\u02ff\u0300\u0005H\u0000\u0000\u0300W\u0001\u0000\u0000\u0000\u0301"+
		"\u0306\u0003Z-\u0000\u0302\u0303\u0005B\u0000\u0000\u0303\u0305\u0003"+
		"Z-\u0000\u0304\u0302\u0001\u0000\u0000\u0000\u0305\u0308\u0001\u0000\u0000"+
		"\u0000\u0306\u0304\u0001\u0000\u0000\u0000\u0306\u0307\u0001\u0000\u0000"+
		"\u0000\u0307Y\u0001\u0000\u0000\u0000\u0308\u0306\u0001\u0000\u0000\u0000"+
		"\u0309\u030b\u00055\u0000\u0000\u030a\u030c\u00034\u001a\u0000\u030b\u030a"+
		"\u0001\u0000\u0000\u0000\u030b\u030c\u0001\u0000\u0000\u0000\u030c[\u0001"+
		"\u0000\u0000\u0000\u030d\u030e\u0005G\u0000\u0000\u030e\u030f\u0003^/"+
		"\u0000\u030f\u0310\u0005H\u0000\u0000\u0310\u0313\u0001\u0000\u0000\u0000"+
		"\u0311\u0313\u0003^/\u0000\u0312\u030d\u0001\u0000\u0000\u0000\u0312\u0311"+
		"\u0001\u0000\u0000\u0000\u0313]\u0001\u0000\u0000\u0000\u0314\u0316\u0005"+
		"5\u0000\u0000\u0315\u0317\u00055\u0000\u0000\u0316\u0315\u0001\u0000\u0000"+
		"\u0000\u0316\u0317\u0001\u0000\u0000\u0000\u0317\u031c\u0001\u0000\u0000"+
		"\u0000\u0318\u031c\u0003`0\u0000\u0319\u031c\u0003b1\u0000\u031a\u031c"+
		"\u0003d2\u0000\u031b\u0314\u0001\u0000\u0000\u0000\u031b\u0318\u0001\u0000"+
		"\u0000\u0000\u031b\u0319\u0001\u0000\u0000\u0000\u031b\u031a\u0001\u0000"+
		"\u0000\u0000\u031c_\u0001\u0000\u0000\u0000\u031d\u031f\u00055\u0000\u0000"+
		"\u031e\u0320\u00055\u0000\u0000\u031f\u031e\u0001\u0000\u0000\u0000\u031f"+
		"\u0320\u0001\u0000\u0000\u0000\u0320\u0324\u0001\u0000\u0000\u0000\u0321"+
		"\u0322\u0005E\u0000\u0000\u0322\u0323\u00054\u0000\u0000\u0323\u0325\u0005"+
		"F\u0000\u0000\u0324\u0321\u0001\u0000\u0000\u0000\u0324\u0325\u0001\u0000"+
		"\u0000\u0000\u0325a\u0001\u0000\u0000\u0000\u0326\u0328\u0005\u001d\u0000"+
		"\u0000\u0327\u0329\u00055\u0000\u0000\u0328\u0327\u0001\u0000\u0000\u0000"+
		"\u0328\u0329\u0001\u0000\u0000\u0000\u0329\u032b\u0001\u0000\u0000\u0000"+
		"\u032a\u032c\u0003F#\u0000\u032b\u032a\u0001\u0000\u0000\u0000\u032b\u032c"+
		"\u0001\u0000\u0000\u0000\u032cc\u0001\u0000\u0000\u0000\u032d\u032f\u0005"+
		"\u001c\u0000\u0000\u032e\u0330\u00055\u0000\u0000\u032f\u032e\u0001\u0000"+
		"\u0000\u0000\u032f\u0330\u0001\u0000\u0000\u0000\u0330\u0333\u0001\u0000"+
		"\u0000\u0000\u0331\u0334\u0003F#\u0000\u0332\u0334\u0003B!\u0000\u0333"+
		"\u0331\u0001\u0000\u0000\u0000\u0333\u0332\u0001\u0000\u0000\u0000\u0333"+
		"\u0334\u0001\u0000\u0000\u0000\u0334e\u0001\u0000\u0000\u0000rkprvy{\u0085"+
		"\u008a\u0092\u0098\u009c\u00a6\u00c2\u00c6\u00c9\u00ce\u00d2\u00d5\u00da"+
		"\u00de\u00e0\u00f0\u00f8\u00fc\u0102\u0104\u010d\u0114\u011b\u0122\u0127"+
		"\u012e\u0137\u013c\u0141\u0145\u014d\u0153\u0157\u0161\u0167\u016b\u0173"+
		"\u0179\u017d\u0185\u018b\u018f\u0197\u019d\u01a1\u01a9\u01af\u01b4\u01ba"+
		"\u01c0\u01c6\u01ca\u01d2\u01d8\u01de\u01e3\u01ec\u01f2\u01f8\u01fe\u0204"+
		"\u020a\u0210\u0216\u021c\u0222\u0228\u022e\u0236\u023c\u0240\u0248\u024e"+
		"\u0252\u0259\u025f\u0263\u026a\u026d\u0272\u0277\u027d\u027f\u028a\u0292"+
		"\u0298\u029d\u02a4\u02aa\u02ac\u02b3\u02b8\u02bd\u02d3\u02db\u02e4\u02f4"+
		"\u0306\u030b\u0312\u0316\u031b\u031f\u0324\u0328\u032b\u032f\u0333";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}