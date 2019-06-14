package com.garage.options;
/**
 * Classe permettant d'instancier des Options de type VitreElectrique, implémentant l'interface Option
 * @see Option
 * @author Claire
 */

public class VitreElectrique implements Option {

	@Override
	public double prix() {
		return 640.0d;
	}

	public String toString() {
	    return "Vitre electriques (" + this.prix() + " €)";
	  }

}
