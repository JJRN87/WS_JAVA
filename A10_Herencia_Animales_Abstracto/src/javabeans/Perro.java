package javabeans;

public class Perro extends AbstractAnimal{
	//Al crear la clase, deberías darle a Perro añadir métodos que necesitan escritura (y sale saludar y sonido)
	//de la clase Animal. Luego se implementa el resto
	
	private String raza;
	
	public Perro() {
		super();
	}

	
	
	public Perro(int matricula, String nombreCientifico, int numeroPatas, String raza) {
		super(matricula, nombreCientifico, numeroPatas);
		this.raza = raza;
	}

	

	public String getRaza() {
		return raza;
	}



	public void setRaza(String raza) {
		this.raza = raza;
	}


	//LOS MÉTODOS AÑADIDOS E IMPLEMENTADOS

	@Override
	public void saludar() {
		System.out.println("Hola, soy un perro");
		
	}

	@Override
	public void sonido() {
		System.out.println("Digo guau!!");
		
	}

	// LO MÉTODOS AÑADIDOS E IMPLEMENTADOS

	@Override
	public String toString() {
		return "Perro [matricula=" + matricula + ", nombreCientifico=" + nombreCientifico + ", numeroPatas="
				+ numeroPatas + ", raza=" + raza + "]";
	}
	
	//NO HACE FALTA HASHCODE, YA SIRVE EL ANTERIOR de animal.
	
	
	
	
}
