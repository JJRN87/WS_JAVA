package javabeans;

import java.util.Objects;

public abstract class AbstractAnimal {

	/*
	 * 1.- De una clase abastracta no se pueden instanciar objetos (NO NEW)
	 * 2.- Alguno de los métodos que tengo, puedo declararlos abstractos
	 *   METODO ABSTRACTO: es el que no tiene implementación
	 * 3.- Un método abstracto obliga a las clases que heredan de él directamente
	 * a reescribir el método con el mismo patrón.
	 */
	
	protected int matricula;
	protected String nombreCientifico;
	protected int numeroPatas;
	
	public AbstractAnimal(int matricula, String nombreCientifico, int numeroPatas) {
		super();
		this.matricula = matricula;
		this.nombreCientifico = nombreCientifico;
		this.numeroPatas = numeroPatas;
	}

	public AbstractAnimal() {
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
		AbstractAnimal other = (AbstractAnimal) obj;
		return matricula == other.matricula;
	}
	
	//* Se han cambiados los métodos a abstractos, leer arriba para explicación.
	public abstract void saludar ();
	public abstract void sonido();
	}
	
	

