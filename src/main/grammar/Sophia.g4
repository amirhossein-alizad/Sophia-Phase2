grammar Sophia;

@header{
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
}

sophia returns[Program sophiaProgram]:
p=program EOF{   $sophiaProgram = new Program($p.classes);
                 $sophiaProgram.setLine(1);};

program returns[ArrayList<ClassDeclaration> classes]:
            {$classes = new ArrayList<>();}
            (sophiaClass  { $classes.add($sophiaClass.classRet);} )* ;

sophiaClass returns[ClassDeclaration classRet]:
            CLASS (class_name = identifier){
            $classRet = new ClassDeclaration($class_name.idRet);
            $classRet.setLine($CLASS.getLine());}
            (EXTENDS parrent_name = identifier{
            $classRet.setParentClassName($parrent_name.idRet);})? LBRACE
            (((varDec1 = varDeclaration{FieldDeclaration var = new FieldDeclaration($varDec1.varDec); var.setLine($varDec1.varDec.getLine());$classRet.addField(var);} |
            method1 = method{$classRet.addMethod($method1.methodDecRet);})* const1 = constructor{$classRet.setConstructor($const1.constDecRet);}
            (varDec2 = varDeclaration {FieldDeclaration var = new FieldDeclaration($varDec2.varDec); var.setLine($varDec2.varDec.getLine());$classRet.addField(var);}| method2 = method{$classRet.addMethod($method2.methodDecRet);})*)
            | ((varDec3 = varDeclaration{FieldDeclaration var = new FieldDeclaration($varDec3.varDec); var.setLine($varDec3.varDec.getLine());$classRet.addField(var);} |
            method3 = method{$classRet.addMethod($method3.methodDecRet);})*)) RBRACE;


varDeclaration returns[VarDeclaration varDec]:
            identifier COLON type SEMICOLLON
            {$varDec = new VarDeclaration($identifier.idRet, $type.typeRet);$varDec.setLine($identifier.start.getLine());};

method returns[MethodDeclaration methodDecRet]:
            DEF {Type retType;}((type{retType = $type.typeRet;}) | (VOID{retType = new NullType();})) identifier {
            $methodDecRet = new MethodDeclaration($identifier.idRet,retType);
            $methodDecRet.setLine($DEF.getLine());}
            LPAR methodArguments{$methodDecRet.setArgs($methodArguments.argdecs);} RPAR LBRACE methodBody{$methodDecRet.setBody($methodBody.stmtLst);$methodDecRet.setLocalVars($methodBody.varLst);} RBRACE;

constructor returns[ConstructorDeclaration constDecRet]:
            DEF identifier {
            $constDecRet = new ConstructorDeclaration($identifier.idRet);
            $constDecRet.setLine($DEF.getLine());}
            LPAR methodArguments{$constDecRet.setArgs($methodArguments.argdecs);}
            RPAR LBRACE methodBody{$constDecRet.setLocalVars( $methodBody.varLst );$constDecRet.setBody( $methodBody.stmtLst );} RBRACE;



methodArguments returns[ArrayList<VarDeclaration> argdecs]locals [VarDeclaration arg]:
            {$argdecs = new ArrayList<>();}(variableWithType{
            $arg = new VarDeclaration($variableWithType.idRet,$variableWithType.typeRet);
            $arg.setLine($variableWithType.idRet.getLine());
            $argdecs.add($arg);
            }(COMMA variableWithType
            {$arg = new VarDeclaration($variableWithType.idRet,$variableWithType.typeRet);
            $arg.setLine($variableWithType.idRet.getLine());
             $argdecs.add($arg);})*)?;


variableWithType returns[Identifier idRet,Type typeRet]:
            identifier COLON type{
            $idRet = $identifier.idRet;
            $typeRet = $type.typeRet;};

type returns[Type typeRet]:
    primitiveDataType { $typeRet = $primitiveDataType.primitiveRet;  }
    | listType { $typeRet = $listType.lstRet; }
    | functionPointerType { $typeRet = $functionPointerType.fptrTypeRet; }
    | classType { $typeRet = $classType.classTypeRet; };

classType returns[ClassType classTypeRet]:
    identifier{ $classTypeRet = new ClassType($identifier.idRet); };

listType returns[ListType lstRet]:
            LIST LPAR (((i1 = INT_VALUE) SHARP type
            {int int_val = $i1.int; $lstRet = new ListType(int_val, new ListNameType($type.typeRet));})
            | (listItemsTypes{$lstRet = new ListType($listItemsTypes.listArr);})) RPAR;

listItemsTypes returns[ArrayList<ListNameType> listArr]:
            {$listArr = new ArrayList<>();}l1=listItemType{$listArr.add($l1.lstNameType);}
             (COMMA l2=listItemType{$listArr.add($l2.lstNameType);})*;

listItemType returns[ListNameType lstNameType]:
            variableWithType { $lstNameType = new ListNameType($variableWithType.idRet, $variableWithType.typeRet); }
            | type { $lstNameType = new ListNameType($type.typeRet); };

functionPointerType returns [FptrType fptrTypeRet]:
            FUNC{ArrayList<Type> arrtypes = new ArrayList<>(); Type rettype = new NullType();}
            LESS_THAN (VOID | (typesWithComma{arrtypes = $typesWithComma.arrTypeRet;})) ARROW (VOID | (type{rettype = $type.typeRet;})) GREATER_THAN
            {$fptrTypeRet = new FptrType(arrtypes, rettype);};

typesWithComma returns[ArrayList<Type> arrTypeRet]:
            {$arrTypeRet = new ArrayList<>();}t1 = type{$arrTypeRet.add($t1.typeRet);}
            (COMMA t2 = type{$arrTypeRet.add($t2.typeRet);})*;

primitiveDataType returns[Type primitiveRet]:
            (INT {$primitiveRet = new IntType();})
            | (STRING {$primitiveRet = new StringType();})
            | (BOOLEAN{$primitiveRet = new BoolType();});

methodBody returns[ArrayList<VarDeclaration> varLst, ArrayList<Statement> stmtLst]:
            {   $varLst = new ArrayList<>();
                $stmtLst = new ArrayList<>();}
            (varDeclaration { $varLst.add($varDeclaration.varDec); } )*(statement { $stmtLst.add($statement.s); } )*;

statement returns[Statement s]:
            forStatement { $s = $forStatement.forstRet; }
            | foreachStatement { $s = $foreachStatement.foreachstRet; }
            | ifStatement { $s = $ifStatement.ifRet; }
            | assignmentStatement { $s = $assignmentStatement.s; }
            | printStatement { $s = $printStatement.printRet; }
            | continueBreakStatement { $s = $continueBreakStatement.st; }
            | methodCallStatement { $s = $methodCallStatement.methodstRet; }
            | returnStatement { $s = $returnStatement.returnRet; }
            | block { $s = $block.blockRet; };

block returns[BlockStmt blockRet]:{$blockRet = new BlockStmt();}
            LBRACE{$blockRet.setLine($LBRACE.getLine());}
            (statement{$blockRet.addStatement($statement.s);})* RBRACE;


assignmentStatement returns[AssignmentStmt s]:
            assignment SEMICOLLON{ $s = $assignment.assignRet; };

assignment returns [AssignmentStmt assignRet]: orExpression ASSIGN expression
            {$assignRet = new AssignmentStmt($orExpression.orExpRet,$expression.ExprRet);
            $assignRet.setLine($ASSIGN.getLine());};

printStatement returns[PrintStmt printRet]:
            PRINT LPAR expression{
            $printRet = new PrintStmt($expression.ExprRet);
            $printRet.setLine($PRINT.getLine());} RPAR SEMICOLLON;

returnStatement returns[ReturnStmt returnRet]:
            RETURN expression? {
            $returnRet = new ReturnStmt ($expression.ExprRet);
            $returnRet.setLine($RETURN.getLine());}SEMICOLLON;


methodCallStatement returns [MethodCallStmt methodstRet]:
            methodCall{$methodstRet = new MethodCallStmt($methodCall.methodcallRet);} SEMICOLLON{$methodstRet.setLine($SEMICOLLON.getLine());};


methodCall returns [MethodCall methodcallRet] locals[Expression instance]:
            otherExpression{$instance = $otherExpression.otherExpRet; }
            ((LPAR methodCallArguments RPAR)
            {$instance = new MethodCall($instance,$methodCallArguments.args);
            $instance.setLine($LPAR.getLine());}
            | (DOT identifier{$instance = new ObjectOrListMemberAccess($instance,$identifier.idRet);
            $instance.setLine($identifier.idRet.getLine());})
            | (LBRACK expression{$instance = new ListAccessByIndex($instance,$expression.ExprRet);
            $instance.setLine($LBRACK.getLine());} RBRACK))*
            (LPAR methodCallArguments RPAR)
            {$methodcallRet = new MethodCall($instance,$methodCallArguments.args); $methodcallRet.setLine($LPAR.getLine());};

methodCallArguments returns[ArrayList<Expression> args]:
            {$args = new ArrayList<>();}
            (expression{
            $args.add($expression.ExprRet);
            } (COMMA expression{$args.add($expression.ExprRet);})*)?;

continueBreakStatement returns[Statement st]:
            (BREAK{$st = new BreakStmt(); $st.setLine($BREAK.getLine());}
            | CONTINUE{$st = new ContinueStmt(); $st.setLine($CONTINUE.getLine());}) SEMICOLLON;

forStatement returns[ForStmt forstRet]:
            FOR LPAR (init = assignment)? SEMICOLLON (cond = expression)? SEMICOLLON (update = assignment)? RPAR st =statement
            {$forstRet = new ForStmt();
             $forstRet.setLine($FOR.getLine());
             $forstRet.setInitialize($init.assignRet);
             $forstRet.setCondition($cond.ExprRet);
             $forstRet.setUpdate($update.assignRet);
             $forstRet.setBody($st.s);};

foreachStatement returns[ForeachStmt foreachstRet]: FOREACH LPAR identifier IN expression RPAR statement
            {$foreachstRet = new ForeachStmt($identifier.idRet,$expression.ExprRet);
            $foreachstRet.setLine($FOREACH.getLine());
            $foreachstRet.setBody($statement.s);
            $foreachstRet.setBody($statement.s);};

ifStatement returns[ConditionalStmt ifRet]:
            IF LPAR expression RPAR ifst=statement
            {$ifRet = new ConditionalStmt($expression.ExprRet,$ifst.s);
            $ifRet.setLine($IF.getLine());}
            (ELSE elsest=statement{$ifRet.setElseBody($elsest.s);})?;



expression returns [Expression ExprRet]:
            orExpression { $ExprRet = $orExpression.orExpRet; $ExprRet.setLine($orExpression.orExpRet.getLine()); }
            (ASSIGN expression
            { $ExprRet = new BinaryExpression($ExprRet, $expression.ExprRet, BinaryOperator.assign); $ExprRet.setLine($ASSIGN.getLine()); })?
            ;

orExpression returns [Expression orExpRet]:
            ae = andExpression{$orExpRet = $ae.andExpRet;}
            (OR ae = andExpression {$orExpRet = new BinaryExpression($orExpRet,$ae.andExpRet,BinaryOperator.or);
            $orExpRet.setLine($OR.getLine());})*;


andExpression returns [Expression andExpRet]:
            ee = equalityExpression {$andExpRet = $ee.eqExpRet;}(AND ee = equalityExpression
            {$andExpRet = new BinaryExpression($andExpRet,$ee.eqExpRet,BinaryOperator.and);
            $andExpRet.setLine($AND.getLine());})*;


equalityExpression returns [Expression eqExpRet]:
            re = relationalExpression {$eqExpRet = $re.reExpRet;BinaryOperator eqop; int line;}
            ((EQUAL{eqop = BinaryOperator.eq; line = $EQUAL.getLine();}
            | NOT_EQUAL{eqop = BinaryOperator.neq; line = $NOT_EQUAL.getLine(); }) re = relationalExpression
            {$eqExpRet = new BinaryExpression($eqExpRet,$re.reExpRet,eqop);
             $eqExpRet.setLine(line);})*;


relationalExpression returns [Expression reExpRet]:
            ae = additiveExpression {$reExpRet = $ae.addExpRet;BinaryOperator reop; int line;}
            ((GREATER_THAN {reop = BinaryOperator.gt; line = $GREATER_THAN.getLine(); }
            | LESS_THAN){reop = BinaryOperator.lt; line = $LESS_THAN.getLine(); } ae = additiveExpression
            {$reExpRet = new BinaryExpression($reExpRet,$ae.addExpRet,reop);
             $reExpRet.setLine(line);})*;

additiveExpression returns [Expression addExpRet]:
            me = multiplicativeExpression {$addExpRet = $me.mulExpRet;BinaryOperator adop; int line;}
            ((PLUS {adop = BinaryOperator.add; line = $PLUS.getLine();}
            | MINUS{adop = BinaryOperator.sub; line = $MINUS.getLine();})
             me = multiplicativeExpression
            {$addExpRet = new BinaryExpression($addExpRet,$me.mulExpRet,adop);
             $addExpRet.setLine(line);})*;

multiplicativeExpression returns [Expression mulExpRet]:
            pe = preUnaryExpression {$mulExpRet = $pe.preunExpRet;BinaryOperator mulop; int line;}
            ((MULT {mulop = BinaryOperator.mult; line = $MULT.getLine();}
            | DIVIDE {mulop = BinaryOperator.div; line = $DIVIDE.getLine();}
            | MOD{mulop = BinaryOperator.mod; line = $MOD.getLine();}) pe2 = preUnaryExpression
            {$mulExpRet = new BinaryExpression($mulExpRet,$pe2.preunExpRet,mulop);
             $mulExpRet.setLine(line);})*;

preUnaryExpression returns [Expression preunExpRet]:
              {UnaryOperator preop; int line;}
             ((NOT {preop = UnaryOperator.not; line = $NOT.getLine();}
             | MINUS {preop = UnaryOperator.minus; line = $MINUS.getLine();}
             | INCREMENT {preop = UnaryOperator.preinc; line = $INCREMENT.getLine();}
             | DECREMENT{preop = UnaryOperator.predec; line = $DECREMENT.getLine();})
             pre = preUnaryExpression){$preunExpRet = new UnaryExpression($pre.preunExpRet,preop);
             $preunExpRet.setLine(line);}
             | postUnaryExpression{$preunExpRet = $postUnaryExpression.PUExprRet;};



postUnaryExpression returns [Expression PUExprRet]:
            e = accessExpression { $PUExprRet = $e.accExpRet; $PUExprRet.setLine($e.accExpRet.getLine());}
            (INCREMENT { $PUExprRet = new UnaryExpression($e.accExpRet, UnaryOperator.postinc); $PUExprRet.setLine($INCREMENT.getLine());}
            | DECREMENT { $PUExprRet = new UnaryExpression($e.accExpRet, UnaryOperator.postdec); $PUExprRet.setLine($DECREMENT.getLine());})?;

accessExpression returns [Expression accExpRet]locals[Expression instance]:
            oe = otherExpression {$instance = $otherExpression.otherExpRet; $instance.setLine($oe.otherExpRet.getLine());}
            ((LPAR methodCallArguments
            {$instance = new MethodCall($instance,$methodCallArguments.args);
            $instance.setLine($LPAR.getLine());}RPAR)
            | (DOT identifier{$instance = new ObjectOrListMemberAccess($instance,$identifier.idRet);
            $instance.setLine($identifier.idRet.getLine());})
            | (LBRACK expression{$instance = new ListAccessByIndex($instance,$expression.ExprRet);
            $instance.setLine($LBRACK.getLine());} RBRACK))*
            {$accExpRet = $instance;};


otherExpression returns [Expression otherExpRet]:
        THIS {$otherExpRet = new ThisClass();$otherExpRet.setLine($THIS.getLine());}
        | newExpression { $otherExpRet = $newExpression.newExprRet; $otherExpRet.setLine($newExpression.newExprRet.getLine()); }
        | values { $otherExpRet = $values.valRet; $otherExpRet.setLine($values.valRet.getLine()); }
        | identifier { $otherExpRet = $identifier.idRet; $otherExpRet.setLine($identifier.idRet.getLine()); }
        | LPAR (e = expression) RPAR { $otherExpRet = $e.ExprRet; $otherExpRet.setLine($e.ExprRet.getLine()); }
        ;

newExpression returns [Expression newExprRet]:
            NEW classType LPAR methodCallArguments RPAR
            {$newExprRet = new NewClassInstance($classType.classTypeRet,$methodCallArguments.args);
            $newExprRet.setLine($NEW.getLine());};

values returns [Expression valRet]:
            boolValue{$valRet = $boolValue.boolRet;}
            | STRING_VALUE {$valRet = new StringValue($STRING_VALUE.text.substring(1, $STRING_VALUE.text.length()-1));$valRet.setLine($STRING_VALUE.getLine());}
            | INT_VALUE {$valRet = new IntValue($INT_VALUE.int);$valRet.setLine($INT_VALUE.getLine());}
            | NULL {$valRet = new NullValue();$valRet.setLine($NULL.getLine());}
            | listValue{$valRet = $listValue.listvalRet; $valRet.setLine($listValue.listvalRet.getLine());};


boolValue returns [BoolValue boolRet]:
            TRUE {$boolRet = new BoolValue(true);$boolRet.setLine($TRUE.getLine());}
            | FALSE{$boolRet = new BoolValue(false);$boolRet.setLine($FALSE.getLine());};

listValue returns [ListValue listvalRet]:
            LBRACK methodCallArguments{
            $listvalRet = new ListValue($methodCallArguments.args);
            $listvalRet.setLine($LBRACK.getLine());
            } RBRACK;

identifier returns[Identifier idRet]:
            IDENTIFIER{$idRet = new Identifier($IDENTIFIER.getText());$idRet.setLine($IDENTIFIER.getLine());};




DEF: 'def';
EXTENDS: 'extends';
CLASS: 'class';

PRINT: 'print';
FUNC: 'func';

NEW: 'new';

CONTINUE: 'continue';
BREAK: 'break';
RETURN: 'return';

FOREACH: 'foreach';
IN: 'in';
FOR: 'for';
IF: 'if';
ELSE: 'else';

BOOLEAN: 'bool';
STRING: 'string';
INT: 'int';
VOID: 'void';
NULL: 'null';
LIST: 'list';

TRUE: 'true';
FALSE: 'false';

THIS: 'this';

ARROW: '->';
GREATER_THAN: '>';
LESS_THAN: '<';
NOT_EQUAL: '!=';
EQUAL: '==';

MULT: '*';
DIVIDE: '/';
MOD: '%';
PLUS: '+';
MINUS: '-';
AND: '&&';
OR: '||';
NOT: '!';
QUESTION_MARK: '?';

ASSIGN: '=';

INCREMENT: '++';
DECREMENT: '--';

LPAR: '(';
RPAR: ')';
LBRACK: '[';
RBRACK: ']';
LBRACE: '{';
RBRACE: '}';

SHARP: '#';
COMMA: ',';
DOT: '.';
COLON: ':';
SEMICOLLON: ';';

INT_VALUE: '0' | [1-9][0-9]*;
IDENTIFIER: [a-zA-Z_][A-Za-z0-9_]*;
STRING_VALUE: '"'~["]*'"';
COMMENT: ('//' ~( '\r' | '\n')*) -> skip;
WS: ([ \t\n\r]) -> skip;