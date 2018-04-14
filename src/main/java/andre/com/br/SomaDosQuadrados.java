package andre.com.br;

import java.util.Arrays;
import java.util.List;

public class SomaDosQuadrados {

	public static void main(String[] args) {

		// Escreva um m�todo que recebe um conjunto de inteiros positivos e retorna a
		// soma do quadrado dos n�meros que s�o n�meros primos.

		List<Integer> numerosInteiros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47,
				53, 59, 61, 67, 71, 73, 79, 83, 89, 97);

		int somaPrimos = soma(numerosInteiros);
		int quadradoPrimo = somaPrimos * somaPrimos;
		System.out.println("Valor somado dos n�meros primos ao quadrado: " + quadradoPrimo);
	}

	private static int soma(List<Integer> numerosInteiros) {
		return numerosInteiros.stream()
							  .filter(c -> c.intValue() % 2 != 0)
							  .mapToInt(c -> c.intValue())
							  .sum();
	}
}
