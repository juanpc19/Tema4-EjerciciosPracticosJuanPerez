package ejercicio1;

import java.util.Scanner;

//Clase MetodoMain para probar la clase Numeros
public class MetodoMain {

	public static void main(String[] args) {
		
		
		int numeroIntroducido;//Declaro variable que guardara el valor que se dara al parametro de entrada en las funciones
		
		//Creo objeto (funciones) con el que llamar a las funciones que esten dentro de la clase (Numeros)
		Numeros funciones = new Numeros();
		
		//Creo escaner lo nombro dogma y lo importo
		Scanner dogma = new Scanner(System.in);
		
		//Solicito valor para variable mediante mensaje por pantalla
		System.out.println("Introduzca un numero entero positivo mayor a 1: ");
		
		//Doy valor a variable con escaner
		numeroIntroducido = dogma.nextInt();
		
		//Imprimo mensaje con el objeto "funciones" que llamara a una funcion no estatica dentro de la clase Numeros
		//En este caso le indico que solo llame a una funcion de las dos que hay en la clase, a "esPrimo"
		//Para ello uso el valor previamente guardado en la variable numeroIntroducido
		//Añado un ternario para mejor presentacion del valor devuelto
		System.out.println(funciones.esPrimo(numeroIntroducido) ? "El numero es primo." : "El numero no es primo.");

		//Solicito valor para variable mediante mensaje por pantalla
		System.out.println("Introduzca un numero entero positivo para comprobar si es capicua: ");
		
		//Doy valor a variable con escaner
		numeroIntroducido = dogma.nextInt();
		
		//Imprimo mensaje con el objeto "funciones" que llamara a una funcion no estatica dentro de la clase Numeros
		//En este caso le indico que solo llame a una funcion de las dos que hay en la clase, a "esCapicua"
		//Para ello uso el valor previamente guardado en la variable numeroIntroducido
		//Añado un ternario para mejor presentacion del valor devuelto
		System.out.println(funciones.esCapicua(numeroIntroducido) ? "El numero es capicua." : "El numero no es capicua.");
		
		//Cierro el escaner
		dogma.close();
	}

}
