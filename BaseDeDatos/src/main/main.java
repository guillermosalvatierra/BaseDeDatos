package main;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObtenedorDeInformacionDeObjeto a= new ObtenedorDeInformacionDeObjeto();
		System.out.println(a.traerInformacionDeAtributos(new C1(3,4)).obtenerAtributosJSON());
		
	}

}
