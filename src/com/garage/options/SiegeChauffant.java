package com.garage.options;
/**
 * Classe permettant d'instancier des Options de type SiègeChauffant, implémentant l'interface Option
 * @see Option
 * @author Claire
 */

public class SiegeChauffant implements Option {

	@Override
	public double prix() {
		
		return 1300.0d;
	} 
	
	
	  public String toString() {
	    return "Sieges chauffant (" + this.prix() + " €)";
	  }
	
	
}
