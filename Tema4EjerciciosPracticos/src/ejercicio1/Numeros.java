package ejercicio1;

//Clase Numeros que contiene funciones esPrimo y esCapicua
public class Numeros {
	
	//Creo funcion no estatica de tipo boolean llamada esPrimo cuya finalidad sera decirme si un numero es primo o no,
	//tendra como parametro de entrada una variable tipo int llamada numero y me retornara un valor de tipo boolean
	boolean esPrimo (int numero) {
		
		boolean primo = true; //Declaro la variable primo que guardara la respuesta sobre si un numero es primo o no y la inicializo con valor false
		//sera la variable usada en el return
		
		//Establezco condicion si numero igual a 1
		if (numero==1) {
			
			//Que de cumplirse cambiara el valor de primo a false
			primo=false;
			
		} else {
			//De no cumplirse la condicion anterior se ejecutara un bucle for encargado de comprobar si el numero es primo o no
			//recorriendo todos los valores desde 2 hasta el numero introducido a incremento de +1
			for (int i=2; i<numero; i++) {
		
			//Establezco la condicion: de ser el modulo de la variable numero dividido entre uno de los valores tomados por i igual a 0 
			if (numero%i==0) {
				
				//Que de cumplirse dara a primo el valor false y hara break para finalizar el bucle y ahorarr iteraciones
				primo=false;
				break;
				}
			}
		}
		//Devuelvo el valor de variable primo
		return (primo);
	}
	
	//Creo funcion no estatica de tipo boolean llamada esCapicua cuya finalidad sera decirme si un numero es capicua o no,
	//tendra como parametro de entrada una variable tipo int llamada numero y me retornara un valor de tipo boolean
	boolean esCapicua (int numero) {
		
		//Declaro la variable capicua que guardara la respuesta sobre si un numero es capicua o no y la inicializo con valor false
		//sera la variable usada en el return
		boolean	capicua=false; //Declaro variable en la que guardare respueste de si es capicua e inicializo la variable con valor false
		
		int auxiliar;//Declaro variable que guardara el valor de variable numero
		
		int cifra;//Declaro la variable que guardara el valor de la ultima cifra de auxiliar
		
		int inverso=0;//Declaro la variable que guardara y añadira el valor de cifra en cada iteracion para darnos el numero con sus cifras en orden inverso
		
		//Doy a auxiliar el valor de la variable numero
		auxiliar = numero;
		
		//Creo bucle while con condicion auxiliar mayor a 0 que de dejar de cumplirse finalizara el bucle
		while (auxiliar>0) {
			
		//Doy a variable cifra un valor igual a resto de variable auxiliar dividido entre 10
		//lo que extrae la ultima cifra de auxiliar
		cifra = auxiliar%10;
		
		//Doy valor a variable inverso igual a multiplicacion de variable inverso por 10 mas variable cifra
		//Añade cifra a inverso
		inverso = inverso*10 + cifra;
		
		//Doy valor a variable auxiliar igual a variable auxiliar dividido entre 10
		//Da nuevo valor a auxiliar para extraer siguiente cifra o finalizar bucle
		auxiliar = auxiliar/10;
		}
		
		//Establezco la condicion numero igual a inverso
		if (numero==inverso) {
			//Que de cumplirse da a capicua valor true
			capicua=true;
		} 
		//Devuelvo el valor de variable capicua
		return (capicua);
	}
}
