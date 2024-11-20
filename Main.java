package Concours_candidats;

public class Main {
 public static void main(String[] args) {
     
     javax.swing.SwingUtilities.invokeLater(new Runnable() {
         public void run() {
             new Graphique().setVisible(true);
         }
     });
 }
}

