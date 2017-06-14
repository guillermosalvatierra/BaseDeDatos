package test;

import static org.junit.Assert.*;


import org.junit.Test;

import main.Atributo;
import main.AtributoSimpleObjeto;

public class AtributoSimpleObjetoTest {


	@Test
	public void ValidaJson() {
		
		AtributoSimpleObjeto a=  new AtributoSimpleObjeto("ValorEntero","int","1");
		
		
		assertFalse(a.obtenerAtributosJSON().isEmpty());
	
	}

	
	@Test
	public void ValidaUnAtributoBoolean() {

		Atributo b = new AtributoSimpleObjeto("VariableBolean","boolean","true");
	

		assertEquals(b.getNombre(),"VariableBolean");
		assertEquals(b.getTipo(),"boolean");
		assertEquals(b.getValor(),"true");
	
	}
	
	@Test
	public void ValidaUnAtributoInt() {

		Atributo b = new AtributoSimpleObjeto("VariableInt","int","1");
	

		assertEquals(b.getNombre(),"VariableInt");
		assertEquals(b.getTipo(),"int");
		assertEquals(b.getValor(),"1");
	
	}
	
	
}
