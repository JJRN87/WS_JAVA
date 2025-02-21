package javabean;

public class Fiesta {
	
	/*
	 *  Se añaden los valores que tiene cada circunstancia en la fiesta, que son fijos, para invitado,
	 *  bebida y bocadillo
	*/
	public static final double PRECIO_INVITADO = 5;
	public static final double PRECIO_BEBIDA = 2;
	public static final double PRECIO_BOCADILLO = 3;
	
	
	
	// Tipo de atributos privados
	private String tipoFiesta;
	private String direccion;
	private int bocadillos;
	private int bebidas;
	private int invitados;
	private String fechaHora;
	
	//constructores vacio y con todos los parametros
	public Fiesta() {
		super();
	}


	public Fiesta(String tipoFiesta, String direccion, int bocadillos, int bebidas, int invitados, String fechaHora) {
		super();
		this.tipoFiesta = tipoFiesta;
		this.direccion = direccion;
		this.bocadillos = bocadillos;
		this.bebidas = bebidas;
		this.invitados = invitados;
		this.fechaHora = fechaHora;
	}




	// los getter and setter de todos los parametros
	public String getTipoFiesta() {
		return tipoFiesta;
	}

	public void setTipoFiesta(String tipoFiesta) {
		this.tipoFiesta = tipoFiesta;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getBocadillos() {
		return bocadillos;
	}

	public void setBocadillos(int bocadillos) {
		this.bocadillos = bocadillos;
	}

	public int getBebidas() {
		return bebidas;
	}

	public void setBebidas(int bebidas) {
		this.bebidas = bebidas;
	}

	public int getInvitados() {
		return invitados;
	}

	public void setInvitados(int invitados) {
		this.invitados = invitados;
	}

	public String getFechaHora() {
		return fechaHora;
	}


	public void setFechaHora(String fechaHora) {
		this.fechaHora = fechaHora;
	}


	// finalmente, to string para retornar información de todos los parametros
	@Override
	public String toString() {
		return "Fiesta [tipoFiesta=" + tipoFiesta + ", direccion=" + direccion + ", bocadillos=" + bocadillos
				+ ", bebidas=" + bebidas + ", invitados=" + invitados + ", fechaHora=" + fechaHora + "]";
	}

	
	
	// Aqui añadimos los métodos propios, para sacar precio de la fiesta, invitaciones y cancelación invitaciones
	// también hacemos los métodos sobrecargados de invitar y cancelarInvitación
	public double invitar() {
		return invitados++;
	}
	


	public double cancelarInvitacion() {
		return invitados--;
	}
	
	public double invitar (int cantidad) {
		return invitados += cantidad;
	}
	
	public double cancelarInvitacion (int cantidad) {
		return invitados -= cantidad;
	}
	
	public double precioFiesta() {
		return (PRECIO_INVITADO * invitados) + (PRECIO_BEBIDA * bebidas) + (PRECIO_BOCADILLO * bocadillos);
		
	
	}
}
