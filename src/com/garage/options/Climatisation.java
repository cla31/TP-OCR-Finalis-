package com.garage.options;
/**
 * Classe permettant d'instancier des Options de type Climatisation, implémentant l'interface Option
 * @see Option
 * @author Claire
 */
public class Climatisation implements Option {

	@Override
	public double prix() {
		return 900.0d;
	} 

	
	public String toString() {
	    return "Climatisation (" + this.prix() + " €)";
	  }
	
	
	
	
	
}