import java.util.Random;

/**
 * Created by cteyton on 07/06/16.
 */
public class ClassUnderThreshold {


    public int addition(int a, int b) {
        int c = a + b;
        return c;
    }

    public int substract(int a, int b) {
        int c = a - b;
        return c;
    }

    public int multiplication(int a, int b) {
        int c = a * b;
        return c;
    }

    public int division(int a, int b) {
        int c = a / b;
        return c;
    }

    /**
     * I just add a comment here
     * @param a
     * @param b
     * @return
     */
    public double power(double a, double b) {
        double c = Math.pow(a, b);
        return c;
    }

    public String concat(String a, String b) {
        String c = a+b;
        return c;
    }

    public int square(int a){
        return a*a;
    }

    public boolean foo8() {
        int i = new Random().nextInt(40);
        if(i > 10) {
            System.out.println("Hello 4");
            System.out.println("Hello 3");
        }
        try {
            System.out.println("Hello");
            System.out.println("Hello 1");
            System.out.println("Hello 4");
        }
        catch (Exception e){
            e.printStackTrace();
        }
        i = new Random().nextInt(40);
        if(i > 10) {
            System.out.println("Hello 4");
            System.out.println("Hello 3");
        }
        return true;
    }


}
