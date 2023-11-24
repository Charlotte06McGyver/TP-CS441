package fr.esisar.hierarchie;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Manager extends Employe{

	private static final Logger LOGGER = LogManager.getLogger(Manager.class);
	
	public Manager(String numEmploye, String nom) {
		super(numEmploye, nom);
	}
	
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

	public void removeSubordonne (Employe employe) {
		subordonnes.remove(employe);
		LOGGER.info("L'employé "+employe.nom+" a été supprimé de la hiérarchie");
	}

	@Override
	public String getNumEmploye() {
		return numEmploye;
	}

	@Override
	public String getNom() {
		return nom;
	}

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
