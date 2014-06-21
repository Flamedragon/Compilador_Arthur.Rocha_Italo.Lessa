/* This file was generated by SableCC (http://www.sablecc.org/). */

package portugol.node;

import portugol.analysis.*;

@SuppressWarnings("nls")
public final class AMultiplicativeExpressionAdditiveExpression extends PAdditiveExpression
{
    private PMultiplicativeExpression _multiplicativeExpression_;

    public AMultiplicativeExpressionAdditiveExpression()
    {
        // Constructor
    }

    public AMultiplicativeExpressionAdditiveExpression(
        @SuppressWarnings("hiding") PMultiplicativeExpression _multiplicativeExpression_)
    {
        // Constructor
        setMultiplicativeExpression(_multiplicativeExpression_);

    }

    @Override
    public Object clone()
    {
        return new AMultiplicativeExpressionAdditiveExpression(
            cloneNode(this._multiplicativeExpression_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAMultiplicativeExpressionAdditiveExpression(this);
    }

    public PMultiplicativeExpression getMultiplicativeExpression()
    {
        return this._multiplicativeExpression_;
    }

    public void setMultiplicativeExpression(PMultiplicativeExpression node)
    {
        if(this._multiplicativeExpression_ != null)
        {
            this._multiplicativeExpression_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._multiplicativeExpression_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._multiplicativeExpression_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._multiplicativeExpression_ == child)
        {
            this._multiplicativeExpression_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._multiplicativeExpression_ == oldChild)
        {
            setMultiplicativeExpression((PMultiplicativeExpression) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
