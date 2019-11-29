package ex3;

public class Aquarium extends Zone{
	
	/** Masse moyenne en Kg de nourriture consommée par 1 carnivore */
	private static final double MASSE_NOURRITURE = 0.2;
	
	/**
	 * Constructeur
	 */
	public Aquarium() {
		super();
	}

	@Override
	public double getPoids(){
		return MASSE_NOURRITURE;
	}
	
	@Override
	public TypeZone getTypeZone(){
		return TypeZone.AQUARIUM;
	}
}
