package ejercicio2;

//Clase Esfera que contiene funciones superficie y volumen
public class Esfera {
	
	static double radio;//Declaro variable estatica global en la que guardare el valor de radio introducido por el usuario en el MetodoMain 
	
	//Creo funcion estatica de tipo double llamada superficie cuya finalidad sera calcular la superficie de una esfera,
	//no tendra parametro de entrada y me retornara un valor de tipo double
	static double superficie () {
		
		//Declaro la variable superficie que guardara el valor del calculo de la formula de la superficie y sera la variable usada en el return
		double superficie;
		
		//Doy a superficie valor de resultado de la formula de superficie de una esfera
		superficie = 4*Math.PI*Math.pow(radio, 2);
		
		//Devuelvo el valor de variable superficie
		return (superficie);
	}
	//Creo funcion estatica de tipo double llamada volumen cuya finalidad sera calcular el volumen de una esfera,
	//no tendra parametro de entrada y me retornara un valor de tipo double
	static double volumen () {
		
		//Declaro la variable volumen que guardara el valor del calculo de la formula del volumen y sera la variable usada en el return
		double volumen;
		
		//Doy a volumen valor de resultado de la formula de volumen de una esfera
		volumen = (4*Math.PI/3)*Math.pow(radio, 3);
		
		//Devuelvo el valor de variable superficie
		return (volumen);
	}
	
	
}
