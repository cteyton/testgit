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
        if(i > 10) {
            System.out.println("Hello 4");
            System.out.println("Hello 3");
        }
        System.out.println("Hello");
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
        if(i > 10) {
            System.out.println("Hello 4");
            System.out.println("Hello 3");
        }
        System.out.println("Hello");
        return a+b;
    }

}
