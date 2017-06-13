package main;


public class Main {

	
	public static void main(String[] args) {

		
		 C1 C1Test1=new C1(1,2);
		 C2 C2Test2=new C2(true);
		 C3 C3Test3=new C3(C1Test1,true);
		 C4 C4Test4=new C4(true,'A',107777, C1Test1);
		 
		
		
		ObtenedorDeInformacionDeObjeto obte1=new ObtenedorDeInformacionDeObjeto();
		System.out.println(obte1.traerInformacionDeAtributos(C3Test3).obtenerAtributosJSON());
		
//		ObtenedorDeInformacionDeClase obte2=new ObtenedorDeInformacionDeClase();
//		System.out.println(obte2.traerInformacionDeAtributos("main.C3").obtenerAtributosJSON());

		
		
		
	}	
	
}
