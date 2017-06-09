package test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import main.AtributoCompuesto;
import main.C1;
import main.C2;
import main.C3;
import main.Componedor;
import main.ObtenedorDeInformacionDeObjeto;

public class AtributoJsonTest {

	private C1 C1Test1=null;
	 
	private ObtenedorDeInformacionDeObjeto obte1=new ObtenedorDeInformacionDeObjeto();


	@Test
	public void ValidaJson() {
		C1Test1=new C1(1,2);
		
		AtributoCompuesto a= (AtributoCompuesto) obte1.traerInformacionDeAtributos(C1Test1);
		
		
		assertFalse(a.obtenerAtributosJSON().isEmpty());
	
	}

	
}
