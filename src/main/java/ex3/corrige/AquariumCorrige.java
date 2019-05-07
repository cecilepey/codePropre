/**
 * 
 */
package ex3.corrige;

/**
 * Classe qui gère la zone Aquarium du zoo
 * 
 * @author Cécile Peyras
 *
 */
public class AquariumCorrige extends ZoneZoo {

	@Override
	public double calculerKgsNourritureParJour() {

		return listeAnimal.size() * 0.2;
	}

}
