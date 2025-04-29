package apr26.Java_8.MethodReference;


/// slide 3
public class Stuff {

    public static void football(){
        System.out.println("i am learning fifa");
        System.out.println("i am second line");
    }



    public static void threadTask(){///  applying table of 2

        for (int i = 1; i < 10; i++) {
            System.out.println(i*2);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }


    }

    public void threadNumber(){
        for (int i = 1; i < 5; i++) {
            System.out.println(i*2);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
