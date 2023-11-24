package fr.esisar.hierarchie;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Classe d'un manager
 * @author Charlotte Casarrubios
 * @version 1.0
 */

public class Manager extends Employe{

	private static final Logger LOGGER = LogManager.getLogger(Manager.class);
	
	/**
	 * Constructeur de la classe Manager
	 * @param numEmploye	Numéro d'identification de l'employé
	 * @param nom			Nom de l'employé
	 */
	public Manager(String numEmploye, String nom) {
		super(numEmploye, nom);
	}
	
	
	/**
	 * Ajoute un employé sous les ordres du manager
	 * @param employe     Employé à ajouter
	 */
	public void addSubordonne(Employe employe) {
		if (employe.estsubordonne == null) {
			subordonnes.add(employe);
			employe.estsubordonne = this;
			LOGGER.info("L'employé "+employe.nom+" a été ajouté à la hiérarchie");
		}
		else {
			LOGGER.warn("Le salarié "+employe.nom+" a déjà un manager !");
		}
	
	}

	/**
	 * Supprime un employé de la direction du manager
	 * @param employe     Employé à supprimer
	 */
	public void removeSubordonne (Employe employe) {
		subordonnes.remove(employe);
		LOGGER.info("L'employé "+employe.nom+" a été supprimé de la hiérarchie");
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
		return nom;
	}

	/**
	 * Renvoie le nombre d'employés sous les ordres de l'employé (lui inclus)
	 * @return result 	Nombre d'employés sous les ordres de cet employé (dont lui-même)
	 */
	@Override
	
	public int countEmployes() {
		
		int result=1;	
		
		//Itérateur de la liste des subordonnés
		for (Employe employe : subordonnes) {
			if (employe.countEmployes() == 1){
				result+=1;
			}
			else {
			result += employe.countEmployes();
			}
		}
		return result;
	}
	
}
