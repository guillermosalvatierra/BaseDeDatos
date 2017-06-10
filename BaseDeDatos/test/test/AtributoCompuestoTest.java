package test;

import static org.junit.Assert.*;


import org.junit.Test;

import main.AtributoCompuesto;
import main.AtributoSimple;
import main.Componedor;

public class AtributoCompuestoTest {


	@Test
	public void ValidaJson() {
		
		AtributoCompuesto a= new AtributoCompuesto("Objeto","o");
		Componedor b = new AtributoSimple("VariableInt","Int","1");
		Componedor c = new AtributoSimple("VariableInt","Int","2");
		a.agregarHoja(b);
		a.agregarHoja(c);
		
		assertFalse(a.obtenerAtributosJSON().isEmpty());
	
	}

	
}
