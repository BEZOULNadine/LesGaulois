package personnages;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion =1;
	
	public Gaulois(String nom, int force) {
		super();
		this.nom = nom;
		this.force = force;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void parler(String texte ) {
		System.out.println(prendreParole()+ " ' " + texte +" ' ");
		
	}
	private String prendreParole() {
		return "le Gaulois" +  nom + ":"; }
	

}
