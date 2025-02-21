package Testing;

import java.time.LocalDate;
import java.util.ArrayList;
import javabeans.Banco;
import javabeans.Cliente2;
import javabeans.DireccionCliente;
import javabeans.Pais;
import javabeans.TarjetaBancaria;

public class TestingCliente2 {

    public static void main(String[] args) {
        Pais SP = new Pais(1, "España");
        Pais FR = new Pais(2, "Francia");
        Banco Santander = new Banco(10, "Banco Santander", SP);
        Banco BBVA = new Banco(20, "Banco Bilbao Vizcaya Argentaria", FR);

        
        TarjetaBancaria tarjeta1 = new TarjetaBancaria(2222L, 1992, 12, 199, "El Fary", Santander);
        TarjetaBancaria tarjeta2 = new TarjetaBancaria(3333L, 2000, 11, 300, "El Fary", BBVA);
        TarjetaBancaria tarjeta3 = new TarjetaBancaria(4444L, 2008, 10, 150, "El Fary", Santander);

        ArrayList<TarjetaBancaria> listaTarjetas = new ArrayList<>();
        listaTarjetas.add(tarjeta1);
        listaTarjetas.add(tarjeta2);
        listaTarjetas.add(tarjeta3);

        DireccionCliente dir1 =	new DireccionCliente("C/PEZ", "MADRID", "MADRID", SP);
        Cliente2 cli1 = new Cliente2("01","El fary","elfary@elfary.com",LocalDate.of(1956, 12, 31),dir1,listaTarjetas);

       
        System.out.println("Nuestro cliente : " + cli1.getNombre() + " tiene las siguientes tarjetas :");
        for (TarjetaBancaria tarjeta : cli1.getTarjetas()) {
            System.out.println("número de tarjeta: " + tarjeta.getNumero());
            System.out.println("banco: " + tarjeta.getBanco().getNombre());
            System.out.println("pais del Banco: " + tarjeta.getBanco().getPaisOpera().getNombre());
            
        }
    }
}
