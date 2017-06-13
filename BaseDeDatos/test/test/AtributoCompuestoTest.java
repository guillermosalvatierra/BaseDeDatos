package test;

import static org.junit.Assert.*;


import org.junit.Test;

import main.AtributoCompuesto;
import main.AtributoSimpleObjeto;
import main.Atributo;

public class AtributoCompuestoTest {


	@Test
	public void ValidaJson() {
		
		AtributoCompuesto a= new AtributoCompuesto("Objeto","o",false);
		Atributo b = new AtributoSimpleObjeto("VariableInt","Int","1");
		Atributo c = new AtributoSimpleObjeto("VariableInt","Int","2");
		a.agregarHoja(b);
		a.agregarHoja(c);
		
		assertFalse(a.obtenerAtributosJSON().isEmpty());
	
	}

	
}
