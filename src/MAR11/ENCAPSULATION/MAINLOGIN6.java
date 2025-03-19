package MAR11.ENCAPSULATION;

public class MAINLOGIN6 {
    public static void main(String[] args) {

        LOGINUSER5 loginuser = new LOGINUSER5("user", 12345);
        /*System.out.println(loginuser.username);
        System.out.println(loginuser.password);*/
        System.out.println();

        ///  let's say we put the value for user and password

        loginuser.isvaliduser("karan", 613131);
        ///  ans == invalid
        loginuser.isvaliduser("user", 12345);
        ///  ans == valid

        // any hacker tries to change

        /*loginuser.password = 74125;*//// tried to change password and got successful

        loginuser.isvaliduser("user",74125 );
        ///  ans => valid

        /// to fix this we make our instances private

        ///  CASE 2 ===> WHAT IF WE FORGET OUR USERNAME
        ///  ANS == > WE CAN NOT KNOW OUR LAST PASSWORD, WE CAN CHANGE PASSWORD, BUT WE CAN KNOW OUR USERNAME

        ///  MAKE SETTING IN GETTER SETTER
        ///  COMMENTING OUT THE SETTER FOR USERNAME => WE CANT CHANGE OUR USERNAME (GETTER IS ACTIVE)
        ///  COMMENTING OUT THE GETTER FOR PASSWORD => WE CAN CHANGE OUR PASSWORD (SETTER IS ACTIVE)

        System.out.println();
        loginuser.setPassword(987456);
        System.out.println(loginuser.getUsername());
        loginuser.isvaliduser("user", 987456);



    }
}
