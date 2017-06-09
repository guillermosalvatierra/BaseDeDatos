package main;

public class UtilidadesJson {
	
	public static String encapsularCadenaJson(String cadena){
		return "{" + cadena + "}";
	}
	
	public static String encapsularAtributoConSeparador(String cadena, int inicio, int fin) {
		if (!esUltimaIteracion(inicio, fin)) {
			cadena += ",";
			return cadena;
		}
		return cadena;
	}
	
	public static boolean esUltimaIteracion(int inicio, int fin) {
		return (inicio + 1) == fin;
	}
}
