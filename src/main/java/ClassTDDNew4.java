/**
 * Created by cteyton on 05/09/16.
 */
public class ClassTDDNew4 {
    public boolean foo1() {
        return true;
    }

    //Won't be convered
    public boolean foo2() {
        return true;
    }

    public boolean foo3() {
        return true;
    }

    /**
     * I just add a comment here
     * @param a
     * @param b
     * @return
     */
    public boolean foo4() {
        return true;
    }

    /**
     * I just add a comment here
     * @param a
     * @param b
     * @return
     */
    public boolean foo5() {
        return true;
    }

    /**
     * I just add a comment here
     * @param a
     * @param b
     * @return
     */
    public boolean foo6() {
        return true;
    }

    public boolean foo9() {
        try {
            System.out.println("Hello");
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
