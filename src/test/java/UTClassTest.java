import exclude.UtilBar;
import exclude.UtilBob;
import exclude.UtilFoo;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by cteyton on 04/08/16.
 */
public class UTClassTest {

    //Browse two files
    @Test
    public void test_UT_NOT_OK() {
        new ClassOneTest().hello();
        assertEquals(3, new ClassTwo().addition(1, 2));
        new ClassUncovered().reverseList(new ArrayList<Integer>());
        assertTrue(true);
    }

    @Test
    public void test_UT_OK() { //Browse only one file
        new ClassTwo().addition(1, 2);
        assertTrue(true);
    }

    @Test
    public void testUT_WILL_BE_OK() {
        //Browse only one file
        new ClassOneTest().foo1();
        new ClassOneTest().foo2();
        //Add a comment
        //Add another
        boolean val = UtilFoo.getValue();
        val = UtilBar.getValue();
        val = UtilBob.getValue();
        assertTrue(true);
    }
}
