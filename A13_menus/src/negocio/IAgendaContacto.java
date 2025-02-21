package negocio;

import java.util.List;

import javabean.Contacto;

public interface IAgendaContacto {
	// Apuntes del 04.02 y clase labotario 30.01
	// Interface genérico
	boolean altaContacto(Contacto contacto); 	//Create 
	Contacto buscarContacto(String nombre); 	//Read de uno
	int modificarContacto(Contacto contacto); 	//Update
	int eleminarContacto(String nombre); 		//Delete
	List<Contacto> todos();						//ReadAll
	
	List<Contacto> buscarPorTelefono(String Telefono);
	List<Contacto> buscarPorSubcadenaNombre(String subCadena);
	
	
}
