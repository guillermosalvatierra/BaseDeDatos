package test;

import static org.junit.Assert.*;


import org.junit.Test;

import main.AtributoSimpleObjeto;

public class AtributoSimpleJsonTest {


	@Test
	public void ValidaJson() {
		
		AtributoSimpleObjeto a=  new AtributoSimpleObjeto("ValorEntero","int","1");
		
		
		assertFalse(a.obtenerAtributosJSON().isEmpty());
	
	}

	
}
