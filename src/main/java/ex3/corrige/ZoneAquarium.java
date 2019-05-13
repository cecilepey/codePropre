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
public class ZoneAquarium extends ZoneZoo {

	@Override
	public double calculerKgsNourritureParJour() {

		return listeAnimal.size() * 0.2;
	}

	@Override
	public boolean getType(Animal animal) {
		if (animal.getType().equals(Type.POISSON)) {
			return true; 
		}
		return false;
		
	}

}
