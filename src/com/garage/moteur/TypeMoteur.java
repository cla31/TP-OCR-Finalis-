package com.garage.moteur;

/**
 * <p>Les énumérations sont des structures qui définissent une liste de valeurs possibles. 
 * Cela nous permet de créer des types de données personnalisés.
 * Nous allons par exemple construire le type Langage qui ne peut prendre 
 * qu'un certain nombre de valeurs : JAVA, PHP, C, etc.</p>
 * 
 * <p>Les énumérations servent entre autres à déterminer les valeurs possibles:
 * ie pour éviter que notre utilisateur mette n'importe quoi comme
 * moteurNimporteQuoi ou que sais-je...</p>
 * 
 * <p>c'est un type spécial qui va nous permettre destocker un ensemble prédéfini de constantes.
 * pour appeler la valeur onfait comme ça:</p>
 *  
 *  <code> public TypeMoteur getTypeMoteur()
 *   {
 *   	return type;
 *  }</code>
 *  
 * @see classe Moteur
 * @author claire
 *
 */

public enum TypeMoteur {

	DIESEL("Diesel"),
	ESSENCE("Essence"),
	HYBRIDE("Hybride"),
	ELECTRIQUE("Electrique");

	TypeMoteur(String type){
		
	}

}
