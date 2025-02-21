package Ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int nota;
		System.out.println("Dime que nota has sacado del 0 al 10");
		nota = leer.nextInt();
		
	
		switch(nota) {
		case 0, 1 , 2 , 3 , 4:
			System.out.println("Tienes un insuficiente");
			break;
		case 5:
			System.out.println("Suficiente, has aprobado");
			break;
		case 6, 7:
			System.out.println("Tienes un bien");
			break;
		case 8:
			System.out.println("Tienes un notable");
			break;
		case 9, 10:
			System.out.println("Felicidades, tienes un sobresaliente");
			break;
			
		default:
				System.out.println("Nota errónea");
			break;
		}
		leer.close();
	}

}
