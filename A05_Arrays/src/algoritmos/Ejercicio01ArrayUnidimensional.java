package algoritmos;

public class Ejercicio01ArrayUnidimensional {

	public static void main(String[] args) {
		
		int [] numeros = {2,4,6,3,7,11};
		/*
		System.out.println(numeros.length);
		
		// Hay dos maneras de leer esto
		for (int i=0; i < numeros.length; i++) {
			System.out.println("En posición : " + i + " esta el numero : " + numeros[i]);	
		}
	
		// Otra manera de leer que opera fuera, que no da la posición da el resultado
		for (int numero: numeros) {
			System.out.println(numero);
		}
		*/ 
		//Ejemplo para lo que sirve este for de array (se deja sin valor lo de arriba para probar esto
		for (int num1: numeros) {
			if (num1 %2 == 0)
				System.out.println(num1 + " Es par");
			else
				System.out.println(num1 + " Es impar");
		}
		// La manera de construir un array lleno, e indica como construirlo
		int [] pares = {12,34,68};
		// Prueba poniendo
		numeros = pares;
		for (int par: pares)
			System.out.println("Esto es un par : " + par);
		for (int numero: numeros)
			System.out.println("Esto es un par ahora : " + numero);
	
			
		// IMPORTANTE:  El resumen es: Si quieres saber la posición tiras por FOR i . Si no quieres saberlo usas el metodo for con num1, etc
		
		String [] dias = {"lunes", "martes", "miercoles", "jueves", "viernes" };
		for (String dia: dias) {
			System.out.println(dia);
		}
		
		
		
		
		
		
		
	}

}
