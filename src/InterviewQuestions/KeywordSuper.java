package InterviewQuestions;

public class KeywordSuper {

    ///  SUPER

    /// The **super** keyword in Java is used to refer to the immediate parent class of the current object.
    /// It has several important uses:


    /// ✅ 1. Access Parent Class Constructor

    /*class Parent {
        Parent() {
            System.out.println("Parent constructor");
        }
    }

    class Child extends Parent {
        Child() {
            super(); // calls Parent class constructor
            System.out.println("Child constructor");
        }
    }*/

    /// ✅ 2. Access Parent Class Methods

    /*class Parent {
        void show() {
            System.out.println("Parent show()");
        }
    }

    class Child extends Parent {
        void show() {
            super.show(); // calls Parent's show()
            System.out.println("Child show()");
        }
    }*/

    /// ✅ 3. Access Parent Class Variables

    /*class Parent {
        int x = 10;
    }

    class Child extends Parent {
        int x = 20;

        void display() {
            System.out.println("Child x = " + x);
            System.out.println("Parent x = " + super.x);
        }
    }*/



}
