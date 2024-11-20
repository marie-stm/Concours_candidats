package Concours_candidats;

import java.util.LinkedList;
import java.util.Collections;

public class Concours {
    private LinkedList<Candidat> candidats;

    public Concours() {
        this.candidats = new LinkedList<>();
    }

    public void ajouterCandidat(Candidat c) {
        this.candidats.add(c);
    }
    public int getNombreCandidats() {
        return this.candidats.size();
    }

    public void demarrerConcours() {
        System.out.println("Le concours a commencé !");
        for (Candidat c : candidats) {
            c.lireTexte();  // chaque candidat lit son livre et reçoit un score
        }
    }

    public String afficherClassement() {
        Collections.sort(candidats, (c1, c2) -> c2.getScore() - c1.getScore());
        for (Candidat c : candidats) {
            System.out.println(c);
        }
		return null;
    }
}