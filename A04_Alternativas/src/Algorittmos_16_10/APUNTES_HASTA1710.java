package Algorittmos_16_10;

public class APUNTES_HASTA1710 {

	public static void main(String[] args) {
		/* PRIMERA CONSIDERACIÓN
		 * dos tipos de variables por su contenido en JAVA
		 * - las que contienen el valor asignado: 8 tipos primitivos
		 * - las variables de tipo clase: contienen una referencia al contenido del objeto
		 * UNA DIRECCIÓN DE MEMORIA
		 */

		/* SEGUNDA CONSIDERACION
		 * Para crear un objeto de cualquier clase String hace asi:
		 * Scanner leer = new Scanner(System.in); // construir un objeto
		 * Persona persona = new Persona("tomas", "escudero");
		 * 
		 * 
		 * String, para construir un objeto de la clase String,
		 * generalmente, no se hace como los demás, hay una forma especial
		 * 
		 * String nombre = "eva"; // propia de String, y de alguna clase más (Clases envolventes)
		 * 
		 */
		
		/* TERCERA CONSIDERACIÓN
		 * Los operadores de relación: == != < <= >= > >=, java siempre comparar el contenido de las variables.:
		 * - variables de tipo primitivo, comparamos los valores reales
		 * - variables de tipo clase, como su contenido es una dirección de memoria, 
		 * estamos comparando si dos objetos apuntan al mismo String.
		 * 
		 * --> usar un metod de objeto de String llamado equals
		 */
		
		String cad1 = "andres", cad2 = "andres";
		String cadena = null;
	//	String cadena1 = "";
		
		if (cad1.equals(cad2))
			System.out.println("son iguales");
		else	
			System.out.println("son distintos");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
