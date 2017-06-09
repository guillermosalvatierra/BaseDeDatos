package test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import Borrar.IAtributo;
import Borrar.ObtenedorDeInformacionPorObjetoBORRAR;
import Borrar.ObtenedorInformacionDeObjetoBORRAR;
import main.C1;
import main.C2;

public class ObtenedorDeInformacionDeObjetoTest {

	private C1 C1Test1=null;
	private C2 C2Test2=null;

	private ObtenedorInformacionDeObjetoBORRAR ObtInfo=new ObtenedorInformacionDeObjetoBORRAR();
	
	private List<String> VariablesTest=new ArrayList<String>();

	@Test
	public void ValidaObjetoConDosAtributos() {
		C1Test1=new C1(1,2);
		
		VariablesTest.add("C1variableEntero1");
		VariablesTest.add("C1variableEntero2");
		
		assertEquals(VariablesTest,ObtInfo.traerInformacionDeAtributos(C1Test1, IAtributo.NOMBRE));
	
	}

	@Test
	public void ValidaObjetoConUnAtributo() {
		C2Test2=new C2(true);
		
		VariablesTest.add("C2variableBoolean");
		
		assertEquals(VariablesTest,ObtInfo.traerInformacionDeAtributos(C2Test2, IAtributo.NOMBRE));
	
	}


	
	@Test
	public void ValidaObjetoConDosAtributosEnteros() {		
		C1Test1=new C1(1,2);
		
		VariablesTest.add("int");
		VariablesTest.add("int");
		
		assertEquals(VariablesTest,ObtInfo.traerInformacionDeAtributos(C1Test1, IAtributo.TIPO));
	
	}

	@Test
	public void ValidaObjetoConUnAtributoBoolean() {
		C2Test2=new C2(true);
		
		VariablesTest.add("boolean");
		
		assertEquals(VariablesTest,ObtInfo.traerInformacionDeAtributos(C2Test2, IAtributo.TIPO));
	
	}

	@Test
	public void ValidaObjetoConDosValoresEnteros() {		
		C1Test1=new C1(1,2);
		
		VariablesTest.add("1");
		VariablesTest.add("2");
		
		assertEquals(VariablesTest,ObtInfo.traerInformacionDeAtributos(C1Test1, IAtributo.VALOR));
	
	}

	@Test
	public void ValidaObjetoConUnaValorBoolean() {
		C2Test2=new C2(true);
		
		VariablesTest.add("true");
		
		assertEquals(VariablesTest,ObtInfo.traerInformacionDeAtributos(C2Test2, IAtributo.VALOR));
	
	}

	@Test
	public void ValidaObjetoPorNombreDeClase() {
		C1Test1=new C1(1,2);
		

		
		assertEquals("C1",ObtInfo.traerNombreDeClase(C1Test1));
	
	}	
	
	

}
