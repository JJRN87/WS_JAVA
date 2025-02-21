package algoritmos;

public class Ejercicio01_TOMAS {
	
	// circunferencia = 2 por PI por radio
    // el area del circulo (PI * r2)

	public static void main(String[] args) {
		int radio = 4;
		double circunferencia = 0, areaCirculo = 0;
		
		circunferencia = 2 * Math.PI * radio;
		
		System.out.println("La circunferencia es : " + circunferencia);
		
		areaCirculo = Math.PI * Math.pow(radio, 2);
		
		System.out.println("El area del circulo es : " + areaCirculo);
				
 		
		
		
	}
}
