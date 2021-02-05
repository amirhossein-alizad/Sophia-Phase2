package main.visitor.NameAnalyzer;

import main.ast.nodes.Program;
import main.ast.nodes.declaration.classDec.ClassDeclaration;
import main.ast.nodes.declaration.classDec.classMembersDec.ConstructorDeclaration;
import main.ast.nodes.declaration.classDec.classMembersDec.FieldDeclaration;
import main.ast.nodes.declaration.classDec.classMembersDec.MethodDeclaration;
import main.symbolTable.SymbolTable;
import main.symbolTable.exceptions.CyclicInheritanceException;
import main.symbolTable.exceptions.ItemAlreadyExistsException;
import main.visitor.Visitor;
import main.symbolTable.items.ClassSymbolTableItem;
import main.symbolTable.items.FieldSymbolTableItem;
import main.symbolTable.items.MethodSymbolTableItem;
import main.symbolTable.exceptions.ItemNotFoundException;

public class NameCollector extends Visitor  {

    @Override
    public Void visit(Program program) {
        for(ClassDeclaration classDec: program.getClasses()){
            SymbolTable current = null, prev = null;
            ClassSymbolTableItem classItem, parentItem;
            String name = classDec.getClassName().getName();
            try{
                classItem = ((ClassSymbolTableItem) SymbolTable.root.getItem(ClassSymbolTableItem.START_KEY + name,true));
                current = classItem.getClassSymbolTable();
                if(classDec.getParentClassName() != null){
                    parentItem = ((ClassSymbolTableItem) SymbolTable.root.getItem(ClassSymbolTableItem.START_KEY + classDec.getParentClassName().getName(),true));
                    parentItem.getClassSymbolTable().post.add(current);
                    current.pre = parentItem.getClassSymbolTable();
                }
            } catch(ItemNotFoundException  itemNotFound) {
                //
            }
        }
        for(ClassDeclaration classDec: program.getClasses()) {
            ClassSymbolTableItem classItem;
            SymbolTable current = null;
            String name = classDec.getClassName().getName();
            try{
                classItem = ((ClassSymbolTableItem) SymbolTable.root.getItem(ClassSymbolTableItem.START_KEY + name,true));
                current = classItem.getClassSymbolTable();
            } catch(ItemNotFoundException  itemNotFound) {
//
            }
            SymbolTable.push(current);

            try{
                current.checkCycles();
            }
            catch(CyclicInheritanceException exp){
                SymbolTable.errors.add("Line:" +  classDec.getLine() + ":" + "Class " + classDec.getClassName().getName() + " is in an inheritance cycle" );
            }
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
                SymbolTable.top.getItem(FieldSymbolTableItem.START_KEY+fieldSymbolTableitem.getName(),false);
                SymbolTable.error = true;
                SymbolTable.errors.add("Line:" + fieldDec.getLine() + ":" + "Redefinition of field "+ fieldDec.getVarDeclaration().getVarName().getName());
            }
            catch(ItemNotFoundException  itemNotFound)
            {

            }
        }

        ConstructorDeclaration constructorDec = classDeclaration.getConstructor();
        if(constructorDec != null){
            MethodSymbolTableItem methodSymbolTableitem = new MethodSymbolTableItem(constructorDec);
            try {
                SymbolTable.top.getItem(MethodSymbolTableItem.START_KEY+methodSymbolTableitem.getName(),false);
                SymbolTable.error = true;
                SymbolTable.errors.add("Line:" + constructorDec.getLine() + ":" + "Redefinition of method "+ constructorDec.getMethodName().getName());
            }
            catch(ItemNotFoundException  itemNotFound)
            {
            }
            try{
                SymbolTable.top.getItem(FieldSymbolTableItem.START_KEY+methodSymbolTableitem.getName(),false);
                SymbolTable.error = true;
                SymbolTable.errors.add("Line:" + constructorDec.getLine() + ":" + "Name of method " + constructorDec.getMethodName().getName()+" conflicts with a field's name" );
            }catch(ItemNotFoundException  itemNotFound)
            {
            }
            try{
                SymbolTable.top.getItemPost(FieldSymbolTableItem.START_KEY + constructorDec.getMethodName().getName());
            }
            catch(ItemAlreadyExistsException exp){

                SymbolTable.errors.add("Line:" +  constructorDec.getLine()  + ":" + "Name of method " + constructorDec.getMethodName().getName() +" conflicts with a field's name" );
            }

        }
        for(MethodDeclaration methodDeclaration : classDeclaration.getMethods()){
            MethodSymbolTableItem methodSymbolTableitem = new MethodSymbolTableItem(methodDeclaration);
            try {
                SymbolTable.top.getItem(MethodSymbolTableItem.START_KEY+ methodSymbolTableitem.getName(),false);
                SymbolTable.error = true;
                SymbolTable.errors.add("Line:" + methodDeclaration.getLine() + ":" + " Redefinition of method "+ methodDeclaration.getMethodName().getName());
            }
            catch(ItemNotFoundException  itemNotFound)
            {

            }
            try{
                SymbolTable.top.getItem(FieldSymbolTableItem.START_KEY+ methodSymbolTableitem.getName(),false);
                SymbolTable.error = true;
                SymbolTable.errors.add("Line:" + methodDeclaration.getLine() + ":" + "Name of method " + methodDeclaration.getMethodName().getName()+" conflicts with a field's name" );
            }catch(ItemNotFoundException  itemNotFound)
            {
            }
            try{
                SymbolTable.top.getItemPost(FieldSymbolTableItem.START_KEY + methodDeclaration.getMethodName().getName());
            }
            catch(ItemAlreadyExistsException exp){

                SymbolTable.errors.add("Line:" +  methodDeclaration.getLine()  + ":" + "Name of method " + methodDeclaration.getMethodName().getName() +" conflicts with a field's name"  );
            }


        }
        return null;
    }




}