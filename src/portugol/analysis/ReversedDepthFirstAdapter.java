/* This file was generated by SableCC (http://www.sablecc.org/). */

package portugol.analysis;

import java.util.*;
import portugol.node.*;

public class ReversedDepthFirstAdapter extends AnalysisAdapter
{
    public void inStart(Start node)
    {
        defaultIn(node);
    }

    public void outStart(Start node)
    {
        defaultOut(node);
    }

    public void defaultIn(@SuppressWarnings("unused") Node node)
    {
        // Do nothing
    }

    public void defaultOut(@SuppressWarnings("unused") Node node)
    {
        // Do nothing
    }

    @Override
    public void caseStart(Start node)
    {
        inStart(node);
        node.getEOF().apply(this);
        node.getPPrograma().apply(this);
        outStart(node);
    }

    public void inAPrograma(APrograma node)
    {
        defaultIn(node);
    }

    public void outAPrograma(APrograma node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAPrograma(APrograma node)
    {
        inAPrograma(node);
        if(node.getDot() != null)
        {
            node.getDot().apply(this);
        }
        if(node.getEnd() != null)
        {
            node.getEnd().apply(this);
        }
        {
            List<PComandoOuDeclaracao> copy = new ArrayList<PComandoOuDeclaracao>(node.getComandoOuDeclaracao());
            Collections.reverse(copy);
            for(PComandoOuDeclaracao e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getBegin() != null)
        {
            node.getBegin().apply(this);
        }
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        if(node.getProgram() != null)
        {
            node.getProgram().apply(this);
        }
        outAPrograma(node);
    }

    public void inADeclaracaoComandoOuDeclaracao(ADeclaracaoComandoOuDeclaracao node)
    {
        defaultIn(node);
    }

    public void outADeclaracaoComandoOuDeclaracao(ADeclaracaoComandoOuDeclaracao node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADeclaracaoComandoOuDeclaracao(ADeclaracaoComandoOuDeclaracao node)
    {
        inADeclaracaoComandoOuDeclaracao(node);
        if(node.getDeclaracao() != null)
        {
            node.getDeclaracao().apply(this);
        }
        outADeclaracaoComandoOuDeclaracao(node);
    }

    public void inAComandoComandoOuDeclaracao(AComandoComandoOuDeclaracao node)
    {
        defaultIn(node);
    }

    public void outAComandoComandoOuDeclaracao(AComandoComandoOuDeclaracao node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAComandoComandoOuDeclaracao(AComandoComandoOuDeclaracao node)
    {
        inAComandoComandoOuDeclaracao(node);
        if(node.getComando() != null)
        {
            node.getComando().apply(this);
        }
        outAComandoComandoOuDeclaracao(node);
    }

    public void inAIdVar(AIdVar node)
    {
        defaultIn(node);
    }

    public void outAIdVar(AIdVar node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIdVar(AIdVar node)
    {
        inAIdVar(node);
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        outAIdVar(node);
    }

    public void inAIdArrayVar(AIdArrayVar node)
    {
        defaultIn(node);
    }

    public void outAIdArrayVar(AIdArrayVar node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIdArrayVar(AIdArrayVar node)
    {
        inAIdArrayVar(node);
        if(node.getRBkt() != null)
        {
            node.getRBkt().apply(this);
        }
        if(node.getNInt() != null)
        {
            node.getNInt().apply(this);
        }
        if(node.getLBkt() != null)
        {
            node.getLBkt().apply(this);
        }
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        outAIdArrayVar(node);
    }

    public void inAStringValor(AStringValor node)
    {
        defaultIn(node);
    }

    public void outAStringValor(AStringValor node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAStringValor(AStringValor node)
    {
        inAStringValor(node);
        if(node.getString() != null)
        {
            node.getString().apply(this);
        }
        outAStringValor(node);
    }

    public void inANIntValor(ANIntValor node)
    {
        defaultIn(node);
    }

    public void outANIntValor(ANIntValor node)
    {
        defaultOut(node);
    }

    @Override
    public void caseANIntValor(ANIntValor node)
    {
        inANIntValor(node);
        if(node.getNInt() != null)
        {
            node.getNInt().apply(this);
        }
        outANIntValor(node);
    }

    public void inANRealValor(ANRealValor node)
    {
        defaultIn(node);
    }

    public void outANRealValor(ANRealValor node)
    {
        defaultOut(node);
    }

    @Override
    public void caseANRealValor(ANRealValor node)
    {
        inANRealValor(node);
        if(node.getNReal() != null)
        {
            node.getNReal().apply(this);
        }
        outANRealValor(node);
    }

    public void inARealTipo(ARealTipo node)
    {
        defaultIn(node);
    }

    public void outARealTipo(ARealTipo node)
    {
        defaultOut(node);
    }

    @Override
    public void caseARealTipo(ARealTipo node)
    {
        inARealTipo(node);
        if(node.getReal() != null)
        {
            node.getReal().apply(this);
        }
        outARealTipo(node);
    }

    public void inAIntegerTipo(AIntegerTipo node)
    {
        defaultIn(node);
    }

    public void outAIntegerTipo(AIntegerTipo node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIntegerTipo(AIntegerTipo node)
    {
        inAIntegerTipo(node);
        if(node.getInteger() != null)
        {
            node.getInteger().apply(this);
        }
        outAIntegerTipo(node);
    }

    public void inACharTipo(ACharTipo node)
    {
        defaultIn(node);
    }

    public void outACharTipo(ACharTipo node)
    {
        defaultOut(node);
    }

    @Override
    public void caseACharTipo(ACharTipo node)
    {
        inACharTipo(node);
        if(node.getChar() != null)
        {
            node.getChar().apply(this);
        }
        outACharTipo(node);
    }

    public void inAVariableDeclaracao(AVariableDeclaracao node)
    {
        defaultIn(node);
    }

    public void outAVariableDeclaracao(AVariableDeclaracao node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVariableDeclaracao(AVariableDeclaracao node)
    {
        inAVariableDeclaracao(node);
        if(node.getSemicolon() != null)
        {
            node.getSemicolon().apply(this);
        }
        {
            List<PVarSemicolon> copy = new ArrayList<PVarSemicolon>(node.getVarSemicolon());
            Collections.reverse(copy);
            for(PVarSemicolon e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getVar() != null)
        {
            node.getVar().apply(this);
        }
        if(node.getColon() != null)
        {
            node.getColon().apply(this);
        }
        if(node.getTipo() != null)
        {
            node.getTipo().apply(this);
        }
        outAVariableDeclaracao(node);
    }

    public void inAConstDeclaracao(AConstDeclaracao node)
    {
        defaultIn(node);
    }

    public void outAConstDeclaracao(AConstDeclaracao node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAConstDeclaracao(AConstDeclaracao node)
    {
        inAConstDeclaracao(node);
        if(node.getValor() != null)
        {
            node.getValor().apply(this);
        }
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        if(node.getConst() != null)
        {
            node.getConst().apply(this);
        }
        outAConstDeclaracao(node);
    }

    public void inAVarSemicolon(AVarSemicolon node)
    {
        defaultIn(node);
    }

    public void outAVarSemicolon(AVarSemicolon node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVarSemicolon(AVarSemicolon node)
    {
        inAVarSemicolon(node);
        if(node.getSemicolon() != null)
        {
            node.getSemicolon().apply(this);
        }
        if(node.getVar() != null)
        {
            node.getVar().apply(this);
        }
        outAVarSemicolon(node);
    }

    public void inASemicolonVar(ASemicolonVar node)
    {
        defaultIn(node);
    }

    public void outASemicolonVar(ASemicolonVar node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASemicolonVar(ASemicolonVar node)
    {
        inASemicolonVar(node);
        if(node.getVar() != null)
        {
            node.getVar().apply(this);
        }
        if(node.getSemicolon() != null)
        {
            node.getSemicolon().apply(this);
        }
        outASemicolonVar(node);
    }

    public void inAAssignmentComando(AAssignmentComando node)
    {
        defaultIn(node);
    }

    public void outAAssignmentComando(AAssignmentComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAssignmentComando(AAssignmentComando node)
    {
        inAAssignmentComando(node);
        if(node.getSemicolon() != null)
        {
            node.getSemicolon().apply(this);
        }
        if(node.getEqualityExpression() != null)
        {
            node.getEqualityExpression().apply(this);
        }
        if(node.getLArrow() != null)
        {
            node.getLArrow().apply(this);
        }
        if(node.getVar() != null)
        {
            node.getVar().apply(this);
        }
        outAAssignmentComando(node);
    }

    public void inAReadComando(AReadComando node)
    {
        defaultIn(node);
    }

    public void outAReadComando(AReadComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAReadComando(AReadComando node)
    {
        inAReadComando(node);
        if(node.getSemicolon() != null)
        {
            node.getSemicolon().apply(this);
        }
        if(node.getRPar() != null)
        {
            node.getRPar().apply(this);
        }
        {
            List<PCommaVar> copy = new ArrayList<PCommaVar>(node.getCommaVar());
            Collections.reverse(copy);
            for(PCommaVar e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getVar() != null)
        {
            node.getVar().apply(this);
        }
        if(node.getLPar() != null)
        {
            node.getLPar().apply(this);
        }
        if(node.getRead() != null)
        {
            node.getRead().apply(this);
        }
        outAReadComando(node);
    }

    public void inAElseStatement(AElseStatement node)
    {
        defaultIn(node);
    }

    public void outAElseStatement(AElseStatement node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAElseStatement(AElseStatement node)
    {
        inAElseStatement(node);
        {
            List<PComandoSemicolon> copy = new ArrayList<PComandoSemicolon>(node.getComandoSemicolon());
            Collections.reverse(copy);
            for(PComandoSemicolon e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getElse() != null)
        {
            node.getElse().apply(this);
        }
        outAElseStatement(node);
    }

    public void inAEvaluateBody(AEvaluateBody node)
    {
        defaultIn(node);
    }

    public void outAEvaluateBody(AEvaluateBody node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAEvaluateBody(AEvaluateBody node)
    {
        inAEvaluateBody(node);
        {
            List<PComandoSemicolon> copy = new ArrayList<PComandoSemicolon>(node.getComandoSemicolon());
            Collections.reverse(copy);
            for(PComandoSemicolon e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getColon() != null)
        {
            node.getColon().apply(this);
        }
        if(node.getValor() != null)
        {
            node.getValor().apply(this);
        }
        if(node.getCase() != null)
        {
            node.getCase().apply(this);
        }
        outAEvaluateBody(node);
    }

    public void inAElseEvaluate(AElseEvaluate node)
    {
        defaultIn(node);
    }

    public void outAElseEvaluate(AElseEvaluate node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAElseEvaluate(AElseEvaluate node)
    {
        inAElseEvaluate(node);
        {
            List<PComandoSemicolon> copy = new ArrayList<PComandoSemicolon>(node.getComandoSemicolon());
            Collections.reverse(copy);
            for(PComandoSemicolon e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getColon() != null)
        {
            node.getColon().apply(this);
        }
        if(node.getElse() != null)
        {
            node.getElse().apply(this);
        }
        outAElseEvaluate(node);
    }

    public void inACommaVar(ACommaVar node)
    {
        defaultIn(node);
    }

    public void outACommaVar(ACommaVar node)
    {
        defaultOut(node);
    }

    @Override
    public void caseACommaVar(ACommaVar node)
    {
        inACommaVar(node);
        if(node.getVar() != null)
        {
            node.getVar().apply(this);
        }
        if(node.getComma() != null)
        {
            node.getComma().apply(this);
        }
        outACommaVar(node);
    }

    public void inACommaExp(ACommaExp node)
    {
        defaultIn(node);
    }

    public void outACommaExp(ACommaExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseACommaExp(ACommaExp node)
    {
        inACommaExp(node);
        if(node.getEqualityExpression() != null)
        {
            node.getEqualityExpression().apply(this);
        }
        if(node.getComma() != null)
        {
            node.getComma().apply(this);
        }
        outACommaExp(node);
    }

    public void inAComandoSemicolon(AComandoSemicolon node)
    {
        defaultIn(node);
    }

    public void outAComandoSemicolon(AComandoSemicolon node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAComandoSemicolon(AComandoSemicolon node)
    {
        inAComandoSemicolon(node);
        if(node.getSemicolon() != null)
        {
            node.getSemicolon().apply(this);
        }
        if(node.getComando() != null)
        {
            node.getComando().apply(this);
        }
        outAComandoSemicolon(node);
    }

    public void inARelationalExpressionEqualityExpression(ARelationalExpressionEqualityExpression node)
    {
        defaultIn(node);
    }

    public void outARelationalExpressionEqualityExpression(ARelationalExpressionEqualityExpression node)
    {
        defaultOut(node);
    }

    @Override
    public void caseARelationalExpressionEqualityExpression(ARelationalExpressionEqualityExpression node)
    {
        inARelationalExpressionEqualityExpression(node);
        if(node.getRelationalExpression() != null)
        {
            node.getRelationalExpression().apply(this);
        }
        outARelationalExpressionEqualityExpression(node);
    }

    public void inAEqEqualityExpression(AEqEqualityExpression node)
    {
        defaultIn(node);
    }

    public void outAEqEqualityExpression(AEqEqualityExpression node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAEqEqualityExpression(AEqEqualityExpression node)
    {
        inAEqEqualityExpression(node);
        if(node.getRelationalExpression() != null)
        {
            node.getRelationalExpression().apply(this);
        }
        if(node.getEqual() != null)
        {
            node.getEqual().apply(this);
        }
        if(node.getEqualityExpression() != null)
        {
            node.getEqualityExpression().apply(this);
        }
        outAEqEqualityExpression(node);
    }

    public void inANeqEqualityExpression(ANeqEqualityExpression node)
    {
        defaultIn(node);
    }

    public void outANeqEqualityExpression(ANeqEqualityExpression node)
    {
        defaultOut(node);
    }

    @Override
    public void caseANeqEqualityExpression(ANeqEqualityExpression node)
    {
        inANeqEqualityExpression(node);
        if(node.getRelationalExpression() != null)
        {
            node.getRelationalExpression().apply(this);
        }
        if(node.getNotEqual() != null)
        {
            node.getNotEqual().apply(this);
        }
        if(node.getEqualityExpression() != null)
        {
            node.getEqualityExpression().apply(this);
        }
        outANeqEqualityExpression(node);
    }

    public void inASadditiveExpressionRelationalExpression(ASadditiveExpressionRelationalExpression node)
    {
        defaultIn(node);
    }

    public void outASadditiveExpressionRelationalExpression(ASadditiveExpressionRelationalExpression node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASadditiveExpressionRelationalExpression(ASadditiveExpressionRelationalExpression node)
    {
        inASadditiveExpressionRelationalExpression(node);
        if(node.getAdditiveExpression() != null)
        {
            node.getAdditiveExpression().apply(this);
        }
        outASadditiveExpressionRelationalExpression(node);
    }

    public void inALtRelationalExpression(ALtRelationalExpression node)
    {
        defaultIn(node);
    }

    public void outALtRelationalExpression(ALtRelationalExpression node)
    {
        defaultOut(node);
    }

    @Override
    public void caseALtRelationalExpression(ALtRelationalExpression node)
    {
        inALtRelationalExpression(node);
        if(node.getAdditiveExpression() != null)
        {
            node.getAdditiveExpression().apply(this);
        }
        if(node.getLess() != null)
        {
            node.getLess().apply(this);
        }
        if(node.getRelationalExpression() != null)
        {
            node.getRelationalExpression().apply(this);
        }
        outALtRelationalExpression(node);
    }

    public void inAGtRelationalExpression(AGtRelationalExpression node)
    {
        defaultIn(node);
    }

    public void outAGtRelationalExpression(AGtRelationalExpression node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAGtRelationalExpression(AGtRelationalExpression node)
    {
        inAGtRelationalExpression(node);
        if(node.getAdditiveExpression() != null)
        {
            node.getAdditiveExpression().apply(this);
        }
        if(node.getGreater() != null)
        {
            node.getGreater().apply(this);
        }
        if(node.getRelationalExpression() != null)
        {
            node.getRelationalExpression().apply(this);
        }
        outAGtRelationalExpression(node);
    }

    public void inALteqRelationalExpression(ALteqRelationalExpression node)
    {
        defaultIn(node);
    }

    public void outALteqRelationalExpression(ALteqRelationalExpression node)
    {
        defaultOut(node);
    }

    @Override
    public void caseALteqRelationalExpression(ALteqRelationalExpression node)
    {
        inALteqRelationalExpression(node);
        if(node.getAdditiveExpression() != null)
        {
            node.getAdditiveExpression().apply(this);
        }
        if(node.getLEqual() != null)
        {
            node.getLEqual().apply(this);
        }
        if(node.getRelationalExpression() != null)
        {
            node.getRelationalExpression().apply(this);
        }
        outALteqRelationalExpression(node);
    }

    public void inAGteqRelationalExpression(AGteqRelationalExpression node)
    {
        defaultIn(node);
    }

    public void outAGteqRelationalExpression(AGteqRelationalExpression node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAGteqRelationalExpression(AGteqRelationalExpression node)
    {
        inAGteqRelationalExpression(node);
        if(node.getAdditiveExpression() != null)
        {
            node.getAdditiveExpression().apply(this);
        }
        if(node.getGEqual() != null)
        {
            node.getGEqual().apply(this);
        }
        if(node.getRelationalExpression() != null)
        {
            node.getRelationalExpression().apply(this);
        }
        outAGteqRelationalExpression(node);
    }

    public void inAMultiplicativeExpressionAdditiveExpression(AMultiplicativeExpressionAdditiveExpression node)
    {
        defaultIn(node);
    }

    public void outAMultiplicativeExpressionAdditiveExpression(AMultiplicativeExpressionAdditiveExpression node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMultiplicativeExpressionAdditiveExpression(AMultiplicativeExpressionAdditiveExpression node)
    {
        inAMultiplicativeExpressionAdditiveExpression(node);
        if(node.getMultiplicativeExpression() != null)
        {
            node.getMultiplicativeExpression().apply(this);
        }
        outAMultiplicativeExpressionAdditiveExpression(node);
    }

    public void inAPlusAdditiveExpression(APlusAdditiveExpression node)
    {
        defaultIn(node);
    }

    public void outAPlusAdditiveExpression(APlusAdditiveExpression node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAPlusAdditiveExpression(APlusAdditiveExpression node)
    {
        inAPlusAdditiveExpression(node);
        if(node.getMultiplicativeExpression() != null)
        {
            node.getMultiplicativeExpression().apply(this);
        }
        if(node.getPlus() != null)
        {
            node.getPlus().apply(this);
        }
        if(node.getAdditiveExpression() != null)
        {
            node.getAdditiveExpression().apply(this);
        }
        outAPlusAdditiveExpression(node);
    }

    public void inAMinusAdditiveExpression(AMinusAdditiveExpression node)
    {
        defaultIn(node);
    }

    public void outAMinusAdditiveExpression(AMinusAdditiveExpression node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMinusAdditiveExpression(AMinusAdditiveExpression node)
    {
        inAMinusAdditiveExpression(node);
        if(node.getMultiplicativeExpression() != null)
        {
            node.getMultiplicativeExpression().apply(this);
        }
        if(node.getMinus() != null)
        {
            node.getMinus().apply(this);
        }
        if(node.getAdditiveExpression() != null)
        {
            node.getAdditiveExpression().apply(this);
        }
        outAMinusAdditiveExpression(node);
    }

    public void inAUnaryExpressionMultiplicativeExpression(AUnaryExpressionMultiplicativeExpression node)
    {
        defaultIn(node);
    }

    public void outAUnaryExpressionMultiplicativeExpression(AUnaryExpressionMultiplicativeExpression node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAUnaryExpressionMultiplicativeExpression(AUnaryExpressionMultiplicativeExpression node)
    {
        inAUnaryExpressionMultiplicativeExpression(node);
        if(node.getUnaryExpression() != null)
        {
            node.getUnaryExpression().apply(this);
        }
        outAUnaryExpressionMultiplicativeExpression(node);
    }

    public void inAStarMultiplicativeExpression(AStarMultiplicativeExpression node)
    {
        defaultIn(node);
    }

    public void outAStarMultiplicativeExpression(AStarMultiplicativeExpression node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAStarMultiplicativeExpression(AStarMultiplicativeExpression node)
    {
        inAStarMultiplicativeExpression(node);
        if(node.getUnaryExpression() != null)
        {
            node.getUnaryExpression().apply(this);
        }
        if(node.getStar() != null)
        {
            node.getStar().apply(this);
        }
        if(node.getMultiplicativeExpression() != null)
        {
            node.getMultiplicativeExpression().apply(this);
        }
        outAStarMultiplicativeExpression(node);
    }

    public void inADivMultiplicativeExpression(ADivMultiplicativeExpression node)
    {
        defaultIn(node);
    }

    public void outADivMultiplicativeExpression(ADivMultiplicativeExpression node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADivMultiplicativeExpression(ADivMultiplicativeExpression node)
    {
        inADivMultiplicativeExpression(node);
        if(node.getUnaryExpression() != null)
        {
            node.getUnaryExpression().apply(this);
        }
        if(node.getBar() != null)
        {
            node.getBar().apply(this);
        }
        if(node.getMultiplicativeExpression() != null)
        {
            node.getMultiplicativeExpression().apply(this);
        }
        outADivMultiplicativeExpression(node);
    }

    public void inAMinusUnaryExpression(AMinusUnaryExpression node)
    {
        defaultIn(node);
    }

    public void outAMinusUnaryExpression(AMinusUnaryExpression node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMinusUnaryExpression(AMinusUnaryExpression node)
    {
        inAMinusUnaryExpression(node);
        if(node.getUnaryExpression() != null)
        {
            node.getUnaryExpression().apply(this);
        }
        if(node.getMinus() != null)
        {
            node.getMinus().apply(this);
        }
        outAMinusUnaryExpression(node);
    }

    public void inAUnaryExpressionNotPlusMinusUnaryExpression(AUnaryExpressionNotPlusMinusUnaryExpression node)
    {
        defaultIn(node);
    }

    public void outAUnaryExpressionNotPlusMinusUnaryExpression(AUnaryExpressionNotPlusMinusUnaryExpression node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAUnaryExpressionNotPlusMinusUnaryExpression(AUnaryExpressionNotPlusMinusUnaryExpression node)
    {
        inAUnaryExpressionNotPlusMinusUnaryExpression(node);
        if(node.getUnaryExpressionNotPlusMinus() != null)
        {
            node.getUnaryExpressionNotPlusMinus().apply(this);
        }
        outAUnaryExpressionNotPlusMinusUnaryExpression(node);
    }

    public void inAPostfixExpressionUnaryExpressionNotPlusMinus(APostfixExpressionUnaryExpressionNotPlusMinus node)
    {
        defaultIn(node);
    }

    public void outAPostfixExpressionUnaryExpressionNotPlusMinus(APostfixExpressionUnaryExpressionNotPlusMinus node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAPostfixExpressionUnaryExpressionNotPlusMinus(APostfixExpressionUnaryExpressionNotPlusMinus node)
    {
        inAPostfixExpressionUnaryExpressionNotPlusMinus(node);
        if(node.getPostfixExpression() != null)
        {
            node.getPostfixExpression().apply(this);
        }
        outAPostfixExpressionUnaryExpressionNotPlusMinus(node);
    }

    public void inAComplementUnaryExpressionNotPlusMinus(AComplementUnaryExpressionNotPlusMinus node)
    {
        defaultIn(node);
    }

    public void outAComplementUnaryExpressionNotPlusMinus(AComplementUnaryExpressionNotPlusMinus node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAComplementUnaryExpressionNotPlusMinus(AComplementUnaryExpressionNotPlusMinus node)
    {
        inAComplementUnaryExpressionNotPlusMinus(node);
        if(node.getUnaryExpression() != null)
        {
            node.getUnaryExpression().apply(this);
        }
        if(node.getNot() != null)
        {
            node.getNot().apply(this);
        }
        outAComplementUnaryExpressionNotPlusMinus(node);
    }

    public void inACastExpressionUnaryExpressionNotPlusMinus(ACastExpressionUnaryExpressionNotPlusMinus node)
    {
        defaultIn(node);
    }

    public void outACastExpressionUnaryExpressionNotPlusMinus(ACastExpressionUnaryExpressionNotPlusMinus node)
    {
        defaultOut(node);
    }

    @Override
    public void caseACastExpressionUnaryExpressionNotPlusMinus(ACastExpressionUnaryExpressionNotPlusMinus node)
    {
        inACastExpressionUnaryExpressionNotPlusMinus(node);
        if(node.getRPar() != null)
        {
            node.getRPar().apply(this);
        }
        if(node.getEqualityExpression() != null)
        {
            node.getEqualityExpression().apply(this);
        }
        if(node.getLPar() != null)
        {
            node.getLPar().apply(this);
        }
        outACastExpressionUnaryExpressionNotPlusMinus(node);
    }

    public void inAValorPostfixExpression(AValorPostfixExpression node)
    {
        defaultIn(node);
    }

    public void outAValorPostfixExpression(AValorPostfixExpression node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAValorPostfixExpression(AValorPostfixExpression node)
    {
        inAValorPostfixExpression(node);
        if(node.getValor() != null)
        {
            node.getValor().apply(this);
        }
        outAValorPostfixExpression(node);
    }

    public void inAVarPostfixExpression(AVarPostfixExpression node)
    {
        defaultIn(node);
    }

    public void outAVarPostfixExpression(AVarPostfixExpression node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVarPostfixExpression(AVarPostfixExpression node)
    {
        inAVarPostfixExpression(node);
        if(node.getVar() != null)
        {
            node.getVar().apply(this);
        }
        outAVarPostfixExpression(node);
    }

    public void inAExpression(AExpression node)
    {
        defaultIn(node);
    }

    public void outAExpression(AExpression node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExpression(AExpression node)
    {
        inAExpression(node);
        if(node.getAssignmentExpression() != null)
        {
            node.getAssignmentExpression().apply(this);
        }
        outAExpression(node);
    }

    public void inAConstantExpression(AConstantExpression node)
    {
        defaultIn(node);
    }

    public void outAConstantExpression(AConstantExpression node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAConstantExpression(AConstantExpression node)
    {
        inAConstantExpression(node);
        if(node.getExpression() != null)
        {
            node.getExpression().apply(this);
        }
        outAConstantExpression(node);
    }

    public void inAEqualityExpressionAndExpression(AEqualityExpressionAndExpression node)
    {
        defaultIn(node);
    }

    public void outAEqualityExpressionAndExpression(AEqualityExpressionAndExpression node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAEqualityExpressionAndExpression(AEqualityExpressionAndExpression node)
    {
        inAEqualityExpressionAndExpression(node);
        if(node.getEqualityExpression() != null)
        {
            node.getEqualityExpression().apply(this);
        }
        outAEqualityExpressionAndExpression(node);
    }

    public void inAAndExpressionAndExpression(AAndExpressionAndExpression node)
    {
        defaultIn(node);
    }

    public void outAAndExpressionAndExpression(AAndExpressionAndExpression node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAndExpressionAndExpression(AAndExpressionAndExpression node)
    {
        inAAndExpressionAndExpression(node);
        if(node.getEqualityExpression() != null)
        {
            node.getEqualityExpression().apply(this);
        }
        if(node.getAnd() != null)
        {
            node.getAnd().apply(this);
        }
        if(node.getAndExpression() != null)
        {
            node.getAndExpression().apply(this);
        }
        outAAndExpressionAndExpression(node);
    }

    public void inAAndExpressionXorExpression(AAndExpressionXorExpression node)
    {
        defaultIn(node);
    }

    public void outAAndExpressionXorExpression(AAndExpressionXorExpression node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAndExpressionXorExpression(AAndExpressionXorExpression node)
    {
        inAAndExpressionXorExpression(node);
        if(node.getAndExpression() != null)
        {
            node.getAndExpression().apply(this);
        }
        outAAndExpressionXorExpression(node);
    }

    public void inAExclusiveOrExpressionXorExpression(AExclusiveOrExpressionXorExpression node)
    {
        defaultIn(node);
    }

    public void outAExclusiveOrExpressionXorExpression(AExclusiveOrExpressionXorExpression node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExclusiveOrExpressionXorExpression(AExclusiveOrExpressionXorExpression node)
    {
        inAExclusiveOrExpressionXorExpression(node);
        if(node.getAndExpression() != null)
        {
            node.getAndExpression().apply(this);
        }
        if(node.getXor() != null)
        {
            node.getXor().apply(this);
        }
        if(node.getXorExpression() != null)
        {
            node.getXorExpression().apply(this);
        }
        outAExclusiveOrExpressionXorExpression(node);
    }

    public void inAExclusiveOrExpressionOrExpression(AExclusiveOrExpressionOrExpression node)
    {
        defaultIn(node);
    }

    public void outAExclusiveOrExpressionOrExpression(AExclusiveOrExpressionOrExpression node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExclusiveOrExpressionOrExpression(AExclusiveOrExpressionOrExpression node)
    {
        inAExclusiveOrExpressionOrExpression(node);
        if(node.getXorExpression() != null)
        {
            node.getXorExpression().apply(this);
        }
        outAExclusiveOrExpressionOrExpression(node);
    }

    public void inAInclusiveOrExpressionOrExpression(AInclusiveOrExpressionOrExpression node)
    {
        defaultIn(node);
    }

    public void outAInclusiveOrExpressionOrExpression(AInclusiveOrExpressionOrExpression node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAInclusiveOrExpressionOrExpression(AInclusiveOrExpressionOrExpression node)
    {
        inAInclusiveOrExpressionOrExpression(node);
        if(node.getXorExpression() != null)
        {
            node.getXorExpression().apply(this);
        }
        if(node.getOr() != null)
        {
            node.getOr().apply(this);
        }
        if(node.getOrExpression() != null)
        {
            node.getOrExpression().apply(this);
        }
        outAInclusiveOrExpressionOrExpression(node);
    }

    public void inAOrExpressionAssignmentExpression(AOrExpressionAssignmentExpression node)
    {
        defaultIn(node);
    }

    public void outAOrExpressionAssignmentExpression(AOrExpressionAssignmentExpression node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAOrExpressionAssignmentExpression(AOrExpressionAssignmentExpression node)
    {
        inAOrExpressionAssignmentExpression(node);
        if(node.getOrExpression() != null)
        {
            node.getOrExpression().apply(this);
        }
        outAOrExpressionAssignmentExpression(node);
    }

    public void inAAssignmentAssignmentExpression(AAssignmentAssignmentExpression node)
    {
        defaultIn(node);
    }

    public void outAAssignmentAssignmentExpression(AAssignmentAssignmentExpression node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAssignmentAssignmentExpression(AAssignmentAssignmentExpression node)
    {
        inAAssignmentAssignmentExpression(node);
        if(node.getAssignment() != null)
        {
            node.getAssignment().apply(this);
        }
        outAAssignmentAssignmentExpression(node);
    }

    public void inAAssignment(AAssignment node)
    {
        defaultIn(node);
    }

    public void outAAssignment(AAssignment node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAssignment(AAssignment node)
    {
        inAAssignment(node);
        if(node.getAssignmentExpression() != null)
        {
            node.getAssignmentExpression().apply(this);
        }
        if(node.getLArrow() != null)
        {
            node.getLArrow().apply(this);
        }
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        outAAssignment(node);
    }
}
