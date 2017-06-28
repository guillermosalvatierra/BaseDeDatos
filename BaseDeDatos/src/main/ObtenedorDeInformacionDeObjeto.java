package main;

import java.lang.reflect.Field;

public class ObtenedorDeInformacionDeObjeto {


	
	public Atributo traerInformacionDeAtributos(Object o ){

	//	boolean tieneAtributo=false;
	//	int atributoPrimitivo=0;
		Atributo atributoR,atrAux = null;
		if(o==null ){
			return null;
		}
		
		Class<? extends Object> clase = o.getClass();
		
		Field[] atributos = clase.getDeclaredFields();			

		
	//	if (atributos.length==1 && atributos[0].getType().isPrimitive()){
			//atributoR=creaAtributoSimple(atributos[0], o);
	//		return new AtributoSimpleObjeto(atributos[0].getName(),atributos[0].getType().getSimpleName(),buscaObjeto(atributos[0],o).toString());
			
	//	}else{
		
		atributoR = new AtributoCompuesto();

		for (Field atr: atributos){
			atr.setAccessible(true);
//			tieneAtributo=true;
			atrAux=null;
						
//				if (atr.getType().isPrimitive()){
//				}
				atrAux=new AtributoSimpleObjeto(atr.getName(),atr.getType().getSimpleName(),buscaObjeto(atr,o).toString());
				/*}else{
					Object valor = null;
					valor = buscaObjeto(atr,o);
					atrAux=traerInformacionDeAtributos(valor);
					atrAux.setNombre(atr.getName());
					atrAux.setTipo(atr.getType().getSimpleName());
				*/
				//}			
			
			atributoR.agregarHijo(atrAux);		

			}
	
//			if(atributoPrimitivo>=1)
				return atributoR;

//		return atributoR;
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
		if(cx==null ){
			return "El objeto no debe ser nulo";
		}
		
		Class<? extends Object> clase = cx.getClass();
		return clase.getSimpleName();

	}

}
