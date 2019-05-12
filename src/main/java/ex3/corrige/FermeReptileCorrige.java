package ex3.corrige;

/**
 * Classe qui gère les animaux de la zone reptile
 * 
 * @author Cécile Peyras
 *
 */
public class FermeReptileCorrige extends ZoneZoo {

	@Override
	public double calculerKgsNourritureParJour() {

		return listeAnimal.size() * 0.1;
	}

	@Override
	public boolean getType(Animal animal) {
		if (animal.getType().equals(Type.REPTILE)) {
			return true; 
		}
		return false;
		
	}

}
