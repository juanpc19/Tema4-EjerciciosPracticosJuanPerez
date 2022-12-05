package ejercicio5;

import java.util.Scanner;

public class MetodoMain {

	public static void main(String[] args) {
		
		int numeroIntroducido;
		
		double a;
		
		int n;
		
		Scanner dogma = new Scanner(System.in);
		
		System.out.println("Introduzca un numero entero :");
		
		numeroIntroducido=dogma.nextInt();

		System.out.println("La suma de todos los anteriores al numero "
				+ "introducido mas el introducido es: " + FuncionesRecursivas.sumatorio(numeroIntroducido));
		
		System.out.println("Introduzca un numero que sera la base :");
		
		a = dogma.nextDouble();
		
		System.out.println("Introduzca un numero que sera la exponente :");
		
		numeroIntroducido =  dogma.nextInt();
		
		System.out.println("La potencia del numero introducido es: " + FuncionesRecursivas.potencia(a,numeroIntroducido));
		
		System.out.println("Introduzca un numero entero :");
		
		numeroIntroducido=dogma.nextInt();

		System.out.println("La secuencia Fibonacci hasta ese numero es: " + FuncionesRecursivas.serieFibonacci(numeroIntroducido));
		
		dogma.close();
	}

}
