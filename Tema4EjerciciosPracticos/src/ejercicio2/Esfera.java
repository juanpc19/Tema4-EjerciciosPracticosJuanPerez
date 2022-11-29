package ejercicio2;

public class Esfera {
	
	static double radio;
	
	static double Superficie (radio) {
		double superficie;
		
		superficie = 4*Math.PI*Math.pow(radio, 2);
		
		return (superficie);
	}
	
	static double Volumen (radio) {
		double volumen;
		
		Volumen = (4*Math.PI/3)*Math.pow(radio, 3);
		
		return (volumen);
	}
	
	
}
