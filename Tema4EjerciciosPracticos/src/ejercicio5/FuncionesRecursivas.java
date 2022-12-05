package ejercicio5;

public class FuncionesRecursivas {
	
	//Valor de entrada dado en MetodoMain que ira modificandose con la funcion recursiva
	static int sumatorio (int numero) { 
		
		//Declaro variable y la inicializo con valor igual a parametro entrada numero
		int resultado=numero;
		
		//Establezco condicion si numero igual a 0 
		if (numero == 0) {
			//Que de cumplirse dara a resultado valor igual a 0
			resultado=0;
		}
		else {
			//De no cumplirse la condicion anterior, resultado tomara el valor de
			//numero y llamara a la funcion sumatorio, que se ejecutara restando 1
			//al valor de numero, este nuevo valor se sumara a resultado otra vez y 
			//acto seguido se volvera a llamar a la funcion sumatorio que se ejecutara 
			//restando 1 al valor de numero, seguira haciendo esto hasta que numero 
			//tome de valor 0 lo cual cumplira la condicion de if al inicio ed la funcion
			//finalizando la funcion dandonos un return 
			//con la variable resultado conteniendo el valor deseado
				resultado=numero+sumatorio(numero-1);
			}
			return (resultado);
		}
	
	static double potencia (double a, int n) {
		
		//crear otra variable?
		double resultado=0;
		
		if (n==0) {
			resultado=1; 
			
			}  else {
		
			resultado=a*potencia(a,n-1);	
			
			
		}
		return (resultado);
	}

	/*if posi<=1
			resultado 1
			else
			resultado fibo (posi -1) fibo (posi -2)*/
	
	static int serieFibonacci (int numero) {
		
		int resultado=0;
		
		
		
		if (numero<=1) {
			resultado=1;
			
		} else {
			
	
			
			resultado=serieFibonacci(numero-1) + serieFibonacci(numero-2);
			
		}
		return (resultado);
	}
	
}
