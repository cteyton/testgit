package above;

/**
 * Created by cteyton on 09/09/16.
 */
public class MyClassNewUncovered {

    public int add0(int a, int b){
        return a+b;
    }

    public int add1(int a, int b){
        return a+b;
    }

    public int add8(int a, int b){
        return a+b;
    }

    public int add9(int a, int b){
        return a+b;
    }

    public int add10(int a, int b) {
        return a+b;
    }

    public int add11(int a, int b) {
        return a+b;
    }

    public int add12(int a, int b) {
        return a+b;
    }

    public int add13(int a, int b) {
        return a+b;
    }

    public int multiplication31(int a, int b) {
        int c = a * b;
        try {
            System.out.println("Hello 4");
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return c;
    }
}
