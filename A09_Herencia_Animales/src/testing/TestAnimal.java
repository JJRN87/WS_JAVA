package testing;

import java.util.ArrayList;

import javabeans.Animal;
import javabeans.Gato;

public class TestAnimal {

	public static void main(String[] args) {
		//Creando dos variables de tipo Animal
		//que instancian (new) objetos de la clase Animal
		
		Animal animal1 = new Animal(1,"homo sapiens", 2);
		Animal animal2 = new Animal(2,"CienPies", 100);
		
		//Creando dos variables de tipo Gato
		//que instancian (new) objetos de la clase Gato
		
		Gato gato1 = new Gato(3,"Felix el gato",4,10);
		Gato gato2 = new Gato(4,"Gato con botas",4,7);
		
		
		/*EN HERENCIA, SOLO EN HERENCIA, YO PUEDO crear una variable del padre (animal)
		 * instanciando(new) un objeto de cualquier hijo (gato)
		 */
		
		/*
		 * En programación tenemos 2 momentos
		 * 1) Estoy escribiendo el código, me creo una variable de tipo Clase (cualquier cosa que empieza por mayus)
		 * cuando le meto un `punto a la variable
		 * 2) Que se ejecuta, de quien es el método que se ejecuta, ahi OJO se ejecuta lo de new, no de la izquierda
		 * el ejemplo de abajo, sería la referencia. al hacer . SALE LOS MÉTODOS DE ANImal, pero ejecuta el gato
		 */
		
		Animal animal3 = new Gato(16,"Gato montes",4 ,25);
		System.out.println("Animal que crea GATO");
		animal3.sonido();
		animal3.saludar();
		System.out.println(animal3);
		
		//El tema sería, el método de los gatos no sería alcanzable por el animal. , tendrías que hacer un cast in para convetir
		//a un padre en hijo de herencia.
		
		((Gato)animal3).aumentarVidas(4);
		System.out.println(animal3);
		
		Gato gato4 = (Gato) animal3;
		
		// De esta manera, crearias un gato, que es una animal ,pero tendrías que hacer CAST (boton derecho)
		
		//------------------------
		
		
		System.out.println("Información de animales 1");
		animal1.sonido();
		animal1.saludar();
		System.out.println(animal1);
		
		animal2.sonido();
		animal2.saludar();
		System.out.println(animal2);
		
		System.out.println("Información de Gatos");
		gato1.sonido();
		gato1.saludar();
		System.out.println(gato1);
		gato1.aumentarVidas(3);
		System.out.println(gato1);
		
		gato2.sonido();
		gato2.saludar();
		System.out.println(gato2);
		gato2.eleminarVidas(4);
		System.out.println(gato2);
		
		ArrayList<Gato> censo = new ArrayList<Gato>();
		
		
		
	}

}
