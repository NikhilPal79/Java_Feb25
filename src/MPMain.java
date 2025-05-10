public class MPMain {
    public static void main(String[] args) {


        /// with lambda expression
        MPInterface mpInterface =()->{
            System.out.println("this is implementing method 2");
        };

        mpInterface.method2();
        System.out.println();


        /// with method reference for static method
        MPInterface mpInterface1 = MethodPractice ::method1;

        mpInterface1.method2();
        System.out.println();


        /// with method reference for non-static method
        MethodPractice obj = new MethodPractice();

        MPInterface mpInterface2 = obj::method3;
        mpInterface2.method2();/// you still have to call interface method to call non-static method.




    }
}
