package com.garage.moteur;

/**
 *<p>On peut dire que MoteurEssence "est un" objet Moteur.
 * @see Classe Moteur
 */
public class MoteurEssence extends Moteur {
	TypeMoteur ESSENCE = null;
	public MoteurEssence( String cylindre, Double prix) {
		super( cylindre, prix);
		this.setTypeMoteur(TypeMoteur.ESSENCE);
		
	}

}
