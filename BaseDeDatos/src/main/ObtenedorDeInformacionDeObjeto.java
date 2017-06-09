package main;

import java.lang.reflect.Field;

public class ObtenedorDeInformacionDeObjeto {

	public Componedor traerInformacionDeAtributos(Object o){

		
		Class<? extends Object> clase = o.getClass();
		

		return traerAtributos(o,clase.getName(),clase.getTypeName());
	}

	
	public Componedor traerAtributos(Object o, String pnombre, String ptipo){

		Componedor ComponedorRet;
		String tipoAtributo;
		String nombreAtributo;
		
		Class<? extends Object> clase = o.getClass();
		
		Field[] atributos = clase.getDeclaredFields();

	
//		caux = new AtributoCompuesto(clase.getName(),clase.getTypeName());
		ComponedorRet = new AtributoCompuesto(pnombre,ptipo);


		for (Field atr: atributos){

			nombreAtributo = atr.getName();
//			tipoAtributo   = atr.getType().toString();
			tipoAtributo   = atr.getType().getSimpleName();			
			Componedor cp = null;
			atr.setAccessible(true);			
			
			if (atr.getType().isPrimitive()){	
				
				String sValor="";		
				try {
//					Object valor = atr.get(o);
					sValor =atr.get(o).toString();
				} catch (IllegalArgumentException | IllegalAccessException e) {
				e.printStackTrace();
				}
				cp=new AtributoSimple(nombreAtributo,tipoAtributo,sValor);
		
			}else{
				try {
					Object valor = atr.get(o);
//					tipoAtributo=valor.getClass().getTypeName().toString();
			//		cp=traerInformacionDeAtributos(valor);
					cp=traerAtributos(valor,nombreAtributo,tipoAtributo);

				} catch (IllegalArgumentException | IllegalAccessException e) {
				e.printStackTrace();
				}

			}
			ComponedorRet.agregarHoja(cp);

		}	
		
		return ComponedorRet;
	}
	
}
