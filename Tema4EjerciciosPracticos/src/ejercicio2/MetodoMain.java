package ejercicio2;

import java.util.Scanner;

public class MetodoMain {

	public static void main(String[] args) {
		
		double radio;
		
		Scanner dogma = new Scanner(System.in);
		
		System.out.println("Introduzca el radio para calcular la superficie: ");
		
		radio = dogma.nextDouble();
		
		System.out.println(Esfera.Superficie(radio));
		
		System.out.println("Introduzca el radio para calcular el Volumen: ");
		
		radio = dogma.nextDouble();
		
		System.out.println(Esfera.Volumen(radio));
		
		dogma.close();

	}

}
