import portugol.lexer.*;
import portugol.node.*;
import portugol.parser.*;

//import expression.lexer.*;
//import expression.node.*;
//import expression.parser.*;

import java.io.*;

public class Compiler
{
 public static void main(String[] arguments)
 {
  try
  {
/*
	  //FileReader fr = new FileReader("/Users/Stomp/code/compilador/src/test.txt");
	  AuxLexer l = new AuxLexer(new PushbackReader(new InputStreamReader(System.in), 1024));
	  
	  try{
		  while(l.peek().getClass().getCanonicalName() != "portugol.node.EOF"){
			  l.next();
		  }
	  }catch(LexerException le){
		  System.out.println(le.getMessage());
	  }
*/
   
   // Create a Parser instance.
   Parser p =
    new Parser(
    new MyLexer(
    new PushbackReader(
    new InputStreamReader(System.in), 1024)));


   // Parse the input.
   Start tree = p.parse();


   // Apply the translation.
  tree.apply(new Translation());
  
  }
  catch(Exception e)
  {
   System.out.println(e.getMessage());
  }
  
 }
}
