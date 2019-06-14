package com.garage.moteur;

/**
 * <p>Les �num�rations sont des structures qui d�finissent une liste de valeurs possibles. 
 * Cela nous permet de cr�er des types de donn�es personnalis�s.
 * Nous allons par exemple construire le type Langage qui ne peut prendre 
 * qu'un certain nombre de valeurs : JAVA, PHP, C, etc.</p>
 * 
 * <p>Les �num�rations servent entre autres � d�terminer les valeurs possibles:
 * ie pour �viter que notre utilisateur mette n'importe quoi comme
 * moteurNimporteQuoi ou que sais-je...</p>
 * 
 * <p>c'est un type sp�cial qui va nous permettre destocker un ensemble pr�d�fini de constantes.
 * pour appeler la valeur onfait comme �a:</p>
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
