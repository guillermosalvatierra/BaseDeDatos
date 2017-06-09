package main;

import java.lang.reflect.Field;

public class ObtenedorDatos {
	public String transformarObjetoSimpleAJson(Object o) {

		Class<? extends Object> clase = o.getClass();
		Field[] atributos = clase.getFields();
		String tipoAtributo;
		String nombreAtributo;
		String cadenaJson = "{";

		for (int i = 0; i < atributos.length; i++) {
			Field atr = atributos[i];
			nombreAtributo = atr.getName();
			tipoAtributo = atr.getType().toString();
			Componedor cp = null;
			atr.setAccessible(true);
			if (atr.getType().isPrimitive()) {
				String sValor = "";
				try {
					Object valor = atr.get(o);
					sValor = valor.toString();
				} catch (IllegalArgumentException | IllegalAccessException e) {
					e.printStackTrace();
				}
				cp = new AtributoSimpleJson(nombreAtributo, tipoAtributo, sValor);
				if ((i+1) == atributos.length) {
					cadenaJson += cp.toString();
				} else {
					cadenaJson +=  cp.toString()+ ",";
				}
			}
			else{
				try {
					Object valor = atr.get(o);
					Class<? extends Object> claseCompuesta = valor.getClass();
					cadenaJson+='"' + claseCompuesta.getSimpleName() + '"'+ ":";
					cadenaJson+=transformarObjetoSimpleAJson(valor);
				} catch (IllegalArgumentException | IllegalAccessException e) {
				e.printStackTrace();
				}
			}
		}
		cadenaJson += "}";
		return cadenaJson;
	}
}
