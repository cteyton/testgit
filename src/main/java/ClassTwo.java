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
