package exclude;

import java.util.Random;

/**
 * Created by cteyton on 08/09/16.
 */
public class UtilBar {

    /**
     *
     * @return
     */
    public static boolean getValue() {
        return true;
    }

    public void foo1() {
        int i = new Random().nextInt(40);
        if(i > 10) {
            System.out.println("Hello 4");
            System.out.println("Hello 3");
        }
        else {
            return;
        }
    }

    public void foo2() {
        int i = new Random().nextInt(40);
        if(i > 10) {
            System.out.println("Hello 4");
            System.out.println("Hello 3");
        }
        else {
            return;
        }
    }


    public int multiplication20(int a, int b) {
        int c = a * b;
        int k = 0;
        return c;
    }


    public int multiplication21(int a, int b) {
        int c = a * b;
        int k = 0;
        return c;
    }

}
