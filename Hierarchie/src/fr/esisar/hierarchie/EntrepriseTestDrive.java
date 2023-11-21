package fr.esisar.hierarchie;

public class EntrepriseTestDrive {
	
	public static void main(String[] args){
		//Employe e1 = new Employe();
		Manager m1 = new Manager("7902","Ford");
		Manager m2 = new Manager("7566","Adams");
		Manager m3 = new Manager("7788","Scott");
		Manager m4 = new Manager("7901","Blake");
		
		Ouvrier o1 = new Ouvrier("7876","Martin");
		Ouvrier o2 = new Ouvrier("7369","Smith");
		Ouvrier o3 = new Ouvrier("7900","James");
		Ouvrier o4 = new Ouvrier("7499","Jones");
		Ouvrier o5 = new Ouvrier("7521","Allen");
		Ouvrier o6 = new Ouvrier("9999","alex");

		m1.addSubordonne(m2);
		m1.addSubordonne(o1);
		m1.addSubordonne(m3);
		m2.addSubordonne(o2);
		m2.addSubordonne(m4);
		m3.addSubordonne(o3);
		m4.addSubordonne(o4);
		m4.addSubordonne(o5);

		
		System.out.println("Subordonnes de Ford : "+m1.countEmployes());
		System.out.println("Subordonnes de Adams : "+m2.countEmployes());
		System.out.println("Subordonnes de Scott : "+m3.countEmployes());
		System.out.println("Subordonnes de Blake : "+m4.countEmployes());
		
		m4.addSubordonne(o6);
		System.out.println("Subordonnes de Blake : "+m4.countEmployes());
		m4.removeSubordonne(o6);
		System.out.println("Subordonnes de Blake : "+m4.countEmployes());

	}
}
