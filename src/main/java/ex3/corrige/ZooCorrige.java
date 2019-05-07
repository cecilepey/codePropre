package ex3.corrige;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe qui permet de gérer le zoo avec ses différentes zones
 * 
 * @author Cécile Peyras
 *
 */
public class ZooCorrige {

	/** nom : String nom du zoo */
	private String nom;
	/** savane : zone du zoo : Savane Africaine */
	private SavaneCorrige savane = new SavaneCorrige();
	/** carnivore : zone du zoo : Carnivore */
	private CarnivoreCorrige carnivore = new CarnivoreCorrige();
	/** fermeReptile : zone du zoo : Ferme Reptile */
	private FermeReptileCorrige fermeReptile = new FermeReptileCorrige();
	/** aquarium : zone du zoo : Aquarium */
	private AquariumCorrige aquarium = new AquariumCorrige();

	/** zoo : List<ZoneZoo> liste contenant les zones du zoo */
	List<ZoneZoo> zoo = new ArrayList();

	/**
	 * Constructeur
	 * 
	 * @param nom
	 *            : nom du zoo
	 */
	public ZooCorrige(String nom) {
		this.nom = nom;

		zoo.add(savane);
		zoo.add(carnivore);
		zoo.add(fermeReptile);
		zoo.add(aquarium);
	}

	/**
	 * Méthode permettant d'ajouter un animal dans sa zone
	 * 
	 * @param animal
	 */
	public void addAnimal(Animal animal) {

		if (animal.getType().equals(Type.MAMMIFERE) && animal.getComportement().equals(Comportement.CARNIVORE)) {
			carnivore.addAnimal(animal);
		} else if (animal.getType().equals(Type.MAMMIFERE) && animal.getComportement().equals(Comportement.HERBIVORE)) {
			savane.addAnimal(animal);
		} else if (animal.getType().equals(Type.REPTILE)) {
			fermeReptile.addAnimal(animal);
		} else if (animal.getType().equals(Type.POISSON)) {
			aquarium.addAnimal(animal);
		}
	}

	/**
	 * méthode qui affiche la liste de tous les animaux du zoo
	 * 
	 */
	public void afficherListeAnimaux() {
		System.out.println("Animaux Carnivore :");
		carnivore.afficherListeAnimaux();
		System.out.println("Animaux de la Savane : ");
		savane.afficherListeAnimaux();
		System.out.println("Animaux de la ferme reptile :");
		fermeReptile.afficherListeAnimaux();
		System.out.println("Animaux de l'aquarium : ");
		aquarium.afficherListeAnimaux();
	}

	/**
	 * Getter for nom
	 * 
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Setter
	 * 
	 * @param nom
	 *            the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
}
