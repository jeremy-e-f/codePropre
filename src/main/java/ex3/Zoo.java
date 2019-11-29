package ex3;

import java.util.ArrayList;
import java.util.List;

/** Représente un zoo
 * @author DIGINAMIC
 */
public class Zoo {
	/** Nom du zoo */
	private String nom;
	
	/** Liste des zones */
	List<Zone> zones;
	
	/**
	 * Constructeur
	 * @param nom
	 */
	public Zoo(String nom){
		this.nom = nom;
		zones= new ArrayList<Zone>();
		zones.add(new SavaneAfricaine());
		zones.add(new ZoneCarnivore());
		zones.add(new FermeReptile());
		zones.add(new Aquarium());
	}
	
	/**
	 * Ajoute des animaux au zoo en fonction des zones disponibles
	 * @param animal
	 */
	public void addAnimal(Animal animal){
		for(Zone zone : this.zones){
			switch(zone.getTypeZone()){
				case SAVANEAFRICAINE:
					if((animal.getType().equals(TypeAnimal.MAMMIFERE)) && (animal.getComportement().equals(ComportementAnimal.CARNIVORE))){
						zone.addAnimal(animal);
					}
				break;
				case AQUARIUM:
					if(animal.getType().equals(TypeAnimal.POISSON)){
						zone.addAnimal(animal);
					}
				break;
				case FERMEREPTILE:
					if(animal.getType().equals(TypeAnimal.REPTILE)){
						zone.addAnimal(animal);
					}
				break;
				case ZONECARNIVORE:
					if((animal.getType().equals(TypeAnimal.MAMMIFERE)) && (animal.getComportement().equals(ComportementAnimal.HERBIVORE))){
						zone.addAnimal(animal);
					}
				break;
			}
		}
	}
	
	/**
	 * Affiche la liste de tous les animaux
	 */
	public void afficherListeAnimaux(){
		for(Zone zone : this.zones){
			zone.afficherListeAnimaux();
		}
	}

	/** Getter for nom
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
}
