import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by cteyton on 04/08/16.
 */
public class ClassTest {

    protected final double DELTA = 1e-15;

    @Test
    public void fullClass() {
        int a = new ClassFull().addition(10, 5);
        assertEquals(a, 15);
        a = new ClassFull().substract(10, 5);
        assertEquals(a, 5);
        a = new ClassFull().multiplication(10, 5);
//        assertEquals(a, 50);
//        assertEquals("ab", new ClassFull().concat("a", "b"));
//        assertEquals(4, new ClassFull().square(2));
//        assertEquals(4, new ClassFull().power(2, 2), DELTA);
//        assertEquals(4, new ClassFull().division(8, 2));
    }

    @Test
    public void aboveThreshold() {
        int a = new ClassAboveThreshold().addition(10, 5);
        assertEquals(a, 15);
        a = new ClassAboveThreshold().substract(10, 5);
        assertEquals(a, 5);
        a = new ClassAboveThreshold().multiplication(10, 5);
        assertEquals(a, 50);
        assertEquals("ab", new ClassAboveThreshold().concat("a", "b"));
        assertEquals(4, new ClassAboveThreshold().square(2));
        assertEquals(4, new ClassAboveThreshold().power(2, 2), DELTA);
    }

    @Test
    public void underThreshold() {
        int a = new ClassUnderThreshold().addition(10, 5);
        assertEquals(a, 15);
        a = new ClassUnderThreshold().substract(10, 5);
        assertEquals(a, 5);
    }

    @Test
    public void testFull1() {
        assertEquals(3, new ClassFull().addition(1, 2));
    }

    @Test
    public void testFull2() {
        assertEquals(2, new ClassFull().multiplication(1, 2));
    }

    @Test
    public void testFull3() {
        assertEquals(3, new ClassFull().multiplication(1, 2));
    }

}
