package cstjean.mobile.checkers;

import junit.framework.Test;
import junit.framework.TestSuite;

public class TestSuiteDame {

    public static Test suite() {
        TestSuite suite = new TestSuite();
        suite.addTestSuite(TestPion.class);
        suite.addTestSuite(TestDamier.class);
        return suite;
    }
}
