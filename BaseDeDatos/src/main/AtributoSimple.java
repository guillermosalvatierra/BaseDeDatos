package main;

public class AtributoSimple implements Componedor {
	String nombre;
	String tipo;
	String valor;
	
	
	public AtributoSimple(String nombre, String tipo, String valor) {
		this.nombre = nombre;
		this.tipo = tipo;
		this.valor = valor;
	}
	@Override
	public int getInformacion() {
		// TODO Auto-generated method stub
		return 0;
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
