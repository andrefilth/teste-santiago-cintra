# teste-santiago-cintra
Teste realizado para processo seletivo.

1. Escreva uma classe chamada ComplexNumber para representar números complexos. Números complexos
possuem a estrutura z = x + y*i (onde x é a parte real e y é a parte imaginária).
a. O construtor padrão deve inicializar as partes real e imaginária com zero. Deve haver outro
construtor, que possibilite passar os valores como parâmetro.
b. Escreva um método de instância que some o número complexo passado como parâmetro, dado que
a soma de números complexos é definida da seguinte maneira: (a + bi) + (c + di) = (a + c) + (b + d)i.
c. Escreva um método de classe que some dois números complexos passados como parâmetro e
retorne um terceiro número complexo.

R: Foi criado a classe ComplexNumber contendo métodos para calcular a soma de dois números complexos..

2. Dada a seguinte série: 0, 1, 3, 6, 10, 15, 21, ... Escreva um método que calcule o n-ésimo elemento da série.
R: Foi criado a classe Sequencia contendo método de fibonacci

3. Escreva um método que recebe uma lista de strings como parâmetro. Essa lista possui uma série de nomes
próprios, podendo conter nomes repetidos. O método deve retornar um objeto com o número de
ocorrências por nome, com a contagem seguindo a ordem alfabética dos nomes. A contagem de ocorrências
por nome deve ser case-insensitive e deve ignorar acentuação (“João” e “jOao” são considerados como
sendo o mesmo nome).

R: foi criado a classe Pessoa para realizar operações de retirada de acento e contagem de nomes iguais ou parecido.

4. Escreva um método que recebe um conjunto de inteiros positivos e retorna a soma do quadrado dos
números que são números primos.
	R: A classe SomaDosQuadrados contém a solução do problema
	
5. Considere a seguinte afirmação: "Favoreça a composição sobre a hierarquia".
	a. Você concorda com essa afirmação? Justifique.
	R: Sim, quando você favorece a herança o seu código fica altamente acoplado, ou seja, qualquer mudança na classe pai reflete o comportamento da classe filha. 
	   A compisição você favorece o baixo acoplamento, já que cada filha que extende a classe terá que realizar a sua própria implementação.
	b. Quando é melhor utilizar a composição e quando é melhor utilizar a hierarquia?
    R: Composição. Quando os comportamentos da classe mãe não devem interferir no comportamento das filhas. Hierarquia evite usar sempre.
    
 6. Crie um diagrama de sequência para o site cinema-facil.com.br dadas as seguintes definições:
 R: Anexa ao e-mail.
 
 7. Crie um modelo de banco de dados para o sistema do exercício anterior.
 R: Anexa ao e-mail.

