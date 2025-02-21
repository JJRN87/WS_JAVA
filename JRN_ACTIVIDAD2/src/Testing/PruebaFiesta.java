package Testing;

import javabean.Fiesta;

public class PruebaFiesta {
	
	// Se añaden datos para fiesta1 y fiesta 2 con los datos que tenemos para las fiestas
	// el primero añadiendo por campos a rellenar, y el segundo con el constructor
	public static void main(String[] args) {
	Fiesta fiesta1, fiesta2;
	
	fiesta1 = new Fiesta();
	fiesta1.setBebidas(30);
	fiesta1.setBocadillos(40);
	fiesta1.setDireccion("Calle AC/DC , Leganés");
	fiesta1.setFechaHora("31/07/2025 20:30");
	fiesta1.setInvitados(666);
	fiesta1.setTipoFiesta("rock&roll");
	System.out.println(fiesta1);
	
	fiesta2 = new Fiesta("Infatil", "C/ Rueda 19, Madrid", 20 , 20, 15, "01/08/2025 15:30");
	System.out.println(fiesta2);
	
	// Se calculan los precios de las dos fiestas
	
	System.out.println("La fiesta rock&roll cuesta : " + fiesta1.precioFiesta() + "€");
	System.out.println("La fiesta infantil cuesta : " + fiesta2.precioFiesta() + "€");
	
	// Se prueban los métodos de invitar. En la fiesta 1 se prueba el método de invitar 1 y restar 1
	// En la fiesta 2, se invitan a 20 y se cancela la invitación de 16
	
	fiesta1.invitar();
	fiesta2.invitar(20);
	fiesta1.cancelarInvitacion();
	fiesta2.cancelarInvitacion(16);
	
	System.out.println("El precio final de la fiesta Rock&roll : " + fiesta1.precioFiesta() + " € ");
	System.out.println("La fiesta infatil, con invitaciones finales cuesta : " + fiesta2.precioFiesta() +" € ");
	System.out.println("La fiesta Rock & Roll, tiene un total de : " + fiesta1.getInvitados()+ " invitados");
	System.out.println("La fiesta Infatil, tiene un total de : " + fiesta2.getInvitados()+ " invitados");
	
	}

}
