package fr.esisar.hierarchie;

import java.util.HashSet;
import java.util.Set;

public abstract class Employe {

	protected final String numEmploye;
	protected final String nom;
	protected Employe estsubordonne; //pour tester si un ouvrier  possède un manager
	
	public Set<Employe> subordonnes= new HashSet<>();
	
	protected Employe(String numEmploye, String nom) {
		this.numEmploye=numEmploye;
		this.nom=nom;
		this.estsubordonne = null; //s'il est nul, alors il ne possède pas de manager
	}

	public abstract String getNumEmploye();

	public abstract String getNom();

	abstract int countEmployes();

}
