/**
 * Created by cteyton on 05/09/16.
 */
public class ClassTDD {

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
     * Comm
     * @return
     */
    public boolean foo3() {
        int i = 0;
        return true;
    }

    /**
     * I just add a comment here
     * @param a
     * @param b
     * @return
     */
    public boolean foo6() {
        int i = 0;
        int j = 0;
        int k = 0;
        int l = 0;
        return true;
    }

    //Add comment but no impact on coverage
    public boolean foo7() {
        int i = 0;
        int j = 0;
        int k = 0;
        int l = 0;
        return  true;
    }

    public boolean foo8() {
        int i = 0;
        int j = 0;
        int k = 0;
        int l = 0;
        return true;
    }

    /**
     * Add doc
     * @return
     */
    public boolean foo9() {
        int i = 0;
        int k = 0;
        int l = 0;
        return true;
    }

    public boolean foo10() {
        int i = 0;
        int j = 0;
        int l = 0;
        System.out.println("2");
        return true;
    }

    public boolean foo11() {
        System.out.println("3");
        return true;
    }

    public boolean foo12() {
        int i = 0;
        int j = 0;
        int k = 0;
        int l = 0;
        System.out.println("4");
        return true;
    }

    public boolean foo20() {
        try {
            System.out.println("Hello 4");
            System.out.println("Hello 3");
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return true;
    }

    public boolean foo21() {
        try {
            System.out.println("Hello");
            System.out.println("Hello 1");
            System.out.println("Hello 3");
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return true;
    }

    public boolean foo22() {
        try {
            System.out.println("Hello");
            System.out.println("Hello 1");
            System.out.println("Hello 3");
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return true;
    }

    public boolean foo23() {
        try {
            System.out.println("Hello");
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return true;
    }
}
