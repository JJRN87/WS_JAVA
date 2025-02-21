package testing;

import java.util.ArrayList;

import javabeans.Animal;
import javabeans.Gato;

public class TestColeccionAnimal {

	public static void main(String[] args) {
		Animal animal1 = new Animal(1,"homo sapiens", 2);
		Animal animal2 = new Animal(2,"CienPies", 100);
		Gato gato1 = new Gato(3,"Felix el gato",4,10);
		Gato gato2 = new Gato(4,"Gato con botas",4,7);
		Animal animal3 = new Gato(16,"Gato montes",4 ,25);
		
		((Gato) animal3).aumentarVidas(4);
		
		ArrayList<Animal> zoo = new ArrayList<>();
		zoo.add(animal3);
		zoo.add(animal2);
		zoo.add(animal1);
		zoo.add(gato1);
		zoo.add(gato2);
		zoo.add(new Gato(34, "gato siames",4,7));
		zoo.add(new Animal(23,"Gorila maguila",2));
		
		for (Animal animal: zoo) {
			animal.saludar();
			animal.sonido();
			if (animal instanceof Gato)
				((Gato) animal).aumentarVidas(4);
			System.out.println(animal);
		}
		

	}

}
