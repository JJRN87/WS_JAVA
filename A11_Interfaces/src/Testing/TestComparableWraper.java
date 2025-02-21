package Testing;

public class TestComparableWraper {

	public static void main(String[] args) {
		String nombre1 = "tomas";
		String nombre2 = "Tomas";

		System.out.println(nombre2.compareTo(nombre1));
		
		// Solamente optaria por decirte +1 mayor, -1 menor y 0 igual
		Integer numero1 = 20;
		Integer numero2 = 3;
		System.out.println(numero1.compareTo(numero2));
	}

}
