package Borrar;

import java.lang.reflect.Field;

public class ObtenedorNombreAtributosDeObjeto implements InformacionDeAtributoObtenible{



	@Override
	public String ObtenedorDato(Field f,Object cx) {
		String nombreAtributo = f.getName();
		return nombreAtributo;
	}

}
