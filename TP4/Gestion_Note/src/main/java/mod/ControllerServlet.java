package web;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import form.NoteForm;
import mod.Scolarite;
import mod.Note;

@WebServlet("/ControllerServlet")
public class ControllerServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Récupérer le numéro d'inscription saisi par l'utilisateur depuis le formulaire
        String numIns = request.getParameter("numIns");

        // Appeler la couche métier pour récupérer les notes de l'étudiant
        Scolarite scolarite = new Scolarite();
        NoteForm noteForm = new NoteForm();
        noteForm.setNumIns(numIns);
        noteForm.setNotes(scolarite.getNotes(numIns));

        // Passer les données à la vue
        request.setAttribute("noteForm", noteForm);
        request.getRequestDispatcher("Note.jsp").forward(request, response);
    }
}
