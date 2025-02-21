package testing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

public class TestColecciones {

	public static void main(String[] args) {
		List<String> nombres, palabras;
		nombres = new Vector<String>();
		
		// nombres = List.of("tomas","eva","carlos","sara","tomas"); generaría uno inmute y no puedes añadir mas
		nombres.add("carlota");
		nombres.add("tomas");
		nombres.add("sara");
		nombres.add("tomas");
		
		
		System.out.println("Listado con LIST");
		for (String nombre: nombres) {
			System.out.println(nombre);
		}
		System.out.println(nombres.contains("Sara"));
		
		
		System.out.println("Listado con SET");
		Set<String> lista = new TreeSet<String>();
		
		lista.add("tomas");
		lista.add("eva");
		lista.add("anton");
		lista.add("zacarias");
		lista.add("tomas");
		
		for (String nombre: lista) {
			System.out.println(nombre);
		}
		
		System.out.println("Listado con MAPAS");
		Map<Integer, String> mapa = new HashMap<Integer, String>();
		
		mapa.put(1, "Casillas");
		mapa.put(2, "Carvajal");
		mapa.put(3, "Jordi Alba");
		mapa.put(9, "Mbappe");
		mapa.put(2, "Michel Salgado");
		
		for (Integer numero: mapa.keySet())  {
			System.out.println(numero);
		}
		for (String numero: mapa.values())  {
			System.out.println(numero);
		}
		
		for (Integer numero: mapa.keySet())  {
			System.out.println(numero + " - " + mapa.get(numero));
		}
		
		System.out.println("LA LISTA DE NOMBRE DEL METODO");
		
		List<String> miLista = getNombres();
		// for (String ele: getNombres())
		for (String ele: miLista)
			System.out.println(ele);
		
	}

	public static List<String> getNombres(){
		
		List<String> lista = new ArrayList<String>();
		lista.add("andres");
		lista.add("sara");
		lista.add("honorante");
		
		return lista;
	
	}
}
