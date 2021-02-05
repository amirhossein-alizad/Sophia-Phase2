// Generated from /home/awwmiir/compiler/Phase2/src/main/grammar/Sophia.g4 by ANTLR 4.8
package parsers;

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
			setState(93);
			match(EOF);
			   ((SophiaContext)_localctx).sophiaProgram =  new Program(((SophiaContext)_localctx).p.classes);
			                 _localctx.sophiaProgram.setLine(1);
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
		public ArrayList<ClassDeclaration> classes;
		public SophiaClassContext sophiaClass;
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
			((ProgramContext)_localctx).classes =  new ArrayList<>();
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CLASS) {
				{
				{
				setState(97);
				((ProgramContext)_localctx).sophiaClass = sophiaClass();
				 _localctx.classes.add(((ProgramContext)_localctx).sophiaClass.classRet);
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
							FieldDeclaration var = new FieldDeclaration(((SophiaClassContext)_localctx).varDec1.varDec); var.setLine(((SophiaClassContext)_localctx).varDec1.varDec.getLine());_localctx.classRet.addField(var);
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
						FieldDeclaration var = new FieldDeclaration(((SophiaClassContext)_localctx).varDec2.varDec); var.setLine(((SophiaClassContext)_localctx).varDec2.varDec.getLine());_localctx.classRet.addField(var);
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
						FieldDeclaration var = new FieldDeclaration(((SophiaClassContext)_localctx).varDec3.varDec); var.setLine(((SophiaClassContext)_localctx).varDec3.varDec.getLine());_localctx.classRet.addField(var);
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
			((VarDeclarationContext)_localctx).varDec =  new VarDeclaration(((VarDeclarationContext)_localctx).identifier.idRet, ((VarDeclarationContext)_localctx).type.typeRet);_localctx.varDec.setLine((((VarDeclarationContext)_localctx).identifier!=null?(((VarDeclarationContext)_localctx).identifier.start):null).getLine());
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
		public MethodBodyContext methodBody;
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
			Type retType;
			setState(167);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUNC:
			case BOOLEAN:
			case STRING:
			case INT:
			case LIST:
			case IDENTIFIER:
				{
				{
				setState(162);
				((MethodContext)_localctx).type = type();
				retType = ((MethodContext)_localctx).type.typeRet;
				}
				}
				break;
			case VOID:
				{
				{
				setState(165);
				match(VOID);
				retType = new NullType();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(169);
			((MethodContext)_localctx).identifier = identifier();

			            ((MethodContext)_localctx).methodDecRet =  new MethodDeclaration(((MethodContext)_localctx).identifier.idRet,retType);
			            _localctx.methodDecRet.setLine(((MethodContext)_localctx).DEF.getLine());
			setState(171);
			match(LPAR);
			setState(172);
			((MethodContext)_localctx).methodArguments = methodArguments();
			_localctx.methodDecRet.setArgs(((MethodContext)_localctx).methodArguments.argdecs);
			setState(174);
			match(RPAR);
			setState(175);
			match(LBRACE);
			setState(176);
			((MethodContext)_localctx).methodBody = methodBody();
			_localctx.methodDecRet.setBody(((MethodContext)_localctx).methodBody.stmtLst);_localctx.methodDecRet.setLocalVars(((MethodContext)_localctx).methodBody.varLst);
			setState(178);
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
		public MethodBodyContext methodBody;
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
			setState(180);
			((ConstructorContext)_localctx).DEF = match(DEF);
			setState(181);
			((ConstructorContext)_localctx).identifier = identifier();

			            ((ConstructorContext)_localctx).constDecRet =  new ConstructorDeclaration(((ConstructorContext)_localctx).identifier.idRet);
			            _localctx.constDecRet.setLine(((ConstructorContext)_localctx).DEF.getLine());
			setState(183);
			match(LPAR);
			setState(184);
			((ConstructorContext)_localctx).methodArguments = methodArguments();
			_localctx.constDecRet.setArgs(((ConstructorContext)_localctx).methodArguments.argdecs);
			setState(186);
			match(RPAR);
			setState(187);
			match(LBRACE);
			setState(188);
			((ConstructorContext)_localctx).methodBody = methodBody();
			_localctx.constDecRet.setLocalVars( ((ConstructorContext)_localctx).methodBody.varLst );_localctx.constDecRet.setBody( ((ConstructorContext)_localctx).methodBody.stmtLst );
			setState(190);
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
		public VarDeclaration arg;
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
			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(193);
				((MethodArgumentsContext)_localctx).variableWithType = variableWithType();

				            ((MethodArgumentsContext)_localctx).arg =  new VarDeclaration(((MethodArgumentsContext)_localctx).variableWithType.idRet,((MethodArgumentsContext)_localctx).variableWithType.typeRet);
				            _localctx.arg.setLine(((MethodArgumentsContext)_localctx).variableWithType.idRet.getLine());
				            _localctx.argdecs.add(_localctx.arg);
				            
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(195);
					match(COMMA);
					setState(196);
					((MethodArgumentsContext)_localctx).variableWithType = variableWithType();
					((MethodArgumentsContext)_localctx).arg =  new VarDeclaration(((MethodArgumentsContext)_localctx).variableWithType.idRet,((MethodArgumentsContext)_localctx).variableWithType.typeRet);
					            _localctx.arg.setLine(((MethodArgumentsContext)_localctx).variableWithType.idRet.getLine());
					             _localctx.argdecs.add(_localctx.arg);
					}
					}
					setState(203);
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
			setState(206);
			((VariableWithTypeContext)_localctx).identifier = identifier();
			setState(207);
			match(COLON);
			setState(208);
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
			setState(223);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case STRING:
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(211);
				((TypeContext)_localctx).primitiveDataType = primitiveDataType();
				 ((TypeContext)_localctx).typeRet =  ((TypeContext)_localctx).primitiveDataType.primitiveRet;  
				}
				break;
			case LIST:
				enterOuterAlt(_localctx, 2);
				{
				setState(214);
				((TypeContext)_localctx).listType = listType();
				 ((TypeContext)_localctx).typeRet =  ((TypeContext)_localctx).listType.lstRet; 
				}
				break;
			case FUNC:
				enterOuterAlt(_localctx, 3);
				{
				setState(217);
				((TypeContext)_localctx).functionPointerType = functionPointerType();
				 ((TypeContext)_localctx).typeRet =  ((TypeContext)_localctx).functionPointerType.fptrTypeRet; 
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 4);
				{
				setState(220);
				((TypeContext)_localctx).classType = classType();
				 ((TypeContext)_localctx).typeRet =  ((TypeContext)_localctx).classType.classTypeRet; 
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
		public ClassType classTypeRet;
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
			setState(225);
			((ClassTypeContext)_localctx).identifier = identifier();
			 ((ClassTypeContext)_localctx).classTypeRet =  new ClassType(((ClassTypeContext)_localctx).identifier.idRet); 
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
			setState(228);
			match(LIST);
			setState(229);
			match(LPAR);
			setState(238);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_VALUE:
				{
				{
				{
				setState(230);
				((ListTypeContext)_localctx).i1 = match(INT_VALUE);
				}
				setState(231);
				match(SHARP);
				setState(232);
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
				setState(235);
				((ListTypeContext)_localctx).listItemsTypes = listItemsTypes();
				((ListTypeContext)_localctx).lstRet =  new ListType(((ListTypeContext)_localctx).listItemsTypes.listArr);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(240);
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
			setState(243);
			((ListItemsTypesContext)_localctx).l1 = listItemType();
			_localctx.listArr.add(((ListItemsTypesContext)_localctx).l1.lstNameType);
			setState(251);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(245);
				match(COMMA);
				setState(246);
				((ListItemsTypesContext)_localctx).l2 = listItemType();
				_localctx.listArr.add(((ListItemsTypesContext)_localctx).l2.lstNameType);
				}
				}
				setState(253);
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
			setState(260);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(254);
				((ListItemTypeContext)_localctx).variableWithType = variableWithType();
				 ((ListItemTypeContext)_localctx).lstNameType =  new ListNameType(((ListItemTypeContext)_localctx).variableWithType.idRet, ((ListItemTypeContext)_localctx).variableWithType.typeRet); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(257);
				((ListItemTypeContext)_localctx).type = type();
				 ((ListItemTypeContext)_localctx).lstNameType =  new ListNameType(((ListItemTypeContext)_localctx).type.typeRet); 
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
			setState(262);
			match(FUNC);
			ArrayList<Type> arrtypes = new ArrayList<>(); Type rettype = new NullType();
			setState(264);
			match(LESS_THAN);
			setState(269);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOID:
				{
				setState(265);
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
				setState(266);
				((FunctionPointerTypeContext)_localctx).typesWithComma = typesWithComma();
				arrtypes = ((FunctionPointerTypeContext)_localctx).typesWithComma.arrTypeRet;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(271);
			match(ARROW);
			setState(276);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOID:
				{
				setState(272);
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
				setState(273);
				((FunctionPointerTypeContext)_localctx).type = type();
				rettype = ((FunctionPointerTypeContext)_localctx).type.typeRet;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(278);
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
			setState(282);
			((TypesWithCommaContext)_localctx).t1 = type();
			_localctx.arrTypeRet.add(((TypesWithCommaContext)_localctx).t1.typeRet);
			setState(290);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(284);
				match(COMMA);
				setState(285);
				((TypesWithCommaContext)_localctx).t2 = type();
				_localctx.arrTypeRet.add(((TypesWithCommaContext)_localctx).t2.typeRet);
				}
				}
				setState(292);
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
		public Type primitiveRet;
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
			setState(299);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(293);
				match(INT);
				((PrimitiveDataTypeContext)_localctx).primitiveRet =  new IntType();
				}
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(295);
				match(STRING);
				((PrimitiveDataTypeContext)_localctx).primitiveRet =  new StringType();
				}
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(297);
				match(BOOLEAN);
				((PrimitiveDataTypeContext)_localctx).primitiveRet =  new BoolType();
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
		public ArrayList<VarDeclaration> varLst;
		public ArrayList<Statement> stmtLst;
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
		public MethodBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_methodBody);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			   ((MethodBodyContext)_localctx).varLst =  new ArrayList<>();
			                ((MethodBodyContext)_localctx).stmtLst =  new ArrayList<>();
			setState(307);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(302);
					((MethodBodyContext)_localctx).varDeclaration = varDeclaration();
					 _localctx.varLst.add(((MethodBodyContext)_localctx).varDeclaration.varDec); 
					}
					} 
				}
				setState(309);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			setState(315);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << NEW) | (1L << CONTINUE) | (1L << BREAK) | (1L << RETURN) | (1L << FOREACH) | (1L << FOR) | (1L << IF) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << THIS) | (1L << MINUS) | (1L << NOT) | (1L << INCREMENT) | (1L << DECREMENT) | (1L << LPAR) | (1L << LBRACK) | (1L << LBRACE) | (1L << INT_VALUE) | (1L << IDENTIFIER) | (1L << STRING_VALUE))) != 0)) {
				{
				{
				setState(310);
				((MethodBodyContext)_localctx).statement = statement();
				 _localctx.stmtLst.add(((MethodBodyContext)_localctx).statement.s); 
				}
				}
				setState(317);
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
		public Statement s;
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
			setState(345);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(318);
				((StatementContext)_localctx).forStatement = forStatement();
				 ((StatementContext)_localctx).s =  ((StatementContext)_localctx).forStatement.forstRet; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(321);
				((StatementContext)_localctx).foreachStatement = foreachStatement();
				 ((StatementContext)_localctx).s =  ((StatementContext)_localctx).foreachStatement.foreachstRet; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(324);
				((StatementContext)_localctx).ifStatement = ifStatement();
				 ((StatementContext)_localctx).s =  ((StatementContext)_localctx).ifStatement.ifRet; 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(327);
				((StatementContext)_localctx).assignmentStatement = assignmentStatement();
				 ((StatementContext)_localctx).s =  ((StatementContext)_localctx).assignmentStatement.s; 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(330);
				((StatementContext)_localctx).printStatement = printStatement();
				 ((StatementContext)_localctx).s =  ((StatementContext)_localctx).printStatement.printRet; 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(333);
				((StatementContext)_localctx).continueBreakStatement = continueBreakStatement();
				 ((StatementContext)_localctx).s =  ((StatementContext)_localctx).continueBreakStatement.st; 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(336);
				((StatementContext)_localctx).methodCallStatement = methodCallStatement();
				 ((StatementContext)_localctx).s =  ((StatementContext)_localctx).methodCallStatement.methodstRet; 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(339);
				((StatementContext)_localctx).returnStatement = returnStatement();
				 ((StatementContext)_localctx).s =  ((StatementContext)_localctx).returnStatement.returnRet; 
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(342);
				((StatementContext)_localctx).block = block();
				 ((StatementContext)_localctx).s =  ((StatementContext)_localctx).block.blockRet; 
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
			setState(348);
			((BlockContext)_localctx).LBRACE = match(LBRACE);
			_localctx.blockRet.setLine(((BlockContext)_localctx).LBRACE.getLine());
			setState(355);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << NEW) | (1L << CONTINUE) | (1L << BREAK) | (1L << RETURN) | (1L << FOREACH) | (1L << FOR) | (1L << IF) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << THIS) | (1L << MINUS) | (1L << NOT) | (1L << INCREMENT) | (1L << DECREMENT) | (1L << LPAR) | (1L << LBRACK) | (1L << LBRACE) | (1L << INT_VALUE) | (1L << IDENTIFIER) | (1L << STRING_VALUE))) != 0)) {
				{
				{
				setState(350);
				((BlockContext)_localctx).statement = statement();
				_localctx.blockRet.addStatement(((BlockContext)_localctx).statement.s);
				}
				}
				setState(357);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(358);
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
		public AssignmentStmt s;
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
			setState(360);
			((AssignmentStatementContext)_localctx).assignment = assignment();
			setState(361);
			match(SEMICOLLON);
			 ((AssignmentStatementContext)_localctx).s =  ((AssignmentStatementContext)_localctx).assignment.assignRet; 
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
			setState(364);
			((AssignmentContext)_localctx).orExpression = orExpression();
			setState(365);
			((AssignmentContext)_localctx).ASSIGN = match(ASSIGN);
			setState(366);
			((AssignmentContext)_localctx).expression = expression();
			((AssignmentContext)_localctx).assignRet =  new AssignmentStmt(((AssignmentContext)_localctx).orExpression.orExpRet,((AssignmentContext)_localctx).expression.ExprRet);
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
			setState(369);
			((PrintStatementContext)_localctx).PRINT = match(PRINT);
			setState(370);
			match(LPAR);
			setState(371);
			((PrintStatementContext)_localctx).expression = expression();

			            ((PrintStatementContext)_localctx).printRet =  new PrintStmt(((PrintStatementContext)_localctx).expression.ExprRet);
			            _localctx.printRet.setLine(((PrintStatementContext)_localctx).PRINT.getLine());
			setState(373);
			match(RPAR);
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
			setState(376);
			((ReturnStatementContext)_localctx).RETURN = match(RETURN);
			setState(378);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << THIS) | (1L << MINUS) | (1L << NOT) | (1L << INCREMENT) | (1L << DECREMENT) | (1L << LPAR) | (1L << LBRACK) | (1L << INT_VALUE) | (1L << IDENTIFIER) | (1L << STRING_VALUE))) != 0)) {
				{
				setState(377);
				((ReturnStatementContext)_localctx).expression = expression();
				}
			}


			            ((ReturnStatementContext)_localctx).returnRet =  new ReturnStmt (((ReturnStatementContext)_localctx).expression.ExprRet);
			            _localctx.returnRet.setLine(((ReturnStatementContext)_localctx).RETURN.getLine());
			setState(381);
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
		public Token SEMICOLLON;
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
			setState(383);
			((MethodCallStatementContext)_localctx).methodCall = methodCall();
			((MethodCallStatementContext)_localctx).methodstRet =  new MethodCallStmt(((MethodCallStatementContext)_localctx).methodCall.methodcallRet);
			setState(385);
			((MethodCallStatementContext)_localctx).SEMICOLLON = match(SEMICOLLON);
			_localctx.methodstRet.setLine(((MethodCallStatementContext)_localctx).SEMICOLLON.getLine());
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
			setState(388);
			((MethodCallContext)_localctx).otherExpression = otherExpression();
			((MethodCallContext)_localctx).instance =  ((MethodCallContext)_localctx).otherExpression.otherExpRet; 
			setState(407);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(405);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case LPAR:
						{
						{
						setState(390);
						((MethodCallContext)_localctx).LPAR = match(LPAR);
						setState(391);
						((MethodCallContext)_localctx).methodCallArguments = methodCallArguments();
						setState(392);
						match(RPAR);
						}
						((MethodCallContext)_localctx).instance =  new MethodCall(_localctx.instance,((MethodCallContext)_localctx).methodCallArguments.args);
						            _localctx.instance.setLine(((MethodCallContext)_localctx).LPAR.getLine());
						}
						break;
					case DOT:
						{
						{
						setState(396);
						match(DOT);
						setState(397);
						((MethodCallContext)_localctx).identifier = identifier();
						((MethodCallContext)_localctx).instance =  new ObjectOrListMemberAccess(_localctx.instance,((MethodCallContext)_localctx).identifier.idRet);
						            _localctx.instance.setLine(((MethodCallContext)_localctx).identifier.idRet.getLine());
						}
						}
						break;
					case LBRACK:
						{
						{
						setState(400);
						((MethodCallContext)_localctx).LBRACK = match(LBRACK);
						setState(401);
						((MethodCallContext)_localctx).expression = expression();
						((MethodCallContext)_localctx).instance =  new ListAccessByIndex(_localctx.instance,((MethodCallContext)_localctx).expression.ExprRet);
						            _localctx.instance.setLine(((MethodCallContext)_localctx).LBRACK.getLine());
						setState(403);
						match(RBRACK);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(409);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			}
			{
			setState(410);
			((MethodCallContext)_localctx).LPAR = match(LPAR);
			setState(411);
			((MethodCallContext)_localctx).methodCallArguments = methodCallArguments();
			setState(412);
			match(RPAR);
			}
			((MethodCallContext)_localctx).methodcallRet =  new MethodCall(_localctx.instance,((MethodCallContext)_localctx).methodCallArguments.args); _localctx.methodcallRet.setLine(((MethodCallContext)_localctx).LPAR.getLine());
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
			((MethodCallArgumentsContext)_localctx).args =  new ArrayList<>();
			setState(428);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << THIS) | (1L << MINUS) | (1L << NOT) | (1L << INCREMENT) | (1L << DECREMENT) | (1L << LPAR) | (1L << LBRACK) | (1L << INT_VALUE) | (1L << IDENTIFIER) | (1L << STRING_VALUE))) != 0)) {
				{
				setState(417);
				((MethodCallArgumentsContext)_localctx).expression = expression();

				            _localctx.args.add(((MethodCallArgumentsContext)_localctx).expression.ExprRet);
				            
				setState(425);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(419);
					match(COMMA);
					setState(420);
					((MethodCallArgumentsContext)_localctx).expression = expression();
					_localctx.args.add(((MethodCallArgumentsContext)_localctx).expression.ExprRet);
					}
					}
					setState(427);
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
			setState(434);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BREAK:
				{
				setState(430);
				((ContinueBreakStatementContext)_localctx).BREAK = match(BREAK);
				((ContinueBreakStatementContext)_localctx).st =  new BreakStmt(); _localctx.st.setLine(((ContinueBreakStatementContext)_localctx).BREAK.getLine());
				}
				break;
			case CONTINUE:
				{
				setState(432);
				((ContinueBreakStatementContext)_localctx).CONTINUE = match(CONTINUE);
				((ContinueBreakStatementContext)_localctx).st =  new ContinueStmt(); _localctx.st.setLine(((ContinueBreakStatementContext)_localctx).CONTINUE.getLine());
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(436);
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
			setState(438);
			((ForStatementContext)_localctx).FOR = match(FOR);
			setState(439);
			match(LPAR);
			setState(441);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << THIS) | (1L << MINUS) | (1L << NOT) | (1L << INCREMENT) | (1L << DECREMENT) | (1L << LPAR) | (1L << LBRACK) | (1L << INT_VALUE) | (1L << IDENTIFIER) | (1L << STRING_VALUE))) != 0)) {
				{
				setState(440);
				((ForStatementContext)_localctx).init = assignment();
				}
			}

			setState(443);
			match(SEMICOLLON);
			setState(445);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << THIS) | (1L << MINUS) | (1L << NOT) | (1L << INCREMENT) | (1L << DECREMENT) | (1L << LPAR) | (1L << LBRACK) | (1L << INT_VALUE) | (1L << IDENTIFIER) | (1L << STRING_VALUE))) != 0)) {
				{
				setState(444);
				((ForStatementContext)_localctx).cond = expression();
				}
			}

			setState(447);
			match(SEMICOLLON);
			setState(449);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << THIS) | (1L << MINUS) | (1L << NOT) | (1L << INCREMENT) | (1L << DECREMENT) | (1L << LPAR) | (1L << LBRACK) | (1L << INT_VALUE) | (1L << IDENTIFIER) | (1L << STRING_VALUE))) != 0)) {
				{
				setState(448);
				((ForStatementContext)_localctx).update = assignment();
				}
			}

			setState(451);
			match(RPAR);
			setState(452);
			((ForStatementContext)_localctx).st = statement();
			((ForStatementContext)_localctx).forstRet =  new ForStmt();
			             _localctx.forstRet.setLine(((ForStatementContext)_localctx).FOR.getLine());
			             _localctx.forstRet.setInitialize(((ForStatementContext)_localctx).init.assignRet);
			             _localctx.forstRet.setCondition(((ForStatementContext)_localctx).cond.ExprRet);
			             _localctx.forstRet.setUpdate(((ForStatementContext)_localctx).update.assignRet);
			             _localctx.forstRet.setBody(((ForStatementContext)_localctx).st.s);
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
			setState(455);
			((ForeachStatementContext)_localctx).FOREACH = match(FOREACH);
			setState(456);
			match(LPAR);
			setState(457);
			((ForeachStatementContext)_localctx).identifier = identifier();
			setState(458);
			match(IN);
			setState(459);
			((ForeachStatementContext)_localctx).expression = expression();
			setState(460);
			match(RPAR);
			setState(461);
			((ForeachStatementContext)_localctx).statement = statement();
			((ForeachStatementContext)_localctx).foreachstRet =  new ForeachStmt(((ForeachStatementContext)_localctx).identifier.idRet,((ForeachStatementContext)_localctx).expression.ExprRet);
			            _localctx.foreachstRet.setLine(((ForeachStatementContext)_localctx).FOREACH.getLine());
			            _localctx.foreachstRet.setBody(((ForeachStatementContext)_localctx).statement.s);
			            _localctx.foreachstRet.setBody(((ForeachStatementContext)_localctx).statement.s);
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
			setState(464);
			((IfStatementContext)_localctx).IF = match(IF);
			setState(465);
			match(LPAR);
			setState(466);
			((IfStatementContext)_localctx).expression = expression();
			setState(467);
			match(RPAR);
			setState(468);
			((IfStatementContext)_localctx).ifst = statement();
			((IfStatementContext)_localctx).ifRet =  new ConditionalStmt(((IfStatementContext)_localctx).expression.ExprRet,((IfStatementContext)_localctx).ifst.s);
			            _localctx.ifRet.setLine(((IfStatementContext)_localctx).IF.getLine());
			setState(474);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(470);
				match(ELSE);
				setState(471);
				((IfStatementContext)_localctx).elsest = statement();
				_localctx.ifRet.setElseBody(((IfStatementContext)_localctx).elsest.s);
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
		public Expression ExprRet;
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
			setState(476);
			((ExpressionContext)_localctx).orExpression = orExpression();
			 ((ExpressionContext)_localctx).ExprRet =  ((ExpressionContext)_localctx).orExpression.orExpRet; _localctx.ExprRet.setLine(((ExpressionContext)_localctx).orExpression.orExpRet.getLine()); 
			setState(482);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(478);
				((ExpressionContext)_localctx).ASSIGN = match(ASSIGN);
				setState(479);
				((ExpressionContext)_localctx).expression = expression();
				 ((ExpressionContext)_localctx).ExprRet =  new BinaryExpression(_localctx.ExprRet, ((ExpressionContext)_localctx).expression.ExprRet, BinaryOperator.assign); _localctx.ExprRet.setLine(((ExpressionContext)_localctx).ASSIGN.getLine()); 
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
			setState(484);
			((OrExpressionContext)_localctx).ae = andExpression();
			((OrExpressionContext)_localctx).orExpRet =  ((OrExpressionContext)_localctx).ae.andExpRet;
			setState(492);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(486);
				((OrExpressionContext)_localctx).OR = match(OR);
				setState(487);
				((OrExpressionContext)_localctx).ae = andExpression();
				((OrExpressionContext)_localctx).orExpRet =  new BinaryExpression(_localctx.orExpRet,((OrExpressionContext)_localctx).ae.andExpRet,BinaryOperator.or);
				            _localctx.orExpRet.setLine(((OrExpressionContext)_localctx).OR.getLine());
				}
				}
				setState(494);
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
			setState(495);
			((AndExpressionContext)_localctx).ee = equalityExpression();
			((AndExpressionContext)_localctx).andExpRet =  ((AndExpressionContext)_localctx).ee.eqExpRet;
			setState(503);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(497);
				((AndExpressionContext)_localctx).AND = match(AND);
				setState(498);
				((AndExpressionContext)_localctx).ee = equalityExpression();
				((AndExpressionContext)_localctx).andExpRet =  new BinaryExpression(_localctx.andExpRet,((AndExpressionContext)_localctx).ee.eqExpRet,BinaryOperator.and);
				            _localctx.andExpRet.setLine(((AndExpressionContext)_localctx).AND.getLine());
				}
				}
				setState(505);
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
			setState(506);
			((EqualityExpressionContext)_localctx).re = relationalExpression();
			((EqualityExpressionContext)_localctx).eqExpRet =  ((EqualityExpressionContext)_localctx).re.reExpRet;BinaryOperator eqop; int line;
			setState(519);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NOT_EQUAL || _la==EQUAL) {
				{
				{
				setState(512);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case EQUAL:
					{
					setState(508);
					((EqualityExpressionContext)_localctx).EQUAL = match(EQUAL);
					eqop = BinaryOperator.eq; line = ((EqualityExpressionContext)_localctx).EQUAL.getLine();
					}
					break;
				case NOT_EQUAL:
					{
					setState(510);
					((EqualityExpressionContext)_localctx).NOT_EQUAL = match(NOT_EQUAL);
					eqop = BinaryOperator.neq; line = ((EqualityExpressionContext)_localctx).NOT_EQUAL.getLine(); 
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(514);
				((EqualityExpressionContext)_localctx).re = relationalExpression();
				((EqualityExpressionContext)_localctx).eqExpRet =  new BinaryExpression(_localctx.eqExpRet,((EqualityExpressionContext)_localctx).re.reExpRet,eqop);
				             _localctx.eqExpRet.setLine(line);
				}
				}
				setState(521);
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
			setState(522);
			((RelationalExpressionContext)_localctx).ae = additiveExpression();
			((RelationalExpressionContext)_localctx).reExpRet =  ((RelationalExpressionContext)_localctx).ae.addExpRet;BinaryOperator reop; int line;
			setState(535);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==GREATER_THAN || _la==LESS_THAN) {
				{
				{
				setState(527);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case GREATER_THAN:
					{
					setState(524);
					((RelationalExpressionContext)_localctx).GREATER_THAN = match(GREATER_THAN);
					reop = BinaryOperator.gt; line = ((RelationalExpressionContext)_localctx).GREATER_THAN.getLine(); 
					}
					break;
				case LESS_THAN:
					{
					setState(526);
					((RelationalExpressionContext)_localctx).LESS_THAN = match(LESS_THAN);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				reop = BinaryOperator.lt; line = ((RelationalExpressionContext)_localctx).LESS_THAN.getLine(); 
				setState(530);
				((RelationalExpressionContext)_localctx).ae = additiveExpression();
				((RelationalExpressionContext)_localctx).reExpRet =  new BinaryExpression(_localctx.reExpRet,((RelationalExpressionContext)_localctx).ae.addExpRet,reop);
				             _localctx.reExpRet.setLine(line);
				}
				}
				setState(537);
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
			setState(538);
			((AdditiveExpressionContext)_localctx).me = multiplicativeExpression();
			((AdditiveExpressionContext)_localctx).addExpRet =  ((AdditiveExpressionContext)_localctx).me.mulExpRet;BinaryOperator adop; int line;
			setState(551);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(544);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PLUS:
					{
					setState(540);
					((AdditiveExpressionContext)_localctx).PLUS = match(PLUS);
					adop = BinaryOperator.add; line = ((AdditiveExpressionContext)_localctx).PLUS.getLine();
					}
					break;
				case MINUS:
					{
					setState(542);
					((AdditiveExpressionContext)_localctx).MINUS = match(MINUS);
					adop = BinaryOperator.sub; line = ((AdditiveExpressionContext)_localctx).MINUS.getLine();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(546);
				((AdditiveExpressionContext)_localctx).me = multiplicativeExpression();
				((AdditiveExpressionContext)_localctx).addExpRet =  new BinaryExpression(_localctx.addExpRet,((AdditiveExpressionContext)_localctx).me.mulExpRet,adop);
				             _localctx.addExpRet.setLine(line);
				}
				}
				setState(553);
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
		public PreUnaryExpressionContext pe2;
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
			setState(554);
			((MultiplicativeExpressionContext)_localctx).pe = preUnaryExpression();
			((MultiplicativeExpressionContext)_localctx).mulExpRet =  ((MultiplicativeExpressionContext)_localctx).pe.preunExpRet;BinaryOperator mulop; int line;
			setState(569);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULT) | (1L << DIVIDE) | (1L << MOD))) != 0)) {
				{
				{
				setState(562);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MULT:
					{
					setState(556);
					((MultiplicativeExpressionContext)_localctx).MULT = match(MULT);
					mulop = BinaryOperator.mult; line = ((MultiplicativeExpressionContext)_localctx).MULT.getLine();
					}
					break;
				case DIVIDE:
					{
					setState(558);
					((MultiplicativeExpressionContext)_localctx).DIVIDE = match(DIVIDE);
					mulop = BinaryOperator.div; line = ((MultiplicativeExpressionContext)_localctx).DIVIDE.getLine();
					}
					break;
				case MOD:
					{
					setState(560);
					((MultiplicativeExpressionContext)_localctx).MOD = match(MOD);
					mulop = BinaryOperator.mod; line = ((MultiplicativeExpressionContext)_localctx).MOD.getLine();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(564);
				((MultiplicativeExpressionContext)_localctx).pe2 = preUnaryExpression();
				((MultiplicativeExpressionContext)_localctx).mulExpRet =  new BinaryExpression(_localctx.mulExpRet,((MultiplicativeExpressionContext)_localctx).pe2.preunExpRet,mulop);
				             _localctx.mulExpRet.setLine(line);
				}
				}
				setState(571);
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
			setState(590);
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
				setState(581);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NOT:
					{
					setState(573);
					((PreUnaryExpressionContext)_localctx).NOT = match(NOT);
					preop = UnaryOperator.not; line = ((PreUnaryExpressionContext)_localctx).NOT.getLine();
					}
					break;
				case MINUS:
					{
					setState(575);
					((PreUnaryExpressionContext)_localctx).MINUS = match(MINUS);
					preop = UnaryOperator.minus; line = ((PreUnaryExpressionContext)_localctx).MINUS.getLine();
					}
					break;
				case INCREMENT:
					{
					setState(577);
					((PreUnaryExpressionContext)_localctx).INCREMENT = match(INCREMENT);
					preop = UnaryOperator.preinc; line = ((PreUnaryExpressionContext)_localctx).INCREMENT.getLine();
					}
					break;
				case DECREMENT:
					{
					setState(579);
					((PreUnaryExpressionContext)_localctx).DECREMENT = match(DECREMENT);
					preop = UnaryOperator.predec; line = ((PreUnaryExpressionContext)_localctx).DECREMENT.getLine();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(583);
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
				setState(587);
				((PreUnaryExpressionContext)_localctx).postUnaryExpression = postUnaryExpression();
				((PreUnaryExpressionContext)_localctx).preunExpRet =  ((PreUnaryExpressionContext)_localctx).postUnaryExpression.PUExprRet;
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
		public Expression PUExprRet;
		public AccessExpressionContext e;
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
			setState(592);
			((PostUnaryExpressionContext)_localctx).e = accessExpression();
			 ((PostUnaryExpressionContext)_localctx).PUExprRet =  ((PostUnaryExpressionContext)_localctx).e.accExpRet; _localctx.PUExprRet.setLine(((PostUnaryExpressionContext)_localctx).e.accExpRet.getLine());
			setState(598);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INCREMENT:
				{
				setState(594);
				((PostUnaryExpressionContext)_localctx).INCREMENT = match(INCREMENT);
				 ((PostUnaryExpressionContext)_localctx).PUExprRet =  new UnaryExpression(((PostUnaryExpressionContext)_localctx).e.accExpRet, UnaryOperator.postinc); _localctx.PUExprRet.setLine(((PostUnaryExpressionContext)_localctx).INCREMENT.getLine());
				}
				break;
			case DECREMENT:
				{
				setState(596);
				((PostUnaryExpressionContext)_localctx).DECREMENT = match(DECREMENT);
				 ((PostUnaryExpressionContext)_localctx).PUExprRet =  new UnaryExpression(((PostUnaryExpressionContext)_localctx).e.accExpRet, UnaryOperator.postdec); _localctx.PUExprRet.setLine(((PostUnaryExpressionContext)_localctx).DECREMENT.getLine());
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
		public OtherExpressionContext oe;
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
			setState(600);
			((AccessExpressionContext)_localctx).oe = ((AccessExpressionContext)_localctx).otherExpression = otherExpression();
			((AccessExpressionContext)_localctx).instance =  ((AccessExpressionContext)_localctx).otherExpression.otherExpRet; _localctx.instance.setLine(((AccessExpressionContext)_localctx).oe.otherExpRet.getLine());
			setState(618);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << LBRACK) | (1L << DOT))) != 0)) {
				{
				setState(616);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LPAR:
					{
					{
					setState(602);
					((AccessExpressionContext)_localctx).LPAR = match(LPAR);
					setState(603);
					((AccessExpressionContext)_localctx).methodCallArguments = methodCallArguments();
					((AccessExpressionContext)_localctx).instance =  new MethodCall(_localctx.instance,((AccessExpressionContext)_localctx).methodCallArguments.args);
					            _localctx.instance.setLine(((AccessExpressionContext)_localctx).LPAR.getLine());
					setState(605);
					match(RPAR);
					}
					}
					break;
				case DOT:
					{
					{
					setState(607);
					match(DOT);
					setState(608);
					((AccessExpressionContext)_localctx).identifier = identifier();
					((AccessExpressionContext)_localctx).instance =  new ObjectOrListMemberAccess(_localctx.instance,((AccessExpressionContext)_localctx).identifier.idRet);
					            _localctx.instance.setLine(((AccessExpressionContext)_localctx).identifier.idRet.getLine());
					}
					}
					break;
				case LBRACK:
					{
					{
					setState(611);
					((AccessExpressionContext)_localctx).LBRACK = match(LBRACK);
					setState(612);
					((AccessExpressionContext)_localctx).expression = expression();
					((AccessExpressionContext)_localctx).instance =  new ListAccessByIndex(_localctx.instance,((AccessExpressionContext)_localctx).expression.ExprRet);
					            _localctx.instance.setLine(((AccessExpressionContext)_localctx).LBRACK.getLine());
					setState(614);
					match(RBRACK);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(620);
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
		public Token THIS;
		public NewExpressionContext newExpression;
		public ValuesContext values;
		public IdentifierContext identifier;
		public ExpressionContext e;
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
			setState(639);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case THIS:
				enterOuterAlt(_localctx, 1);
				{
				setState(623);
				((OtherExpressionContext)_localctx).THIS = match(THIS);
				((OtherExpressionContext)_localctx).otherExpRet =  new ThisClass();_localctx.otherExpRet.setLine(((OtherExpressionContext)_localctx).THIS.getLine());
				}
				break;
			case NEW:
				enterOuterAlt(_localctx, 2);
				{
				setState(625);
				((OtherExpressionContext)_localctx).newExpression = newExpression();
				 ((OtherExpressionContext)_localctx).otherExpRet =  ((OtherExpressionContext)_localctx).newExpression.newExprRet; _localctx.otherExpRet.setLine(((OtherExpressionContext)_localctx).newExpression.newExprRet.getLine()); 
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
				setState(628);
				((OtherExpressionContext)_localctx).values = values();
				 ((OtherExpressionContext)_localctx).otherExpRet =  ((OtherExpressionContext)_localctx).values.valRet; _localctx.otherExpRet.setLine(((OtherExpressionContext)_localctx).values.valRet.getLine()); 
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 4);
				{
				setState(631);
				((OtherExpressionContext)_localctx).identifier = identifier();
				 ((OtherExpressionContext)_localctx).otherExpRet =  ((OtherExpressionContext)_localctx).identifier.idRet; _localctx.otherExpRet.setLine(((OtherExpressionContext)_localctx).identifier.idRet.getLine()); 
				}
				break;
			case LPAR:
				enterOuterAlt(_localctx, 5);
				{
				setState(634);
				match(LPAR);
				{
				setState(635);
				((OtherExpressionContext)_localctx).e = expression();
				}
				setState(636);
				match(RPAR);
				 ((OtherExpressionContext)_localctx).otherExpRet =  ((OtherExpressionContext)_localctx).e.ExprRet; _localctx.otherExpRet.setLine(((OtherExpressionContext)_localctx).e.ExprRet.getLine()); 
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
		public Expression newExprRet;
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
			setState(641);
			((NewExpressionContext)_localctx).NEW = match(NEW);
			setState(642);
			((NewExpressionContext)_localctx).classType = classType();
			setState(643);
			match(LPAR);
			setState(644);
			((NewExpressionContext)_localctx).methodCallArguments = methodCallArguments();
			setState(645);
			match(RPAR);
			((NewExpressionContext)_localctx).newExprRet =  new NewClassInstance(((NewExpressionContext)_localctx).classType.classTypeRet,((NewExpressionContext)_localctx).methodCallArguments.args);
			            _localctx.newExprRet.setLine(((NewExpressionContext)_localctx).NEW.getLine());
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
		public Expression valRet;
		public BoolValueContext boolValue;
		public Token STRING_VALUE;
		public Token INT_VALUE;
		public Token NULL;
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
			setState(660);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 1);
				{
				setState(648);
				((ValuesContext)_localctx).boolValue = boolValue();
				((ValuesContext)_localctx).valRet =  ((ValuesContext)_localctx).boolValue.boolRet;
				}
				break;
			case STRING_VALUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(651);
				((ValuesContext)_localctx).STRING_VALUE = match(STRING_VALUE);
				((ValuesContext)_localctx).valRet =  new StringValue((((ValuesContext)_localctx).STRING_VALUE!=null?((ValuesContext)_localctx).STRING_VALUE.getText():null).substring(1, (((ValuesContext)_localctx).STRING_VALUE!=null?((ValuesContext)_localctx).STRING_VALUE.getText():null).length()-1));_localctx.valRet.setLine(((ValuesContext)_localctx).STRING_VALUE.getLine());
				}
				break;
			case INT_VALUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(653);
				((ValuesContext)_localctx).INT_VALUE = match(INT_VALUE);
				((ValuesContext)_localctx).valRet =  new IntValue((((ValuesContext)_localctx).INT_VALUE!=null?Integer.valueOf(((ValuesContext)_localctx).INT_VALUE.getText()):0));_localctx.valRet.setLine(((ValuesContext)_localctx).INT_VALUE.getLine());
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 4);
				{
				setState(655);
				((ValuesContext)_localctx).NULL = match(NULL);
				((ValuesContext)_localctx).valRet =  new NullValue();_localctx.valRet.setLine(((ValuesContext)_localctx).NULL.getLine());
				}
				break;
			case LBRACK:
				enterOuterAlt(_localctx, 5);
				{
				setState(657);
				((ValuesContext)_localctx).listValue = listValue();
				((ValuesContext)_localctx).valRet =  ((ValuesContext)_localctx).listValue.listvalRet; _localctx.valRet.setLine(((ValuesContext)_localctx).listValue.listvalRet.getLine());
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
			setState(666);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(662);
				((BoolValueContext)_localctx).TRUE = match(TRUE);
				((BoolValueContext)_localctx).boolRet =  new BoolValue(true);_localctx.boolRet.setLine(((BoolValueContext)_localctx).TRUE.getLine());
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(664);
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
			setState(668);
			((ListValueContext)_localctx).LBRACK = match(LBRACK);
			setState(669);
			((ListValueContext)_localctx).methodCallArguments = methodCallArguments();

			            ((ListValueContext)_localctx).listvalRet =  new ListValue(((ListValueContext)_localctx).methodCallArguments.args);
			            _localctx.listvalRet.setLine(((ListValueContext)_localctx).LBRACK.getLine());
			            
			setState(671);
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
			setState(673);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3:\u02a7\4\2\t\2\4"+
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
		"\6\3\6\3\6\3\6\3\6\5\6\u00aa\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\7\b\u00ca\n\b\f\b\16\b\u00cd\13\b\5\b\u00cf\n\b\3\t\3\t\3"+
		"\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00e2\n"+
		"\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00f1\n"+
		"\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00fc\n\r\f\r\16\r\u00ff\13"+
		"\r\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u0107\n\16\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\5\17\u0110\n\17\3\17\3\17\3\17\3\17\3\17\5\17\u0117\n\17"+
		"\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u0123\n\20\f\20"+
		"\16\20\u0126\13\20\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u012e\n\21\3\22"+
		"\3\22\3\22\3\22\7\22\u0134\n\22\f\22\16\22\u0137\13\22\3\22\3\22\3\22"+
		"\7\22\u013c\n\22\f\22\16\22\u013f\13\22\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u015c\n\23\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\7\24\u0164\n\24\f\24\16\24\u0167\13\24\3\24\3\24\3\25\3\25"+
		"\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\30\3\30\5\30\u017d\n\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\7\32\u0198\n\32\f\32\16\32\u019b\13\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\7\33\u01aa\n\33\f\33\16"+
		"\33\u01ad\13\33\5\33\u01af\n\33\3\34\3\34\3\34\3\34\5\34\u01b5\n\34\3"+
		"\34\3\34\3\35\3\35\3\35\5\35\u01bc\n\35\3\35\3\35\5\35\u01c0\n\35\3\35"+
		"\3\35\5\35\u01c4\n\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37"+
		"\u01dd\n\37\3 \3 \3 \3 \3 \3 \5 \u01e5\n \3!\3!\3!\3!\3!\3!\7!\u01ed\n"+
		"!\f!\16!\u01f0\13!\3\"\3\"\3\"\3\"\3\"\3\"\7\"\u01f8\n\"\f\"\16\"\u01fb"+
		"\13\"\3#\3#\3#\3#\3#\3#\5#\u0203\n#\3#\3#\3#\7#\u0208\n#\f#\16#\u020b"+
		"\13#\3$\3$\3$\3$\3$\5$\u0212\n$\3$\3$\3$\3$\7$\u0218\n$\f$\16$\u021b\13"+
		"$\3%\3%\3%\3%\3%\3%\5%\u0223\n%\3%\3%\3%\7%\u0228\n%\f%\16%\u022b\13%"+
		"\3&\3&\3&\3&\3&\3&\3&\3&\5&\u0235\n&\3&\3&\3&\7&\u023a\n&\f&\16&\u023d"+
		"\13&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u0248\n\'\3\'\3\'\3\'\3\'"+
		"\3\'\3\'\3\'\5\'\u0251\n\'\3(\3(\3(\3(\3(\3(\5(\u0259\n(\3)\3)\3)\3)\3"+
		")\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\7)\u026b\n)\f)\16)\u026e\13)\3)\3)"+
		"\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\5*\u0282\n*\3+\3+\3+"+
		"\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\5,\u0297\n,\3-\3-\3-"+
		"\3-\5-\u029d\n-\3.\3.\3.\3.\3.\3/\3/\3/\3/\2\2\60\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\\2\2\2\u02c3"+
		"\2^\3\2\2\2\4b\3\2\2\2\6k\3\2\2\2\b\u009c\3\2\2\2\n\u00a2\3\2\2\2\f\u00b6"+
		"\3\2\2\2\16\u00c2\3\2\2\2\20\u00d0\3\2\2\2\22\u00e1\3\2\2\2\24\u00e3\3"+
		"\2\2\2\26\u00e6\3\2\2\2\30\u00f4\3\2\2\2\32\u0106\3\2\2\2\34\u0108\3\2"+
		"\2\2\36\u011b\3\2\2\2 \u012d\3\2\2\2\"\u012f\3\2\2\2$\u015b\3\2\2\2&\u015d"+
		"\3\2\2\2(\u016a\3\2\2\2*\u016e\3\2\2\2,\u0173\3\2\2\2.\u017a\3\2\2\2\60"+
		"\u0181\3\2\2\2\62\u0186\3\2\2\2\64\u01a2\3\2\2\2\66\u01b4\3\2\2\28\u01b8"+
		"\3\2\2\2:\u01c9\3\2\2\2<\u01d2\3\2\2\2>\u01de\3\2\2\2@\u01e6\3\2\2\2B"+
		"\u01f1\3\2\2\2D\u01fc\3\2\2\2F\u020c\3\2\2\2H\u021c\3\2\2\2J\u022c\3\2"+
		"\2\2L\u0250\3\2\2\2N\u0252\3\2\2\2P\u025a\3\2\2\2R\u0281\3\2\2\2T\u0283"+
		"\3\2\2\2V\u0296\3\2\2\2X\u029c\3\2\2\2Z\u029e\3\2\2\2\\\u02a3\3\2\2\2"+
		"^_\5\4\3\2_`\7\2\2\3`a\b\2\1\2a\3\3\2\2\2bh\b\3\1\2cd\5\6\4\2de\b\3\1"+
		"\2eg\3\2\2\2fc\3\2\2\2gj\3\2\2\2hf\3\2\2\2hi\3\2\2\2i\5\3\2\2\2jh\3\2"+
		"\2\2kl\7\5\2\2lm\5\\/\2mr\b\4\1\2no\7\4\2\2op\5\\/\2pq\b\4\1\2qs\3\2\2"+
		"\2rn\3\2\2\2rs\3\2\2\2st\3\2\2\2t\u0098\7/\2\2uv\5\b\5\2vw\b\4\1\2w|\3"+
		"\2\2\2xy\5\n\6\2yz\b\4\1\2z|\3\2\2\2{u\3\2\2\2{x\3\2\2\2|\177\3\2\2\2"+
		"}{\3\2\2\2}~\3\2\2\2~\u0080\3\2\2\2\177}\3\2\2\2\u0080\u0081\5\f\7\2\u0081"+
		"\u008a\b\4\1\2\u0082\u0083\5\b\5\2\u0083\u0084\b\4\1\2\u0084\u0089\3\2"+
		"\2\2\u0085\u0086\5\n\6\2\u0086\u0087\b\4\1\2\u0087\u0089\3\2\2\2\u0088"+
		"\u0082\3\2\2\2\u0088\u0085\3\2\2\2\u0089\u008c\3\2\2\2\u008a\u0088\3\2"+
		"\2\2\u008a\u008b\3\2\2\2\u008b\u0099\3\2\2\2\u008c\u008a\3\2\2\2\u008d"+
		"\u008e\5\b\5\2\u008e\u008f\b\4\1\2\u008f\u0094\3\2\2\2\u0090\u0091\5\n"+
		"\6\2\u0091\u0092\b\4\1\2\u0092\u0094\3\2\2\2\u0093\u008d\3\2\2\2\u0093"+
		"\u0090\3\2\2\2\u0094\u0097\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2"+
		"\2\2\u0096\u0099\3\2\2\2\u0097\u0095\3\2\2\2\u0098}\3\2\2\2\u0098\u0095"+
		"\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009b\7\60\2\2\u009b\7\3\2\2\2\u009c"+
		"\u009d\5\\/\2\u009d\u009e\7\64\2\2\u009e\u009f\5\22\n\2\u009f\u00a0\7"+
		"\65\2\2\u00a0\u00a1\b\5\1\2\u00a1\t\3\2\2\2\u00a2\u00a3\7\3\2\2\u00a3"+
		"\u00a9\b\6\1\2\u00a4\u00a5\5\22\n\2\u00a5\u00a6\b\6\1\2\u00a6\u00aa\3"+
		"\2\2\2\u00a7\u00a8\7\24\2\2\u00a8\u00aa\b\6\1\2\u00a9\u00a4\3\2\2\2\u00a9"+
		"\u00a7\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ac\5\\/\2\u00ac\u00ad\b\6"+
		"\1\2\u00ad\u00ae\7+\2\2\u00ae\u00af\5\16\b\2\u00af\u00b0\b\6\1\2\u00b0"+
		"\u00b1\7,\2\2\u00b1\u00b2\7/\2\2\u00b2\u00b3\5\"\22\2\u00b3\u00b4\b\6"+
		"\1\2\u00b4\u00b5\7\60\2\2\u00b5\13\3\2\2\2\u00b6\u00b7\7\3\2\2\u00b7\u00b8"+
		"\5\\/\2\u00b8\u00b9\b\7\1\2\u00b9\u00ba\7+\2\2\u00ba\u00bb\5\16\b\2\u00bb"+
		"\u00bc\b\7\1\2\u00bc\u00bd\7,\2\2\u00bd\u00be\7/\2\2\u00be\u00bf\5\"\22"+
		"\2\u00bf\u00c0\b\7\1\2\u00c0\u00c1\7\60\2\2\u00c1\r\3\2\2\2\u00c2\u00ce"+
		"\b\b\1\2\u00c3\u00c4\5\20\t\2\u00c4\u00cb\b\b\1\2\u00c5\u00c6\7\62\2\2"+
		"\u00c6\u00c7\5\20\t\2\u00c7\u00c8\b\b\1\2\u00c8\u00ca\3\2\2\2\u00c9\u00c5"+
		"\3\2\2\2\u00ca\u00cd\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc"+
		"\u00cf\3\2\2\2\u00cd\u00cb\3\2\2\2\u00ce\u00c3\3\2\2\2\u00ce\u00cf\3\2"+
		"\2\2\u00cf\17\3\2\2\2\u00d0\u00d1\5\\/\2\u00d1\u00d2\7\64\2\2\u00d2\u00d3"+
		"\5\22\n\2\u00d3\u00d4\b\t\1\2\u00d4\21\3\2\2\2\u00d5\u00d6\5 \21\2\u00d6"+
		"\u00d7\b\n\1\2\u00d7\u00e2\3\2\2\2\u00d8\u00d9\5\26\f\2\u00d9\u00da\b"+
		"\n\1\2\u00da\u00e2\3\2\2\2\u00db\u00dc\5\34\17\2\u00dc\u00dd\b\n\1\2\u00dd"+
		"\u00e2\3\2\2\2\u00de\u00df\5\24\13\2\u00df\u00e0\b\n\1\2\u00e0\u00e2\3"+
		"\2\2\2\u00e1\u00d5\3\2\2\2\u00e1\u00d8\3\2\2\2\u00e1\u00db\3\2\2\2\u00e1"+
		"\u00de\3\2\2\2\u00e2\23\3\2\2\2\u00e3\u00e4\5\\/\2\u00e4\u00e5\b\13\1"+
		"\2\u00e5\25\3\2\2\2\u00e6\u00e7\7\26\2\2\u00e7\u00f0\7+\2\2\u00e8\u00e9"+
		"\7\66\2\2\u00e9\u00ea\7\61\2\2\u00ea\u00eb\5\22\n\2\u00eb\u00ec\b\f\1"+
		"\2\u00ec\u00f1\3\2\2\2\u00ed\u00ee\5\30\r\2\u00ee\u00ef\b\f\1\2\u00ef"+
		"\u00f1\3\2\2\2\u00f0\u00e8\3\2\2\2\u00f0\u00ed\3\2\2\2\u00f1\u00f2\3\2"+
		"\2\2\u00f2\u00f3\7,\2\2\u00f3\27\3\2\2\2\u00f4\u00f5\b\r\1\2\u00f5\u00f6"+
		"\5\32\16\2\u00f6\u00fd\b\r\1\2\u00f7\u00f8\7\62\2\2\u00f8\u00f9\5\32\16"+
		"\2\u00f9\u00fa\b\r\1\2\u00fa\u00fc\3\2\2\2\u00fb\u00f7\3\2\2\2\u00fc\u00ff"+
		"\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\31\3\2\2\2\u00ff"+
		"\u00fd\3\2\2\2\u0100\u0101\5\20\t\2\u0101\u0102\b\16\1\2\u0102\u0107\3"+
		"\2\2\2\u0103\u0104\5\22\n\2\u0104\u0105\b\16\1\2\u0105\u0107\3\2\2\2\u0106"+
		"\u0100\3\2\2\2\u0106\u0103\3\2\2\2\u0107\33\3\2\2\2\u0108\u0109\7\7\2"+
		"\2\u0109\u010a\b\17\1\2\u010a\u010f\7\34\2\2\u010b\u0110\7\24\2\2\u010c"+
		"\u010d\5\36\20\2\u010d\u010e\b\17\1\2\u010e\u0110\3\2\2\2\u010f\u010b"+
		"\3\2\2\2\u010f\u010c\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u0116\7\32\2\2"+
		"\u0112\u0117\7\24\2\2\u0113\u0114\5\22\n\2\u0114\u0115\b\17\1\2\u0115"+
		"\u0117\3\2\2\2\u0116\u0112\3\2\2\2\u0116\u0113\3\2\2\2\u0117\u0118\3\2"+
		"\2\2\u0118\u0119\7\33\2\2\u0119\u011a\b\17\1\2\u011a\35\3\2\2\2\u011b"+
		"\u011c\b\20\1\2\u011c\u011d\5\22\n\2\u011d\u0124\b\20\1\2\u011e\u011f"+
		"\7\62\2\2\u011f\u0120\5\22\n\2\u0120\u0121\b\20\1\2\u0121\u0123\3\2\2"+
		"\2\u0122\u011e\3\2\2\2\u0123\u0126\3\2\2\2\u0124\u0122\3\2\2\2\u0124\u0125"+
		"\3\2\2\2\u0125\37\3\2\2\2\u0126\u0124\3\2\2\2\u0127\u0128\7\23\2\2\u0128"+
		"\u012e\b\21\1\2\u0129\u012a\7\22\2\2\u012a\u012e\b\21\1\2\u012b\u012c"+
		"\7\21\2\2\u012c\u012e\b\21\1\2\u012d\u0127\3\2\2\2\u012d\u0129\3\2\2\2"+
		"\u012d\u012b\3\2\2\2\u012e!\3\2\2\2\u012f\u0135\b\22\1\2\u0130\u0131\5"+
		"\b\5\2\u0131\u0132\b\22\1\2\u0132\u0134\3\2\2\2\u0133\u0130\3\2\2\2\u0134"+
		"\u0137\3\2\2\2\u0135\u0133\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u013d\3\2"+
		"\2\2\u0137\u0135\3\2\2\2\u0138\u0139\5$\23\2\u0139\u013a\b\22\1\2\u013a"+
		"\u013c\3\2\2\2\u013b\u0138\3\2\2\2\u013c\u013f\3\2\2\2\u013d\u013b\3\2"+
		"\2\2\u013d\u013e\3\2\2\2\u013e#\3\2\2\2\u013f\u013d\3\2\2\2\u0140\u0141"+
		"\58\35\2\u0141\u0142\b\23\1\2\u0142\u015c\3\2\2\2\u0143\u0144\5:\36\2"+
		"\u0144\u0145\b\23\1\2\u0145\u015c\3\2\2\2\u0146\u0147\5<\37\2\u0147\u0148"+
		"\b\23\1\2\u0148\u015c\3\2\2\2\u0149\u014a\5(\25\2\u014a\u014b\b\23\1\2"+
		"\u014b\u015c\3\2\2\2\u014c\u014d\5,\27\2\u014d\u014e\b\23\1\2\u014e\u015c"+
		"\3\2\2\2\u014f\u0150\5\66\34\2\u0150\u0151\b\23\1\2\u0151\u015c\3\2\2"+
		"\2\u0152\u0153\5\60\31\2\u0153\u0154\b\23\1\2\u0154\u015c\3\2\2\2\u0155"+
		"\u0156\5.\30\2\u0156\u0157\b\23\1\2\u0157\u015c\3\2\2\2\u0158\u0159\5"+
		"&\24\2\u0159\u015a\b\23\1\2\u015a\u015c\3\2\2\2\u015b\u0140\3\2\2\2\u015b"+
		"\u0143\3\2\2\2\u015b\u0146\3\2\2\2\u015b\u0149\3\2\2\2\u015b\u014c\3\2"+
		"\2\2\u015b\u014f\3\2\2\2\u015b\u0152\3\2\2\2\u015b\u0155\3\2\2\2\u015b"+
		"\u0158\3\2\2\2\u015c%\3\2\2\2\u015d\u015e\b\24\1\2\u015e\u015f\7/\2\2"+
		"\u015f\u0165\b\24\1\2\u0160\u0161\5$\23\2\u0161\u0162\b\24\1\2\u0162\u0164"+
		"\3\2\2\2\u0163\u0160\3\2\2\2\u0164\u0167\3\2\2\2\u0165\u0163\3\2\2\2\u0165"+
		"\u0166\3\2\2\2\u0166\u0168\3\2\2\2\u0167\u0165\3\2\2\2\u0168\u0169\7\60"+
		"\2\2\u0169\'\3\2\2\2\u016a\u016b\5*\26\2\u016b\u016c\7\65\2\2\u016c\u016d"+
		"\b\25\1\2\u016d)\3\2\2\2\u016e\u016f\5@!\2\u016f\u0170\7(\2\2\u0170\u0171"+
		"\5> \2\u0171\u0172\b\26\1\2\u0172+\3\2\2\2\u0173\u0174\7\6\2\2\u0174\u0175"+
		"\7+\2\2\u0175\u0176\5> \2\u0176\u0177\b\27\1\2\u0177\u0178\7,\2\2\u0178"+
		"\u0179\7\65\2\2\u0179-\3\2\2\2\u017a\u017c\7\13\2\2\u017b\u017d\5> \2"+
		"\u017c\u017b\3\2\2\2\u017c\u017d\3\2\2\2\u017d\u017e\3\2\2\2\u017e\u017f"+
		"\b\30\1\2\u017f\u0180\7\65\2\2\u0180/\3\2\2\2\u0181\u0182\5\62\32\2\u0182"+
		"\u0183\b\31\1\2\u0183\u0184\7\65\2\2\u0184\u0185\b\31\1\2\u0185\61\3\2"+
		"\2\2\u0186\u0187\5R*\2\u0187\u0199\b\32\1\2\u0188\u0189\7+\2\2\u0189\u018a"+
		"\5\64\33\2\u018a\u018b\7,\2\2\u018b\u018c\3\2\2\2\u018c\u018d\b\32\1\2"+
		"\u018d\u0198\3\2\2\2\u018e\u018f\7\63\2\2\u018f\u0190\5\\/\2\u0190\u0191"+
		"\b\32\1\2\u0191\u0198\3\2\2\2\u0192\u0193\7-\2\2\u0193\u0194\5> \2\u0194"+
		"\u0195\b\32\1\2\u0195\u0196\7.\2\2\u0196\u0198\3\2\2\2\u0197\u0188\3\2"+
		"\2\2\u0197\u018e\3\2\2\2\u0197\u0192\3\2\2\2\u0198\u019b\3\2\2\2\u0199"+
		"\u0197\3\2\2\2\u0199\u019a\3\2\2\2\u019a\u019c\3\2\2\2\u019b\u0199\3\2"+
		"\2\2\u019c\u019d\7+\2\2\u019d\u019e\5\64\33\2\u019e\u019f\7,\2\2\u019f"+
		"\u01a0\3\2\2\2\u01a0\u01a1\b\32\1\2\u01a1\63\3\2\2\2\u01a2\u01ae\b\33"+
		"\1\2\u01a3\u01a4\5> \2\u01a4\u01ab\b\33\1\2\u01a5\u01a6\7\62\2\2\u01a6"+
		"\u01a7\5> \2\u01a7\u01a8\b\33\1\2\u01a8\u01aa\3\2\2\2\u01a9\u01a5\3\2"+
		"\2\2\u01aa\u01ad\3\2\2\2\u01ab\u01a9\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac"+
		"\u01af\3\2\2\2\u01ad\u01ab\3\2\2\2\u01ae\u01a3\3\2\2\2\u01ae\u01af\3\2"+
		"\2\2\u01af\65\3\2\2\2\u01b0\u01b1\7\n\2\2\u01b1\u01b5\b\34\1\2\u01b2\u01b3"+
		"\7\t\2\2\u01b3\u01b5\b\34\1\2\u01b4\u01b0\3\2\2\2\u01b4\u01b2\3\2\2\2"+
		"\u01b5\u01b6\3\2\2\2\u01b6\u01b7\7\65\2\2\u01b7\67\3\2\2\2\u01b8\u01b9"+
		"\7\16\2\2\u01b9\u01bb\7+\2\2\u01ba\u01bc\5*\26\2\u01bb\u01ba\3\2\2\2\u01bb"+
		"\u01bc\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd\u01bf\7\65\2\2\u01be\u01c0\5"+
		"> \2\u01bf\u01be\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1"+
		"\u01c3\7\65\2\2\u01c2\u01c4\5*\26\2\u01c3\u01c2\3\2\2\2\u01c3\u01c4\3"+
		"\2\2\2\u01c4\u01c5\3\2\2\2\u01c5\u01c6\7,\2\2\u01c6\u01c7\5$\23\2\u01c7"+
		"\u01c8\b\35\1\2\u01c89\3\2\2\2\u01c9\u01ca\7\f\2\2\u01ca\u01cb\7+\2\2"+
		"\u01cb\u01cc\5\\/\2\u01cc\u01cd\7\r\2\2\u01cd\u01ce\5> \2\u01ce\u01cf"+
		"\7,\2\2\u01cf\u01d0\5$\23\2\u01d0\u01d1\b\36\1\2\u01d1;\3\2\2\2\u01d2"+
		"\u01d3\7\17\2\2\u01d3\u01d4\7+\2\2\u01d4\u01d5\5> \2\u01d5\u01d6\7,\2"+
		"\2\u01d6\u01d7\5$\23\2\u01d7\u01dc\b\37\1\2\u01d8\u01d9\7\20\2\2\u01d9"+
		"\u01da\5$\23\2\u01da\u01db\b\37\1\2\u01db\u01dd\3\2\2\2\u01dc\u01d8\3"+
		"\2\2\2\u01dc\u01dd\3\2\2\2\u01dd=\3\2\2\2\u01de\u01df\5@!\2\u01df\u01e4"+
		"\b \1\2\u01e0\u01e1\7(\2\2\u01e1\u01e2\5> \2\u01e2\u01e3\b \1\2\u01e3"+
		"\u01e5\3\2\2\2\u01e4\u01e0\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e5?\3\2\2\2"+
		"\u01e6\u01e7\5B\"\2\u01e7\u01ee\b!\1\2\u01e8\u01e9\7%\2\2\u01e9\u01ea"+
		"\5B\"\2\u01ea\u01eb\b!\1\2\u01eb\u01ed\3\2\2\2\u01ec\u01e8\3\2\2\2\u01ed"+
		"\u01f0\3\2\2\2\u01ee\u01ec\3\2\2\2\u01ee\u01ef\3\2\2\2\u01efA\3\2\2\2"+
		"\u01f0\u01ee\3\2\2\2\u01f1\u01f2\5D#\2\u01f2\u01f9\b\"\1\2\u01f3\u01f4"+
		"\7$\2\2\u01f4\u01f5\5D#\2\u01f5\u01f6\b\"\1\2\u01f6\u01f8\3\2\2\2\u01f7"+
		"\u01f3\3\2\2\2\u01f8\u01fb\3\2\2\2\u01f9\u01f7\3\2\2\2\u01f9\u01fa\3\2"+
		"\2\2\u01faC\3\2\2\2\u01fb\u01f9\3\2\2\2\u01fc\u01fd\5F$\2\u01fd\u0209"+
		"\b#\1\2\u01fe\u01ff\7\36\2\2\u01ff\u0203\b#\1\2\u0200\u0201\7\35\2\2\u0201"+
		"\u0203\b#\1\2\u0202\u01fe\3\2\2\2\u0202\u0200\3\2\2\2\u0203\u0204\3\2"+
		"\2\2\u0204\u0205\5F$\2\u0205\u0206\b#\1\2\u0206\u0208\3\2\2\2\u0207\u0202"+
		"\3\2\2\2\u0208\u020b\3\2\2\2\u0209\u0207\3\2\2\2\u0209\u020a\3\2\2\2\u020a"+
		"E\3\2\2\2\u020b\u0209\3\2\2\2\u020c\u020d\5H%\2\u020d\u0219\b$\1\2\u020e"+
		"\u020f\7\33\2\2\u020f\u0212\b$\1\2\u0210\u0212\7\34\2\2\u0211\u020e\3"+
		"\2\2\2\u0211\u0210\3\2\2\2\u0212\u0213\3\2\2\2\u0213\u0214\b$\1\2\u0214"+
		"\u0215\5H%\2\u0215\u0216\b$\1\2\u0216\u0218\3\2\2\2\u0217\u0211\3\2\2"+
		"\2\u0218\u021b\3\2\2\2\u0219\u0217\3\2\2\2\u0219\u021a\3\2\2\2\u021aG"+
		"\3\2\2\2\u021b\u0219\3\2\2\2\u021c\u021d\5J&\2\u021d\u0229\b%\1\2\u021e"+
		"\u021f\7\"\2\2\u021f\u0223\b%\1\2\u0220\u0221\7#\2\2\u0221\u0223\b%\1"+
		"\2\u0222\u021e\3\2\2\2\u0222\u0220\3\2\2\2\u0223\u0224\3\2\2\2\u0224\u0225"+
		"\5J&\2\u0225\u0226\b%\1\2\u0226\u0228\3\2\2\2\u0227\u0222\3\2\2\2\u0228"+
		"\u022b\3\2\2\2\u0229\u0227\3\2\2\2\u0229\u022a\3\2\2\2\u022aI\3\2\2\2"+
		"\u022b\u0229\3\2\2\2\u022c\u022d\5L\'\2\u022d\u023b\b&\1\2\u022e\u022f"+
		"\7\37\2\2\u022f\u0235\b&\1\2\u0230\u0231\7 \2\2\u0231\u0235\b&\1\2\u0232"+
		"\u0233\7!\2\2\u0233\u0235\b&\1\2\u0234\u022e\3\2\2\2\u0234\u0230\3\2\2"+
		"\2\u0234\u0232\3\2\2\2\u0235\u0236\3\2\2\2\u0236\u0237\5L\'\2\u0237\u0238"+
		"\b&\1\2\u0238\u023a\3\2\2\2\u0239\u0234\3\2\2\2\u023a\u023d\3\2\2\2\u023b"+
		"\u0239\3\2\2\2\u023b\u023c\3\2\2\2\u023cK\3\2\2\2\u023d\u023b\3\2\2\2"+
		"\u023e\u0247\b\'\1\2\u023f\u0240\7&\2\2\u0240\u0248\b\'\1\2\u0241\u0242"+
		"\7#\2\2\u0242\u0248\b\'\1\2\u0243\u0244\7)\2\2\u0244\u0248\b\'\1\2\u0245"+
		"\u0246\7*\2\2\u0246\u0248\b\'\1\2\u0247\u023f\3\2\2\2\u0247\u0241\3\2"+
		"\2\2\u0247\u0243\3\2\2\2\u0247\u0245\3\2\2\2\u0248\u0249\3\2\2\2\u0249"+
		"\u024a\5L\'\2\u024a\u024b\3\2\2\2\u024b\u024c\b\'\1\2\u024c\u0251\3\2"+
		"\2\2\u024d\u024e\5N(\2\u024e\u024f\b\'\1\2\u024f\u0251\3\2\2\2\u0250\u023e"+
		"\3\2\2\2\u0250\u024d\3\2\2\2\u0251M\3\2\2\2\u0252\u0253\5P)\2\u0253\u0258"+
		"\b(\1\2\u0254\u0255\7)\2\2\u0255\u0259\b(\1\2\u0256\u0257\7*\2\2\u0257"+
		"\u0259\b(\1\2\u0258\u0254\3\2\2\2\u0258\u0256\3\2\2\2\u0258\u0259\3\2"+
		"\2\2\u0259O\3\2\2\2\u025a\u025b\5R*\2\u025b\u026c\b)\1\2\u025c\u025d\7"+
		"+\2\2\u025d\u025e\5\64\33\2\u025e\u025f\b)\1\2\u025f\u0260\7,\2\2\u0260"+
		"\u026b\3\2\2\2\u0261\u0262\7\63\2\2\u0262\u0263\5\\/\2\u0263\u0264\b)"+
		"\1\2\u0264\u026b\3\2\2\2\u0265\u0266\7-\2\2\u0266\u0267\5> \2\u0267\u0268"+
		"\b)\1\2\u0268\u0269\7.\2\2\u0269\u026b\3\2\2\2\u026a\u025c\3\2\2\2\u026a"+
		"\u0261\3\2\2\2\u026a\u0265\3\2\2\2\u026b\u026e\3\2\2\2\u026c\u026a\3\2"+
		"\2\2\u026c\u026d\3\2\2\2\u026d\u026f\3\2\2\2\u026e\u026c\3\2\2\2\u026f"+
		"\u0270\b)\1\2\u0270Q\3\2\2\2\u0271\u0272\7\31\2\2\u0272\u0282\b*\1\2\u0273"+
		"\u0274\5T+\2\u0274\u0275\b*\1\2\u0275\u0282\3\2\2\2\u0276\u0277\5V,\2"+
		"\u0277\u0278\b*\1\2\u0278\u0282\3\2\2\2\u0279\u027a\5\\/\2\u027a\u027b"+
		"\b*\1\2\u027b\u0282\3\2\2\2\u027c\u027d\7+\2\2\u027d\u027e\5> \2\u027e"+
		"\u027f\7,\2\2\u027f\u0280\b*\1\2\u0280\u0282\3\2\2\2\u0281\u0271\3\2\2"+
		"\2\u0281\u0273\3\2\2\2\u0281\u0276\3\2\2\2\u0281\u0279\3\2\2\2\u0281\u027c"+
		"\3\2\2\2\u0282S\3\2\2\2\u0283\u0284\7\b\2\2\u0284\u0285\5\24\13\2\u0285"+
		"\u0286\7+\2\2\u0286\u0287\5\64\33\2\u0287\u0288\7,\2\2\u0288\u0289\b+"+
		"\1\2\u0289U\3\2\2\2\u028a\u028b\5X-\2\u028b\u028c\b,\1\2\u028c\u0297\3"+
		"\2\2\2\u028d\u028e\78\2\2\u028e\u0297\b,\1\2\u028f\u0290\7\66\2\2\u0290"+
		"\u0297\b,\1\2\u0291\u0292\7\25\2\2\u0292\u0297\b,\1\2\u0293\u0294\5Z."+
		"\2\u0294\u0295\b,\1\2\u0295\u0297\3\2\2\2\u0296\u028a\3\2\2\2\u0296\u028d"+
		"\3\2\2\2\u0296\u028f\3\2\2\2\u0296\u0291\3\2\2\2\u0296\u0293\3\2\2\2\u0297"+
		"W\3\2\2\2\u0298\u0299\7\27\2\2\u0299\u029d\b-\1\2\u029a\u029b\7\30\2\2"+
		"\u029b\u029d\b-\1\2\u029c\u0298\3\2\2\2\u029c\u029a\3\2\2\2\u029dY\3\2"+
		"\2\2\u029e\u029f\7-\2\2\u029f\u02a0\5\64\33\2\u02a0\u02a1\b.\1\2\u02a1"+
		"\u02a2\7.\2\2\u02a2[\3\2\2\2\u02a3\u02a4\7\67\2\2\u02a4\u02a5\b/\1\2\u02a5"+
		"]\3\2\2\2\67hr{}\u0088\u008a\u0093\u0095\u0098\u00a9\u00cb\u00ce\u00e1"+
		"\u00f0\u00fd\u0106\u010f\u0116\u0124\u012d\u0135\u013d\u015b\u0165\u017c"+
		"\u0197\u0199\u01ab\u01ae\u01b4\u01bb\u01bf\u01c3\u01dc\u01e4\u01ee\u01f9"+
		"\u0202\u0209\u0211\u0219\u0222\u0229\u0234\u023b\u0247\u0250\u0258\u026a"+
		"\u026c\u0281\u0296\u029c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}