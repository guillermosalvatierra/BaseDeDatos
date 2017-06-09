package test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import Borrar.IAtributo;
import Borrar.ObtenedorDeInformacionDeClase;

public class ObtenedorDeInformacionDeClaseTest {

	private ObtenedorDeInformacionDeClase ClassInfo=new ObtenedorDeInformacionDeClase();
	
	private List<String> VariablesTest=new ArrayList<String>();


	
	
	
	@Test
	public void ValidaObjetoConDosAtributos() {
		
		VariablesTest.add("C1variableEntero1");
		VariablesTest.add("C1variableEntero2");
		
		System.out.println(ClassInfo.traerInformacionDeAtributos("main.C1", IAtributo.NOMBRE));
		assertEquals(VariablesTest,ClassInfo.traerInformacionDeAtributos("main.C1", IAtributo.NOMBRE));
	
	}

	@Test
	public void ValidaObjetoConUnAtributo() {
		
		VariablesTest.add("C2variableBoolean");
		
		assertEquals(VariablesTest,ClassInfo.traerInformacionDeAtributos("main.C2", IAtributo.NOMBRE));
	
	}


	
	@Test
	public void ValidaObjetoConDosAtributosEnteros() {		
		
		VariablesTest.add("int");
		VariablesTest.add("int");
		
		assertEquals(VariablesTest,ClassInfo.traerInformacionDeAtributos("main.C1", IAtributo.TIPO));
	
	}

	@Test
	public void ValidaObjetoConUnAtributoBoolean() {
		
		VariablesTest.add("boolean");
		
		assertEquals(VariablesTest,ClassInfo.traerInformacionDeAtributos("main.C2", IAtributo.TIPO));
	
	}


}
