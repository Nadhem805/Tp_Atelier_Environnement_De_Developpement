package web;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ImcServlet
 */
@WebServlet("/ImcServlet")
public class ImcServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public ImcServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	//La prémière méthode se trouve dans ce code en commentaire
	
	 /*protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    // Récupérer les valeurs du formulaire
	    String poidsStr = request.getParameter("poids");
	    String tailleStr = request.getParameter("taille");

	    // Vérifier si les valeurs sont non nulles et non vides
	    if (poidsStr != null && !poidsStr.isEmpty() && tailleStr != null && !tailleStr.isEmpty()) {
	        try {
	            // Convertir les chaînes en nombres décimaux
	            double poids = Double.parseDouble(poidsStr);
	            double taille = Double.parseDouble(tailleStr);

	            // Calculer l'IMC
	            double imc = poids / (taille * taille);

	            // Afficher le résultat
	            response.setContentType("text/html");
	            PrintWriter out = response.getWriter();
	            out.println("<html><body>");
	            out.println("<h1>Votre Indice de Masse Corporelle (IMC) :</h1>");
	            out.println("<p>Poids : " + poids + " kg</p>");
	            out.println("<p>Taille : " + taille + " m</p>");
	            out.println("<p>IMC : " + imc + "</p>");
	            out.println("</body></html>");
	        } catch (NumberFormatException e) {
	            // Gérer les erreurs de conversion des chaînes en nombres
	            response.getWriter().println("Erreur de saisie des données.");
	        }
	    } else {
	        // Gérer le cas où les valeurs du formulaire sont manquantes
	        response.getWriter().println("Veuillez saisir toutes les informations requises.");
	    }
	}
*/
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String tailleStr = request.getParameter("taille");
        String poidsStr = request.getParameter("poids");

        
        if (tailleStr != null && !tailleStr.isEmpty() && poidsStr != null && !poidsStr.isEmpty()) {
            try {
                
                float taille = Float.parseFloat(tailleStr);
                float poids = Float.parseFloat(poidsStr);

                
                Imc imcCalculator = new Imc(taille, poids);
                float imcValue = imcCalculator.Calculer();

                
                response.setContentType("text/html");
                PrintWriter out = response.getWriter();
                out.println("<html><body>");
                out.println("<h1>Votre Indice de Masse Corporelle (IMC) :</h1>");
                out.println("<p>Poids : " + poids + " kg</p>");
                out.println("<p>Taille : " + taille + " m</p>");
                out.println("<p>IMC : " + imcValue + "</p>");
                out.println("</body></html>");
            } catch (NumberFormatException e) {
               
                response.getWriter().println("Erreur de saisie des données.");
            }
        } else {
            
            response.getWriter().println("Veuillez saisir toutes les informations requises.");
        }
    }

}
