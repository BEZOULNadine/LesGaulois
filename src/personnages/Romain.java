package personnages;

import objets.Equipement;

public class Romain {
	private String nom;
	private int force;
	private Equipement[] equipements = new Equipement[2];
	private int nbEquipement = 0;

	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}

	public int getForce() {
		return force;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");

	}

	private String prendreParole() {
		return "le Romain " + nom + " : ";
	}

	private boolean isInvariantVerified() {
		return force >= 0;
	}

	public void recevoirCoup(int forceCoup) {
		assert forceCoup > 0 : "Erreur : force du coup non positive !";// pre condition
		int ancienneForce = force;
		force -= forceCoup; 
		if (force < 1) {
			force = 0;
			System.out.println(prendreParole() + " j'abondonne");
		} else {
			System.out.println(prendreParole() + " Aie");
		}
		assert force < ancienneForce : "Erreur : la force n’a pas diminué !"; // post condition
		assert isInvariantVerified() : "Erreur : force négative après coup !"; // invariant
	}

	public static void main(String[] args) {
		Romain minus = new Romain("Minus", 6);
		   minus.sEquiper(Equipement.CASQUE);
		    minus.sEquiper(Equipement.CASQUE);
		    minus.sEquiper(Equipement.BOUCLIER);
		    minus.sEquiper(Equipement.CASQUE);

	}

	public void sEquiper(Equipement equipement) {
		switch (nbEquipement) {
		case 2:
			System.out.println("Le soldat " + nom + " est déjà bien protégé !");
			break;
		case 1:
			if (equipements[0] == equipement) {
				System.out.println("Le soldat " + nom + " possède déjà un " + equipement + " !");
			} else {
				ajouterEquipement(equipement);
			}
			break;
		case 0:
			ajouterEquipement(equipement);
			break;
		}
	}

	private void ajouterEquipement(Equipement equipement) {
		equipements[nbEquipement++] = equipement;
		System.out.println("Le soldat " + nom + " s'équipe avec un " + equipement + ".");
	}

}
