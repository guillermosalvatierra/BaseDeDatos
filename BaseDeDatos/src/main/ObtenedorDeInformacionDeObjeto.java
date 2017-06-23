package main;

import java.lang.reflect.Field;

public class ObtenedorDeInformacionDeObjeto {

	public Atributo traerInformacionDeAtributos(Object o){

		Atributo ret=traerAtributos(o);
		return ret;
	}

	
	private Atributo traerAtributos(Object o ){

		Atributo atributoR,atrAux;
		
		Class<? extends Object> clase = o.getClass();
		
		Field[] atributos = clase.getDeclaredFields();			
		
		if (atributos.length==1 && atributos[0].getType().isPrimitive()){
			//atributoR=creaAtributoSimple(atributos[0], o);
			atributoR=new AtributoSimpleObjeto(atributos[0].getType().getName(),atributos[0].getType().getSimpleName(),buscaObjeto(atributos[0],o).toString());

		}else{
		
		atributoR = new AtributoCompuesto();

		for (Field atr: atributos){
			atr.setAccessible(true);			
						
				if (atr.getType().isPrimitive()){					
					//atrAux=creaAtributoSimple(atributos[0], o);;
					atrAux=new AtributoSimpleObjeto(atr.getType().getName(),atr.getType().getSimpleName(),buscaObjeto(atr,o).toString());
				}else{
					Object valor = null;
					valor = buscaObjeto(atr,o);
					atrAux=traerAtributos(valor);
					atrAux.setNombre(atr.getName());
					atrAux.setTipo(atr.getType().getSimpleName());
				}			
			
			atributoR.agregarHijo(atrAux);		
		}
	
		}	
		return atributoR;
	
}	
	
	private Object buscaObjeto(Field atr, Object o){
		Object a = null;
		atr.setAccessible(true);			
		try {
			a = atr.get(o).toString();
		} catch (IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();
		}
		return a;
		
	}
	
	public String mostrarNombreDeClase(Object cx){
		
		Class<? extends Object> clase = cx.getClass();
		return clase.getSimpleName();

	}
	
}
