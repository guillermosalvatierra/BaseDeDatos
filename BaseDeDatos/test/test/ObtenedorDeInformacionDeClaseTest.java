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


public class ObtenedorDeInformacionDeClaseTest {

	private ObtenedorDeInformacionDeClase ClassInfo=new ObtenedorDeInformacionDeClase();

	private List<String> VariablesTest=new ArrayList<String>();


	
	
	
	@Test
	public void ValidaObjetoConDosAtributos() {
		
	
		Atributo a0 = new AtributoCompuesto("main.C1","main.C1",false);
		a0.agregarHoja(new AtributoSimpleClase("C1variableEntero1", "int"));
		a0.agregarHoja(new AtributoSimpleClase("C1variableEntero2", "int"));

		
		Atributo a=  ClassInfo.traerInformacionDeAtributos("main.C1");;
		
		
		assertEquals(a0,a);
		
	}

	@Test
	public void ValidaObjetoConUnAtributo() {

		Atributo a0=new AtributoSimpleClase("C2variableBoolean", "boolean");

		Atributo a= ClassInfo.traerInformacionDeAtributos("main.C2");
		
		assertEquals(a0,a);
	
	
	}

/*
	
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
		
		AtributoCompuesto a= (AtributoCompuesto) ClassInfo.traerInformacionDeAtributos("main.C2");

		assertEquals(VariablesTest,a.getTiposDeAtributos());

	
	}*/


}
