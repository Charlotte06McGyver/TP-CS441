package fr.esisar.hierarchie;

import java.util.HashSet;
import java.util.Set;

/**
 * Classe d'un employé
 * Classe abstraite
 * @author Charlotte Casarrubios
 * @version 1.0
 */

public abstract class Employe {

	protected final String numEmploye;
	protected final String nom;
	protected Employe estsubordonne; //pour tester si un ouvrier  possède un manager
	
	public Set<Employe> subordonnes= new HashSet<>();
	
	/**
	 * Constructeur de la classe Employe
	 * Initialise un nouvel employé
	 * @param numEmploye    Numéro d'identification de l'employé
	 * @param nom 			Nom de l'employé
	 */
	protected Employe(String numEmploye, String nom) {
		this.numEmploye=numEmploye;
		this.nom=nom;
		this.estsubordonne = null; //s'il est nul, alors il ne possède pas de manager
	}

	/**
	 * Classe abstraite pour récupérer le numéro d'identification d'un employé
	 */
	public abstract String getNumEmploye();

	/**
	 * Classe abstraite pour récupérer le nom d'un employé
	 */
	public abstract String getNom();

	/**
	 * Classe abstraite pour savoir le nombre d'employé sous les ordres d'un manager
	 */
	public abstract int countEmployes();

}
