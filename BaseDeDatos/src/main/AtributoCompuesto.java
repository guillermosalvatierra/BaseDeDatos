package main;

import java.util.ArrayList;
import java.util.List;

public class AtributoCompuesto extends Componedor{
	   private List<Componedor> hijo = new ArrayList<Componedor>();

	  public AtributoCompuesto(String nombre, String tipo) {
			this.nombre = nombre;
			this.tipo = tipo;
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


	
	
}
