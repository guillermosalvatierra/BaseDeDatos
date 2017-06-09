package Borrar;

import java.lang.reflect.Field;

import main.AtributoSimpleJson;
import main.Componedor;

public class ObtenedorDatos {
	
	public String transformarAFormatoJson(Object objetoPadre) {
		Class<? extends Object> clase = objetoPadre.getClass();
		Field[] listaAtributos = clase.getFields();
		return obtenerAtributosConcatenados(objetoPadre, listaAtributos);
	}

	private String obtenerAtributosConcatenados(Object objetoPadre, Field[] listaAtributos) {
		String cadenaJson = "";
		int cantAtributos = listaAtributos.length;
		for (int indice = 0; indice < cantAtributos; indice++) {
			Field atributo = listaAtributos[indice];
			if (esAtributoPrimitivo(atributo)) {
				String atributoPrimitivo = obtenerAtributoPrimitivo(atributo, objetoPadre);
				cadenaJson += encapsularAtributoConSeparador(atributoPrimitivo, indice, cantAtributos);
			} else {
				String atributoComplejo = obtenerAtributoComplejo(atributo, objetoPadre);
				cadenaJson += encapsularAtributoConSeparador(atributoComplejo, indice, cantAtributos);
			}
		}
		return encapsularCadenaJson(cadenaJson);
	}

	private String encapsularAtributoConSeparador(String cadena, int inicio, int fin) {
		if (!esUltimaIteracion(inicio, fin)) {
			cadena += ",";
			return cadena;
		}
		return cadena;
	}
	
	private String encapsularCadenaJson(String cadena){
		return "{" + cadena + "}";
	}

	private boolean esAtributoPrimitivo(Field atributo) {
		return atributo.getType().isPrimitive();
	}

	private boolean esUltimaIteracion(int inicio, int fin) {
		return (inicio + 1) == fin;
	}

	private String obtenerAtributoComplejo(Field atributo, Object objetoPadre) {
		atributo.setAccessible(true);
		Object valor = obtenerValorAtributo(atributo, objetoPadre);
		Class<? extends Object> claseCompuesta = valor.getClass();
		String cadena = '"' + claseCompuesta.getSimpleName() + '"' + ":";
		cadena += transformarAFormatoJson(valor);
		return cadena;
	}

	private String obtenerAtributoPrimitivo(Field atributo, Object objetoPadre) {
		atributo.setAccessible(true);
		Object valor = obtenerValorAtributo(atributo, objetoPadre);
		String nombreAtributo = atributo.getName();
		String tipoAtributo = atributo.getType().toString();
		Componedor componedor = new AtributoSimpleJson(nombreAtributo, tipoAtributo, valor.toString());
		return componedor.toString();
	}

	private Object obtenerValorAtributo(Field atributo, Object objetoPadre) {
		try {
			Object valor = atributo.get(objetoPadre);
			return valor;
		} catch (IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();
			return null;
		}
	}
}
