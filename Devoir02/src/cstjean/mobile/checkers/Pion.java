package cstjean.mobile.checkers;

public class Pion {
    private String couleur;

    // Constructeur avec couleur
    public Pion(String couleur) {
        this.couleur = couleur;
    }

    // Constructeur par défaut (pion blanc)
    public Pion() {
        this("Blanc");
    }

    // Méthode pour obtenir la couleur du pion
    public String getCouleur() {
        return couleur;
    }
}
