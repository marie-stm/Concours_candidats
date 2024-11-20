package Concours_candidats;

public class Professionnel extends Candidat {
    private String entreprise;
    private String villeEntreprise;
    private String paysEntreprise;

    public Professionnel(String nom, String prenom, int age, Livre livre, String entreprise, String villeEntreprise, String paysEntreprise) {
        super(nom, prenom, age, livre);
        this.entreprise = entreprise;
        this.villeEntreprise = villeEntreprise;
        this.paysEntreprise = paysEntreprise;
    }

    @Override
    public String getType() {
        return "Professionnel";
    }
}