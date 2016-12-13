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

    @Test
    public void testFull4() {
        assertEquals(3, new ClassFull().multiplication2(1, 2));
    }

    @Test
    public void testFull5() {
        assertEquals(3, new ClassFull().multiplication3(1, 2));
    }

    @Test
    public void testFull6() {
        assertEquals(3, new ClassFull().multiplication4(1, 2));
    }

    @Test
    public void testFull7() {
        assertEquals(3, new ClassFull().multiplication5(1, 2));
    }

    @Test
    public void testFull8() {
        assertEquals(3, new ClassFull().multiplication6(1, 2));
    }

    @Test
    public void testFull9() {
        assertEquals(3, new ClassFull().multiplication7(1, 2));
    }

    @Test
    public void testFull10() {
        assertEquals(3, new ClassFull().multiplication8(1, 2));
    }

    @Test
    public void testFull11() {
        assertEquals(3, new ClassFull().multiplication9(1, 2));
    }

    @Test
    public void testFull12() {
        assertEquals(3, new ClassFull().multiplication10(1, 2));
    }

    @Test
    public void testFull13() {
        assertEquals(3, new ClassFull().multiplication11(1, 2));
    }

    @Test
    public void testFull14() {
        assertEquals(3, new ClassFull().multiplication12(1, 2));
    }

    @Test
    public void testFull15() {
        assertEquals(3, new ClassFull().multiplication14(1, 2));
    }

    @Test
    public void testFull16() {
        assertEquals(3, new ClassFull().multiplication15(1, 2));
    }

    @Test
    public void testFull17() {
        assertEquals(3, new ClassFull().multiplication16(1, 2));
    }

}
