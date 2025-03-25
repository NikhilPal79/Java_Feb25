package mar22.singleton;

public class Singleton {

    private static Singleton instance;

    public Singleton() {
    }

    private static Singleton makemethod(){
        if ( instance == null){
            instance = new Singleton();
        }return instance;
    }


    public void anotherMethod(){
        System.out.println("another one dj khalid ");
    }



    public static void main(String[] args) {
    Singleton s1 = new Singleton();
    s1.anotherMethod();
    }
}
