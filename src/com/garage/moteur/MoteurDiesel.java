package com.garage.moteur;

	/**
	 *  <p>On peut dire que MoteurDiesel "est un" objet Moteur.
	 * @see Classe Moteur
	 */
public class MoteurDiesel extends Moteur {

     TypeMoteur DIESEL = null;

	public MoteurDiesel( String cylindre, Double prix) {
		super( cylindre, prix);
	
	}

}
