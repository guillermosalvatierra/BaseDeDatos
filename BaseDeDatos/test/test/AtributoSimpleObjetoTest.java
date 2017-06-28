package test;

import static org.junit.Assert.*;


import org.junit.Test;

import main.Atributo;
import main.AtributoSimpleObjeto;
import main.C1;

public class AtributoSimpleObjetoTest {


	@Test
	public void ValidaJson() {
		
		AtributoSimpleObjeto a=  new AtributoSimpleObjeto("ValorEntero","int","1");
		
		
		assertFalse(a.obtenerAtributosJSON().isEmpty());
	
	}

	
	@Test
	public void ValidaUnAtributoBoolean() {

		AtributoSimpleObjeto b = new AtributoSimpleObjeto("VariableBolean","boolean","true");
	

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

	@Test
	public void ValidaDosAtributoInt() {

		Atributo b = new AtributoSimpleObjeto("VariableInt","int","1");
		Atributo c = new AtributoSimpleObjeto("VariableInt","int","1");
			

		assertEquals(b,c);
	
	
	}
	
	@Test
	public void CompruebaEquals(){
		AtributoSimpleObjeto a= new AtributoSimpleObjeto("VariableInt","int","1");
		AtributoSimpleObjeto b= new AtributoSimpleObjeto("VariableInt","int","1");
		AtributoSimpleObjeto c= new AtributoSimpleObjeto("VariableInt","int","2");
	

		
		assertTrue(a.equals(b));
		assertTrue(a.equals(a));
		assertFalse(a.equals(c));
		
		b.setTipo("int2");
		assertFalse(a.equals(b));
		b.setNombre("int2");		
		assertFalse(a.equals(b));
		
		assertFalse(a.equals(null));
		
		assertFalse(a.equals(new C1(2,2)));
		
	}
	
	
		
	@Test
	public void CompruebaGethijo(){
		AtributoSimpleObjeto a1= new AtributoSimpleObjeto("VariableInt","int","1");

		assertEquals(a1.getHijo(0),null);
	}
	
	@Test
	public void AgregarHijo(){
		AtributoSimpleObjeto a1= new AtributoSimpleObjeto("VariableInt","int","1");
		AtributoSimpleObjeto a2= new AtributoSimpleObjeto("VariableInt","int","1");
		a1.agregarHijo(a2);
		assertEquals(a1,a1);
	}
	
	
	
}
