package testing;

import java.util.ArrayList;

import javabeans.Country;
import javabeans.Region;

public class TestMuchosRegion {

	public static void main(String[] args) {
		Region region1 = new Region(1, "Europa", null);
		Country c1 = new Country("SP", "España", region1);
		Country c2 = new Country("FR", "Francia", region1);
		Country c3 = new Country("AL", "Alemania", region1);

		ArrayList<Country> lista = new ArrayList<Country>();
		lista.add(c1);
		lista.add(c2);
		lista.add(c3);
		
		region1.setCountries(lista);
		System.out.println("Nombre de los paises de región 1");
		
		for (Country country: region1.getCountries()) {
			System.out.println("El pais es : " + country.getCountryName());
		}
		
		
		System.out.println("A PETICIÓN DE ALUMNO");
		
		int posicion = region1.getCountries().indexOf(c3);
		
		System.out.println(region1.getCountries().get(posicion).getCountryName());
		
		// LO ANTERIOR ES UN EJEMPLO QUE PUSO PARA UN ALUMNO
		
		//AÑADIMOS BÉLGIDA
		System.out.println("Añadimos Belgida nueva lista");
		region1.addCountry(new Country("BL", "Belgica", region1));
		for (Country country: region1.getCountries()) {
			System.out.println("El pais es : " + country.getCountryName());
		}
		
		//BORRAMOS ALEMANIA
		System.out.println("Borramos Alemania nueva lista");
		region1.removeCountry(c3);
		for (Country country: region1.getCountries()) {
			System.out.println("El pais es : " + country.getCountryName());
		}
	
		System.out.println(region1);
		
	}

}
