package javabeans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import negocio.IFiguras;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class Cuadrado implements IFiguras, Comparable<Cuadrado>{
	private double lado;

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return lado * lado;
	}

	@Override
	public double volumen() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		return lado * 4;
	}

	//Esta última implementación, es por el Compare de arriba, y lo acaba genenrando.
	@Override
	public int compareTo(Cuadrado o) {
		// TODO Auto-generated method stub
		// return (int) (this.lado - o.lado); Cuidado que redondea, la mejor manera para saber si uno
		// es igual al otro, sería la siguiente formula 
		if (this.lado == o.lado)
			return 0;
		if (this.lado < o.lado)
			return -1;
		else
			return 1;
	}
	
}
