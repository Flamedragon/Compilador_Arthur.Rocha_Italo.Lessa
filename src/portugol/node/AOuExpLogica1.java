/* This file was generated by SableCC (http://www.sablecc.org/). */

package portugol.node;

import portugol.analysis.*;

@SuppressWarnings("nls")
public final class AOuExpLogica1 extends PExpLogica1
{
    private PExpLogica2 _expLogica2_;
    private TOr _or_;
    private PExpLogica1 _expLogica1_;

    public AOuExpLogica1()
    {
        // Constructor
    }

    public AOuExpLogica1(
        @SuppressWarnings("hiding") PExpLogica2 _expLogica2_,
        @SuppressWarnings("hiding") TOr _or_,
        @SuppressWarnings("hiding") PExpLogica1 _expLogica1_)
    {
        // Constructor
        setExpLogica2(_expLogica2_);

        setOr(_or_);

        setExpLogica1(_expLogica1_);

    }

    @Override
    public Object clone()
    {
        return new AOuExpLogica1(
            cloneNode(this._expLogica2_),
            cloneNode(this._or_),
            cloneNode(this._expLogica1_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAOuExpLogica1(this);
    }

    public PExpLogica2 getExpLogica2()
    {
        return this._expLogica2_;
    }

    public void setExpLogica2(PExpLogica2 node)
    {
        if(this._expLogica2_ != null)
        {
            this._expLogica2_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._expLogica2_ = node;
    }

    public TOr getOr()
    {
        return this._or_;
    }

    public void setOr(TOr node)
    {
        if(this._or_ != null)
        {
            this._or_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._or_ = node;
    }

    public PExpLogica1 getExpLogica1()
    {
        return this._expLogica1_;
    }

    public void setExpLogica1(PExpLogica1 node)
    {
        if(this._expLogica1_ != null)
        {
            this._expLogica1_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._expLogica1_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._expLogica2_)
            + toString(this._or_)
            + toString(this._expLogica1_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._expLogica2_ == child)
        {
            this._expLogica2_ = null;
            return;
        }

        if(this._or_ == child)
        {
            this._or_ = null;
            return;
        }

        if(this._expLogica1_ == child)
        {
            this._expLogica1_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._expLogica2_ == oldChild)
        {
            setExpLogica2((PExpLogica2) newChild);
            return;
        }

        if(this._or_ == oldChild)
        {
            setOr((TOr) newChild);
            return;
        }

        if(this._expLogica1_ == oldChild)
        {
            setExpLogica1((PExpLogica1) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
