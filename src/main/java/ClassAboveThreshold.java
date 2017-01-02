import java.util.Random;

/**
 * Created by cteyton on 20/05/16.
 */
public class ClassAboveThreshold {

    public int addition(int a, int b) {
        //Hello
        System.out.println("Hello world 2 !");
        System.out.println("Hello world 3 !");
        System.out.println("Hello world 2 !");
        System.out.println("Hello world 3 !");
        int c = a + b;
        return c;
    }

    /**
     * I just add a comment here
     * @param a
     * @param b
     * @return
     */
    public int substract(int a, int b) {
        //Hello
        int c = a - b;
        return c;
    }

    /**
     * I just add a comment here
     * @param a
     * @param b
     * @return
     */
    public int multiplication(int a, int b) {
        int c = a * b;
        return c;
    }

    /**
     * I just add a comment here
     * @param a
     * @param b
     * @return
     */
    public int division(int a, int b) {
        int c = a / b;
        return c;
    }

    public double power(double a, double b) {
        double c = Math.pow(a, b);
        return c;
    }

    public String concat(String a, String b) {
        String c = a+b;
        return c;
    }

    /**
     * I just add a comment here
     * @param a
     * @param b
     * @return
     */
    public int square(int a){
        return a*a;
    }

    public boolean foo6() {
        int i = 0;
        return true;
    }

    /**
     * I just add a comment here
     * @param a
     * @param b
     * @return
     */
    public boolean foo4() {
        int i = new Random().nextInt(40);
        if(i > 10) {
            System.out.println("Hello 3");
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

}
