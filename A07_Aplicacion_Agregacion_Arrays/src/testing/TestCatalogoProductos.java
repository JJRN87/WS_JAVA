package testing;

import javabean.Producto;
import modelo.CatalogoProductos;

public class TestCatalogoProductos {

	public static void main(String[] args) {
		CatalogoProductos micatalogo = new CatalogoProductos();
		
		Producto prueba = new Producto(1005L, "Camisa", 123, 23, "XS", "Blanco");
		
		System.out.println(micatalogo.size());
		micatalogo.add(new Producto(1001L, "Camisa", 123, 23, "XS", "Blanco"));
		micatalogo.add(new Producto(1002L, "Pantalon", 123, 23, "XS", "Blanco"));
		micatalogo.add(new Producto(1003L, "Falda", 123, 50, "XS", "Negro"));
		micatalogo.add(new Producto(1004L, "Cinto", 123, 50, "XS", "Blanco"));
		
		System.out.println(micatalogo.size());
		System.out.println(micatalogo.indexOf(prueba));
		System.out.println(micatalogo.contains(prueba));
		
		for (Producto ele: micatalogo.buscarTodos()) {
			System.out.println(ele);
		}
		System.out.println("Búsqueda por stock");
		for (Producto ele: micatalogo.buscarPorStockMayorQue(49)) {
			System.out.println(ele);
		}

	}
	
}
