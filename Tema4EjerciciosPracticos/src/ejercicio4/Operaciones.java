package ejercicio4;

//Clase Operaciones que contiene funciones: sumar, restar, multiplicar y dividir
public class Operaciones {
	
	double numero1; //Declaro variable no estatica global en la que guardare el valor de numero 1 introducido por el usuario en el MetodoMain 
	
	double numero2; //Declaro variable no estatica global en la que guardare el valor de numero 2 introducido por el usuario en el MetodoMain 
	
	//Creo funcion no estatica de tipo double llamada sumar cuya finalidad sera sumar numero1 y numero2,
	//no tendra parametro de entrada y me retornara un valor de tipo double
	double sumar () {
		
		//Declaro la variable suma que guardara el resultado de la suma de numero1 y numero2
		//sera la variable usada en el return
		double suma;
		
		//Doy a variable suma valor de suma de numero1 y numero2
		suma=numero1+numero2;
		
		//Devuelvo valor de variable suma
		return (suma);
	}
	
	//Creo funcion no estatica de tipo double llamada restar cuya finalidad sera restar numero1 y numero2,
	//no tendra parametro de entrada y me retornara un valor de tipo double
	double restar () {
		
		//Declaro la variable resta que guardara el resultado de la resta de numero1 y numero2
		//sera la variable usada en el return
		double resta;
		
		//Doy a variable resta valor de resta de numero1 y numero2
		resta=numero1-numero2;
		
		//Devuelvo valor de variable resta
		return (resta);
	}
	
	//Creo funcion no estatica de tipo double llamada multiplicar cuya finalidad sera multiplicar numero1 por numero2,
	//no tendra parametro de entrada y me retornara un valor de tipo double
	double multiplicar () {
		
		//Declaro la variable resta que guardara el resultado de la multiplicacion de numero1 por numero2
		//sera la variable usada en el return
		double multiplicacion;
		
		//Doy a variable multiplicacion valor de multiplicacion de numero1 y numero2
		multiplicacion=numero1*numero2;
		
		//Devuelvo valor de variable multiplicacion
		return (multiplicacion);
	}
	
	//Creo funcion no estatica de tipo double llamada dividir cuya finalidad sera dividir numero1 por numero2,
	//no tendra parametro de entrada y me retornara un valor de tipo double
	double dividir () {
		
		//Declaro la variable division que guardara el resultado de la division de numero1 por numero2
		//sera la variable usada en el return
		double division;
		
		//Doy a variable division valor de division de numero1 y numero2
		division=numero1/numero2;
		
		//Devuelvo valor de variable multiplicacion
		return (division);
	}

}
