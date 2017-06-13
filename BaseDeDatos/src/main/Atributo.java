package main;

public abstract class Atributo {
		protected String nombre;
		protected String tipo;

	   
	   public abstract String obtenerAtributosJSON() ;
	   
	   protected String getNombre(){return nombre;}
       protected String getTipo()  {return tipo;}
	   protected abstract String getValor();
	   protected abstract String covertirJson();

	   public abstract void agregarHoja(Atributo composicion);

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((tipo == null) ? 0 : tipo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Atributo other = (Atributo) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (tipo == null) {
			if (other.tipo != null)
				return false;
		} else if (!tipo.equals(other.tipo))
			return false;
		return true;
	}
       

		
}
