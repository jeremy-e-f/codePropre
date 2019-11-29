package ex3;

/**
 * Représente le concept d'animal
 * @author Diginamic
 */
public class Animal {
	/** Nom d'un animal */
	private String nom;
	/** Comportement d'un animal */
	private ComportementAnimal comportement;
	/** Type d'un animal */
	private TypeAnimal type;
	
	/** Constructeur
	 * @param nom
	 * @param type
	 * @param comportement
	 */
	public Animal(String nom, TypeAnimal type, ComportementAnimal comportement) {
		super();
		this.nom = nom;
		this.comportement = comportement;
		this.type = type;
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
	 * @return the comportement
	 */
	public ComportementAnimal getComportement() {
		return comportement;
	}

	/** Setter
	 * @param comportement the comportement to set
	 */
	public void setComportement(ComportementAnimal comportement) {
		this.comportement = comportement;
	}

	/** Getter
	 * @return the type
	 */
	public TypeAnimal getType() {
		return type;
	}

	/** Setter
	 * @param type the type to set
	 */
	public void setType(TypeAnimal type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Animal [nom=" + nom + ", comportement=" + comportement + ", type=" + type + "]";
	}

}
