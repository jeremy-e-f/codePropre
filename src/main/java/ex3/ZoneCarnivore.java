package ex3;

public class ZoneCarnivore extends Zone{
	
	/** Masse moyenne en Kg de nourriture consommée par 1 carnivore */
	private static final double MASSE_NOURRITURE = 10;
	
	/**
	 * Constructeur
	 */
	public ZoneCarnivore() {
		super();
	}
	
	@Override
	public double getPoids(){
		return MASSE_NOURRITURE;
	}
	
	@Override
	public TypeZone getTypeZone(){
		return TypeZone.ZONECARNIVORE;
	}
}
