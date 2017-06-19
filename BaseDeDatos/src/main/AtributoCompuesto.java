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
	public void agregarHijo(Atributo composicion) {
		hijo.add(composicion);
	}


	public String obtenerAtributosJSON() {

		return covertirJson() ;
	}


	@Override
	public Atributo getHijo(int index) {
		return hijo.get(index);
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

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		return false;
	}

	@Override
	public String getValor() {
		return null;
	}
}
