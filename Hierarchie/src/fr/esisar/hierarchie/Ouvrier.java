package fr.esisar.hierarchie;

public class Ouvrier extends Employe{

	public Ouvrier(String numEmploye, String nom) {
		super(numEmploye, nom);
	}
	
	@Override
	public String getNumEmploye() {
		return numEmploye;
	}

	@Override
	public String getNom() {
		return numEmploye;
	}

	@Override
	int countEmployes() {
		return 1;
	}

}
