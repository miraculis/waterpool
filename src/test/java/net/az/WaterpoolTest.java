package net.az;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import net.az.impl.CalculatorImpl;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Unit test for simple Launcher.
 */
public class WaterpoolTest extends TestCase {
    private Calculator<Integer[], Integer> c = new CalculatorImpl();
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public WaterpoolTest(String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(WaterpoolTest.class);
    }

    /**
     */
    public void testEmpty() {
        assertEquals(0, (int)c.compute(new Integer[0]));
    }

    public void testHole() {
        assertEquals(0, (int)c.compute(new Integer[]{3, 2, 1, 0, 1, 2, 3}));
    }

    public void testSimple() {
        assertEquals(4, (int)c.compute(new Integer[]{3, 2, 1, 2, 3}));
    }

    public void testWithMax() {
        assertEquals(7, (int)c.compute(new Integer[]{3, 2, 1, 3, 2, 1, 2, 3}));
    }

    public void testWithMaxAndHole() {
        assertEquals(4, (int)c.compute(new Integer[]{3, 2, 0, 3, 2, 1, 2, 3}));
    }

}
