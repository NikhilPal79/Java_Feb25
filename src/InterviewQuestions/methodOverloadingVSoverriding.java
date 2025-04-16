package InterviewQuestions;

public class methodOverloadingVSoverriding {


    /// METHOD OVERLOADING
    ///  means multiple methods with the same name but different parameters (in the same class).
    ///
    /// ✅ Key Points:
    /// Done within the same class.
    ///
    /// Happens at compile-time (aka compile-time polymorphism).
    ///
    /// Differentiated by number, type, or order of parameters.
    ///
    /// Return type can be different, but not enough to distinguish alone.
    class Calculator {
        int add(int a, int b) {
            return a + b;
        }

        double add(double a, double b) {
            return a + b;
        }

        int add(int a, int b, int c) {
            return a + b + c;
        }
    }

    /// METHOD OVERRIDING
    ///  means redefining a method from the parent class in the child class to provide specific behavior.
    ///
    /// ✅ Key Points:
    /// Must be in a subclass (inheritance required).
    ///
    /// Same method signature (name, return type, and parameters).
    ///
    /// Happens at runtime (aka runtime polymorphism).
    ///
    /// Access level can’t be more restrictive than the overridden method.
    ///
    /// @Override annotation is often used for clarity.

    class Animal {
        void sound() {
            System.out.println("Some sound");
        }
    }

    class Dog extends Animal {
        @Override
        void sound() {
            System.out.println("Bark");
        }
    }


    /// DIFFERENCE

    /// Feature	                          Method Overloading	                                 Method Overriding
    /// Class	                          Same class	                                          Subclass and superclass
    /// Parameters	                      Must be different	                                  Must be same
    /// Return Type	                      Can be different	                                  Must be same or covariant
    /// Access Modifier	                  Can be anything	                                  Cannot be more restrictive
    /// Polymorphism Type	              Compile-time	                                      Runtime
    /// Inheritance Needed	                ❌ No	                                          ✅ Yes






}
