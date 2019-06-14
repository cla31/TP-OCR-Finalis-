package com.garage.options;


import java.io.Serializable;

/**
* <p>La sérialisation c'est quand on veut écrire des objets dans des fichiers
*Rien qu'en implémentant l'interface "Serializable"dans un objet, 
*java sait que cet objet peut être sérialisé (et ses enfants aussi si c'est une super classe).</p>
*
*
*<p>Nous pourrons utiliser les classes héritant de cette interface
*de façon polymorphe sans nous soucier de savoir la classe dont
*sont issus nos objets. Dans notre cas la classe vehicule comprendra des objets de type Option
* @see Vehicule.</p>
* @author claire
*/

public interface Option extends Serializable {
	/**
	 * Interface Option, supertype pour les options de Vehicule
	 * @author claire
	 */
	public double prix ();
	/**
     * Cree et retourne une phrase avec les informations de l'instance
     * @return la phrase constitue du nom de l'option et de son prix
     */
     public String toString();

}
