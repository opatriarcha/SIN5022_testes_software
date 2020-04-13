
Para instalar a dependência CoffeeMakerTest no maven local:
mvn install:install-file -Dfile=/home/orlando/Desktop/SIN5022-Testes-De-Software/repository/SIN5022_testes_software/CoffeeMakerTest/lib/CoffeeMaker.jar -DgroupId=each.usp.ach2006.adaptedfromcsc326.eler -DartifactId=coffeeMaker -Dversion=1.0 -Dpackaging=jar

# SIN5022_testes_software
Repository for SIN5022 exercises.

## Exercício CoffeeMaker

### Análise de Classes de Equivalência
| Entrada                        | Classes Válidas        | Classes Inválidas     |
|--------------------------------|------------------------|-----------------------|
|Dominio (I, V, X, L, C, D, M)   | o mesmo dominio (C1)   |Qualquer coisa fora do dominio (C2) |
|Combinacao N entradas           |Entradas compostas (C3) |Entradas compostas falha  (C4) |
|Combinacao de N com subtração   |Entradas compostas (C5)|  (C6) |

### Casos de teste: Classes de Equivalência
| ID | Entrada | Oráculo            | Classe de Equivalência |
|----|---------|--------------------|------------------------|
|1   | I       | 1                  |  C1                  |
|2   | V       | 5                  |  C1                  |
|3   | X       | 10                 |  C1                  |
|4   | L       | 50                 |  C1                  |
|5   | C       | 100                |  C1                  |
|6   | D       | 500                |  C1                  |
|7   | M       | 1000               |  C1                  |
|8   | Z       | ERRO               |  C1                  |
|9   | II      | 2                  |  C1, C3              |
|10  | III     | 3                  |  C1, C3              |
|11  | IV      | 4                  |  C1, C5              |
|12  | VI      | 6                  |  C1, C3              |
|13  | VII     | 7                  |  C1, C3              |
|14  | VIII    | 8                  |  C1, C3              |
|15  | IX      | 9                  |  C1, C5              |
|16  | XXXX    |ERRO                |  C6                  |
|17  | IIII    |ERRO                |  C6                  |
|18  | VIIII   |ERRO                |  C6                  |
|19  | LXXXX   |ERRO                |  C6                  |
|20  | CCCC    |ERRO                |  C6                  |
|21  | DCCCC   |ERRO                |  C6                  |


### Análise de Valor Limite
| Entrada                     |  Classes Válidas | Classes Inválidas     |
|-----------------------------|-----------------|-----------------------|
|Dominio (I, V, X, L, C, D, M)|   O DOMINIO (V1)| qualquer algarismo fora do dominio  |


### Casos de teste: Valor limite
| ID | Entrada   | Oráculo            | Valor-limite |
|----|-----------|--------------------|--------------|
|22  |" X"       |ERRO                |  V1          |
|23  | B         |ERRO                |  V1          |
|24  | vazia     |ERRO                |  V1          |
|25  |" "(espaço)|ERRO                |  V1          |
