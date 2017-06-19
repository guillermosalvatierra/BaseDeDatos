package main;

import java.lang.reflect.Field;

public class ObtenedorDeInformacionDeObjeto {

	public Atributo traerInformacionDeAtributos(Object o){

		Atributo ret=traerAtributos(o,o.getClass().getSimpleName(),o.getClass().getSimpleName(),false);
		return ret;
	}

	
	private Atributo traerAtributos(Object o, String pnombre, String ptipo,boolean eshijo ){

		Atributo atributoC;
		Atributo atributoR;
		Atributo atrAux = null;
		String tipoAtributo, nombreAtributo;
		
		Class<? extends Object> clase = o.getClass();
		
		Field[] atributos = clase.getDeclaredFields();	
		
		atributoC = new AtributoCompuesto(pnombre,ptipo, eshijo);			
		
		for (Field atr: atributos){

			nombreAtributo = atr.getName();
			tipoAtributo   = atr.getType().getSimpleName();			
			atrAux = null;
			atr.setAccessible(true);			
			try {			
				if (atr.getType().isPrimitive()){	
				
					String sValor="";		
					sValor =atr.get(o).toString();
					atrAux=new AtributoSimpleObjeto(nombreAtributo,tipoAtributo,sValor);
		
				}else{
					Object valor = atr.get(o);
					atrAux=traerAtributos(valor,nombreAtributo,tipoAtributo,true);
				}			
			} catch (IllegalArgumentException | IllegalAccessException e) {
				e.printStackTrace();
			}
			atributoC.agregarHijo(atrAux);		
		}
		
		if (atributos.length==1 & atrAux instanceof AtributoSimpleObjeto){
			atributoR=atrAux;
		}else{
			atributoR=atributoC;			
		}
			
		
		return atributoR;
	
}	
	
	
	public String mostrarNombreDeClase(Object cx){
		
		Class<? extends Object> clase = cx.getClass();
		return clase.getSimpleName();

	}
	
}
