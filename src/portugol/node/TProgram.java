/* This file was generated by SableCC (http://www.sablecc.org/). */

package portugol.node;

import portugol.analysis.*;

@SuppressWarnings("nls")
public final class TProgram extends Token
{
    public TProgram()
    {
        super.setText("programa");
    }

    public TProgram(int line, int pos)
    {
        super.setText("programa");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TProgram(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTProgram(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TProgram text.");
    }
}
