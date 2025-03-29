package mar25;

public class Class {


    /// INTERVIEW QUESTION = DIFF BETWEEN THE FINAL, FINALLY AND FINALIZE() KEYWORD ?

    /// INNER CLASS AND NESTED CLASS

    //When a class defined inside another class. It used as Encapsulation.

    /*
    Local Inner class
    Member Inner class
    Static Inner class - V.Imp
    Anonymous Inner class - V.Imp

     */

    /// Static??

    // In Java, the static keyword is used to indicate that a method, variable, block, or nested class belongs to the class itself
    // rather than instances of the class. This means:

    // 1. A static member can be accessed without creating an object of the class.
    // 2. A static member is shared among all instances of the class.

    //variable
    //method
    //class
    //block


    /// Anonymous Inner class - class without name.
    // We use anonymous class to implement interface with one or two method and
    // we don't want to create separate class. -- By using Anonymous class we can also implement Abstract Class. --
    // Created by new keyword following Interface/class name. -- Java 8 Lambda - does not have name -- Lambda - AWS - serverless server

    /// Note : We can create Inner class in Anonymous class but problem is that, when try to access the members of Inner class we need to create object of inner class (either by Local inner class method/ Static Inner Class), but we don't have Outer class name as Outer class is Anonymous. So we can create Inner class in method of Anonymous class.

    //We can create the class inside method as well


}
