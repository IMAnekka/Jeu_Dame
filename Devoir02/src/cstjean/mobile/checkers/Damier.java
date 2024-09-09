package cstjean.mobile.checkers;

import java.util.LinkedList;

/**
 * Représente un damier pour le jeu de dames.
 * Le damier peut contenir des pions à des positions spécifiques.
 */
public class Damier {
    private LinkedList<Pion> pions;

    /**
     * Crée un nouveau damier vide.
     * Initialise la liste des pions comme une LinkedList vide.
     */
    public Damier() {
        pions = new LinkedList<>();
    }

    /**
     * Ajoute un pion à une position spécifique sur le damier.
     * Si la position est inférieure à la taille actuelle de la liste des pions, remplace le pion à cette position.
     * Si la position est supérieure, ajoute des cases vides jusqu'à cette position.
     *
     * @param position La position (entre 1 et 50) où le pion doit être ajouté.
     * @param pion Le pion à ajouter à la position spécifiée.
     */
    public void ajouterPion(int position, Pion pion) {
        if (position >= 1 && position <= 50) {
            while (pions.size() < position) {
                pions.add(null);
            }
            pions.set(position - 1, pion);
        }
    }

    /**
     * Obtient le pion à une position spécifique sur le damier.
     *
     * @param position La position (entre 1 et 50) du pion à obtenir.
     * @return Le pion à la position spécifiée, ou null si la position est vide ou invalide.
     */
    public Pion obtenirPion(int position) {
        if (position >= 1 && position <= 50 && position - 1 < pions.size()) {
            return pions.get(position - 1);
        }
        return null;
    }

    /**
     * Obtient le nombre de pions présents sur le damier.
     *
     * @return Le nombre de pions non nulls sur le damier.
     */
    public int nombrePions() {
        return (int) pions.stream().filter(p -> p != null).count();
    }
}
