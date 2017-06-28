package test;

import static org.junit.Assert.*;


import org.junit.Test;

import main.AtributoCompuesto;
import main.AtributoSimpleObjeto;
import main.Atributo;

public class AtributoCompuestoTest {
	int Atrib1=0,Atrib2=1;
	
	AtributoCompuesto a= new AtributoCompuesto();
	
	
	@Test
	public void ValidaJsonAtributoCompuesto() {
		Atributo b = new AtributoSimpleObjeto("VariableInt","int","1");
		a.agregarHijo(b);	

		assertFalse(a.obtenerAtributosJSON().isEmpty());
		
	}

	@Test
	public void ValidaDosAtributosInt() {

		Atributo b = new AtributoSimpleObjeto("VariableInt","int","1");
		Atributo c = new AtributoSimpleObjeto("VariableInt","int","2");
		a.agregarHijo(b);
		a.agregarHijo(c);

		

		assertTrue(a.getHijo(Atrib1).equals(b));
		assertTrue(a.getHijo(Atrib2).equals(c));
	
	}
	

	@Test
	public void ValidaUnAtributosBoolean() {

		Atributo b = new AtributoSimpleObjeto("VariableBolean","boolean","true");
	
		a.agregarHijo(b);
	

		assertTrue(a.getHijo(Atrib1).equals(b));
	
	}
	
	@Test
	public void CompruebaEquals(){
		AtributoCompuesto a= new AtributoCompuesto();
		a.setNombre("Objeto");
		a.setTipo("o");
		AtributoCompuesto b= new AtributoCompuesto();
		b.setNombre("Objeto");
		b.setTipo("o");
		
		assertTrue(a.equals(b));
		assertTrue(a.equals(a));
		assertFalse(a.equals(null));
		assertFalse(a.equals(new String("Prueba")));
		
		
		b.setTipo("o2");
		assertFalse(a.equals(b));
		
		b.setNombre("Objeto2");
		assertFalse(a.equals(b));

	}
		

	
	@Test	
	public void GetValor(){
		AtributoCompuesto a= new AtributoCompuesto();
		a.setNombre("Objeto");
		a.setTipo("o");

		assertEquals(a.getValor(),null);
	}
	
	@Test
	public void ValidaJsonAtributoCompuestoConNombre() {
		Atributo b = new AtributoSimpleObjeto("VariableInt","int","1");
		a.agregarHijo(b);	
		a.setNombre("ValidaConNombre");
		assertFalse(a.obtenerAtributosJSON().isEmpty());
		
	}
}
