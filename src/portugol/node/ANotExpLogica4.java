/* This file was generated by SableCC (http://www.sablecc.org/). */

package portugol.node;

import portugol.analysis.*;

@SuppressWarnings("nls")
public final class ANotExpLogica4 extends PExpLogica4
{
    private TNot _not_;
    private PExpLogica4 _expLogica4_;

    public ANotExpLogica4()
    {
        // Constructor
    }

    public ANotExpLogica4(
        @SuppressWarnings("hiding") TNot _not_,
        @SuppressWarnings("hiding") PExpLogica4 _expLogica4_)
    {
        // Constructor
        setNot(_not_);

        setExpLogica4(_expLogica4_);

    }

    @Override
    public Object clone()
    {
        return new ANotExpLogica4(
            cloneNode(this._not_),
            cloneNode(this._expLogica4_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseANotExpLogica4(this);
    }

    public TNot getNot()
    {
        return this._not_;
    }

    public void setNot(TNot node)
    {
        if(this._not_ != null)
        {
            this._not_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._not_ = node;
    }

    public PExpLogica4 getExpLogica4()
    {
        return this._expLogica4_;
    }

    public void setExpLogica4(PExpLogica4 node)
    {
        if(this._expLogica4_ != null)
        {
            this._expLogica4_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._expLogica4_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._not_)
            + toString(this._expLogica4_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._not_ == child)
        {
            this._not_ = null;
            return;
        }

        if(this._expLogica4_ == child)
        {
            this._expLogica4_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._not_ == oldChild)
        {
            setNot((TNot) newChild);
            return;
        }

        if(this._expLogica4_ == oldChild)
        {
            setExpLogica4((PExpLogica4) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}