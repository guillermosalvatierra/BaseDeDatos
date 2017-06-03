import java.util.ArrayList;
import java.util.List;

public class Main {

	public int Caleb;
	public static void main(String[] args) {

		
/*	List<Object> lista = new ArrayList<Object>();
	lista.add(new C1(1,2));
	lista.add(new C1(3,4));
	lista.add(new C2(true));

	HerramientaGenerica h =new HerramientaGenerica();
	
	for (Object c: lista){
		h.mostrarAtributoDeClase(c);
		h.mostrarValorAtributoDeClase(c);
	}
*/	

	ObtenedorDeInformacionPorClase o = new ObtenedorDeInformacionPorClase();
	
	o.mostrarAtributoDeClase("Main");
	o.mostrarTipoDeAtributoDeClase("Main");
	
	
	}	
	
}
