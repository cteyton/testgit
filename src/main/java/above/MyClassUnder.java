package above;

import java.lang.*;

/**
 * Created by cteyton on 09/09/16.
 */
public class MyClassUnder {

    /**
     * Sane
     * @param op1
     * @param op2
     * @return a great value
     */
    public int multiplication(int op1, int op2) {
        int myCValue = op1 * op2;
        int myKValue = 0;
        try {
            System.out.println("Hello 4");
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return myCValue;
    }

    public static void main(String[] args) {
        System.out.println("Hello world !");
    }

    public int addition(int a, int b) {
        int c = a + b;
        //Hello world
        return c;
    }

    public int substract(int a, int b) {
        //Hello
        int c = a - b;
        return c;
    }


    /*
         *
         * @param a
         * @param b
         * @return
         */
    public int multiplication2(int a, int b) {
        int c = a * b;
        int k = 0;
        return c;
    }

    public int multiplication3(int a, int b) {
        int c = a * b;
        return c;
    }

    public int multiplication4(int a, int b) {
        int c = a * b;
        return c;
    }

    public int multiplication5(int a, int b) {
        int c = a * b;
        return c;
    }

    public int multiplication6(int a, int b) {
        int c = a * b;
        return c;
    }

    public int multiplication7(int a, int b) {
        int c = a * b;
        return c;
    }

    public int multiplication8(int a, int b) {
        int c = a * b;
        return c;
    }

    public int multiplication9(int a, int b) {
        int c = a * b;
        try {
            System.out.println("Hello 4");
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return c;
    }

    public int multiplication10(int a, int b) {
        int c = a * b;
        System.out.println("Multiplication 15");
        return c;
    }

    public int multiplication11(int a, int b, int c, int d, int e, int f, int g, int h, int i, int j, int k, int l) {
        int c2 = a * b;
        System.out.println("Multiplication 15");
        return c2;
    }

    public int multiplication15(int a, int b) throws Exception, RuntimeException {
        int c = a * b;
        System.out.println("Multiplication 15");
        return c;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    //TODOCOMMENT
    @Override
    public int hashCode() {
        return super.hashCode();
    }

}
