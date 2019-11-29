package ex3;
/**
 * Réprésente le type d'une zone
 * @author Diginamic
 *
 */
public enum TypeZone {
	
	AQUARIUM("aquarium"),FERMEREPTILE("ferme des reptiles"),ZONECARNIVORE("zone des carnivores"),SAVANEAFRICAINE("savane africaine");
	
	private final String typeZone;
	
	/**
	 * Constructeur
	 * @param typeZone
	 */
	private TypeZone(String typeZone){
		this.typeZone= typeZone;
	}
	
	/** Getter
	 * @return the typeZone
	 */
	public String getTypeZone() {
		return typeZone;
	}
	
}
