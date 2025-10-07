package test_fonctionnel;

import personnages.Gaulois;
import personnages.Romain;
import objets.Chaudron;
import personnages.Druide;

public class TestGaulois {
	public static void main(String[] args) {

		Gaulois asterix = new Gaulois("Asterix", 8);
		Gaulois obelix = new Gaulois("Obelix", 16);
		asterix.parler("Bonjour " + obelix.getNom() + ".");
		obelix.parler("Bonjour " + asterix.getNom() + ". Ca te dirais d'aller chasser des sangliers ?");
		asterix.parler("oui tres bonne idee");
		Romain minus = new Romain("minus", 6);
		System.out.println("Dans la foret " + asterix.getNom() + " et " + obelix.getNom() + " tombent nez a nez sur le romain "
				+ minus.getNom());

		for (int i = 0; i < 3; i++) {
			asterix.frapper(minus);
		}

		Romain brutus = new Romain("Brutus", 14);
		Chaudron chaudron = new Chaudron();
		Druide panoramix = new Druide("Panoramix", 2, chaudron);

		panoramix.fabriquerPotion(4, 3);
		panoramix.boosterGaulois(obelix);
		panoramix.boosterGaulois(asterix);

		for (int i = 0; i < 3; i++) {
			asterix.frapper(brutus);
		}

	}

}
