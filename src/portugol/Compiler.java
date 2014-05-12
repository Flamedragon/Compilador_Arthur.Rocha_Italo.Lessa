package portugol;
import portugol.lexer.*;
import java.io.*;

public class Compiler
{
 public static void main(String[] arguments)
 {
	  System.out.println("Starting lexer.");
	  FileReader fr = new FileReader("/Users/Stomp/code/compilador/src/test.txt");
	  AuxLexer l = new AuxLexer(new PushbackReader(fr, 1024));
	  
	  while(l.peek().getClass().getCanonicalName() != "portugol.node.EOF"){
		  try{
			  l.next();
		  }catch(LexerException le){
			  System.out.println(le.getMessage());
		  }
	  }
/*
   System.out.println("Type an arithmetic expression:");
   
   // Create a Parser instance.
   Parser p =
    new Parser(
    new Lexer(
    new PushbackReader(
    new InputStreamReader(System.in), 1024)));


   // Parse the input.
   Start tree = p.parse();


   // Apply the translation.
  tree.apply(new Translation());
*/
  }
  catch(Exception e)
  {
   System.out.println(e.getMessage());
  }
  
 }
}
