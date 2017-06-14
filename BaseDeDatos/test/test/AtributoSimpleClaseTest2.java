package test;

import static org.junit.Assert.*;


import org.junit.Test;

import main.Atributo;
import main.AtributoSimpleClase;
import main.AtributoSimpleObjeto;

public class AtributoSimpleClaseTest2 {


	@Test
	public void ValidaJson() {
		
		AtributoSimpleClase a=  new AtributoSimpleClase("ValorEntero","int");
		
		
		assertFalse(a.obtenerAtributosJSON().isEmpty());
	
	}

	
	@Test
	public void ValidaUnAtributoBoolean() {

		Atributo b = new AtributoSimpleClase("VariableBolean","boolean");
	

		assertEquals(b.getNombre(),"VariableBolean");
		assertEquals(b.getTipo(),"boolean");
	
	}
	
	@Test
	public void ValidaUnAtributoInt() {

		Atributo b = new AtributoSimpleClase("VariableInt","int");
	

		assertEquals(b.getNombre(),"VariableInt");
		assertEquals(b.getTipo(),"int");

	
	}
	
	
}
