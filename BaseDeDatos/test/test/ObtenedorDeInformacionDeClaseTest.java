package test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import main.Atributo;
import main.AtributoCompuesto;
import main.AtributoSimpleClase;
import main.AtributoSimpleObjeto;
import main.C1;
import main.C2;
import main.ObtenedorDeInformacionDeClase;
import main.ObtenedorDeInformacionDeObjeto;


public class ObtenedorDeInformacionDeClaseTest {


	private ObtenedorDeInformacionDeClase obte1=new ObtenedorDeInformacionDeClase();
	
	private Atributo atributoDeObtenedorC1Test= obte1.traerInformacionDeAtributos("main.C1");
	
	private Atributo atributoDeObtenedorC2Test= obte1.traerInformacionDeAtributos("main.C2");

	
	
	
	@Test
	public void ValidaObjetoConDosAtributos() {
		
		assertEquals("C1variableEntero1",atributoDeObtenedorC1Test.getHijo(0).getNombre());
		assertEquals("C1variableEntero2",atributoDeObtenedorC1Test.getHijo(1).getNombre());	

	}

	@Test
	public void ValidaObjetoConUnAtributo() {

		//assertEquals(atributoDeObtenedorC2Test.getHijo(0).getNombre(),"C2variableBoolean");
			
	
	}


	
	@Test
	public void ValidaObjetoConDosAtributosEnteros() {		
		
		assertEquals("int",atributoDeObtenedorC1Test.getHijo(0).getTipo());
		assertEquals("int",atributoDeObtenedorC1Test.getHijo(1).getTipo());	
	
		
	}

	@Test
	public void ValidaObjetoConUnAtributoBoolean() {
		
		//assertEquals("boolean",atributoDeObtenedorC2Test.getHijo(0).getTipo());
		
			
	}


}
