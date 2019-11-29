package ex3;

/** Représente une ferme de reptile
 * @author DIGINAMIC
 */
public class FermeReptile extends Zone{

	/** Masse moyenne en kg de nourriture consomm�e par 1 reptile */
	private static final double MASSE_NOURRITURE = 0.1;
	
	/**
	 * Constructeur
	 */
	public FermeReptile() {
		super();
	}


	@Override
	public double getPoids() {
		return MASSE_NOURRITURE;
	}
	
	@Override
	public TypeZone getTypeZone(){
		return TypeZone.FERMEREPTILE;
	}

}
