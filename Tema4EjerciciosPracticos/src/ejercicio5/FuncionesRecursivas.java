package ejercicio5;

//Clase FuncionesRecursivas que contiene funciones sumatorio, potencia y serieFibonacci
public class FuncionesRecursivas {
	
	//Creo funcion estatica de tipo int llamada sumatorio cuya finalidad sera devolverme el valor de la suma total de numero y todos sus anteriores,
	//tendra como parametro de entrada una variable tipo int llamada numero y me retornara un valor de tipo int
	static int sumatorio (int numero) { 
		
		//Declaro variable en la que guardare la suma total de numero y todos sus anteriores y la inicializo con valor igual a variable numero
		//sera la variable usada en el return
		int resultado=numero;
		
		//Establezco condicion si numero igual a 0 (caso base que finaliza parte recursiva de la funcion)
		if (numero == 0) {
			
			//Que de cumplirse dara a resultado valor igual a 0
			resultado=0;
			
		} else {
			//De no cumplirse la condicion anterior se llamara a la funcion sumatorio, que se ejecutara restando 1
			//al valor de numero, seguira haciendo esto hasta que numero tome de valor 0 lo cual cumplira la condicion de if (caso base) 
			//al inicio de la funcion, momento en el que hara el proceso inverso sumando los valores desde 0 hasta el valor original de numero-1
			//a la variable numero finalizando la funcion y dandonos un return con la variable resultado conteniendo el sumatorio el numero introducido
				resultado=numero+sumatorio(numero-1);
			}
			//Devuelvo el valor de variable resultado
			return (resultado);
		}
	
	//Creo funcion estatica de tipo double llamada potencia cuya finalidad sera devolverme el valor de la suma total de numero y todos sus anteriores,
	//tendra como parametros de entrada  una variable tipo double llamada a y una variable tipo int llamada n y me retornara un valor de tipo double
	static double potencia (double a, int n) {
		
		double resultado=0;//Declaro la variable en la que guardare el resultado de a elevado a la potencia de n y la inicializo con valor 0
		//sera la variable usada en el return
		
		//Establezco la condicion si n igual a 0 (caso base que finaliza parte recursiva de la funcion)
		if (n==0) {
			
			//Que de cumplirse dara a variable resultado valor 1
			resultado=1; 
			
			} else {
			//De no cumplirse la condicion anterior se llamara a la funcion potencia, que se ejecutara restando 1 a variable n,
			//seguira haciendo esto hasta que numero tome de valor 0 lo cual cumplira la condicion de if (caso base) al inicio de la funcion,
			//momento en el que hara el proceso inverso multiplicando el valor original de a (que no cambiara) por el valor de a como parametro de entrada
			//en la funcion recursiva en su siguiente iteracion (donde si cambiara) hasta que variable n tome su valor original
			//momento en el que la funcion finalizara dandonos el valor de resultado (a elevado a la potencia de n)
			resultado=a*potencia(a,n-1);	
			
		}
		//Devuelvo el valor de variable resultado
		return (resultado);
	}
	
	//Creo funcion estatica de tipo int llamada serieFibonacci cuya finalidad sera devolverme el valor de la suma total de numero y todos sus anteriores,
	//tendra como parametrode entrada una variable tipo int llamada numero y me retornara un valor de tipo int
	static int serieFibonacci (int numero) {
		
		//Declaro la variable en la que guardare el término correspondiente de la serie de Fibonacci
		//sera la variable usada en el return
		int resultado=0;
		
		//Establezco la condicion si numero menor o igual a 1 (caso base que finaliza parte recursiva de la funcion)
		if (numero<=1) {
			
			//Que de cumplirse dara a variable resultado valor 1
			resultado=1;
			
		} else {
			//De no cumplirse la condicion anterior se llamara a la funcion serieFibonacci, que se ejecutara una vez restando 1 a variable numero
			//y otra vez restando 2 a variable numero,
			//seguira haciendo esto hasta que numero tome de valor 0 lo cual cumplira la condicion de if (caso base) al inicio de la funcion,
			//momento en el que hara el proceso inverso sumando los valores de numero+1 y numero+2 hasta que la suma total de estos sea igual al valor original de numero
			//momento en el que la funcion finalizara dandonos el valor de resultado 
			resultado=serieFibonacci(numero-1) + serieFibonacci(numero-2);
			
		}
		//Devuelvo el valor de variable resultado
		return (resultado);
	}
	
}
