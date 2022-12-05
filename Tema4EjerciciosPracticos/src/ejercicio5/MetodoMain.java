package ejercicio5;

import java.util.Scanner;

//Clase MetodoMain para probar la clase Numeros
public class MetodoMain {

	public static void main(String[] args) {
		
		int numeroIntroducido;//Declaro variable que guardara el valor que se dara al parametro de entrada en las funciones sumatorio (numero), potencia (n) y serieFibonacci (numero)
		
		double a;//Declaro variable que guardara el valor que se dara al parametro de entrada en la funcion potencia (base o numero que es elevado)
		
		//Creo escaner lo nombro dogma y lo importo
		Scanner dogma = new Scanner(System.in);
		
		//Solicito valor para variable mediante mensaje por pantalla
		System.out.println("Introduzca un numero entero :");
		
		//Doy valor a variable con escaner
		numeroIntroducido=dogma.nextInt();

		//Llamo a funcion estatica sumatorio indicando en que clase esta (FuncionesRecursivas) 
		//y dandole variable numeroIntroducido como parametro de entrada
		System.out.println("La suma de todos los anteriores al numero "
				+ "introducido mas el introducido es: " + FuncionesRecursivas.sumatorio(numeroIntroducido));
		
		//Solicito valor para variable mediante mensaje por pantalla
		System.out.println("Introduzca un numero que sera la base :");
		
		//Doy valor a variable con escaner
		a = dogma.nextDouble();
		
		//Solicito valor para variable mediante mensaje por pantalla
		System.out.println("Introduzca un numero que sera la exponente :");
		
		//Doy valor a variable con escaner
		numeroIntroducido =  dogma.nextInt();
		
		//Llamo a funcion estatica potencia indicando en que clase esta (FuncionesRecursivas) 
		//y dandole variable a y variable numeroIntroducido como parametros de entrada
		System.out.println("La potencia del numero introducido es: " + FuncionesRecursivas.potencia(a,numeroIntroducido));
		
		//Solicito valor para variable mediante mensaje por pantalla
		System.out.println("Introduzca un numero entero :");
		
		//Doy valor a variable con escaner
		numeroIntroducido=dogma.nextInt();

		//Llamo a funcion estatica serieFibonacci indicando en que clase esta (FuncionesRecursivas) 
		//y dandole variable numeroIntroducido como parametro de entrada
		System.out.println("La secuencia Fibonacci hasta ese numero es: " + FuncionesRecursivas.serieFibonacci(numeroIntroducido));
		
		//Cierro escaner
		dogma.close();
	}

}
