package Testing;


import java.time.LocalDate;
import javabeans.Banco;
import javabeans.Cliente;
import javabeans.DireccionCliente;
import javabeans.Factura;
import javabeans.Pais;
import javabeans.Pedido;
import javabeans.TarjetaBancaria;

public class Test {

	public static void main(String[] args) {
		Pais SP = new Pais (1,"España");
		Pais FR = new Pais (2, "Francia");
		Banco Santander = new Banco(10,"Banco Santander", SP);
		Banco BBVA = new Banco (20,"Banco Bilbao Vizcaya Argentaria", FR);
		DireccionCliente Dir1 = new DireccionCliente("C/PEZ 4", "Madrid", "Madrid", SP);
		Cliente cli1 = new Cliente("Pescadería total", "Julia montero", "pescadería@pesca.com", LocalDate.of(2008, 10, 12), Dir1, new TarjetaBancaria(2222L, 1992, 5, 199, "Perico Perez", Santander));
		Factura fac1 = new Factura("1001", "Factura Percebes", LocalDate.now(), new Pedido(50, LocalDate.now(), "Aceptado y pagado", cli1));
		
		System.out.println(fac1.getDescripcion());
		System.out.println(fac1.getPedido().getEstado());
		System.out.println(fac1.getPedido().getCreateAt());
		System.out.println(fac1.getPedido().getCliente().getNombre());
		System.out.println(fac1.getPedido().getCliente().getDireccion());
		System.out.println(fac1.getPedido().getCliente().getTitularTarjeta().getNumero());
		System.out.println(fac1.getPedido().getCliente().getTitularTarjeta().getTitularTarjeta());
		System.out.println(fac1.getPedido().getCliente().getTitularTarjeta().getBanco().getNombre());
		System.out.println(fac1.getPedido().getCliente().getTitularTarjeta().getBanco().getPaisOpera().getNombre());
		System.out.println(fac1.getPedido().getCliente().getDireccion().getPais().getNombre());
		
		
		
		
		
		
	}

}
