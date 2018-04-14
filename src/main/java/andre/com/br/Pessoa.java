package andre.com.br;

import java.text.Normalizer;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Pessoa {

	private String nome;

	public Pessoa() {
		// TODO Auto-generated constructor stub
	}

	public Pessoa(String nome) {
		this.nome = deAccent(nome.toUpperCase(new Locale("pt", "BR")));
	}

	public String getNome() {
		return nome;
	}

	@Override
	public String toString() {
		return "Pessoa [" + (nome != null ? "nome=" + nome : "") + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	private static String deAccent(String str) {
		String nfdNormalizedString = Normalizer.normalize(str, Normalizer.Form.NFD);
		Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
		return pattern.matcher(nfdNormalizedString).replaceAll("");
	}

	public void imprimir(List<Pessoa> pessoas) {
		Map<String, Long> collect = pessoas.stream()
				
				.collect(Collectors.groupingBy(Pessoa::getNome, Collectors.counting()));
		
		
		System.out.println(collect);
	

	}

}
