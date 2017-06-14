package main;

public class AtributoSimpleObjeto  extends Atributo{

	protected String valor;
		
	public AtributoSimpleObjeto(String nombre, String tipo, String valor) {
		this.nombre = nombre;
		this.tipo = tipo;
		this.valor = valor;
	}
	
	@Override
	public void agregarHijo(Atributo composicion) {
		// TODO Auto-generated method stub		
	}	
	
	@Override
	public String toString() {
		return "AtributoSimple [nombre=" + nombre + ", tipo=" + tipo + ", valor=" + valor + "]";
	}
	
	@Override	
	public String obtenerAtributosJSON() {
		String cadenaJson = "";
	    cadenaJson ="{"+covertirJson() +"}";		
		return cadenaJson;
	}

	@Override
	protected String covertirJson() {
		String cadenaJson = "";
	    cadenaJson ='"'+ nombre+ '"'+':' +valor;		
		return cadenaJson;
	}


	@Override
	public String getValor() {
		// TODO Auto-generated method stub
		return valor;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		AtributoSimpleObjeto other = (AtributoSimpleObjeto) obj;
		if (valor == null) {
			if (other.valor != null)
				return false;
		} else if (!valor.equals(other.valor))
			return false;
		return true;
	}

	@Override
	public Atributo getHijo(int index) {
		// TODO Auto-generated method stub
		return null;
	}
	


}
