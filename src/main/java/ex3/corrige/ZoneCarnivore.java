package ex3.corrige;

/**
 * Classe qui gère la zone Carnivore du zoo
 * 
 * @author Cécile Peyras
 *
 */
public class ZoneCarnivore extends ZoneZoo {

	@Override
	public double calculerKgsNourritureParJour() {

		return listeAnimal.size() * 10;
	}

	@Override
	public boolean getType(Animal animal) {
		if (animal.getType().equals(Type.MAMMIFERE) && animal.getComportement().equals(Comportement.CARNIVORE)) {
			return true;
		}
		return false;

	}

}
