package apr27.Java_8.MethodReference;

public class StuffMain {
    public static void main(String[] args) {


        /// provide the implementation of StuffInter

        /// 1- with the help of lambda

        /// HOW TO CALL INTERFACE METHOD WITH THE HELP OF LAMBDA


        StuffInter stuffInter = () ->{
            System.out.println("this is doTask new method ");
        };

        stuffInter.DoTask();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();


        /// 2- method ref operator

        /// CALL THE STATIC METHOD WITH THE HELP OF METHOD REFERENCE

        ///  static method ko refer kiya hai

        StuffInter stuffInter1 = Stuff::football;

        stuffInter1.DoTask();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();


        /// 3---- using method ref on thread



        Runnable runnable = Stuff ::threadTask;

        Thread thread = new Thread(runnable);
        thread.start();
        System.out.println();
        System.out.println();
        System.out.println();


        ///  4- using the method ref on thread for non-static method

        ///  we need to create object

        Stuff  stuff = new Stuff();

        Runnable runnable1 = stuff::threadNumber;
        Thread thread1 = new Thread(runnable1);
        thread1.start();





    }
}
