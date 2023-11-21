package fr.esisar.test;
import fr.esisar.hierarchie.*;

public class HierarchieTest {
	
	private final Ouvrier ouvrier1 = new Ouvrier("7369", "Smith");
	private final Ouvrier ouvrier2 = new Ouvrier("7499", "Jones");
	private final Ouvrier ouvrier3 = new Ouvrier("7521", "Allen");
	private final Ouvrier ouvrier4 = new Ouvrier("7900", "James");
	private final Ouvrier ouvrier5 = new Ouvrier("7876", "Martin");
	
	
	private final Manager chef = new Manager("7902", "Ford");
	
	private final Manager manager1 = new Manager("7566", "Adams");
	private final Manager manager2 = new Manager("7788", "Scott");
	private final Manager manager3 = new Manager("7901", "Blake");
	
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
	
	public void testOuvrierManager() {
		
		System.out.println("Vérification nombre de subordonnés du manager1 : ");
		
	}

}

