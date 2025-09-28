package personnages;

public class Druide {
	private String nom;
	private int effetPotionMin;
	private int effetPotionaMax;

	public Druide(String nom, int effetPotionMin, int effetPotionaMax) {
		super();
		this.nom = nom;
		this.effetPotionMin = effetPotionMin;
		this.effetPotionaMax = effetPotionaMax;
		parler("Bonjour ,je suis le druide" + nom + " et ma potion peut aller de" + effetPotionMin + "jusqu'a"
				+ effetPotionaMax);
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + " ' " + texte + " ' ");

	}

	private String prendreParole() {
		// TODO Auto-generated method stub
		return "le druide" + nom + ":";
	}

}
