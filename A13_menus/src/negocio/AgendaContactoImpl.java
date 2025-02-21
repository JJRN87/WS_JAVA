package negocio;

import java.util.ArrayList;
import java.util.List;

import javabean.Contacto;

public class AgendaContactoImpl implements IAgendaContacto {
	private List<Contacto> lista;
	
	public AgendaContactoImpl() {
		lista = new ArrayList<Contacto>();
		cargarDatos();
	}
	
	private void cargarDatos() {
		lista.add(new Contacto("Eva", "678678678"));
		lista.add(new Contacto("Carlos", "678678677"));
		lista.add(new Contacto("Sara", "678678679"));
	}

	@Override
	public List<Contacto> todos() {
		// TODO Auto-generated method stub
		return lista;
	}

	@Override
	public boolean altaContacto(Contacto contacto) {
		if (lista.contains(contacto))
			return false;
		else
			return lista.add(contacto);
	}

	@Override
	public Contacto buscarContacto(String nombre) {
		for (Contacto contacto: lista) {
			if (contacto.getNombre().equals(nombre))
				return contacto;
		}
		return null;
	}

	@Override
	public int modificarContacto(Contacto contacto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int eleminarContacto(String nombre) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Contacto> buscarPorTelefono(String Telefono) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Contacto> buscarPorSubcadenaNombre(String subCadena) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
