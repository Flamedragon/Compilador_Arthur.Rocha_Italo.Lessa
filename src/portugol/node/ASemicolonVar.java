/* This file was generated by SableCC (http://www.sablecc.org/). */

package portugol.node;

import portugol.analysis.*;

@SuppressWarnings("nls")
public final class ASemicolonVar extends PSemicolonVar
{
    private TSemicolon _semicolon_;
    private PVar _var_;

    public ASemicolonVar()
    {
        // Constructor
    }

    public ASemicolonVar(
        @SuppressWarnings("hiding") TSemicolon _semicolon_,
        @SuppressWarnings("hiding") PVar _var_)
    {
        // Constructor
        setSemicolon(_semicolon_);

        setVar(_var_);

    }

    @Override
    public Object clone()
    {
        return new ASemicolonVar(
            cloneNode(this._semicolon_),
            cloneNode(this._var_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseASemicolonVar(this);
    }

    public TSemicolon getSemicolon()
    {
        return this._semicolon_;
    }

    public void setSemicolon(TSemicolon node)
    {
        if(this._semicolon_ != null)
        {
            this._semicolon_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._semicolon_ = node;
    }

    public PVar getVar()
    {
        return this._var_;
    }

    public void setVar(PVar node)
    {
        if(this._var_ != null)
        {
            this._var_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._var_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._semicolon_)
            + toString(this._var_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._semicolon_ == child)
        {
            this._semicolon_ = null;
            return;
        }

        if(this._var_ == child)
        {
            this._var_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._semicolon_ == oldChild)
        {
            setSemicolon((TSemicolon) newChild);
            return;
        }

        if(this._var_ == oldChild)
        {
            setVar((PVar) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
