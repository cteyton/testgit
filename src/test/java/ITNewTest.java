import exclude.UtilFoo;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by cteyton on 05/09/16.
 */
public class ITNewTest {

    @Test
    public void testTIOK() {
        new ClassOne().hello();
        assertEquals(3, new ClassTwo().addition(1, 2));
        new ClassUncovered().reverseList(new ArrayList<Integer>());
        assertTrue(true);
    }

    @Test
    public void testTI_NotOK() {
        //Browse only one file
        new ClassTwo().addition(1, 2);
        assertTrue(true);
    }

    @Test
    public void testTI_FOO1_OK() {
        //Browse only one file
        //new ClassOne().foo1();
        new ClassTwo().foo();
        assertTrue(true);
    }

    @Test
    public void testTI_FOO1_NOTOK() {
        //Browse only one file
        //new ClassOne().foo1();
        //new ClassTwo().foo();
        assertTrue(true);
    }


}
