package personnages;

import java.lang.reflect.Method;

public class Village {
	private String nom;
	private Gaulois chef;
	private int nbVillageois = 0;
	private Gaulois[] villageois;
	private Village village;

	public Village(Gaulois chef, int capacite) {
		this.chef = chef;
		this.villageois = new Gaulois[capacite];
		this.nbVillageois = 0;
	}

	public void setVillage(Village village) {
		this.village = village;
	}

	public Gaulois getChef() {
		return chef;
	}

	public void ajouterVillageois(Gaulois villageois) {
		if (nbVillageois < this.villageois.length) {
			this.villageois[nbVillageois] = villageois;
			villageois.setVillage(this);
			nbVillageois++;

		} else {
			System.out.println("Le village est plein, impossible d'ajouter ce villageois.");
		}
	}
}
