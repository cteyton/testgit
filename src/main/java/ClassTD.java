/**
 * Created by cteyton on 05/09/16.
 */
public class ClassTD {

    public boolean foo1() {
        int myIValue = 0;
        return true;
    }

    //Won't be convered
    public boolean foo2() {
        int myIValue = 0;
        return true;
    }

    /**
     * Comm
     * @return
     */
    public boolean foo3() {
        int myIValue = 0;
        return true;
    }

    public boolean foo6() {
        int myIValue = 0;
        int myJValue = 0;
        int myKValue = 0;
        System.out.println("Hello world 2 !");
        System.out.println("Hello world 3 !");
        System.out.println("Hello world 2 !");
        System.out.println("Hello world 3 !");
        int myLValue = 0;
        return true;
    }

    //Add comment but no impact on coverage
    public boolean foo7() {
        int myIValue = 0;
        int myJValue = 0;
        int myKValue = 0;
        int myLValue = 0;
        return  true;
    }

    /**
     * Yo
     * @return true
     */
    public boolean foo8() {
        int myIValue = 0;
        int myJValue = 0;
        int myKValue = 0;
        int myLValue = 0;
        return true;
    }

    /**
     * Add doc
     * @return
     */
    public boolean foo9() {
        int myIValue = 0;
        int myKValue = 0;
        int lValue = 0;
        return true;
    }

    /**
     * Yo
     * @return true
     */
    public boolean foo10() {
        int myIValue = 0;
        try {
            System.out.println("Hello 4");
        }
        catch (Exception e){
            e.printStackTrace();
        }
        int myJValue = 0;
        int myLValue = 0;
        System.out.println("2");
        return true;
    }

    /**
     * Yo
     * @return true
     */
    public boolean foo11() {
        System.out.println("3");
        return true;
    }

    /**
     * Yo
     * @return true
     */
    public boolean foo12() {
        int myIValue = 0;
        int myJValue = 0;
        int myKValue = 0;
        int myLValue = 0;
        System.out.println("4");
        return true;
    }

}
