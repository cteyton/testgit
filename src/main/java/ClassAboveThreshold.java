/**
 * Created by cteyton on 20/05/16.
 */
public class ClassAboveThreshold {

    public int addition(int a, int b) {
        //Hello
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
        try {
            System.out.println("Hello 4");
        }
        catch (Exception e){
            e.printStackTrace();
        }
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
        try {
            System.out.println("Hello 4");
        }
        catch (Exception e){
            e.printStackTrace();
        }
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


}
