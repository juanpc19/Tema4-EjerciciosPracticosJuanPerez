package ejercicio3;

//Clase NumeroAleatorios que contiene funcione numerosAleatorios con diferentes parametros de entrada para diferente uso
public class NumeroAleatorios {
	
	//Creo funcion estatica de tipo void llamada numerosAleatorios cuya finalidad imprimir por pantalla numeros aleatorios entre 0 y 1 
	//tantas veces como se le indique en su parametro de entrada que sera la variable tipo int iteraciones 
	static void numerosAleatorios (int iteraciones) {
		
		//Bucle para tantas iteraciones como valor de variable iteraciones
		for (int i=1; i<=iteraciones; i++) {
			
			//Print por pantalla con numero random entre 0 y 1 cada iteracion
			System.out.println(Math.random());
		}
	}
	
	//Creo funcion estatica de tipo void llamada numerosAleatorios cuya finalidad imprimir por pantalla numeros aleatorios entre 0 y maximo 
	//con un valor maximo indicado en su parametro de entrada numero 2 que sera la variable tipo int maximo,
	//tantas veces como se le indique en su parametro de entrada numero 1 que sera la variable tipo int iteraciones 
	static void numerosAleatorios (int iteraciones, int maximo) {
		
		int numero;//Declaro la variable en la que guardare el numero a imprimir por pantalla
		
		//Bucle para tantas iteraciones como valor de variable iteraciones
		for (int i=1; i<=iteraciones; i++) {
			
			//Doy a variable numero un valor aleatorio entre 1 y 100 aplicando cast a la clase Math.random que devuelve variable tipo double
			numero = (int) (Math.random()*100);
			
			//Establezco condicion: si variable numero mayor que variable maximo
			if (numero>maximo) {
				
				//Que de cumplirse hara Print por pantalla con numero de valor maximo cada iteracion
				System.out.println(maximo);
				
				//De no cumplirse la condicion anterior
				} else {
					
					//Se hara Print por pantalla con numero random entre 0 y uno menos que maximo cada iteracion
					System.out.println(numero);
			}
		}
	}
	
	//Creo funcion estatica de tipo void llamada numerosAleatorios cuya finalidad imprimir por pantalla numeros aleatorios entre 0 y maximo 
	//con un valor maximo indicado en su parametro de entrada numero 3 que sera la variable tipo int maximo,
	//con un valor minimo indicado en su parametro de entrada numero 2 que sera la variable tipo int minimo,
	//tantas veces como se le indique en su parametro de entrada numero 1 que sera la variable tipo int iteraciones 
	static void numerosAleatorios (int iteraciones, int minimo, int maximo) {
		
		//Declaro la variable en la que guardare el numero a imprimir por pantalla
		int numero;
		
		//Bucle para tantas iteraciones como valor de variable iteraciones
		for (int i=1; i<=iteraciones; i++) {
				
			//Doy a variable numero un valor aleatorio entre 1 y 100 aplicando cast a la clase Math.random que devuelve variable tipo double
			numero = (int) (Math.random()*100);
				
			//Establezco condicion: si variable numero mayor que variable maximo
			if (numero>maximo) {
				//Que de cumplirse hara Print por pantalla con numero de valor maximo cada iteracion
				System.out.println(maximo);
					
				//Establezco condicion: si variable numero mayor que variable minimo
				} else if (numero<minimo) {
					//Que de cumplirse hara Print por pantalla con numero de valor minimo cada iteracion
					System.out.println(minimo);
					
					//De no cumplirse las condiciones anteriores
					} else {
						
					//Se hara Print por pantalla con numero random entre minimo y maximo cada iteracion
					System.out.println(numero);
				}
		}
	}
	
	
}
