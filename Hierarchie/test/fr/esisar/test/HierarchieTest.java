package fr.esisar.test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import fr.esisar.hierarchie.*;

public class HierarchieTest {
	
	private static final Logger LOGGER = LogManager.getLogger(EntrepriseTestDrive.class);
	
	private final Ouvrier ouvrier1 = new Ouvrier("7369", "Smith");
	private final Ouvrier ouvrier2 = new Ouvrier("7499", "Jones");
	private final Ouvrier ouvrier3 = new Ouvrier("7521", "Allen");
	private final Ouvrier ouvrier4 = new Ouvrier("7900", "James");
	private final Ouvrier ouvrier5 = new Ouvrier("7876", "Martin");
	
	
	private final Manager chef = new Manager("7902", "Ford");
	
	private final Manager manager1 = new Manager("7566", "Adams");
	private final Manager manager2 = new Manager("7901", "Blake");
	private final Manager manager3 = new Manager("7788", "Scott");

	
	private final Ouvrier ouvrierTemporaire = new Ouvrier("7000", "Trent");
	private final Manager managerTemporaire = new Manager("7001", "Brad");
	
	@BeforeEach 
	public void createHierarchie () {
		
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
	}
	
	@Test
	void ouvrierToManager () {
		manager1.addSubordonne(ouvrierTemporaire);
		LOGGER.info("L'ouvrier Trent a été rajouté à la hierarchie");
		
		//Nombre de subrodonnes du manager
		assertEquals(3.0, manager1.subordonnes.size());

		//Si le nouvel ouvrier fait partie des subordonnés
		assertTrue(manager1.subordonnes.contains(ouvrierTemporaire));
		
		//Nombre d'employés renvoyés par la méthode countEmployes
		assertEquals(6.0, manager1.countEmployes());
		
		manager1.removeSubordonne(ouvrierTemporaire);
		LOGGER.info("L'ouvrier Trent a été supprimé de la hierarchie");

	}
	
	
	@Test
	void managerToManager () {
		manager2.addSubordonne(managerTemporaire);
		LOGGER.info("Le manager Brad a été rajouté à la hierarchie");
		
		//Nombre de subrodonnes du manager
		assertEquals(3.0, manager2.subordonnes.size());

		//Si le nouveau manager fait partie des subordonnés
		assertTrue(manager2.subordonnes.contains(managerTemporaire));
		
		//Nombre d'employés renvoyés par la méthode countEmployes
		assertEquals(4.0, manager2.countEmployes());
		
		manager2.removeSubordonne(managerTemporaire);
		LOGGER.info("Le manager Brad a été supprimé de la hierarchie");

	}
	
	@Test
	void plusieursManager () {
		manager1.addSubordonne(ouvrier2);
		
		//Si le nouveau manager fait partie des subordonnés
		assertTrue(manager1.subordonnes.contains(ouvrier2));
		//Si le nouveau manager fait partie des subordonnés
		assertTrue(manager2.subordonnes.contains(ouvrier2));
		
		manager1.removeSubordonne(ouvrier2);
		
	}
		
	@AfterEach
	public void cleanHierarchie () {
		manager1.removeSubordonne(ouvrier1);
		LOGGER.info("L'ouvrier Smith a été supprimé de la hierarchie");
		manager1.removeSubordonne(manager2);
		LOGGER.info("Le manager Blake a été supprimé de la hierarchie");
		manager2.removeSubordonne(ouvrier2);
		LOGGER.info("L'ouvrier Jones a été supprimé de la hierarchie");
		manager2.removeSubordonne(ouvrier3);
		LOGGER.info("L'ouvrier Allen a été supprimé de la hierarchie");
		manager3.removeSubordonne(ouvrier4);
		LOGGER.info("L'ouvrier James a été supprimé de la hierarchie");
		
		chef.removeSubordonne(ouvrier5);
		LOGGER.info("L'ouvrier Martin a été supprimé de la hierarchie");
		chef.removeSubordonne(manager1);
		LOGGER.info("Le manager Adams a été supprimé de la hierarchie");
		chef.removeSubordonne(manager3);
		LOGGER.info("Le manager Scott a été supprimé de la hierarchie");
	}

}

