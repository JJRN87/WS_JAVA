package testing;

public class Ejercicio01 {

	public static void main(String[] args) {
		
		String saludo ="Hola me llamo Tomasin y soy tu profe";
		String nombre ="andres";
		String nombre2 = new String("andres");
		
		System.out.println(saludo.length());
		System.out.println(saludo.charAt(8)); //Sirve para sacar dentro de la longitud, y mirar que hay ese espacio
		
		if (nombre == "andres")
			System.out.println("son iguales");
		else
			System.out.println("son distintos");
		
		if (nombre == nombre2)
			System.out.println("son iguales por new");
		else
			System.out.println("son distintos por new");
		
		if (nombre.equals("andres"))
			System.out.println("iguales por equal v1");
		
		if (nombre.equals(nombre2))
			System.out.println("iguales equals v2");
	//	if (nombre.equalsIgnoreCase(nombre2))
		
		/* métodos de busqueda
		 * contiene
		 * empieza por
		 * termina en
		 * nombre_columna like '%cadena%'
		 * nombre_columna like 'cadena%'
		 * nombre_columna like '%cadena'
		 */
		
		System.out.println("CONTENIENDO");
		System.out.println(saludo.contains("llamo"));
		System.out.println(saludo.toLowerCase().startsWith("hola"));
		System.out.println(saludo.endsWith("profe"));
		
		System.out.println("COMPARAR OBJETOS DE TIPO STRING -> un bojeto es =, > o < que el otro");
		/*
		 * espacios en blanco
		 * numeros
		 * letras mayusculas
		 * letras minisculas A a 32
		 */
		nombre = "Andres";
		nombre2 = "andres";
		System.out.println(nombre.compareTo(nombre2));
		
		String [] palabras = saludo.split(" ");
		
		for (String palabra: palabras)
			System.out.println(palabra);
		
		System.out.println(saludo.substring(7,15));
		
		String numero = String.valueOf(12);
		
		
		
	
		
	
	}

}
