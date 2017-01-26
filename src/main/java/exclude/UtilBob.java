package exclude;

import java.util.Random;

/**
 * Created by cteyton on 08/09/16.
 */
public class UtilBob {

    /**
     * Add bob
     * @return
     */
    public static boolean getValue() {
        int i = new Random().nextInt(40);
        System.out.println("Hello 4");
        System.out.println("Hello 3");
        return true;
    }

    /**
     * Additions
     * @param a first operand
     * @param b second operand
     * @return the sum of both numbers
     */
    public int addition(int a, int b) {
        int i = new Random().nextInt(40);
        System.out.println("Hello 4");
        System.out.println("Hello 3");
        return a+b;
    }

    public int multiplication30(int a, int b) {
        int c = a * b;
        int k = 0;
        return c;
    }

    public int multiplication31(int a, int b) {
        int c = a * b;
        return c;
    }

}
