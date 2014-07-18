Compilador_Arthur.Rocha_Italo.Lessa
===================================

Alias e funções utilizadas para facilitar a atualização do arquivos do sablecc.

Remove todos os diretórios do sablecc, a partir do src:

alias remove_sablecc_dirs="rm -rf portugol/analysis portugol/lexer portugol/node portugol/parser"

Alias para executar o sablecc: 

SABLECCDIR=\< path to your sablecc \>

alias sablecc='java -jar '$SABLECCDIR'/lib/sablecc.jar'

Compila e executa o compilador, a partir do src:

function execute_compiler(){

  javac portugol/Compiler.java
  
  java portugol.Compiler
  
}

Para compilar uma arquivo de código fonte :

execute_compiler \< \< código_fonte.txt \>
