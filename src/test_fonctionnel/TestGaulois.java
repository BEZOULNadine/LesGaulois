package test_fonctionnel;

import personnages.Gaulois;

public class TestGaulois {
	public static void main(String[] args) {
		Gaulois asterix;
		Gaulois obelix;
		asterix = new Gaulois("Asterix", 8);
	    obelix = new Gaulois("Obelix", 16);
	    asterix.parler("Bonjour " + obelix.getNom()+".");
	    obelix.parler("Bonjour " + asterix.getNom()+". Ca te dirais d'aller chasser des sangliers ?");
	    asterix.parler("oui tres bonne idee");
	    
	    
	    
	    
		
	}

}
