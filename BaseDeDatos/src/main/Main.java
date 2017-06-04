package main;
import java.util.ArrayList;
import java.util.List;

public class Main {

	
	public static void main(String[] args) {

		
	List<Object> lista = new ArrayList<Object>();
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

/*	ObtenedorDeInformacionPorClase o = new ObtenedorDeInformacionPorClase();
	
	o.mostrarAtributoDeClase("C1");
	o.mostrarTipoDeAtributoDeClase("C2");
	*/
	
	}	
	
}
