# TiraTeima
Implementação simples de uma solução para o problema proposto : Dado uma matriz, calcule a diferença entre a soma de suas diagonais.
## Build

Certifique-se que o JDK 8   está corretamente instalado, configurado e funcionando em sua máquina.
Certifique-se que o Maven 3 está corretamente instalado, configurado e funcionando em sua máquina.

Clone ou faça o download do repositório.

## Execução

Basta executar os comandos abaixo para ver o resultado a partir do console da classe JUnit de teste.

```
mvn clean
mvn test
```
## Dados de entrada

Matriz = {
{1, 5, 3, 2},
{4, 8, -5, 6},
{7, 3, 4, 5},
{2, 5, 9, -9} 

## Saída

```
-------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running br.com.questao.MatrixTest
Executa antes de cada teste
A Soma Diagonal Principal  é 4.
A Soma Diagonal Secundaria é 2.
A Difereça da Soma das Diagonais é 2.
Executa depois de cada teste
Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.118 sec

Results :

Tests run: 1, Failures: 0, Errors: 0, Skipped: 0

[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 9.113 s
[INFO] Finished at: 2018-03-17T16:55:05-03:00
[INFO] Final Memory: 12M/29M
[INFO] ------------------------------------------------------------------------

```
