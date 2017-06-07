package main;
import java.lang.reflect.Field;

public class ObtenedorDeInformacionPorClase{
	
	
	void mostrarAtributoDeClase(String nombreClase){
		

		
		Class<? extends Object> clase;
		try {
			clase = Class.forName(nombreClase);

			Field[] atributos = clase.getFields();
			
			for (Field atr: atributos){
				Field atributo = atr;
				String nombreAtributo = atributo.getName();
				System.out.println("Nombre del Atributo de CLASE: " + nombreAtributo);			
			}	

		
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		

	}
	
	void mostrarTipoDeAtributoDeClase(String nombreClase){
		Class<? extends Object> clase;
		try {
			clase = Class.forName(nombreClase);

			Field[] atributos = clase.getFields();
			
			for (Field atr: atributos){
				Field atributo = atr;

				Object tipoAtributo = atributo.getType();
				System.out.println("Tipo del Atributo: " + tipoAtributo);		

			}	

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}
	
	
}
