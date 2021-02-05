// Generated from /home/awwmiir/compiler/Phase2/src/main/grammar/Sophia.g4 by ANTLR 4.8
package main.grammar;

    import main.ast.types.*;
    import main.ast.types.functionPointer.*;
    import main.ast.types.list.*;
    import main.ast.types.single.*;
    import main.ast.nodes.*;
    import main.ast.nodes.declaration.*;
    import main.ast.nodes.declaration.classDec.*;
    import main.ast.nodes.declaration.classDec.classMembersDec.*;
    import main.ast.nodes.declaration.variableDec.*;
    import main.ast.nodes.expression.*;
    import main.ast.nodes.expression.operators.*;
    import main.ast.nodes.expression.values.*;
    import main.ast.nodes.expression.values.primitive.*;
    import main.ast.nodes.statement.*;
    import main.ast.nodes.statement.loop.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SophiaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DEF=1, EXTENDS=2, CLASS=3, PRINT=4, FUNC=5, NEW=6, CONTINUE=7, BREAK=8, 
		RETURN=9, FOREACH=10, IN=11, FOR=12, IF=13, ELSE=14, BOOLEAN=15, STRING=16, 
		INT=17, VOID=18, NULL=19, LIST=20, TRUE=21, FALSE=22, THIS=23, ARROW=24, 
		GREATER_THAN=25, LESS_THAN=26, NOT_EQUAL=27, EQUAL=28, MULT=29, DIVIDE=30, 
		MOD=31, PLUS=32, MINUS=33, AND=34, OR=35, NOT=36, QUESTION_MARK=37, ASSIGN=38, 
		INCREMENT=39, DECREMENT=40, LPAR=41, RPAR=42, LBRACK=43, RBRACK=44, LBRACE=45, 
		RBRACE=46, SHARP=47, COMMA=48, DOT=49, COLON=50, SEMICOLLON=51, INT_VALUE=52, 
		IDENTIFIER=53, STRING_VALUE=54, COMMENT=55, WS=56;
	public static final int
		RULE_sophia = 0, RULE_program = 1, RULE_sophiaClass = 2, RULE_varDeclaration = 3, 
		RULE_method = 4, RULE_constructor = 5, RULE_methodArguments = 6, RULE_variableWithType = 7, 
		RULE_type = 8, RULE_classType = 9, RULE_listType = 10, RULE_listItemsTypes = 11, 
		RULE_listItemType = 12, RULE_functionPointerType = 13, RULE_typesWithComma = 14, 
		RULE_primitiveDataType = 15, RULE_methodBody = 16, RULE_statement = 17, 
		RULE_block = 18, RULE_assignmentStatement = 19, RULE_assignment = 20, 
		RULE_printStatement = 21, RULE_returnStatement = 22, RULE_methodCallStatement = 23, 
		RULE_methodCall = 24, RULE_methodCallArguments = 25, RULE_continueBreakStatement = 26, 
		RULE_forStatement = 27, RULE_foreachStatement = 28, RULE_ifStatement = 29, 
		RULE_expression = 30, RULE_orExpression = 31, RULE_andExpression = 32, 
		RULE_equalityExpression = 33, RULE_relationalExpression = 34, RULE_additiveExpression = 35, 
		RULE_multiplicativeExpression = 36, RULE_preUnaryExpression = 37, RULE_postUnaryExpression = 38, 
		RULE_accessExpression = 39, RULE_otherExpression = 40, RULE_newExpression = 41, 
		RULE_values = 42, RULE_boolValue = 43, RULE_listValue = 44, RULE_identifier = 45;
	private static String[] makeRuleNames() {
		return new String[] {
			"sophia", "program", "sophiaClass", "varDeclaration", "method", "constructor", 
			"methodArguments", "variableWithType", "type", "classType", "listType", 
			"listItemsTypes", "listItemType", "functionPointerType", "typesWithComma", 
			"primitiveDataType", "methodBody", "statement", "block", "assignmentStatement", 
			"assignment", "printStatement", "returnStatement", "methodCallStatement", 
			"methodCall", "methodCallArguments", "continueBreakStatement", "forStatement", 
			"foreachStatement", "ifStatement", "expression", "orExpression", "andExpression", 
			"equalityExpression", "relationalExpression", "additiveExpression", "multiplicativeExpression", 
			"preUnaryExpression", "postUnaryExpression", "accessExpression", "otherExpression", 
			"newExpression", "values", "boolValue", "listValue", "identifier"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'def'", "'extends'", "'class'", "'print'", "'func'", "'new'", 
			"'continue'", "'break'", "'return'", "'foreach'", "'in'", "'for'", "'if'", 
			"'else'", "'bool'", "'string'", "'int'", "'void'", "'null'", "'list'", 
			"'true'", "'false'", "'this'", "'->'", "'>'", "'<'", "'!='", "'=='", 
			"'*'", "'/'", "'%'", "'+'", "'-'", "'&&'", "'||'", "'!'", "'?'", "'='", 
			"'++'", "'--'", "'('", "')'", "'['", "']'", "'{'", "'}'", "'#'", "','", 
			"'.'", "':'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "DEF", "EXTENDS", "CLASS", "PRINT", "FUNC", "NEW", "CONTINUE", 
			"BREAK", "RETURN", "FOREACH", "IN", "FOR", "IF", "ELSE", "BOOLEAN", "STRING", 
			"INT", "VOID", "NULL", "LIST", "TRUE", "FALSE", "THIS", "ARROW", "GREATER_THAN", 
			"LESS_THAN", "NOT_EQUAL", "EQUAL", "MULT", "DIVIDE", "MOD", "PLUS", "MINUS", 
			"AND", "OR", "NOT", "QUESTION_MARK", "ASSIGN", "INCREMENT", "DECREMENT", 
			"LPAR", "RPAR", "LBRACK", "RBRACK", "LBRACE", "RBRACE", "SHARP", "COMMA", 
			"DOT", "COLON", "SEMICOLLON", "INT_VALUE", "IDENTIFIER", "STRING_VALUE", 
			"COMMENT", "WS"
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
	public String getGrammarFileName() { return "Sophia.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SophiaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class SophiaContext extends ParserRuleContext {
		public Program sophiaProgram;
		public ProgramContext p;
		public TerminalNode EOF() { return getToken(SophiaParser.EOF, 0); }
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public SophiaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sophia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterSophia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitSophia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitSophia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SophiaContext sophia() throws RecognitionException {
		SophiaContext _localctx = new SophiaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_sophia);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			((SophiaContext)_localctx).p = program();
			((SophiaContext)_localctx).sophiaProgram =  ((SophiaContext)_localctx).p.programRet;
			setState(94);
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

	public static class ProgramContext extends ParserRuleContext {
		public Program programRet;
		public SophiaClassContext c;
		public List<SophiaClassContext> sophiaClass() {
			return getRuleContexts(SophiaClassContext.class);
		}
		public SophiaClassContext sophiaClass(int i) {
			return getRuleContext(SophiaClassContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((ProgramContext)_localctx).programRet =  new Program();
			            _localctx.programRet.setLine(1);
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CLASS) {
				{
				{
				setState(97);
				((ProgramContext)_localctx).c = sophiaClass();
				_localctx.programRet.addClass(((ProgramContext)_localctx).c.classRet);
				}
				}
				setState(104);
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

	public static class SophiaClassContext extends ParserRuleContext {
		public ClassDeclaration classRet;
		public Token CLASS;
		public IdentifierContext class_name;
		public IdentifierContext parrent_name;
		public VarDeclarationContext varDec1;
		public MethodContext method1;
		public ConstructorContext const1;
		public VarDeclarationContext varDec2;
		public MethodContext method2;
		public VarDeclarationContext varDec3;
		public MethodContext method3;
		public TerminalNode CLASS() { return getToken(SophiaParser.CLASS, 0); }
		public TerminalNode LBRACE() { return getToken(SophiaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(SophiaParser.RBRACE, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode EXTENDS() { return getToken(SophiaParser.EXTENDS, 0); }
		public ConstructorContext constructor() {
			return getRuleContext(ConstructorContext.class,0);
		}
		public List<VarDeclarationContext> varDeclaration() {
			return getRuleContexts(VarDeclarationContext.class);
		}
		public VarDeclarationContext varDeclaration(int i) {
			return getRuleContext(VarDeclarationContext.class,i);
		}
		public List<MethodContext> method() {
			return getRuleContexts(MethodContext.class);
		}
		public MethodContext method(int i) {
			return getRuleContext(MethodContext.class,i);
		}
		public SophiaClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sophiaClass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterSophiaClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitSophiaClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitSophiaClass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SophiaClassContext sophiaClass() throws RecognitionException {
		SophiaClassContext _localctx = new SophiaClassContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_sophiaClass);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			((SophiaClassContext)_localctx).CLASS = match(CLASS);
			{
			setState(106);
			((SophiaClassContext)_localctx).class_name = identifier();
			}

			            ((SophiaClassContext)_localctx).classRet =  new ClassDeclaration(((SophiaClassContext)_localctx).class_name.idRet);
			            _localctx.classRet.setLine(((SophiaClassContext)_localctx).CLASS.getLine());
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(108);
				match(EXTENDS);
				setState(109);
				((SophiaClassContext)_localctx).parrent_name = identifier();

				            _localctx.classRet.setParentClassName(((SophiaClassContext)_localctx).parrent_name.idRet);
				}
			}

			setState(114);
			match(LBRACE);
			setState(150);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				{
				setState(123);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(121);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case IDENTIFIER:
							{
							setState(115);
							((SophiaClassContext)_localctx).varDec1 = varDeclaration();
							_localctx.classRet.addField(new FieldDeclaration(((SophiaClassContext)_localctx).varDec1.varDec));
							}
							break;
						case DEF:
							{
							setState(118);
							((SophiaClassContext)_localctx).method1 = method();
							_localctx.classRet.addMethod(((SophiaClassContext)_localctx).method1.methodDecRet);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						} 
					}
					setState(125);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				}
				setState(126);
				((SophiaClassContext)_localctx).const1 = constructor();
				_localctx.classRet.setConstructor(((SophiaClassContext)_localctx).const1.constDecRet);
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DEF || _la==IDENTIFIER) {
					{
					setState(134);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case IDENTIFIER:
						{
						setState(128);
						((SophiaClassContext)_localctx).varDec2 = varDeclaration();
						_localctx.classRet.addField(new FieldDeclaration(((SophiaClassContext)_localctx).varDec2.varDec));
						}
						break;
					case DEF:
						{
						setState(131);
						((SophiaClassContext)_localctx).method2 = method();
						_localctx.classRet.addMethod(((SophiaClassContext)_localctx).method2.methodDecRet);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(138);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case 2:
				{
				{
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DEF || _la==IDENTIFIER) {
					{
					setState(145);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case IDENTIFIER:
						{
						setState(139);
						((SophiaClassContext)_localctx).varDec3 = varDeclaration();
						_localctx.classRet.addField(new FieldDeclaration(((SophiaClassContext)_localctx).varDec3.varDec));
						}
						break;
					case DEF:
						{
						setState(142);
						((SophiaClassContext)_localctx).method3 = method();
						_localctx.classRet.addMethod(((SophiaClassContext)_localctx).method3.methodDecRet);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(149);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			}
			setState(152);
			match(RBRACE);
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

	public static class VarDeclarationContext extends ParserRuleContext {
		public VarDeclaration varDec;
		public IdentifierContext identifier;
		public TypeContext type;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(SophiaParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode SEMICOLLON() { return getToken(SophiaParser.SEMICOLLON, 0); }
		public VarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterVarDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitVarDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitVarDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclarationContext varDeclaration() throws RecognitionException {
		VarDeclarationContext _localctx = new VarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_varDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			((VarDeclarationContext)_localctx).identifier = identifier();
			setState(155);
			match(COLON);
			setState(156);
			((VarDeclarationContext)_localctx).type = type();
			setState(157);
			match(SEMICOLLON);

			            ((VarDeclarationContext)_localctx).varDec =  new VarDeclaration(((VarDeclarationContext)_localctx).identifier.idRet,((VarDeclarationContext)_localctx).type.typeRet);
			            _localctx.varDec.setLine(((VarDeclarationContext)_localctx).identifier.idRet.getLine());
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

	public static class MethodContext extends ParserRuleContext {
		public MethodDeclaration methodDecRet;
		public Token DEF;
		public TypeContext type;
		public IdentifierContext identifier;
		public MethodArgumentsContext methodArguments;
		public TerminalNode DEF() { return getToken(SophiaParser.DEF, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(SophiaParser.LPAR, 0); }
		public MethodArgumentsContext methodArguments() {
			return getRuleContext(MethodArgumentsContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(SophiaParser.RPAR, 0); }
		public TerminalNode LBRACE() { return getToken(SophiaParser.LBRACE, 0); }
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(SophiaParser.RBRACE, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode VOID() { return getToken(SophiaParser.VOID, 0); }
		public MethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitMethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitMethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodContext method() throws RecognitionException {
		MethodContext _localctx = new MethodContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_method);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			((MethodContext)_localctx).DEF = match(DEF);
			setState(163);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUNC:
			case BOOLEAN:
			case STRING:
			case INT:
			case LIST:
			case IDENTIFIER:
				{
				setState(161);
				((MethodContext)_localctx).type = type();
				}
				break;
			case VOID:
				{
				setState(162);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(165);
			((MethodContext)_localctx).identifier = identifier();

			            ((MethodContext)_localctx).methodDecRet =  new MethodDeclaration(((MethodContext)_localctx).identifier.idRet,((MethodContext)_localctx).type.typeRet);
			            _localctx.methodDecRet.setLine(((MethodContext)_localctx).DEF.getLine());
			setState(167);
			match(LPAR);
			setState(168);
			((MethodContext)_localctx).methodArguments = methodArguments();
			_localctx.methodDecRet.setArgs(((MethodContext)_localctx).methodArguments.argdecs);
			setState(170);
			match(RPAR);
			setState(171);
			match(LBRACE);
			setState(172);
			methodBody(_localctx.methodDecRet);
			setState(173);
			match(RBRACE);
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

	public static class ConstructorContext extends ParserRuleContext {
		public ConstructorDeclaration constDecRet;
		public Token DEF;
		public IdentifierContext identifier;
		public MethodArgumentsContext methodArguments;
		public TerminalNode DEF() { return getToken(SophiaParser.DEF, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(SophiaParser.LPAR, 0); }
		public MethodArgumentsContext methodArguments() {
			return getRuleContext(MethodArgumentsContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(SophiaParser.RPAR, 0); }
		public TerminalNode LBRACE() { return getToken(SophiaParser.LBRACE, 0); }
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(SophiaParser.RBRACE, 0); }
		public ConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitConstructor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorContext constructor() throws RecognitionException {
		ConstructorContext _localctx = new ConstructorContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_constructor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			((ConstructorContext)_localctx).DEF = match(DEF);
			setState(176);
			((ConstructorContext)_localctx).identifier = identifier();

			            ((ConstructorContext)_localctx).constDecRet =  new ConstructorDeclaration(((ConstructorContext)_localctx).identifier.idRet);
			            _localctx.constDecRet.setLine(((ConstructorContext)_localctx).DEF.getLine());
			setState(178);
			match(LPAR);
			setState(179);
			((ConstructorContext)_localctx).methodArguments = methodArguments();
			_localctx.constDecRet.setArgs(((ConstructorContext)_localctx).methodArguments.argdecs);
			setState(181);
			match(RPAR);
			setState(182);
			match(LBRACE);
			setState(183);
			methodBody(_localctx.constDecRet);
			setState(184);
			match(RBRACE);
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

	public static class MethodArgumentsContext extends ParserRuleContext {
		public ArrayList<VarDeclaration> argdecs;
		public VariableWithTypeContext variableWithType;
		public List<VariableWithTypeContext> variableWithType() {
			return getRuleContexts(VariableWithTypeContext.class);
		}
		public VariableWithTypeContext variableWithType(int i) {
			return getRuleContext(VariableWithTypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SophiaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SophiaParser.COMMA, i);
		}
		public MethodArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterMethodArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitMethodArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitMethodArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodArgumentsContext methodArguments() throws RecognitionException {
		MethodArgumentsContext _localctx = new MethodArgumentsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_methodArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((MethodArgumentsContext)_localctx).argdecs =  new ArrayList<>();
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(187);
				((MethodArgumentsContext)_localctx).variableWithType = variableWithType();

				            VarDeclaration arg = new VarDeclaration(((MethodArgumentsContext)_localctx).variableWithType.idRet,((MethodArgumentsContext)_localctx).variableWithType.typeRet);
				            _localctx.argdecs.add(arg);
				            
				setState(195);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(189);
					match(COMMA);
					setState(190);
					((MethodArgumentsContext)_localctx).variableWithType = variableWithType();
					arg = new VarDeclaration(((MethodArgumentsContext)_localctx).variableWithType.idRet,((MethodArgumentsContext)_localctx).variableWithType.typeRet);
					             _localctx.argdecs.add(arg);
					}
					}
					setState(197);
					_errHandler.sync(this);
					_la = _input.LA(1);
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

	public static class VariableWithTypeContext extends ParserRuleContext {
		public Identifier idRet;
		public Type typeRet;
		public IdentifierContext identifier;
		public TypeContext type;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(SophiaParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VariableWithTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableWithType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterVariableWithType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitVariableWithType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitVariableWithType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableWithTypeContext variableWithType() throws RecognitionException {
		VariableWithTypeContext _localctx = new VariableWithTypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_variableWithType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			((VariableWithTypeContext)_localctx).identifier = identifier();
			setState(201);
			match(COLON);
			setState(202);
			((VariableWithTypeContext)_localctx).type = type();

			            ((VariableWithTypeContext)_localctx).idRet =  ((VariableWithTypeContext)_localctx).identifier.idRet;
			            ((VariableWithTypeContext)_localctx).typeRet =  ((VariableWithTypeContext)_localctx).type.typeRet;
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

	public static class TypeContext extends ParserRuleContext {
		public Type typeRet;
		public PrimitiveDataTypeContext primitiveDataType;
		public ListTypeContext listType;
		public FunctionPointerTypeContext functionPointerType;
		public ClassTypeContext classType;
		public PrimitiveDataTypeContext primitiveDataType() {
			return getRuleContext(PrimitiveDataTypeContext.class,0);
		}
		public ListTypeContext listType() {
			return getRuleContext(ListTypeContext.class,0);
		}
		public FunctionPointerTypeContext functionPointerType() {
			return getRuleContext(FunctionPointerTypeContext.class,0);
		}
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_type);
		try {
			setState(217);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case STRING:
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(205);
				((TypeContext)_localctx).primitiveDataType = primitiveDataType();
				((TypeContext)_localctx).typeRet = ((TypeContext)_localctx).primitiveDataType.premitiveRet;
				}
				}
				break;
			case LIST:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(208);
				((TypeContext)_localctx).listType = listType();
				((TypeContext)_localctx).typeRet =  ((TypeContext)_localctx).listType.lstRet;
				}
				}
				break;
			case FUNC:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(211);
				((TypeContext)_localctx).functionPointerType = functionPointerType();
				((TypeContext)_localctx).typeRet =  ((TypeContext)_localctx).functionPointerType.fptrTypeRet;
				}
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(214);
				((TypeContext)_localctx).classType = classType();
				((TypeContext)_localctx).typeRet =  new ClassType(((TypeContext)_localctx).classType.classTypeRet);
				}
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

	public static class ClassTypeContext extends ParserRuleContext {
		public Identifier classTypeRet;
		public IdentifierContext identifier;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ClassTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterClassType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitClassType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitClassType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassTypeContext classType() throws RecognitionException {
		ClassTypeContext _localctx = new ClassTypeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_classType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			((ClassTypeContext)_localctx).identifier = identifier();
			((ClassTypeContext)_localctx).classTypeRet =  ((ClassTypeContext)_localctx).identifier.idRet;
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

	public static class ListTypeContext extends ParserRuleContext {
		public ListType lstRet;
		public Token i1;
		public TypeContext type;
		public ListItemsTypesContext listItemsTypes;
		public TerminalNode LIST() { return getToken(SophiaParser.LIST, 0); }
		public TerminalNode LPAR() { return getToken(SophiaParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SophiaParser.RPAR, 0); }
		public TerminalNode SHARP() { return getToken(SophiaParser.SHARP, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ListItemsTypesContext listItemsTypes() {
			return getRuleContext(ListItemsTypesContext.class,0);
		}
		public TerminalNode INT_VALUE() { return getToken(SophiaParser.INT_VALUE, 0); }
		public ListTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterListType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitListType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitListType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListTypeContext listType() throws RecognitionException {
		ListTypeContext _localctx = new ListTypeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_listType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			match(LIST);
			setState(223);
			match(LPAR);
			setState(232);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_VALUE:
				{
				{
				{
				setState(224);
				((ListTypeContext)_localctx).i1 = match(INT_VALUE);
				}
				setState(225);
				match(SHARP);
				setState(226);
				((ListTypeContext)_localctx).type = type();
				int int_val = (((ListTypeContext)_localctx).i1!=null?Integer.valueOf(((ListTypeContext)_localctx).i1.getText()):0); ((ListTypeContext)_localctx).lstRet =  new ListType(int_val, new ListNameType(((ListTypeContext)_localctx).type.typeRet));
				}
				}
				break;
			case FUNC:
			case BOOLEAN:
			case STRING:
			case INT:
			case LIST:
			case IDENTIFIER:
				{
				{
				setState(229);
				((ListTypeContext)_localctx).listItemsTypes = listItemsTypes();
				((ListTypeContext)_localctx).lstRet =  new ListType(((ListTypeContext)_localctx).listItemsTypes.listArr);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(234);
			match(RPAR);
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

	public static class ListItemsTypesContext extends ParserRuleContext {
		public ArrayList<ListNameType> listArr;
		public ListItemTypeContext l1;
		public ListItemTypeContext l2;
		public List<ListItemTypeContext> listItemType() {
			return getRuleContexts(ListItemTypeContext.class);
		}
		public ListItemTypeContext listItemType(int i) {
			return getRuleContext(ListItemTypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SophiaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SophiaParser.COMMA, i);
		}
		public ListItemsTypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listItemsTypes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterListItemsTypes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitListItemsTypes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitListItemsTypes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListItemsTypesContext listItemsTypes() throws RecognitionException {
		ListItemsTypesContext _localctx = new ListItemsTypesContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_listItemsTypes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((ListItemsTypesContext)_localctx).listArr =  new ArrayList<>();
			setState(237);
			((ListItemsTypesContext)_localctx).l1 = listItemType();
			_localctx.listArr.add(((ListItemsTypesContext)_localctx).l1.lstNameType);
			setState(245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(239);
				match(COMMA);
				setState(240);
				((ListItemsTypesContext)_localctx).l2 = listItemType();
				_localctx.listArr.add(((ListItemsTypesContext)_localctx).l2.lstNameType);
				}
				}
				setState(247);
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

	public static class ListItemTypeContext extends ParserRuleContext {
		public ListNameType lstNameType;
		public VariableWithTypeContext variableWithType;
		public TypeContext type;
		public VariableWithTypeContext variableWithType() {
			return getRuleContext(VariableWithTypeContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ListItemTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listItemType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterListItemType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitListItemType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitListItemType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListItemTypeContext listItemType() throws RecognitionException {
		ListItemTypeContext _localctx = new ListItemTypeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_listItemType);
		try {
			setState(254);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(248);
				((ListItemTypeContext)_localctx).variableWithType = variableWithType();
				((ListItemTypeContext)_localctx).lstNameType =  new ListNameType(((ListItemTypeContext)_localctx).variableWithType.idRet, ((ListItemTypeContext)_localctx).variableWithType.typeRet);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(251);
				((ListItemTypeContext)_localctx).type = type();
				((ListItemTypeContext)_localctx).lstNameType =  new ListNameType(((ListItemTypeContext)_localctx).type.typeRet);
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

	public static class FunctionPointerTypeContext extends ParserRuleContext {
		public FptrType fptrTypeRet;
		public TypesWithCommaContext typesWithComma;
		public TypeContext type;
		public TerminalNode FUNC() { return getToken(SophiaParser.FUNC, 0); }
		public TerminalNode LESS_THAN() { return getToken(SophiaParser.LESS_THAN, 0); }
		public TerminalNode ARROW() { return getToken(SophiaParser.ARROW, 0); }
		public TerminalNode GREATER_THAN() { return getToken(SophiaParser.GREATER_THAN, 0); }
		public List<TerminalNode> VOID() { return getTokens(SophiaParser.VOID); }
		public TerminalNode VOID(int i) {
			return getToken(SophiaParser.VOID, i);
		}
		public TypesWithCommaContext typesWithComma() {
			return getRuleContext(TypesWithCommaContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FunctionPointerTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionPointerType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterFunctionPointerType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitFunctionPointerType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitFunctionPointerType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionPointerTypeContext functionPointerType() throws RecognitionException {
		FunctionPointerTypeContext _localctx = new FunctionPointerTypeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_functionPointerType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			match(FUNC);
			ArrayList<Type> arrtypes = new ArrayList<>(); Type rettype = new NullType();
			setState(258);
			match(LESS_THAN);
			setState(263);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOID:
				{
				setState(259);
				match(VOID);
				}
				break;
			case FUNC:
			case BOOLEAN:
			case STRING:
			case INT:
			case LIST:
			case IDENTIFIER:
				{
				{
				setState(260);
				((FunctionPointerTypeContext)_localctx).typesWithComma = typesWithComma();
				arrtypes = ((FunctionPointerTypeContext)_localctx).typesWithComma.arrTypeRet;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(265);
			match(ARROW);
			setState(270);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOID:
				{
				setState(266);
				match(VOID);
				}
				break;
			case FUNC:
			case BOOLEAN:
			case STRING:
			case INT:
			case LIST:
			case IDENTIFIER:
				{
				{
				setState(267);
				((FunctionPointerTypeContext)_localctx).type = type();
				rettype = ((FunctionPointerTypeContext)_localctx).type.typeRet;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(272);
			match(GREATER_THAN);
			((FunctionPointerTypeContext)_localctx).fptrTypeRet =  new FptrType(arrtypes, rettype);
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

	public static class TypesWithCommaContext extends ParserRuleContext {
		public ArrayList<Type> arrTypeRet;
		public TypeContext t1;
		public TypeContext t2;
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SophiaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SophiaParser.COMMA, i);
		}
		public TypesWithCommaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typesWithComma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterTypesWithComma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitTypesWithComma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitTypesWithComma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypesWithCommaContext typesWithComma() throws RecognitionException {
		TypesWithCommaContext _localctx = new TypesWithCommaContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_typesWithComma);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((TypesWithCommaContext)_localctx).arrTypeRet =  new ArrayList<>();
			setState(276);
			((TypesWithCommaContext)_localctx).t1 = type();
			_localctx.arrTypeRet.add(((TypesWithCommaContext)_localctx).t1.typeRet);
			setState(284);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(278);
				match(COMMA);
				setState(279);
				((TypesWithCommaContext)_localctx).t2 = type();
				_localctx.arrTypeRet.add(((TypesWithCommaContext)_localctx).t2.typeRet);
				}
				}
				setState(286);
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

	public static class PrimitiveDataTypeContext extends ParserRuleContext {
		public Type premitiveRet;
		public TerminalNode INT() { return getToken(SophiaParser.INT, 0); }
		public TerminalNode STRING() { return getToken(SophiaParser.STRING, 0); }
		public TerminalNode BOOLEAN() { return getToken(SophiaParser.BOOLEAN, 0); }
		public PrimitiveDataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveDataType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterPrimitiveDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitPrimitiveDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitPrimitiveDataType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveDataTypeContext primitiveDataType() throws RecognitionException {
		PrimitiveDataTypeContext _localctx = new PrimitiveDataTypeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_primitiveDataType);
		try {
			setState(293);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(287);
				match(INT);
				((PrimitiveDataTypeContext)_localctx).premitiveRet =  new IntType();
				}
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(289);
				match(STRING);
				((PrimitiveDataTypeContext)_localctx).premitiveRet =  new StringType();
				}
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(291);
				match(BOOLEAN);
				((PrimitiveDataTypeContext)_localctx).premitiveRet =  new BoolType();
				}
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

	public static class MethodBodyContext extends ParserRuleContext {
		public MethodDeclaration methodDec;
		public VarDeclarationContext varDeclaration;
		public StatementContext statement;
		public List<VarDeclarationContext> varDeclaration() {
			return getRuleContexts(VarDeclarationContext.class);
		}
		public VarDeclarationContext varDeclaration(int i) {
			return getRuleContext(VarDeclarationContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public MethodBodyContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public MethodBodyContext(ParserRuleContext parent, int invokingState, MethodDeclaration methodDec) {
			super(parent, invokingState);
			this.methodDec = methodDec;
		}
		@Override public int getRuleIndex() { return RULE_methodBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterMethodBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitMethodBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitMethodBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodBodyContext methodBody(MethodDeclaration methodDec) throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState(), methodDec);
		enterRule(_localctx, 32, RULE_methodBody);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(295);
					((MethodBodyContext)_localctx).varDeclaration = varDeclaration();
					_localctx.methodDec.addLocalVar(((MethodBodyContext)_localctx).varDeclaration.varDec);
					}
					} 
				}
				setState(302);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			setState(308);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << NEW) | (1L << CONTINUE) | (1L << BREAK) | (1L << RETURN) | (1L << FOREACH) | (1L << FOR) | (1L << IF) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << THIS) | (1L << MINUS) | (1L << NOT) | (1L << INCREMENT) | (1L << DECREMENT) | (1L << LPAR) | (1L << LBRACK) | (1L << LBRACE) | (1L << INT_VALUE) | (1L << IDENTIFIER) | (1L << STRING_VALUE))) != 0)) {
				{
				{
				setState(303);
				((MethodBodyContext)_localctx).statement = statement();
				_localctx.methodDec.addBodyStatement(((MethodBodyContext)_localctx).statement.stRet);
				}
				}
				setState(310);
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

	public static class StatementContext extends ParserRuleContext {
		public Statement stRet;
		public ForStatementContext forStatement;
		public ForeachStatementContext foreachStatement;
		public IfStatementContext ifStatement;
		public AssignmentStatementContext assignmentStatement;
		public PrintStatementContext printStatement;
		public ContinueBreakStatementContext continueBreakStatement;
		public MethodCallStatementContext methodCallStatement;
		public ReturnStatementContext returnStatement;
		public BlockContext block;
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public ForeachStatementContext foreachStatement() {
			return getRuleContext(ForeachStatementContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public AssignmentStatementContext assignmentStatement() {
			return getRuleContext(AssignmentStatementContext.class,0);
		}
		public PrintStatementContext printStatement() {
			return getRuleContext(PrintStatementContext.class,0);
		}
		public ContinueBreakStatementContext continueBreakStatement() {
			return getRuleContext(ContinueBreakStatementContext.class,0);
		}
		public MethodCallStatementContext methodCallStatement() {
			return getRuleContext(MethodCallStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_statement);
		try {
			setState(338);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(311);
				((StatementContext)_localctx).forStatement = forStatement();
				((StatementContext)_localctx).stRet =  ((StatementContext)_localctx).forStatement.forstRet;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(314);
				((StatementContext)_localctx).foreachStatement = foreachStatement();
				((StatementContext)_localctx).stRet =  ((StatementContext)_localctx).foreachStatement.foreachstRet;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(317);
				((StatementContext)_localctx).ifStatement = ifStatement();
				((StatementContext)_localctx).stRet =  ((StatementContext)_localctx).ifStatement.ifRet;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(320);
				((StatementContext)_localctx).assignmentStatement = assignmentStatement();
				((StatementContext)_localctx).stRet =  ((StatementContext)_localctx).assignmentStatement.assignstRet;
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(323);
				((StatementContext)_localctx).printStatement = printStatement();
				((StatementContext)_localctx).stRet =  ((StatementContext)_localctx).printStatement.printRet;
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(326);
				((StatementContext)_localctx).continueBreakStatement = continueBreakStatement();
				((StatementContext)_localctx).stRet =  ((StatementContext)_localctx).continueBreakStatement.st;
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(329);
				((StatementContext)_localctx).methodCallStatement = methodCallStatement();
				((StatementContext)_localctx).stRet =  ((StatementContext)_localctx).methodCallStatement.methodstRet;
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(332);
				((StatementContext)_localctx).returnStatement = returnStatement();
				((StatementContext)_localctx).stRet =  ((StatementContext)_localctx).returnStatement.returnRet;
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(335);
				((StatementContext)_localctx).block = block();
				((StatementContext)_localctx).stRet =  ((StatementContext)_localctx).block.blockRet;
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

	public static class BlockContext extends ParserRuleContext {
		public BlockStmt blockRet;
		public Token LBRACE;
		public StatementContext statement;
		public TerminalNode LBRACE() { return getToken(SophiaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(SophiaParser.RBRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((BlockContext)_localctx).blockRet =  new BlockStmt();
			setState(341);
			((BlockContext)_localctx).LBRACE = match(LBRACE);
			_localctx.blockRet.setLine(((BlockContext)_localctx).LBRACE.getLine());
			setState(348);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << NEW) | (1L << CONTINUE) | (1L << BREAK) | (1L << RETURN) | (1L << FOREACH) | (1L << FOR) | (1L << IF) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << THIS) | (1L << MINUS) | (1L << NOT) | (1L << INCREMENT) | (1L << DECREMENT) | (1L << LPAR) | (1L << LBRACK) | (1L << LBRACE) | (1L << INT_VALUE) | (1L << IDENTIFIER) | (1L << STRING_VALUE))) != 0)) {
				{
				{
				setState(343);
				((BlockContext)_localctx).statement = statement();
				_localctx.blockRet.addStatement(((BlockContext)_localctx).statement.stRet);
				}
				}
				setState(350);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(351);
			match(RBRACE);
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

	public static class AssignmentStatementContext extends ParserRuleContext {
		public AssignmentStmt assignstRet;
		public AssignmentContext assignment;
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public TerminalNode SEMICOLLON() { return getToken(SophiaParser.SEMICOLLON, 0); }
		public AssignmentStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterAssignmentStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitAssignmentStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitAssignmentStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentStatementContext assignmentStatement() throws RecognitionException {
		AssignmentStatementContext _localctx = new AssignmentStatementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_assignmentStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			((AssignmentStatementContext)_localctx).assignment = assignment();
			setState(354);
			match(SEMICOLLON);
			((AssignmentStatementContext)_localctx).assignstRet =  ((AssignmentStatementContext)_localctx).assignment.assignRet;
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

	public static class AssignmentContext extends ParserRuleContext {
		public AssignmentStmt assignRet;
		public OrExpressionContext orExpression;
		public Token ASSIGN;
		public ExpressionContext expression;
		public OrExpressionContext orExpression() {
			return getRuleContext(OrExpressionContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(SophiaParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			((AssignmentContext)_localctx).orExpression = orExpression();
			setState(358);
			((AssignmentContext)_localctx).ASSIGN = match(ASSIGN);
			setState(359);
			((AssignmentContext)_localctx).expression = expression();
			((AssignmentContext)_localctx).assignRet =  new AssignmentStmt(((AssignmentContext)_localctx).orExpression.orExpRet,((AssignmentContext)_localctx).expression.exprRet);
			            _localctx.assignRet.setLine(((AssignmentContext)_localctx).ASSIGN.getLine());
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

	public static class PrintStatementContext extends ParserRuleContext {
		public PrintStmt printRet;
		public Token PRINT;
		public ExpressionContext expression;
		public TerminalNode PRINT() { return getToken(SophiaParser.PRINT, 0); }
		public TerminalNode LPAR() { return getToken(SophiaParser.LPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(SophiaParser.RPAR, 0); }
		public TerminalNode SEMICOLLON() { return getToken(SophiaParser.SEMICOLLON, 0); }
		public PrintStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterPrintStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitPrintStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitPrintStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintStatementContext printStatement() throws RecognitionException {
		PrintStatementContext _localctx = new PrintStatementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_printStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
			((PrintStatementContext)_localctx).PRINT = match(PRINT);
			setState(363);
			match(LPAR);
			setState(364);
			((PrintStatementContext)_localctx).expression = expression();

			            ((PrintStatementContext)_localctx).printRet =  new PrintStmt(((PrintStatementContext)_localctx).expression.exprRet);
			            _localctx.printRet.setLine(((PrintStatementContext)_localctx).PRINT.getLine());
			setState(366);
			match(RPAR);
			setState(367);
			match(SEMICOLLON);
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

	public static class ReturnStatementContext extends ParserRuleContext {
		public ReturnStmt returnRet;
		public Token RETURN;
		public ExpressionContext expression;
		public TerminalNode RETURN() { return getToken(SophiaParser.RETURN, 0); }
		public TerminalNode SEMICOLLON() { return getToken(SophiaParser.SEMICOLLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			((ReturnStatementContext)_localctx).RETURN = match(RETURN);
			setState(371);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << THIS) | (1L << MINUS) | (1L << NOT) | (1L << INCREMENT) | (1L << DECREMENT) | (1L << LPAR) | (1L << LBRACK) | (1L << INT_VALUE) | (1L << IDENTIFIER) | (1L << STRING_VALUE))) != 0)) {
				{
				setState(370);
				((ReturnStatementContext)_localctx).expression = expression();
				}
			}


			            ((ReturnStatementContext)_localctx).returnRet =  new ReturnStmt (((ReturnStatementContext)_localctx).expression.exprRet);
			            _localctx.returnRet.setLine(((ReturnStatementContext)_localctx).RETURN.getLine());
			setState(374);
			match(SEMICOLLON);
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

	public static class MethodCallStatementContext extends ParserRuleContext {
		public MethodCallStmt methodstRet;
		public MethodCallContext methodCall;
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public TerminalNode SEMICOLLON() { return getToken(SophiaParser.SEMICOLLON, 0); }
		public MethodCallStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodCallStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterMethodCallStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitMethodCallStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitMethodCallStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodCallStatementContext methodCallStatement() throws RecognitionException {
		MethodCallStatementContext _localctx = new MethodCallStatementContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_methodCallStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
			((MethodCallStatementContext)_localctx).methodCall = methodCall();
			((MethodCallStatementContext)_localctx).methodstRet =  new MethodCallStmt(((MethodCallStatementContext)_localctx).methodCall.methodcallRet);
			setState(378);
			match(SEMICOLLON);
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

	public static class MethodCallContext extends ParserRuleContext {
		public MethodCall methodcallRet;
		public Expression instance;
		public OtherExpressionContext otherExpression;
		public Token LPAR;
		public MethodCallArgumentsContext methodCallArguments;
		public IdentifierContext identifier;
		public Token LBRACK;
		public ExpressionContext expression;
		public OtherExpressionContext otherExpression() {
			return getRuleContext(OtherExpressionContext.class,0);
		}
		public List<TerminalNode> LPAR() { return getTokens(SophiaParser.LPAR); }
		public TerminalNode LPAR(int i) {
			return getToken(SophiaParser.LPAR, i);
		}
		public List<MethodCallArgumentsContext> methodCallArguments() {
			return getRuleContexts(MethodCallArgumentsContext.class);
		}
		public MethodCallArgumentsContext methodCallArguments(int i) {
			return getRuleContext(MethodCallArgumentsContext.class,i);
		}
		public List<TerminalNode> RPAR() { return getTokens(SophiaParser.RPAR); }
		public TerminalNode RPAR(int i) {
			return getToken(SophiaParser.RPAR, i);
		}
		public List<TerminalNode> DOT() { return getTokens(SophiaParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(SophiaParser.DOT, i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> LBRACK() { return getTokens(SophiaParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(SophiaParser.LBRACK, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(SophiaParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(SophiaParser.RBRACK, i);
		}
		public MethodCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterMethodCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitMethodCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitMethodCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodCallContext methodCall() throws RecognitionException {
		MethodCallContext _localctx = new MethodCallContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_methodCall);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(380);
			((MethodCallContext)_localctx).otherExpression = otherExpression();
			((MethodCallContext)_localctx).instance =  ((MethodCallContext)_localctx).otherExpression.otherExpRet; 
			setState(399);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(397);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case LPAR:
						{
						{
						setState(382);
						((MethodCallContext)_localctx).LPAR = match(LPAR);
						setState(383);
						((MethodCallContext)_localctx).methodCallArguments = methodCallArguments();
						setState(384);
						match(RPAR);
						}
						((MethodCallContext)_localctx).instance =  new MethodCall(_localctx.instance,((MethodCallContext)_localctx).methodCallArguments.args);
						            _localctx.instance.setLine(((MethodCallContext)_localctx).LPAR.getLine());
						}
						break;
					case DOT:
						{
						{
						setState(388);
						match(DOT);
						setState(389);
						((MethodCallContext)_localctx).identifier = identifier();
						((MethodCallContext)_localctx).instance =  new ObjectOrListMemberAccess(_localctx.instance,((MethodCallContext)_localctx).identifier.idRet);
						            _localctx.instance.setLine(((MethodCallContext)_localctx).identifier.idRet.getLine());
						}
						}
						break;
					case LBRACK:
						{
						{
						setState(392);
						((MethodCallContext)_localctx).LBRACK = match(LBRACK);
						setState(393);
						((MethodCallContext)_localctx).expression = expression();
						((MethodCallContext)_localctx).instance =  new ListAccessByIndex(_localctx.instance,((MethodCallContext)_localctx).expression.exprRet);
						            _localctx.instance.setLine(((MethodCallContext)_localctx).LBRACK.getLine());
						setState(395);
						match(RBRACK);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(401);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			}
			{
			setState(402);
			((MethodCallContext)_localctx).LPAR = match(LPAR);
			setState(403);
			((MethodCallContext)_localctx).methodCallArguments = methodCallArguments();
			setState(404);
			match(RPAR);
			}
			((MethodCallContext)_localctx).methodcallRet =  new MethodCall(_localctx.instance,((MethodCallContext)_localctx).methodCallArguments.args);
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

	public static class MethodCallArgumentsContext extends ParserRuleContext {
		public ArrayList<Expression> args;
		public ExpressionContext expression;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SophiaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SophiaParser.COMMA, i);
		}
		public MethodCallArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodCallArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterMethodCallArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitMethodCallArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitMethodCallArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodCallArgumentsContext methodCallArguments() throws RecognitionException {
		MethodCallArgumentsContext _localctx = new MethodCallArgumentsContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_methodCallArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(420);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << THIS) | (1L << MINUS) | (1L << NOT) | (1L << INCREMENT) | (1L << DECREMENT) | (1L << LPAR) | (1L << LBRACK) | (1L << INT_VALUE) | (1L << IDENTIFIER) | (1L << STRING_VALUE))) != 0)) {
				{
				((MethodCallArgumentsContext)_localctx).args =  new ArrayList<>();
				setState(409);
				((MethodCallArgumentsContext)_localctx).expression = expression();

				            _localctx.args.add(((MethodCallArgumentsContext)_localctx).expression.exprRet);
				            
				setState(417);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(411);
					match(COMMA);
					setState(412);
					((MethodCallArgumentsContext)_localctx).expression = expression();
					_localctx.args.add(((MethodCallArgumentsContext)_localctx).expression.exprRet);
					}
					}
					setState(419);
					_errHandler.sync(this);
					_la = _input.LA(1);
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

	public static class ContinueBreakStatementContext extends ParserRuleContext {
		public Statement st;
		public Token BREAK;
		public Token CONTINUE;
		public TerminalNode SEMICOLLON() { return getToken(SophiaParser.SEMICOLLON, 0); }
		public TerminalNode BREAK() { return getToken(SophiaParser.BREAK, 0); }
		public TerminalNode CONTINUE() { return getToken(SophiaParser.CONTINUE, 0); }
		public ContinueBreakStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueBreakStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterContinueBreakStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitContinueBreakStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitContinueBreakStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContinueBreakStatementContext continueBreakStatement() throws RecognitionException {
		ContinueBreakStatementContext _localctx = new ContinueBreakStatementContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_continueBreakStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(426);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BREAK:
				{
				setState(422);
				((ContinueBreakStatementContext)_localctx).BREAK = match(BREAK);
				((ContinueBreakStatementContext)_localctx).st =  new BreakStmt(); _localctx.st.setLine(((ContinueBreakStatementContext)_localctx).BREAK.getLine());
				}
				break;
			case CONTINUE:
				{
				setState(424);
				((ContinueBreakStatementContext)_localctx).CONTINUE = match(CONTINUE);
				((ContinueBreakStatementContext)_localctx).st =  new ContinueStmt(); _localctx.st.setLine(((ContinueBreakStatementContext)_localctx).CONTINUE.getLine());
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(428);
			match(SEMICOLLON);
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

	public static class ForStatementContext extends ParserRuleContext {
		public ForStmt forstRet;
		public Token FOR;
		public AssignmentContext init;
		public ExpressionContext cond;
		public AssignmentContext update;
		public StatementContext st;
		public TerminalNode FOR() { return getToken(SophiaParser.FOR, 0); }
		public TerminalNode LPAR() { return getToken(SophiaParser.LPAR, 0); }
		public List<TerminalNode> SEMICOLLON() { return getTokens(SophiaParser.SEMICOLLON); }
		public TerminalNode SEMICOLLON(int i) {
			return getToken(SophiaParser.SEMICOLLON, i);
		}
		public TerminalNode RPAR() { return getToken(SophiaParser.RPAR, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_forStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(430);
			((ForStatementContext)_localctx).FOR = match(FOR);
			setState(431);
			match(LPAR);
			setState(433);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << THIS) | (1L << MINUS) | (1L << NOT) | (1L << INCREMENT) | (1L << DECREMENT) | (1L << LPAR) | (1L << LBRACK) | (1L << INT_VALUE) | (1L << IDENTIFIER) | (1L << STRING_VALUE))) != 0)) {
				{
				setState(432);
				((ForStatementContext)_localctx).init = assignment();
				}
			}

			setState(435);
			match(SEMICOLLON);
			setState(437);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << THIS) | (1L << MINUS) | (1L << NOT) | (1L << INCREMENT) | (1L << DECREMENT) | (1L << LPAR) | (1L << LBRACK) | (1L << INT_VALUE) | (1L << IDENTIFIER) | (1L << STRING_VALUE))) != 0)) {
				{
				setState(436);
				((ForStatementContext)_localctx).cond = expression();
				}
			}

			setState(439);
			match(SEMICOLLON);
			setState(441);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << THIS) | (1L << MINUS) | (1L << NOT) | (1L << INCREMENT) | (1L << DECREMENT) | (1L << LPAR) | (1L << LBRACK) | (1L << INT_VALUE) | (1L << IDENTIFIER) | (1L << STRING_VALUE))) != 0)) {
				{
				setState(440);
				((ForStatementContext)_localctx).update = assignment();
				}
			}

			setState(443);
			match(RPAR);
			setState(444);
			((ForStatementContext)_localctx).st = statement();
			((ForStatementContext)_localctx).forstRet =  new ForStmt();
			             _localctx.forstRet.setLine(((ForStatementContext)_localctx).FOR.getLine());
			             _localctx.forstRet.setInitialize(((ForStatementContext)_localctx).init.assignRet);
			             _localctx.forstRet.setCondition(((ForStatementContext)_localctx).cond.exprRet);
			             _localctx.forstRet.setUpdate(((ForStatementContext)_localctx).update.assignRet);
			             _localctx.forstRet.setBody(((ForStatementContext)_localctx).st.stRet);
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

	public static class ForeachStatementContext extends ParserRuleContext {
		public ForeachStmt foreachstRet;
		public Token FOREACH;
		public IdentifierContext identifier;
		public ExpressionContext expression;
		public StatementContext statement;
		public TerminalNode FOREACH() { return getToken(SophiaParser.FOREACH, 0); }
		public TerminalNode LPAR() { return getToken(SophiaParser.LPAR, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode IN() { return getToken(SophiaParser.IN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(SophiaParser.RPAR, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ForeachStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreachStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterForeachStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitForeachStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitForeachStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForeachStatementContext foreachStatement() throws RecognitionException {
		ForeachStatementContext _localctx = new ForeachStatementContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_foreachStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(447);
			((ForeachStatementContext)_localctx).FOREACH = match(FOREACH);
			setState(448);
			match(LPAR);
			setState(449);
			((ForeachStatementContext)_localctx).identifier = identifier();
			setState(450);
			match(IN);
			setState(451);
			((ForeachStatementContext)_localctx).expression = expression();
			setState(452);
			match(RPAR);
			setState(453);
			((ForeachStatementContext)_localctx).statement = statement();
			((ForeachStatementContext)_localctx).foreachstRet =  new ForeachStmt(((ForeachStatementContext)_localctx).identifier.idRet,((ForeachStatementContext)_localctx).expression.exprRet);
			            _localctx.foreachstRet.setLine(((ForeachStatementContext)_localctx).FOREACH.getLine());
			            _localctx.foreachstRet.setBody(((ForeachStatementContext)_localctx).statement.stRet);
			            _localctx.foreachstRet.setBody(((ForeachStatementContext)_localctx).statement.stRet);
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

	public static class IfStatementContext extends ParserRuleContext {
		public ConditionalStmt ifRet;
		public Token IF;
		public ExpressionContext expression;
		public StatementContext ifst;
		public StatementContext elsest;
		public TerminalNode IF() { return getToken(SophiaParser.IF, 0); }
		public TerminalNode LPAR() { return getToken(SophiaParser.LPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(SophiaParser.RPAR, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(SophiaParser.ELSE, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(456);
			((IfStatementContext)_localctx).IF = match(IF);
			setState(457);
			match(LPAR);
			setState(458);
			((IfStatementContext)_localctx).expression = expression();
			setState(459);
			match(RPAR);
			setState(460);
			((IfStatementContext)_localctx).ifst = statement();
			((IfStatementContext)_localctx).ifRet =  new ConditionalStmt(((IfStatementContext)_localctx).expression.exprRet,((IfStatementContext)_localctx).ifst.stRet);
			            _localctx.ifRet.setLine(((IfStatementContext)_localctx).IF.getLine());
			setState(466);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(462);
				match(ELSE);
				setState(463);
				((IfStatementContext)_localctx).elsest = statement();
				_localctx.ifRet.setElseBody(((IfStatementContext)_localctx).elsest.stRet);
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

	public static class ExpressionContext extends ParserRuleContext {
		public Expression exprRet;
		public OrExpressionContext orExpression;
		public Token ASSIGN;
		public ExpressionContext expression;
		public OrExpressionContext orExpression() {
			return getRuleContext(OrExpressionContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(SophiaParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(468);
			((ExpressionContext)_localctx).orExpression = orExpression();
			setState(473);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(469);
				((ExpressionContext)_localctx).ASSIGN = match(ASSIGN);
				setState(470);
				((ExpressionContext)_localctx).expression = expression();
				((ExpressionContext)_localctx).exprRet =  new BinaryExpression(((ExpressionContext)_localctx).orExpression.orExpRet,((ExpressionContext)_localctx).expression.exprRet,BinaryOperator.assign);
				            _localctx.exprRet.setLine(((ExpressionContext)_localctx).ASSIGN.getLine());
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

	public static class OrExpressionContext extends ParserRuleContext {
		public Expression orExpRet;
		public AndExpressionContext ae;
		public Token OR;
		public List<AndExpressionContext> andExpression() {
			return getRuleContexts(AndExpressionContext.class);
		}
		public AndExpressionContext andExpression(int i) {
			return getRuleContext(AndExpressionContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(SophiaParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(SophiaParser.OR, i);
		}
		public OrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrExpressionContext orExpression() throws RecognitionException {
		OrExpressionContext _localctx = new OrExpressionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_orExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(475);
			((OrExpressionContext)_localctx).ae = andExpression();
			((OrExpressionContext)_localctx).orExpRet =  ((OrExpressionContext)_localctx).ae.andExpRet;
			setState(483);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(477);
				((OrExpressionContext)_localctx).OR = match(OR);
				setState(478);
				((OrExpressionContext)_localctx).ae = andExpression();
				((OrExpressionContext)_localctx).orExpRet =  new BinaryExpression(_localctx.orExpRet,((OrExpressionContext)_localctx).ae.andExpRet,BinaryOperator.or);
				            _localctx.orExpRet.setLine(((OrExpressionContext)_localctx).OR.getLine());
				}
				}
				setState(485);
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

	public static class AndExpressionContext extends ParserRuleContext {
		public Expression andExpRet;
		public EqualityExpressionContext ee;
		public Token AND;
		public List<EqualityExpressionContext> equalityExpression() {
			return getRuleContexts(EqualityExpressionContext.class);
		}
		public EqualityExpressionContext equalityExpression(int i) {
			return getRuleContext(EqualityExpressionContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(SophiaParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(SophiaParser.AND, i);
		}
		public AndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndExpressionContext andExpression() throws RecognitionException {
		AndExpressionContext _localctx = new AndExpressionContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_andExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(486);
			((AndExpressionContext)_localctx).ee = equalityExpression();
			((AndExpressionContext)_localctx).andExpRet =  ((AndExpressionContext)_localctx).ee.eqExpRet;
			setState(494);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(488);
				((AndExpressionContext)_localctx).AND = match(AND);
				setState(489);
				((AndExpressionContext)_localctx).ee = equalityExpression();
				((AndExpressionContext)_localctx).andExpRet =  new BinaryExpression(_localctx.andExpRet,((AndExpressionContext)_localctx).ee.eqExpRet,BinaryOperator.and);
				            _localctx.andExpRet.setLine(((AndExpressionContext)_localctx).AND.getLine());
				}
				}
				setState(496);
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

	public static class EqualityExpressionContext extends ParserRuleContext {
		public Expression eqExpRet;
		public RelationalExpressionContext re;
		public Token EQUAL;
		public Token NOT_EQUAL;
		public List<RelationalExpressionContext> relationalExpression() {
			return getRuleContexts(RelationalExpressionContext.class);
		}
		public RelationalExpressionContext relationalExpression(int i) {
			return getRuleContext(RelationalExpressionContext.class,i);
		}
		public List<TerminalNode> EQUAL() { return getTokens(SophiaParser.EQUAL); }
		public TerminalNode EQUAL(int i) {
			return getToken(SophiaParser.EQUAL, i);
		}
		public List<TerminalNode> NOT_EQUAL() { return getTokens(SophiaParser.NOT_EQUAL); }
		public TerminalNode NOT_EQUAL(int i) {
			return getToken(SophiaParser.NOT_EQUAL, i);
		}
		public EqualityExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterEqualityExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitEqualityExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitEqualityExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualityExpressionContext equalityExpression() throws RecognitionException {
		EqualityExpressionContext _localctx = new EqualityExpressionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_equalityExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(497);
			((EqualityExpressionContext)_localctx).re = relationalExpression();
			((EqualityExpressionContext)_localctx).eqExpRet =  ((EqualityExpressionContext)_localctx).re.reExpRet;BinaryOperator eqop; int line;
			setState(510);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NOT_EQUAL || _la==EQUAL) {
				{
				{
				setState(503);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case EQUAL:
					{
					setState(499);
					((EqualityExpressionContext)_localctx).EQUAL = match(EQUAL);
					eqop = BinaryOperator.eq; line = ((EqualityExpressionContext)_localctx).EQUAL.getLine();
					}
					break;
				case NOT_EQUAL:
					{
					setState(501);
					((EqualityExpressionContext)_localctx).NOT_EQUAL = match(NOT_EQUAL);
					eqop = BinaryOperator.neq; line = ((EqualityExpressionContext)_localctx).NOT_EQUAL.getLine(); 
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(505);
				((EqualityExpressionContext)_localctx).re = relationalExpression();
				((EqualityExpressionContext)_localctx).eqExpRet =  new BinaryExpression(_localctx.eqExpRet,((EqualityExpressionContext)_localctx).re.reExpRet,eqop);
				             _localctx.eqExpRet.setLine(line);
				}
				}
				setState(512);
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

	public static class RelationalExpressionContext extends ParserRuleContext {
		public Expression reExpRet;
		public AdditiveExpressionContext ae;
		public Token GREATER_THAN;
		public Token LESS_THAN;
		public List<AdditiveExpressionContext> additiveExpression() {
			return getRuleContexts(AdditiveExpressionContext.class);
		}
		public AdditiveExpressionContext additiveExpression(int i) {
			return getRuleContext(AdditiveExpressionContext.class,i);
		}
		public List<TerminalNode> GREATER_THAN() { return getTokens(SophiaParser.GREATER_THAN); }
		public TerminalNode GREATER_THAN(int i) {
			return getToken(SophiaParser.GREATER_THAN, i);
		}
		public List<TerminalNode> LESS_THAN() { return getTokens(SophiaParser.LESS_THAN); }
		public TerminalNode LESS_THAN(int i) {
			return getToken(SophiaParser.LESS_THAN, i);
		}
		public RelationalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterRelationalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitRelationalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitRelationalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationalExpressionContext relationalExpression() throws RecognitionException {
		RelationalExpressionContext _localctx = new RelationalExpressionContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_relationalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(513);
			((RelationalExpressionContext)_localctx).ae = additiveExpression();
			((RelationalExpressionContext)_localctx).reExpRet =  ((RelationalExpressionContext)_localctx).ae.addExpRet;BinaryOperator reop; int line;
			setState(526);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==GREATER_THAN || _la==LESS_THAN) {
				{
				{
				setState(518);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case GREATER_THAN:
					{
					setState(515);
					((RelationalExpressionContext)_localctx).GREATER_THAN = match(GREATER_THAN);
					reop = BinaryOperator.gt; line = ((RelationalExpressionContext)_localctx).GREATER_THAN.getLine(); 
					}
					break;
				case LESS_THAN:
					{
					setState(517);
					((RelationalExpressionContext)_localctx).LESS_THAN = match(LESS_THAN);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				reop = BinaryOperator.lt; line = ((RelationalExpressionContext)_localctx).LESS_THAN.getLine(); 
				setState(521);
				((RelationalExpressionContext)_localctx).ae = additiveExpression();
				((RelationalExpressionContext)_localctx).reExpRet =  new BinaryExpression(_localctx.reExpRet,((RelationalExpressionContext)_localctx).ae.addExpRet,reop);
				             _localctx.reExpRet.setLine(line);
				}
				}
				setState(528);
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

	public static class AdditiveExpressionContext extends ParserRuleContext {
		public Expression addExpRet;
		public MultiplicativeExpressionContext me;
		public Token PLUS;
		public Token MINUS;
		public List<MultiplicativeExpressionContext> multiplicativeExpression() {
			return getRuleContexts(MultiplicativeExpressionContext.class);
		}
		public MultiplicativeExpressionContext multiplicativeExpression(int i) {
			return getRuleContext(MultiplicativeExpressionContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(SophiaParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(SophiaParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(SophiaParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(SophiaParser.MINUS, i);
		}
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitAdditiveExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitAdditiveExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_additiveExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(529);
			((AdditiveExpressionContext)_localctx).me = multiplicativeExpression();
			((AdditiveExpressionContext)_localctx).addExpRet =  ((AdditiveExpressionContext)_localctx).me.mulExpRet;BinaryOperator adop; int line;
			setState(542);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(535);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PLUS:
					{
					setState(531);
					((AdditiveExpressionContext)_localctx).PLUS = match(PLUS);
					adop = BinaryOperator.add; line = ((AdditiveExpressionContext)_localctx).PLUS.getLine();
					}
					break;
				case MINUS:
					{
					setState(533);
					((AdditiveExpressionContext)_localctx).MINUS = match(MINUS);
					adop = BinaryOperator.sub; line = ((AdditiveExpressionContext)_localctx).MINUS.getLine();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(537);
				((AdditiveExpressionContext)_localctx).me = multiplicativeExpression();
				((AdditiveExpressionContext)_localctx).addExpRet =  new BinaryExpression(_localctx.addExpRet,((AdditiveExpressionContext)_localctx).me.mulExpRet,adop);
				             _localctx.addExpRet.setLine(line);
				}
				}
				setState(544);
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

	public static class MultiplicativeExpressionContext extends ParserRuleContext {
		public Expression mulExpRet;
		public PreUnaryExpressionContext pe;
		public Token MULT;
		public Token DIVIDE;
		public Token MOD;
		public List<PreUnaryExpressionContext> preUnaryExpression() {
			return getRuleContexts(PreUnaryExpressionContext.class);
		}
		public PreUnaryExpressionContext preUnaryExpression(int i) {
			return getRuleContext(PreUnaryExpressionContext.class,i);
		}
		public List<TerminalNode> MULT() { return getTokens(SophiaParser.MULT); }
		public TerminalNode MULT(int i) {
			return getToken(SophiaParser.MULT, i);
		}
		public List<TerminalNode> DIVIDE() { return getTokens(SophiaParser.DIVIDE); }
		public TerminalNode DIVIDE(int i) {
			return getToken(SophiaParser.DIVIDE, i);
		}
		public List<TerminalNode> MOD() { return getTokens(SophiaParser.MOD); }
		public TerminalNode MOD(int i) {
			return getToken(SophiaParser.MOD, i);
		}
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterMultiplicativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitMultiplicativeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitMultiplicativeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_multiplicativeExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(545);
			((MultiplicativeExpressionContext)_localctx).pe = preUnaryExpression();
			((MultiplicativeExpressionContext)_localctx).mulExpRet =  ((MultiplicativeExpressionContext)_localctx).pe.preunExpRet;BinaryOperator mulop; int line;
			setState(560);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULT) | (1L << DIVIDE) | (1L << MOD))) != 0)) {
				{
				{
				setState(553);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MULT:
					{
					setState(547);
					((MultiplicativeExpressionContext)_localctx).MULT = match(MULT);
					mulop = BinaryOperator.mult; line = ((MultiplicativeExpressionContext)_localctx).MULT.getLine();
					}
					break;
				case DIVIDE:
					{
					setState(549);
					((MultiplicativeExpressionContext)_localctx).DIVIDE = match(DIVIDE);
					mulop = BinaryOperator.div; line = ((MultiplicativeExpressionContext)_localctx).DIVIDE.getLine();
					}
					break;
				case MOD:
					{
					setState(551);
					((MultiplicativeExpressionContext)_localctx).MOD = match(MOD);
					mulop = BinaryOperator.mod; line = ((MultiplicativeExpressionContext)_localctx).MOD.getLine();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(555);
				((MultiplicativeExpressionContext)_localctx).pe = preUnaryExpression();
				((MultiplicativeExpressionContext)_localctx).mulExpRet =  new BinaryExpression(_localctx.mulExpRet,((MultiplicativeExpressionContext)_localctx).pe.preunExpRet,mulop);
				             _localctx.mulExpRet.setLine(line);
				}
				}
				setState(562);
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

	public static class PreUnaryExpressionContext extends ParserRuleContext {
		public Expression preunExpRet;
		public Token NOT;
		public Token MINUS;
		public Token INCREMENT;
		public Token DECREMENT;
		public PreUnaryExpressionContext pre;
		public PostUnaryExpressionContext postUnaryExpression;
		public PreUnaryExpressionContext preUnaryExpression() {
			return getRuleContext(PreUnaryExpressionContext.class,0);
		}
		public TerminalNode NOT() { return getToken(SophiaParser.NOT, 0); }
		public TerminalNode MINUS() { return getToken(SophiaParser.MINUS, 0); }
		public TerminalNode INCREMENT() { return getToken(SophiaParser.INCREMENT, 0); }
		public TerminalNode DECREMENT() { return getToken(SophiaParser.DECREMENT, 0); }
		public PostUnaryExpressionContext postUnaryExpression() {
			return getRuleContext(PostUnaryExpressionContext.class,0);
		}
		public PreUnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preUnaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterPreUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitPreUnaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitPreUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PreUnaryExpressionContext preUnaryExpression() throws RecognitionException {
		PreUnaryExpressionContext _localctx = new PreUnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_preUnaryExpression);
		try {
			setState(581);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
			case NOT:
			case INCREMENT:
			case DECREMENT:
				enterOuterAlt(_localctx, 1);
				{
				UnaryOperator preop; int line;
				{
				setState(572);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NOT:
					{
					setState(564);
					((PreUnaryExpressionContext)_localctx).NOT = match(NOT);
					preop = UnaryOperator.not; line = ((PreUnaryExpressionContext)_localctx).NOT.getLine();
					}
					break;
				case MINUS:
					{
					setState(566);
					((PreUnaryExpressionContext)_localctx).MINUS = match(MINUS);
					preop = UnaryOperator.minus; line = ((PreUnaryExpressionContext)_localctx).MINUS.getLine();
					}
					break;
				case INCREMENT:
					{
					setState(568);
					((PreUnaryExpressionContext)_localctx).INCREMENT = match(INCREMENT);
					preop = UnaryOperator.preinc; line = ((PreUnaryExpressionContext)_localctx).INCREMENT.getLine();
					}
					break;
				case DECREMENT:
					{
					setState(570);
					((PreUnaryExpressionContext)_localctx).DECREMENT = match(DECREMENT);
					preop = UnaryOperator.predec; line = ((PreUnaryExpressionContext)_localctx).DECREMENT.getLine();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(574);
				((PreUnaryExpressionContext)_localctx).pre = preUnaryExpression();
				}
				((PreUnaryExpressionContext)_localctx).preunExpRet =  new UnaryExpression(((PreUnaryExpressionContext)_localctx).pre.preunExpRet,preop);
				             _localctx.preunExpRet.setLine(line);
				}
				break;
			case NEW:
			case NULL:
			case TRUE:
			case FALSE:
			case THIS:
			case LPAR:
			case LBRACK:
			case INT_VALUE:
			case IDENTIFIER:
			case STRING_VALUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(578);
				((PreUnaryExpressionContext)_localctx).postUnaryExpression = postUnaryExpression();
				((PreUnaryExpressionContext)_localctx).preunExpRet =  ((PreUnaryExpressionContext)_localctx).postUnaryExpression.postunExpRet;
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

	public static class PostUnaryExpressionContext extends ParserRuleContext {
		public Expression postunExpRet;
		public AccessExpressionContext ace;
		public Token INCREMENT;
		public Token DECREMENT;
		public AccessExpressionContext accessExpression() {
			return getRuleContext(AccessExpressionContext.class,0);
		}
		public TerminalNode INCREMENT() { return getToken(SophiaParser.INCREMENT, 0); }
		public TerminalNode DECREMENT() { return getToken(SophiaParser.DECREMENT, 0); }
		public PostUnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postUnaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterPostUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitPostUnaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitPostUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostUnaryExpressionContext postUnaryExpression() throws RecognitionException {
		PostUnaryExpressionContext _localctx = new PostUnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_postUnaryExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(583);
			((PostUnaryExpressionContext)_localctx).ace = accessExpression();
			((PostUnaryExpressionContext)_localctx).postunExpRet =  ((PostUnaryExpressionContext)_localctx).ace.accExpRet;UnaryOperator op; int line;
			setState(590);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INCREMENT:
				{
				setState(585);
				((PostUnaryExpressionContext)_localctx).INCREMENT = match(INCREMENT);
				op = UnaryOperator.postinc; line = ((PostUnaryExpressionContext)_localctx).INCREMENT.getLine();
				}
				break;
			case DECREMENT:
				{
				setState(587);
				((PostUnaryExpressionContext)_localctx).DECREMENT = match(DECREMENT);
				op = UnaryOperator.postdec; line = ((PostUnaryExpressionContext)_localctx).DECREMENT.getLine();
				((PostUnaryExpressionContext)_localctx).postunExpRet =  new UnaryExpression(((PostUnaryExpressionContext)_localctx).ace.accExpRet, op);
				            _localctx.postunExpRet.setLine(line);
				}
				break;
			case GREATER_THAN:
			case LESS_THAN:
			case NOT_EQUAL:
			case EQUAL:
			case MULT:
			case DIVIDE:
			case MOD:
			case PLUS:
			case MINUS:
			case AND:
			case OR:
			case ASSIGN:
			case RPAR:
			case RBRACK:
			case COMMA:
			case SEMICOLLON:
				break;
			default:
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

	public static class AccessExpressionContext extends ParserRuleContext {
		public Expression accExpRet;
		public Expression instance;
		public OtherExpressionContext otherExpression;
		public Token LPAR;
		public MethodCallArgumentsContext methodCallArguments;
		public IdentifierContext identifier;
		public Token LBRACK;
		public ExpressionContext expression;
		public OtherExpressionContext otherExpression() {
			return getRuleContext(OtherExpressionContext.class,0);
		}
		public List<TerminalNode> LPAR() { return getTokens(SophiaParser.LPAR); }
		public TerminalNode LPAR(int i) {
			return getToken(SophiaParser.LPAR, i);
		}
		public List<MethodCallArgumentsContext> methodCallArguments() {
			return getRuleContexts(MethodCallArgumentsContext.class);
		}
		public MethodCallArgumentsContext methodCallArguments(int i) {
			return getRuleContext(MethodCallArgumentsContext.class,i);
		}
		public List<TerminalNode> RPAR() { return getTokens(SophiaParser.RPAR); }
		public TerminalNode RPAR(int i) {
			return getToken(SophiaParser.RPAR, i);
		}
		public List<TerminalNode> DOT() { return getTokens(SophiaParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(SophiaParser.DOT, i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> LBRACK() { return getTokens(SophiaParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(SophiaParser.LBRACK, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(SophiaParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(SophiaParser.RBRACK, i);
		}
		public AccessExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterAccessExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitAccessExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitAccessExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AccessExpressionContext accessExpression() throws RecognitionException {
		AccessExpressionContext _localctx = new AccessExpressionContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_accessExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(592);
			((AccessExpressionContext)_localctx).otherExpression = otherExpression();
			((AccessExpressionContext)_localctx).instance =  ((AccessExpressionContext)_localctx).otherExpression.otherExpRet; 
			setState(610);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << LBRACK) | (1L << DOT))) != 0)) {
				{
				setState(608);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LPAR:
					{
					{
					setState(594);
					((AccessExpressionContext)_localctx).LPAR = match(LPAR);
					setState(595);
					((AccessExpressionContext)_localctx).methodCallArguments = methodCallArguments();
					((AccessExpressionContext)_localctx).instance =  new MethodCall(_localctx.instance,((AccessExpressionContext)_localctx).methodCallArguments.args);
					            _localctx.instance.setLine(((AccessExpressionContext)_localctx).LPAR.getLine());
					setState(597);
					match(RPAR);
					}
					}
					break;
				case DOT:
					{
					{
					setState(599);
					match(DOT);
					setState(600);
					((AccessExpressionContext)_localctx).identifier = identifier();
					((AccessExpressionContext)_localctx).instance =  new ObjectOrListMemberAccess(_localctx.instance,((AccessExpressionContext)_localctx).identifier.idRet);
					            _localctx.accExpRet.setLine(((AccessExpressionContext)_localctx).identifier.idRet.getLine());
					}
					}
					break;
				case LBRACK:
					{
					{
					setState(603);
					((AccessExpressionContext)_localctx).LBRACK = match(LBRACK);
					setState(604);
					((AccessExpressionContext)_localctx).expression = expression();
					((AccessExpressionContext)_localctx).instance =  new ListAccessByIndex(_localctx.instance,((AccessExpressionContext)_localctx).expression.exprRet);
					            _localctx.instance.setLine(((AccessExpressionContext)_localctx).LBRACK.getLine());
					setState(606);
					match(RBRACK);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(612);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			((AccessExpressionContext)_localctx).accExpRet =  _localctx.instance;
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

	public static class OtherExpressionContext extends ParserRuleContext {
		public Expression otherExpRet;
		public NewExpressionContext newExpression;
		public ValuesContext values;
		public IdentifierContext identifier;
		public ExpressionContext expression;
		public TerminalNode THIS() { return getToken(SophiaParser.THIS, 0); }
		public NewExpressionContext newExpression() {
			return getRuleContext(NewExpressionContext.class,0);
		}
		public ValuesContext values() {
			return getRuleContext(ValuesContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(SophiaParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SophiaParser.RPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public OtherExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_otherExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterOtherExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitOtherExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitOtherExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OtherExpressionContext otherExpression() throws RecognitionException {
		OtherExpressionContext _localctx = new OtherExpressionContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_otherExpression);
		try {
			setState(631);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case THIS:
				enterOuterAlt(_localctx, 1);
				{
				setState(615);
				match(THIS);
				((OtherExpressionContext)_localctx).otherExpRet =  new ThisClass();
				}
				break;
			case NEW:
				enterOuterAlt(_localctx, 2);
				{
				setState(617);
				((OtherExpressionContext)_localctx).newExpression = newExpression();
				((OtherExpressionContext)_localctx).otherExpRet =  ((OtherExpressionContext)_localctx).newExpression.otherExpRet;
				}
				break;
			case NULL:
			case TRUE:
			case FALSE:
			case LBRACK:
			case INT_VALUE:
			case STRING_VALUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(620);
				((OtherExpressionContext)_localctx).values = values();
				((OtherExpressionContext)_localctx).otherExpRet =  ((OtherExpressionContext)_localctx).values.valRet;
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 4);
				{
				setState(623);
				((OtherExpressionContext)_localctx).identifier = identifier();
				((OtherExpressionContext)_localctx).otherExpRet =  ((OtherExpressionContext)_localctx).identifier.idRet;
				}
				break;
			case LPAR:
				enterOuterAlt(_localctx, 5);
				{
				setState(626);
				match(LPAR);
				{
				setState(627);
				((OtherExpressionContext)_localctx).expression = expression();
				}
				setState(628);
				match(RPAR);
				((OtherExpressionContext)_localctx).otherExpRet =  ((OtherExpressionContext)_localctx).expression.exprRet;
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

	public static class NewExpressionContext extends ParserRuleContext {
		public Expression otherExpRet;
		public Token NEW;
		public ClassTypeContext classType;
		public MethodCallArgumentsContext methodCallArguments;
		public TerminalNode NEW() { return getToken(SophiaParser.NEW, 0); }
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(SophiaParser.LPAR, 0); }
		public MethodCallArgumentsContext methodCallArguments() {
			return getRuleContext(MethodCallArgumentsContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(SophiaParser.RPAR, 0); }
		public NewExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterNewExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitNewExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitNewExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewExpressionContext newExpression() throws RecognitionException {
		NewExpressionContext _localctx = new NewExpressionContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_newExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(633);
			((NewExpressionContext)_localctx).NEW = match(NEW);
			setState(634);
			((NewExpressionContext)_localctx).classType = classType();
			setState(635);
			match(LPAR);
			setState(636);
			((NewExpressionContext)_localctx).methodCallArguments = methodCallArguments();
			setState(637);
			match(RPAR);
			((NewExpressionContext)_localctx).otherExpRet =  new NewClassInstance(new ClassType(((NewExpressionContext)_localctx).classType.classTypeRet),((NewExpressionContext)_localctx).methodCallArguments.args);
			            _localctx.otherExpRet.setLine(((NewExpressionContext)_localctx).NEW.getLine());
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

	public static class ValuesContext extends ParserRuleContext {
		public Value valRet;
		public BoolValueContext boolValue;
		public Token STRING_VALUE;
		public Token INT_VALUE;
		public ListValueContext listValue;
		public BoolValueContext boolValue() {
			return getRuleContext(BoolValueContext.class,0);
		}
		public TerminalNode STRING_VALUE() { return getToken(SophiaParser.STRING_VALUE, 0); }
		public TerminalNode INT_VALUE() { return getToken(SophiaParser.INT_VALUE, 0); }
		public TerminalNode NULL() { return getToken(SophiaParser.NULL, 0); }
		public ListValueContext listValue() {
			return getRuleContext(ListValueContext.class,0);
		}
		public ValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_values; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterValues(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitValues(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitValues(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValuesContext values() throws RecognitionException {
		ValuesContext _localctx = new ValuesContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_values);
		try {
			setState(652);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 1);
				{
				setState(640);
				((ValuesContext)_localctx).boolValue = boolValue();
				((ValuesContext)_localctx).valRet =  ((ValuesContext)_localctx).boolValue.boolRet;
				}
				break;
			case STRING_VALUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(643);
				((ValuesContext)_localctx).STRING_VALUE = match(STRING_VALUE);
				((ValuesContext)_localctx).valRet =  new StringValue(((ValuesContext)_localctx).STRING_VALUE.getText());_localctx.valRet.setLine(((ValuesContext)_localctx).STRING_VALUE.getLine());
				}
				break;
			case INT_VALUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(645);
				((ValuesContext)_localctx).INT_VALUE = match(INT_VALUE);
				((ValuesContext)_localctx).valRet =  new IntValue(INT_VALUE);_localctx.valRet.setLine(((ValuesContext)_localctx).INT_VALUE.getLine());
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 4);
				{
				setState(647);
				match(NULL);
				((ValuesContext)_localctx).valRet =  new NullValue();
				}
				break;
			case LBRACK:
				enterOuterAlt(_localctx, 5);
				{
				setState(649);
				((ValuesContext)_localctx).listValue = listValue();
				((ValuesContext)_localctx).valRet =  ((ValuesContext)_localctx).listValue.listvalRet;
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

	public static class BoolValueContext extends ParserRuleContext {
		public BoolValue boolRet;
		public Token TRUE;
		public Token FALSE;
		public TerminalNode TRUE() { return getToken(SophiaParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(SophiaParser.FALSE, 0); }
		public BoolValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterBoolValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitBoolValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitBoolValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolValueContext boolValue() throws RecognitionException {
		BoolValueContext _localctx = new BoolValueContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_boolValue);
		try {
			setState(658);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(654);
				((BoolValueContext)_localctx).TRUE = match(TRUE);
				((BoolValueContext)_localctx).boolRet =  new BoolValue(true);_localctx.boolRet.setLine(((BoolValueContext)_localctx).TRUE.getLine());
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(656);
				((BoolValueContext)_localctx).FALSE = match(FALSE);
				((BoolValueContext)_localctx).boolRet =  new BoolValue(false);_localctx.boolRet.setLine(((BoolValueContext)_localctx).FALSE.getLine());
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

	public static class ListValueContext extends ParserRuleContext {
		public ListValue listvalRet;
		public Token LBRACK;
		public MethodCallArgumentsContext methodCallArguments;
		public TerminalNode LBRACK() { return getToken(SophiaParser.LBRACK, 0); }
		public MethodCallArgumentsContext methodCallArguments() {
			return getRuleContext(MethodCallArgumentsContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(SophiaParser.RBRACK, 0); }
		public ListValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterListValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitListValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitListValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListValueContext listValue() throws RecognitionException {
		ListValueContext _localctx = new ListValueContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_listValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(660);
			((ListValueContext)_localctx).LBRACK = match(LBRACK);
			setState(661);
			((ListValueContext)_localctx).methodCallArguments = methodCallArguments();

			            ((ListValueContext)_localctx).listvalRet =  new ListValue(((ListValueContext)_localctx).methodCallArguments.args);
			            _localctx.listvalRet.setLine(((ListValueContext)_localctx).LBRACK.getLine());
			            
			setState(663);
			match(RBRACK);
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

	public static class IdentifierContext extends ParserRuleContext {
		public Identifier idRet;
		public Token IDENTIFIER;
		public TerminalNode IDENTIFIER() { return getToken(SophiaParser.IDENTIFIER, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(665);
			((IdentifierContext)_localctx).IDENTIFIER = match(IDENTIFIER);
			((IdentifierContext)_localctx).idRet =  new Identifier(((IdentifierContext)_localctx).IDENTIFIER.getText());_localctx.idRet.setLine(((IdentifierContext)_localctx).IDENTIFIER.getLine());
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3:\u029f\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\7\3g\n\3\f\3\16"+
		"\3j\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4s\n\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\7\4|\n\4\f\4\16\4\177\13\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4\u0089"+
		"\n\4\f\4\16\4\u008c\13\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4\u0094\n\4\f\4\16"+
		"\4\u0097\13\4\5\4\u0099\n\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3"+
		"\6\5\6\u00a6\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u00c4\n"+
		"\b\f\b\16\b\u00c7\13\b\5\b\u00c9\n\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00dc\n\n\3\13\3\13\3\13\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00eb\n\f\3\f\3\f\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\7\r\u00f6\n\r\f\r\16\r\u00f9\13\r\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\5\16\u0101\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u010a"+
		"\n\17\3\17\3\17\3\17\3\17\3\17\5\17\u0111\n\17\3\17\3\17\3\17\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\7\20\u011d\n\20\f\20\16\20\u0120\13\20\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\5\21\u0128\n\21\3\22\3\22\3\22\7\22\u012d\n"+
		"\22\f\22\16\22\u0130\13\22\3\22\3\22\3\22\7\22\u0135\n\22\f\22\16\22\u0138"+
		"\13\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\5\23\u0155\n\23\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u015d\n\24\f\24\16"+
		"\24\u0160\13\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\5\30\u0176\n\30\3\30\3\30"+
		"\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\7\32\u0190\n\32\f\32\16\32\u0193"+
		"\13\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\7\33\u01a2\n\33\f\33\16\33\u01a5\13\33\5\33\u01a7\n\33\3\34\3\34\3\34"+
		"\3\34\5\34\u01ad\n\34\3\34\3\34\3\35\3\35\3\35\5\35\u01b4\n\35\3\35\3"+
		"\35\5\35\u01b8\n\35\3\35\3\35\5\35\u01bc\n\35\3\35\3\35\3\35\3\35\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\5\37\u01d5\n\37\3 \3 \3 \3 \3 \5 \u01dc\n \3!\3!"+
		"\3!\3!\3!\3!\7!\u01e4\n!\f!\16!\u01e7\13!\3\"\3\"\3\"\3\"\3\"\3\"\7\""+
		"\u01ef\n\"\f\"\16\"\u01f2\13\"\3#\3#\3#\3#\3#\3#\5#\u01fa\n#\3#\3#\3#"+
		"\7#\u01ff\n#\f#\16#\u0202\13#\3$\3$\3$\3$\3$\5$\u0209\n$\3$\3$\3$\3$\7"+
		"$\u020f\n$\f$\16$\u0212\13$\3%\3%\3%\3%\3%\3%\5%\u021a\n%\3%\3%\3%\7%"+
		"\u021f\n%\f%\16%\u0222\13%\3&\3&\3&\3&\3&\3&\3&\3&\5&\u022c\n&\3&\3&\3"+
		"&\7&\u0231\n&\f&\16&\u0234\13&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'"+
		"\u023f\n\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u0248\n\'\3(\3(\3(\3(\3(\3"+
		"(\3(\5(\u0251\n(\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\7)\u0263"+
		"\n)\f)\16)\u0266\13)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3"+
		"*\3*\5*\u027a\n*\3+\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3"+
		",\3,\5,\u028f\n,\3-\3-\3-\3-\5-\u0295\n-\3.\3.\3.\3.\3.\3/\3/\3/\3/\2"+
		"\2\60\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>"+
		"@BDFHJLNPRTVXZ\\\2\2\2\u02bb\2^\3\2\2\2\4b\3\2\2\2\6k\3\2\2\2\b\u009c"+
		"\3\2\2\2\n\u00a2\3\2\2\2\f\u00b1\3\2\2\2\16\u00bc\3\2\2\2\20\u00ca\3\2"+
		"\2\2\22\u00db\3\2\2\2\24\u00dd\3\2\2\2\26\u00e0\3\2\2\2\30\u00ee\3\2\2"+
		"\2\32\u0100\3\2\2\2\34\u0102\3\2\2\2\36\u0115\3\2\2\2 \u0127\3\2\2\2\""+
		"\u012e\3\2\2\2$\u0154\3\2\2\2&\u0156\3\2\2\2(\u0163\3\2\2\2*\u0167\3\2"+
		"\2\2,\u016c\3\2\2\2.\u0173\3\2\2\2\60\u017a\3\2\2\2\62\u017e\3\2\2\2\64"+
		"\u01a6\3\2\2\2\66\u01ac\3\2\2\28\u01b0\3\2\2\2:\u01c1\3\2\2\2<\u01ca\3"+
		"\2\2\2>\u01d6\3\2\2\2@\u01dd\3\2\2\2B\u01e8\3\2\2\2D\u01f3\3\2\2\2F\u0203"+
		"\3\2\2\2H\u0213\3\2\2\2J\u0223\3\2\2\2L\u0247\3\2\2\2N\u0249\3\2\2\2P"+
		"\u0252\3\2\2\2R\u0279\3\2\2\2T\u027b\3\2\2\2V\u028e\3\2\2\2X\u0294\3\2"+
		"\2\2Z\u0296\3\2\2\2\\\u029b\3\2\2\2^_\5\4\3\2_`\b\2\1\2`a\7\2\2\3a\3\3"+
		"\2\2\2bh\b\3\1\2cd\5\6\4\2de\b\3\1\2eg\3\2\2\2fc\3\2\2\2gj\3\2\2\2hf\3"+
		"\2\2\2hi\3\2\2\2i\5\3\2\2\2jh\3\2\2\2kl\7\5\2\2lm\5\\/\2mr\b\4\1\2no\7"+
		"\4\2\2op\5\\/\2pq\b\4\1\2qs\3\2\2\2rn\3\2\2\2rs\3\2\2\2st\3\2\2\2t\u0098"+
		"\7/\2\2uv\5\b\5\2vw\b\4\1\2w|\3\2\2\2xy\5\n\6\2yz\b\4\1\2z|\3\2\2\2{u"+
		"\3\2\2\2{x\3\2\2\2|\177\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\u0080\3\2\2\2\177"+
		"}\3\2\2\2\u0080\u0081\5\f\7\2\u0081\u008a\b\4\1\2\u0082\u0083\5\b\5\2"+
		"\u0083\u0084\b\4\1\2\u0084\u0089\3\2\2\2\u0085\u0086\5\n\6\2\u0086\u0087"+
		"\b\4\1\2\u0087\u0089\3\2\2\2\u0088\u0082\3\2\2\2\u0088\u0085\3\2\2\2\u0089"+
		"\u008c\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u0099\3\2"+
		"\2\2\u008c\u008a\3\2\2\2\u008d\u008e\5\b\5\2\u008e\u008f\b\4\1\2\u008f"+
		"\u0094\3\2\2\2\u0090\u0091\5\n\6\2\u0091\u0092\b\4\1\2\u0092\u0094\3\2"+
		"\2\2\u0093\u008d\3\2\2\2\u0093\u0090\3\2\2\2\u0094\u0097\3\2\2\2\u0095"+
		"\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0099\3\2\2\2\u0097\u0095\3\2"+
		"\2\2\u0098}\3\2\2\2\u0098\u0095\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009b"+
		"\7\60\2\2\u009b\7\3\2\2\2\u009c\u009d\5\\/\2\u009d\u009e\7\64\2\2\u009e"+
		"\u009f\5\22\n\2\u009f\u00a0\7\65\2\2\u00a0\u00a1\b\5\1\2\u00a1\t\3\2\2"+
		"\2\u00a2\u00a5\7\3\2\2\u00a3\u00a6\5\22\n\2\u00a4\u00a6\7\24\2\2\u00a5"+
		"\u00a3\3\2\2\2\u00a5\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a8\5\\"+
		"/\2\u00a8\u00a9\b\6\1\2\u00a9\u00aa\7+\2\2\u00aa\u00ab\5\16\b\2\u00ab"+
		"\u00ac\b\6\1\2\u00ac\u00ad\7,\2\2\u00ad\u00ae\7/\2\2\u00ae\u00af\5\"\22"+
		"\2\u00af\u00b0\7\60\2\2\u00b0\13\3\2\2\2\u00b1\u00b2\7\3\2\2\u00b2\u00b3"+
		"\5\\/\2\u00b3\u00b4\b\7\1\2\u00b4\u00b5\7+\2\2\u00b5\u00b6\5\16\b\2\u00b6"+
		"\u00b7\b\7\1\2\u00b7\u00b8\7,\2\2\u00b8\u00b9\7/\2\2\u00b9\u00ba\5\"\22"+
		"\2\u00ba\u00bb\7\60\2\2\u00bb\r\3\2\2\2\u00bc\u00c8\b\b\1\2\u00bd\u00be"+
		"\5\20\t\2\u00be\u00c5\b\b\1\2\u00bf\u00c0\7\62\2\2\u00c0\u00c1\5\20\t"+
		"\2\u00c1\u00c2\b\b\1\2\u00c2\u00c4\3\2\2\2\u00c3\u00bf\3\2\2\2\u00c4\u00c7"+
		"\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c9\3\2\2\2\u00c7"+
		"\u00c5\3\2\2\2\u00c8\u00bd\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\17\3\2\2"+
		"\2\u00ca\u00cb\5\\/\2\u00cb\u00cc\7\64\2\2\u00cc\u00cd\5\22\n\2\u00cd"+
		"\u00ce\b\t\1\2\u00ce\21\3\2\2\2\u00cf\u00d0\5 \21\2\u00d0\u00d1\b\n\1"+
		"\2\u00d1\u00dc\3\2\2\2\u00d2\u00d3\5\26\f\2\u00d3\u00d4\b\n\1\2\u00d4"+
		"\u00dc\3\2\2\2\u00d5\u00d6\5\34\17\2\u00d6\u00d7\b\n\1\2\u00d7\u00dc\3"+
		"\2\2\2\u00d8\u00d9\5\24\13\2\u00d9\u00da\b\n\1\2\u00da\u00dc\3\2\2\2\u00db"+
		"\u00cf\3\2\2\2\u00db\u00d2\3\2\2\2\u00db\u00d5\3\2\2\2\u00db\u00d8\3\2"+
		"\2\2\u00dc\23\3\2\2\2\u00dd\u00de\5\\/\2\u00de\u00df\b\13\1\2\u00df\25"+
		"\3\2\2\2\u00e0\u00e1\7\26\2\2\u00e1\u00ea\7+\2\2\u00e2\u00e3\7\66\2\2"+
		"\u00e3\u00e4\7\61\2\2\u00e4\u00e5\5\22\n\2\u00e5\u00e6\b\f\1\2\u00e6\u00eb"+
		"\3\2\2\2\u00e7\u00e8\5\30\r\2\u00e8\u00e9\b\f\1\2\u00e9\u00eb\3\2\2\2"+
		"\u00ea\u00e2\3\2\2\2\u00ea\u00e7\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ed"+
		"\7,\2\2\u00ed\27\3\2\2\2\u00ee\u00ef\b\r\1\2\u00ef\u00f0\5\32\16\2\u00f0"+
		"\u00f7\b\r\1\2\u00f1\u00f2\7\62\2\2\u00f2\u00f3\5\32\16\2\u00f3\u00f4"+
		"\b\r\1\2\u00f4\u00f6\3\2\2\2\u00f5\u00f1\3\2\2\2\u00f6\u00f9\3\2\2\2\u00f7"+
		"\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\31\3\2\2\2\u00f9\u00f7\3\2\2"+
		"\2\u00fa\u00fb\5\20\t\2\u00fb\u00fc\b\16\1\2\u00fc\u0101\3\2\2\2\u00fd"+
		"\u00fe\5\22\n\2\u00fe\u00ff\b\16\1\2\u00ff\u0101\3\2\2\2\u0100\u00fa\3"+
		"\2\2\2\u0100\u00fd\3\2\2\2\u0101\33\3\2\2\2\u0102\u0103\7\7\2\2\u0103"+
		"\u0104\b\17\1\2\u0104\u0109\7\34\2\2\u0105\u010a\7\24\2\2\u0106\u0107"+
		"\5\36\20\2\u0107\u0108\b\17\1\2\u0108\u010a\3\2\2\2\u0109\u0105\3\2\2"+
		"\2\u0109\u0106\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u0110\7\32\2\2\u010c"+
		"\u0111\7\24\2\2\u010d\u010e\5\22\n\2\u010e\u010f\b\17\1\2\u010f\u0111"+
		"\3\2\2\2\u0110\u010c\3\2\2\2\u0110\u010d\3\2\2\2\u0111\u0112\3\2\2\2\u0112"+
		"\u0113\7\33\2\2\u0113\u0114\b\17\1\2\u0114\35\3\2\2\2\u0115\u0116\b\20"+
		"\1\2\u0116\u0117\5\22\n\2\u0117\u011e\b\20\1\2\u0118\u0119\7\62\2\2\u0119"+
		"\u011a\5\22\n\2\u011a\u011b\b\20\1\2\u011b\u011d\3\2\2\2\u011c\u0118\3"+
		"\2\2\2\u011d\u0120\3\2\2\2\u011e\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f"+
		"\37\3\2\2\2\u0120\u011e\3\2\2\2\u0121\u0122\7\23\2\2\u0122\u0128\b\21"+
		"\1\2\u0123\u0124\7\22\2\2\u0124\u0128\b\21\1\2\u0125\u0126\7\21\2\2\u0126"+
		"\u0128\b\21\1\2\u0127\u0121\3\2\2\2\u0127\u0123\3\2\2\2\u0127\u0125\3"+
		"\2\2\2\u0128!\3\2\2\2\u0129\u012a\5\b\5\2\u012a\u012b\b\22\1\2\u012b\u012d"+
		"\3\2\2\2\u012c\u0129\3\2\2\2\u012d\u0130\3\2\2\2\u012e\u012c\3\2\2\2\u012e"+
		"\u012f\3\2\2\2\u012f\u0136\3\2\2\2\u0130\u012e\3\2\2\2\u0131\u0132\5$"+
		"\23\2\u0132\u0133\b\22\1\2\u0133\u0135\3\2\2\2\u0134\u0131\3\2\2\2\u0135"+
		"\u0138\3\2\2\2\u0136\u0134\3\2\2\2\u0136\u0137\3\2\2\2\u0137#\3\2\2\2"+
		"\u0138\u0136\3\2\2\2\u0139\u013a\58\35\2\u013a\u013b\b\23\1\2\u013b\u0155"+
		"\3\2\2\2\u013c\u013d\5:\36\2\u013d\u013e\b\23\1\2\u013e\u0155\3\2\2\2"+
		"\u013f\u0140\5<\37\2\u0140\u0141\b\23\1\2\u0141\u0155\3\2\2\2\u0142\u0143"+
		"\5(\25\2\u0143\u0144\b\23\1\2\u0144\u0155\3\2\2\2\u0145\u0146\5,\27\2"+
		"\u0146\u0147\b\23\1\2\u0147\u0155\3\2\2\2\u0148\u0149\5\66\34\2\u0149"+
		"\u014a\b\23\1\2\u014a\u0155\3\2\2\2\u014b\u014c\5\60\31\2\u014c\u014d"+
		"\b\23\1\2\u014d\u0155\3\2\2\2\u014e\u014f\5.\30\2\u014f\u0150\b\23\1\2"+
		"\u0150\u0155\3\2\2\2\u0151\u0152\5&\24\2\u0152\u0153\b\23\1\2\u0153\u0155"+
		"\3\2\2\2\u0154\u0139\3\2\2\2\u0154\u013c\3\2\2\2\u0154\u013f\3\2\2\2\u0154"+
		"\u0142\3\2\2\2\u0154\u0145\3\2\2\2\u0154\u0148\3\2\2\2\u0154\u014b\3\2"+
		"\2\2\u0154\u014e\3\2\2\2\u0154\u0151\3\2\2\2\u0155%\3\2\2\2\u0156\u0157"+
		"\b\24\1\2\u0157\u0158\7/\2\2\u0158\u015e\b\24\1\2\u0159\u015a\5$\23\2"+
		"\u015a\u015b\b\24\1\2\u015b\u015d\3\2\2\2\u015c\u0159\3\2\2\2\u015d\u0160"+
		"\3\2\2\2\u015e\u015c\3\2\2\2\u015e\u015f\3\2\2\2\u015f\u0161\3\2\2\2\u0160"+
		"\u015e\3\2\2\2\u0161\u0162\7\60\2\2\u0162\'\3\2\2\2\u0163\u0164\5*\26"+
		"\2\u0164\u0165\7\65\2\2\u0165\u0166\b\25\1\2\u0166)\3\2\2\2\u0167\u0168"+
		"\5@!\2\u0168\u0169\7(\2\2\u0169\u016a\5> \2\u016a\u016b\b\26\1\2\u016b"+
		"+\3\2\2\2\u016c\u016d\7\6\2\2\u016d\u016e\7+\2\2\u016e\u016f\5> \2\u016f"+
		"\u0170\b\27\1\2\u0170\u0171\7,\2\2\u0171\u0172\7\65\2\2\u0172-\3\2\2\2"+
		"\u0173\u0175\7\13\2\2\u0174\u0176\5> \2\u0175\u0174\3\2\2\2\u0175\u0176"+
		"\3\2\2\2\u0176\u0177\3\2\2\2\u0177\u0178\b\30\1\2\u0178\u0179\7\65\2\2"+
		"\u0179/\3\2\2\2\u017a\u017b\5\62\32\2\u017b\u017c\b\31\1\2\u017c\u017d"+
		"\7\65\2\2\u017d\61\3\2\2\2\u017e\u017f\5R*\2\u017f\u0191\b\32\1\2\u0180"+
		"\u0181\7+\2\2\u0181\u0182\5\64\33\2\u0182\u0183\7,\2\2\u0183\u0184\3\2"+
		"\2\2\u0184\u0185\b\32\1\2\u0185\u0190\3\2\2\2\u0186\u0187\7\63\2\2\u0187"+
		"\u0188\5\\/\2\u0188\u0189\b\32\1\2\u0189\u0190\3\2\2\2\u018a\u018b\7-"+
		"\2\2\u018b\u018c\5> \2\u018c\u018d\b\32\1\2\u018d\u018e\7.\2\2\u018e\u0190"+
		"\3\2\2\2\u018f\u0180\3\2\2\2\u018f\u0186\3\2\2\2\u018f\u018a\3\2\2\2\u0190"+
		"\u0193\3\2\2\2\u0191\u018f\3\2\2\2\u0191\u0192\3\2\2\2\u0192\u0194\3\2"+
		"\2\2\u0193\u0191\3\2\2\2\u0194\u0195\7+\2\2\u0195\u0196\5\64\33\2\u0196"+
		"\u0197\7,\2\2\u0197\u0198\3\2\2\2\u0198\u0199\b\32\1\2\u0199\63\3\2\2"+
		"\2\u019a\u019b\b\33\1\2\u019b\u019c\5> \2\u019c\u01a3\b\33\1\2\u019d\u019e"+
		"\7\62\2\2\u019e\u019f\5> \2\u019f\u01a0\b\33\1\2\u01a0\u01a2\3\2\2\2\u01a1"+
		"\u019d\3\2\2\2\u01a2\u01a5\3\2\2\2\u01a3\u01a1\3\2\2\2\u01a3\u01a4\3\2"+
		"\2\2\u01a4\u01a7\3\2\2\2\u01a5\u01a3\3\2\2\2\u01a6\u019a\3\2\2\2\u01a6"+
		"\u01a7\3\2\2\2\u01a7\65\3\2\2\2\u01a8\u01a9\7\n\2\2\u01a9\u01ad\b\34\1"+
		"\2\u01aa\u01ab\7\t\2\2\u01ab\u01ad\b\34\1\2\u01ac\u01a8\3\2\2\2\u01ac"+
		"\u01aa\3\2\2\2\u01ad\u01ae\3\2\2\2\u01ae\u01af\7\65\2\2\u01af\67\3\2\2"+
		"\2\u01b0\u01b1\7\16\2\2\u01b1\u01b3\7+\2\2\u01b2\u01b4\5*\26\2\u01b3\u01b2"+
		"\3\2\2\2\u01b3\u01b4\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5\u01b7\7\65\2\2"+
		"\u01b6\u01b8\5> \2\u01b7\u01b6\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8\u01b9"+
		"\3\2\2\2\u01b9\u01bb\7\65\2\2\u01ba\u01bc\5*\26\2\u01bb\u01ba\3\2\2\2"+
		"\u01bb\u01bc\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd\u01be\7,\2\2\u01be\u01bf"+
		"\5$\23\2\u01bf\u01c0\b\35\1\2\u01c09\3\2\2\2\u01c1\u01c2\7\f\2\2\u01c2"+
		"\u01c3\7+\2\2\u01c3\u01c4\5\\/\2\u01c4\u01c5\7\r\2\2\u01c5\u01c6\5> \2"+
		"\u01c6\u01c7\7,\2\2\u01c7\u01c8\5$\23\2\u01c8\u01c9\b\36\1\2\u01c9;\3"+
		"\2\2\2\u01ca\u01cb\7\17\2\2\u01cb\u01cc\7+\2\2\u01cc\u01cd\5> \2\u01cd"+
		"\u01ce\7,\2\2\u01ce\u01cf\5$\23\2\u01cf\u01d4\b\37\1\2\u01d0\u01d1\7\20"+
		"\2\2\u01d1\u01d2\5$\23\2\u01d2\u01d3\b\37\1\2\u01d3\u01d5\3\2\2\2\u01d4"+
		"\u01d0\3\2\2\2\u01d4\u01d5\3\2\2\2\u01d5=\3\2\2\2\u01d6\u01db\5@!\2\u01d7"+
		"\u01d8\7(\2\2\u01d8\u01d9\5> \2\u01d9\u01da\b \1\2\u01da\u01dc\3\2\2\2"+
		"\u01db\u01d7\3\2\2\2\u01db\u01dc\3\2\2\2\u01dc?\3\2\2\2\u01dd\u01de\5"+
		"B\"\2\u01de\u01e5\b!\1\2\u01df\u01e0\7%\2\2\u01e0\u01e1\5B\"\2\u01e1\u01e2"+
		"\b!\1\2\u01e2\u01e4\3\2\2\2\u01e3\u01df\3\2\2\2\u01e4\u01e7\3\2\2\2\u01e5"+
		"\u01e3\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6A\3\2\2\2\u01e7\u01e5\3\2\2\2"+
		"\u01e8\u01e9\5D#\2\u01e9\u01f0\b\"\1\2\u01ea\u01eb\7$\2\2\u01eb\u01ec"+
		"\5D#\2\u01ec\u01ed\b\"\1\2\u01ed\u01ef\3\2\2\2\u01ee\u01ea\3\2\2\2\u01ef"+
		"\u01f2\3\2\2\2\u01f0\u01ee\3\2\2\2\u01f0\u01f1\3\2\2\2\u01f1C\3\2\2\2"+
		"\u01f2\u01f0\3\2\2\2\u01f3\u01f4\5F$\2\u01f4\u0200\b#\1\2\u01f5\u01f6"+
		"\7\36\2\2\u01f6\u01fa\b#\1\2\u01f7\u01f8\7\35\2\2\u01f8\u01fa\b#\1\2\u01f9"+
		"\u01f5\3\2\2\2\u01f9\u01f7\3\2\2\2\u01fa\u01fb\3\2\2\2\u01fb\u01fc\5F"+
		"$\2\u01fc\u01fd\b#\1\2\u01fd\u01ff\3\2\2\2\u01fe\u01f9\3\2\2\2\u01ff\u0202"+
		"\3\2\2\2\u0200\u01fe\3\2\2\2\u0200\u0201\3\2\2\2\u0201E\3\2\2\2\u0202"+
		"\u0200\3\2\2\2\u0203\u0204\5H%\2\u0204\u0210\b$\1\2\u0205\u0206\7\33\2"+
		"\2\u0206\u0209\b$\1\2\u0207\u0209\7\34\2\2\u0208\u0205\3\2\2\2\u0208\u0207"+
		"\3\2\2\2\u0209\u020a\3\2\2\2\u020a\u020b\b$\1\2\u020b\u020c\5H%\2\u020c"+
		"\u020d\b$\1\2\u020d\u020f\3\2\2\2\u020e\u0208\3\2\2\2\u020f\u0212\3\2"+
		"\2\2\u0210\u020e\3\2\2\2\u0210\u0211\3\2\2\2\u0211G\3\2\2\2\u0212\u0210"+
		"\3\2\2\2\u0213\u0214\5J&\2\u0214\u0220\b%\1\2\u0215\u0216\7\"\2\2\u0216"+
		"\u021a\b%\1\2\u0217\u0218\7#\2\2\u0218\u021a\b%\1\2\u0219\u0215\3\2\2"+
		"\2\u0219\u0217\3\2\2\2\u021a\u021b\3\2\2\2\u021b\u021c\5J&\2\u021c\u021d"+
		"\b%\1\2\u021d\u021f\3\2\2\2\u021e\u0219\3\2\2\2\u021f\u0222\3\2\2\2\u0220"+
		"\u021e\3\2\2\2\u0220\u0221\3\2\2\2\u0221I\3\2\2\2\u0222\u0220\3\2\2\2"+
		"\u0223\u0224\5L\'\2\u0224\u0232\b&\1\2\u0225\u0226\7\37\2\2\u0226\u022c"+
		"\b&\1\2\u0227\u0228\7 \2\2\u0228\u022c\b&\1\2\u0229\u022a\7!\2\2\u022a"+
		"\u022c\b&\1\2\u022b\u0225\3\2\2\2\u022b\u0227\3\2\2\2\u022b\u0229\3\2"+
		"\2\2\u022c\u022d\3\2\2\2\u022d\u022e\5L\'\2\u022e\u022f\b&\1\2\u022f\u0231"+
		"\3\2\2\2\u0230\u022b\3\2\2\2\u0231\u0234\3\2\2\2\u0232\u0230\3\2\2\2\u0232"+
		"\u0233\3\2\2\2\u0233K\3\2\2\2\u0234\u0232\3\2\2\2\u0235\u023e\b\'\1\2"+
		"\u0236\u0237\7&\2\2\u0237\u023f\b\'\1\2\u0238\u0239\7#\2\2\u0239\u023f"+
		"\b\'\1\2\u023a\u023b\7)\2\2\u023b\u023f\b\'\1\2\u023c\u023d\7*\2\2\u023d"+
		"\u023f\b\'\1\2\u023e\u0236\3\2\2\2\u023e\u0238\3\2\2\2\u023e\u023a\3\2"+
		"\2\2\u023e\u023c\3\2\2\2\u023f\u0240\3\2\2\2\u0240\u0241\5L\'\2\u0241"+
		"\u0242\3\2\2\2\u0242\u0243\b\'\1\2\u0243\u0248\3\2\2\2\u0244\u0245\5N"+
		"(\2\u0245\u0246\b\'\1\2\u0246\u0248\3\2\2\2\u0247\u0235\3\2\2\2\u0247"+
		"\u0244\3\2\2\2\u0248M\3\2\2\2\u0249\u024a\5P)\2\u024a\u0250\b(\1\2\u024b"+
		"\u024c\7)\2\2\u024c\u0251\b(\1\2\u024d\u024e\7*\2\2\u024e\u024f\b(\1\2"+
		"\u024f\u0251\b(\1\2\u0250\u024b\3\2\2\2\u0250\u024d\3\2\2\2\u0250\u0251"+
		"\3\2\2\2\u0251O\3\2\2\2\u0252\u0253\5R*\2\u0253\u0264\b)\1\2\u0254\u0255"+
		"\7+\2\2\u0255\u0256\5\64\33\2\u0256\u0257\b)\1\2\u0257\u0258\7,\2\2\u0258"+
		"\u0263\3\2\2\2\u0259\u025a\7\63\2\2\u025a\u025b\5\\/\2\u025b\u025c\b)"+
		"\1\2\u025c\u0263\3\2\2\2\u025d\u025e\7-\2\2\u025e\u025f\5> \2\u025f\u0260"+
		"\b)\1\2\u0260\u0261\7.\2\2\u0261\u0263\3\2\2\2\u0262\u0254\3\2\2\2\u0262"+
		"\u0259\3\2\2\2\u0262\u025d\3\2\2\2\u0263\u0266\3\2\2\2\u0264\u0262\3\2"+
		"\2\2\u0264\u0265\3\2\2\2\u0265\u0267\3\2\2\2\u0266\u0264\3\2\2\2\u0267"+
		"\u0268\b)\1\2\u0268Q\3\2\2\2\u0269\u026a\7\31\2\2\u026a\u027a\b*\1\2\u026b"+
		"\u026c\5T+\2\u026c\u026d\b*\1\2\u026d\u027a\3\2\2\2\u026e\u026f\5V,\2"+
		"\u026f\u0270\b*\1\2\u0270\u027a\3\2\2\2\u0271\u0272\5\\/\2\u0272\u0273"+
		"\b*\1\2\u0273\u027a\3\2\2\2\u0274\u0275\7+\2\2\u0275\u0276\5> \2\u0276"+
		"\u0277\7,\2\2\u0277\u0278\b*\1\2\u0278\u027a\3\2\2\2\u0279\u0269\3\2\2"+
		"\2\u0279\u026b\3\2\2\2\u0279\u026e\3\2\2\2\u0279\u0271\3\2\2\2\u0279\u0274"+
		"\3\2\2\2\u027aS\3\2\2\2\u027b\u027c\7\b\2\2\u027c\u027d\5\24\13\2\u027d"+
		"\u027e\7+\2\2\u027e\u027f\5\64\33\2\u027f\u0280\7,\2\2\u0280\u0281\b+"+
		"\1\2\u0281U\3\2\2\2\u0282\u0283\5X-\2\u0283\u0284\b,\1\2\u0284\u028f\3"+
		"\2\2\2\u0285\u0286\78\2\2\u0286\u028f\b,\1\2\u0287\u0288\7\66\2\2\u0288"+
		"\u028f\b,\1\2\u0289\u028a\7\25\2\2\u028a\u028f\b,\1\2\u028b\u028c\5Z."+
		"\2\u028c\u028d\b,\1\2\u028d\u028f\3\2\2\2\u028e\u0282\3\2\2\2\u028e\u0285"+
		"\3\2\2\2\u028e\u0287\3\2\2\2\u028e\u0289\3\2\2\2\u028e\u028b\3\2\2\2\u028f"+
		"W\3\2\2\2\u0290\u0291\7\27\2\2\u0291\u0295\b-\1\2\u0292\u0293\7\30\2\2"+
		"\u0293\u0295\b-\1\2\u0294\u0290\3\2\2\2\u0294\u0292\3\2\2\2\u0295Y\3\2"+
		"\2\2\u0296\u0297\7-\2\2\u0297\u0298\5\64\33\2\u0298\u0299\b.\1\2\u0299"+
		"\u029a\7.\2\2\u029a[\3\2\2\2\u029b\u029c\7\67\2\2\u029c\u029d\b/\1\2\u029d"+
		"]\3\2\2\2\67hr{}\u0088\u008a\u0093\u0095\u0098\u00a5\u00c5\u00c8\u00db"+
		"\u00ea\u00f7\u0100\u0109\u0110\u011e\u0127\u012e\u0136\u0154\u015e\u0175"+
		"\u018f\u0191\u01a3\u01a6\u01ac\u01b3\u01b7\u01bb\u01d4\u01db\u01e5\u01f0"+
		"\u01f9\u0200\u0208\u0210\u0219\u0220\u022b\u0232\u023e\u0247\u0250\u0262"+
		"\u0264\u0279\u028e\u0294";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}