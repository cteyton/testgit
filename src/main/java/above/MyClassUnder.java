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

}
