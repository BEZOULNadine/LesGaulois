package personnages;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion = 1;

	public Gaulois(String nom, int force) {
		super();
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + " ' " + texte + " ' ");

	}

	private String prendreParole() {
		return "le Gaulois" + nom + ":";
	}

	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Asterix", 8);
		System.out.println(asterix.getNom());
	}

	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
	}

	public void frapper(Romain romain) {
		System.out.println(nom + "envoi un grand coup dans la machoire de " + romain.getNom());
		romain.recevoirCoup(force * effetPotion / 3);
		 if (effetPotion > 1) {
	            effetPotion--;
	        }
	}

	public void boirePotion(int forcePotion) {
		effetPotion =  forcePotion;

	}

}
