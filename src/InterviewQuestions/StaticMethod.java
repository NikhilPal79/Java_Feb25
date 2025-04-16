package InterviewQuestions;

public class StaticMethod {

    ///  STATIC METHOD

    ///  A static method belongs to the class, not to any specific object of the class.
    /// That means you can call it without creating an instance of the class.

    ///✅ Key Features:
    ///Shared across all instances of the class.
    ///Can be called using the class name.
    ///Cannot access non-static members (instance variables/methods) directly.

    /*class MyClass {
        static void greet() {
            System.out.println("Hello from static method!");
        }
    }

    public class Main {
        public static void main(String[] args) {
            MyClass.greet(); // ✅ No object needed
        }
    }*/


    ///Static vs Instance Method:

    /// Feature	                       Static Method	                                    Instance Method
    /// Belongs to	                     Class	                                                Object
    /// Access using	                 Class name	                                            Object name
    /// Access instance vars	         ❌ Not directly	                                    ✅ Yes
    /// Memory	                         Loaded once in memory	                                One copy per object






}
