package main;

import java.lang.reflect.Field;

public class ObtenedorDeInformacionDeClase {

	public Atributo traerInformacionDeAtributos(String nombreClase) {

		Atributo ret = traerAtributos(nombreClase, nombreClase, nombreClase, false);
		return ret;
	}

	public Atributo traerAtributos(String nombreClase, String pnombre, String ptipo, boolean eshijo) {

<<<<<<< HEAD
		Atributo atributoR = null, atriAux = null;
		String tipoAtributo, nombreAtributo, claseAtributo;
=======
		Atributo atributoRet;
		Atributo cp = null;
		String tipoAtributo, nombreAtributo, claseAtributo;
		atributoRet = new AtributoCompuesto(pnombre, ptipo, eshijo);
>>>>>>> origin/master

		Class<? extends Object> clase = null;

		try {
			clase = Class.forName(nombreClase);

			Field[] atributos = clase.getDeclaredFields();

<<<<<<< HEAD
			Atributo atributoC = new AtributoCompuesto(pnombre, ptipo, eshijo);

=======
>>>>>>> origin/master
			for (Field atr : atributos) {

				nombreAtributo = atr.getName();
				tipoAtributo = atr.getType().getSimpleName();
				claseAtributo = atr.getType().getTypeName();
				atr.setAccessible(true);
<<<<<<< HEAD
				atriAux = null;

				if (atr.getType().isPrimitive()) {

					atriAux = new AtributoSimpleClase(nombreAtributo, tipoAtributo);

				} else {
					try {
						atriAux = traerAtributos(claseAtributo, nombreAtributo, tipoAtributo, true);
=======
				cp = null;

				if (atr.getType().isPrimitive()) {

					cp = new AtributoSimpleClase(nombreAtributo, tipoAtributo);

				} else {
					try {
						cp = traerAtributos(claseAtributo, nombreAtributo, tipoAtributo, true);
>>>>>>> origin/master
					} catch (IllegalArgumentException e) {
						e.printStackTrace();
					}

				}
<<<<<<< HEAD
				atributoC.agregarHijo(atriAux);

			}
			if (atributos.length == 1 && atriAux instanceof AtributoSimpleClase) {
				atributoR = atriAux;
			} else {
				atributoR = atributoC;
=======
				atributoRet.agregarHijo(cp);

			}
			if (atributos.length == 1 & cp instanceof AtributoSimpleClase) {
				atributoRet = cp;
>>>>>>> origin/master
			}
		} catch (ClassNotFoundException e1) {
			
		}

<<<<<<< HEAD
		return atributoR;
=======
		return atributoRet;
>>>>>>> origin/master
	}

}
