package web;

public class Imc {
    private float taille;
    private float poids;

    // Constructeur paramétré
    public Imc(float taille, float poids) {
        this.taille = taille;
        this.poids = poids;
    }

    // Méthode pour calculer l'IMC
    public float Calculer() {
        // Calcul de l'IMC : poids / (taille * taille)
        return poids / (taille * taille);
    }
}

