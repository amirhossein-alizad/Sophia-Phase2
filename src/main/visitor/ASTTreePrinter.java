package main.visitor;

import main.ast.nodes.Program;
import main.ast.nodes.declaration.classDec.ClassDeclaration;
import main.ast.nodes.declaration.classDec.classMembersDec.ConstructorDeclaration;
import main.ast.nodes.declaration.classDec.classMembersDec.FieldDeclaration;
import main.ast.nodes.declaration.classDec.classMembersDec.MethodDeclaration;
import main.ast.nodes.declaration.variableDec.VarDeclaration;
import main.ast.nodes.expression.*;
import main.ast.nodes.expression.values.ListValue;
import main.ast.nodes.expression.values.NullValue;
import main.ast.nodes.expression.values.primitive.BoolValue;
import main.ast.nodes.expression.values.primitive.IntValue;
import main.ast.nodes.expression.values.primitive.StringValue;
import main.ast.nodes.statement.*;
import main.ast.nodes.statement.loop.BreakStmt;
import main.ast.nodes.statement.loop.ContinueStmt;
import main.ast.nodes.statement.loop.ForStmt;
import main.ast.nodes.statement.loop.ForeachStmt;

public class ASTTreePrinter extends Visitor<Void> {

    @Override
    public Void visit(Program program) {
        System.out.println("Line:" + program.getLine() + ":" + program.toString());
        for(ClassDeclaration classDec: program.getClasses()){
            classDec.accept( this);
        }
        return null;
    }

    @Override
    public Void visit(ClassDeclaration classDeclaration) {
        System.out.println("Line:" + classDeclaration.getLine() + ":" + classDeclaration.toString());
        if(classDeclaration.getClassName() != null){
            classDeclaration.getClassName().accept(this);
        }
        if(classDeclaration.getParentClassName() != null){
            classDeclaration.getParentClassName().accept(this);
        }
        for(FieldDeclaration fieldDec : classDeclaration.getFields()){
            fieldDec.accept(this);
        }
        ConstructorDeclaration constructorDec = classDeclaration.getConstructor();
        if(constructorDec != null){
            constructorDec.accept(this);
        }
        for(MethodDeclaration methodDeclaration : classDeclaration.getMethods()){
            methodDeclaration.accept(this);
        }
        return null;
    }

    @Override
    public Void visit(ConstructorDeclaration constructorDeclaration) {
        System.out.println("Line:" + constructorDeclaration.getLine() + ":" + constructorDeclaration.toString());
        if(constructorDeclaration.getMethodName() != null){
            constructorDeclaration.getMethodName().accept(this);
        }
        for(VarDeclaration varDec : constructorDeclaration.getArgs()){
            varDec.accept(this);
        }
        for(VarDeclaration varDec : constructorDeclaration.getLocalVars()){
            varDec.accept(this);
        }
        for(Statement stmt : constructorDeclaration.getBody()){
            stmt.accept(this);
        }
        return null;
    }

    @Override
    public Void visit(MethodDeclaration methodDeclaration) {
        System.out.println("Line:" + methodDeclaration.getLine() + ":" + methodDeclaration.toString());
        if(methodDeclaration.getMethodName() != null){
            methodDeclaration.getMethodName().accept(this);
        }
        for(VarDeclaration varDec : methodDeclaration.getArgs()){
            varDec.accept(this);
        }
        for(VarDeclaration varDec : methodDeclaration.getLocalVars()){
            varDec.accept(this);
        }
        for(Statement stmt : methodDeclaration.getBody()){
            stmt.accept(this);
        }
        return null;
    }

    @Override
    public Void visit(FieldDeclaration fieldDeclaration) {
        System.out.println("Line:" + fieldDeclaration.getLine() + ":" + fieldDeclaration.toString());
        if(fieldDeclaration.getVarDeclaration() != null){
            fieldDeclaration.getVarDeclaration().accept(this);
        }
        return null;
    }

    @Override
    public Void visit(VarDeclaration varDeclaration) {
        System.out.println("Line:" + varDeclaration.getLine() + ":" + varDeclaration.toString());
        if(varDeclaration.getVarName() != null) {
            varDeclaration.getVarName().accept(this);
        }
        return null;
    }

    @Override
    public Void visit(AssignmentStmt assignmentStmt) {
        System.out.println("Line:" + assignmentStmt.getLine() + ":" + assignmentStmt.toString());
        if(assignmentStmt.getlValue() != null){
            assignmentStmt.getlValue().accept(this);
        }
        if(assignmentStmt.getrValue() != null){
            assignmentStmt.getrValue().accept(this);
        }
        return null;
    }

    @Override
    public Void visit(BlockStmt blockStmt) {
        System.out.println("Line:" + blockStmt.getLine() + ":" + blockStmt.toString());
        for(Statement stmt : blockStmt.getStatements()){
            stmt.accept(this);
        }
        return null;
    }

    @Override
    public Void visit(ConditionalStmt conditionalStmt) {
        System.out.println("Line:" + conditionalStmt.getLine() + ":" + conditionalStmt.toString());
        if(conditionalStmt.getCondition() != null){
            conditionalStmt.getCondition().accept(this);
        }
        if(conditionalStmt.getThenBody() != null){
            conditionalStmt.getThenBody().accept(this);
        }
        if(conditionalStmt.getElseBody() != null){
            conditionalStmt.getElseBody().accept(this);
        }
        return null;
    }

    @Override
    public Void visit(MethodCallStmt methodCallStmt) {
        System.out.println("Line:" + methodCallStmt.getLine() + ":" + methodCallStmt.toString());
        if(methodCallStmt.getMethodCall() != null){
            methodCallStmt.getMethodCall().accept(this);
        }
        return null;
    }

    @Override
    public Void visit(PrintStmt print) {
        System.out.println("Line:" + print.getLine() + ":" + print.toString());
        if(print.getArg() != null){
            print.getArg().accept(this);
        }
        return null;
    }

    @Override
    public Void visit(ReturnStmt returnStmt) {
        System.out.println("Line:" + returnStmt.getLine() + ":" + returnStmt.toString());
        if(returnStmt.getReturnedExpr() != null){
            returnStmt.getReturnedExpr().accept(this);
        }
        return null;
    }

    @Override
    public Void visit(BreakStmt breakStmt) {
        System.out.println("Line:" + breakStmt.getLine() + ":" + breakStmt.toString());
        return null;
    }

    @Override
    public Void visit(ContinueStmt continueStmt) {
        System.out.println("Line:" + continueStmt.getLine() + ":" + continueStmt.toString());
        return null;
    }

    @Override
    public Void visit(ForeachStmt foreachStmt) {
        System.out.println("Line:" + foreachStmt.getLine() + ":" + foreachStmt.toString());
        if(foreachStmt.getVariable() != null){
            foreachStmt.getVariable().accept(this);
        }
        if(foreachStmt.getList() != null){
            foreachStmt.getList().accept(this);
        }
        if(foreachStmt.getBody() != null){
            foreachStmt.getBody().accept(this);
        }
        return null;
    }

    @Override
    public Void visit(ForStmt forStmt) {
        System.out.println("Line:" + forStmt.getLine() + ":" + forStmt.toString());
        if(forStmt.getInitialize() != null){
            forStmt.getInitialize().accept(this);
        }
        if(forStmt.getCondition() != null){
            forStmt.getCondition().accept(this);
        }
        if(forStmt.getUpdate() != null){
            forStmt.getUpdate().accept(this);
        }
        if(forStmt.getBody() != null){
            forStmt.getBody().accept(this);
        }
        return null;
    }

    @Override
    public Void visit(BinaryExpression binaryExpression) {
        System.out.println("Line:" + binaryExpression.getLine() + ":" + binaryExpression.toString());
        if(binaryExpression.getFirstOperand() != null){
            binaryExpression.getFirstOperand().accept(this);
        }
        if(binaryExpression.getSecondOperand() != null) {
            binaryExpression.getSecondOperand().accept(this);
        }
        return null;
    }

    @Override
    public Void visit(UnaryExpression unaryExpression) {
        System.out.println("Line:" + unaryExpression.getLine() + ":" + unaryExpression.toString());
        if(unaryExpression.getOperand() != null){
            unaryExpression.getOperand().accept(this);
        }
        return null;
    }

    @Override
    public Void visit(ObjectOrListMemberAccess objectOrListMemberAccess) {
        System.out.println("Line:" + objectOrListMemberAccess.getLine() + ":" + objectOrListMemberAccess.toString());
        if(objectOrListMemberAccess.getInstance() != null){
            objectOrListMemberAccess.getInstance().accept(this);
        }
        if(objectOrListMemberAccess.getMemberName() != null){
            objectOrListMemberAccess.getMemberName().accept(this);
        }
        return null;
    }

    @Override
    public Void visit(Identifier identifier) {
        System.out.println("Line:" + identifier.getLine() + ":" + identifier.toString());
        return null;
    }

    @Override
    public Void visit(ListAccessByIndex listAccessByIndex) {
        System.out.println("Line:" + listAccessByIndex.getLine() + ":" + listAccessByIndex.toString());
        if(listAccessByIndex.getInstance() != null){
            listAccessByIndex.getInstance().accept(this);
        }
        if(listAccessByIndex.getIndex() != null) {
            listAccessByIndex.getIndex().accept(this);
        }
        return null;
    }

    @Override
    public Void visit(MethodCall methodCall) {
        System.out.println("Line:" + methodCall.getLine() + ":" + methodCall.toString());
        if(methodCall.getInstance() != null){
            methodCall.getInstance().accept(this);
        }
        for(Expression expr : methodCall.getArgs()){
            if(expr != null) {
                expr.accept(this);
            }
        }
        return null;
    }

    @Override
    public Void visit(NewClassInstance newClassInstance) {
        System.out.println("Line:" + newClassInstance.getLine() + ":" + newClassInstance.toString());
        for(Expression expr : newClassInstance.getArgs()){
            if(expr != null) {
                expr.accept(this);
            }
        }
        return null;
    }

    @Override
    public Void visit(ThisClass thisClass) {
        System.out.println("Line:" + thisClass.getLine() + ":" + thisClass.toString());
        return null;
    }

    @Override
    public Void visit(ListValue listValue) {
        System.out.println("Line:" + listValue.getLine() + ":" + listValue.toString());
        for(Expression expr : listValue.getElements()){
            expr.accept(this);
        }
        return null;
    }

    @Override
    public Void visit(NullValue nullValue) {
        System.out.println("Line:" + nullValue.getLine() + ":" + nullValue.toString());
        return null;
    }

    @Override
    public Void visit(IntValue intValue) {
        System.out.println("Line:" + intValue.getLine() + ":" + intValue.toString());
        return null;
    }

    @Override
    public Void visit(BoolValue boolValue) {
        System.out.println("Line:" + boolValue.getLine() + ":" + boolValue.toString());
        return null;
    }

    @Override
    public Void visit(StringValue stringValue) {
        System.out.println("Line:" + stringValue.getLine() + ":" + stringValue.toString());
        return null;
    }

}
