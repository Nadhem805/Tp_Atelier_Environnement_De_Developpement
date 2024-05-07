package mod;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

public class Scolarite {
    public Vector<Note> getNotes(String numIns) {
        Vector<Note> notes = new Vector<>();

        try (Connection connection = DatabaseConn.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM Notes WHERE NumIns = ?")) {
            preparedStatement.setString(1, numIns);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                Note note = new Note();
                note.setIdNote(resultSet.getInt("IdNote"));
                note.setNumIns(resultSet.getString("NumIns"));
                note.setMatiere(resultSet.getString("Matiere"));
                note.setNote(resultSet.getFloat("Note"));
                notes.add(note);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return notes;
    }
}
