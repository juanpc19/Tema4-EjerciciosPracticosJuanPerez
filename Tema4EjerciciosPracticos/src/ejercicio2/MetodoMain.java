package ejercicio2;

import java.util.Scanner;

//Clase MetodoMain para probar la clase Esfera
public class MetodoMain {

	public static void main(String[] args) {
		
		//Creo escaner lo nombro dogma y lo importo
		Scanner dogma = new Scanner(System.in);
		
		//Solicito valor para variable radio mediante mensaje por pantalla
		System.out.println("Introduzca el radio para calcular la superficie: ");
		
		//Doy valor usando el escaner a variable estatica global radio indicando que en que clase esta (Esfera) 
		Esfera.radio = dogma.nextDouble();
		
		//Llamo a funcion estatica superficie indicando en que clase esta (Esfera)
		System.out.println(Esfera.superficie());
		
		//Solicito valor para variable radio mediante mensaje por pantalla
		System.out.println("Introduzca el radio para calcular el Volumen: ");
		
		//Doy valor usando el escaner a variable estatica global radio indicando que en que clase esta (Esfera) 
		Esfera.radio = dogma.nextDouble();
		
		//Llamo a funcion estatica volumen indicando en que clase esta (Esfera)
		System.out.println(Esfera.volumen());
		
		//Cierro escaner
		dogma.close();

	}

}
