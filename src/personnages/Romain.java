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
		System.out.println(prendreParole() + " ' " + texte + " ' ");

	}

	private String prendreParole() {
		return "le Romain" + nom + ":" ;
	}

	public void recevoirCoup(int forceCoup) {
		
		if (force<1) {
			System.out.println(prendreParole()+"j'abondonne");		
		}
		else {
			System.out.println(prendreParole()+"Aie")	}
		}
		
}
