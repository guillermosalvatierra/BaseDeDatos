package main;

public class AtributoSimpleJson extends AtributoSimple {

	public AtributoSimpleJson(String nombre, String tipo, String valor) {
		super(nombre, tipo, valor);
	}

	public Object obtenerValor(String valor) {
		try {
			if (tipo.equals("int") || tipo.equals("Integer")) {
				return Integer.parseInt(valor);
			}
			if (tipo.equals("long") || tipo.equals("Long")) {
				return Long.parseLong(valor);
			}
			if (tipo.equals("byte") || tipo.equals("Byte")) {
				return Byte.parseByte(valor);
			}
			if (tipo.equals("short") || tipo.equals("Short")) {
				return Short.parseShort(valor);
			}
			if (tipo.equals("float") || tipo.equals("Float")) {
				return Float.parseFloat(valor);
			}
			if (tipo.equals("double") || tipo.equals("Double")) {
				return Double.parseDouble(valor);
			}
			if (tipo.equals("char") || tipo.equals("Character")) {
				return "'" + valor.charAt(0) + "'";
			}
			if (tipo.equals("boolean") || tipo.equals("Boolean")) {
				return Boolean.parseBoolean(valor);
			}
		} catch (Exception e) {
			return valor;
		}
		return valor;
	}

	@Override
	public String toString() {
		return '"' + nombre + '"' + ":" + obtenerValor(valor);
	}

}
