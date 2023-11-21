package fr.esisar.hierarchie;

import java.util.HashSet;
import java.util.Set;

public abstract class Employe {

	protected final String numEmploye;
	protected final String nom;
	
	protected Set<Employe> subordonnes= new HashSet<>();
	
	protected Employe(String numEmploye, String nom) {
		this.numEmploye=numEmploye;
		this.nom=nom;
	}

	public abstract String getNumEmploye();

	public abstract String getNom();

	abstract int countEmployes();

}
