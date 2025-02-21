package javabean;

public class Cliente {

	private String cif;
	private String nombre;
	private double facturacionAnual;
	private int numeroDeEmpleado;
	public String getCif() {
		return cif;
	}
	public void setCif(String cif) {
		this.cif = cif;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getFacturacionAnual() {
		return facturacionAnual;
	}
	public void setFacturacionAnual(double facturacionAnual) {
		this.facturacionAnual = facturacionAnual;
	}
	public int getNumeroDeEmpleado() {
		return numeroDeEmpleado;
	}
	public void setNumeroDeEmpleado(int numeroDeEmpleado) {
		this.numeroDeEmpleado = numeroDeEmpleado;
	}
	@Override
	public String toString() {
		return "Cliente [cif=" + cif + ", nombre=" + nombre + ", facturacionAnual=" + facturacionAnual
				+ ", numeroDeEmpleado=" + numeroDeEmpleado + "]";
	}
	
	
}
