package main;

import java.util.ArrayList;
import java.util.List;

public class AtributoCompuesto implements Componedor{
	   private List<Componedor> hijo = new ArrayList<Componedor>();

	@Override
	public int getInformacion() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void agregarHoja(Componedor composicion) {
		// TODO Auto-generated method stub
		hijo.add(composicion);
	}

	@Override
	public String toString() {
		
		return "AtributoCompuesto [hijo=" + hijo + "]";
	}
	
	
}
