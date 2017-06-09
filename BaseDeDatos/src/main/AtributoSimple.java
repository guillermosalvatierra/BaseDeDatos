package main;

public class AtributoSimple extends Componedor {

	protected String valor;
	
	
	public AtributoSimple(String nombre, String tipo, String valor) {
		this.nombre = nombre;
		this.tipo = tipo;
		this.valor = valor;
	}
	
	@Override
	public void agregarHoja(Componedor composicion) {
	//no se usa
	}
	
	@Override
	public String toString() {
		return "AtributoSimple [nombre=" + nombre + ", tipo=" + tipo + ", valor=" + valor + "]";
	}
	



	
	protected String obtenerAtributosJSON() {
		String cadenaJson = "";
	    cadenaJson ='"'+ nombre+ '"'+':' +valor;		
		return cadenaJson;
	}



	@Override
	protected String getValor() {
		// TODO Auto-generated method stub
		return valor;
	}
	
}
