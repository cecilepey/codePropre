package ex2;

/**
 * Classe qui gère la création d'un livret A
 * 
 * @author Cécile Peyras
 *
 */
public class LivretA extends CompteBancaire {

	/** CENT : int */
	private static final int CENT = 100;
	/** tauxRemuneration : taux de rémunération dans le cas d'un livret A */
	private double tauxRemuneration;

	/**
	 * Constructeur pour le livret A
	 * 
	 * @param solde
	 * @param decouvert
	 * @param tauxRemuneration
	 */
	public LivretA(double solde, double decouvert, double tauxRemuneration) {
		super(solde, 0);
		this.tauxRemuneration = tauxRemuneration;
	}

	/**
	 * Méthode qui permet d'appliquer la rémunération annuelle des intéret sur
	 * le livret A
	 */
	public void appliquerRemuAnnuelle() {

		this.solde = solde + solde * tauxRemuneration / CENT;

	}

	/**
	 * Débite un montant au solde du livret A tant que le solde est positif
	 * 
	 * @param montant
	 */
	public void debiterMontant(double montant) {
		if (this.solde - montant > 0) {
			this.solde = solde - montant;
		}

	}

	/**
	 * Getter
	 * 
	 * @return the tauxRemuneration
	 */
	public double getTauxRemuneration() {
		return tauxRemuneration;
	}

	/**
	 * Setter
	 * 
	 * @param tauxRemuneration
	 *            the tauxRemuneration to set
	 */
	public void setTauxRemuneration(double tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}
}
