package Ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner scLeer = new Scanner(System.in);
		System.out.println("Buenos días: Dame tu nombre de usuario y contraseña");
		String nombre = scLeer.nextLine();
		String contraseñaCorrecta = "sarita";
		String usuarioCorrecto = "sara";

		if (nombre.equals(usuarioCorrecto)) {
			System.out.println("Dame tu contraseña");
		} else {
			System.out.println("Usuario Incorrecto");
		}

		String contraseña = scLeer.nextLine();
		if (contraseña.equals(contraseñaCorrecta)) {
			System.out.println("Usuario y contraseñas correctas, bienvenido a la aplicación");
		} else {
			System.out.println("Contraseña Incorrecta");

		}

		scLeer.close();

	}

}
