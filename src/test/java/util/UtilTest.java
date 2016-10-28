package util;

import org.junit.Test;
import util01_50.UTIL01;
import util02_10.UTIL02;

/**
 * Created by cteyton on 05/09/16.
 */
public class UtilTest {

    @Test
    public void util01() {
        new UTIL01().foo1();
        new UTIL01().foo2();
        //66% shoudl be enough
    }

    @Test
    public void util02() {
        new UTIL02().foo1();
        //33% shoudl be enough
    }

}
