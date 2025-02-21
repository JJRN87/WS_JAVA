package javabeans;

public class Gato extends AbstractAnimal {
	private int vidas;

	public Gato() {
		super();
	}

	public Gato(int matricula, String nombreCientifico, int numeroPatas, int vidas) {
		super(matricula, nombreCientifico, numeroPatas);
		this.vidas = vidas;
	}

	public int getVidas() {
		return vidas;
	}

	public void setVidas(int vidas) {
		this.vidas = vidas;
	}

	@Override
	public String toString() {
		return "Gato [matricula=" + matricula + ", nombreCientifico=" + nombreCientifico + ", numeroPatas="
				+ numeroPatas + ", vidas=" + vidas + "]";
	}

	@Override
	public void sonido() {
		// TODO Auto-generated method stub
		System.out.println("Soy un gato y digo Miauuuu!!!");
	}
	
	public void aumentarVidas (int cantidad) {
		vidas += cantidad;
	}
	
	public void eleminarVidas (int cantidad) {
		vidas -= cantidad;
			
	}

	@Override // Esto acabo de autoimplementarlo, ya que te obliga el abstract animal.
	public void saludar() {
		System.out.println("Soy un gato y te saludo.");
		
	}
	

	
	
	
	
	
}
