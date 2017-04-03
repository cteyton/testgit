import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.Callable;


/**
 * Created by cteyton on 05/09/16.
 */
public class ClassTDDNew {


    public int multiplication20(int a, int b) {
        int c = a * b;
        int k = 0;
        return c;
    }

    public double power(double a, double b) {
        double c = Math.pow(a, b);
        try {
            System.out.println("Hello 4");
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return c;
    }
}
