package test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import Borrar.IAtributo;
import Borrar.ObtenedorDeInformacionPorObjetoBORRAR;
import Borrar.ObtenedorInformacionDeObjetoBORRAR;
import main.AtributoCompuesto;
import main.C1;
import main.C2;
import main.C3;
import main.ObtenedorDeInformacionDeObjeto;

public class ObtenedorDeInformacionDeObjetoTest {

	private C1 C1Test1=null;
	private C2 C2Test2=null;
	 
	private ObtenedorDeInformacionDeObjeto obte1=new ObtenedorDeInformacionDeObjeto();
	private List<String> VariablesTest=new ArrayList<String>();

	@Test
	public void ValidaObjetoConDosAtributos() {
		C1Test1=new C1(1,2);
		
		VariablesTest.add("C1variableEntero1");
		VariablesTest.add("C1variableEntero2");
		AtributoCompuesto a=(AtributoCompuesto) obte1.traerInformacionDeAtributos(C1Test1);
		
		
		assertEquals(VariablesTest,a.getNombresDeAtributos());
	
	}

	@Test
	public void ValidaObjetoConUnAtributo() {
		C2Test2=new C2(true);
		
		VariablesTest.add("C2variableBoolean");
		AtributoCompuesto a=(AtributoCompuesto) obte1.traerInformacionDeAtributos(C2Test2);

		
		assertEquals(VariablesTest,a.getNombresDeAtributos());
	
	}


	
	@Test
	public void ValidaObjetoConDosAtributosEnteros() {		
		C1Test1=new C1(1,2);
		
		VariablesTest.add("int");
		VariablesTest.add("int");

		AtributoCompuesto a=(AtributoCompuesto) obte1.traerInformacionDeAtributos(C1Test1);

		assertEquals(VariablesTest,a.getTiposDeAtributos());
	
	}

	@Test
	public void ValidaObjetoConUnAtributoBoolean() {
		C2Test2=new C2(true);
		
		VariablesTest.add("boolean");
		
		AtributoCompuesto a=(AtributoCompuesto) obte1.traerInformacionDeAtributos(C2Test2);

		assertEquals(VariablesTest,a.getTiposDeAtributos());
	
	}

	@Test
	public void ValidaObjetoConDosValoresEnteros() {		
		C1Test1=new C1(1,2);
		
		VariablesTest.add("1");
		VariablesTest.add("2");
		
		AtributoCompuesto a=(AtributoCompuesto) obte1.traerInformacionDeAtributos(C1Test1);

		assertEquals(VariablesTest,a.getValoresDeAtributos());
	
	}

	@Test
	public void ValidaObjetoConUnaValorBoolean() {
		C2Test2=new C2(true);
		
		VariablesTest.add("true");
		
		AtributoCompuesto a=(AtributoCompuesto) obte1.traerInformacionDeAtributos(C2Test2);

		assertEquals(VariablesTest,a.getValoresDeAtributos());
	
	}

	@Test
	public void ValidaObjetoPorNombreDeClase() {
		C1Test1=new C1(1,2);
		


		assertEquals("C1",obte1.mostrarNombreDeClase(C1Test1));
	
	}	
	
	

}
