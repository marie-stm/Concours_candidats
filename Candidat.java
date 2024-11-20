package Concours_candidats;

public abstract class Candidat {
    private static int compteurCandidat = 0;
    protected int id;  
    protected String nom;
    protected String prenom;
    protected int age;
    protected int score;
    protected Livre livre;

    public Candidat(String nom, String prenom, int age, Livre livre) {
        this.id = ++compteurCandidat;
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.score = 0;  
        this.livre = livre;
    }

    public abstract String getType();

    public void lireTexte() {
        this.score = (int) (Math.random() * 100); //CHATGPT
    }

    public int getScore() {
        return this.score;
    }

    public String toString() {
        return "Candidat #" + id + " : " + nom + " " + prenom + ", Âge : " + age + ", Score : " + score;
    }
}
