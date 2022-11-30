package ejercicio3;

import java.util.Scanner;

public class MetodoMain {

	public static void main(String[] args) {

		int numeroIntroducido;
		
		int numeroIntroducido2;
		
		int numeroIntroducido3;
		
		Scanner dogma = new Scanner(System.in);
		
		System.out.println("Introduzca un numero entero: ");
		
		numeroIntroducido = dogma.nextInt();
		
		NumeroAleatorios.numerosAleatorios (numeroIntroducido);
		
		System.out.println("Introduzca un numero entero: ");
		
		numeroIntroducido = dogma.nextInt();
		
		System.out.println("Introduzca otro numero entero: ");
		
		numeroIntroducido2 = dogma.nextInt();
		
		NumeroAleatorios.numerosAleatorios (numeroIntroducido, numeroIntroducido2);
		
		System.out.println("Introduzca un numero entero: ");
		
		numeroIntroducido = dogma.nextInt();
		
		System.out.println("Introduzca segundo numero entero: ");
		
		numeroIntroducido2 = dogma.nextInt();
		
		System.out.println("Introduzca tercer numero entero: ");
		
		numeroIntroducido3 = dogma.nextInt();
		
		NumeroAleatorios.numerosAleatorios (numeroIntroducido, numeroIntroducido2, numeroIntroducido3);
		
		dogma.close();

	}

}
