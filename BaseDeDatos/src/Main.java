import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

	List<Object> lista = new ArrayList<Object>();
	lista.add(new C1(1,2));
	lista.add(new C1(3,4));
	lista.add(new C2(true));

	HerramientaGenerica h =new HerramientaGenerica();
	

	for (Object c: lista){
		h.mostrarAtributoDeClase(c);
		h.mostrarValorAtributoDeClase(c);
	}
	
	
	
	
	
/*	
	Class clase = C1.class;

	Field[] atributos = clase.getFields();
	
	for (Field atr: atributos){
		Field atributo = atr;
		String nombreAtributo = atributo.getName();
		System.out.println("Nombre del Atributo: " + nombreAtributo);
	}

	for (C1 c: lista){
		System.out.println( c.variableEntero);
	}
*/
	
	
	
/*	for (Object c: lista){
		
		
		Class clase = c.getClass();

		Field[] atributos = clase.getFields();
		
		Field atributo = atributos[0];
		String nombreAtributo = atributo.getName();
		System.out.println("Nombre del Atributo: " + nombreAtributo);

		
		System.out.println( c);
		
	}
	
	*/
	}	
	
}
