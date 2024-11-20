package Concours_candidats;

import javax.swing.*;
import java.awt.event.*;

public class Graphique extends JFrame {
    private JTextArea textArea;
    private JButton ajouterCandidatBtn;
    private JButton demarrerConcoursBtn;
    private Concours concours;

    public Graphique() {  //
        concours = new Concours();

        setTitle("Gestion du Concours de Lecture");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        textArea = new JTextArea();
        ajouterCandidatBtn = new JButton("Ajouter Candidat");
        demarrerConcoursBtn = new JButton("Démarrer Concours");

        JPanel panel = new JPanel();
        panel.add(ajouterCandidatBtn);
        panel.add(demarrerConcoursBtn);
        add(panel, "North");
        add(new JScrollPane(textArea), "Center");

        ajouterCandidatBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nom = JOptionPane.showInputDialog("Entrez le nom du candidat");
                String prenom = JOptionPane.showInputDialog("Entrez le prénom du candidat");
                Livre livre = new Livre("Titanic", "ST MART", "Marie", 20.0); 
                Candidat candidat = new Etudiant(nom, prenom, 20, livre, "Ecole", "Ville", "Pays");
            
                concours.ajouterCandidat(candidat);

                textArea.append("Candidat " + prenom + " " + nom + " ajouté\n");
            }
        });

        demarrerConcoursBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {               
                concours.demarrerConcours();              
                int nombreCandidats = concours.getNombreCandidats();
             
                textArea.append("Le concours a commencé avec " + nombreCandidats + " candidats.\n");
              
                String classement = concours.afficherClassement(); 
                textArea.append(classement); 
            }
        }); 
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {             
                new Graphique().setVisible(true);  
            }
        });
    }
}
