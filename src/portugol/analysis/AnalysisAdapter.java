/* This file was generated by SableCC (http://www.sablecc.org/). */

package portugol.analysis;

import java.util.*;
import portugol.node.*;

public class AnalysisAdapter implements Analysis
{
    private Hashtable<Node,Object> in;
    private Hashtable<Node,Object> out;

    @Override
    public Object getIn(Node node)
    {
        if(this.in == null)
        {
            return null;
        }

        return this.in.get(node);
    }

    @Override
    public void setIn(Node node, Object o)
    {
        if(this.in == null)
        {
            this.in = new Hashtable<Node,Object>(1);
        }

        if(o != null)
        {
            this.in.put(node, o);
        }
        else
        {
            this.in.remove(node);
        }
    }

    @Override
    public Object getOut(Node node)
    {
        if(this.out == null)
        {
            return null;
        }

        return this.out.get(node);
    }

    @Override
    public void setOut(Node node, Object o)
    {
        if(this.out == null)
        {
            this.out = new Hashtable<Node,Object>(1);
        }

        if(o != null)
        {
            this.out.put(node, o);
        }
        else
        {
            this.out.remove(node);
        }
    }

    @Override
    public void caseStart(Start node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPrograma(APrograma node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAVariableDeclaracao(AVariableDeclaracao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAConstDeclaracao(AConstDeclaracao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAOrExpressionExpression(AOrExpressionExpression node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAXorExpressionExpression(AXorExpressionExpression node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAndExpressionExpression(AAndExpressionExpression node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAEqExpression(AEqExpression node)
    {
        defaultCase(node);
    }

    @Override
    public void caseANeqExpression(ANeqExpression node)
    {
        defaultCase(node);
    }

    @Override
    public void caseALtExpression(ALtExpression node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAGtExpression(AGtExpression node)
    {
        defaultCase(node);
    }

    @Override
    public void caseALteqExpression(ALteqExpression node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAGteqExpression(AGteqExpression node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPlusExpression(APlusExpression node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMinusExpression(AMinusExpression node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAStarExpression(AStarExpression node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADivExpression(ADivExpression node)
    {
        defaultCase(node);
    }

    @Override
    public void caseANegativeExpression(ANegativeExpression node)
    {
        defaultCase(node);
    }

    @Override
    public void caseACastExpressionExpression(ACastExpressionExpression node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAComplementExpression(AComplementExpression node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAVarExpression(AVarExpression node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAValorExpression(AValorExpression node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAElseStatement(AElseStatement node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAEvaluateBody(AEvaluateBody node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAElseEvaluate(AElseEvaluate node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAssignmentComando(AAssignmentComando node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAReadComando(AReadComando node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAWriteComando(AWriteComando node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIfComando(AIfComando node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAEvaluateComando(AEvaluateComando node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAWhileComando(AWhileComando node)
    {
        defaultCase(node);
    }

    @Override
    public void caseARepeatComando(ARepeatComando node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAForComando(AForComando node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAForStepComando(AForStepComando node)
    {
        defaultCase(node);
    }

    @Override
    public void caseARealTipo(ARealTipo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIntegerTipo(AIntegerTipo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseACharTipo(ACharTipo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAStringValor(AStringValor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseANIntValor(ANIntValor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseANRealValor(ANRealValor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIdVar(AIdVar node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIdArrayVar(AIdArrayVar node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTProgram(TProgram node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTBegin(TBegin node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTEnd(TEnd node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTDot(TDot node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTColon(TColon node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTSemicolon(TSemicolon node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTConst(TConst node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTComma(TComma node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTReal(TReal node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTInteger(TInteger node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTChar(TChar node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTLBkt(TLBkt node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTRBkt(TRBkt node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTLArrow(TLArrow node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTRead(TRead node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTLPar(TLPar node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTRPar(TRPar node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTWrite(TWrite node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTIf(TIf node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTThen(TThen node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTElse(TElse node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTEndIf(TEndIf node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTEvaluate(TEvaluate node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTCase(TCase node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTEndEvaluate(TEndEvaluate node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTWhile(TWhile node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTDo(TDo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTEndWhile(TEndWhile node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTRepeat(TRepeat node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTUntil(TUntil node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFor(TFor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTOf(TOf node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTStep(TStep node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTEndFor(TEndFor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMinus(TMinus node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTPlus(TPlus node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTStar(TStar node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTBar(TBar node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTEqual(TEqual node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTNotEqual(TNotEqual node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTLEqual(TLEqual node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTGEqual(TGEqual node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTLess(TLess node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTGreater(TGreater node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTNot(TNot node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTAnd(TAnd node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTOr(TOr node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTXor(TXor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTId(TId node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTLineComment(TLineComment node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTBlockCommnetStart(TBlockCommnetStart node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTBlockCommentBody(TBlockCommentBody node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTBlockCommentEnd(TBlockCommentEnd node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTString(TString node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTVector(TVector node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTNInt(TNInt node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTNReal(TNReal node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTBlank(TBlank node)
    {
        defaultCase(node);
    }

    @Override
    public void caseEOF(EOF node)
    {
        defaultCase(node);
    }

    @Override
    public void caseInvalidToken(InvalidToken node)
    {
        defaultCase(node);
    }

    public void defaultCase(@SuppressWarnings("unused") Node node)
    {
        // do nothing
    }
}
