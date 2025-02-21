package aplicacion;

import java.util.Scanner;

import javabean.Contacto;
import negocio.AgendaContactoImpl;
import negocio.IAgendaContacto;

public class MenuOpciones {
	//Se crea la clase estatica para leer el menu
	private static Scanner leer = new Scanner(System.in);
	private static IAgendaContacto miagenda = new AgendaContactoImpl();
			
	public static void main(String[] args) {
		
		int opcion = 0;
		// Todas las opciones del programa
		do {
			opcion = pintarMenu();
			switch(opcion) {
			case 1: 
				procesarTodos();
				break;
			case 2:
				procesarUno();
				break;
			case 3:
				procesarAlta();
				break;
			}
			
		}while (opcion != 4);
		
		System.out.println("Fin del proceso");
		
		leer.close();

	}
	
	// Aqui se encuentran las opciones del proceso
	public static void procesarTodos() {
		for (Contacto contacto : miagenda.todos())
			System.out.println(contacto);
	}
	
	public static void procesarUno() {
		System.out.println("Dame tu nombre");
		String nombre = leer.next();
		Contacto contacto = miagenda.buscarContacto(nombre);
		if (contacto != null)
			System.out.println(contacto);
		else
			System.out.println("Este contacto no existe");
		
	}
	
	public static void procesarAlta() {
		System.out.println("Dame tu nombre y tu teléfono");
		String nombre = leer.next();
		String telefono = leer.next();
		Contacto contacto = new Contacto(nombre, telefono);
		if(miagenda.altaContacto(contacto))
			System.out.println("Alta confirmada");
		else
			System.out.println("Este contacto ya existe");
	}
	

	
	
	public static int pintarMenu() {
		// La interacción en la cual se mostrará las opciones del menú
		int opcion = 0;
		System.out.println("1 - Todos");
		System.out.println("2 - Uno");
		System.out.println("3 - Alta");
		System.out.println("4 - Salir");
		
		System.out.println("Teclea una opción, 4 para salir");
		
		opcion = leer.nextInt();
		while(opcion < 1 || opcion > 4) {
			System.out.println("Opción incorrecta, válidos del 1 al 4");
			opcion = leer.nextInt();
		}
		return opcion;
		
	}
}
