import org.junit.Test;

/**
 * Created by cteyton on 15/12/16.
 */
public class ClassOneTest {

    @Test
    public void testFoo1() {
        new ClassOne().foo1();
        new ClassOne().foo2();
        new ClassOne().hello();
    }

    @Test
    public void testFull() {
        new ClassTD().foo1();
        new ClassTD().foo2();
        new ClassTD().foo3();
        new ClassTD().foo6();
        new ClassTD().foo7();
        new ClassTD().foo8();
        new ClassTD().foo9();
        new ClassTD().foo10();
        new ClassTD().foo11();
        new ClassTD().foo12();
    }
}
