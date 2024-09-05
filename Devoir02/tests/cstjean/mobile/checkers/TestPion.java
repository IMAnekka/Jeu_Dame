package cstjean.mobile.checkers;

import junit.framework.TestCase;

public class TestPion extends TestCase {

    public void testCreerPionAvecCouleur() {
        // Crée un pion avec la couleur noire
        Pion pionNoir = new Pion("noir");
        // Vérifie que la couleur est correcte
        assertEquals("noir", pionNoir.getCouleur());
    }

    public void testCreerPionParDefaut() {
        // Crée un pion avec le constructeur par défaut (blanc)
        Pion pionParDefaut = new Pion();
        // Vérifie que la couleur par défaut est blanche
        assertEquals("Blanc", pionParDefaut.getCouleur());
    }
}
