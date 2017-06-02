import java.lang.reflect.Field;

public class HerramientaGenerica{
	
	
	void mostrarAtributoDeClase(Object cx){
		
		Class<? extends Object> clase = cx.getClass();

		Field[] atributos = clase.getFields();
		
		for (Field atr: atributos){
			Field atributo = atr;
			String nombreAtributo = atributo.getName();
			System.out.println("Nombre del Atributo: " + nombreAtributo);			
		}	
		
		

	}
	
	void mostrarTipoDeAtributoDeClase(Object cx){
		Class<? extends Object> clase = cx.getClass();

		Field[] atributos = clase.getFields();
		
		for (Field atr: atributos){
			Field atributo = atr;

			Object tipoAtributo = atributo.getType();
			System.out.println("Tipo del Atributo: " + tipoAtributo);		

		}	


	}

	void mostrarValorAtributoDeClase(Object cx){
		
		Class<? extends Object> clase = cx.getClass();

		Field[] atributos = clase.getFields();
		
		for (Field atr: atributos){
			Field atributo = atr;
		
			try {
				Object valor = atributo.get(cx);
				System.out.println("Valor del Atributo: " + valor.toString());			
			} catch (IllegalArgumentException | IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			
		}	
		
		

	}
	
	
}
