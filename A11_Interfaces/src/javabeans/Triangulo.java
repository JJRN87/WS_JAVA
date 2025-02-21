package javabeans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import negocio.IFiguras;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Triangulo implements IFiguras{
	
	private double lado1;
	private double lado2;
	private double lado3;
	
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public double volumen() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	//ESTE ES UN EJEMPLO QUE REALIZÓ EN CLASE.
}
