package ejercicio3;

public class NumeroAleatorios {
	
	static void numerosAleatorios (int iteraciones) {
		for (int i=1; i<=iteraciones; i++) {
			System.out.println(Math.random());
		}
	}
	
	static void numerosAleatorios (int iteraciones, int maximo) {
		
		int numero;
		
		for (int i=1; i<=iteraciones; i++) {
			
			numero = (int) (Math.random()*100);
			
			if (numero>maximo) {
				System.out.println(maximo);
				
				} else {
					System.out.println(numero);
			}
		}
	}
	
	static void numerosAleatorios (int iteraciones, int minimo, int maximo) {
		
		int numero;
		
		for (int i=1; i<=iteraciones; i++) {
				
			numero = (int) (Math.random()*100);
				
			if (numero>maximo) {
				System.out.println(maximo);
					
				} else if (numero<minimo) {
					System.out.println(minimo);
					
					} else {
					System.out.println(numero);
				}
		}
	}
	
	
}
