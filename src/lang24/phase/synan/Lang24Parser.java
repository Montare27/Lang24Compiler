// Generated from Lang24Parser.g4 by ANTLR 4.13.1

    package lang24.phase.synan;

	import java.util.*;
	import lang24.common.report.*;
	import lang24.data.ast.tree.*;
	import lang24.data.ast.tree.type.*;
	import lang24.data.ast.tree.stmt.*;
	import lang24.data.ast.tree.expr.*;
	import lang24.data.ast.tree.defn.*;
	import lang24.data.token.*;
	import lang24.phase.lexan.*;
	import lang24.phase.abstr.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"doclint:missing", "all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class Lang24Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COMMENTS=1, STRING=2, CHARACTER=3, CARET=4, NOT=5, PLUS=6, MINUS=7, PREFIXOPERATOR=8, 
		POSTFIXOPERATOR=9, COLON=10, COMMA=11, DOT=12, LESS=13, GREATER=14, SEMICOLON=15, 
		NIL=16, NONE=17, OR=18, AND=19, SIZEOF=20, VOID=21, BOOL=22, CHAR=23, 
		INT=24, IF=25, ELSE=26, THEN=27, RETURN=28, WHILE=29, BOOLVAL=30, IDENTIFIER=31, 
		NUMBER=32, LBRACE=33, RBRACE=34, LPARENTHESIS=35, RPARENTHESIS=36, LBRACKET=37, 
		RBRACKET=38, EQUALS_R=39, NOTEQUALS_R=40, LESS_OR_EQUALS_R=41, GREATER_OR_EQUALS_R=42, 
		DIVIDE=43, STAR=44, PERCENT=45, EQUALS=46, WS=47;
	public static final int
		RULE_source = 0, RULE_definitions = 1, RULE_typeDefinition = 2, RULE_variableDefinition = 3, 
		RULE_functionDefinition = 4, RULE_parameters = 5, RULE_param = 6, RULE_statement = 7, 
		RULE_type = 8, RULE_atomType = 9, RULE_components = 10, RULE_componentList = 11, 
		RULE_component = 12, RULE_expression = 13, RULE_constExpression = 14, 
		RULE_postfixOperator = 15, RULE_prefixOperator = 16, RULE_multiplicativeOperators = 17, 
		RULE_additiveOperators = 18, RULE_relationalOperators = 19, RULE_conjuctiveOperators = 20, 
		RULE_disjunctiveOperators = 21, RULE_ptrconst = 22, RULE_voidconst = 23, 
		RULE_boolconst = 24, RULE_charconst = 25, RULE_intconst = 26, RULE_strconst = 27, 
		RULE_name = 28;
	private static String[] makeRuleNames() {
		return new String[] {
			"source", "definitions", "typeDefinition", "variableDefinition", "functionDefinition", 
			"parameters", "param", "statement", "type", "atomType", "components", 
			"componentList", "component", "expression", "constExpression", "postfixOperator", 
			"prefixOperator", "multiplicativeOperators", "additiveOperators", "relationalOperators", 
			"conjuctiveOperators", "disjunctiveOperators", "ptrconst", "voidconst", 
			"boolconst", "charconst", "intconst", "strconst", "name"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'^'", "'not'", "'+'", "'-'", null, null, "':'", 
			"','", "'.'", "'<'", "'>'", "';'", "'nil'", "'none'", "'or'", "'and'", 
			"'sizeof'", "'void'", "'bool'", "'char'", "'int'", "'if'", "'else'", 
			"'then'", "'return'", "'while'", null, null, null, "'{'", "'}'", "'('", 
			"')'", "'['", "']'", "'=='", "'!='", "'<='", "'>='", "'/'", "'*'", "'%'", 
			"'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "COMMENTS", "STRING", "CHARACTER", "CARET", "NOT", "PLUS", "MINUS", 
			"PREFIXOPERATOR", "POSTFIXOPERATOR", "COLON", "COMMA", "DOT", "LESS", 
			"GREATER", "SEMICOLON", "NIL", "NONE", "OR", "AND", "SIZEOF", "VOID", 
			"BOOL", "CHAR", "INT", "IF", "ELSE", "THEN", "RETURN", "WHILE", "BOOLVAL", 
			"IDENTIFIER", "NUMBER", "LBRACE", "RBRACE", "LPARENTHESIS", "RPARENTHESIS", 
			"LBRACKET", "RBRACKET", "EQUALS_R", "NOTEQUALS_R", "LESS_OR_EQUALS_R", 
			"GREATER_OR_EQUALS_R", "DIVIDE", "STAR", "PERCENT", "EQUALS", "WS"
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
	public String getGrammarFileName() { return "Lang24Parser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


		private Location loc(Token tok) { return new Location((LocLogToken)tok); }
		private Location loc(Token     tok1, Token     tok2) { return new Location((LocLogToken)tok1, (LocLogToken)tok2); }
		private Location loc(Token     tok1, Locatable loc2) { return new Location((LocLogToken)tok1, loc2); }
		private Location loc(Locatable loc1, Token     tok2) { return new Location(loc1, (LocLogToken)tok2); }
		private Location loc(Locatable loc1, Locatable loc2) { return new Location(loc1, loc2); }

	public Lang24Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SourceContext extends ParserRuleContext {
		public AstNodes ast;
		public DefinitionsContext definitions;
		public DefinitionsContext definitions() {
			return getRuleContext(DefinitionsContext.class,0);
		}
		public TerminalNode EOF() { return getToken(Lang24Parser.EOF, 0); }
		public SourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_source; }
	}

	public final SourceContext source() throws RecognitionException {
		SourceContext _localctx = new SourceContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_source);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			((SourceContext)_localctx).definitions = definitions();
			setState(59);
			match(EOF);
			((SourceContext)_localctx).ast =  ((SourceContext)_localctx).definitions.ast; 
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
	public static class DefinitionsContext extends ParserRuleContext {
		public AstNodes ast;
		public TypeDefinitionContext typeDefinition;
		public VariableDefinitionContext variableDefinition;
		public FunctionDefinitionContext functionDefinition;
		public List<TypeDefinitionContext> typeDefinition() {
			return getRuleContexts(TypeDefinitionContext.class);
		}
		public TypeDefinitionContext typeDefinition(int i) {
			return getRuleContext(TypeDefinitionContext.class,i);
		}
		public List<VariableDefinitionContext> variableDefinition() {
			return getRuleContexts(VariableDefinitionContext.class);
		}
		public VariableDefinitionContext variableDefinition(int i) {
			return getRuleContext(VariableDefinitionContext.class,i);
		}
		public List<FunctionDefinitionContext> functionDefinition() {
			return getRuleContexts(FunctionDefinitionContext.class);
		}
		public FunctionDefinitionContext functionDefinition(int i) {
			return getRuleContext(FunctionDefinitionContext.class,i);
		}
		public DefinitionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definitions; }
	}

	public final DefinitionsContext definitions() throws RecognitionException {
		DefinitionsContext _localctx = new DefinitionsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_definitions);

		    var nodes = new ArrayList<AstNode>();

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(71);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(62);
					((DefinitionsContext)_localctx).typeDefinition = typeDefinition();
					nodes.add(((DefinitionsContext)_localctx).typeDefinition.value);
					}
					break;
				case 2:
					{
					setState(65);
					((DefinitionsContext)_localctx).variableDefinition = variableDefinition();
					nodes.add(((DefinitionsContext)_localctx).variableDefinition.value);
					}
					break;
				case 3:
					{
					setState(68);
					((DefinitionsContext)_localctx).functionDefinition = functionDefinition();
					 nodes.add(((DefinitionsContext)_localctx).functionDefinition.value);
					}
					break;
				}
				}
				setState(73); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENTIFIER );
			 ((DefinitionsContext)_localctx).ast =  new AstNodes(loc(_localctx.start, getCurrentToken()), nodes); 
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
	public static class TypeDefinitionContext extends ParserRuleContext {
		public AstTypDefn value;
		public NameContext name;
		public TypeContext type;
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode EQUALS() { return getToken(Lang24Parser.EQUALS, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypeDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDefinition; }
	}

	public final TypeDefinitionContext typeDefinition() throws RecognitionException {
		TypeDefinitionContext _localctx = new TypeDefinitionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_typeDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			((TypeDefinitionContext)_localctx).name = name();
			setState(78);
			match(EQUALS);
			setState(79);
			((TypeDefinitionContext)_localctx).type = type();
			((TypeDefinitionContext)_localctx).value =  new AstTypDefn(loc(_localctx.start, ((TypeDefinitionContext)_localctx).type.value), ((TypeDefinitionContext)_localctx).name.value.name, ((TypeDefinitionContext)_localctx).type.value); 
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
	public static class VariableDefinitionContext extends ParserRuleContext {
		public AstVarDefn value;
		public NameContext name;
		public TypeContext type;
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode COLON() { return getToken(Lang24Parser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VariableDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDefinition; }
	}

	public final VariableDefinitionContext variableDefinition() throws RecognitionException {
		VariableDefinitionContext _localctx = new VariableDefinitionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_variableDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			((VariableDefinitionContext)_localctx).name = name();
			setState(83);
			match(COLON);
			setState(84);
			((VariableDefinitionContext)_localctx).type = type();
			((VariableDefinitionContext)_localctx).value =  new AstVarDefn(loc(_localctx.start, ((VariableDefinitionContext)_localctx).type.value), ((VariableDefinitionContext)_localctx).name.value.name, ((VariableDefinitionContext)_localctx).type.value); 
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
	public static class FunctionDefinitionContext extends ParserRuleContext {
		public AstFunDefn value;
		public NameContext name;
		public ParametersContext pars;
		public TypeContext type;
		public StatementContext stmt;
		public DefinitionsContext defns;
		public Token RBRACE;
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode LPARENTHESIS() { return getToken(Lang24Parser.LPARENTHESIS, 0); }
		public TerminalNode RPARENTHESIS() { return getToken(Lang24Parser.RPARENTHESIS, 0); }
		public TerminalNode COLON() { return getToken(Lang24Parser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode EQUALS() { return getToken(Lang24Parser.EQUALS, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(Lang24Parser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(Lang24Parser.RBRACE, 0); }
		public DefinitionsContext definitions() {
			return getRuleContext(DefinitionsContext.class,0);
		}
		public FunctionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDefinition; }
	}

	public final FunctionDefinitionContext functionDefinition() throws RecognitionException {
		FunctionDefinitionContext _localctx = new FunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_functionDefinition);

		    boolean isStmt = false;
		    boolean isDefns = false;
		    boolean arePars = false;

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			((FunctionDefinitionContext)_localctx).name = name();
			setState(88);
			match(LPARENTHESIS);
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CARET || _la==IDENTIFIER) {
				{
				arePars = true;
				setState(90);
				((FunctionDefinitionContext)_localctx).pars = parameters();
				}
			}

			setState(93);
			match(RPARENTHESIS);
			setState(94);
			match(COLON);
			setState(95);
			((FunctionDefinitionContext)_localctx).type = type();
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUALS) {
				{
				isStmt = true;
				setState(97);
				match(EQUALS);
				setState(98);
				((FunctionDefinitionContext)_localctx).stmt = statement();
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACE) {
					{
					isDefns = true;
					setState(100);
					match(LBRACE);
					setState(101);
					((FunctionDefinitionContext)_localctx).defns = definitions();
					setState(102);
					((FunctionDefinitionContext)_localctx).RBRACE = match(RBRACE);
					}
				}

				}
			}


			    var locValue = isDefns ? loc(_localctx.start, ((FunctionDefinitionContext)_localctx).RBRACE)
			        : loc(_localctx.start, isStmt ? ((FunctionDefinitionContext)_localctx).stmt.value
			        : ((FunctionDefinitionContext)_localctx).type.value);

			    ((FunctionDefinitionContext)_localctx).value =  new AstFunDefn(
			        locValue,
			        ((FunctionDefinitionContext)_localctx).name.value.name,
			        arePars ? ((FunctionDefinitionContext)_localctx).pars.value : null,
			        ((FunctionDefinitionContext)_localctx).type.value,
			        isStmt ? ((FunctionDefinitionContext)_localctx).stmt.value: null,
			        isDefns ? ((FunctionDefinitionContext)_localctx).defns.ast : null);

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
	public static class ParametersContext extends ParserRuleContext {
		public AstNodes value;
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Lang24Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Lang24Parser.COMMA, i);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			param();
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(111);
				match(COMMA);
				setState(112);
				param();
				}
				}
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

			    ((ParametersContext)_localctx).value =  new AstNodes((LocLogToken) getCurrentToken() , _localctx.param()
			        .stream()
			        .map(p -> p.value)
			        .toList());

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
	public static class ParamContext extends ParserRuleContext {
		public AstFunDefn.AstParDefn value;
		public Token CARET;
		public NameContext name;
		public TypeContext type;
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode COLON() { return getToken(Lang24Parser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode CARET() { return getToken(Lang24Parser.CARET, 0); }
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_param);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CARET) {
				{
				setState(120);
				((ParamContext)_localctx).CARET = match(CARET);
				}
			}

			setState(123);
			((ParamContext)_localctx).name = name();
			setState(124);
			match(COLON);
			setState(125);
			((ParamContext)_localctx).type = type();

			    var locValue = ((ParamContext)_localctx).CARET == null ? loc(((ParamContext)_localctx).name.value, ((ParamContext)_localctx).type.value) : loc(((ParamContext)_localctx).CARET, ((ParamContext)_localctx).type.value);

			    ((ParamContext)_localctx).value =  ((ParamContext)_localctx).CARET != null
			        ? new AstFunDefn.AstRefParDefn(locValue, ((ParamContext)_localctx).name.value.name, ((ParamContext)_localctx).type.value)
			        : new AstFunDefn.AstValParDefn(locValue, ((ParamContext)_localctx).name.value.name, ((ParamContext)_localctx).type.value);

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
	public static class StatementContext extends ParserRuleContext {
		public AstStmt value;
		public ExpressionContext expr;
		public ExpressionContext dst;
		public ExpressionContext src;
		public Token SEMICOLON;
		public ExpressionContext cond;
		public StatementContext thenStmt;
		public StatementContext elseStmt;
		public StatementContext body;
		public Token RETURN;
		public Token LBRACE;
		public Token RBRACE;
		public TerminalNode SEMICOLON() { return getToken(Lang24Parser.SEMICOLON, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode EQUALS() { return getToken(Lang24Parser.EQUALS, 0); }
		public TerminalNode IF() { return getToken(Lang24Parser.IF, 0); }
		public TerminalNode THEN() { return getToken(Lang24Parser.THEN, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(Lang24Parser.ELSE, 0); }
		public TerminalNode WHILE() { return getToken(Lang24Parser.WHILE, 0); }
		public TerminalNode COLON() { return getToken(Lang24Parser.COLON, 0); }
		public TerminalNode RETURN() { return getToken(Lang24Parser.RETURN, 0); }
		public TerminalNode LBRACE() { return getToken(Lang24Parser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(Lang24Parser.RBRACE, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_statement);

		    boolean isElseStmt = false;

		int _la;
		try {
			setState(169);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				((StatementContext)_localctx).expr = expression(0);
				setState(129);
				match(SEMICOLON);
				((StatementContext)_localctx).value =  new AstExprStmt(loc(_localctx.start), ((StatementContext)_localctx).expr.value);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(132);
				((StatementContext)_localctx).dst = expression(0);
				setState(133);
				match(EQUALS);
				setState(134);
				((StatementContext)_localctx).src = expression(0);
				setState(135);
				((StatementContext)_localctx).SEMICOLON = match(SEMICOLON);
				 ((StatementContext)_localctx).value =  new AstAssignStmt(loc(_localctx.start, ((StatementContext)_localctx).SEMICOLON), ((StatementContext)_localctx).dst.value, ((StatementContext)_localctx).src.value);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(138);
				match(IF);
				setState(139);
				((StatementContext)_localctx).cond = expression(0);
				setState(140);
				match(THEN);
				setState(141);
				((StatementContext)_localctx).thenStmt = statement();
				setState(145);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					isElseStmt = true;
					setState(143);
					match(ELSE);
					setState(144);
					((StatementContext)_localctx).elseStmt = statement();
					}
					break;
				}
				((StatementContext)_localctx).value =  new AstIfStmt(loc(_localctx.start, isElseStmt ? ((StatementContext)_localctx).elseStmt.value : ((StatementContext)_localctx).thenStmt.value), ((StatementContext)_localctx).cond.value, ((StatementContext)_localctx).thenStmt.value, isElseStmt ? ((StatementContext)_localctx).elseStmt.value : null);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(149);
				match(WHILE);
				setState(150);
				((StatementContext)_localctx).cond = expression(0);
				setState(151);
				match(COLON);
				setState(152);
				((StatementContext)_localctx).body = statement();
				 ((StatementContext)_localctx).value =  new AstWhileStmt(loc(_localctx.start, ((StatementContext)_localctx).body.value), ((StatementContext)_localctx).cond.value, ((StatementContext)_localctx).body.value); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(155);
				((StatementContext)_localctx).RETURN = match(RETURN);
				setState(156);
				((StatementContext)_localctx).expr = expression(0);
				setState(157);
				((StatementContext)_localctx).SEMICOLON = match(SEMICOLON);
				((StatementContext)_localctx).value =  new AstReturnStmt(loc(((StatementContext)_localctx).RETURN, ((StatementContext)_localctx).SEMICOLON), ((StatementContext)_localctx).expr.value); 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(160);
				((StatementContext)_localctx).LBRACE = match(LBRACE);
				setState(162); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(161);
					statement();
					}
					}
					setState(164); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 51305980156L) != 0) );
				setState(166);
				((StatementContext)_localctx).RBRACE = match(RBRACE);

				    ((StatementContext)_localctx).value =  new AstBlockStmt(loc(((StatementContext)_localctx).LBRACE, ((StatementContext)_localctx).RBRACE), _localctx.statement()
				        .stream()
				        .map(s -> s.value)
				        .toList());

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
	public static class TypeContext extends ParserRuleContext {
		public AstType value;
		public AtomTypeContext atomType;
		public Token LBRACKET;
		public IntconstContext size;
		public Token RBRACKET;
		public TypeContext elemType;
		public Token CARET;
		public TypeContext type;
		public ComponentsContext components;
		public NameContext name;
		public AtomTypeContext atomType() {
			return getRuleContext(AtomTypeContext.class,0);
		}
		public TerminalNode LBRACKET() { return getToken(Lang24Parser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(Lang24Parser.RBRACKET, 0); }
		public IntconstContext intconst() {
			return getRuleContext(IntconstContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode CARET() { return getToken(Lang24Parser.CARET, 0); }
		public ComponentsContext components() {
			return getRuleContext(ComponentsContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_type);
		try {
			setState(190);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOID:
			case BOOL:
			case CHAR:
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(171);
				((TypeContext)_localctx).atomType = atomType();
				((TypeContext)_localctx).value =  ((TypeContext)_localctx).atomType.value;
				}
				break;
			case LBRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(174);
				((TypeContext)_localctx).LBRACKET = match(LBRACKET);
				setState(175);
				((TypeContext)_localctx).size = intconst();
				setState(176);
				((TypeContext)_localctx).RBRACKET = match(RBRACKET);
				setState(177);
				((TypeContext)_localctx).elemType = type();

				    ((TypeContext)_localctx).value =  new AstArrType(loc(((TypeContext)_localctx).LBRACKET, ((TypeContext)_localctx).RBRACKET), ((TypeContext)_localctx).elemType.value, ((TypeContext)_localctx).size.value);

				    
				}
				break;
			case CARET:
				enterOuterAlt(_localctx, 3);
				{
				setState(180);
				((TypeContext)_localctx).CARET = match(CARET);
				setState(181);
				((TypeContext)_localctx).type = type();
				 ((TypeContext)_localctx).value =  new AstPtrType(loc(((TypeContext)_localctx).CARET, ((TypeContext)_localctx).type.value), ((TypeContext)_localctx).type.value); 
				}
				break;
			case LBRACE:
			case LPARENTHESIS:
				enterOuterAlt(_localctx, 4);
				{
				setState(184);
				((TypeContext)_localctx).components = components();
				 ((TypeContext)_localctx).value =  ((TypeContext)_localctx).components.value; 
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 5);
				{
				setState(187);
				((TypeContext)_localctx).name = name();
				((TypeContext)_localctx).value =  new AstNameType(((TypeContext)_localctx).name.value, ((TypeContext)_localctx).name.value.name); 
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
	public static class AtomTypeContext extends ParserRuleContext {
		public AstAtomType value;
		public Token VOID;
		public Token BOOL;
		public Token CHAR;
		public Token INT;
		public TerminalNode VOID() { return getToken(Lang24Parser.VOID, 0); }
		public TerminalNode BOOL() { return getToken(Lang24Parser.BOOL, 0); }
		public TerminalNode CHAR() { return getToken(Lang24Parser.CHAR, 0); }
		public TerminalNode INT() { return getToken(Lang24Parser.INT, 0); }
		public AtomTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomType; }
	}

	public final AtomTypeContext atomType() throws RecognitionException {
		AtomTypeContext _localctx = new AtomTypeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_atomType);
		try {
			setState(200);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOID:
				enterOuterAlt(_localctx, 1);
				{
				setState(192);
				((AtomTypeContext)_localctx).VOID = match(VOID);
				((AtomTypeContext)_localctx).value =  new AstAtomType(loc(((AtomTypeContext)_localctx).VOID), AstAtomType.Type.VOID);
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(194);
				((AtomTypeContext)_localctx).BOOL = match(BOOL);
				((AtomTypeContext)_localctx).value =  new AstAtomType(loc(((AtomTypeContext)_localctx).BOOL), AstAtomType.Type.BOOL);
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(196);
				((AtomTypeContext)_localctx).CHAR = match(CHAR);
				((AtomTypeContext)_localctx).value =  new AstAtomType(loc(((AtomTypeContext)_localctx).CHAR), AstAtomType.Type.CHAR);
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 4);
				{
				setState(198);
				((AtomTypeContext)_localctx).INT = match(INT);
				((AtomTypeContext)_localctx).value =  new AstAtomType(loc(((AtomTypeContext)_localctx).INT), AstAtomType.Type.INT);
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
	public static class ComponentsContext extends ParserRuleContext {
		public AstRecType value;
		public ComponentListContext cmps;
		public ComponentListContext componentList;
		public Token RPARENTHESIS;
		public Token RBRACE;
		public TerminalNode LPARENTHESIS() { return getToken(Lang24Parser.LPARENTHESIS, 0); }
		public TerminalNode RPARENTHESIS() { return getToken(Lang24Parser.RPARENTHESIS, 0); }
		public ComponentListContext componentList() {
			return getRuleContext(ComponentListContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(Lang24Parser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(Lang24Parser.RBRACE, 0); }
		public ComponentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_components; }
	}

	public final ComponentsContext components() throws RecognitionException {
		ComponentsContext _localctx = new ComponentsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_components);
		try {
			setState(212);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPARENTHESIS:
				enterOuterAlt(_localctx, 1);
				{
				setState(202);
				match(LPARENTHESIS);
				setState(203);
				((ComponentsContext)_localctx).cmps = ((ComponentsContext)_localctx).componentList = componentList();
				setState(204);
				((ComponentsContext)_localctx).RPARENTHESIS = match(RPARENTHESIS);
				((ComponentsContext)_localctx).value =  new AstStrType(loc(_localctx.start, ((ComponentsContext)_localctx).RPARENTHESIS), ((ComponentsContext)_localctx).componentList.value); 
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(207);
				match(LBRACE);
				setState(208);
				((ComponentsContext)_localctx).cmps = ((ComponentsContext)_localctx).componentList = componentList();
				setState(209);
				((ComponentsContext)_localctx).RBRACE = match(RBRACE);
				((ComponentsContext)_localctx).value =  new AstUniType(loc(_localctx.start, ((ComponentsContext)_localctx).RBRACE), ((ComponentsContext)_localctx).componentList.value); 
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
	public static class ComponentListContext extends ParserRuleContext {
		public AstNodes value;
		public List<ComponentContext> component() {
			return getRuleContexts(ComponentContext.class);
		}
		public ComponentContext component(int i) {
			return getRuleContext(ComponentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Lang24Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Lang24Parser.COMMA, i);
		}
		public ComponentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentList; }
	}

	public final ComponentListContext componentList() throws RecognitionException {
		ComponentListContext _localctx = new ComponentListContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_componentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			component();
			setState(219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(215);
				match(COMMA);
				setState(216);
				component();
				}
				}
				setState(221);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

			    ((ComponentListContext)_localctx).value =  new AstNodes((LocLogToken) getCurrentToken(), _localctx.component()
			        .stream()
			        .map(x -> x.value)
			        .toList());

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
	public static class ComponentContext extends ParserRuleContext {
		public AstRecType.AstCmpDefn value;
		public NameContext name;
		public TypeContext type;
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode COLON() { return getToken(Lang24Parser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ComponentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_component; }
	}

	public final ComponentContext component() throws RecognitionException {
		ComponentContext _localctx = new ComponentContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_component);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			((ComponentContext)_localctx).name = name();
			setState(225);
			match(COLON);
			setState(226);
			((ComponentContext)_localctx).type = type();
			((ComponentContext)_localctx).value =  new AstRecType.AstCmpDefn(loc(_localctx.start, ((ComponentContext)_localctx).type.value), ((ComponentContext)_localctx).name.value.name, ((ComponentContext)_localctx).type.value); 
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
		public AstExpr value;
		public ExpressionContext arr;
		public ExpressionContext expr;
		public ExpressionContext fstExpr;
		public ConstExpressionContext constExpression;
		public NameContext name;
		public Token LPARENTHESIS;
		public Token RPARENTHESIS;
		public Token LESS;
		public TypeContext type;
		public PrefixOperatorContext prefixOperator;
		public Token SIZEOF;
		public MultiplicativeOperatorsContext multiplicativeOperators;
		public ExpressionContext sndExpr;
		public AdditiveOperatorsContext additiveOperators;
		public RelationalOperatorsContext relationalOperators;
		public ConjuctiveOperatorsContext conjuctiveOperators;
		public DisjunctiveOperatorsContext disjunctiveOperators;
		public ExpressionContext idx;
		public Token RBRACKET;
		public Token CARET;
		public ConstExpressionContext constExpression() {
			return getRuleContext(ConstExpressionContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode LPARENTHESIS() { return getToken(Lang24Parser.LPARENTHESIS, 0); }
		public TerminalNode RPARENTHESIS() { return getToken(Lang24Parser.RPARENTHESIS, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Lang24Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Lang24Parser.COMMA, i);
		}
		public TerminalNode LESS() { return getToken(Lang24Parser.LESS, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode GREATER() { return getToken(Lang24Parser.GREATER, 0); }
		public PrefixOperatorContext prefixOperator() {
			return getRuleContext(PrefixOperatorContext.class,0);
		}
		public TerminalNode SIZEOF() { return getToken(Lang24Parser.SIZEOF, 0); }
		public MultiplicativeOperatorsContext multiplicativeOperators() {
			return getRuleContext(MultiplicativeOperatorsContext.class,0);
		}
		public AdditiveOperatorsContext additiveOperators() {
			return getRuleContext(AdditiveOperatorsContext.class,0);
		}
		public RelationalOperatorsContext relationalOperators() {
			return getRuleContext(RelationalOperatorsContext.class,0);
		}
		public ConjuctiveOperatorsContext conjuctiveOperators() {
			return getRuleContext(ConjuctiveOperatorsContext.class,0);
		}
		public DisjunctiveOperatorsContext disjunctiveOperators() {
			return getRuleContext(DisjunctiveOperatorsContext.class,0);
		}
		public TerminalNode LBRACKET() { return getToken(Lang24Parser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(Lang24Parser.RBRACKET, 0); }
		public TerminalNode DOT() { return getToken(Lang24Parser.DOT, 0); }
		public TerminalNode CARET() { return getToken(Lang24Parser.CARET, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_expression, _p);

		    boolean arePars = false;

		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
			case CHARACTER:
			case NIL:
			case NONE:
			case BOOLVAL:
			case NUMBER:
				{
				setState(230);
				((ExpressionContext)_localctx).constExpression = constExpression();
				 ((ExpressionContext)_localctx).value =  ((ExpressionContext)_localctx).constExpression.value; 
				}
				break;
			case IDENTIFIER:
				{
				setState(233);
				((ExpressionContext)_localctx).name = name();
				setState(247);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(234);
					((ExpressionContext)_localctx).LPARENTHESIS = match(LPARENTHESIS);
					setState(244);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 41877184764L) != 0)) {
						{
						arePars = true;
						setState(236);
						expression(0);
						setState(241);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(237);
							match(COMMA);
							setState(238);
							expression(0);
							}
							}
							setState(243);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					setState(246);
					((ExpressionContext)_localctx).RPARENTHESIS = match(RPARENTHESIS);
					}
					break;
				}


				    ((ExpressionContext)_localctx).value =  ((ExpressionContext)_localctx).LPARENTHESIS == null
				            ? ((ExpressionContext)_localctx).name.value
				            : new AstCallExpr(
				                ((ExpressionContext)_localctx).RPARENTHESIS != null
				                    ? loc(_localctx.start, ((ExpressionContext)_localctx).RPARENTHESIS)
				                    : loc(_localctx.start, ((ExpressionContext)_localctx).name.value),
				                ((ExpressionContext)_localctx).name.value.name,
				                !arePars
				                    ? null
				                    : new AstNodes(_localctx.expression()
				                        .stream()
				                        .map(e -> e.value)
				                        .toList()));

				}
				break;
			case LESS:
				{
				setState(251);
				((ExpressionContext)_localctx).LESS = match(LESS);
				setState(252);
				((ExpressionContext)_localctx).type = type();
				setState(253);
				match(GREATER);
				setState(254);
				((ExpressionContext)_localctx).expr = expression(9);
				((ExpressionContext)_localctx).value =  new AstCastExpr(loc(((ExpressionContext)_localctx).LESS, ((ExpressionContext)_localctx).expr.value), ((ExpressionContext)_localctx).type.value, ((ExpressionContext)_localctx).expr.value ); 
				}
				break;
			case CARET:
			case NOT:
			case PLUS:
			case MINUS:
				{
				setState(257);
				((ExpressionContext)_localctx).prefixOperator = prefixOperator();
				setState(258);
				((ExpressionContext)_localctx).expr = expression(8);

				    AstPfxExpr.Oper operatorVal = null;
				        switch((((ExpressionContext)_localctx).prefixOperator!=null?_input.getText(((ExpressionContext)_localctx).prefixOperator.start,((ExpressionContext)_localctx).prefixOperator.stop):null)) {
				            case "not": operatorVal = AstPfxExpr.Oper.NOT ; break;
				            case "+": operatorVal = AstPfxExpr.Oper.ADD ; break;
				            case "-": operatorVal = AstPfxExpr.Oper.SUB ; break;
				            case "^": operatorVal = AstPfxExpr.Oper.PTR ; break;
				        }
				    ((ExpressionContext)_localctx).value =  new AstPfxExpr(loc(_localctx.prefixOperator.value, ((ExpressionContext)_localctx).expr.value), operatorVal, ((ExpressionContext)_localctx).expr.value);

				}
				break;
			case SIZEOF:
				{
				setState(261);
				((ExpressionContext)_localctx).SIZEOF = match(SIZEOF);
				setState(262);
				((ExpressionContext)_localctx).LPARENTHESIS = match(LPARENTHESIS);
				setState(263);
				((ExpressionContext)_localctx).type = type();
				setState(264);
				((ExpressionContext)_localctx).RPARENTHESIS = match(RPARENTHESIS);
				((ExpressionContext)_localctx).value =  new AstSizeofExpr(loc(((ExpressionContext)_localctx).SIZEOF, ((ExpressionContext)_localctx).RPARENTHESIS), ((ExpressionContext)_localctx).type.value); 
				}
				break;
			case LPARENTHESIS:
				{
				setState(267);
				((ExpressionContext)_localctx).LPARENTHESIS = match(LPARENTHESIS);
				setState(268);
				((ExpressionContext)_localctx).expr = expression(0);
				setState(269);
				((ExpressionContext)_localctx).RPARENTHESIS = match(RPARENTHESIS);
				((ExpressionContext)_localctx).value =  ((ExpressionContext)_localctx).expr.value; 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(315);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(313);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.fstExpr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(274);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(275);
						((ExpressionContext)_localctx).multiplicativeOperators = multiplicativeOperators();
						setState(276);
						((ExpressionContext)_localctx).sndExpr = expression(8);
						((ExpressionContext)_localctx).value =  new AstBinExpr(loc(_localctx.start, ((ExpressionContext)_localctx).sndExpr.value), ((ExpressionContext)_localctx).multiplicativeOperators.value, ((ExpressionContext)_localctx).fstExpr.value, ((ExpressionContext)_localctx).sndExpr.value);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.fstExpr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(279);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(280);
						((ExpressionContext)_localctx).additiveOperators = additiveOperators();
						setState(281);
						((ExpressionContext)_localctx).sndExpr = expression(7);
						((ExpressionContext)_localctx).value =  new AstBinExpr(loc(_localctx.start, ((ExpressionContext)_localctx).sndExpr.value), ((ExpressionContext)_localctx).additiveOperators.value, ((ExpressionContext)_localctx).fstExpr.value, ((ExpressionContext)_localctx).sndExpr.value);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.fstExpr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(284);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(285);
						((ExpressionContext)_localctx).relationalOperators = relationalOperators();
						setState(286);
						((ExpressionContext)_localctx).sndExpr = expression(6);
						((ExpressionContext)_localctx).value =  new AstBinExpr(loc(_localctx.start, ((ExpressionContext)_localctx).sndExpr.value), ((ExpressionContext)_localctx).relationalOperators.value, ((ExpressionContext)_localctx).fstExpr.value, ((ExpressionContext)_localctx).sndExpr.value);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.fstExpr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(289);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(290);
						((ExpressionContext)_localctx).conjuctiveOperators = conjuctiveOperators();
						setState(291);
						((ExpressionContext)_localctx).sndExpr = expression(5);
						((ExpressionContext)_localctx).value =  new AstBinExpr(loc(_localctx.start, ((ExpressionContext)_localctx).sndExpr.value), ((ExpressionContext)_localctx).conjuctiveOperators.value, ((ExpressionContext)_localctx).fstExpr.value, ((ExpressionContext)_localctx).sndExpr.value);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.fstExpr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(294);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(295);
						((ExpressionContext)_localctx).disjunctiveOperators = disjunctiveOperators();
						setState(296);
						((ExpressionContext)_localctx).sndExpr = expression(4);
						((ExpressionContext)_localctx).value =  new AstBinExpr(loc(_localctx.start, ((ExpressionContext)_localctx).sndExpr.value), ((ExpressionContext)_localctx).disjunctiveOperators.value, ((ExpressionContext)_localctx).fstExpr.value, ((ExpressionContext)_localctx).sndExpr.value);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.arr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(299);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(300);
						match(LBRACKET);
						setState(301);
						((ExpressionContext)_localctx).idx = expression(0);
						setState(302);
						((ExpressionContext)_localctx).RBRACKET = match(RBRACKET);
						((ExpressionContext)_localctx).value =  new AstArrExpr(loc(_localctx.start, ((ExpressionContext)_localctx).RBRACKET), ((ExpressionContext)_localctx).arr.value, ((ExpressionContext)_localctx).idx.value ); 
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.expr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(305);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(306);
						match(DOT);
						setState(307);
						((ExpressionContext)_localctx).name = name();
						((ExpressionContext)_localctx).value =  new AstCmpExpr(loc(_localctx.start, ((ExpressionContext)_localctx).name.value), ((ExpressionContext)_localctx).expr.value, ((ExpressionContext)_localctx).name.value.name); 
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.expr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(310);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(311);
						((ExpressionContext)_localctx).CARET = match(CARET);
						((ExpressionContext)_localctx).value =  new AstSfxExpr(loc(_localctx.start, ((ExpressionContext)_localctx).CARET), AstSfxExpr.Oper.PTR, ((ExpressionContext)_localctx).expr.value);
						}
						break;
					}
					} 
				}
				setState(317);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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
	public static class ConstExpressionContext extends ParserRuleContext {
		public AstAtomExpr value;
		public VoidconstContext voidconst;
		public BoolconstContext boolconst;
		public CharconstContext charconst;
		public IntconstContext intconst;
		public StrconstContext strconst;
		public PtrconstContext ptrconst;
		public VoidconstContext voidconst() {
			return getRuleContext(VoidconstContext.class,0);
		}
		public BoolconstContext boolconst() {
			return getRuleContext(BoolconstContext.class,0);
		}
		public CharconstContext charconst() {
			return getRuleContext(CharconstContext.class,0);
		}
		public IntconstContext intconst() {
			return getRuleContext(IntconstContext.class,0);
		}
		public StrconstContext strconst() {
			return getRuleContext(StrconstContext.class,0);
		}
		public PtrconstContext ptrconst() {
			return getRuleContext(PtrconstContext.class,0);
		}
		public ConstExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constExpression; }
	}

	public final ConstExpressionContext constExpression() throws RecognitionException {
		ConstExpressionContext _localctx = new ConstExpressionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_constExpression);
		try {
			setState(336);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NONE:
				enterOuterAlt(_localctx, 1);
				{
				setState(318);
				((ConstExpressionContext)_localctx).voidconst = voidconst();
				((ConstExpressionContext)_localctx).value =  ((ConstExpressionContext)_localctx).voidconst.value; 
				}
				break;
			case BOOLVAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(321);
				((ConstExpressionContext)_localctx).boolconst = boolconst();
				((ConstExpressionContext)_localctx).value =  ((ConstExpressionContext)_localctx).boolconst.value; 
				}
				break;
			case CHARACTER:
				enterOuterAlt(_localctx, 3);
				{
				setState(324);
				((ConstExpressionContext)_localctx).charconst = charconst();
				((ConstExpressionContext)_localctx).value =  ((ConstExpressionContext)_localctx).charconst.value; 
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 4);
				{
				setState(327);
				((ConstExpressionContext)_localctx).intconst = intconst();
				((ConstExpressionContext)_localctx).value =  ((ConstExpressionContext)_localctx).intconst.value; 
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 5);
				{
				setState(330);
				((ConstExpressionContext)_localctx).strconst = strconst();
				((ConstExpressionContext)_localctx).value =  ((ConstExpressionContext)_localctx).strconst.value; 
				}
				break;
			case NIL:
				enterOuterAlt(_localctx, 6);
				{
				setState(333);
				((ConstExpressionContext)_localctx).ptrconst = ptrconst();
				((ConstExpressionContext)_localctx).value =  ((ConstExpressionContext)_localctx).ptrconst.value; 
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
	public static class PostfixOperatorContext extends ParserRuleContext {
		public AstSfxExpr.Oper value;
		public TerminalNode CARET() { return getToken(Lang24Parser.CARET, 0); }
		public PostfixOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixOperator; }
	}

	public final PostfixOperatorContext postfixOperator() throws RecognitionException {
		PostfixOperatorContext _localctx = new PostfixOperatorContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_postfixOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			match(CARET);
			((PostfixOperatorContext)_localctx).value =  AstSfxExpr.Oper.PTR; 
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
	public static class PrefixOperatorContext extends ParserRuleContext {
		public Token value;
		public Token NOT;
		public Token PLUS;
		public Token MINUS;
		public Token CARET;
		public TerminalNode NOT() { return getToken(Lang24Parser.NOT, 0); }
		public TerminalNode PLUS() { return getToken(Lang24Parser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(Lang24Parser.MINUS, 0); }
		public TerminalNode CARET() { return getToken(Lang24Parser.CARET, 0); }
		public PrefixOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefixOperator; }
	}

	public final PrefixOperatorContext prefixOperator() throws RecognitionException {
		PrefixOperatorContext _localctx = new PrefixOperatorContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_prefixOperator);
		try {
			setState(349);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(341);
				((PrefixOperatorContext)_localctx).NOT = match(NOT);
				((PrefixOperatorContext)_localctx).value =  (LocLogToken)((PrefixOperatorContext)_localctx).NOT; 
				}
				break;
			case PLUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(343);
				((PrefixOperatorContext)_localctx).PLUS = match(PLUS);
				((PrefixOperatorContext)_localctx).value =  (LocLogToken)((PrefixOperatorContext)_localctx).PLUS; 
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 3);
				{
				setState(345);
				((PrefixOperatorContext)_localctx).MINUS = match(MINUS);
				((PrefixOperatorContext)_localctx).value =  (LocLogToken)((PrefixOperatorContext)_localctx).MINUS; 
				}
				break;
			case CARET:
				enterOuterAlt(_localctx, 4);
				{
				setState(347);
				((PrefixOperatorContext)_localctx).CARET = match(CARET);
				((PrefixOperatorContext)_localctx).value =  (LocLogToken)((PrefixOperatorContext)_localctx).CARET; 
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
	public static class MultiplicativeOperatorsContext extends ParserRuleContext {
		public AstBinExpr.Oper value;
		public TerminalNode STAR() { return getToken(Lang24Parser.STAR, 0); }
		public TerminalNode DIVIDE() { return getToken(Lang24Parser.DIVIDE, 0); }
		public TerminalNode PERCENT() { return getToken(Lang24Parser.PERCENT, 0); }
		public MultiplicativeOperatorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeOperators; }
	}

	public final MultiplicativeOperatorsContext multiplicativeOperators() throws RecognitionException {
		MultiplicativeOperatorsContext _localctx = new MultiplicativeOperatorsContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_multiplicativeOperators);
		try {
			setState(357);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(351);
				match(STAR);
				((MultiplicativeOperatorsContext)_localctx).value =  AstBinExpr.Oper.MUL; 
				}
				break;
			case DIVIDE:
				enterOuterAlt(_localctx, 2);
				{
				setState(353);
				match(DIVIDE);
				((MultiplicativeOperatorsContext)_localctx).value =  AstBinExpr.Oper.DIV; 
				}
				break;
			case PERCENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(355);
				match(PERCENT);
				((MultiplicativeOperatorsContext)_localctx).value =  AstBinExpr.Oper.MOD; 
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
	public static class AdditiveOperatorsContext extends ParserRuleContext {
		public AstBinExpr.Oper value;
		public TerminalNode PLUS() { return getToken(Lang24Parser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(Lang24Parser.MINUS, 0); }
		public AdditiveOperatorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveOperators; }
	}

	public final AdditiveOperatorsContext additiveOperators() throws RecognitionException {
		AdditiveOperatorsContext _localctx = new AdditiveOperatorsContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_additiveOperators);
		try {
			setState(363);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(359);
				match(PLUS);
				((AdditiveOperatorsContext)_localctx).value =  AstBinExpr.Oper.ADD; 
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(361);
				match(MINUS);
				((AdditiveOperatorsContext)_localctx).value =  AstBinExpr.Oper.SUB; 
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
	public static class RelationalOperatorsContext extends ParserRuleContext {
		public AstBinExpr.Oper value;
		public TerminalNode EQUALS_R() { return getToken(Lang24Parser.EQUALS_R, 0); }
		public TerminalNode NOTEQUALS_R() { return getToken(Lang24Parser.NOTEQUALS_R, 0); }
		public TerminalNode LESS_OR_EQUALS_R() { return getToken(Lang24Parser.LESS_OR_EQUALS_R, 0); }
		public TerminalNode GREATER_OR_EQUALS_R() { return getToken(Lang24Parser.GREATER_OR_EQUALS_R, 0); }
		public TerminalNode LESS() { return getToken(Lang24Parser.LESS, 0); }
		public TerminalNode GREATER() { return getToken(Lang24Parser.GREATER, 0); }
		public RelationalOperatorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalOperators; }
	}

	public final RelationalOperatorsContext relationalOperators() throws RecognitionException {
		RelationalOperatorsContext _localctx = new RelationalOperatorsContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_relationalOperators);
		try {
			setState(377);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EQUALS_R:
				enterOuterAlt(_localctx, 1);
				{
				setState(365);
				match(EQUALS_R);
				((RelationalOperatorsContext)_localctx).value =  AstBinExpr.Oper.EQU; 
				}
				break;
			case NOTEQUALS_R:
				enterOuterAlt(_localctx, 2);
				{
				setState(367);
				match(NOTEQUALS_R);
				((RelationalOperatorsContext)_localctx).value =  AstBinExpr.Oper.NEQ; 
				}
				break;
			case LESS_OR_EQUALS_R:
				enterOuterAlt(_localctx, 3);
				{
				setState(369);
				match(LESS_OR_EQUALS_R);
				((RelationalOperatorsContext)_localctx).value =  AstBinExpr.Oper.LEQ; 
				}
				break;
			case GREATER_OR_EQUALS_R:
				enterOuterAlt(_localctx, 4);
				{
				setState(371);
				match(GREATER_OR_EQUALS_R);
				((RelationalOperatorsContext)_localctx).value =  AstBinExpr.Oper.GEQ; 
				}
				break;
			case LESS:
				enterOuterAlt(_localctx, 5);
				{
				setState(373);
				match(LESS);
				((RelationalOperatorsContext)_localctx).value =  AstBinExpr.Oper.LTH; 
				}
				break;
			case GREATER:
				enterOuterAlt(_localctx, 6);
				{
				setState(375);
				match(GREATER);
				((RelationalOperatorsContext)_localctx).value =  AstBinExpr.Oper.GTH; 
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
	public static class ConjuctiveOperatorsContext extends ParserRuleContext {
		public AstBinExpr.Oper value;
		public TerminalNode AND() { return getToken(Lang24Parser.AND, 0); }
		public ConjuctiveOperatorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conjuctiveOperators; }
	}

	public final ConjuctiveOperatorsContext conjuctiveOperators() throws RecognitionException {
		ConjuctiveOperatorsContext _localctx = new ConjuctiveOperatorsContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_conjuctiveOperators);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			match(AND);
			((ConjuctiveOperatorsContext)_localctx).value =  AstBinExpr.Oper.AND; 
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
	public static class DisjunctiveOperatorsContext extends ParserRuleContext {
		public AstBinExpr.Oper value;
		public TerminalNode OR() { return getToken(Lang24Parser.OR, 0); }
		public DisjunctiveOperatorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_disjunctiveOperators; }
	}

	public final DisjunctiveOperatorsContext disjunctiveOperators() throws RecognitionException {
		DisjunctiveOperatorsContext _localctx = new DisjunctiveOperatorsContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_disjunctiveOperators);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
			match(OR);
			((DisjunctiveOperatorsContext)_localctx).value =  AstBinExpr.Oper.OR; 
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
	public static class PtrconstContext extends ParserRuleContext {
		public AstAtomExpr value;
		public Token NIL;
		public TerminalNode NIL() { return getToken(Lang24Parser.NIL, 0); }
		public PtrconstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ptrconst; }
	}

	public final PtrconstContext ptrconst() throws RecognitionException {
		PtrconstContext _localctx = new PtrconstContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_ptrconst);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(385);
			((PtrconstContext)_localctx).NIL = match(NIL);
			((PtrconstContext)_localctx).value =  new AstAtomExpr(loc(((PtrconstContext)_localctx).NIL), AstAtomExpr.Type.PTR, (((PtrconstContext)_localctx).NIL!=null?((PtrconstContext)_localctx).NIL.getText():null)); 
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
	public static class VoidconstContext extends ParserRuleContext {
		public AstAtomExpr value;
		public Token NONE;
		public TerminalNode NONE() { return getToken(Lang24Parser.NONE, 0); }
		public VoidconstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_voidconst; }
	}

	public final VoidconstContext voidconst() throws RecognitionException {
		VoidconstContext _localctx = new VoidconstContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_voidconst);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
			((VoidconstContext)_localctx).NONE = match(NONE);
			((VoidconstContext)_localctx).value =  new AstAtomExpr(loc(((VoidconstContext)_localctx).NONE), AstAtomExpr.Type.VOID, (((VoidconstContext)_localctx).NONE!=null?((VoidconstContext)_localctx).NONE.getText():null)); 
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
	public static class BoolconstContext extends ParserRuleContext {
		public AstAtomExpr value;
		public Token BOOLVAL;
		public TerminalNode BOOLVAL() { return getToken(Lang24Parser.BOOLVAL, 0); }
		public BoolconstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolconst; }
	}

	public final BoolconstContext boolconst() throws RecognitionException {
		BoolconstContext _localctx = new BoolconstContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_boolconst);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(391);
			((BoolconstContext)_localctx).BOOLVAL = match(BOOLVAL);
			((BoolconstContext)_localctx).value =  new AstAtomExpr(loc(((BoolconstContext)_localctx).BOOLVAL), AstAtomExpr.Type.BOOL, (((BoolconstContext)_localctx).BOOLVAL!=null?((BoolconstContext)_localctx).BOOLVAL.getText():null)); 
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
	public static class CharconstContext extends ParserRuleContext {
		public AstAtomExpr value;
		public Token CHARACTER;
		public TerminalNode CHARACTER() { return getToken(Lang24Parser.CHARACTER, 0); }
		public CharconstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_charconst; }
	}

	public final CharconstContext charconst() throws RecognitionException {
		CharconstContext _localctx = new CharconstContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_charconst);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
			((CharconstContext)_localctx).CHARACTER = match(CHARACTER);
			((CharconstContext)_localctx).value =  new AstAtomExpr(loc(((CharconstContext)_localctx).CHARACTER), AstAtomExpr.Type.CHAR, (((CharconstContext)_localctx).CHARACTER!=null?((CharconstContext)_localctx).CHARACTER.getText():null)); 
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
	public static class IntconstContext extends ParserRuleContext {
		public AstAtomExpr value;
		public Token NUMBER;
		public TerminalNode NUMBER() { return getToken(Lang24Parser.NUMBER, 0); }
		public IntconstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intconst; }
	}

	public final IntconstContext intconst() throws RecognitionException {
		IntconstContext _localctx = new IntconstContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_intconst);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
			((IntconstContext)_localctx).NUMBER = match(NUMBER);
			((IntconstContext)_localctx).value =  new AstAtomExpr(loc(((IntconstContext)_localctx).NUMBER), AstAtomExpr.Type.INT, (((IntconstContext)_localctx).NUMBER!=null?((IntconstContext)_localctx).NUMBER.getText():null)); 
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
	public static class StrconstContext extends ParserRuleContext {
		public AstAtomExpr value;
		public Token STRING;
		public TerminalNode STRING() { return getToken(Lang24Parser.STRING, 0); }
		public StrconstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strconst; }
	}

	public final StrconstContext strconst() throws RecognitionException {
		StrconstContext _localctx = new StrconstContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_strconst);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(400);
			((StrconstContext)_localctx).STRING = match(STRING);
			((StrconstContext)_localctx).value =  new AstAtomExpr(loc(((StrconstContext)_localctx).STRING), AstAtomExpr.Type.STR, (((StrconstContext)_localctx).STRING!=null?((StrconstContext)_localctx).STRING.getText():null));
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
	public static class NameContext extends ParserRuleContext {
		public AstNameExpr value;
		public Token IDENTIFIER;
		public TerminalNode IDENTIFIER() { return getToken(Lang24Parser.IDENTIFIER, 0); }
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(403);
			((NameContext)_localctx).IDENTIFIER = match(IDENTIFIER);
			((NameContext)_localctx).value =  new AstNameExpr(loc(((NameContext)_localctx).IDENTIFIER), (((NameContext)_localctx).IDENTIFIER!=null?((NameContext)_localctx).IDENTIFIER.getText():null)); 
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
		case 13:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		case 4:
			return precpred(_ctx, 3);
		case 5:
			return precpred(_ctx, 12);
		case 6:
			return precpred(_ctx, 11);
		case 7:
			return precpred(_ctx, 10);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001/\u0197\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0004\u0001H\b\u0001\u000b\u0001"+
		"\f\u0001I\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		"\\\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0003\u0004i\b\u0004\u0003\u0004k\b\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0005\u0005r\b\u0005\n\u0005\f\u0005u\t"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0003\u0006z\b\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0092\b\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0004\u0007\u00a3\b\u0007\u000b\u0007\f"+
		"\u0007\u00a4\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00aa\b\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0003\b\u00bf\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0003\t\u00c9\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u00d5\b\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0005\u000b\u00da\b\u000b\n\u000b\f\u000b\u00dd"+
		"\t\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0005\r\u00f0\b\r\n\r\f\r\u00f3\t\r\u0003\r\u00f5\b\r\u0001"+
		"\r\u0003\r\u00f8\b\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u0111"+
		"\b\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0005\r\u013a\b\r\n\r\f\r\u013d\t\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e"+
		"\u0151\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0003\u0010\u015e\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0003\u0011\u0166\b\u0011\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0003\u0012\u016c\b\u0012\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u017a\b\u0013"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0000\u0001\u001a\u001d"+
		"\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e \"$&(*,.02468\u0000\u0000\u01b1\u0000:\u0001\u0000\u0000"+
		"\u0000\u0002G\u0001\u0000\u0000\u0000\u0004M\u0001\u0000\u0000\u0000\u0006"+
		"R\u0001\u0000\u0000\u0000\bW\u0001\u0000\u0000\u0000\nn\u0001\u0000\u0000"+
		"\u0000\fy\u0001\u0000\u0000\u0000\u000e\u00a9\u0001\u0000\u0000\u0000"+
		"\u0010\u00be\u0001\u0000\u0000\u0000\u0012\u00c8\u0001\u0000\u0000\u0000"+
		"\u0014\u00d4\u0001\u0000\u0000\u0000\u0016\u00d6\u0001\u0000\u0000\u0000"+
		"\u0018\u00e0\u0001\u0000\u0000\u0000\u001a\u0110\u0001\u0000\u0000\u0000"+
		"\u001c\u0150\u0001\u0000\u0000\u0000\u001e\u0152\u0001\u0000\u0000\u0000"+
		" \u015d\u0001\u0000\u0000\u0000\"\u0165\u0001\u0000\u0000\u0000$\u016b"+
		"\u0001\u0000\u0000\u0000&\u0179\u0001\u0000\u0000\u0000(\u017b\u0001\u0000"+
		"\u0000\u0000*\u017e\u0001\u0000\u0000\u0000,\u0181\u0001\u0000\u0000\u0000"+
		".\u0184\u0001\u0000\u0000\u00000\u0187\u0001\u0000\u0000\u00002\u018a"+
		"\u0001\u0000\u0000\u00004\u018d\u0001\u0000\u0000\u00006\u0190\u0001\u0000"+
		"\u0000\u00008\u0193\u0001\u0000\u0000\u0000:;\u0003\u0002\u0001\u0000"+
		";<\u0005\u0000\u0000\u0001<=\u0006\u0000\uffff\uffff\u0000=\u0001\u0001"+
		"\u0000\u0000\u0000>?\u0003\u0004\u0002\u0000?@\u0006\u0001\uffff\uffff"+
		"\u0000@H\u0001\u0000\u0000\u0000AB\u0003\u0006\u0003\u0000BC\u0006\u0001"+
		"\uffff\uffff\u0000CH\u0001\u0000\u0000\u0000DE\u0003\b\u0004\u0000EF\u0006"+
		"\u0001\uffff\uffff\u0000FH\u0001\u0000\u0000\u0000G>\u0001\u0000\u0000"+
		"\u0000GA\u0001\u0000\u0000\u0000GD\u0001\u0000\u0000\u0000HI\u0001\u0000"+
		"\u0000\u0000IG\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000JK\u0001"+
		"\u0000\u0000\u0000KL\u0006\u0001\uffff\uffff\u0000L\u0003\u0001\u0000"+
		"\u0000\u0000MN\u00038\u001c\u0000NO\u0005.\u0000\u0000OP\u0003\u0010\b"+
		"\u0000PQ\u0006\u0002\uffff\uffff\u0000Q\u0005\u0001\u0000\u0000\u0000"+
		"RS\u00038\u001c\u0000ST\u0005\n\u0000\u0000TU\u0003\u0010\b\u0000UV\u0006"+
		"\u0003\uffff\uffff\u0000V\u0007\u0001\u0000\u0000\u0000WX\u00038\u001c"+
		"\u0000X[\u0005#\u0000\u0000YZ\u0006\u0004\uffff\uffff\u0000Z\\\u0003\n"+
		"\u0005\u0000[Y\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000\\]\u0001"+
		"\u0000\u0000\u0000]^\u0005$\u0000\u0000^_\u0005\n\u0000\u0000_j\u0003"+
		"\u0010\b\u0000`a\u0006\u0004\uffff\uffff\u0000ab\u0005.\u0000\u0000bh"+
		"\u0003\u000e\u0007\u0000cd\u0006\u0004\uffff\uffff\u0000de\u0005!\u0000"+
		"\u0000ef\u0003\u0002\u0001\u0000fg\u0005\"\u0000\u0000gi\u0001\u0000\u0000"+
		"\u0000hc\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000ik\u0001\u0000"+
		"\u0000\u0000j`\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000\u0000kl\u0001"+
		"\u0000\u0000\u0000lm\u0006\u0004\uffff\uffff\u0000m\t\u0001\u0000\u0000"+
		"\u0000ns\u0003\f\u0006\u0000op\u0005\u000b\u0000\u0000pr\u0003\f\u0006"+
		"\u0000qo\u0001\u0000\u0000\u0000ru\u0001\u0000\u0000\u0000sq\u0001\u0000"+
		"\u0000\u0000st\u0001\u0000\u0000\u0000tv\u0001\u0000\u0000\u0000us\u0001"+
		"\u0000\u0000\u0000vw\u0006\u0005\uffff\uffff\u0000w\u000b\u0001\u0000"+
		"\u0000\u0000xz\u0005\u0004\u0000\u0000yx\u0001\u0000\u0000\u0000yz\u0001"+
		"\u0000\u0000\u0000z{\u0001\u0000\u0000\u0000{|\u00038\u001c\u0000|}\u0005"+
		"\n\u0000\u0000}~\u0003\u0010\b\u0000~\u007f\u0006\u0006\uffff\uffff\u0000"+
		"\u007f\r\u0001\u0000\u0000\u0000\u0080\u0081\u0003\u001a\r\u0000\u0081"+
		"\u0082\u0005\u000f\u0000\u0000\u0082\u0083\u0006\u0007\uffff\uffff\u0000"+
		"\u0083\u00aa\u0001\u0000\u0000\u0000\u0084\u0085\u0003\u001a\r\u0000\u0085"+
		"\u0086\u0005.\u0000\u0000\u0086\u0087\u0003\u001a\r\u0000\u0087\u0088"+
		"\u0005\u000f\u0000\u0000\u0088\u0089\u0006\u0007\uffff\uffff\u0000\u0089"+
		"\u00aa\u0001\u0000\u0000\u0000\u008a\u008b\u0005\u0019\u0000\u0000\u008b"+
		"\u008c\u0003\u001a\r\u0000\u008c\u008d\u0005\u001b\u0000\u0000\u008d\u0091"+
		"\u0003\u000e\u0007\u0000\u008e\u008f\u0006\u0007\uffff\uffff\u0000\u008f"+
		"\u0090\u0005\u001a\u0000\u0000\u0090\u0092\u0003\u000e\u0007\u0000\u0091"+
		"\u008e\u0001\u0000\u0000\u0000\u0091\u0092\u0001\u0000\u0000\u0000\u0092"+
		"\u0093\u0001\u0000\u0000\u0000\u0093\u0094\u0006\u0007\uffff\uffff\u0000"+
		"\u0094\u00aa\u0001\u0000\u0000\u0000\u0095\u0096\u0005\u001d\u0000\u0000"+
		"\u0096\u0097\u0003\u001a\r\u0000\u0097\u0098\u0005\n\u0000\u0000\u0098"+
		"\u0099\u0003\u000e\u0007\u0000\u0099\u009a\u0006\u0007\uffff\uffff\u0000"+
		"\u009a\u00aa\u0001\u0000\u0000\u0000\u009b\u009c\u0005\u001c\u0000\u0000"+
		"\u009c\u009d\u0003\u001a\r\u0000\u009d\u009e\u0005\u000f\u0000\u0000\u009e"+
		"\u009f\u0006\u0007\uffff\uffff\u0000\u009f\u00aa\u0001\u0000\u0000\u0000"+
		"\u00a0\u00a2\u0005!\u0000\u0000\u00a1\u00a3\u0003\u000e\u0007\u0000\u00a2"+
		"\u00a1\u0001\u0000\u0000\u0000\u00a3\u00a4\u0001\u0000\u0000\u0000\u00a4"+
		"\u00a2\u0001\u0000\u0000\u0000\u00a4\u00a5\u0001\u0000\u0000\u0000\u00a5"+
		"\u00a6\u0001\u0000\u0000\u0000\u00a6\u00a7\u0005\"\u0000\u0000\u00a7\u00a8"+
		"\u0006\u0007\uffff\uffff\u0000\u00a8\u00aa\u0001\u0000\u0000\u0000\u00a9"+
		"\u0080\u0001\u0000\u0000\u0000\u00a9\u0084\u0001\u0000\u0000\u0000\u00a9"+
		"\u008a\u0001\u0000\u0000\u0000\u00a9\u0095\u0001\u0000\u0000\u0000\u00a9"+
		"\u009b\u0001\u0000\u0000\u0000\u00a9\u00a0\u0001\u0000\u0000\u0000\u00aa"+
		"\u000f\u0001\u0000\u0000\u0000\u00ab\u00ac\u0003\u0012\t\u0000\u00ac\u00ad"+
		"\u0006\b\uffff\uffff\u0000\u00ad\u00bf\u0001\u0000\u0000\u0000\u00ae\u00af"+
		"\u0005%\u0000\u0000\u00af\u00b0\u00034\u001a\u0000\u00b0\u00b1\u0005&"+
		"\u0000\u0000\u00b1\u00b2\u0003\u0010\b\u0000\u00b2\u00b3\u0006\b\uffff"+
		"\uffff\u0000\u00b3\u00bf\u0001\u0000\u0000\u0000\u00b4\u00b5\u0005\u0004"+
		"\u0000\u0000\u00b5\u00b6\u0003\u0010\b\u0000\u00b6\u00b7\u0006\b\uffff"+
		"\uffff\u0000\u00b7\u00bf\u0001\u0000\u0000\u0000\u00b8\u00b9\u0003\u0014"+
		"\n\u0000\u00b9\u00ba\u0006\b\uffff\uffff\u0000\u00ba\u00bf\u0001\u0000"+
		"\u0000\u0000\u00bb\u00bc\u00038\u001c\u0000\u00bc\u00bd\u0006\b\uffff"+
		"\uffff\u0000\u00bd\u00bf\u0001\u0000\u0000\u0000\u00be\u00ab\u0001\u0000"+
		"\u0000\u0000\u00be\u00ae\u0001\u0000\u0000\u0000\u00be\u00b4\u0001\u0000"+
		"\u0000\u0000\u00be\u00b8\u0001\u0000\u0000\u0000\u00be\u00bb\u0001\u0000"+
		"\u0000\u0000\u00bf\u0011\u0001\u0000\u0000\u0000\u00c0\u00c1\u0005\u0015"+
		"\u0000\u0000\u00c1\u00c9\u0006\t\uffff\uffff\u0000\u00c2\u00c3\u0005\u0016"+
		"\u0000\u0000\u00c3\u00c9\u0006\t\uffff\uffff\u0000\u00c4\u00c5\u0005\u0017"+
		"\u0000\u0000\u00c5\u00c9\u0006\t\uffff\uffff\u0000\u00c6\u00c7\u0005\u0018"+
		"\u0000\u0000\u00c7\u00c9\u0006\t\uffff\uffff\u0000\u00c8\u00c0\u0001\u0000"+
		"\u0000\u0000\u00c8\u00c2\u0001\u0000\u0000\u0000\u00c8\u00c4\u0001\u0000"+
		"\u0000\u0000\u00c8\u00c6\u0001\u0000\u0000\u0000\u00c9\u0013\u0001\u0000"+
		"\u0000\u0000\u00ca\u00cb\u0005#\u0000\u0000\u00cb\u00cc\u0003\u0016\u000b"+
		"\u0000\u00cc\u00cd\u0005$\u0000\u0000\u00cd\u00ce\u0006\n\uffff\uffff"+
		"\u0000\u00ce\u00d5\u0001\u0000\u0000\u0000\u00cf\u00d0\u0005!\u0000\u0000"+
		"\u00d0\u00d1\u0003\u0016\u000b\u0000\u00d1\u00d2\u0005\"\u0000\u0000\u00d2"+
		"\u00d3\u0006\n\uffff\uffff\u0000\u00d3\u00d5\u0001\u0000\u0000\u0000\u00d4"+
		"\u00ca\u0001\u0000\u0000\u0000\u00d4\u00cf\u0001\u0000\u0000\u0000\u00d5"+
		"\u0015\u0001\u0000\u0000\u0000\u00d6\u00db\u0003\u0018\f\u0000\u00d7\u00d8"+
		"\u0005\u000b\u0000\u0000\u00d8\u00da\u0003\u0018\f\u0000\u00d9\u00d7\u0001"+
		"\u0000\u0000\u0000\u00da\u00dd\u0001\u0000\u0000\u0000\u00db\u00d9\u0001"+
		"\u0000\u0000\u0000\u00db\u00dc\u0001\u0000\u0000\u0000\u00dc\u00de\u0001"+
		"\u0000\u0000\u0000\u00dd\u00db\u0001\u0000\u0000\u0000\u00de\u00df\u0006"+
		"\u000b\uffff\uffff\u0000\u00df\u0017\u0001\u0000\u0000\u0000\u00e0\u00e1"+
		"\u00038\u001c\u0000\u00e1\u00e2\u0005\n\u0000\u0000\u00e2\u00e3\u0003"+
		"\u0010\b\u0000\u00e3\u00e4\u0006\f\uffff\uffff\u0000\u00e4\u0019\u0001"+
		"\u0000\u0000\u0000\u00e5\u00e6\u0006\r\uffff\uffff\u0000\u00e6\u00e7\u0003"+
		"\u001c\u000e\u0000\u00e7\u00e8\u0006\r\uffff\uffff\u0000\u00e8\u0111\u0001"+
		"\u0000\u0000\u0000\u00e9\u00f7\u00038\u001c\u0000\u00ea\u00f4\u0005#\u0000"+
		"\u0000\u00eb\u00ec\u0006\r\uffff\uffff\u0000\u00ec\u00f1\u0003\u001a\r"+
		"\u0000\u00ed\u00ee\u0005\u000b\u0000\u0000\u00ee\u00f0\u0003\u001a\r\u0000"+
		"\u00ef\u00ed\u0001\u0000\u0000\u0000\u00f0\u00f3\u0001\u0000\u0000\u0000"+
		"\u00f1\u00ef\u0001\u0000\u0000\u0000\u00f1\u00f2\u0001\u0000\u0000\u0000"+
		"\u00f2\u00f5\u0001\u0000\u0000\u0000\u00f3\u00f1\u0001\u0000\u0000\u0000"+
		"\u00f4\u00eb\u0001\u0000\u0000\u0000\u00f4\u00f5\u0001\u0000\u0000\u0000"+
		"\u00f5\u00f6\u0001\u0000\u0000\u0000\u00f6\u00f8\u0005$\u0000\u0000\u00f7"+
		"\u00ea\u0001\u0000\u0000\u0000\u00f7\u00f8\u0001\u0000\u0000\u0000\u00f8"+
		"\u00f9\u0001\u0000\u0000\u0000\u00f9\u00fa\u0006\r\uffff\uffff\u0000\u00fa"+
		"\u0111\u0001\u0000\u0000\u0000\u00fb\u00fc\u0005\r\u0000\u0000\u00fc\u00fd"+
		"\u0003\u0010\b\u0000\u00fd\u00fe\u0005\u000e\u0000\u0000\u00fe\u00ff\u0003"+
		"\u001a\r\t\u00ff\u0100\u0006\r\uffff\uffff\u0000\u0100\u0111\u0001\u0000"+
		"\u0000\u0000\u0101\u0102\u0003 \u0010\u0000\u0102\u0103\u0003\u001a\r"+
		"\b\u0103\u0104\u0006\r\uffff\uffff\u0000\u0104\u0111\u0001\u0000\u0000"+
		"\u0000\u0105\u0106\u0005\u0014\u0000\u0000\u0106\u0107\u0005#\u0000\u0000"+
		"\u0107\u0108\u0003\u0010\b\u0000\u0108\u0109\u0005$\u0000\u0000\u0109"+
		"\u010a\u0006\r\uffff\uffff\u0000\u010a\u0111\u0001\u0000\u0000\u0000\u010b"+
		"\u010c\u0005#\u0000\u0000\u010c\u010d\u0003\u001a\r\u0000\u010d\u010e"+
		"\u0005$\u0000\u0000\u010e\u010f\u0006\r\uffff\uffff\u0000\u010f\u0111"+
		"\u0001\u0000\u0000\u0000\u0110\u00e5\u0001\u0000\u0000\u0000\u0110\u00e9"+
		"\u0001\u0000\u0000\u0000\u0110\u00fb\u0001\u0000\u0000\u0000\u0110\u0101"+
		"\u0001\u0000\u0000\u0000\u0110\u0105\u0001\u0000\u0000\u0000\u0110\u010b"+
		"\u0001\u0000\u0000\u0000\u0111\u013b\u0001\u0000\u0000\u0000\u0112\u0113"+
		"\n\u0007\u0000\u0000\u0113\u0114\u0003\"\u0011\u0000\u0114\u0115\u0003"+
		"\u001a\r\b\u0115\u0116\u0006\r\uffff\uffff\u0000\u0116\u013a\u0001\u0000"+
		"\u0000\u0000\u0117\u0118\n\u0006\u0000\u0000\u0118\u0119\u0003$\u0012"+
		"\u0000\u0119\u011a\u0003\u001a\r\u0007\u011a\u011b\u0006\r\uffff\uffff"+
		"\u0000\u011b\u013a\u0001\u0000\u0000\u0000\u011c\u011d\n\u0005\u0000\u0000"+
		"\u011d\u011e\u0003&\u0013\u0000\u011e\u011f\u0003\u001a\r\u0006\u011f"+
		"\u0120\u0006\r\uffff\uffff\u0000\u0120\u013a\u0001\u0000\u0000\u0000\u0121"+
		"\u0122\n\u0004\u0000\u0000\u0122\u0123\u0003(\u0014\u0000\u0123\u0124"+
		"\u0003\u001a\r\u0005\u0124\u0125\u0006\r\uffff\uffff\u0000\u0125\u013a"+
		"\u0001\u0000\u0000\u0000\u0126\u0127\n\u0003\u0000\u0000\u0127\u0128\u0003"+
		"*\u0015\u0000\u0128\u0129\u0003\u001a\r\u0004\u0129\u012a\u0006\r\uffff"+
		"\uffff\u0000\u012a\u013a\u0001\u0000\u0000\u0000\u012b\u012c\n\f\u0000"+
		"\u0000\u012c\u012d\u0005%\u0000\u0000\u012d\u012e\u0003\u001a\r\u0000"+
		"\u012e\u012f\u0005&\u0000\u0000\u012f\u0130\u0006\r\uffff\uffff\u0000"+
		"\u0130\u013a\u0001\u0000\u0000\u0000\u0131\u0132\n\u000b\u0000\u0000\u0132"+
		"\u0133\u0005\f\u0000\u0000\u0133\u0134\u00038\u001c\u0000\u0134\u0135"+
		"\u0006\r\uffff\uffff\u0000\u0135\u013a\u0001\u0000\u0000\u0000\u0136\u0137"+
		"\n\n\u0000\u0000\u0137\u0138\u0005\u0004\u0000\u0000\u0138\u013a\u0006"+
		"\r\uffff\uffff\u0000\u0139\u0112\u0001\u0000\u0000\u0000\u0139\u0117\u0001"+
		"\u0000\u0000\u0000\u0139\u011c\u0001\u0000\u0000\u0000\u0139\u0121\u0001"+
		"\u0000\u0000\u0000\u0139\u0126\u0001\u0000\u0000\u0000\u0139\u012b\u0001"+
		"\u0000\u0000\u0000\u0139\u0131\u0001\u0000\u0000\u0000\u0139\u0136\u0001"+
		"\u0000\u0000\u0000\u013a\u013d\u0001\u0000\u0000\u0000\u013b\u0139\u0001"+
		"\u0000\u0000\u0000\u013b\u013c\u0001\u0000\u0000\u0000\u013c\u001b\u0001"+
		"\u0000\u0000\u0000\u013d\u013b\u0001\u0000\u0000\u0000\u013e\u013f\u0003"+
		".\u0017\u0000\u013f\u0140\u0006\u000e\uffff\uffff\u0000\u0140\u0151\u0001"+
		"\u0000\u0000\u0000\u0141\u0142\u00030\u0018\u0000\u0142\u0143\u0006\u000e"+
		"\uffff\uffff\u0000\u0143\u0151\u0001\u0000\u0000\u0000\u0144\u0145\u0003"+
		"2\u0019\u0000\u0145\u0146\u0006\u000e\uffff\uffff\u0000\u0146\u0151\u0001"+
		"\u0000\u0000\u0000\u0147\u0148\u00034\u001a\u0000\u0148\u0149\u0006\u000e"+
		"\uffff\uffff\u0000\u0149\u0151\u0001\u0000\u0000\u0000\u014a\u014b\u0003"+
		"6\u001b\u0000\u014b\u014c\u0006\u000e\uffff\uffff\u0000\u014c\u0151\u0001"+
		"\u0000\u0000\u0000\u014d\u014e\u0003,\u0016\u0000\u014e\u014f\u0006\u000e"+
		"\uffff\uffff\u0000\u014f\u0151\u0001\u0000\u0000\u0000\u0150\u013e\u0001"+
		"\u0000\u0000\u0000\u0150\u0141\u0001\u0000\u0000\u0000\u0150\u0144\u0001"+
		"\u0000\u0000\u0000\u0150\u0147\u0001\u0000\u0000\u0000\u0150\u014a\u0001"+
		"\u0000\u0000\u0000\u0150\u014d\u0001\u0000\u0000\u0000\u0151\u001d\u0001"+
		"\u0000\u0000\u0000\u0152\u0153\u0005\u0004\u0000\u0000\u0153\u0154\u0006"+
		"\u000f\uffff\uffff\u0000\u0154\u001f\u0001\u0000\u0000\u0000\u0155\u0156"+
		"\u0005\u0005\u0000\u0000\u0156\u015e\u0006\u0010\uffff\uffff\u0000\u0157"+
		"\u0158\u0005\u0006\u0000\u0000\u0158\u015e\u0006\u0010\uffff\uffff\u0000"+
		"\u0159\u015a\u0005\u0007\u0000\u0000\u015a\u015e\u0006\u0010\uffff\uffff"+
		"\u0000\u015b\u015c\u0005\u0004\u0000\u0000\u015c\u015e\u0006\u0010\uffff"+
		"\uffff\u0000\u015d\u0155\u0001\u0000\u0000\u0000\u015d\u0157\u0001\u0000"+
		"\u0000\u0000\u015d\u0159\u0001\u0000\u0000\u0000\u015d\u015b\u0001\u0000"+
		"\u0000\u0000\u015e!\u0001\u0000\u0000\u0000\u015f\u0160\u0005,\u0000\u0000"+
		"\u0160\u0166\u0006\u0011\uffff\uffff\u0000\u0161\u0162\u0005+\u0000\u0000"+
		"\u0162\u0166\u0006\u0011\uffff\uffff\u0000\u0163\u0164\u0005-\u0000\u0000"+
		"\u0164\u0166\u0006\u0011\uffff\uffff\u0000\u0165\u015f\u0001\u0000\u0000"+
		"\u0000\u0165\u0161\u0001\u0000\u0000\u0000\u0165\u0163\u0001\u0000\u0000"+
		"\u0000\u0166#\u0001\u0000\u0000\u0000\u0167\u0168\u0005\u0006\u0000\u0000"+
		"\u0168\u016c\u0006\u0012\uffff\uffff\u0000\u0169\u016a\u0005\u0007\u0000"+
		"\u0000\u016a\u016c\u0006\u0012\uffff\uffff\u0000\u016b\u0167\u0001\u0000"+
		"\u0000\u0000\u016b\u0169\u0001\u0000\u0000\u0000\u016c%\u0001\u0000\u0000"+
		"\u0000\u016d\u016e\u0005\'\u0000\u0000\u016e\u017a\u0006\u0013\uffff\uffff"+
		"\u0000\u016f\u0170\u0005(\u0000\u0000\u0170\u017a\u0006\u0013\uffff\uffff"+
		"\u0000\u0171\u0172\u0005)\u0000\u0000\u0172\u017a\u0006\u0013\uffff\uffff"+
		"\u0000\u0173\u0174\u0005*\u0000\u0000\u0174\u017a\u0006\u0013\uffff\uffff"+
		"\u0000\u0175\u0176\u0005\r\u0000\u0000\u0176\u017a\u0006\u0013\uffff\uffff"+
		"\u0000\u0177\u0178\u0005\u000e\u0000\u0000\u0178\u017a\u0006\u0013\uffff"+
		"\uffff\u0000\u0179\u016d\u0001\u0000\u0000\u0000\u0179\u016f\u0001\u0000"+
		"\u0000\u0000\u0179\u0171\u0001\u0000\u0000\u0000\u0179\u0173\u0001\u0000"+
		"\u0000\u0000\u0179\u0175\u0001\u0000\u0000\u0000\u0179\u0177\u0001\u0000"+
		"\u0000\u0000\u017a\'\u0001\u0000\u0000\u0000\u017b\u017c\u0005\u0013\u0000"+
		"\u0000\u017c\u017d\u0006\u0014\uffff\uffff\u0000\u017d)\u0001\u0000\u0000"+
		"\u0000\u017e\u017f\u0005\u0012\u0000\u0000\u017f\u0180\u0006\u0015\uffff"+
		"\uffff\u0000\u0180+\u0001\u0000\u0000\u0000\u0181\u0182\u0005\u0010\u0000"+
		"\u0000\u0182\u0183\u0006\u0016\uffff\uffff\u0000\u0183-\u0001\u0000\u0000"+
		"\u0000\u0184\u0185\u0005\u0011\u0000\u0000\u0185\u0186\u0006\u0017\uffff"+
		"\uffff\u0000\u0186/\u0001\u0000\u0000\u0000\u0187\u0188\u0005\u001e\u0000"+
		"\u0000\u0188\u0189\u0006\u0018\uffff\uffff\u0000\u01891\u0001\u0000\u0000"+
		"\u0000\u018a\u018b\u0005\u0003\u0000\u0000\u018b\u018c\u0006\u0019\uffff"+
		"\uffff\u0000\u018c3\u0001\u0000\u0000\u0000\u018d\u018e\u0005 \u0000\u0000"+
		"\u018e\u018f\u0006\u001a\uffff\uffff\u0000\u018f5\u0001\u0000\u0000\u0000"+
		"\u0190\u0191\u0005\u0002\u0000\u0000\u0191\u0192\u0006\u001b\uffff\uffff"+
		"\u0000\u01927\u0001\u0000\u0000\u0000\u0193\u0194\u0005\u001f\u0000\u0000"+
		"\u0194\u0195\u0006\u001c\uffff\uffff\u0000\u01959\u0001\u0000\u0000\u0000"+
		"\u0019GI[hjsy\u0091\u00a4\u00a9\u00be\u00c8\u00d4\u00db\u00f1\u00f4\u00f7"+
		"\u0110\u0139\u013b\u0150\u015d\u0165\u016b\u0179";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}