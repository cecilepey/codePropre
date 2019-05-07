/**
 * 
 */
package ex3.corrige;

/**
 * Classe qui gère la zone Savane Africaine du zoo
 * 
 * @author Cécile Peyras
 *
 */
public class SavaneCorrige extends ZoneZoo {

	@Override
	public double calculerKgsNourritureParJour() {

		return listeAnimal.size() * 10;

	}

}
