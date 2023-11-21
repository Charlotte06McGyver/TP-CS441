package fr.esisar.hierarchie;


public class Manager extends Employe{

	
	public Manager(String numEmploye, String nom) {
		super(numEmploye, nom);
	}
	
	public void addSubordonne(Employe employe) {
		subordonnes.add(employe);	
	}

	public void removeSubordonne (Employe employe) {
		subordonnes.remove(employe);
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
