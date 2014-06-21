/* This file was generated by SableCC (http://www.sablecc.org/). */

package portugol.node;

import java.util.*;
import portugol.analysis.*;

@SuppressWarnings("nls")
public final class AElseEvaluate extends PElseEvaluate
{
    private TElse _else_;
    private TColon _colon_;
    private final LinkedList<PComandoSemicolon> _comandoSemicolon_ = new LinkedList<PComandoSemicolon>();

    public AElseEvaluate()
    {
        // Constructor
    }

    public AElseEvaluate(
        @SuppressWarnings("hiding") TElse _else_,
        @SuppressWarnings("hiding") TColon _colon_,
        @SuppressWarnings("hiding") List<?> _comandoSemicolon_)
    {
        // Constructor
        setElse(_else_);

        setColon(_colon_);

        setComandoSemicolon(_comandoSemicolon_);

    }

    @Override
    public Object clone()
    {
        return new AElseEvaluate(
            cloneNode(this._else_),
            cloneNode(this._colon_),
            cloneList(this._comandoSemicolon_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAElseEvaluate(this);
    }

    public TElse getElse()
    {
        return this._else_;
    }

    public void setElse(TElse node)
    {
        if(this._else_ != null)
        {
            this._else_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._else_ = node;
    }

    public TColon getColon()
    {
        return this._colon_;
    }

    public void setColon(TColon node)
    {
        if(this._colon_ != null)
        {
            this._colon_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._colon_ = node;
    }

    public LinkedList<PComandoSemicolon> getComandoSemicolon()
    {
        return this._comandoSemicolon_;
    }

    public void setComandoSemicolon(List<?> list)
    {
        for(PComandoSemicolon e : this._comandoSemicolon_)
        {
            e.parent(null);
        }
        this._comandoSemicolon_.clear();

        for(Object obj_e : list)
        {
            PComandoSemicolon e = (PComandoSemicolon) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._comandoSemicolon_.add(e);
        }
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._else_)
            + toString(this._colon_)
            + toString(this._comandoSemicolon_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._else_ == child)
        {
            this._else_ = null;
            return;
        }

        if(this._colon_ == child)
        {
            this._colon_ = null;
            return;
        }

        if(this._comandoSemicolon_.remove(child))
        {
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._else_ == oldChild)
        {
            setElse((TElse) newChild);
            return;
        }

        if(this._colon_ == oldChild)
        {
            setColon((TColon) newChild);
            return;
        }

        for(ListIterator<PComandoSemicolon> i = this._comandoSemicolon_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PComandoSemicolon) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        throw new RuntimeException("Not a child.");
    }
}
