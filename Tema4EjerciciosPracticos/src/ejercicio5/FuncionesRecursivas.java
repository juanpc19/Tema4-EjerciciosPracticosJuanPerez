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
		
		double resultado=0;
		
		if (n==0) {
			resultado=0; //Este estaria bien que devolviera resultado=1 si n=0
		} else {
			
			resultado=a+potencia(a+(2*a),n-1);	
			
		}
		return (resultado);
	}

	/*static int serieFibonacci (int numero) {
		
		int fibonacci1=0;
		int fibonacci2=1;
		int auxiliar=0;
		
		
		if (numero==auxiliar) {
			System.out.print(" " + fibonacci1);
			
		} else {
			System.out.print(fibonacci2+serieFibonacci());
			
			
			while (numero > 2) {
				aux = fibonacci1;
				fibonacci1 = fibonacci2;
				fibonacci2 = aux + fibonacci2;
				System.out.print(" " + fibonacci2);
				numero--;
		}
		*/
	
}
