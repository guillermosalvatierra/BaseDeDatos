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
		return valor;
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
	public Atributo getHijo(int index) {
		return null;
	}
}
