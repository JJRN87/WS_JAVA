package testing;

import javabean.Empleado_HastaLaClase06_11;

public class TestEmpleado {

	public static void main(String[] args) {
		Empleado_HastaLaClase06_11 emp1 = new Empleado_HastaLaClase06_11();
		
		//Emp2 está realizado después de meter constructores en empleadobean
		Empleado_HastaLaClase06_11 emp2 = new Empleado_HastaLaClase06_11(230, "ANA", "GARCIA", 2345, 234, 'M');
				
		emp1.setNombre("Esteban");
		emp1.setApellidos("Lopez Santos");
		emp1.setComplementos(390);
		emp1.setGenero('H');
		emp1.setIdEmpleado(201);
		emp1.setSalarioMensual(2390);
		
		
		// LA FORMA DE HACERLO BONITO
		System.out.println("Empleado [idEmpleado : " + emp1.getIdEmpleado() + " : " + emp1.getNombre() + "....]") ;
		// Después de añadir el override en el bean, puedes tirar string y te publica lo de arriba
		System.out.println(emp1.toString());
		// incluso poniendo emp1 te sale sin necesidad de poner string
		System.out.println(emp1);
		
		
		System.out.println(emp1);
		System.out.println(emp2);
		
		System.out.println(emp1.salarioAnual());
		System.out.println(emp1.literalGenero());
		System.out.println(emp1.nombreCompleto());
		
				
		
		
		
		
		// LOS EJEMPLOS DE AQUI ABAJO, SON PARA MOSTRAR QUE PODRÍAS PONER LO QUE QUIERAS, SIN SE PONE PRIVATE Y ACCEDERÍAS DIRECTAMENTE AL BEAN
		/*
		emp1.nombre = "tomas";
		emp1.apellidos = "rodriguez";
		emp1.genero = 'J';
		emp1.salarioMensual = 45_000;
		*/
		//Si está el private en EMPLEADO como clases, por eso sale en rojo, debido a la encapsulación. 
		//De esta manera al hacer emp.1 no salen las clases creadas
		//De esta manera no se puede acceder, y se tendría en (setAtributo y getAtributo)
		/*
		System.out.println(emp1.salarioMensual );
		System.out.println(emp1.complementos);
		System.out.println(emp1.idEmpleado);
		System.out.println(emp1.apellidos);
		System.out.println(emp1.genero);
		*/
		//ESTO SE EXPLICO EN LA CLASE DEL 29.10
		

	
		
	}

}
