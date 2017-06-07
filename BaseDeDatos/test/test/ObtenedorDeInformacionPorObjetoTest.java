package test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import main.C1;
import main.C2;
import main.ObtenedorDeInformacionPorObjeto;

public class ObtenedorDeInformacionPorObjetoTest {

	private C1 C1Test1=null;
	private C2 C2Test2=null;

	private ObtenedorDeInformacionPorObjeto ObtInfo=new ObtenedorDeInformacionPorObjeto();
	
	private List<String> VariablesTest=new ArrayList<String>();

	@Test
	public void ValidaObjetoConDosAtributos() {
		C1Test1=new C1(1,2);
		
		VariablesTest.add("C1variableEntero1");
		VariablesTest.add("C1variableEntero2");
		
		assertEquals(VariablesTest,ObtInfo.mostrarAtributoDeClase(C1Test1));
	
	}

	@Test
	public void ValidaObjetoConUnAtributo() {
		C2Test2=new C2(true);
		
		VariablesTest.add("C2variableBoolean");
		
		assertEquals(VariablesTest,ObtInfo.mostrarAtributoDeClase(C2Test2));
	
	}


	
	@Test
	public void ValidaObjetoConDosAtributosEnteros() {		
		C1Test1=new C1(1,2);
		
		VariablesTest.add("int");
		VariablesTest.add("int");
		
		assertEquals(VariablesTest,ObtInfo.mostrarTipoDeAtributoDeClase(C1Test1));
	
	}

	@Test
	public void ValidaObjetoConUnAtributoBoolean() {
		C2Test2=new C2(true);
		
		VariablesTest.add("boolean");
		
		assertEquals(VariablesTest,ObtInfo.mostrarTipoDeAtributoDeClase(C2Test2));
	
	}

	@Test
	public void ValidaObjetoConDosValoresEnteros() {		
		C1Test1=new C1(1,2);
		
		VariablesTest.add("1");
		VariablesTest.add("2");
		
		assertEquals(VariablesTest,ObtInfo.mostrarValorAtributoDeClase(C1Test1));
	
	}

	@Test
	public void ValidaObjetoConUnaValorBoolean() {
		C2Test2=new C2(true);
		
		VariablesTest.add("true");
		
		assertEquals(VariablesTest,ObtInfo.mostrarValorAtributoDeClase(C2Test2));
	
	}

	@Test
	public void ValidaObjetoPorNombreDeClase() {
		C1Test1=new C1(1,2);
		

		
		assertEquals("C1",ObtInfo.mostrarNombreDeClase(C1Test1));
	
	}	
	
	

}
