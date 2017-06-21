package main;

import java.lang.reflect.Field;

public class ObtenedorDeInformacionDeClase {

	public Atributo traerInformacionDeAtributos(String nombreClase) {

		Atributo ret = traerAtributos(nombreClase, nombreClase, nombreClase, false);
		return ret;
	}

	public Atributo traerAtributos(String nombreClase, String pnombre, String ptipo, boolean eshijo) {

		Atributo atributoR = null, atriAux = null;
		String tipoAtributo, nombreAtributo, claseAtributo;

		Class<? extends Object> clase = null;

		try {
			clase = Class.forName(nombreClase);

			Field[] atributos = clase.getDeclaredFields();

			Atributo atributoC = new AtributoCompuesto(pnombre, ptipo, eshijo);

			for (Field atr : atributos) {

				nombreAtributo = atr.getName();
				tipoAtributo = atr.getType().getSimpleName();
				claseAtributo = atr.getType().getTypeName();
				atr.setAccessible(true);
				atriAux = null;

				if (atr.getType().isPrimitive()) {

					atriAux = new AtributoSimpleClase(nombreAtributo, tipoAtributo);

				} else {
					try {
						atriAux = traerAtributos(claseAtributo, nombreAtributo, tipoAtributo, true);
					} catch (IllegalArgumentException e) {
						e.printStackTrace();
					}

				}
				atributoC.agregarHijo(atriAux);

			}
			if (atributos.length == 1 && atriAux instanceof AtributoSimpleClase) {
				atributoR = atriAux;
			} else {
				atributoR = atributoC;
			}
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}

		return atributoR;
	}

}
