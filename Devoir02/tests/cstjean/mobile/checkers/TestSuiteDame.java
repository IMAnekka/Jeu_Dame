package cstjean.mobile.checkers;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Classe de suite de tests pour les classes {@link Pion} et {@link Damier}.
 * Cette classe regroupe tous les tests des classes {@link Pion} et {@link Damier} en une seule suite
 * afin de faciliter leur exécution collective.
 */
public class TestSuiteDame {

    /**
     * Crée une suite de tests contenant les tests pour les classes {@link Pion} et {@link Damier}.
     *
     * @return une instance de {@link TestSuite} contenant les tests pour les classes {@link Pion} et {@link Damier}
     */
    public static Test suite() {
        TestSuite suite = new TestSuite("Tests pour les classes Pion et Damier");
        suite.addTestSuite(TestPion.class);
        suite.addTestSuite(TestDamier.class);
        return suite;
    }
}
