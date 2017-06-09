package main;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Main {

	
	public static void main(String[] args) {

		
		 C1 C1Test1=new C1(1,2);
		 C2 C2Test2=new C2(true);
		 C3 C3Test3=new C3(C1Test1,true);
		 
		ObtenedorDeInformacionDeObjeto obte=new ObtenedorDeInformacionDeObjeto();
		System.out.println(obte.traerInformacionDeAtributos(C3Test3).toString());
		
	
	}	
	
}
