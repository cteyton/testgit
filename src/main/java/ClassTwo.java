/**
 * Created by cteyton on 20/05/16.
 */
public class ClassTwo {

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

    public double power(double a, double b) {
        double c = Math.pow(a, b);
        return c;
    }

    public double power2(double a, double b) {
        double c = Math.pow(a, b);
        return c;
    }

    public double power3(double a, double b) {
        double c = Math.pow(a, b);
        return c;
    }

    public double power4(double a, double b) {
        double c = Math.pow(a, b);
        return c;
    }

    public double power5(double a, double b) {
        double c = Math.pow(a, b);
        return c;
    }

    public double power6(double a, double b) {
        double c = Math.pow(a, b);
        return c;
    }

    public String concat(String a, String b) {
        String c = a+b;
        System.out.println("This line should be covered ");
        return c;
    }

    public int square(int a){
        return a*a;
    }

    public void foo() {
        System.out.println("This is a new uncovered line");
    }

    public boolean foo2() {
        int i = 0;
        return true;
    }

}
