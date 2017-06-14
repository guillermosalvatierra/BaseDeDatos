package main;

import java.lang.reflect.Field;

public class ObtenedorDeInformacionDeObjeto {

	public Atributo traerInformacionDeAtributos(Object o){
	
		Atributo ret=traerAtributos(o,o.getClass().getSimpleName(),o.getClass().getSimpleName(),false);
		return ret;
	}

	
	private Atributo traerAtributos(Object o, String pnombre, String ptipo,boolean eshijo ){

		Atributo atributoRet;
		Atributo atrAux = null;
		String tipoAtributo, nombreAtributo;
		
		Class<? extends Object> clase = o.getClass();
		
		Field[] atributos = clase.getDeclaredFields();	
	

		atributoRet = new AtributoCompuesto(pnombre,ptipo, eshijo);			


		for (Field atr: atributos){

			nombreAtributo = atr.getName();
			tipoAtributo   = atr.getType().getSimpleName();			
			 atrAux = null;
			atr.setAccessible(true);			
			
			if (atr.getType().isPrimitive()){	
				
				String sValor="";		
				try {
					sValor =atr.get(o).toString();
				} catch (IllegalArgumentException | IllegalAccessException e) {
				e.printStackTrace();
				}
				atrAux=new AtributoSimpleObjeto(nombreAtributo,tipoAtributo,sValor);
		
			}else{
				try {
					Object valor = atr.get(o);
					atrAux=traerAtributos(valor,nombreAtributo,tipoAtributo,true);

				} catch (IllegalArgumentException | IllegalAccessException e) {
				e.printStackTrace();
				}

			}		
				atributoRet.agregarHijo(atrAux);	
		}
	
		if (atributos.length==1 & atrAux instanceof AtributoSimpleObjeto){
			atributoRet=atrAux;
		}
		
		return atributoRet;
	}
	
	
	
	public String mostrarNombreDeClase(Object cx){
		
		Class<? extends Object> clase = cx.getClass();
		return clase.getSimpleName();

	}
	
}
