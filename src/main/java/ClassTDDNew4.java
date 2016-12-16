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

    /**
     * I just add a comment here
     * @param a
     * @param b
     * @return
     */
    public boolean foo7() {
        return true;
    }

    public boolean foo9() {
        try {
            System.out.println("Hello");
            System.out.println("Hello 4");
            System.out.println("Hello 3");
            System.out.println("Hello");
            System.out.println("Hello 1");
            System.out.println("Hello 4");
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return true;
    }


}
