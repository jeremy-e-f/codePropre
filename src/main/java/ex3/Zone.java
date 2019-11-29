package ex3;

import java.util.ArrayList;
import java.util.List;
/**
 * Repr�sente le concept d'une zone
 * @author UNK
 *
 */
public abstract class Zone {
	/** Liste d'animaux */
	private List<Animal> animaux;
	
	/**
	 * Constructeur
	 */
	public Zone() {
		animaux= new ArrayList<Animal>();
	}

	/** Getter
	 * @return the animaux
	 */
	public List<Animal> getAnimaux() {
		return animaux;
	}

	/** Setter
	 * @param animaux the animaux to set
	 */
	public void setAnimaux(List<Animal> animaux) {
		this.animaux = animaux;
	}

	/** Ajoute un animal � la zone 
	 * param animal
	 * */
	public void addAnimal(Animal animal) {
		animaux.add(animal);
	}
	
	/**
	 * Affiche la liste des animaux de la zone
	 */
	public void afficherListeAnimaux(){
		for (Animal animal: animaux){
			System.out.println(animal.getNom());
		}
	}
	
	/**
	 * Renvoie le nombre d'animaux de la zone
	 * @return int
	 */
	public int compterAnimaux(){
		return animaux.size();
	}
	
	/**
	 * R�cup�re le poids moyen des animaux
	 * @return double
	 */
	public abstract double getPoids();
	
	/**
	 * Calcule le nombre de Kgs d'animaux par jour
	 * @return double
	 */
	public double calculerKgsNourritureParJour(){
		return compterAnimaux() * getPoids();
	}
	
	/**
	 * Retourne le type de zone
	 */
	public abstract TypeZone getTypeZone();
}
