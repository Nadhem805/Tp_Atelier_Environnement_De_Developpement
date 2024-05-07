package web;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import metier.ImcMetierImpI;

@WebServlet("/ContollerServlet")
public class ContollerServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private ImcMetierImpI metier;

    public void init() throws ServletException {
        metier = new ImcMetierImpI();
    }

    public ContollerServlet() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("ImcModel", new ImcModel()); // Définissez l'objet ImcModel dans l'attribut de la requête
        request.getRequestDispatcher("VueImc.jsp").forward(request, response); // Transférez le contrôle à la JSP
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int poids = Integer.parseInt(request.getParameter("poids"));
        double taille = Double.parseDouble(request.getParameter("taille"));
        
        ImcModel model = new ImcModel();
        model.setPoids(poids);
        model.setTaille(taille);
        double res = metier.calculerImc(poids, taille);
        model.setImc(res);
        
        request.setAttribute("ImcModel", model); // Définissez l'objet ImcModel dans l'attribut de la requête
        request.getRequestDispatcher("VueImc.jsp").forward(request, response); // Transférez le contrôle à la JSP
    }
}
