# SIN5022_testes_software
Repository for SIN5022 exercises.

### Análise de Classes de Equivalência
| Entrada                        | Classes Válidas   | Classes Inválidas     |
|--------------------------------|-------------------|-----------------------|
|Dominio (I, V, X, L, C, D, M)   | o mesmo dominio   |Qualquer coisa fora do dominio (C1) |
|Combinacao N entradas           |Entradas compostas |Entradas compostas falha  (C2) |
|Combinacao de N com subtração   |Entradas compostas |  (C3) |

### Casos de teste: Classes de Equivalência
| ID | Entrada | Oráculo            | Classe de Equivalência |
|----|---------|--------------------|------------------------|
|1   | I       | 1                  |  (C1)                  |
|2   | V       | 5                  |  (C1)                  |
|3   | X       | 10                 |  (C1)                  |
|4   | L       | 50                 |  (C1)                  |
|5   | C       | 100                |  (C1)                  |
|6   | D       | 500                |  (C1)                  |
|7   | M       | 1000               |  (C1)                  |
|8   | Z       | ERRO               |  (C1)                  |
|9   | II      | 2                  |  (C2)                  |
|10  | III     | 3                  |  (C2)                  |
|11  | IV      | 4                  |  (C3)                  |
|12  | VI      | 6                  |  (C2)                  |
|13  | VII     | 7                  |  (C2)                  |
|14  | VIII    | 8                  |  (C2)                  |
|15  | IX      | 9                  |  (C3)                  |
|   |   |   |   |


### Análise de Valor Limite
| Entrada | Classes Válidas | Classes Inválidas     |
|---------|-----------------|-----------------------|


### Casos de teste: Valor limite
| ID | Entrada | Oráculo            | Valor-limite |
|----|---------|--------------------|--------------|

* A especificação não fala dos problemas de repetição dos 3 caracteres consecutivos e de havar mais de uma maneira de escrever os mesmos numeros se forem grandes. Estou supondo aqui que por se tratar de testes funcionais que respeitarei estritamente a especificação. (“IIII”=>”IV”, “VIIII”=>”IX”, “XXXX”=>”XL”, “LXXXX”=>”XC”, “CCCC”=>”CD”, “DCCCC”=>”CM”)
* Porém como em tese eu não deverai saber como foi implementado colaquei alguns testes validos e invalidos adicionais.
