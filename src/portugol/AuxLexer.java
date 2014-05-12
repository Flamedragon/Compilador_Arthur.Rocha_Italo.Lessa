package portugol;

import java.io.IOException;
import java.io.PushbackReader;

import portugol.lexer.IPushbackReader;
import portugol.lexer.Lexer;
import portugol.lexer.LexerException;

public class AuxLexer extends Lexer {
	
	private int previousLine;
	
	public AuxLexer(@SuppressWarnings("hiding") PushbackReader in){
		super(in);
		previousLine = -1;
	}
	
	@SuppressWarnings("unused")
    protected void filter() throws LexerException, IOException
    {
		if(previousLine == -1){
			previousLine = token.getLine();
		}
        
        if(previousLine != token.getLine()){
        	System.out.println();
        	previousLine = token.getLine();
        }
        
        System.out.printf(this.token.getClass().getSimpleName()+" ");
    }

}
