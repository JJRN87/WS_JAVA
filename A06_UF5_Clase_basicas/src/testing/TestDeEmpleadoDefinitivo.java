package testing;

import javabean.Empleado;

public class TestDeEmpleadoDefinitivo {

	public static void main(String[] args) {
		System.out.println(Empleado.SALARIO_MAXIMO);
		System.out.println(Empleado.SALARIO_MININO);
		System.out.println(Empleado.salarioEnPagas(48000, 12));
		
		
		Empleado emp1, emp2;
		
		emp1 = new Empleado();
		System.out.println(emp1);
		emp1.setApellidos("Rodriguez");
		emp1.setComplementos(5000);
		emp1.setGenero('M');
		emp1.setIdEmpleado(201);
		emp1.setNombre("Eva");
		emp1.setSalario(35_000);
		System.out.println(emp1);
		
		emp2 = new Empleado(202, "Ramon", "Sebastian Agosto", 25_000, 3_000, 'h');
		emp2.setSalario(Empleado.SALARIO_MAXIMO);
		
		System.out.println(emp2);
		System.out.println("literal genero emp1 : " + emp1.liberalGenero());
		System.out.println("literal genero emp1 : " + emp1.salarioBrutoAnual());
		System.out.println("literal genero emp1 : " + emp1.salarioMensual());
		
		System.out.println("Datos de empleado 2");
		
		System.out.println("literal genero emp1 : " + emp2.tipoSalario());
		System.out.println("literal genero emp1 : " + emp2.nombreCompleto());
		System.out.println("literal genero emp1 : " + emp2.salarioMensual(16));
		
		//Primera vez que vemos valueOf
		String numero = String.valueOf(12);
		
		
		
		
	}

}
