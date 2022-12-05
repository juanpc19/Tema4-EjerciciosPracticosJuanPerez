package ejercicio3;

import java.util.Scanner;

//Clase MetodoMain para probar la clase NumerosAleatorios
public class MetodoMain {

	public static void main(String[] args) {

		int numeroIntroducido;//Declaro variable donde guardare el primer numero introducido
		
		int numeroIntroducido2;//Declaro variable donde guardare el segundo numero introducido
		
		int numeroIntroducido3;//Declaro variable donde guardare el tercer numero introducido
		
		//Creo escaner lo nombro dogma y lo importo
		Scanner dogma = new Scanner(System.in);
		
		//Solicito valor para variable mediante mensaje por pantalla
		System.out.println("Introduzca un numero entero: ");
		
		//Doy valor a variable con escaner
		numeroIntroducido = dogma.nextInt();
		
		//Llamo a funcion estatica numerosAleatorios indicando en que clase esta (NumeroAleatorios) 
		//y dandole variable numeroIntroducido como parametro de entrada
		NumeroAleatorios.numerosAleatorios (numeroIntroducido);
		
		//Solicito valor para variable mediante mensaje por pantalla
		System.out.println("Introduzca un numero entero: ");
		
		//Doy valor a variable con escaner
		numeroIntroducido = dogma.nextInt();
		
		//Solicito valor para variable mediante mensaje por pantalla
		System.out.println("Introduzca otro numero entero: ");
		
		//Doy valor a variable con escaner
		numeroIntroducido2 = dogma.nextInt();
		
		//Llamo a funcion estatica numerosAleatorios indicando en que clase esta (NumeroAleatorios)
		//y dandole variables numeroIntroducido y numeroIntroducido2 como parametros de entrada
		NumeroAleatorios.numerosAleatorios (numeroIntroducido, numeroIntroducido2);
		
		//Solicito valor para variable mediante mensaje por pantalla
		System.out.println("Introduzca un numero entero: ");
		
		//Doy valor a variable con escaner
		numeroIntroducido = dogma.nextInt();
		
		//Solicito valor para variable mediante mensaje por pantalla
		System.out.println("Introduzca segundo numero entero: ");
		
		//Doy valor a variable con escaner
		numeroIntroducido2 = dogma.nextInt();
		
		//Solicito valor para variable mediante mensaje por pantalla
		System.out.println("Introduzca tercer numero entero: ");
		
		//Doy valor a variable con escaner
		numeroIntroducido3 = dogma.nextInt();
		
		//Llamo a funcion estatica numerosAleatorios indicando en que clase esta (NumeroAleatorios)
		//y dandole variables numeroIntroducido, numeroIntroducido2 y numeroIntroducido3 como parametros de entrada
		NumeroAleatorios.numerosAleatorios (numeroIntroducido, numeroIntroducido2, numeroIntroducido3);
		
		//Cierro escaner
		dogma.close();

	}

}
