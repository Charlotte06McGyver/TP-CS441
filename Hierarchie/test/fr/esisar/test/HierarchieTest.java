package fr.esisar.test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import fr.esisar.hierarchie.*;

public class HierarchieTest {
	
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
		manager1.addSubordonne(manager2);
		manager2.addSubordonne(ouvrier2);
		manager2.addSubordonne(ouvrier3);
		manager3.addSubordonne(ouvrier4);
		
		chef.addSubordonne(ouvrier5);
		chef.addSubordonne(manager1);
		chef.addSubordonne(manager3);
	}
	
	@Test
	void ouvrierToManager () {
		manager1.addSubordonne(ouvrierTemporaire);
		
		//Nombre de subordonnes du manager
		assertEquals(3.0, manager1.subordonnes.size());

		//Si le nouvel ouvrier fait partie des subordonnés
		assertTrue(manager1.subordonnes.contains(ouvrierTemporaire));
		
		//Nombre d'employés renvoyés par la méthode countEmployes
		assertEquals(6.0, manager1.countEmployes());
		
		manager1.removeSubordonne(ouvrierTemporaire);
	}
	
	
	@Test
	void managerToManager () {
		manager2.addSubordonne(managerTemporaire);
		
		//Nombre de subordonnes du manager
		assertEquals(3.0, manager2.subordonnes.size());

		//Si le nouveau manager fait partie des subordonnés
		assertTrue(manager2.subordonnes.contains(managerTemporaire));
		
		//Nombre d'employés renvoyés par la méthode countEmployes
		assertEquals(4.0, manager2.countEmployes());
		
		manager2.removeSubordonne(managerTemporaire);
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
		manager1.removeSubordonne(manager2);
		manager2.removeSubordonne(ouvrier2);
		manager2.removeSubordonne(ouvrier3);
		manager3.removeSubordonne(ouvrier4);
		
		chef.removeSubordonne(ouvrier5);
		chef.removeSubordonne(manager1);
		chef.removeSubordonne(manager3);
	}

}

