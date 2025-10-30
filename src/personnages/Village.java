package personnages;

public class Village {
    private String nom;
    private Gaulois chef;            
    private Gaulois[] villageois;   
    private int nbVillageois = 0;   

    public Village(String nom, int nbVillageoisMax, Gaulois chef) {
        this.nom = nom;
        this.villageois = new Gaulois[nbVillageoisMax];
        this.chef = chef; 
    }

    public String getNom() {
        return nom;
    }

    public Gaulois getChef() {
        return chef;
    }

    public void ajouterVillageois(Gaulois gaulois) {
        if (nbVillageois < villageois.length) {
            villageois[nbVillageois] = gaulois;
            nbVillageois++;
        } else {
            System.out.println("Le village est plein !");
        }
    }

    public Gaulois trouverVillageois(int numero) {
        if (numero <= 0 || numero > nbVillageois) {
            System.out.println("Il n’y a pas autant d’habitants dans notre village !");
            return null;
        }
        return villageois[numero - 1];
    }

    public void afficherVillageois() {
        System.out.println("Dans le village \"" + nom + "\" du chef " + chef.getNom());
        System.out.println("vivent les légendaires gaulois :");
        for (int i = 0; i < nbVillageois; i++) {
            System.out.println("- " + villageois[i].getNom());
        }
    }

    public static void main(String[] args) {

        
        Gaulois abraracourcix = new Gaulois("Abraracourcix", 6);
        Village village = new Village("Village des Irréductibles", 30, abraracourcix);

        
        Gaulois asterix = new Gaulois("Astérix", 8);
        village.ajouterVillageois(asterix);

      
        System.out.println("Test de trouverVillageois :");
        Gaulois gaulois = village.trouverVillageois(1);
        System.out.println(gaulois); 

        gaulois = village.trouverVillageois(2);
        System.out.println(gaulois); 

        
        Gaulois obelix = new Gaulois("Obélix", 25);
        village.ajouterVillageois(obelix);

        System.out.println("Liste des villageois :");
        village.afficherVillageois();

        Gaulois doublePolemix = new Gaulois("Doublepolémix", 4);

        System.out.println("Présentations :");
        abraracourcix.sePresenter();   
        asterix.sePresenter();        
        doublePolemix.sePresenter();   
    }  
    
}
