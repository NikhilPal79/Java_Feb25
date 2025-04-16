package InterviewQuestions;

public class AbstractClasses {
    ///  ABSTRACT CLASSES

    /// An abstract class is a class that cannot be instantiated and may contain abstract methods (methods without a body) and concrete methods (with implementation).

    /// ✅ Key Points:

    /// Declared with the abstract keyword.
    /// Can contain abstract as well as non-abstract methods.
    /// Must be extended by a subclass.
    /// If a class has at least one abstract method, the class must be abstract.


    abstract class Animal {
        abstract void sound();  // Abstract method

        void eat() {            // Concrete method
            System.out.println("Eating...");
        }
    }

    class Dog extends Animal {
        void sound() {
            System.out.println("Bark");
        }
    }

    /*public class Main {
        public static void main(String[] args) {
            Dog d = new Dog();
            d.sound(); // Bark
            d.eat();   // Eating...
        }
    }*/





}
