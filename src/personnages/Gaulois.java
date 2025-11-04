package personnages;

public class Gaulois {
	private String nom;
	/* private int force; */
	private int effetPotion = 1;
	private Village village;
	private Gaulois chef;
	private int force, nb_trophees;
	private Equipement trophees[] = new Equipement[100];

	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;

	}

	public String getNom() {
		return nom;
	}

	public void setVillage(Village village) {
		this.village = village;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");

	}

	/*
	 * private String prendreParole() { return "le Gaulois" + nom + " : "; }
	 */

	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
	}

	/*public void frapper(Romain romain) {
		System.out.println(nom + " envoi un grand coup dans la machoire de " + romain.getNom());
		romain.recevoirCoup(force * effetPotion / 3);
		if (effetPotion > 1) {
			effetPotion--;
		}
	}*/

	public void boirePotion(int forcePotion) {
		this.effetPotion = forcePotion;
	}

	public void sePresenter() {
		if (village == null) {
			System.out.println("Le Gaulois " + nom + " : \"Bonjour, je m'appelle " + nom
					+ ". Je voyage de villages en villages.\"");
		} else if (village.getChef() == this) {
			System.out.println("Le Gaulois " + nom + " : \"Bonjour, je m'appelle " + nom
					+ ". Je suis le chef du village " + village.getNom() + ".\"");
		} else {
			System.out.println("Le Gaulois " + nom + " : \"Bonjour, je m'appelle " + nom + ". J'habite le village "
					+ village.getNom() + ".\"");
		}
	}

	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Asterix", 8);
		System.out.println(asterix.getNom());
	}

	private String prendreParole() {
		String texte = "Le gaulois " + nom + " : ";
		return texte;
	}
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " +romain.getNom());
		Equipement trophees[] = romain.recevoirCoup((force / 3) * effetPotion);
		for (int i = 0; trophees != null && i < trophees.length; i++,
		nb_trophees++) {
		this.trophees[nb_trophees] = trophees[i];
		}
		return;
		}


}
