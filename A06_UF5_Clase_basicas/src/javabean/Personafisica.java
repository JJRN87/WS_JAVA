package javabean;

public class Personafisica {
	
	private String dni;
	private String nombreCompleto;
	private String direccion;
	
	public Personafisica(String dni, String nombreCompleto, String direccion) {
		super();
		this.dni = dni;
		this.nombreCompleto = nombreCompleto;
		this.direccion = direccion;
	}
	public Personafisica() {
		super();
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombreCompleto() {
		return nombreCompleto;
	}
	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	@Override
	public String toString() {
		return "Personafisica [dni=" + dni + ", nombreCompleto=" + nombreCompleto + ", direccion=" + direccion + "]";
	}
	
	/*
	 * Aqui irían los métodos propios
	 */
	
	
	
	
}
