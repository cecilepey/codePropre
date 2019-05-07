package ex1;

import java.util.Date;

/**
 * Classe qui représente une entreprise
 * 
 * @author Cécile Peyras
 *
 */
public class Entreprise {

	/** siret : numéro de siret de l'entreprise */
	public int siret;
	/** nom : raison sociale de l'entreprise */
	public String nom;
	/** adresse : String */
	public String adresse;
	/** dateCreation : Date */
	public Date dateCreation;

	/** capitalMax : Capital de la société */
	public static final int capitalMax = 3000000;

	/**
	 * Méthode qui permet d'afficher le statut de la société.
	 */
	public void afficher_statut() {

	}

}
