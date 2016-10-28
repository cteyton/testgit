import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by cteyton on 05/09/16.
 */
public class ClassTDDTest {

    @Test
    public void testFoo1() {
        assertTrue(new ClassTDD().foo1());
        assertTrue(new ClassTDD().foo2());
        assertTrue(new ClassTDD().foo3());
        assertTrue(new ClassTDD().foo6());
    }

    @Test
    public void testFoo2() {
//      assertTrue(new ClassTDD().foo1());
//        assertTrue(new ClassTDDNew4().foo5());
//        assertTrue(new ClassTDDNew4().foo6());
//        assertTrue(new ClassTDDNew4().foo8());
    }

}
