package ejercicio4;

import java.util.Scanner;

public class MetodoMain {

	public static void main(String[] args) {
		
		//Creo objeto para llamar a funcion operacion y lo nombro funciones
		Operaciones funciones = new Operaciones();
		
		Scanner dogma= new Scanner(System.in);
		
		System.out.println("Introduzca valor para variable numero1: ");
		
		//Para dar valor a variable global dentro de una clase no estatica usar objeto para llamar a clase y dar valor con escaner o a mano
		funciones.numero1=dogma.nextDouble();
		
		System.out.println("Introduzca valor para variable numero2: ");
		
		//Para dar valor a variable global dentro de una clase usar objeto para llamar a clase y dar valor con escaner o a mano
		funciones.numero2=dogma.nextDouble();
		
		//Para llamar a funcion dentro de clase usar objeto para llamar a clase y luego especificar funcion dentro de la misma
		System.out.println(("El resultado de la suma de esas dos variables es: " + funciones.sumar()));
		
		//Para llamar a funcion dentro de clase usar objeto para llamar a clase y luego especificar funcion dentro de la misma
		System.out.println(("El resultado de la resta de esas dos variables es: " + funciones.restar()));
		
		//Para llamar a funcion dentro de clase usar objeto para llamar a clase y luego especificar funcion dentro de la misma
		System.out.println(("El resultado de la multiplicacion de esas dos variables es: " + funciones.multiplicar()));
		
		//Para llamar a funcion dentro de clase usar objeto para llamar a clase y luego especificar funcion dentro de la misma
		System.out.println(("El resultado de la division de esas dos variables es: " + funciones.dividir()));
		
		dogma.close();

	}

}
