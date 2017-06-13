package main;

import java.util.ArrayList;
import java.util.List;

public class AtributoCompuesto extends Atributo{
	   protected List<Atributo> hijo = new ArrayList<Atributo>();
	   boolean esHijo=true;

	  public AtributoCompuesto(String nombre, String tipo, boolean eshijo) {
			this.nombre = nombre;
			this.tipo = tipo;
			this.esHijo=eshijo;
	  }
	  
	  public boolean noEsHijo(){
		  esHijo=false; 
		  return esHijo;
	  }
	  
	@Override
	public void agregarHoja(Atributo composicion) {
		hijo.add(composicion);
	}
	
	@Override
	public String toString() {
		return "Objeto [ nombre=" + nombre + ", tipo=" + tipo + ",atributos=" + hijo + "]";
	}


	public String obtenerAtributosJSON() {

		return covertirJson() ;
	}


	
	@Override
	protected String covertirJson() {
		// TODO Auto-generated method stub
		String cadenaJson = "";

		int index=0;
		for (Atributo c:hijo) {
			
			cadenaJson+=c.covertirJson();

			cadenaJson=UtilidadesJson.encapsularAtributoConSeparador(cadenaJson, index, hijo.size());
			index=index+1;
		}
		
		if(esHijo)
			cadenaJson='"'+nombre+'"'+':'+UtilidadesJson.encapsularCadenaJson(cadenaJson);
		else 
			cadenaJson=UtilidadesJson.encapsularCadenaJson(cadenaJson);	
		return cadenaJson;
	}

	public List<String> getNombresDeAtributos(){
		List<String> ret = new ArrayList<String>();
		for (Atributo c:hijo){
			ret.add(c.getNombre());
		}
		return ret;
	}
	
	public List<String> getTiposDeAtributos(){
		List<String> ret = new ArrayList<String>();
		for (Atributo c:hijo){
			ret.add(c.getTipo());
		}
		return ret;
	}

	public List<String> getValoresDeAtributos(){
		List<String> ret = new ArrayList<String>();
		for (Atributo c:hijo){
			ret.add(c.getValor());
		}
		return ret;
	}
	
	
	@Override
	protected String getValor() {
		return toString();
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		AtributoCompuesto other = (AtributoCompuesto) obj;
		if (esHijo != other.esHijo)
			return false;
		if (hijo == null) {
			if (other.hijo != null)
				return false;
		} else if (!hijo.equals(other.hijo))
			return false;
		return true;
	}



	
}
