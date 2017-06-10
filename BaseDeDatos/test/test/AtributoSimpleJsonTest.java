package test;

import static org.junit.Assert.*;


import org.junit.Test;

import main.AtributoSimple;

public class AtributoSimpleJsonTest {


	@Test
	public void ValidaJson() {
		
		AtributoSimple a=  new AtributoSimple("ValorEntero","int","1");
		
		
		assertFalse(a.obtenerAtributosJSON().isEmpty());
	
	}

	
}
