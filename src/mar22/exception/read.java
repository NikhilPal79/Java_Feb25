package mar22.exception;

public class read {


    ///  EXCEPTIONS

    /*

    An exception is an abnormal condition that arises in a code sequence at run time.
    In other words, an exception is a run-time error.

    Java exception handling is managed via five keywords: try, catch, throw, throws, and finally

    */

    /// ERRORS

    /*
    Errors represent irrecoverable conditions such as Java virtual machine (JVM) running out of memory,
    memory leaks, stack overflow errors, library incompatibility, infinite recursion, etc.
    Errors are usually beyond the control of the programmer,

    and we should not try to handle errors.
     */


    ///  2 TYPES OF EXCEPTION

    // 1. CHECKED EXCEPTION ==> COMPILE TIME OR IO EXCEPTION

    // The classes that directly inherit the Throwable class except RuntimeException and Error are known as checked exceptions.
    // For example, IOException, SQLException, etc. Checked exceptions are checked at compile-time

    // 2. UNCHECKED EXCEPTION ===> RUN-TIME OR NULL POINTER EXCEPTION

    // The classes that inherit the RuntimeException are known as unchecked exceptions. For example, ArithmeticException,
    // NullPointerException,ArrayIndexOutOfBoundsException, etc.
    // Unchecked exceptions are not checked at compile-time, but they are checked at runtime.

    ///  2 TYPES OF ERRORS

    // 1.  VIRTUAL MACHINE ERRORS

    // 2. ASSERTION ERROR

    ///  EXCEPTION HANDLING 5 KEYWORDS

    //1. try
    //2. catch
    //3. finally
    //4. throw
    //5. throws

    ///  TRY-CATCH & (FINALLY ) SYNTAX

    /*

    try{

        actual code

    }catch(Exception e){
        e.printStackTrace();    // to track the log
        System.out.println();
    }finally{
        System.out.println("this block of code will run regardless of exception above");
    }

    */

    ///  throw ========> use for the customised exception

    ///  throws ========> used for to declare the exception










}
