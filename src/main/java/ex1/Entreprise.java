package ex1;

import java.util.Date;
/**
 * Représente le concept d'une entreprise
 * @author DIGINAMIC
 *
 */
public class Entreprise {

	/** Numéro SIRET de l'entreprise */
	private int siret;
	
	/** Nom de l'entreprise */
	private String nom;
	
	/** Adresse de l'entreprise */
	private String adresse;
	
	/** Date de création de l'entreprise */
	private Date dateCreation;
	
	/** Valeur maximale du capital d'une entreprise */
	public static final int CAPITAL_MAX = 3000000;
	 
	/** Constructeur
	 * @param siret
	 * @param nom
	 * @param adresse
	 * @param dateCreation
	 */
	public Entreprise(int siret, String nom, String adresse, Date dateCreation) {
		super();
		this.siret = siret;
		this.nom = nom;
		this.adresse = adresse;
		this.dateCreation = dateCreation;
	}
	
	/** Getter
	 * @return the siret
	 */
	public int getSiret() {
		return siret;
	}

	/** Setter
	 * @param siret the siret to set
	 */
	public void setSiret(int siret) {
		this.siret = siret;
	}

	/** Getter
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/** Setter
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/** Getter
	 * @return the adresse
	 */
	public String getAdresse() {
		return adresse;
	}

	/** Setter
	 * @param adresse the adresse to set
	 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	/** Getter
	 * @return the dateCreation
	 */
	public Date getDateCreation() {
		return dateCreation;
	}

	/** Setter
	 * @param dateCreation the dateCreation to set
	 */
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	/**
	  * Affiche le statut de l'entreprise
	  */
	public void afficherStatut(){
		
	}
	
}
