/* This file was generated by SableCC (http://www.sablecc.org/). */

package portugol.node;

import java.util.*;
import portugol.analysis.*;

@SuppressWarnings("nls")
public final class AIfComando extends PComando
{
    private PExpression _expression_;
    private final LinkedList<PComando> _comando_ = new LinkedList<PComando>();
    private PElseStatement _elseStatement_;

    public AIfComando()
    {
        // Constructor
    }

    public AIfComando(
        @SuppressWarnings("hiding") PExpression _expression_,
        @SuppressWarnings("hiding") List<?> _comando_,
        @SuppressWarnings("hiding") PElseStatement _elseStatement_)
    {
        // Constructor
        setExpression(_expression_);

        setComando(_comando_);

        setElseStatement(_elseStatement_);

    }

    @Override
    public Object clone()
    {
        return new AIfComando(
            cloneNode(this._expression_),
            cloneList(this._comando_),
            cloneNode(this._elseStatement_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAIfComando(this);
    }

    public PExpression getExpression()
    {
        return this._expression_;
    }

    public void setExpression(PExpression node)
    {
        if(this._expression_ != null)
        {
            this._expression_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._expression_ = node;
    }

    public LinkedList<PComando> getComando()
    {
        return this._comando_;
    }

    public void setComando(List<?> list)
    {
        for(PComando e : this._comando_)
        {
            e.parent(null);
        }
        this._comando_.clear();

        for(Object obj_e : list)
        {
            PComando e = (PComando) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._comando_.add(e);
        }
    }

    public PElseStatement getElseStatement()
    {
        return this._elseStatement_;
    }

    public void setElseStatement(PElseStatement node)
    {
        if(this._elseStatement_ != null)
        {
            this._elseStatement_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._elseStatement_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._expression_)
            + toString(this._comando_)
            + toString(this._elseStatement_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._expression_ == child)
        {
            this._expression_ = null;
            return;
        }

        if(this._comando_.remove(child))
        {
            return;
        }

        if(this._elseStatement_ == child)
        {
            this._elseStatement_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._expression_ == oldChild)
        {
            setExpression((PExpression) newChild);
            return;
        }

        for(ListIterator<PComando> i = this._comando_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PComando) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        if(this._elseStatement_ == oldChild)
        {
            setElseStatement((PElseStatement) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
