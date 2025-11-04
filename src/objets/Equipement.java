package objets;

public enum Equipement {
	CASQUE("casque"), BOUCLIER("bouclier");

	private String nom;
	// dans une enumeration le constructeur est prive on ne peut rien mettre en public ni protcted

	Equipement(String nom) {
		this.nom = nom;
	}

	@Override
	public String toString() {
		return nom;
	}

}
