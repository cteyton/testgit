package testcreation;

/**
 * Created by cteyton on 05/04/17.
 */
public class NewClassShouldBeUncovered2 {

    private int cpt;

    public NewClassShouldBeUncovered2(){
        //This is a constructor
    }

    public int getCpt() {
        return cpt;
    }

    public void setCpt(int cpt) {
        this.cpt = cpt;
    }

    public int incr(int a, int b) {
        return a+b;
    }

}
