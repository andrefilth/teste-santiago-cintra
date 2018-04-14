package andre.com.br;

import java.util.Arrays;
import java.util.List;

public class PessoasTest {

	public static void main(String[] args) {

		Pessoa pessoa1 = new Pessoa("Pedro");
		Pessoa pessoa2 = new Pessoa("João");
		Pessoa pessoa3 = new Pessoa("Maria");
		Pessoa pessoa4 = new Pessoa("JOAO");
		Pessoa pessoa5 = new Pessoa("Alberto");
		Pessoa pessoa6 = new Pessoa("João");
		Pessoa pessoa7 = new Pessoa("MARiA");
		Pessoa agrupar = new Pessoa(); 
		List<Pessoa> pessoas = Arrays.asList(pessoa1, pessoa2, pessoa3, pessoa4, pessoa5, pessoa6, pessoa7);

		agrupar.imprimir(pessoas);
		
	}
}
