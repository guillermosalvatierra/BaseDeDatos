package main;

import java.lang.reflect.Field;

public class ObtenedorValorAtributoDeObjeto implements InformacionDeAtributoObtenible{


	@Override
	public String ObtenedorDato(Field f,Object cx) {
		String sValor="";		
		try {
			Object valor = f.get(cx);
			sValor=valor.toString();
		} catch (IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();
		}
		return sValor;
	}
}
