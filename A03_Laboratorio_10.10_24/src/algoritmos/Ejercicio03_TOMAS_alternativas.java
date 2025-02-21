package algoritmos;

public class Ejercicio03_TOMAS_alternativas {

	public static void main(String[] args) {
		// Solo rama IF una sentencia
		int edad = 19;
		
		if (edad >= 18)
			System.out.println("Eres mayor de edad");
		
		// Solo rama if más de una sentencia
		
		if (edad >= 18) {
			System.out.println("ERES MAYOR DE EDAD");
		    System.out.println("Eres ADULTO");
		}
		
		// Rama IF y rama ELSE solo una sentencia
		
		if (edad >= 18) {
			System.out.println("ERES SENIOR");
			System.out.println("ERES ABUELO");
		}
		else {
			System.out.println("ERES JUNIOR");
			System.out.println("ERES NERE");
		}
		
		// Rama if y rama else más de una sentence por rama
		
		
		if (edad >=18) {
			edad++;
			System.out.println("EDAD MAYOR");
		} else {
			edad--;
			System.out.println("edad menor");
		}
			
		System.out.println("Fin de algoritmo");

	}

}
