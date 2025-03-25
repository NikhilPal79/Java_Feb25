package mar22.singleton;

public class Nikhil2 {

    ///  creating a private static instance

    private static Nikhil2 instance;

    ///  creating a private constructor

    private Nikhil2() {
    }

    /// creating a public static method

    public static Nikhil2 getInstance(){
        if(instance == null){
            instance = new Nikhil2();
        }
        return instance;
    }


    public void showMessge(){
        System.out.println("hello from singleton");
    }


    public static void main(String[] args) {

        Nikhil2 s1 = new Nikhil2();
        s1.showMessge();

    }
}