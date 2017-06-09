package Borrar;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ObtenedorDeInformacionDeClase{
	
	private static  Map<IAtributo, InformacionDeAtributoObtenible> InfoAtributos=inicializar();

	public List<String> traerInformacionDeAtributos(String c, IAtributo atributo){

		List<String> LAtributos=new ArrayList<String>();
		
		Class<? extends Object> clase;
		try {
			clase = Class.forName(c);

			Field[] atributos = clase.getFields();
			
			for (Field atr: atributos){
				InformacionDeAtributoObtenible a =InfoAtributos.get(atributo);
				LAtributos.add(a.ObtenedorDato(atr, c));
			}	
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return LAtributos;
		
	}
	


	private static  Map<IAtributo, InformacionDeAtributoObtenible> inicializar(){
	
		Map<IAtributo, InformacionDeAtributoObtenible> s = new HashMap<IAtributo, InformacionDeAtributoObtenible>();

		s.put(IAtributo.NOMBRE,new ObtenedorNombreAtributosDeObjeto());
		s.put(IAtributo.TIPO,new ObtenedorTipoAtributoDeObjeto());

		return s;
	}
	

	
	
	
}
