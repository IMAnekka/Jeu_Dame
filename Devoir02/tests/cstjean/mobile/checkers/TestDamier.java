package cstjean.mobile.checkers;

import junit.framework.TestCase;

public class TestDamier extends TestCase {

    public void testDamier() {
        Damier damier = new Damier();

        // Vérifie que le damier est vide au départ
        assertEquals(0, damier.getNombreDePions());

        Pion pionNoir = new Pion("noir");
        Pion pionBlanc = new Pion("blanc");

        // Ajoute des pions à des positions spécifiques
        damier.ajouterPion(38, pionNoir);
        assertEquals(1, damier.getNombreDePions());
        assertEquals("noir", damier.obtenirPion(38).getCouleur());

        damier.ajouterPion(10, pionBlanc);
        assertEquals(2, damier.getNombreDePions());
        assertEquals("blanc", damier.obtenirPion(10).getCouleur());

        // Vérifie que le pion ajouté est correct
        assertEquals("noir", damier.obtenirPion(38).getCouleur());
        assertEquals("blanc", damier.obtenirPion(10).getCouleur());

        // Vérifie que les positions non occupées retournent null
        assertNull(damier.obtenirPion(1));
    }
}
