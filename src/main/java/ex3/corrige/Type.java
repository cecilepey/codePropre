/**
 * 
 */
package ex3.corrige;

/**
 * @author Cécile Peyras
 *
 */
public enum Type {

	MAMMIFERE("Mammifère"), REPTILE("Reptile"), POISSON("Poisson");

	/** type : String : type d'animaux */
	private String type;

	/**
	 * Constructeur
	 * 
	 * @param type
	 */
	private Type(String type) {
		this.type = type;
	}

	/**
	 * Getter
	 * 
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * Setter
	 * 
	 * @param type
	 *            the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

}
