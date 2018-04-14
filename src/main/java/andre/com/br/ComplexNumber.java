package andre.com.br;

public class ComplexNumber {

	private double real;
	private double imaginaria;

	public ComplexNumber() {
		this(0.0, 0.0);
	}

	public ComplexNumber(double real, double imaginaria) {
		this.real = real;
		this.imaginaria = imaginaria;
	}

	public ComplexNumber somaNumerosComplexos(ComplexNumber novoReal, ComplexNumber novoImaginario) {
		return new ComplexNumber (novoReal.real + novoImaginario.real, novoReal.imaginaria + novoImaginario.imaginaria);
	}

	@Override
	public String toString() {
		return "ComplexNumber [real=" + real + ", imaginaria=" + imaginaria + "]";
	}
	
	
	
}
