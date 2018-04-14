package andre.com.br;

public class Sequencia {

	private int numero;

	public Sequencia(int numero) {
		this.numero = numero;
	}

	public int calculo(int numero) {
		if (numero < 2) {
			return numero;
		} else {
			return calculo(numero - 1) + calculo(numero - 2);
		}
	}

	public void imprime() {
		int minimo = 0;
		for (int i = 1; minimo < this.numero; i++) {
			minimo = calculo(i);
			System.out.println(minimo);
		}
	}
}
