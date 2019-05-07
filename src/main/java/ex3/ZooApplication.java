package ex3;

import ex3.corrige.Animal;
import ex3.corrige.Comportement;
import ex3.corrige.Type;
import ex3.corrige.ZooCorrige;

public class ZooApplication {

	public static void main(String[] args) {
		ZooCorrige zoo = new ZooCorrige("Thoiry");

		zoo.addAnimal(new Animal(Type.MAMMIFERE, "Gazelle", Comportement.HERBIVORE));
		zoo.addAnimal(new Animal(Type.MAMMIFERE, "Zèbre", Comportement.HERBIVORE));
		zoo.addAnimal(new Animal(Type.MAMMIFERE, "Lion", Comportement.CARNIVORE));
		zoo.addAnimal(new Animal(Type.MAMMIFERE, "Panthère", Comportement.CARNIVORE));
		zoo.addAnimal(new Animal(Type.POISSON, "Requin Blanc", Comportement.CARNIVORE));
		zoo.addAnimal(new Animal(Type.POISSON, "Truite dorée", Comportement.HERBIVORE));
		zoo.addAnimal(new Animal(Type.REPTILE, "Boa constrictor", Comportement.CARNIVORE));
		zoo.addAnimal(new Animal(Type.REPTILE, "Python", Comportement.CARNIVORE));

		zoo.afficherListeAnimaux();
	}

}
