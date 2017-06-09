package main;

import java.lang.reflect.Field;

public class ObtenedorDeInformacionDeClase {

	public Componedor traerInformacionDeAtributos(String nombreClase){

		
	
		return traerAtributos(nombreClase,nombreClase,nombreClase);
	}

	
	public Componedor traerAtributos(String nombreClase, String pnombre, String ptipo) {

		Componedor ComponedorRet;
		String tipoAtributo;
		String nombreAtributo;
		String ClaseAtributo;
		
		Class<? extends Object> clase = null;
		try {			
			clase = Class.forName(nombreClase);
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}
		
		Field[] atributos = clase.getDeclaredFields();

	
		ComponedorRet = new AtributoCompuesto(pnombre,ptipo);

		for (Field atr: atributos){

			nombreAtributo = atr.getName();			
			tipoAtributo   = atr.getType().getSimpleName();//atr.getType().toString();
			ClaseAtributo =atr.getType().getTypeName();
			Componedor cp = null;
			atr.setAccessible(true);			
			
			if (atr.getType().isPrimitive()){	
				
				cp=new AtributoClaseSimple(nombreAtributo,tipoAtributo);
		
			}else{
				try {
					
//					Object valor = atr.get(c);
//					tipoAtributo=valor.getClass().getTypeName().toString();
			//		cp=traerInformacionDeAtributos(valor);
					cp=traerAtributos(ClaseAtributo,nombreAtributo,tipoAtributo);

				} catch (IllegalArgumentException e) {
				e.printStackTrace();
				}

			}
			ComponedorRet.agregarHoja(cp);

		}	
		
		return ComponedorRet;
	}
	
}
