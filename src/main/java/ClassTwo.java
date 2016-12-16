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


    public boolean foo4() {
        try {
            System.out.println("Hello");
            System.out.println("Hello 4");
            System.out.println("Hello 3");
            System.out.println("Hello");
            System.out.println("Hello 1");
            System.out.println("Hello 4");
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return true;
    }

}
