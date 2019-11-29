package ex3;

public class SavaneAfricaine extends Zone{

	/** Masse moyenne en Kg de nourriture consommée par 1 carnivore */
	private static final double MASSE_NOURRITURE= 0;
	
	/**
	 * Constructeur
	 */
	public SavaneAfricaine() {
		super();
	}
	
	@Override
	public double getPoids(){
		return MASSE_NOURRITURE;
	}
	
	@Override
	public TypeZone getTypeZone(){
		return TypeZone.SAVANEAFRICAINE;
	}
	
}
