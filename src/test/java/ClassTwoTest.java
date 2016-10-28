import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by cteyton on 20/07/16.
 */
public class ClassTwoTest {

    protected final double DELTA = 1e-15;

    @Test
    public void addition() {
        int a = new ClassTwo().addition(10, 5);
        assertEquals(a, 15);
    }

    @Test
    public void substract() {
        int a = new ClassTwo().substract(10, 5);
        assertEquals(a, 5);
    }

    @Test
    public void multiplication() {
        int a = new ClassTwo().multiplication(10, 5);
        assertEquals(a, 50);
    }


}
