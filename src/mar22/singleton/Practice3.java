package mar22.singleton;

public class Practice3 {

    /// create private static instance

    private static Practice3 instance;

    ///  create private constructor

    private Practice3() {
    }

    ///  create public static method

    public Practice3 showInstance() {
        if (instance == null) {
            instance = new Practice3();
        }
        return instance;
    }


    ///  creating 1 more method

    public void user() {
        System.out.println("doing practice for singleton");
    }


    public static void main(String[] args) {
        Practice3 p1 = new Practice3();
        p1.user();

    }
}
