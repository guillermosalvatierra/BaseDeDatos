package main;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class ObtenedorDeInformacionPorObjeto{
	

	public String mostrarNombreDeClase(Object cx){
		
		Class<? extends Object> clase = cx.getClass();
		return clase.getSimpleName();

	}

	
	public List<String> mostrarAtributoDeClase(Object cx){

		List<String> LAtributos=new ArrayList<String>();
		
		Class<? extends Object> clase = cx.getClass();
		
		Field[] atributos = clase.getFields();
		
		for (Field atr: atributos){
			Field atributo = atr;
			String nombreAtributo = atributo.getName();
			LAtributos.add(nombreAtributo);
		}	
		
		return LAtributos;

	}
	
	public List<String> mostrarTipoDeAtributoDeClase(Object cx){
		List<String> LAtributos=new ArrayList<String>();

		Class<? extends Object> clase = cx.getClass();

		Field[] atributos = clase.getFields();
		
		for (Field atr: atributos){
			Field atributo = atr;

			Object tipoAtributo = atributo.getType();
			LAtributos.add(tipoAtributo.toString());

		}	

		return LAtributos;

	}

	public List<String> mostrarValorAtributoDeClase(Object cx){
		List<String> LAtributos=new ArrayList<String>();
		
		Class<? extends Object> clase = cx.getClass();

		Field[] atributos = clase.getFields();
		
		for (Field atr: atributos){
			Field atributo = atr;
		
			try {
				Object valor = atributo.get(cx);
//				System.out.println("Valor del Atributo: " + valor.toString());			
				LAtributos.add(valor.toString());

			} catch (IllegalArgumentException | IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			
		}	
		
		
		return LAtributos;

	}
	
	
}
