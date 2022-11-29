package ejercicio1;

public class Numeros {
	//aqui se declararia una variable o una constante global
	
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
}
