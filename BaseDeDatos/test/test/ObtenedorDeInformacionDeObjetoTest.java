package test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import main.Atributo;
import main.AtributoCompuesto;
import main.AtributoSimpleObjeto;
import main.C1;
import main.C2;
import main.ObtenedorDeInformacionDeObjeto;

public class ObtenedorDeInformacionDeObjetoTest {

	private C1 C1Test1=null;
	private C2 C2Test2=null;
	 
	private ObtenedorDeInformacionDeObjeto obte1=new ObtenedorDeInformacionDeObjeto();
	private List<String> VariablesTest=new ArrayList<String>();

	@Test
	public void ValidaObjetoConDosAtributos() {
		C1Test1=new C1(1,2);

		Atributo a0 = new AtributoCompuesto("C1","C1",false);
		a0.agregarHoja(new AtributoSimpleObjeto("C1variableEntero1", "int", "1"));
		a0.agregarHoja(new AtributoSimpleObjeto("C1variableEntero2", "int", "2"));

		
		Atributo a= obte1.traerInformacionDeAtributos(C1Test1);
		
		
		assertEquals(a0,a);
	
	}

	@Test
	public void ValidaObjetoConUnAtributo() {
		C2Test2=new C2(true);

		Atributo a0=new AtributoSimpleObjeto("C2variableBoolean", "boolean", "true");

		Atributo a= obte1.traerInformacionDeAtributos(C2Test2);
		
		assertEquals(a0,a);
	
	}


	
	@Test
	public void ValidaObjetoConDosAtributosEnteros() {		
		C1Test1=new C1(1,2);

		Atributo a0 = new AtributoCompuesto("C1","C1",false);
		a0.agregarHoja(new AtributoSimpleObjeto("C1variableEntero1", "int", "1"));
		a0.agregarHoja(new AtributoSimpleObjeto("C1variableEntero2", "int", "2"));

		
		Atributo a= obte1.traerInformacionDeAtributos(C1Test1);
	
		assertEquals(a0,a);
	
	}

	@Test
	public void ValidaObjetoConUnAtributoBoolean() {
		C2Test2=new C2(true);

		Atributo a0=new AtributoSimpleObjeto("C2variableBoolean", "boolean", "true");

		Atributo a= obte1.traerInformacionDeAtributos(C2Test2);
		
		assertEquals(a0,a);
	
	}

	@Test
	public void ValidaObjetoConDosValoresEnteros() {		
		C1Test1=new C1(1,2);

		Atributo a0 = new AtributoCompuesto("C1","C1",false);
		a0.agregarHoja(new AtributoSimpleObjeto("C1variableEntero1", "int", "1"));
		a0.agregarHoja(new AtributoSimpleObjeto("C1variableEntero2", "int", "2"));

		
		Atributo a= obte1.traerInformacionDeAtributos(C1Test1);
	
		assertEquals(a0,a);
	
	}

	@Test
	public void ValidaObjetoConUnaValorBoolean() {
		C2Test2=new C2(true);

		Atributo a0=new AtributoSimpleObjeto("C2variableBoolean", "boolean", "true");

		Atributo a= obte1.traerInformacionDeAtributos(C2Test2);
		
		assertEquals(a0,a);
	
	}

	@Test
	public void ValidaObjetoPorNombreDeClase() {
		C1Test1=new C1(1,2);
		


		assertEquals("C1",obte1.mostrarNombreDeClase(C1Test1));
	
	}	
	
	

}
