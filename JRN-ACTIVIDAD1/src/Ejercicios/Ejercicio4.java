package Ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int numero;
		int contadorPares = 0;
		int contadorImpares = 0;
		int sumaPares = 0;
		int sumaImpares = 0;

		do {
			System.out.println("Dame un número, el que quieras. Para cerrar el programa dame un 0");
			numero = leer.nextInt();

			if (numero != 0) {
				if (numero % 2 == 0) {
					System.out.println("El número " + numero + " es par.");
					contadorPares++;
					sumaPares += numero;

				} else {
					System.out.println("El numero " + numero + " es impar");
					contadorImpares++;
					sumaImpares += numero;
				}
			}

		} while (numero != 0);

		System.out.println("Los numeros pares mostrados son : " + contadorPares);
		System.out.println("Los suma de los pares es : " + sumaPares);
		System.out.println("Los numeros impares mostrados son :" + contadorImpares);
		System.out.println("Los suma de los impares es : " + sumaImpares);
		System.out.println("Fin de programa");

		leer.close();
	}

}
