package javabean;

import java.util.Objects;

public class Producto {
	/* Define una clase para guardar la información de un Producto. Tendrá atributos de instancia para guardar:

    Código de barras: long,
    descripción: String,
    precioUnitario: double
    cantidadStock: int
    talla: String
    color: String
*/
	private Long codigoDeBarras;
	private String descripcion;
	private double precioUnitario;
	private int cantidadStock;
	private String talla;
	private String color;
	
	public Producto(Long codigoDeBarras, String descripcion, double precioUnitario, int cantidadStock, String talla,
			String color) {
		super();
		this.codigoDeBarras = codigoDeBarras;
		this.descripcion = descripcion;
		this.precioUnitario = precioUnitario;
		this.cantidadStock = cantidadStock;
		this.talla = talla;
		this.color = color;
	}

	public Producto() {
		super();
	}

	public Long getCodigoDeBarras() {
		return codigoDeBarras;
	}

	public void setCodigoDeBarras(Long codigoDeBarras) {
		this.codigoDeBarras = codigoDeBarras;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	public int getCantidadStock() {
		return cantidadStock;
	}

	public void setCantidadStock(int cantidadStock) {
		this.cantidadStock = cantidadStock;
	}

	public String getTalla() {
		return talla;
	}

	public void setTalla(String talla) {
		this.talla = talla;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Producto [codigoDeBarras=" + codigoDeBarras + ", descripcion=" + descripcion + ", precioUnitario="
				+ precioUnitario + ", cantidadStock=" + cantidadStock + ", talla=" + talla + ", color=" + color + "]";
	}
	
	
	// METODO POR SOURCE
	@Override
	public int hashCode() {
		return Objects.hash(codigoDeBarras);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Producto))
			return false;
		Producto other = (Producto) obj;
		return Objects.equals(codigoDeBarras, other.codigoDeBarras);
	}
	
	/* // VAMOS A REDIFINIR OVERDRIVE DE LA SEMANA 17.12.2024 con ARRAYS. (manual por el profesor)
	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (this == obj)
			return true;
		if (!(obj instanceof Producto))
				return false;
		
		Producto otro = (Producto)obj;
		
		if (this.codigoDeBarras == otro.codigoDeBarras && this.descripcion.equals(otro.descripcion) )
			return true;
		else
			return false;
	}
	*/
	
	
	/*
	 * precioConIva(int iva): double. Devuelve el precio del producto incrementado con el iva solicitado por argumento.
aumentarStock(int cantidad) : void. Aumenta el stock en la cantidad especificada.
disminuirStock(int cantidad): boolean. Si la cantidad hace que el stock quede por debajo de cero, el stock ni se toca y se devuelve false, si no disminuir el stock en la cantidad especificada y devolver true.
crea un método, llamado precioAplicado(): double que devuelva el precio aplicado en función de la talla, que tiene el producto:

XS -> el precio devuelto es el del producto.
S y M -> devuelve el precio del producto incrementado un 3%
L y XL -> devuelve el precio del producto incrementado un 3%
XXL y XXXL -> devuelve el precio incrementado un 4%
En ningún caso se modifica el precio asignado al producto.

	 */
	


	public double precioConIva(int iva) {
		return precioUnitario * (1+ (double)iva/100.0);
	}
	
	public void aumentarStock(int cantidad) {
		cantidadStock += cantidad;
	}
	
	public boolean disminuirStock(int cantidad) {
		if (cantidad > cantidadStock)
			return false;
		else {
			cantidadStock -= cantidad;
			return true;
		}
	}
	
	public double precioAplicado() {
		switch(talla) {
		case "XS":
			return precioUnitario;
		case "S", "M":
			return precioUnitario * 1.03;
		case "L", "XL":
			return precioUnitario * 1.04;
		case "XXL", "XXXL":
			return precioUnitario * 1.05;
		default:
		return precioUnitario;
		}
	}
}

