package fr.esisar.hierarchie;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class EntrepriseTestDrive {
	
	private static final Logger LOGGER = LogManager.getLogger(EntrepriseTestDrive.class);
	
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
		Manager managerTemporaire = new Manager("7001", "Brad"); 
		
		Ouvrier ouvrier6 = new Ouvrier("9999","alex");

		manager1.addSubordonne(ouvrier1);
		LOGGER.info("L'ouvrier Smith a été rajouté à la hierarchie");
		manager1.addSubordonne(manager2);
		LOGGER.info("Le manager Blake a été rajouté à la hierarchie");
		manager2.addSubordonne(ouvrier2);
		LOGGER.info("L'ouvrier Jones a été rajouté à la hierarchie");
		manager2.addSubordonne(ouvrier3);
		LOGGER.info("L'ouvrier Allen a été rajouté à la hierarchie");
		manager3.addSubordonne(ouvrier4);
		LOGGER.info("L'ouvrier James a été rajouté à la hierarchie");
		
		chef.addSubordonne(ouvrier5);
		LOGGER.info("L'ouvrier Martin a été rajouté à la hierarchie");
		chef.addSubordonne(manager1);
		LOGGER.info("Le manager Adams a été rajouté à la hierarchie");
		chef.addSubordonne(manager3);
		LOGGER.info("Le manager Scott a été rajouté à la hierarchie");

		
		LOGGER.info("Subordonnes de Ford : "+chef.countEmployes());
		LOGGER.info("Subordonnes de Adams : "+manager1.countEmployes());
		LOGGER.info("Subordonnes de Scott : "+manager2.countEmployes());
		LOGGER.info("Subordonnes de Blake : "+manager3.countEmployes());
		
		manager3.addSubordonne(ouvrier6);
		LOGGER.info("Subordonnes de Blake : "+manager3.countEmployes());
		manager3.removeSubordonne(ouvrier6);
		LOGGER.info("Subordonnes de Blake : "+manager3.countEmployes());
		
		

	}
}
