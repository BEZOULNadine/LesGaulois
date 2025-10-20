package personnages;

public class Romain {
	private String nom;
	private int force;

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
		force -= forceCoup; // romain perd de la force
		if (force < 1) {
			force = 0;
			System.out.println(prendreParole() + " j'abondonne");
		} else {
			System.out.println(prendreParole() + " Aie");
		}
		assert force < ancienneForce : "Erreur : la force n’a pas diminué !"; //post condition
		assert isInvariantVerified() : "Erreur : force négative après coup !"; // invariant
	}
	 public static void main(String[] args) {
	        Romain minus = new Romain("Minus", 6);

	    }

}
