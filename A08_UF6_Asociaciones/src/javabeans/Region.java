package javabeans;

import java.util.ArrayList;
import java.util.Objects;

public class Region {

	private int regionId;
	private String regionName;
	
	private ArrayList<Country> countries;
	//Este sería el ejemplo de añadir muchos con ARRAYLIST.
	
	
	
	public Region() {
		super();
	}

	public Region(int regionId, String regionName, ArrayList<Country> countries) {
		super();
		this.regionId = regionId;
		this.regionName = regionName;
		this.countries = countries;
	}

	//SI NOS FIJAMOS, TENEMOS QUE HACER EL CONSTRUCTOR NUEVAMENTE, AL AÑADIR ARRAYLIST
	//ojo, no se borra el que había, se dejan ambos.
	
	public Region(int regionId, String regionName) {
		super();
		this.regionId = regionId;
		this.regionName = regionName;
	}

	public int getRegionId() {
		return regionId;
	}

	public void setRegionId(int regionId) {
		this.regionId = regionId;
	}

	public String getRegionName() {
		return regionName;
	}

	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}


	@Override
	public int hashCode() {
		return Objects.hash(regionId);
	}
	
	
	public ArrayList<Country> getCountries() {
		return countries;
	}

	public void setCountries(ArrayList<Country> countries) {
		this.countries = countries;
	}
	
	//RECORDAR AÑADIR LOS GETTER Y SETTER NUEVOS

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Region))
			return false;
		Region other = (Region) obj;
		return regionId == other.regionId;
	}

	@Override
	public String toString() {
		return "Region [regionId=" + regionId + ", regionName=" + regionName + ", countries=" + countries + "]";
	}
	
	//ESTOS DOS ÚLTIMOS MÉTODOS PUBLICOS, SON PARA QUE NO PETE AL DAR NULL, para evitar errores si el array no esta generado
	public boolean addCountry(Country country) {
		if (countries == null)
			countries = new ArrayList<Country>();
		//El siguiente comando, es para evitar que se repitan
		if (countries.contains(country))
			return false;
		else
			return countries.add(country);	
	}
	public boolean removeCountry(Country country) {
		if (countries == null)
			countries = new ArrayList<Country>();
		return countries.remove(country);
	}
	
}
