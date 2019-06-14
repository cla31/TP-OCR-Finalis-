package com.garage.main;


import java.util.ArrayList;
import java.util.List;

import com.garage.vehicule.Vehicule;

import java.io.*;


/**
 * Correction com.paquet.tpEssaiV06
 * Classe déclarant un garage contenant des véhicules
 * @author claire
 *
 */

public class Garage { //implements Serializable: pas besoin

	/**
	 * Liste des objets Vehicule dans le garage
	 */
	private List<Vehicule> voitures = new ArrayList<>();
 /**
   * Utilisation d'un objet File dont les méthodes permettent entre autres 
   * de supprimer un fichier, créer un répertoire etc.
   */
    private File f = new File("garage.txt");
    /**
     * Classes pour sérialiser:
     * ObjectOutputStream = Adapté pour les données d’octets brutes.
     * ObjectInputStream = classe qui permet d'écrire au niveau de notre flux de sortie.
     * L'utilisation de ces objets necessite la gestion des exceptions.
     */
    private ObjectOutputStream oos;
    private ObjectInputStream ois;
 
	  
	  

	/**
	 * Constructeur:
	 */
	
	
	public Garage(){

	    if(!f.exists()) {
	      System.err.println("Aucune voiture sauvegardée !");
	    }
	    System.out.println("***************************\n" + "*  Garage OpenClassrooms  *\n" + "***************************");
	  }

	/**
	 * Permet d'ajouter un Vehicule à la liste des voitures 
	 * @param voit = un objet Vehicule
	 */
	public void addVoiture(Vehicule voit){
		 /**
	     * Ajout des voitures dans l'arraylist 
	     */

	    this.voitures.add(voit);
		
	    
	    try {
            /**
             * Pattern decorator
             */
	        oos = new ObjectOutputStream(
	                new BufferedOutputStream(
	                        new FileOutputStream(
	                                new File("garage.txt"))));

	        oos.reset();
	        /**
	         * ecriture de l'objet avec en paramètre l'objet concerné. 
	         */
	        oos.writeObject(voitures);
	        /**
	         * Penser à fermer notre ressource.
	         */
	        oos.close();


	      } catch (IOException e) {
	        e.printStackTrace();
	      }

	}
	
	/**
     * String permettant d'afficher le contenu du garage
     * @return texte affichant toute la liste des vehicules contenu dans le garage
     */
 
	
	public String toString(){

	    /**
		 * Lire dans le fichier grace à l'Arraylist lecture
		 */
	    ArrayList<Vehicule> nouveauGarage;
	    String str = "\n";

	    try {

	      ois = new ObjectInputStream(
	              new BufferedInputStream(
	                      new FileInputStream(
	                              new File("garage.txt"))));
	      /**
	       * lecture:
	       */
	      nouveauGarage = (ArrayList<Vehicule>) ois.readObject();

	      for(int i = 0;i<nouveauGarage.size();i++)
	        str += nouveauGarage.get(i) + "\n";


	    } catch (IOException e) {
	    } catch (ClassNotFoundException e) {
	      e.printStackTrace();
	    }



	    return str;
	  }
	
	
}
