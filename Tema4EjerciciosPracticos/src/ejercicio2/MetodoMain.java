package ejercicio2;

import java.util.Scanner;

public class MetodoMain {

	public static void main(String[] args) {
		
		Scanner dogma = new Scanner(System.in);
		
		System.out.println("Introduzca el radio para calcular la superficie: ");
		
		Esfera.radio = dogma.nextDouble();
		
		System.out.println(Esfera.Superficie());
		
		System.out.println("Introduzca el radio para calcular el Volumen: ");
		
		Esfera.radio = dogma.nextDouble();
		
		System.out.println(Esfera.Volumen());
		
		dogma.close();

	}

}
