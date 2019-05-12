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

	@Override
	public boolean getType(Animal animal) {
		if (animal.getType().equals(Type.MAMMIFERE) && animal.getComportement().equals(Comportement.HERBIVORE)) {
			return true; 
		}
		return false;

	}

}
