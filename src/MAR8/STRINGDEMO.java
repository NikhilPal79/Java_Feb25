package MAR8;

public class STRINGDEMO {
    public static void main(String[] args) {

    EMPLOYEE employee = new EMPLOYEE(101,1500.00, "nikhil");

        System.out.println(employee); /// default memory       ////      by default toString is there

        ///  CREATING A tosstring method in employee class

        System.out.println();
        System.out.println(employee.toString());///    by we have written toString here =o/p same as above

        ///  creating a object of StringBuffer

        StringBuffer stringbuffer = new StringBuffer("nikhil");
        System.out.println(stringbuffer);

        System.out.println(stringbuffer.capacity()); /// buffer length

        System.out.println(stringbuffer.length());

        /// NOTE=====STRING BUFFER == LET YOU CHANGE THE STRING MAKING IT MUTABLE
        ///  using append./// modify the string

        stringbuffer.append(" all ok");
        System.out.println(stringbuffer);
        /*StringBuffer update = stringbuffer.append(" learnig java");
        System.out.println(update);*/

        System.out.println(stringbuffer.capacity());
        System.out.println(stringbuffer.length());


        System.out.println("---------------------------");

        ///  using concat on string

        String s ="mayank";
        System.out.println(s);

        s.concat("patiala");
        System.out.println(s);  //// output is not changed cz object s is not changed in concat

        String n = s.concat(" patiala");   /// making a new reference same as buffer
        System.out.println(n);

        /// concat proves string is immutable
        ///  whereas buffer are string inbuilt method







    }
}
