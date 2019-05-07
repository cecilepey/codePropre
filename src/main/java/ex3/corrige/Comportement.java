/**
 * 
 */
package ex3.corrige;

/**
 * @author Cécile Peyras
 *
 */
public enum Comportement {

	HERBIVORE("Herbiore"), CARNIVORE("Carnivore");

	private String comportement;

	/**
	 * Constructeur
	 * 
	 * @param comportement
	 */
	private Comportement(String comportement) {
		this.comportement = comportement;
	}

	/**
	 * Getter
	 * 
	 * @return the comportement
	 */
	public String getComportement() {
		return comportement;
	}

	/**
	 * Setter
	 * 
	 * @param comportement
	 *            the comportement to set
	 */
	public void setComportement(String comportement) {
		this.comportement = comportement;
	}

}
