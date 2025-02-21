package testing;

import java.time.LocalDate;

import javabeans.Country;
import javabeans.Department;
import javabeans.Employee;
import javabeans.Job;
import javabeans.Location;
import javabeans.Region;

public class TestEmpresa {

	public static void main(String[] args) {
		Region region1 = new Region(1, "Europa");
		Country espania = new Country("SP", "España", region1);
		Location loc1500 = new Location(1500, "pez 3", "28007", "Madrid", "28", espania);
		Job job = new Job("IT_PROG", "Analista Programador", 18_000, 35_000);
		Department dep30 = new Department(30, "Ventas", null, loc1500);
		Employee emp114 = 
		new Employee(114, "Esteban", "Raphaelly", "est@fp.com", "678678678", LocalDate.of(1998, 4, 15),job, 35_000, 0.2, null, dep30);
		Employee emp115 = 
			new Employee(115, "Ana", "Koo", "ana@fp.com", "678678555", LocalDate.of(1997, 11, 15),job, 30_000, 0.1, emp114, dep30);
		Employee emp116 = 
			new Employee(116, "Eva", "Baida", "eva@fp.com", "678678444", LocalDate.of(1995, 3, 16),job, 25_000, 0.3, emp114, dep30);
		
		
		dep30.setManager(emp114);	
		
		System.out.println("emp116 su apellido, su nombre de trabajo y su nombre de departamento");
		System.out.println(emp116.getLastName());
		System.out.println(emp116.getJob().getJobTitle());
		System.out.println(emp116.getDepartment().getDepartmentName());
		System.out.println("del emp116 su apellido, el apellido de mi jefe, el apellido de mi jefe de departamento");
		System.out.println(emp116.getLastName());
		System.out.println(emp116.getMyBoss().getLastName());
		System.out.println(emp116.getDepartment().getManager().getLastName());
		System.out.println("la region del emp 116");
		System.out.println(emp116.getDepartment().getLocation().getCountry().getRegion().getRegionName());
		System.out.println("la region del my boss del 116");
		System.out.println(emp116.getMyBoss().getDepartment().getLocation().getCountry().getRegion());
		
		
		

	}

}
