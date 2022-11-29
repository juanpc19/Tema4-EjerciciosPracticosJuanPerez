package ejercicio1;

public class Numeros {
	
	boolean esPrimo (int numero) {
		boolean primo = true; 
		
		if (numero==1) {
			primo=false;
		} else {
			for (int i=2; i<numero; i++) {
		
			if (numero%i==0) {
				primo=false;
				break;
				}
			}
		}
		return (primo);
	}
		
	boolean esCapicua (int numero) {
		
		
		boolean	capicua=false; //Declaro variable en la que guardare respueste de si es capicua e inicializo la variable con valor false
		
		int auxiliar;
		
		int cifra;
		
		int inverso=0;
		
		auxiliar = numero;
		
		//Creo bucle while con condicion auxiliar mayor a 0
		while (auxiliar>0) {
			
		//Doy a variable cifra un valor igual a resto de variable auxiliar dividido entre 10
		//Extrae la ultima cifra de auxiliar
		cifra = auxiliar%10;
		
		//Doy valor a variable inverso igual a multipliplicacion de variable inverso por 10 mas variable cifra
		//Añade cifra a inverso
		inverso = inverso*10 + cifra;
		
		//Doy valor a variable auxiliar igual a variable auxiliar dividido entre 10
		//Da nuevo valor a auxiliar para extraer siguiente cifra o finalizar bucle
		auxiliar = auxiliar/10;
		}
		
		//Establezco la concicion numero igual a inverso
		if (numero==inverso) {
			//Que de cumplirse da a capicua valor tru
			capicua=true;
		} 
		return (capicua);
	}
}
