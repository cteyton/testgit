package div;

import java.util.Random;

/**
 * Created by cteyton on 20/05/16.
 */
public class ClassDIV3 {

    public void hello() {
        //I just add a comment
    }

    public boolean foo1() {
        try {
            System.out.println("Hello");
            System.out.println("Hello 1");
            System.out.println("Hello 2");
            System.out.println("Hello 3");
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return true;
    }

    public boolean foo2() {
        try {
            System.out.println("Hello");
        }
        catch (Exception e){
            e.printStackTrace();
        }
        foo3();
        return true;
    }

    /**
     * I just add a comment
     * @return
     */
    public boolean foo3() {
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
        return true;
    }


    public int multiplication20(int a, int b) {
        int c = a * b;
        int k = 0;
        return c;
    }

    public int multiplication30(int a, int b) {
        int c = a * b;
        int k = 0;
        return c;
    }


}