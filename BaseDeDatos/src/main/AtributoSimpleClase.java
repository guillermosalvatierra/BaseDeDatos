package main;

public class AtributoSimpleClase extends Atributo {


	public AtributoSimpleClase(String nombre, String tipo) {
		this.nombre = nombre;
		this.tipo = tipo;

	}
	
	@Override
	public void agregarHoja(Atributo composicion) {
	//no se usa
	}
	
	@Override
	public String toString() {
		return "AtributoSimple [nombre=" + nombre + ", tipo=" + tipo + "]";
	}

	@Override
	public String obtenerAtributosJSON() {
	
		return "{"+'"'+ covertirJson()+ '"'+"}";
	}

	@Override
	protected String getValor() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected String covertirJson() {
		// TODO Auto-generated method stub
		String cadenaJson = "";
	    cadenaJson ='"'+ nombre+ '"';		
		return cadenaJson;
	}

	
	

}
