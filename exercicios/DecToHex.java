
public class DecToHex {

	public static void main(String[] args) {
		
		int decimal = 7855;
		int resto;
		
		String resultado = "";
		
		while (decimal != 0) {
			resto = decimal % 16;
			if (resto == 10) {
				resultado = "A" + resultado; //concatenando
			}
			else if (resto == 11) {
				resultado = "B" + resultado;
			}
			else if (resto == 12) {
				resultado = "C" + resultado;
			}
			else if (resto == 13) {
				resultado = "D" + resultado;
			}
			else if (resto == 14) {
				resultado = "E" + resultado;
			}
			else if (resto == 15) {
				resultado = "F" + resultado;
			}
			else {
				resultado = resto + resultado;
			}
			decimal = decimal / 16;			
		}
		
		System.out.println(resultado);
		
	}
	
}
