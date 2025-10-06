package personnages;

public class Druide {
	private String nom;
	private int force;
	Chaudron chaudron;
	
	
	public Druide(String nom, int force, Chaudron chaudron) {
		super();
		this.nom = nom;
		this.force = force;
		this.chaudron = chaudron;
	}
	public String getNom() {
		return nom;
	}
	public void parler(String texte) {
		System.out.println(prendreParole() + " ' " + texte + " ' ");

	}

	private String prendreParole() {
		return "le druide" + nom + ":";
	}
	
	public void fabriquerPotion(int quantite , int forcePotion ) {
		parler("j'ai concocte"+quantite+"doseq de potion magique,elle a une force de"+forcePotion);
		chaudron.remplirChaudron(quantite,forcePotion);
		
	}
	public void boosterGaulois(Gaulois gaulois) {
		if (!chaudron.restePotion()) {
			parler("Desole"+gaulois.getNom()+"il n'y pas une seule goutte de potion");
		}else if ("obelix".equals(gaulois.getNom())) {
		      parler("Non"+gaulois.getNom()+"et tu le sais tres bien ");
			
		}else {
			gaulois.boirePotion(chaudron.prendreLouche());
			parler("tiens"+gaulois.getNom()+"un peu de potion magique");
		}
		
	}
	
}
