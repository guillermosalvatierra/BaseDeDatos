package main;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Main {

	
	public static void main(String[] args) {

		
		 C1 C1Test1=new C1(1,2);		
		 C3 C3Test3=new C3(C1Test1,true);

		ObtenedorDeInformacionDeObjetoFinal obte=new ObtenedorDeInformacionDeObjetoFinal();
		System.out.println(obte.traerInformacionDeAtributos(C3Test3).toString());
		
		/*ObtenedorDeInformacionPorClase o= new ObtenedorDeInformacionPorClase();
		
		o.mostrarAtributoDeClase("main.C1");
		
		 C1 C1Test1=new C1(1,2);
//		 ObtenedorDeInformacionPorObjeto ObtInfo=new ObtenedorDeInformacionPorObjeto();
//		 List<String> VariablesEnteros=new ArrayList<String>();

	
		C1Test1=new C1(1,2);
	
		
		ObtenedorInformacionDeObjeto c = new ObtenedorInformacionDeObjeto();

		List<String> traerInformacionDeAtributos = c.traerInformacionDeAtributos(C1Test1, IAtributo.NOMBRE);
		System.out.println(traerInformacionDeAtributos);
		*/
//		VariablesEnteros.add("int");
//		VariablesEnteros.add("int");

//		System.out.println(VariablesEnteros+" "+ObtInfo.mostrarNombreDeClase(C1Test1));
	
		
/*		ObtenedorInformacionDeObjeto ObtNo = new ObtenedorInformacionDeObjeto(C1Test1);
		System.out.println(	((ObtenedorNombreAtributosDeObjeto)ObtNo).mostrarInformacionDeAtributos());
		System.out.println(	((ObtenedorTipoAtributoDeObjeto)ObtNo).mostrarInformacionDeAtributos());
	*/	
	/*	Map<IAtributo, List<String>> s = new HashMap<IAtributo, List<String>>();

	
		
		s.put(IAtributo.NOMBRE,(new ObtenedorNombreAtributosDeObjeto(C1Test1)).traerInformacionDeAtributos());
		s.put(IAtributo.TIPO,(new ObtenedorTipoAtributoDeObjeto(C1Test1)).traerInformacionDeAtributos());
		s.put(IAtributo.VALOR,(new ObtenedorValorAtributoDeObjeto(C1Test1)).traerInformacionDeAtributos());
	
		System.out.println(s.get(IAtributo.NOMBRE));
		System.out.println(s.get(IAtributo.VALOR));
		System.out.println(s.get(IAtributo.TIPO));
*/
/*	List<Object> lista = new ArrayList<Object>();
	lista.add(new C1(1,2));
	lista.add(new C1(3,4));
	lista.add(new C2(true));

	ObtenedorDeInformacionPorObjeto h =new ObtenedorDeInformacionPorObjeto();
	
	for (Object c: lista){
		System.out.println(h.mostrarNombreDeClase(c));
		System.out.println(h.mostrarAtributoDeClase(c));
		System.out.println(h.mostrarValorAtributoDeClase(c));
//		h.mostrarNombreDeClase(c);
//		h.mostrarAtributoDeClase(c);
//		h.mostrarValorAtributoDeClase(c);
	}
*/
		
	
	}	
	
}
