/**
 * Created by cteyton on 05/09/16.
 */
public class ClassTDD {

    public boolean foo1() {
        int iValue = 0;
        return true;
    }

    //Won't be convered
    public boolean foo2() {
        int iValue = 0;
        return true;
    }

    /**
     * Comm
     * @return
     */
    public boolean foo3() {
        int iValue = 0;
        return true;
    }

    public boolean foo6() {
        int iValue = 0;
        int jValue = 0;
        int kValue = 0;
        System.out.println("Hello world 2 !");
        System.out.println("Hello world 3 !");
        System.out.println("Hello world 2 !");
        System.out.println("Hello world 3 !");
        int lValue = 0;
        return true;
    }

    //Add comment but no impact on coverage
    public boolean foo7() {
        int iValue = 0;
        int jValue = 0;
        int kValue = 0;
        int lValue = 0;
        return  true;
    }

    public boolean foo8() {
        int iValue = 0;
        int jValue = 0;
        int kValue = 0;
        int lValue = 0;
        return true;
    }

    /**
     * Add doc
     * @return
     */
    public boolean foo9() {
        int iValue = 0;
        int kValue = 0;
        int lValue = 0;
        return true;
    }

    public boolean foo10() {
        int iValue = 0;
        try {
            System.out.println("Hello 4");
        }
        catch (Exception e){
            e.printStackTrace();
        }
        int jValue = 0;
        int lValue = 0;
        System.out.println("2");
        return true;
    }

    public boolean foo11() {
        System.out.println("3");
        return true;
    }

    public boolean foo12() {
        int iValue = 0;
        int jValue = 0;
        int kValue = 0;
        int lValue = 0;
        System.out.println("4");
        return true;
    }

    public int multiplication20(int a, int b) {
        int c = a * b;
        int kValue = 0;
        return c;
    }
}
