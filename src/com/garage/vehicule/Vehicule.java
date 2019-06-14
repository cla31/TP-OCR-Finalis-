package com.garage.vehicule;



import java.io.Serializable;
import java.util.ArrayList;

import java.util.List;

import com.garage.moteur.Moteur;
import com.garage.options.Option;




/**
 * <p>
 * Classe permettant de creer des voitures
 * @author claire </p>
 */

public class Vehicule implements Serializable {
	/**
	 * prix du vehicule
	 */
	double prix;
	/**
	 * nom du model de vehicule
	 */
	String nom;
	/**
	 * liste des options que possede le vehicule
	 */
	private List <Option> options = new ArrayList<Option>();
	/**
	 * marque du vehicule
	 */
	private Marque nomMarque;
	/**
	 * type de motorisation
	 */
	private Moteur moteur;
	
	/*
	 * constructeur par défaut
	 * permet d'initialiser les variables?
	 */
	
	public Vehicule() {
		this.prix = 0.00d;
		this.nom="Inconnu";
		/**
		 * <p>Arraylist est un objet appartenant à la catégorie List
		 * qui sont des tableaux extensibles à volonté.
		 * Dans la catégorie List il y a aussi par exemple les objets LinkedList.</p>
		 */
		this.options=new ArrayList<>(options);
		this.nomMarque=null;
		this.moteur=null;
		
		
	}

	/**
	 * <p>
	 * Constructeur avec paramètres
	 * @param pPrix
	 * @param pNom
	 * @param pOptions
	 * @param pNomMarque
	 * @param pMoteur
	 * </p>
	 */
	
	 public Vehicule(double pPrix, String pNom, List<Option> pOptions, Marque pNomMarque, Moteur pMoteur){
		    this.prix = pPrix;
		    this.nom = pNom;
		    this.options = new ArrayList<>(options);
		    this.nomMarque = pNomMarque;
		    this.moteur = pMoteur;
		  }
	
	
	/**
	 *  GETTERS *****************************************************************************************************
	 */
	
	
	/**
	 * <p>
	 * Retourne le prix
	 * @return prix </p>
	 */

	public double getPrix() {
		return prix;
	}
	
	/**
	 * <p>
	 * Retourne le nom du modèle
	 * @return nom </p>
	 */
	public String getNom() { 
		return nom;
	}
	
	/**
	 * <p>Retourne la liste des options
	 * @return un arrayList des objets Option</p>
	 */
	public List<Option> getOptions() {
		return options;
	}

	/**
	 * <p>retourne la marque du vehicule
	 * @return objet Marque</p>
	 */
	public Marque getNomMarque() {
		return nomMarque;
	}
	
	/**
	 * <p>retourne le moteur du vehicule
	 * @return objet Moteur</p>
	 */
	
	public Moteur getMoteur(){
	    return moteur;
	  }
	
public double getPrixTotal() { 
		
		double prixTotal = 0.00;
		for (int i = 0; i <this.getOptions().size();i++) {
			prixTotal+= this.getOptions().get(i).prix();
		}
		this.setPrix(this.moteur.getPrix() + prixTotal);
		return getPrix();
	}
	
    
	/**
	 * SETTERS***************************************************************************************************
	 */



	/**
	 * <p>
	 * Modifie le prix par le nouveau
	 * @param double prix : nouveau prix remplacant l'actuel </p>
	 */

	public void setPrix(double prix) {
		this.prix = prix;
	}

	
	/**
	 * <p>
	 * Modifie le nom
	 * @return nom </p>
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public void setOptions(List<Option> pOptions){
	    this.options = pOptions;
	  }

	  public void setNomMarque(Marque pNomMarque) {
	    this.nomMarque = pNomMarque;
	  }

	 
	  /**
		 * Modifie l'attribut moteur de vehicule et ajoute son prix a celui du vehicule
		 * @param moteur objet Moteur
		 */
		public void setMoteur(Moteur moteur){
			this.moteur = moteur;
			//pas besoinde ça:
			//this.addToPrix(moteur.getPrix());
		}



	/**
	 * <p>
	 * Texte décrivant le vehicule
	 * @return un string </p>
	 */


	public String toString() {
		
		return "Voiture "+this.getNomMarque() + " : " + this.getNom()
		+ " Moteur " + this.getMoteur().toString()
		+ this.getOptions()
		+" Prix total de : " + (this.getPrixTotal())+ " euros"; 
	}
	
	/**
	 * <p>
	 * Ajoute une option dans la list du vehicule et augmente le prix du vehicule
	 * @param opt object Option </p>
	 */
	public void addOption(Option opt){
		/**
		 * <p>
		 * add() fait partie de tout le panel de méthodes fourni avec l'objet ArrayList.
		 * permet de rajouter un élément dans la liste.
		 * @param un objet de la liste.</p>
		 */
	
		this.options.add(opt);
	}


}
