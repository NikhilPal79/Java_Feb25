package MAR15.REALATIONSHIP;

import java.sql.SQLOutput;

public class EMPLOYEEMAIN {
    public static void main(String[] args) {

        ADDRESS address1 = new ADDRESS("88 chamberlin drive", "cambridge", "ontario", "canada","n1t1m4");
        ADDRESS address2 = new ADDRESS("99 king street","kitchener" ,"ontario","canada","n2t1c9");
        ADDRESS address3 = new ADDRESS("12 queen "," waterloo", "ontario","canada","n3t1a6");


        NAME name1 = new NAME("nikhil","pal","kumar");
        NAME name2 = new NAME("karan","singh","beniwal");
        NAME name3 = new NAME("harp","jot","preet");


        EMPLOYEE employee1 = new EMPLOYEE(5072,name1,"nikhilchpr7@gmail.com",address1, 70000.00);
        EMPLOYEE employee2 = new EMPLOYEE(2122,name2,"karantejpal@gmail.com",address2, 60000.00);
        EMPLOYEE employee3 = new EMPLOYEE(7544,name3,"erharp947@gmail.com",address3, 50000.00);




        ///  WHEN EVER WE CAN COMPOSITE FILED BETTER TO CREATE A SEPARATE CLASS OF THE
        ///  SO WE ARE GOING TO CREATE SEPARATE ADDRESS CLASS
        ///  NOTE==> AND WE CHANGE THE private String address --> private ADDRESS address in instance and in CONSTRUCTOR TOO

        ///  need to create object in empmain class as the address written in constructor is no longer valid

        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);
        System.out.println();

        /*MAR15.REALATIONSHIP.EMPLOYEE@135fbaa4
        MAR15.REALATIONSHIP.EMPLOYEE@45ee12a7
        MAR15.REALATIONSHIP.EMPLOYEE@330bedb4*/

        ///  not expected output so we need to add toString to emp class

        /*EMPLOYEE{id=5072, name='nikhil', email='nikhilchpr7@gmail.com', address=MAR15.REALATIONSHIP.ADDRESS@135fbaa4, salary=70000.0}
        EMPLOYEE{id=2122, name='karan', email='karantejpal@gmail.com', address=MAR15.REALATIONSHIP.ADDRESS@45ee12a7, salary=60000.0}
        EMPLOYEE{id=7544, name='harp', email='erharp947@gmail.com', address=MAR15.REALATIONSHIP.ADDRESS@330bedb4, salary=50000.0}*/

        ///  still not expected output so we need to add toString to address class

        /*EMPLOYEE{id=5072, name='nikhil', email='nikhilchpr7@gmail.com', address=ADDRESS{streetNumber='88 chamberlin drive', city='cambridge', province='ontario', country='canada', postalCode='n1t1m4'}, salary=70000.0}
        EMPLOYEE{id=2122, name='karan', email='karantejpal@gmail.com', address=ADDRESS{streetNumber='99 king street', city='kitchener', province='ontario', country='canada', postalCode='n2t1c9'}, salary=60000.0}
        EMPLOYEE{id=7544, name='harp', email='erharp947@gmail.com', address=ADDRESS{streetNumber='12 queen ', city=' waterloo', province='ontario', country='canada', postalCode='n3t1a6'}, salary=50000.0}*/

        ///  get the desired output
        ///  but if we need the emp1 address only
        ///  add getter & setter in  emp and address class

        System.out.println("city of emp1 is :" + employee1.getAddress().getCity());
        System.out.println();


        ///  ASSIGNMENT --- DO IT FOR NAME
        ///  NOTE === NEED TO CHANGE CONSTRUCTOR IN EMP CLASS AS WELL INTELLJ WILL TELL YOU

        System.out.println("first name of emp1 is : "+ employee1.getName().getFirstName());


    }
}
