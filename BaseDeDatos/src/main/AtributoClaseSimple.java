package main;

public class AtributoClaseSimple extends Componedor {


	public AtributoClaseSimple(String nombre, String tipo) {
		this.nombre = nombre;
		this.tipo = tipo;

	}
	
	@Override
	public void agregarHoja(Componedor composicion) {
	//no se usa
	}
	
	@Override
	public String toString() {
		return "AtributoSimple [nombre=" + nombre + ", tipo=" + tipo + "]";
	}

	@Override
	protected String obtenerAtributosJSON() {
		String cadenaJson = "";
	    cadenaJson ='"'+ nombre+ '"';		
		return cadenaJson;
	}

	@Override
	protected String getValor() {
		// TODO Auto-generated method stub
		return null;
	}

	
	

}
