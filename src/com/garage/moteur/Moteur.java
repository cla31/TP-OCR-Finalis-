package com.garage.moteur;


import java.io.Serializable;

/**
 * <p>Class abstraite Moteur qui permet d'avoir des objets moteur � ajouter au vehicule</p>
 * 
 * <p>On peut dire par exemple que MoteurDiesel "est un" objet Moteur.
 * @see Classe moteurDiesel
 * On peut dire aussi que Moteur "a un " objet (enum) TypeMoteur (essence etc)
 * @see enum�ration Type Moteur
 * On peut dire aussi que Vehicule "a un " objet Moteur
 * @see classe Vehicule
 *</p>
 * 
 * <p>La s�rialisation c'est quand on veut �crire des objets dans des fichiers
 *Rien qu'en impl�mentant l'interface "Serializable"dans un objet, 
 *java sait que cet objet peut �tre s�rialis� (et ses enfants aussi si c'est une super classe).</p>
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
     * constructeur sans param�tre:
     */
    public Moteur(){
        this.type = null;
        this.cylindre = "Inconnu";
        this.prix = 0.0d;
      }
	
    
    /**
     * Constructeur avec param�tre:
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
     * Retourne un texte d�crivant tous les attributs du moteur
     * @return phrase d�crivant le moteur
     */

	public String toString(){
	    return this.getTypeMoteur() + " " + this.getCylindre() + " (" + this.getPrix()  + "�) " ;
	  }
	
	 public void setTypeMoteur(TypeMoteur pType) {
		    this.type = pType;
		  }
	
	

}
