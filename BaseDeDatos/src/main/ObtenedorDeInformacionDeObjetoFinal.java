package main;

import java.lang.reflect.Field;

public class ObtenedorDeInformacionDeObjetoFinal {

	private Componedor caux;

	public Componedor traerInformacionDeAtributos(Object o){

//		List<String> LAtributos=new ArrayList<String>();
		
		Class<? extends Object> clase = o.getClass();
		
		Field[] atributos = clase.getFields();
	
		String tipoAtributo;
		String nombreAtributo;
		caux = new AtributoCompuesto();
		
		for (Field atr: atributos){
			nombreAtributo = atr.getName();
			tipoAtributo = atr.getType().toString();
			Componedor cp = null;
			
			if (atr.getType().isPrimitive()){
			
				
				String sValor="";		
				try {
					Object valor = atr.get(o);
					sValor =valor.toString();
				} catch (IllegalArgumentException | IllegalAccessException e) {
				e.printStackTrace();
				}
				
				cp=new AtributoSimple(nombreAtributo,tipoAtributo,sValor);
		
			}else{
				try {
					Object valor = atr.get(o);

					cp=traerInformacionDeAtributos(valor);
				} catch (IllegalArgumentException | IllegalAccessException e) {
				e.printStackTrace();
				}

			}
			caux.agregarHoja(cp);
		}	
		
		return caux;
	}
}
