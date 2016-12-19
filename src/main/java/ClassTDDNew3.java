/**
 * Created by cteyton on 05/09/16.
 */
public class ClassTDDNew3 {

    /**
     * I just add a comment here
     * @param a
     * @param b
     * @return
     */
    public boolean foo1() {
        int i = 0;
        return true;
    }

    //Won't be convered
    public boolean foo2() {
        int i = 0;
        return true;
    }

    /**
     * I just add a comment here
     * @param a
     * @param b
     * @return
     */
    public boolean foo3() {
        int i = 0;
        return true;
    }

    public boolean foo4() {
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

}
