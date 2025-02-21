package javabeans;

import java.util.Objects;

public class Animal {
//PROTECTED CUANDO HAY HERENCIA, PARA QUE PUEDA VER DATOS EN HERENCIA
//LO VE CUALQUIER CLASE DEL MISMO PAQUETE
	protected int matricula;
	protected String nombreCientifico;
	protected int numeroPatas;
	
	public Animal(int matricula, String nombreCientifico, int numeroPatas) {
		super();
		this.matricula = matricula;
		this.nombreCientifico = nombreCientifico;
		this.numeroPatas = numeroPatas;
	}

	public Animal() {
		super();
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getNombreCientifico() {
		return nombreCientifico;
	}

	public void setNombreCientifico(String nombreCientifico) {
		this.nombreCientifico = nombreCientifico;
	}

	public int getNumeroPatas() {
		return numeroPatas;
	}

	public void setNumeroPatas(int numeroPatas) {
		this.numeroPatas = numeroPatas;
	}

	@Override
	public String toString() {
		return "Animal [matricula=" + matricula + ", nombreCientifico=" + nombreCientifico + ", numeroPatas="
				+ numeroPatas + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(matricula);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		return matricula == other.matricula;
	}
	
	//* ESTO NO SE HARÍA EN LA VIDA, METER SYSO EN UNA CLASE
	public void saludar () {
		System.out.println("Hola soy un animal y mi nombre cientifico es : " + nombreCientifico);
	}
	public void sonido() {
		System.out.println("Soy un animal generico y yo que se que sonido emito");
	}
	
	
}
