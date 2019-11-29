package ex3;

/**
 * Représente un type d'animal
 * @author Diginamic
 *
 */
public enum TypeAnimal {
	
	MAMMIFERE(0),REPTILE(1),POISSON(2),AMPHIBIEN(3),OISEAU(4);
	
	private final int type;
	
	private TypeAnimal(int type){
		this.type= type;
	}
	
	/** Getter
	 * @return the type
	 */
	public int getType() {
		return type;
	}

}
