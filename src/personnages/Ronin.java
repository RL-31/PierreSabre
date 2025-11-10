package personnages;

public class Ronin extends Humain {
	
	private int honneur = 1;

	public Ronin(String nom, String boissonFavorite, int argent) {
		super(nom, boissonFavorite, argent);
	}
	
	public void donner(Commercant beneficiaire) {
		int donation = argent / 10;
		parler(beneficiaire.getNom() + ", prends ces " + donation + " sous.");
		beneficiaire.recevoir(donation);
		perdreArgent(donation);
	}

}