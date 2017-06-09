package main;

import java.util.ArrayList;
import java.util.List;

public class AtributoCompuesto extends Componedor{
	   protected List<Componedor> hijo = new ArrayList<Componedor>();
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

	public List<String> getNombresDeAtributos(){
		List<String> ret = new ArrayList<String>();
		for (Componedor c:hijo){
			ret.add(c.getNombre());
		}
		return ret;
	}
	
	public List<String> getTiposDeAtributos(){
		List<String> ret = new ArrayList<String>();
		for (Componedor c:hijo){
			ret.add(c.getTipo());
		}
		return ret;
	}

	public List<String> getValoresDeAtributos(){
		List<String> ret = new ArrayList<String>();
		for (Componedor c:hijo){
			ret.add(c.getValor());
		}
		return ret;
	}
	
	
	@Override
	protected String getValor() {
		// TODO Auto-generated method stub
		return toString();
	}
	
	
	@Override
	public String toString() {
		return "Objeto [ nombre=" + nombre + ", tipo=" + tipo + ",atributos=" + hijo + "]";
	}


	protected String obtenerAtributosJSON() {
		String cadenaJson = "";

		int index=0;
		for (Componedor c:hijo) {
			
			cadenaJson+=c.obtenerAtributosJSON();

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
	
}
