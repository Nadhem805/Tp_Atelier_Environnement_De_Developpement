package form;

import java.util.Vector;
import mod.Note;

public class NoteForm {
    private String numIns;
    private Vector<Note> notes;

    public String getNumIns() {
        return numIns;
    }

    public void setNumIns(String numIns) {
        this.numIns = numIns;
    }

    public Vector<Note> getNotes() {
        return notes;
    }

    public void setNotes(Vector<Note> notes) {
        this.notes = notes;
    }
}
