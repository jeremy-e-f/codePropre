package ex3;

/**
 * Représente un comportement d'animal
 * @author Diginamic
 *
 */
public enum ComportementAnimal {
	
	CARNIVORE(0),HERBIVORE(1);
	
	private final int comportement;
	
	private ComportementAnimal(int comportement){
		this.comportement= comportement;
	}
	
	/** Getter
	 * @return the type
	 */
	public int getComportement() {
		return comportement;
	}

}
