package fr.esisar.hierarchie;


/**
 * Classe d'un ouvrier
 * @author Charlotte Casarrubios
 * @version 1.0
 */

public class Ouvrier extends Employe{

	/**
	 * Constructeur de la classe Ouvrier
	 * @param numEmploye	Numéro d'identification de l'employé
	 * @param nom			Nom de l'employé
	 */
	public Ouvrier(String numEmploye, String nom) {
		super(numEmploye, nom);
	}
	
	/**
	 * Renvoie le numéro d'identification de l'employé
	 * @return numEmploye	Numéro d'identification de l'employé
	 */
	@Override
	public String getNumEmploye() {
		return numEmploye;
	}

	/**
	 * Renvoie le nom de l'employé
	 * @return nom	Nom de l'employé
	 */
	@Override
	public String getNom() {
		return numEmploye;
	}

	/**
	 * Renvoie le nombre d'employés sous les ordres de l'employé (lui inclus)
	 * @return 1	Nombre d'employés sous les ordres de cet employé (dont lui-même)
	 */
	@Override
	 public int countEmployes() {
		return 1;
	}

}
