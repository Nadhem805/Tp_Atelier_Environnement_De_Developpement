package mod;

import java.util.Vector;

public class TestMetier {
    public static void main(String[] args) {
        // Créer une instance de la classe Scolarité
        Scolarite scolarité = new Scolarite();

        // Numéro d'inscription de l'étudiant à rechercher
        String numIns = "VotreNumInscription";

        // Appeler la méthode getNotes pour récupérer les notes de l'étudiant
        Vector<Note> notes = scolarité.getNotes(numIns);

        // Afficher les notes récupérées
        for (Note note : notes) {
            System.out.println("IdNote : " + note.getIdNote());
            System.out.println("NumIns : " + note.getNumIns());
            System.out.println("Matiere : " + note.getMatiere());
            System.out.println("Note : " + note.getNote());
            System.out.println("---------------------");
        }
    }
}
