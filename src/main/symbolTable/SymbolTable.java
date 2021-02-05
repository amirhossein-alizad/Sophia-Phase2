package main.symbolTable;


import main.symbolTable.exceptions.CyclicInheritanceException;
import main.symbolTable.exceptions.ItemAlreadyExistsException;
import main.symbolTable.exceptions.ItemNotFoundException;
import main.symbolTable.items.ClassSymbolTableItem;
import main.symbolTable.items.SymbolTableItem;
import main.symbolTable.utils.Stack;

import java.util.*;



public class SymbolTable {

    //Start of static members

    public static SymbolTable top;
    public static SymbolTable root;
    public static boolean error;
    private static Stack<SymbolTable> stack = new Stack<>();
    public static  Set<String>errors = new HashSet<String>();

    public static void push(SymbolTable symbolTable) {
        if (top != null)
            stack.push(top);
        top = symbolTable;
    }

    public static void pop() {
        top = stack.pop();
    }

    //End of static members

    public SymbolTable pre;
    public ArrayList<SymbolTable> post = new ArrayList<SymbolTable>();
    private Map<String, SymbolTableItem> items;

    public SymbolTable() {
        this(null);
    }

    public SymbolTable(SymbolTable pre) {
        this.pre = pre;
        this.items = new HashMap<>();
        this.error = false;
    }

    public void put(SymbolTableItem item) throws ItemAlreadyExistsException {
        if (items.containsKey(item.getKey()))
            throw new ItemAlreadyExistsException();
        items.put(item.getKey(), item);
    }

    public SymbolTableItem getItem(String key, Boolean searchCurrent) throws ItemNotFoundException {
        Set<SymbolTable> visitedSymbolTables = new HashSet<>();
        SymbolTable currentSymbolTable = this;
        if (!searchCurrent) {
            visitedSymbolTables.add(this);
            currentSymbolTable = this.pre;
        }
        while ((currentSymbolTable != null) && (!visitedSymbolTables.contains(currentSymbolTable))) {
            visitedSymbolTables.add(currentSymbolTable);
            SymbolTableItem symbolTableItem = currentSymbolTable.items.get(key);
            if (symbolTableItem != null)
                return symbolTableItem;
            currentSymbolTable = currentSymbolTable.pre;
        }
        throw new ItemNotFoundException();
    }
    public void getItemPost(String key) throws ItemAlreadyExistsException {
        SymbolTableItem curr = null;
        curr = this.items.get(key);
        if(curr != null){
            throw new ItemAlreadyExistsException();
        }
        for(SymbolTable child : this.post){
            try {
                child.getItemPost(key);
            }
            catch (ItemAlreadyExistsException exp){
                throw new ItemAlreadyExistsException();
            }
        }
    }
    public void checkCycles() throws CyclicInheritanceException{
        Set<SymbolTable> visitedSymbolTables = new HashSet<>();
        SymbolTable currentSymbolTable = this;
        visitedSymbolTables.add(this);
        while(currentSymbolTable != null){
            currentSymbolTable = currentSymbolTable.pre;
            if(visitedSymbolTables.contains(currentSymbolTable)) {
                if(currentSymbolTable != this){
                    return;
                }
                throw new CyclicInheritanceException();
            }
            if(currentSymbolTable != null){
                visitedSymbolTables.add(currentSymbolTable);
            }
        }
    }
}