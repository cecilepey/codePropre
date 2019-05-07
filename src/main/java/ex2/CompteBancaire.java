package ex2;

/**
 * Représente un compte bancaire de type compte courante (type=CC)
 * 
 * 
 * @author DIGINAMIC
 */
public class CompteBancaire {

	/** solde : solde du compte */
	protected double solde;

	/**
	 * decouvert : un découvert est autorisé seulement pour les comptes
	 * courants. Ce montant doit être égal à zéro ou négatif.
	 */
	private double decouvert;

	/**
	 * Ce constructeur est utilisé pour créer un compte un compte bancaire
	 * 
	 * @param solde
	 *            représente le solde du compte
	 * @param decouvert
	 *            représente le découvert autorisé, il est égal à 0 ou négatif
	 */
	public CompteBancaire(double solde, double decouvert) {
		super();
		this.solde = solde;
		this.decouvert = decouvert;

	}

	/**
	 * Ajoute un montant au solde
	 * 
	 * @param montant
	 */
	public void ajouterMontant(double montant) {
		this.solde += montant;
	}

	/**
	 * Débite un montant au solde tant qu'il ne dépasse pas le découvert
	 * 
	 * @param montant
	 */
	public void debiterMontant(double montant) {
		if (this.solde - montant > decouvert) {
			this.solde = solde - montant;
		}
	}

	/**
	 * Getter for solde
	 * 
	 * @return the solde
	 */
	public double getSolde() {
		return solde;
	}

	/**
	 * Setter
	 * 
	 * @param solde
	 *            the solde to set
	 */
	public void setSolde(double solde) {
		this.solde = solde;
	}

	/**
	 * Getter for decouvert
	 * 
	 * @return the decouvert
	 */
	public double getDecouvert() {
		return decouvert;
	}

	/**
	 * Setter
	 * 
	 * @param decouvert
	 *            the decouvert to set
	 */
	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
	}

}
