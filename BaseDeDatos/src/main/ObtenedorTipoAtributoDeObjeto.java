package main;

import java.lang.reflect.Field;

public class ObtenedorTipoAtributoDeObjeto implements InformacionDeAtributoObtenible{

	@Override
	public String ObtenedorDato(Field f,Object cx) {
		Object tipoAtributo = f.getType();
		return tipoAtributo.toString();

	}

}
