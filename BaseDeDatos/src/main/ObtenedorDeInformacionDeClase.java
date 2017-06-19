package main;

import java.lang.reflect.Field;

public class ObtenedorDeInformacionDeClase {

	public Atributo traerInformacionDeAtributos(String nombreClase) {

		Atributo ret = traerAtributos(nombreClase, nombreClase, nombreClase, false);
		return ret;
	}

	public Atributo traerAtributos(String nombreClase, String pnombre, String ptipo, boolean eshijo) {

		Atributo atributoRet;
		Atributo cp = null;
		String tipoAtributo, nombreAtributo, claseAtributo;
		atributoRet = new AtributoCompuesto(pnombre, ptipo, eshijo);

		Class<? extends Object> clase = null;

		try {
			clase = Class.forName(nombreClase);

			Field[] atributos = clase.getDeclaredFields();

			for (Field atr : atributos) {

				nombreAtributo = atr.getName();
				tipoAtributo = atr.getType().getSimpleName();
				claseAtributo = atr.getType().getTypeName();
				atr.setAccessible(true);
				cp = null;

				if (atr.getType().isPrimitive()) {

					cp = new AtributoSimpleClase(nombreAtributo, tipoAtributo);

				} else {
					try {
						cp = traerAtributos(claseAtributo, nombreAtributo, tipoAtributo, true);
					} catch (IllegalArgumentException e) {
						e.printStackTrace();
					}

				}
				atributoRet.agregarHijo(cp);

			}
			if (atributos.length == 1 & cp instanceof AtributoSimpleClase) {
				atributoRet = cp;
			}
		} catch (ClassNotFoundException e1) {
			
		}

		return atributoRet;
	}

}
