package ejecutables;

public class Ejercicio02 {

	public static void main(String[] args) {
		// teorema de pitagoras
		int cateto1 = 3, cateto2 = 4;	
		double hipotenusa = 0;
		hipotenusa = Math.sqrt(Math.pow (cateto1, 2) + Math.pow(cateto2, 2));
		System.out.println("la hipotenusa me de : "+ hipotenusa);
		
		
	// EJEMPLO DE VALORES ESTÁTICOS Y DE CLASE
		
		String.valueOf(12);
		String numero = String.valueOf(12.5);
		numero = "andres";
		
		System.out.println(numero.charAt(0));

	}

}
