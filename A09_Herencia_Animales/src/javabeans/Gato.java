package javabeans;

public class Gato extends Animal {
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
	
	//por otro lado, tenemos que hacer overdrive de sonido, es decir, reescribitrlo, ya que los gatos sabemos el sonido
	//que haces. Por otro lado, el nombre cientifico nos lo quedamos
	//equals y hascode - -> no se reescribe, matricula tiene todos los animales
	//ToString -> hay que reescribirlo
	
	
	
	
	
	
}
