/**
 * Created by cteyton on 20/05/16.
 */
public class ClassOne {

    public void hello() {
        //I just add a comment
    }

    public boolean foo1() {
        try {
            System.out.println("Hello");
            System.out.println("Hello 1");
            System.out.println("Hello 2");
            System.out.println("Hello 3");
            System.out.println("Hello 4");
            System.out.println("Hello 3");
            System.out.println("Hello");
            System.out.println("Hello 1");
            System.out.println("Hello 4");
            System.out.println("Hello 3");
            System.out.println("Hello 4");
            System.out.println("Hello 3");
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return true;
    }

    public boolean foo2() {
        try {
            System.out.println("Hello");
        }
        catch (Exception e){
            e.printStackTrace();
        }
        foo3();
        return true;
    }

    /**
     * I just add a comment
     * @return
     */
    public boolean foo3() {
        try {
            System.out.println("Hello");
            System.out.println("Hello 4");
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return true;
    }


    public boolean foo4() {
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

    public boolean foo5() {
        try {
            System.out.println("Hello 3");
            System.out.println("Hello 4");
            System.out.println("Hello 3");
            System.out.println("Hello");
            System.out.println("Hello 3");
            System.out.println("Hello 4");
            System.out.println("Hello 3");
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return true;
    }

    public boolean foo6() {
        try {
            System.out.println("Hello 3");
            System.out.println("Hello 3");
            System.out.println("Hello 4");
            System.out.println("Hello 3");
            System.out.println("Hello 3");
            System.out.println("Hello 3");
            System.out.println("Hello 4");
            System.out.println("Hello 3");
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return true;
    }

    public boolean foo7() {
        try {
            System.out.println("Hello 3");
            System.out.println("Hello 3");
            System.out.println("Hello 4");
            System.out.println("Hello 3");
            System.out.println("Hello 3");
            System.out.println("Hello 3");
            System.out.println("Hello 4");
            System.out.println("Hello 3");
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return true;
    }

}
