package testing;

import java.time.LocalDate;

import javabeans.Country;
import javabeans.Deparment;
import javabeans.Employee;
import javabeans.Job;
import javabeans.Location;
import javabeans.Region;

public class TestEmpresa {

	public static void main(String[] args) {
		Region region1 = new Region(1, "Europa");
		Country espania = new Country("SP", "España", region1);
		Location loc1500 = new Location(1500, "Pez 3", "28007", "Madrid", "28", espania);
		Job job = new Job("IT_Prog", "Analista Programador", 18_000, 35_000);
		Deparment dep30 = new Deparment(30, "Ventas", null, loc1500);
		Employee emp114 = 
		new Employee(114, "Esteban", "Raphaelly", "est@fp.com", "678101010", LocalDate.of(1998, 4, 20),job,35_000, 0.2, null, dep30);
		Employee emp115 = 
		new Employee(114, "Ana", "Koo", "ana@fp.com", "678101011", LocalDate.of(1999, 4, 20),job,30_000, 0.1, emp114, dep30);
		Employee emp116 = 
		new Employee(114, "Eva", "Baida", "eva@fp.com", "678101012", LocalDate.of(1999, 4, 17),job,25_000, 0.3, emp114, dep30);
	
	
		dep30.setManager(emp114);
	
		System.out.println("Emp116 su apellido, su nombre de trabajo, y su nombre de departamento");
		System.out.println(emp116.getLastName());
		System.out.println(emp116.getJob().getJobTitle());
		System.out.println(emp116.getDeparment().getDeparmentName());
		System.out.println("Del emp116 su apellido, el apellido de mi jefe, y el apellido de mi jefe de departamento");
		System.out.println(emp116.getLastName());
		System.out.println(emp116.getMyBoss().getLastName());
		System.out.println(emp116.getDeparment().getManager().getLastName());
		System.out.println("La region del emp 116");
		System.out.println(emp116.getDeparment().getLocation().getCountry().getRegion().getRegionName());
		System.out.println("la región del myboss del 116");
		System.out.println(emp116.getMyBoss().getDeparment().getLocation().getCountry().getRegion());
	}
	

	
	

}
