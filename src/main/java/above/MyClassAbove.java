package above;

/**
 * Created by cteyton on 09/09/16.
 */
public class MyClassAbove {

    public int add0(int a, int b){
        System.out.println("covered on not ?");
        return a+b;
    }

    public int add1(int a, int b){
        System.out.println("covered on not ?");
        try {
            System.out.println("Hello 4");
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return a+b;
    }

   

}
