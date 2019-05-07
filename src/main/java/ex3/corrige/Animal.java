/**
 * 
 */
package ex3.corrige;

/**
 * Classe qui gère la création d'un animal
 * 
 * @author Cécile Peyras
 *
 */
public class Animal {

	/** type : Type */
	private Type type;
	/** nom : String */
	private String nom;
	/** comportement : Comportement */
	private Comportement comportement;

	/**
	 * Constructeur
	 * 
	 * @param type
	 * @param nom
	 * @param comportement
	 */
	public Animal(Type type, String nom, Comportement comportement) {
		super();
		this.type = type;
		this.nom = nom;
		this.comportement = comportement;
	}

	/**
	 * Getter
	 * 
	 * @return the type
	 */
	public Type getType() {
		return type;
	}

	/**
	 * Setter
	 * 
	 * @param type
	 *            the type to set
	 */
	public void setType(Type type) {
		this.type = type;
	}

	/**
	 * Getter
	 * 
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Setter
	 * 
	 * @param nom
	 *            the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * Getter
	 * 
	 * @return the comportement
	 */
	public Comportement getComportement() {
		return comportement;
	}

	/**
	 * Setter
	 * 
	 * @param comportement
	 *            the comportement to set
	 */
	public void setComportement(Comportement comportement) {
		this.comportement = comportement;
	}

}