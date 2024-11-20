package Concours_candidats;

public class Livre {
    private static int compteurLivre = 0;
    private int id;
    private String titre;
    private String auteurNom;
    private String auteurPrenom;
    private double prix;

    public Livre(String titre, String auteurNom, String auteurPrenom, double prix) {
        this.id = ++compteurLivre;
        this.titre = titre;
        this.auteurNom = auteurNom;
        this.auteurPrenom = auteurPrenom;
        this.setPrix(prix);
    }

    public String toString() {
        return "Livre #" + id + " : " + titre + " par " + auteurPrenom + " " + auteurNom;
    }

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}
}
