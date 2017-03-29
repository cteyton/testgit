import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.Callable;


/**
 * Created by cteyton on 20/07/16.
 */
public class ClassUncovered {

    public void reverseList(List<Integer> reverse) {
        Collections.reverse(reverse);
        int i = 0;
        int b = 0;
        int h = 0;
        int j = 0;
    }

    /**
    * This is a comment
    */
    public int uncoveredUselessMethod() {
        int a = 1;
        System.out.println("Hello world 2 !");
        System.out.println("Hello world 3 !");
        System.out.println("Hello world 2 !");
        System.out.println("Hello world 3 !");
        int b = 2;
        return a + b;
    }

    /**
     * I just add a comment here
     * @param a
     * @param b
     * @return
     */
    public void aNewUncoveredMethod() {
        String a = "";
        String b = "";
        if(a.endsWith(b)) {
            System.out.println("OK");
            System.out.println("Hello");
            System.out.println("Hello 1");
            System.out.println("Hello 4");
        }
        else {
            System.out.println("Hello");
            System.out.println("Hello 1");
            System.out.println("Hello 4");
        }
    }

    public boolean foo8() {
        int i = new Random().nextInt(40);
        if(i > 10) {
            System.out.println("Hello 4");
        }
        try {
            System.out.println("Hello 4");
        }
        catch (Exception e){
            e.printStackTrace();
        }
        i = new Random().nextInt(40);
        if(i > 10) {
            System.out.println("Hello 3");
        }
        return true;
    }

    public int multiplication20(int a, int b) {
        int c = a * b;
        try {
            System.out.println("Hello 4");
        }
        catch (Exception e){
            e.printStackTrace();
        }
        int k = 0;
        return c;
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

    public double power(double a, double b) {
        double c = Math.pow(a, b);
        return c;
    }


}
