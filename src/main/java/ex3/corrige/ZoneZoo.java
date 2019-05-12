/**
 * 
 */
package ex3.corrige;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe mère qui gère les méthodes pour les différentes zone du zoo
 * 
 * @author Cécile Peyras
 *
 */
public abstract class ZoneZoo {

	/** listeAnimal : List<Animal> : liste qui contient les animaux */
	List<Animal> listeAnimal = new ArrayList<>();

	/**
	 * méthode qui ajoute un animal à la zone du zoo
	 * 
	 * @param animal
	 */
	public void addAnimal(Animal animal) {
		if (getType(animal)) {
			listeAnimal.add(animal); 
			
		}

	}

	/**
	 * méthode qui permet de connaitre la zone de l'animal 
	 * @param animal
	 */
	public abstract boolean getType(Animal animal);

	/**
	 * Méthode qui affiche la liste des animaux de la zone
	 * 
	 */
	public void afficherListeAnimaux() {
		for (Animal liste : listeAnimal) {
			System.out.println(liste.getNom());
		}
	}

	/**
	 * méthode qui calcule la nourriture à donner aux animaux en fonction du nombre
	 * d'animaux de la zone
	 * 
	 * @return le poids à donner aux animaux
	 */
	public abstract double calculerKgsNourritureParJour();

	/**
	 * méthode qui compte les animaux de la zone
	 * 
	 * @return le nombre d'animaux
	 */
	public int compterAnimaux() {
		return listeAnimal.size();
	}

}
