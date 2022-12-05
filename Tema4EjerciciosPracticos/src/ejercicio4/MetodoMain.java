package ejercicio4;

import java.util.Scanner;

//Clase MetodoMain para probar la clase Operaciones
public class MetodoMain {

	public static void main(String[] args) {
		
		//Creo objeto (funciones) con el que llamar a las funciones que esten dentro de la clase (Operaciones)
		Operaciones funciones = new Operaciones();
		
		//Creo escaner lo nombro dogma y lo importo
		Scanner dogma= new Scanner(System.in);
		
		//Solicito valor para variable mediante mensaje por pantalla
		System.out.println("Introduzca valor para variable numero1: ");
		
		//Doy valor a variable no estatica global (numero1) que esta dentro de una clase usando objeto (funciones) para llamar a su clase (Operaciones) 
		//y le doy valor con escaner 
		funciones.numero1=dogma.nextDouble();
		
		//Solicito valor para variable mediante mensaje por pantalla
		System.out.println("Introduzca valor para variable numero2: ");
		
		//Doy valor a variable no estatica global (numero2) que esta dentro de una clase usando objeto (funciones) para llamar a su clase (Operaciones) 
		//y le doy valor con escaner 
		funciones.numero2=dogma.nextDouble();
		
		//Llamo a funcion (sumar) que esta dentro de una clase usando objeto (funciones) para llamar a su clase (Operaciones) 
		System.out.println(("El resultado de la suma de esas dos variables es: " + funciones.sumar()));
		
		//Llamo a funcion (restar) que esta dentro de una clase usando objeto (funciones) para llamar a su clase (Operaciones) 
		System.out.println(("El resultado de la resta de esas dos variables es: " + funciones.restar()));
		
		//Llamo a funcion (multiplicar) que esta dentro de una clase usando objeto (funciones) para llamar a su clase (Operaciones) 
		System.out.println(("El resultado de la multiplicacion de esas dos variables es: " + funciones.multiplicar()));
		
		//Llamo a funcion (dividir) que esta dentro de una clase usando objeto (funciones) para llamar a su clase (Operaciones) 
		System.out.println(("El resultado de la division de esas dos variables es: " + funciones.dividir()));
		
		//Cierro escaner
		dogma.close();

	}

}
