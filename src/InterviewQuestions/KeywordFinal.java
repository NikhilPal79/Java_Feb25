package InterviewQuestions;

public class KeywordFinal {


    /// The final keyword in Java is used to restrict modification.
    ///It can be applied to variables, methods, and classes, each with different effects:

    ///  1. FINAL VARIABLE

    /// Once assigned, its value cannot be changed (constant).
    /// Must be initialized when declared or in the constructor (for instance variables).

    //✅ Use case: To create constants (e.g., final double PI = 3.14;)
    final int AGE = 25;
// AGE = 30; ❌ Error: cannot assign a value to final variable

    /// 2. FINAL METHOD

    /// A final method cannot be overridden by subclasses.

    class Vehicle {
        public final void start() {
            System.out.println("Vehicle starts");
        }
    }

    class Car extends Vehicle {
        // public void start() {} ❌ Error: Cannot override the final method
    }
    //✅ Use case:When you want to lock behavior in a method.


    /// 3. FINAL CLASS

    /// A final class cannot be extended (inherited).

    final class Calculator {
        public int add(int a, int b) {
            return a + b;
        }
    }

// class AdvancedCalc extends Calculator {} ❌ Error

    // ✅ Use case: To prevent inheritance for security or design reasons



}
