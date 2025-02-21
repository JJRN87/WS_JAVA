package Ejercicios;

public class Ejercicio2 {

	public static void main(String[] args) {
		int impares = 1;
		int sumaimpares =0;
		int productoimpares =0;
		int contadorimpares=0;
		
		while (contadorimpares<10) {
			System.out.println("Vamos por el numero impar : "+ impares);
		impares += 2; 
		sumaimpares = impares + impares;
		contadorimpares++;
		productoimpares = impares * impares;
		}
		
		
		System.out.println("la suma de los impares es : " + sumaimpares);
		System.out.println("el producto de los impares es : " + productoimpares);
		
			
		}
		
		
	}


