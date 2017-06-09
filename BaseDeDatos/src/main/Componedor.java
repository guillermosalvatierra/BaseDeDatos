package main;

public abstract class Componedor {
		protected String nombre;
		protected String tipo;

	   public abstract void agregarHoja(Componedor composicion);
	   
	   protected abstract String obtenerAtributosJSON() ;
	   

	   protected String getNombre(){return nombre;}
       protected String getTipo()  {return tipo;}

	   protected abstract String getValor();

		
}
