package modelo;

import javabean.Producto;

public class CatalogoProductos {
	
	private Producto[] lista;
	private int cuantosVan;
	
	public CatalogoProductos() {
		lista = new Producto[10];
		//cuantosVan =0; // No haria falta ponerlo, ya que si no ponemos valor, lo pone en 0
	}
	
	public CatalogoProductos(int cantidad) {
		lista = new Producto[cantidad];
		//cuantosVan =0;
	}
	
	/*
	 * size()
	 * indexOf(Producto producto): int
	 * contains(Producto producto): boolean
	 * add(Producto producto): boolean
	 * set(int posicion, Producto producto): Producto
	 * remove(Producto producto): boolean
	 * get(int posicion): Producto
	 */
	
	public int size() {
		return cuantosVan;
	}
	
	public boolean add(Producto producto) {
		if (producto == null)
			return false;
		if (cuantosVan >= lista.length)
			return false;
		lista[cuantosVan] = producto;
		cuantosVan++;
		return true;
	}
	
	public int indexOf(Producto producto) {
		if (producto == null)
			return -1;
		for (int i =0; i< cuantosVan; i++) {
			if (lista[i].equals(producto))
				return i;
		}
		return -1;
	}
	
	public boolean contains(Producto producto) {
		if (producto == null)
			return false;
		if (indexOf(producto) == -1)
			return false;
		else
			return true;
	}
	
	public Producto get(int posicion) {
		if (posicion <0 || posicion >= cuantosVan)
			return null;
		return lista[posicion];
	}
	
	public boolean set(int posicion, Producto producto) {
		if (posicion <0 || posicion >= cuantosVan)
			return false;
		if (producto == null)
			return false;
		lista[posicion] = producto;
		return true;
	}
	
	//METODOS PROPIOS CATÁLOGO.
	
	public Producto buscarUno(long codigoBarras) {
		for (int i=0; i< cuantosVan; i++) {
			if (lista[i].getCodigoDeBarras() == codigoBarras)
				return lista[i];
		}
		return null;
	}
	
	public Producto[] buscarTodos() {
		Producto[] aux = new Producto[cuantosVan];
		for (int i=0; i < cuantosVan; i++) {
			aux[i] = lista[i];
		}
		return aux;
	}
	
	public Producto[] buscarPorStockMayorQue(int cantidad) {
		Producto[] aux = new Producto[cuantosVan];
		int posicionAux =0;
		for (int i=0; i<cuantosVan; i++) {
			if(lista[i].getCantidadStock() > cantidad) {
				aux[posicionAux] = lista[i];
				posicionAux++;
			}
		}
		Producto[] definitivo = new Producto[posicionAux];
		for (int i=0; i< posicionAux; i++)
			definitivo[i] = aux [i];
		return definitivo;
	}
	
	
	
}
