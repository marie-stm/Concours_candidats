package Concours_candidats;

import java.util.LinkedList;

public class Jury {
    private String nom;
    private String prenom;

    public Jury(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public void evaluerCandidat(Candidat c, int score) {
        c.score = score;
    }

    public double calculerMoyenneScores(LinkedList<Candidat> candidats) {
        int totalScore = 0;
        for (Candidat c : candidats) {
            totalScore += c.getScore();
        }
        return totalScore / (double) candidats.size();
    }
}
