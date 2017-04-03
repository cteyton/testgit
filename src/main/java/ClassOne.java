import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.Callable;

/**
 * Created by cteyton on 20/05/16.
 */
public class ClassOne {

    public void hello() {
        //I just add a comment
    }

    public boolean foo1() {
        try {
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return true;
    }

    public boolean foo2() {
        try {
            System.out.println("Hello");
            System.out.println("Hello");
            System.out.println("Hello");
            System.out.println("Hello");
            System.out.println("Hello");
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return true;
    }

}
