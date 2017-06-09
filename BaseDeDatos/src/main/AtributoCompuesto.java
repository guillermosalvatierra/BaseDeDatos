package main;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class AtributoCompuesto extends Componedor{
	   private List<Componedor> hijo = new ArrayList<Componedor>();
	   boolean esHijo=true;

	  public AtributoCompuesto(String nombre, String tipo) {
			this.nombre = nombre;
			this.tipo = tipo;
	  }
	  
	  public boolean noEsHijo(){
		  esHijo=false; 
		  return esHijo;
	  }
	  
	@Override
	public void agregarHoja(Componedor composicion) {
		// TODO Auto-generated method stub
		hijo.add(composicion);
	}

	
	@Override
	public String toString() {
		return "Objeto [ nombre=" + nombre + ", tipo=" + tipo + ",atributos=" + hijo + "]";
	}


	protected String obtenerAtributosJSON() {
		String cadenaJson = "";

		int index=0;
		for (Componedor c:hijo) {
			
			if (c instanceof AtributoSimple ){
				cadenaJson+=c.obtenerAtributosJSON();
			}else{
				cadenaJson+=c.obtenerAtributosJSON();
			}
			cadenaJson=encapsularAtributoConSeparador(cadenaJson, index, hijo.size());
			index=index+1;
		}
		if(esHijo)
			cadenaJson='"'+nombre+'"'+':'+encapsularCadenaJson(cadenaJson);
		else 
			cadenaJson=encapsularCadenaJson(cadenaJson);	
		return cadenaJson;
	}

	private String encapsularCadenaJson(String cadena){
		return "{" + cadena + "}";
	}
	
	private String encapsularAtributoConSeparador(String cadena, int inicio, int fin) {
		if (!esUltimaIteracion(inicio, fin)) {
			cadena += ",";
			return cadena;
		}
		return cadena;
	}
	
	private boolean esUltimaIteracion(int inicio, int fin) {
		return (inicio + 1) == fin;
	}


	
	
/*	private String obtenerAtributoComplejo(Field atributo, Object objetoPadre) {
		atributo.setAccessible(true);
		Object valor = obtenerValorAtributo(atributo, objetoPadre);
		Class<? extends Object> claseCompuesta = valor.getClass();
		String cadena = '"' + claseCompuesta.getSimpleName() + '"' + ":";
		cadena += transformarAFormatoJson(valor);
		return cadena;
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
*/

	
}
