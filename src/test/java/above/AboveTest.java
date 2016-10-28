package above;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by cteyton on 09/09/16.
 */
public class AboveTest {

    @Test
    public void testAbove() {
        assertEquals(3, new MyClassAbove().add0(1, 2));
        assertEquals(3, new MyClassAbove().add1(1, 2));
//        assertEquals(3, new MyClassAbove().add2(1, 2));
//        assertEquals(3, new MyClassAbove().add3(1, 2));
//        assertEquals(3, new MyClassAbove().add4(1, 2));
//        assertEquals(3, new MyClassAbove().add5(1, 2));
//        assertEquals(3, new MyClassAbove().add6(1, 2));
//        assertEquals(3, new MyClassAbove().add7(1, 2));
//        assertEquals(3, new MyClassAbove().add8(1, 2));
    }
}
