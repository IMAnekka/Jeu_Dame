package cstjean.mobile.checkers;

import junit.framework.TestCase;

/**
 * Classe de test pour la classe {@link Pion}.
 * Vérifie le bon fonctionnement des méthodes de la classe {@link Pion}.
 */
public class TestPion extends TestCase {

    /**
     * Teste la création d'un pion avec une couleur spécifiée.
     * Crée un pion de couleur noire et vérifie que la couleur du pion est correcte.
     */
    public void testCreerPionAvecCouleur() {
        Pion pionNoir = new Pion("noir");
        // Vérifie que la couleur du pion est bien noire
        assertEquals("noir", pionNoir.getCouleur());
    }

    /**
     * Teste la création d'un pion avec le constructeur par défaut.
     * Crée un pion avec le constructeur par défaut (blanc) et vérifie que la couleur
     * du pion est correcte (blanc).
     */
    public void testCreerPionParDefaut() {
        Pion pionParDefaut = new Pion();
        // Vérifie que la couleur du pion est bien blanche par défaut
        assertEquals("blanc", pionParDefaut.getCouleur());
    }
}
