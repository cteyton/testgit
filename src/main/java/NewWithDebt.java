/**
 * Created by cteyton on 15/12/16.
 */
public class NewWithDebt {

    public boolean foo4() {
        try {
            System.out.println("Hello");
            System.out.println("Hello 4");
            System.out.println("Hello 1");
            System.out.println("Hello 4");
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return true;
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

    public int add7(int a, int b) {
        System.out.println("covered on not ?");
        return a+b;
    }

}
