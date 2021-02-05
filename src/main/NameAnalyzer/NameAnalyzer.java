package main.visitor.NameAnalyzer;



import main.ast.nodes.Program;
import main.ast.nodes.declaration.classDec.ClassDeclaration;
import main.ast.nodes.declaration.classDec.classMembersDec.ConstructorDeclaration;
import main.ast.nodes.declaration.classDec.classMembersDec.FieldDeclaration;
import main.ast.nodes.declaration.classDec.classMembersDec.MethodDeclaration;
import main.ast.nodes.declaration.variableDec.VarDeclaration;
import main.ast.nodes.statement.Statement;
import main.symbolTable.SymbolTable;
import main.symbolTable.exceptions.ItemAlreadyExistsException;
import main.visitor.Visitor;
import main.symbolTable.items.ClassSymbolTableItem;
import main.symbolTable.items.FieldSymbolTableItem;
import main.symbolTable.items.LocalVariableSymbolTableItem;
import main.symbolTable.items.MethodSymbolTableItem;
import main.symbolTable.exceptions.ItemNotFoundException;

//import main.visitor.NameAnalyzer.ConstructUtil;
import java.util.ArrayList;

public class NameAnalyzer extends Visitor {

    @Override
    public Void visit(Program program) {
        SymbolTable.push(new SymbolTable());
        SymbolTable.root = SymbolTable.top;

        for(ClassDeclaration classDec: program.getClasses()) {
            SymbolTable classSymbolTable = new SymbolTable(SymbolTable.top);
            ClassSymbolTableItem classSymbolTableitem = new ClassSymbolTableItem(classDec);
            try {
                classSymbolTableitem.setClassSymbolTable(classSymbolTable);
                SymbolTable.root.put(classSymbolTableitem);
            } catch (ItemAlreadyExistsException DuplicateItem) {
                SymbolTable.errors.add("Line:" + classDec.getLine() + ":" + "Redefinition of class "+ classDec.getClassName().getName());
                SymbolTable.error = true;
                classSymbolTableitem.setName("$" + classDec.getClassName());
                boolean flag = true;
                String cname = "$" +classDec.getClassName();
                while (flag) {

                    try {
                        SymbolTable.root.put(classSymbolTableitem);
                        flag = false;
                    } catch (ItemAlreadyExistsException ReduplicateItem) {
                        cname = "$" + cname;
                        classSymbolTableitem.setName(cname);
                    }
                }
            }
            SymbolTable.push(classSymbolTable);
            classDec.accept(this);
            SymbolTable.pop();
        }
        return null;
    }

    @Override
    public Void visit(ClassDeclaration classDeclaration) {


        for(FieldDeclaration fieldDec : classDeclaration.getFields()){
            FieldSymbolTableItem fieldSymbolTableitem = new FieldSymbolTableItem(fieldDec);
            try {
                SymbolTable.top.put(fieldSymbolTableitem);
            }
            catch(ItemAlreadyExistsException itemDuplication)
            {
                SymbolTable.error = true;
                SymbolTable.errors.add("Line:" + fieldDec.getLine() + ":" + "Redefinition of field "+ fieldDec.getVarDeclaration().getVarName().getName());
            }
        }

        ConstructorDeclaration constructorDec = classDeclaration.getConstructor();
        if(constructorDec != null){
            SymbolTable constSymbolTable = new SymbolTable(SymbolTable.top);
            MethodSymbolTableItem methodSymbolTableitem = new MethodSymbolTableItem(constructorDec);
            try {
                SymbolTable.top.put(methodSymbolTableitem);
            }
            catch(ItemAlreadyExistsException itemDuplication)
            {
                SymbolTable.error = true;
                SymbolTable.errors.add("Line:" + constructorDec.getLine() + ":" + "Redefinition of method "+ constructorDec.getMethodName().getName());
            }
            try{

                SymbolTable.top.getItem(FieldSymbolTableItem.START_KEY+methodSymbolTableitem.getName(),true);
                SymbolTable.error = true;
                SymbolTable.errors.add("Line:" + constructorDec.getLine() + ":" + "Name of method " + constructorDec.getMethodName().getName()+" conflicts with a field's name");
            }catch(ItemNotFoundException  itemNotFound)
            {
            }
            SymbolTable.push(constSymbolTable);
            constructorDec.accept(this);
            SymbolTable.pop();
        }
        for(MethodDeclaration methodDeclaration : classDeclaration.getMethods()){
            SymbolTable methodSymbolTable = new SymbolTable(SymbolTable.top);
            MethodSymbolTableItem methodSymbolTableitem = new MethodSymbolTableItem(methodDeclaration);
            try {
                SymbolTable.top.put(methodSymbolTableitem);
            }
            catch(ItemAlreadyExistsException itemDuplication)
            {
                SymbolTable.error = true;
                SymbolTable.errors.add("Line:" + methodDeclaration.getLine() + ":" + " Redefinition of method "+ methodDeclaration.getMethodName().getName());
            }
            try{
                SymbolTable.top.getItem(FieldSymbolTableItem.START_KEY+ methodSymbolTableitem.getName(),true);
                SymbolTable.error = true;
                SymbolTable.errors.add("Line:" + methodDeclaration.getLine() + ":" + "Name of method " + methodDeclaration.getMethodName().getName()+" conflicts with a field's name" );
            }catch(ItemNotFoundException  itemNotFound)
            {
            }
            SymbolTable.push(methodSymbolTable);
            methodDeclaration.accept(this);
            SymbolTable.pop();

        }
        return null;
    }

    @Override
    public Void visit(MethodDeclaration methodDeclaration) {
//        SymbolTable.push(new SymbolTable());

        for(VarDeclaration varDec : methodDeclaration.getArgs()){

            LocalVariableSymbolTableItem localVarSymbolTableitem = new LocalVariableSymbolTableItem(varDec);
            try {
                SymbolTable.top.put(localVarSymbolTableitem);
            }
            catch(ItemAlreadyExistsException itemDuplication)
            {
                SymbolTable.error = true;
                SymbolTable.errors.add("Line:" + varDec.getLine() + ":" + "Redefinition of local variable "+ varDec.getVarName().getName());
            }

        }
        for(VarDeclaration varDec : methodDeclaration.getLocalVars()){
            LocalVariableSymbolTableItem localVarSymbolTableitem = new LocalVariableSymbolTableItem(varDec);
            try {
                SymbolTable.top.put(localVarSymbolTableitem);
            }
            catch(ItemAlreadyExistsException itemDuplication)
            {
                SymbolTable.error = true;
                SymbolTable.errors.add("Line:" + varDec.getLine() + ":" + "Redefinition of local variable "+ varDec.getVarName().getName());
            }
        }

        return null;
    }

    @Override
    public Void visit(ConstructorDeclaration constructorDeclaration) {
//        SymbolTable.push(new SymbolTable());

        for(VarDeclaration varDec : constructorDeclaration.getArgs()){
            LocalVariableSymbolTableItem localVarSymbolTableitem = new LocalVariableSymbolTableItem(varDec);
            try {
                SymbolTable.top.put(localVarSymbolTableitem);
            }
            catch(ItemAlreadyExistsException itemDuplication)
            {
                SymbolTable.error = true;
                SymbolTable.errors.add("Line:" + varDec.getLine() + ":" + "Redefinition of local variable "+ varDec.getVarName().getName());
            }

        }
        for(VarDeclaration varDec : constructorDeclaration.getLocalVars()){

            LocalVariableSymbolTableItem localVarSymbolTableitem = new LocalVariableSymbolTableItem(varDec);
            try {
                SymbolTable.top.put(localVarSymbolTableitem);
            }
            catch(ItemAlreadyExistsException itemDuplication)
            {
                SymbolTable.error = true;
                SymbolTable.errors.add("Line:" + varDec.getLine() + ":" + "Redefinition of local variable an2"+ varDec.getVarName().getName());
            }
        }

        return null;
    }
}
