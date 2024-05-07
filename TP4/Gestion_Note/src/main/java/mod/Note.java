package mod;

public class Note {
    private int idNote;
    private String numIns;
    private String matiere;
    private float note;

    public Note() {
        // Constructeur par défaut
    }

    public Note(int idNote, String numIns, String matiere, float note) {
        this.idNote = idNote;
        this.numIns = numIns;
        this.matiere = matiere;
        this.note = note;
    }

    // Getters et Setters
    public int getIdNote() {
        return idNote;
    }

    public void setIdNote(int idNote) {
        this.idNote = idNote;
    }

    public String getNumIns() {
        return numIns;
    }

    public void setNumIns(String numIns) {
        this.numIns = numIns;
    }

    public String getMatiere() {
        return matiere;
    }

    public void setMatiere(String matiere) {
        this.matiere = matiere;
    }

    public float getNote() {
        return note;
    }

    public void setNote(float note) {
        this.note = note;
    }
}
