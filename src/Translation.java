

import java.util.*;

import portugol.analysis.*;
import portugol.node.*;

//import expression.analysis.*;
//import expression.node.*;

public class Translation extends DepthFirstAdapter
{
	Hashtable symbol_table = new Hashtable(); 

@Override

	public void outAPrograma  (APrograma node) {
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
   



}
