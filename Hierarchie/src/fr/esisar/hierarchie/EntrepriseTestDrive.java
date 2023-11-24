package fr.esisar.hierarchie;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Classe de tests d'une hiérarchie d'entreprise
 * Tests des méthodes implémentées et de l'utilisation des LOGGER
 * @author Charlotte Casarrubios
 * @version 1.0
 */

public class EntrepriseTestDrive {
	
	private static final Logger LOGGER = LogManager.getLogger(EntrepriseTestDrive.class);
	
	
	/**
	 * Main de la classe 
	 * @param args	Arguments en entrée du main (ici aucun argument car utilisée pour des tests)
	 */
	public static void main(String[] args){
		
		Ouvrier ouvrier1 = new Ouvrier("7369", "Smith");
		Ouvrier ouvrier2 = new Ouvrier("7499", "Jones");
		Ouvrier ouvrier3 = new Ouvrier("7521", "Allen");
		Ouvrier ouvrier4 = new Ouvrier("7900", "James");
		Ouvrier ouvrier5 = new Ouvrier("7876", "Martin");
		
		
		Manager chef = new Manager("7902", "Ford");
		
		Manager manager1 = new Manager("7566", "Adams");
		Manager manager2 = new Manager("7901", "Blake");
		Manager manager3 = new Manager("7788", "Scott");

		
		Ouvrier ouvrierTemporaire = new Ouvrier("7000", "Trent");
		
		Ouvrier ouvrier6 = new Ouvrier("9999","alex");

		manager1.addSubordonne(ouvrier1);
		manager1.addSubordonne(manager2);
		manager2.addSubordonne(ouvrier2);
		manager2.addSubordonne(ouvrier3);
		manager3.addSubordonne(ouvrier4);

		
		chef.addSubordonne(ouvrier5);
		chef.addSubordonne(manager1);
		chef.addSubordonne(manager3);

		
		LOGGER.info("Subordonnes de Ford : "+chef.countEmployes());
		LOGGER.info("Subordonnes de Adams : "+manager1.countEmployes());
		LOGGER.info("Subordonnes de Scott : "+manager2.countEmployes());
		LOGGER.info("Subordonnes de Blake : "+manager3.countEmployes());
		
		manager3.addSubordonne(ouvrier6);
		LOGGER.info("Subordonnes de Blake : "+manager3.countEmployes());
		manager3.removeSubordonne(ouvrier6);
		LOGGER.info("Subordonnes de Blake : "+manager3.countEmployes());
		
		
		manager1.addSubordonne(ouvrierTemporaire);
		manager2.addSubordonne(ouvrierTemporaire);
		
		
		

	}
}
