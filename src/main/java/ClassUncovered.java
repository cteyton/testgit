import java.util.Collections;
import java.util.List;

/**
 * Created by cteyton on 20/07/16.
 */
public class ClassUncovered {

    public void reverseList(List<Integer> reverse) {
        Collections.reverse(reverse);
        int i = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int e = 0;
        int f = 0;
        int g = 0;
        int h = 0;
        int j = 0;
    }

    /**
    * This is a comment
    */
    public int uncoveredUselessMethod() {
        int a = 1;
        int b = 2;
        return a + b;
    }

    public void aNewUncoveredMethod() {
        String a = "";
        String b = "";
        if(a.endsWith(b)) {
            System.out.println("OK");
        }
    }


}
