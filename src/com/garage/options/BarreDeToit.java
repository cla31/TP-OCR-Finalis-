package com.garage.options;
/**
 * Classe permettant d'instancier des Options de type BarreDeToit, implémentant l'interface Option
 * @see Option
 * @author Claire
 */

public class BarreDeToit implements Option { 

	@Override
	public double prix() {
		return 200.0d;
	}
	
	public String toString() {
	    return "Barre de toit (" + this.prix() + " €)";
	  }


	
	

}
