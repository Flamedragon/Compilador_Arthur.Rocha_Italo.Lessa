package portugol;

import portugol.analysis.*;
import portugol.node.*;

public class Translation extends DepthFirstAdapter
{

	@Override
	public void inStart(Start node) {
		// TODO Auto-generated method stub
		super.inStart(node);
	}

	@Override
	public void outStart(Start node) {
		// TODO Auto-generated method stub
		super.outStart(node);
	}

	@Override
	public void defaultIn(Node node) {
		// TODO Auto-generated method stub
		System.out.println(node);
		super.defaultIn(node);
	}

	@Override
	public void defaultOut(Node node) {
		// TODO Auto-generated method stub
		super.defaultOut(node);
	}

	@Override
	public void caseStart(Start node) {
		// TODO Auto-generated method stub
		super.caseStart(node);
	}

	@Override
	public void inAPrograma(APrograma node) {
		// TODO Auto-generated method stub
		super.inAPrograma(node);
	}

	@Override
	public void outAPrograma(APrograma node) {
		// TODO Auto-generated method stub
		super.outAPrograma(node);
	}

	@Override
	public void caseAPrograma(APrograma node) {
		// TODO Auto-generated method stub
		super.caseAPrograma(node);
	}

	@Override
	public void inAIdVar(AIdVar node) {
		// TODO Auto-generated method stub
		super.inAIdVar(node);
	}

	@Override
	public void outAIdVar(AIdVar node) {
		// TODO Auto-generated method stub
		super.outAIdVar(node);
	}

	@Override
	public void caseAIdVar(AIdVar node) {
		// TODO Auto-generated method stub
		super.caseAIdVar(node);
	}

	@Override
	public void inAIdArrayVar(AIdArrayVar node) {
		// TODO Auto-generated method stub
		super.inAIdArrayVar(node);
	}

	@Override
	public void outAIdArrayVar(AIdArrayVar node) {
		// TODO Auto-generated method stub
		super.outAIdArrayVar(node);
	}

	@Override
	public void caseAIdArrayVar(AIdArrayVar node) {
		// TODO Auto-generated method stub
		super.caseAIdArrayVar(node);
	}

	@Override
	public void inAStringValor(AStringValor node) {
		// TODO Auto-generated method stub
		super.inAStringValor(node);
	}

	@Override
	public void outAStringValor(AStringValor node) {
		// TODO Auto-generated method stub
		super.outAStringValor(node);
	}

	@Override
	public void caseAStringValor(AStringValor node) {
		// TODO Auto-generated method stub
		super.caseAStringValor(node);
	}

	@Override
	public void inANIntValor(ANIntValor node) {
		// TODO Auto-generated method stub
		super.inANIntValor(node);
	}

	@Override
	public void outANIntValor(ANIntValor node) {
		// TODO Auto-generated method stub
		super.outANIntValor(node);
	}

	@Override
	public void caseANIntValor(ANIntValor node) {
		// TODO Auto-generated method stub
		super.caseANIntValor(node);
	}

	@Override
	public void inANRealValor(ANRealValor node) {
		// TODO Auto-generated method stub
		super.inANRealValor(node);
	}

	@Override
	public void outANRealValor(ANRealValor node) {
		// TODO Auto-generated method stub
		super.outANRealValor(node);
	}

	@Override
	public void caseANRealValor(ANRealValor node) {
		// TODO Auto-generated method stub
		super.caseANRealValor(node);
	}

	@Override
	public void inARealTipo(ARealTipo node) {
		// TODO Auto-generated method stub
		super.inARealTipo(node);
	}

	@Override
	public void outARealTipo(ARealTipo node) {
		// TODO Auto-generated method stub
		super.outARealTipo(node);
	}

	@Override
	public void caseARealTipo(ARealTipo node) {
		// TODO Auto-generated method stub
		super.caseARealTipo(node);
	}

	@Override
	public void inAIntegerTipo(AIntegerTipo node) {
		// TODO Auto-generated method stub
		super.inAIntegerTipo(node);
	}

	@Override
	public void outAIntegerTipo(AIntegerTipo node) {
		// TODO Auto-generated method stub
		super.outAIntegerTipo(node);
	}

	@Override
	public void caseAIntegerTipo(AIntegerTipo node) {
		// TODO Auto-generated method stub
		super.caseAIntegerTipo(node);
	}

	@Override
	public void inACharTipo(ACharTipo node) {
		// TODO Auto-generated method stub
		super.inACharTipo(node);
	}

	@Override
	public void outACharTipo(ACharTipo node) {
		// TODO Auto-generated method stub
		super.outACharTipo(node);
	}

	@Override
	public void caseACharTipo(ACharTipo node) {
		// TODO Auto-generated method stub
		super.caseACharTipo(node);
	}

	@Override
	public void inAVariableDeclaracao(AVariableDeclaracao node) {
		// TODO Auto-generated method stub
		super.inAVariableDeclaracao(node);
	}

	@Override
	public void outAVariableDeclaracao(AVariableDeclaracao node) {
		// TODO Auto-generated method stub
		super.outAVariableDeclaracao(node);
	}

	@Override
	public void caseAVariableDeclaracao(AVariableDeclaracao node) {
		// TODO Auto-generated method stub
		super.caseAVariableDeclaracao(node);
	}

	@Override
	public void inAConstDeclaracao(AConstDeclaracao node) {
		// TODO Auto-generated method stub
		super.inAConstDeclaracao(node);
	}

	@Override
	public void outAConstDeclaracao(AConstDeclaracao node) {
		// TODO Auto-generated method stub
		super.outAConstDeclaracao(node);
	}

	@Override
	public void caseAConstDeclaracao(AConstDeclaracao node) {
		// TODO Auto-generated method stub
		super.caseAConstDeclaracao(node);
	}

	@Override
	public void inAVarSemicolon(AVarSemicolon node) {
		// TODO Auto-generated method stub
		super.inAVarSemicolon(node);
	}

	@Override
	public void outAVarSemicolon(AVarSemicolon node) {
		// TODO Auto-generated method stub
		super.outAVarSemicolon(node);
	}

	@Override
	public void caseAVarSemicolon(AVarSemicolon node) {
		// TODO Auto-generated method stub
		super.caseAVarSemicolon(node);
	}

	@Override
	public void inASemicolonVar(ASemicolonVar node) {
		// TODO Auto-generated method stub
		super.inASemicolonVar(node);
	}

	@Override
	public void outASemicolonVar(ASemicolonVar node) {
		// TODO Auto-generated method stub
		super.outASemicolonVar(node);
	}

	@Override
	public void caseASemicolonVar(ASemicolonVar node) {
		// TODO Auto-generated method stub
		super.caseASemicolonVar(node);
	}

	@Override
	public void inAAssignmentComando(AAssignmentComando node) {
		// TODO Auto-generated method stub
		super.inAAssignmentComando(node);
	}

	@Override
	public void outAAssignmentComando(AAssignmentComando node) {
		// TODO Auto-generated method stub
		super.outAAssignmentComando(node);
	}

	@Override
	public void caseAAssignmentComando(AAssignmentComando node) {
		// TODO Auto-generated method stub
		super.caseAAssignmentComando(node);
	}

	@Override
	public void inAReadComando(AReadComando node) {
		// TODO Auto-generated method stub
		super.inAReadComando(node);
	}

	@Override
	public void outAReadComando(AReadComando node) {
		// TODO Auto-generated method stub
		super.outAReadComando(node);
	}

	@Override
	public void caseAReadComando(AReadComando node) {
		// TODO Auto-generated method stub
		super.caseAReadComando(node);
	}

	@Override
	public void inAWriteComando(AWriteComando node) {
		// TODO Auto-generated method stub
		super.inAWriteComando(node);
	}

	@Override
	public void outAWriteComando(AWriteComando node) {
		// TODO Auto-generated method stub
		super.outAWriteComando(node);
	}

	@Override
	public void caseAWriteComando(AWriteComando node) {
		// TODO Auto-generated method stub
		super.caseAWriteComando(node);
	}

	@Override
	public void inAIfComando(AIfComando node) {
		// TODO Auto-generated method stub
		super.inAIfComando(node);
	}

	@Override
	public void outAIfComando(AIfComando node) {
		// TODO Auto-generated method stub
		super.outAIfComando(node);
	}

	@Override
	public void caseAIfComando(AIfComando node) {
		// TODO Auto-generated method stub
		super.caseAIfComando(node);
	}

	@Override
	public void inAEvaluateComando(AEvaluateComando node) {
		// TODO Auto-generated method stub
		super.inAEvaluateComando(node);
	}

	@Override
	public void outAEvaluateComando(AEvaluateComando node) {
		// TODO Auto-generated method stub
		super.outAEvaluateComando(node);
	}

	@Override
	public void caseAEvaluateComando(AEvaluateComando node) {
		// TODO Auto-generated method stub
		super.caseAEvaluateComando(node);
	}

	@Override
	public void inAWhileComando(AWhileComando node) {
		// TODO Auto-generated method stub
		super.inAWhileComando(node);
	}

	@Override
	public void outAWhileComando(AWhileComando node) {
		// TODO Auto-generated method stub
		super.outAWhileComando(node);
	}

	@Override
	public void caseAWhileComando(AWhileComando node) {
		// TODO Auto-generated method stub
		super.caseAWhileComando(node);
	}

	@Override
	public void inARepeatComando(ARepeatComando node) {
		// TODO Auto-generated method stub
		super.inARepeatComando(node);
	}

	@Override
	public void outARepeatComando(ARepeatComando node) {
		// TODO Auto-generated method stub
		super.outARepeatComando(node);
	}

	@Override
	public void caseARepeatComando(ARepeatComando node) {
		// TODO Auto-generated method stub
		super.caseARepeatComando(node);
	}

	@Override
	public void inAForComando(AForComando node) {
		// TODO Auto-generated method stub
		super.inAForComando(node);
	}

	@Override
	public void outAForComando(AForComando node) {
		// TODO Auto-generated method stub
		super.outAForComando(node);
	}

	@Override
	public void caseAForComando(AForComando node) {
		// TODO Auto-generated method stub
		super.caseAForComando(node);
	}

	@Override
	public void inAForStepComando(AForStepComando node) {
		// TODO Auto-generated method stub
		super.inAForStepComando(node);
	}

	@Override
	public void outAForStepComando(AForStepComando node) {
		// TODO Auto-generated method stub
		super.outAForStepComando(node);
	}

	@Override
	public void caseAForStepComando(AForStepComando node) {
		// TODO Auto-generated method stub
		super.caseAForStepComando(node);
	}

	@Override
	public void inAElseStatement(AElseStatement node) {
		// TODO Auto-generated method stub
		super.inAElseStatement(node);
	}

	@Override
	public void outAElseStatement(AElseStatement node) {
		// TODO Auto-generated method stub
		super.outAElseStatement(node);
	}

	@Override
	public void caseAElseStatement(AElseStatement node) {
		// TODO Auto-generated method stub
		super.caseAElseStatement(node);
	}

	@Override
	public void inAEvaluateBody(AEvaluateBody node) {
		// TODO Auto-generated method stub
		super.inAEvaluateBody(node);
	}

	@Override
	public void outAEvaluateBody(AEvaluateBody node) {
		// TODO Auto-generated method stub
		super.outAEvaluateBody(node);
	}

	@Override
	public void caseAEvaluateBody(AEvaluateBody node) {
		// TODO Auto-generated method stub
		super.caseAEvaluateBody(node);
	}

	@Override
	public void inAElseEvaluate(AElseEvaluate node) {
		// TODO Auto-generated method stub
		super.inAElseEvaluate(node);
	}

	@Override
	public void outAElseEvaluate(AElseEvaluate node) {
		// TODO Auto-generated method stub
		super.outAElseEvaluate(node);
	}

	@Override
	public void caseAElseEvaluate(AElseEvaluate node) {
		// TODO Auto-generated method stub
		super.caseAElseEvaluate(node);
	}

	@Override
	public void inACommaVar(ACommaVar node) {
		// TODO Auto-generated method stub
		super.inACommaVar(node);
	}

	@Override
	public void outACommaVar(ACommaVar node) {
		// TODO Auto-generated method stub
		super.outACommaVar(node);
	}

	@Override
	public void caseACommaVar(ACommaVar node) {
		// TODO Auto-generated method stub
		super.caseACommaVar(node);
	}

	@Override
	public void inACommaExp(ACommaExp node) {
		// TODO Auto-generated method stub
		super.inACommaExp(node);
	}

	@Override
	public void outACommaExp(ACommaExp node) {
		// TODO Auto-generated method stub
		super.outACommaExp(node);
	}

	@Override
	public void caseACommaExp(ACommaExp node) {
		// TODO Auto-generated method stub
		super.caseACommaExp(node);
	}

	@Override
	public void inAComandoSemicolon(AComandoSemicolon node) {
		// TODO Auto-generated method stub
		super.inAComandoSemicolon(node);
	}

	@Override
	public void outAComandoSemicolon(AComandoSemicolon node) {
		// TODO Auto-generated method stub
		super.outAComandoSemicolon(node);
	}

	@Override
	public void caseAComandoSemicolon(AComandoSemicolon node) {
		// TODO Auto-generated method stub
		super.caseAComandoSemicolon(node);
	}

	@Override
	public void inAMinusExp1(AMinusExp1 node) {
		// TODO Auto-generated method stub
		super.inAMinusExp1(node);
	}

	@Override
	public void outAMinusExp1(AMinusExp1 node) {
		// TODO Auto-generated method stub
		super.outAMinusExp1(node);
	}

	@Override
	public void caseAMinusExp1(AMinusExp1 node) {
		// TODO Auto-generated method stub
		super.caseAMinusExp1(node);
	}

	@Override
	public void inAExp2Exp1(AExp2Exp1 node) {
		// TODO Auto-generated method stub
		super.inAExp2Exp1(node);
	}

	@Override
	public void outAExp2Exp1(AExp2Exp1 node) {
		// TODO Auto-generated method stub
		super.outAExp2Exp1(node);
	}

	@Override
	public void caseAExp2Exp1(AExp2Exp1 node) {
		// TODO Auto-generated method stub
		super.caseAExp2Exp1(node);
	}

	@Override
	public void inASomaExp2(ASomaExp2 node) {
		// TODO Auto-generated method stub
		super.inASomaExp2(node);
	}

	@Override
	public void outASomaExp2(ASomaExp2 node) {
		// TODO Auto-generated method stub
		super.outASomaExp2(node);
	}

	@Override
	public void caseASomaExp2(ASomaExp2 node) {
		// TODO Auto-generated method stub
		super.caseASomaExp2(node);
	}

	@Override
	public void inAComparacaoExp2(AComparacaoExp2 node) {
		// TODO Auto-generated method stub
		super.inAComparacaoExp2(node);
	}

	@Override
	public void outAComparacaoExp2(AComparacaoExp2 node) {
		// TODO Auto-generated method stub
		super.outAComparacaoExp2(node);
	}

	@Override
	public void caseAComparacaoExp2(AComparacaoExp2 node) {
		// TODO Auto-generated method stub
		super.caseAComparacaoExp2(node);
	}

	@Override
	public void inAExp3Exp2(AExp3Exp2 node) {
		// TODO Auto-generated method stub
		super.inAExp3Exp2(node);
	}

	@Override
	public void outAExp3Exp2(AExp3Exp2 node) {
		// TODO Auto-generated method stub
		super.outAExp3Exp2(node);
	}

	@Override
	public void caseAExp3Exp2(AExp3Exp2 node) {
		// TODO Auto-generated method stub
		super.caseAExp3Exp2(node);
	}

	@Override
	public void inAMaisSoma(AMaisSoma node) {
		// TODO Auto-generated method stub
		super.inAMaisSoma(node);
	}

	@Override
	public void outAMaisSoma(AMaisSoma node) {
		// TODO Auto-generated method stub
		super.outAMaisSoma(node);
	}

	@Override
	public void caseAMaisSoma(AMaisSoma node) {
		// TODO Auto-generated method stub
		super.caseAMaisSoma(node);
	}

	@Override
	public void inAMenosSoma(AMenosSoma node) {
		// TODO Auto-generated method stub
		super.inAMenosSoma(node);
	}

	@Override
	public void outAMenosSoma(AMenosSoma node) {
		// TODO Auto-generated method stub
		super.outAMenosSoma(node);
	}

	@Override
	public void caseAMenosSoma(AMenosSoma node) {
		// TODO Auto-generated method stub
		super.caseAMenosSoma(node);
	}

	@Override
	public void inAIgualComparacao(AIgualComparacao node) {
		// TODO Auto-generated method stub
		super.inAIgualComparacao(node);
	}

	@Override
	public void outAIgualComparacao(AIgualComparacao node) {
		// TODO Auto-generated method stub
		super.outAIgualComparacao(node);
	}

	@Override
	public void caseAIgualComparacao(AIgualComparacao node) {
		// TODO Auto-generated method stub
		super.caseAIgualComparacao(node);
	}

	@Override
	public void inADiferenteComparacao(ADiferenteComparacao node) {
		// TODO Auto-generated method stub
		super.inADiferenteComparacao(node);
	}

	@Override
	public void outADiferenteComparacao(ADiferenteComparacao node) {
		// TODO Auto-generated method stub
		super.outADiferenteComparacao(node);
	}

	@Override
	public void caseADiferenteComparacao(ADiferenteComparacao node) {
		// TODO Auto-generated method stub
		super.caseADiferenteComparacao(node);
	}

	@Override
	public void inAMenorIgualComparacao(AMenorIgualComparacao node) {
		// TODO Auto-generated method stub
		super.inAMenorIgualComparacao(node);
	}

	@Override
	public void outAMenorIgualComparacao(AMenorIgualComparacao node) {
		// TODO Auto-generated method stub
		super.outAMenorIgualComparacao(node);
	}

	@Override
	public void caseAMenorIgualComparacao(AMenorIgualComparacao node) {
		// TODO Auto-generated method stub
		super.caseAMenorIgualComparacao(node);
	}

	@Override
	public void inAMaiorIgualComparacao(AMaiorIgualComparacao node) {
		// TODO Auto-generated method stub
		super.inAMaiorIgualComparacao(node);
	}

	@Override
	public void outAMaiorIgualComparacao(AMaiorIgualComparacao node) {
		// TODO Auto-generated method stub
		super.outAMaiorIgualComparacao(node);
	}

	@Override
	public void caseAMaiorIgualComparacao(AMaiorIgualComparacao node) {
		// TODO Auto-generated method stub
		super.caseAMaiorIgualComparacao(node);
	}

	@Override
	public void inAMenorComparacao(AMenorComparacao node) {
		// TODO Auto-generated method stub
		super.inAMenorComparacao(node);
	}

	@Override
	public void outAMenorComparacao(AMenorComparacao node) {
		// TODO Auto-generated method stub
		super.outAMenorComparacao(node);
	}

	@Override
	public void caseAMenorComparacao(AMenorComparacao node) {
		// TODO Auto-generated method stub
		super.caseAMenorComparacao(node);
	}

	@Override
	public void inAMaiorComparacao(AMaiorComparacao node) {
		// TODO Auto-generated method stub
		super.inAMaiorComparacao(node);
	}

	@Override
	public void outAMaiorComparacao(AMaiorComparacao node) {
		// TODO Auto-generated method stub
		super.outAMaiorComparacao(node);
	}

	@Override
	public void caseAMaiorComparacao(AMaiorComparacao node) {
		// TODO Auto-generated method stub
		super.caseAMaiorComparacao(node);
	}

	@Override
	public void inAMultDivExp3(AMultDivExp3 node) {
		// TODO Auto-generated method stub
		super.inAMultDivExp3(node);
	}

	@Override
	public void outAMultDivExp3(AMultDivExp3 node) {
		// TODO Auto-generated method stub
		super.outAMultDivExp3(node);
	}

	@Override
	public void caseAMultDivExp3(AMultDivExp3 node) {
		// TODO Auto-generated method stub
		super.caseAMultDivExp3(node);
	}

	@Override
	public void inAExp4Exp3(AExp4Exp3 node) {
		// TODO Auto-generated method stub
		super.inAExp4Exp3(node);
	}

	@Override
	public void outAExp4Exp3(AExp4Exp3 node) {
		// TODO Auto-generated method stub
		super.outAExp4Exp3(node);
	}

	@Override
	public void caseAExp4Exp3(AExp4Exp3 node) {
		// TODO Auto-generated method stub
		super.caseAExp4Exp3(node);
	}

	@Override
	public void inAMultMultDiv(AMultMultDiv node) {
		// TODO Auto-generated method stub
		super.inAMultMultDiv(node);
	}

	@Override
	public void outAMultMultDiv(AMultMultDiv node) {
		// TODO Auto-generated method stub
		super.outAMultMultDiv(node);
	}

	@Override
	public void caseAMultMultDiv(AMultMultDiv node) {
		// TODO Auto-generated method stub
		super.caseAMultMultDiv(node);
	}

	@Override
	public void inADivMultDiv(ADivMultDiv node) {
		// TODO Auto-generated method stub
		super.inADivMultDiv(node);
	}

	@Override
	public void outADivMultDiv(ADivMultDiv node) {
		// TODO Auto-generated method stub
		super.outADivMultDiv(node);
	}

	@Override
	public void caseADivMultDiv(ADivMultDiv node) {
		// TODO Auto-generated method stub
		super.caseADivMultDiv(node);
	}

	@Override
	public void inAParentesesExpExp4(AParentesesExpExp4 node) {
		// TODO Auto-generated method stub
		super.inAParentesesExpExp4(node);
	}

	@Override
	public void outAParentesesExpExp4(AParentesesExpExp4 node) {
		// TODO Auto-generated method stub
		super.outAParentesesExpExp4(node);
	}

	@Override
	public void caseAParentesesExpExp4(AParentesesExpExp4 node) {
		// TODO Auto-generated method stub
		super.caseAParentesesExpExp4(node);
	}

	@Override
	public void inAVarExp4(AVarExp4 node) {
		// TODO Auto-generated method stub
		super.inAVarExp4(node);
	}

	@Override
	public void outAVarExp4(AVarExp4 node) {
		// TODO Auto-generated method stub
		super.outAVarExp4(node);
	}

	@Override
	public void caseAVarExp4(AVarExp4 node) {
		// TODO Auto-generated method stub
		super.caseAVarExp4(node);
	}

	@Override
	public void inAValorExp4(AValorExp4 node) {
		// TODO Auto-generated method stub
		super.inAValorExp4(node);
	}

	@Override
	public void outAValorExp4(AValorExp4 node) {
		// TODO Auto-generated method stub
		super.outAValorExp4(node);
	}

	@Override
	public void caseAValorExp4(AValorExp4 node) {
		// TODO Auto-generated method stub
		super.caseAValorExp4(node);
	}

	@Override
	public void inAExpLogica1(AExpLogica1 node) {
		// TODO Auto-generated method stub
		super.inAExpLogica1(node);
	}

	@Override
	public void outAExpLogica1(AExpLogica1 node) {
		// TODO Auto-generated method stub
		super.outAExpLogica1(node);
	}

	@Override
	public void caseAExpLogica1(AExpLogica1 node) {
		// TODO Auto-generated method stub
		super.caseAExpLogica1(node);
	}
	


}
