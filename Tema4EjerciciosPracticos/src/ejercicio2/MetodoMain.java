package ejercicio2;

import java.util.Scanner;

public class MetodoMain {

	public static void main(String[] args) {
		
		double radio;
		
		double radio2; //hace falta segunda variable?????
		
		Scanner dogma = new Scanner(System.in);
		
		Esfera funciones = new Esfera();
		
		System.out.println("Introduzca el radio para calcular la superficie: ");
		
		radio = dogma.nextDouble();
		
		System.out.println(funciones.Superficie(radio));
		
		System.out.println("Introduzca el radio para calcular el Volumen: ");
		
		radio2 = dogma.nextDouble();
		
		System.out.println(funciones.Volumen(radio));
		
		

	}

}
