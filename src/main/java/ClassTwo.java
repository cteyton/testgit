import java.util.Random;

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
            System.out.println("Hello 1");
            System.out.println("Hello 4");
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return true;
    }

    public boolean foo7() {
        try {
            System.out.println("Hello 3");
        }
        catch (Exception e){
            e.printStackTrace();
        }
        int i = new Random().nextInt(40);
        if(i > 10) {
            System.out.println("Hello 3");
        }
        return true;
    }

    public boolean foo8() {
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
            System.out.println("Hello 4");
            System.out.println("Hello 3");
        }
        return true;
    }



}
