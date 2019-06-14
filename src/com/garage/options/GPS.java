package com.garage.options;
/**
 * Classe permettant d'instancier des Options de type GPS, implémentant l'interface Option
 * @see Option
 * @author Claire
 */

public class GPS implements Option{

	@Override
	public double prix() {
		
		return 130.0d;
	}
	
	public String toString() {
	    return "GPS (" + this.prix() + " €)";
	  }


}
