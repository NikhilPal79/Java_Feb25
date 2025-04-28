package apr27.Java_8.MethodReference;

public class StuffMain {
    public static void main(String[] args) {


        /// provide the implementation of StuffInter

        /// 1- with the help of lambda

        /// HOW TO CALL INTERFACE METHOD WITH THE HELP OF LEMBDA


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





    }
}
