package ejercicio1;

import java.util.Scanner;

public class MetodoMain {

	public static void main(String[] args) {
		
		//Declaro variable para llamar a funcion
		int numeroIntroducido;

		//Creo escaner
		Scanner dogma = new Scanner(System.in);
		
		//Creo objeto (funciones) con el que llamar a las funciones que esten dentro de la clase (Numeros) que contiene las funciones 
		Numeros funciones = new Numeros();
		
		//Solicito valor para variable
		System.out.println("Introduzca un numero entero positivo mayor a 1: ");
		
		//Doy valor a variable con escaner
		numeroIntroducido = dogma.nextInt();
		
		//Imprimo mensaje con el objeto "funciones" que llamara a las funciones que esten dentro de la clase "Numeros"
		//En este caso le indico que solo llame a una funcion de las dos que hay en la clase, a "esPrimo"
		//Añado un ternario para mejor presentacion
		System.out.println(funciones.esPrimo(numeroIntroducido) ? "El numero es primo" : "El numero no es primo");

		
		dogma.close();
	}

}
