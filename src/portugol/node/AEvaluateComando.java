/* This file was generated by SableCC (http://www.sablecc.org/). */

package portugol.node;

import java.util.*;
import portugol.analysis.*;

@SuppressWarnings("nls")
public final class AEvaluateComando extends PComando
{
    private TEvaluate _evaluate_;
    private TLPar _lPar_;
    private PExp1 _exp1_;
    private TRPar _rPar_;
    private final LinkedList<PEvaluateBody> _evaluateBody_ = new LinkedList<PEvaluateBody>();
    private final LinkedList<PElseEvaluate> _elseEvaluate_ = new LinkedList<PElseEvaluate>();
    private TEndEvaluate _endEvaluate_;
    private TSemicolon _semicolon_;

    public AEvaluateComando()
    {
        // Constructor
    }

    public AEvaluateComando(
        @SuppressWarnings("hiding") TEvaluate _evaluate_,
        @SuppressWarnings("hiding") TLPar _lPar_,
        @SuppressWarnings("hiding") PExp1 _exp1_,
        @SuppressWarnings("hiding") TRPar _rPar_,
        @SuppressWarnings("hiding") List<?> _evaluateBody_,
        @SuppressWarnings("hiding") List<?> _elseEvaluate_,
        @SuppressWarnings("hiding") TEndEvaluate _endEvaluate_,
        @SuppressWarnings("hiding") TSemicolon _semicolon_)
    {
        // Constructor
        setEvaluate(_evaluate_);

        setLPar(_lPar_);

        setExp1(_exp1_);

        setRPar(_rPar_);

        setEvaluateBody(_evaluateBody_);

        setElseEvaluate(_elseEvaluate_);

        setEndEvaluate(_endEvaluate_);

        setSemicolon(_semicolon_);

    }

    @Override
    public Object clone()
    {
        return new AEvaluateComando(
            cloneNode(this._evaluate_),
            cloneNode(this._lPar_),
            cloneNode(this._exp1_),
            cloneNode(this._rPar_),
            cloneList(this._evaluateBody_),
            cloneList(this._elseEvaluate_),
            cloneNode(this._endEvaluate_),
            cloneNode(this._semicolon_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAEvaluateComando(this);
    }

    public TEvaluate getEvaluate()
    {
        return this._evaluate_;
    }

    public void setEvaluate(TEvaluate node)
    {
        if(this._evaluate_ != null)
        {
            this._evaluate_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._evaluate_ = node;
    }

    public TLPar getLPar()
    {
        return this._lPar_;
    }

    public void setLPar(TLPar node)
    {
        if(this._lPar_ != null)
        {
            this._lPar_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._lPar_ = node;
    }

    public PExp1 getExp1()
    {
        return this._exp1_;
    }

    public void setExp1(PExp1 node)
    {
        if(this._exp1_ != null)
        {
            this._exp1_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._exp1_ = node;
    }

    public TRPar getRPar()
    {
        return this._rPar_;
    }

    public void setRPar(TRPar node)
    {
        if(this._rPar_ != null)
        {
            this._rPar_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._rPar_ = node;
    }

    public LinkedList<PEvaluateBody> getEvaluateBody()
    {
        return this._evaluateBody_;
    }

    public void setEvaluateBody(List<?> list)
    {
        for(PEvaluateBody e : this._evaluateBody_)
        {
            e.parent(null);
        }
        this._evaluateBody_.clear();

        for(Object obj_e : list)
        {
            PEvaluateBody e = (PEvaluateBody) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._evaluateBody_.add(e);
        }
    }

    public LinkedList<PElseEvaluate> getElseEvaluate()
    {
        return this._elseEvaluate_;
    }

    public void setElseEvaluate(List<?> list)
    {
        for(PElseEvaluate e : this._elseEvaluate_)
        {
            e.parent(null);
        }
        this._elseEvaluate_.clear();

        for(Object obj_e : list)
        {
            PElseEvaluate e = (PElseEvaluate) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._elseEvaluate_.add(e);
        }
    }

    public TEndEvaluate getEndEvaluate()
    {
        return this._endEvaluate_;
    }

    public void setEndEvaluate(TEndEvaluate node)
    {
        if(this._endEvaluate_ != null)
        {
            this._endEvaluate_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._endEvaluate_ = node;
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

    @Override
    public String toString()
    {
        return ""
            + toString(this._evaluate_)
            + toString(this._lPar_)
            + toString(this._exp1_)
            + toString(this._rPar_)
            + toString(this._evaluateBody_)
            + toString(this._elseEvaluate_)
            + toString(this._endEvaluate_)
            + toString(this._semicolon_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._evaluate_ == child)
        {
            this._evaluate_ = null;
            return;
        }

        if(this._lPar_ == child)
        {
            this._lPar_ = null;
            return;
        }

        if(this._exp1_ == child)
        {
            this._exp1_ = null;
            return;
        }

        if(this._rPar_ == child)
        {
            this._rPar_ = null;
            return;
        }

        if(this._evaluateBody_.remove(child))
        {
            return;
        }

        if(this._elseEvaluate_.remove(child))
        {
            return;
        }

        if(this._endEvaluate_ == child)
        {
            this._endEvaluate_ = null;
            return;
        }

        if(this._semicolon_ == child)
        {
            this._semicolon_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._evaluate_ == oldChild)
        {
            setEvaluate((TEvaluate) newChild);
            return;
        }

        if(this._lPar_ == oldChild)
        {
            setLPar((TLPar) newChild);
            return;
        }

        if(this._exp1_ == oldChild)
        {
            setExp1((PExp1) newChild);
            return;
        }

        if(this._rPar_ == oldChild)
        {
            setRPar((TRPar) newChild);
            return;
        }

        for(ListIterator<PEvaluateBody> i = this._evaluateBody_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PEvaluateBody) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        for(ListIterator<PElseEvaluate> i = this._elseEvaluate_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PElseEvaluate) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        if(this._endEvaluate_ == oldChild)
        {
            setEndEvaluate((TEndEvaluate) newChild);
            return;
        }

        if(this._semicolon_ == oldChild)
        {
            setSemicolon((TSemicolon) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
