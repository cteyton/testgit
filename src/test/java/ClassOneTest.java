import org.junit.Test;

/**
 * Created by cteyton on 15/12/16.
 */
public class ClassOneTest {

    @Test
    public void testFoo1() {
        new ClassOne().foo1();
        new ClassOne().foo2();
        new ClassOne().foo3();
        new ClassOne().foo4();
        new ClassOne().foo5();
        new ClassOne().foo6();
        new ClassOne().hello();
    }

    @Test
    public void testFull() {
        new ClassTDD().foo1();
        new ClassTDD().foo2();
        new ClassTDD().foo3();
        new  ClassTDD().foo6();
        new  ClassTDD().foo7();
        new  ClassTDD().foo8();
        new  ClassTDD().foo9();
        new  ClassTDD().foo10();
        new  ClassTDD().foo11();
        new  ClassTDD().foo12();
    }
}
