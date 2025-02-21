package ejecutables;

public class Ejercicio03_operadoresaritmeticos {

	public static void main(String[] args) {
		int a = 3, b=5 , resultado=0;
	//	a++;
	//	b--;
	//	System.out.println("a tiene : " + a);
	//	System.out.println("a tiene : " + b);
	
		
	/*	
		resultado = a++;
		
		System.out.println("resultado tiene : " + resultado);
		System.out.println("a tiene : " + a);
		resultado = ++b;
		System.out.println("resultado tiene : " + resultado);
		System.out.println("b tiene : " + b);
		
	*/
		
		resultado = ++b +a++;
		System.out.println("resultado tiene : " + resultado);
		System.out.println("a tiene : " + a);
		System.out.println("b tiene : " + b);
		
	}
}
