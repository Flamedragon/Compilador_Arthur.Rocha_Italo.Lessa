

import java.util.*;

import portugol.analysis.*;
import portugol.node.*;

//import expression.analysis.*;
//import expression.node.*;

public class Translation extends DepthFirstAdapter
{
	Hashtable symbol_table = new Hashtable(); 

	
	
	
	public void printmap(){
		System.out.println(symbol_table.toString());
	}

	@Override	
	public void outAConstDeclaracao  (AConstDeclaracao node) {
    TId ident = node.getId();
    String key = ident.getText().toUpperCase();

   
    
    if (symbol_table.containsKey(key)) {
         System.out.println("Error: [" + ident.getLine() + "," + ident.getPos() + "] Identifier already defined.");
         System.out.println(symbol_table.toString());
         System.exit(0);
    }
    else {
         symbol_table.put(key, key);
    }
  
    
}

	public void outAPrograma  (APrograma node) {
    TId ident = node.getId();
    String key = ident.getText().toUpperCase();

   
    if (symbol_table.containsKey(key)) {
         System.out.println("Error: [" + ident.getLine() + "," + ident.getPos() + "] Identifier already defined.");
         System.out.println(symbol_table.toString());
         System.exit(0);
    }
    else {
         symbol_table.put(key, key);
    }
}
	
public void outAVariableDeclaracao(AVariableDeclaracao node) {
	    LinkedList<PVar> ident = node.getVar();
	    
	    
	    while (!ident.isEmpty()) {
	    	String key = ident.getFirst().toString().toUpperCase();
	    	ident.removeFirst();
	    	if (!symbol_table.containsKey(key)) {
	            System.out.println("Error: Identifier already defined.");
	            System.exit(0);
	       }	
		}
	}
	
public void outAIdVar  (AIdVar node) {
    TId ident = node.getId();
    String key = ident.getText().toUpperCase();

   
    if (symbol_table.containsKey(key)) {
         System.out.println("Error: [" + ident.getLine() + "," + ident.getPos() + "] Identifier already defined.");
         System.exit(0);
    }
    else {
         symbol_table.put(key, key);
    }

}

public void outAIdArrayVar  (AIdArrayVar node) {
    TId ident = node.getId();
    String key = ident.getText().toUpperCase();

   
    if (symbol_table.containsKey(key)) {
         System.out.println("Error: [" + ident.getLine() + "," + ident.getPos() + "] Identifier already defined.");
         System.exit(0);
    }
    else {
         symbol_table.put(key, key);
    }
}

public void outAAssignmentComando(AAssignmentComando node) {
    PVar ident = node.getVar();
    String key = ident.toString().toUpperCase();


    if (!symbol_table.containsKey(key)) {
         System.out.println("Error:  Unknown identifier.");
         System.exit(0);
    }
}

public void outAReadComando(AReadComando node) {
    LinkedList<PVar> ident = node.getVar();
    
    
    while (!ident.isEmpty()) {
    	String key = ident.getFirst().toString().toUpperCase();
    	ident.removeFirst();
    	if (!symbol_table.containsKey(key)) {
            System.out.println("Error:  Unknown identifier.");
            System.exit(0);
       }	
	}
}

    public void outAForComando(AForComando node) {
        PVar ident = node.getVar();
        String key = ident.toString().toUpperCase();


        if (!symbol_table.containsKey(key)) {
             System.out.println("Error:  Unknown identifier.");
             System.exit(0);
        }
    }
    
    public void outAForStepComando(AForStepComando node) {
        PVar ident = node.getVar();
        String key = ident.toString().toUpperCase();


        if (!symbol_table.containsKey(key)) {
             System.out.println("Error:  Unknown identifier.");
             System.exit(0);
        }
    }






}
