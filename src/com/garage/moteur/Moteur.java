package com.garage.moteur;


import java.io.Serializable;

/**
 * <p>Class abstraite Moteur qui permet d'avoir des objets moteur à ajouter au vehicule</p>
 * 
 * <p>On peut dire par exemple que MoteurDiesel "est un" objet Moteur.
 * @see Classe moteurDiesel
 * On peut dire aussi que Moteur "a un " objet (enum) TypeMoteur (essence etc)
 * @see enumération Type Moteur
 * On peut dire aussi que Vehicule "a un " objet Moteur
 * @see classe Vehicule
 *</p>
 * 
 * <p>La sérialisation c'est quand on veut écrire des objets dans des fichiers
 *Rien qu'en implémentant l'interface "Serializable"dans un objet, 
 *java sait que cet objet peut être sérialisé (et ses enfants aussi si c'est une super classe).</p>
 *
 * @author claire
 */
public abstract class Moteur implements Serializable {
	
	/**
     * Variable d'instance contenant le type venant de l'enumeration
     */
    private TypeMoteur type;
    
    /**
     * Variable d'instance contenant un texte sur le moteur
     */
    private String cylindre;
    
    /**
     * Variable d'instance contenant le prix du moteur
     */
    private double prix;
    
    /**
     * constructeur sans paramètre:
     */
    public Moteur(){
        this.type = null;
        this.cylindre = "Inconnu";
        this.prix = 0.0d;
      }
	
    
    /**
     * Constructeur avec paramètre:
     * @param cylindre texte sur la cylindre
     * @param prix = prix du moteur
     */
    public Moteur( String cylindre, Double prix){
       
        this.cylindre = cylindre;
        this.prix = prix;
    }
    
    public TypeMoteur getTypeMoteur()
    {
    	return type;
    }
    

	/**
     * Retourne le prix du moteur
     * @return prix
     */
	public Double getPrix() {
		return prix;
	}
	
	public String getCylindre(){
	    return cylindre;
	  }
	
	/**
     * Retourne un texte décrivant tous les attributs du moteur
     * @return phrase décrivant le moteur
     */

	public String toString(){
	    return this.getTypeMoteur() + " " + this.getCylindre() + " (" + this.getPrix()  + "€) " ;
	  }
	
	 public void setTypeMoteur(TypeMoteur pType) {
		    this.type = pType;
		  }
	
	

}
