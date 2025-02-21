package testing;

import java.util.ArrayList;

import javabeans.AbstractAnimal;
import javabeans.Gato;
import javabeans.Perro;

public class TestColeccionAnimal {

	public static void main(String[] args) {
		AbstractAnimal animal1 = new Perro(234,"Perrus",4, "Lobo");
		AbstractAnimal animal2 = new Perro(345,"Perrus",4, "Maltés");
		Gato gato1 = new Gato(3,"Felix el gato",4,10);
		Gato gato2 = new Gato(4,"Gato con botas",4,7);
		AbstractAnimal animal3 = new Gato(16,"Gato montes",4 ,25);
		
		((Gato) animal3).aumentarVidas(4);
		
		ArrayList<AbstractAnimal> zoo = new ArrayList<>();
		zoo.add(animal3);
		zoo.add(animal2);
		zoo.add(animal1);
		zoo.add(gato1);
		zoo.add(gato2);
		zoo.add(new Gato(34, "gato siames",4,7));
		zoo.add(new Perro(23,"Perrus Silvestris",4,"Pastor Alemán"));
		
		for (AbstractAnimal abstractanimal: zoo) {
			abstractanimal.saludar();
			abstractanimal.sonido();
			if (abstractanimal instanceof Gato)
				((Gato) abstractanimal).aumentarVidas(4);
			System.out.println(abstractanimal);
		}
		
		 

	}

}