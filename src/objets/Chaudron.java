package objets;

public class Chaudron {
	private int quantitePotion;
	private int forcePotion;

	public boolean restePotion() {
		return quantitePotion > 0;
	}

	public void remplirChaudron(int quantite, int forcePotion) {
		this.forcePotion = forcePotion;
		this.quantitePotion = quantite;

	}

	public int prendreLouche() {
		if (quantitePotion > 0) {
			quantitePotion--;
			return forcePotion;

		} else {
			return 0;
		}

	}

}
