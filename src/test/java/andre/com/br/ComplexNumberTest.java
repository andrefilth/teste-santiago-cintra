package andre.com.br;

public class ComplexNumberTest {

	public static void main(String[] args) {
		
		ComplexNumber complexo1 = new ComplexNumber (1, -2);
		ComplexNumber complexo2 = new ComplexNumber (3, -4);
		ComplexNumber terceiroNumero = new ComplexNumber();
		System.out.println ("Resultado: " + terceiroNumero.somaNumerosComplexos(complexo1, complexo2)); 
		

	}
}
