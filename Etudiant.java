package Concours_candidats;

public class Etudiant extends Candidat {
    private String ecole;
    private String villeEcole;
    private String paysEcole;

    public Etudiant(String nom, String prenom, int age, Livre livre, String ecole, String villeEcole, String paysEcole) {
        super(nom, prenom, age, livre);
        this.ecole = ecole;
        this.villeEcole = villeEcole;
        this.paysEcole = paysEcole;
    }

    @Override
    public String getType() {
        return "Etudiant";
    }
}