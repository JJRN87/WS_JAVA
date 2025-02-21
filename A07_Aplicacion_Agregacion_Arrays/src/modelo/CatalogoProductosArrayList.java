package modelo;

import java.util.ArrayList;

import javabean.Producto;

public class CatalogoProductosArrayList {
	
	private ArrayList<Producto> lista;
	
	public CatalogoProductosArrayList() {
		lista = new ArrayList<Producto>();	
		cargarDatos();
	}
	
	private void cargarDatos() {
		lista.add(new Producto(1001L, "Camisa", 123, 23, "XS", "Blanco"));
		lista.add(new Producto(1002L, "Pantalon", 123, 23, "XS", "Blanco"));
		lista.add(new Producto(1003L, "Falda", 123, 50, "XS", "Negro"));
		lista.add(new Producto(1004L, "Cinto", 123, 50, "XS", "Blanco"));
	}
	
	
	
	
	public boolean addProducto(Producto producto) {
		return false;
	}
	
	//public boolean modificarProducto(Producto producto) { (Se quedó a medias en la clase del día 19 de diciembre.
		
	//}
	
	
}
