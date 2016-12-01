package full;

import Full.MyFullClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by cteyton on 09/09/16.
 */
public class FullTest {

    @Test
    public void testFull() {
        assertEquals(3, new MyFullClass().add(1, 2));
    }



}
