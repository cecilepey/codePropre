package ex3.corrige;

/**
 * Classe qui gère la zone Carnivore du zoo
 * 
 * @author Cécile Peyras
 *
 */
public class CarnivoreCorrige extends ZoneZoo {

	@Override
	public double calculerKgsNourritureParJour() {

		return listeAnimal.size() * 10;
	}

}
