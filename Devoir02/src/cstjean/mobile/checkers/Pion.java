package cstjean.mobile.checkers;

/**
 * Représente un pion dans le jeu de dames.
 * Un pion a une couleur qui peut être spécifiée lors de sa création.
 */
public class Pion {
    private String couleur;

    /**
     * Crée un pion avec la couleur spécifiée.
     *
     * @param couleur La couleur du pion.
     *                Par exemple, "noir" ou "blanc".
     */
    public Pion(String couleur) {
        this.couleur = couleur;
    }

    /**
     * Crée un pion avec la couleur par défaut "blanc".
     * Utilise le constructeur avec la couleur pour initialiser le pion.
     */
    public Pion() {
        this("blanc"); // Couleur par défaut
    }

    /**
     * Obtient la couleur du pion.
     *
     * @return La couleur du pion.
     */
    public String getCouleur() {
        return couleur;
    }
}
