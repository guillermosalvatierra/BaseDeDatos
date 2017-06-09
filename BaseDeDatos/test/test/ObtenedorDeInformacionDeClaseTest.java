package test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import main.AtributoCompuesto;
import main.ObtenedorDeInformacionDeClase;


public class ObtenedorDeInformacionDeClaseTest {

	private ObtenedorDeInformacionDeClase ClassInfo=new ObtenedorDeInformacionDeClase();

	private List<String> VariablesTest=new ArrayList<String>();


	
	
	
	@Test
	public void ValidaObjetoConDosAtributos() {
		
		VariablesTest.add("C1variableEntero1");
		VariablesTest.add("C1variableEntero2");
		
		AtributoCompuesto a=(AtributoCompuesto) ClassInfo.traerInformacionDeAtributos("main.C1");
				
		assertEquals(VariablesTest,a.getNombresDeAtributos());
	
	}

	@Test
	public void ValidaObjetoConUnAtributo() {
		
		VariablesTest.add("C2variableBoolean");

		AtributoCompuesto a=(AtributoCompuesto) ClassInfo.traerInformacionDeAtributos("main.C2");

		
		assertEquals(VariablesTest,a.getNombresDeAtributos());

	
	}


	
	@Test
	public void ValidaObjetoConDosAtributosEnteros() {		
		
		VariablesTest.add("int");
		VariablesTest.add("int");
		
		AtributoCompuesto a=(AtributoCompuesto) ClassInfo.traerInformacionDeAtributos("main.C1");

		assertEquals(VariablesTest,a.getTiposDeAtributos());
	
	}

	@Test
	public void ValidaObjetoConUnAtributoBoolean() {
		
		VariablesTest.add("boolean");
		
		AtributoCompuesto a=(AtributoCompuesto) ClassInfo.traerInformacionDeAtributos("main.C2");

		assertEquals(VariablesTest,a.getTiposDeAtributos());

	
	}


}
