package main;

public class AtributoSimple extends Componedor {

	String valor;
	
	
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
	
}
