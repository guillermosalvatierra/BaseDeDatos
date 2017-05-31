import java.lang.reflect.Field;

public class HerramientaGenerica{
	
	
	void mostrarAtributoDeClase(Object cx){
		Class clase = cx.getClass();

		Field[] atributos = clase.getFields();
		
		for (Field atr: atributos){
			Field atributo = atr;
			String nombreAtributo = atributo.getName();
			System.out.println("Nombre del Atributo: " + nombreAtributo);			
		}	


	}
	
	void mostrarTipoDeAtributoDeClase(Object cx){
		Class clase = cx.getClass();

		Field[] atributos = clase.getFields();
		
		for (Field atr: atributos){
			Field atributo = atr;
//			String nombreAtributo = atributo.getName();
//			System.out.println("Nombre del Atributo: " + nombreAtributo);			

			Object tipoAtributo = atributo.getType();
			System.out.println("Tipo del Atributo: " + tipoAtributo);		

		}	


	}
	
}
