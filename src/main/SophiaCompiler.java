package main;

import main.ast.nodes.Program;
import main.symbolTable.SymbolTable;
import main.visitor.ASTTreePrinter;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import parsers.SophiaLexer;
import parsers.SophiaParser;
import main.visitor.NameAnalyzer.NameAnalyzer;
import main.visitor.NameAnalyzer.NameCollector;

public class SophiaCompiler {
    public void compile(CharStream textStream) {
        SophiaLexer sophiaLexer = new SophiaLexer(textStream);
        CommonTokenStream tokenStream = new CommonTokenStream(sophiaLexer);
        SophiaParser sophiaParser = new SophiaParser(tokenStream);
        Program program = sophiaParser.sophia().sophiaProgram;



        NameAnalyzer nameAnalyser = new NameAnalyzer();
        nameAnalyser.visit(program);
        NameCollector nameCollector = new NameCollector();
        nameCollector.visit(program);

        if (SymbolTable.error != true){
            program.accept(new ASTTreePrinter());
        }
        else{
            for(String str: SymbolTable.errors){
                System.out.println(str);
            }
        }



    }

}