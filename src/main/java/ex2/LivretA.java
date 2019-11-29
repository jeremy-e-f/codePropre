package ex2;

/** Repr�sente un compte bancaire de type livret A (type=LA)
 * @author DIGINAMIC
 */
public class LivretA extends CompteBancaire {
	
	/** tauxRemuneration : taux de rémunération dans le cas d'un livret A */
	private double tauxRemuneration;
	
	/** Le type de compte bancaire, ici LA=Livret A */
	private static final String TYPE= "LA";

	/**
	 * Constructeur permet de cr�er un objet de type LivreA
	 * @param solde
	 * @param tauxRemuneration
	 */
	public LivretA(double solde, double tauxRemuneration) {
		super(solde, 0);
		this.tauxRemuneration = tauxRemuneration;
	}
	
	/** Getter for tauxRemuneration
	 * @return the tauxRemuneration
	 */
	public double getTauxRemuneration() {
		return tauxRemuneration;
	}
	
	/** Setter
	 * @param tauxRemuneration the tauxRemuneration to set
	 */
	public void setTauxRemuneration(double tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}
	
	/**
	 * Applique la r�mun�ration annuelle en fonction du taux et du solde
	 */
	public void appliquerRemuAnnuelle(){
		this.setSolde(this.getSolde() + this.getSolde()* this.getTauxRemuneration()/100);
	}

}
