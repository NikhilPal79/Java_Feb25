public class IPLMain {
    public static void main(String[] args) {

        /// implementation of functional interface method with lambda

        Bcci bcci = ()->{
            return new IPL();
        };
        System.out.println();

        /// using contractor reference

        Bcci bcci1 = IPL::new;
        System.out.println();
        bcci1.getPlayer();


        /*bcci.getPlayer();*/

        /// implementation of non-static method

        IPL ipl = new IPL();
        ipl.punjab();


    }
}
