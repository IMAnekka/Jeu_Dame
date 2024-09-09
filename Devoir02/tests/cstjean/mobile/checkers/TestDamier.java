package cstjean.mobile.checkers;

import junit.framework.TestCase;

/**
 * Classe de test pour la classe {@link Damier}.
 * Vérifie le bon fonctionnement des méthodes de la classe {@link Damier}.
 */
public class TestDamier extends TestCase {

    /**
     * Teste que le damier est vide initialement.
     * Crée un nouveau damier et vérifie que le nombre de pions est zéro.
     */
    public void testDamierVideInitialement() {
        Damier damier = new Damier();
        // Vérifie que le damier est vide au départ
        assertEquals(0, damier.nombrePions());
    }

    /**
     * Teste l'ajout et l'obtention de pions sur le damier.
     * Crée un damier et deux pions (noir et blanc). Ajoute ces pions à des positions spécifiques
     * sur le damier et vérifie que le nombre de pions est correct ainsi que la couleur des pions
     * aux positions spécifiées.
     */
    public void testAjouterEtObtenirPion() {
        Damier damier = new Damier();
        Pion pionNoir = new Pion("noir");
        Pion pionBlanc = new Pion("blanc");

        damier.ajouterPion(38, pionNoir);
        damier.ajouterPion(15, pionBlanc);

        // Vérifie que le nombre de pions est correct
        assertEquals(2, damier.nombrePions());

        // Vérifie que le pion en position 38 est bien un pion noir
        assertEquals("noir", damier.obtenirPion(38).getCouleur());

        // Vérifie que le pion en position 15 est bien un pion blanc
        assertEquals("blanc", damier.obtenirPion(15).getCouleur());
    }
}
