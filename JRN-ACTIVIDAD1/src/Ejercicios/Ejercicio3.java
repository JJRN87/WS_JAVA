package Ejercicios;

public class Ejercicio3 {

	public static void main(String[] args) {
		int numeroInicial=100;
		int resta=7;
		int finalnumero=0;
		int contador=0;
		int contadorpares=0;
		int sumacontador=0;
		
		while (numeroInicial >= finalnumero) {
			System.out.println("Estamos por el número : " + numeroInicial);
			sumacontador = numeroInicial+sumacontador;
			numeroInicial-=resta;
			contador++;
			if (numeroInicial %2==0) {
				contadorpares++;
			}
			
			
		}
		
		System.out.println("El número de veces que se resta : " + contador);
		System.out.println(("Han salido un total de "+ contadorpares + " números pares"));
		System.out.println("La suma de todos los números escritos es : " + sumacontador);
		
		
			
		}
		

	}

