package Borrar;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public  class ObtenedorInformacionDeObjeto {

	private static  Map<IAtributo, InformacionDeAtributoObtenible> InfoAtributos=inicializar();

	public List<String> traerInformacionDeAtributos(Object o, IAtributo atributo){

		List<String> LAtributos=new ArrayList<String>();
		
		Class<? extends Object> clase = o.getClass();
		
		Field[] atributos = clase.getFields();
		
		for (Field atr: atributos){
			InformacionDeAtributoObtenible a =InfoAtributos.get(atributo);
			LAtributos.add(a.ObtenedorDato(atr, o));
		}	
		
		return LAtributos;
	}
	

	public String traerNombreDeClase(Object o){
		
		Class<? extends Object> clase = o.getClass();
		return clase.getSimpleName();

	}

	
	private static  Map<IAtributo, InformacionDeAtributoObtenible> inicializar(){
	
		Map<IAtributo, InformacionDeAtributoObtenible> s = new HashMap<IAtributo, InformacionDeAtributoObtenible>();

		s.put(IAtributo.NOMBRE,new ObtenedorNombreAtributosDeObjeto());
		s.put(IAtributo.TIPO,new ObtenedorTipoAtributoDeObjeto());
		s.put(IAtributo.VALOR,new ObtenedorValorAtributoDeObjeto());

		return s;
	}
	
	
	/*protected Object cx;
	
	public ObtenedorInformacionDeObjeto(Object cx) {
		this.cx = cx;


	}

	protected List<String> traerInformacionDeAtributos(){

		List<String> LAtributos=new ArrayList<String>();
		
		Class<? extends Object> clase = cx.getClass();
		
		Field[] atributos = clase.getFields();
		
		for (Field atr: atributos){
			LAtributos.add(ObtenedorDato(atr));
		}	
		return LAtributos;
	}

	
	public String ObtenedorDato(Field f) {
		String nombreAtributo = f.getType()+":" +f.getName();
		return nombreAtributo;
		
	}
	*/

}
