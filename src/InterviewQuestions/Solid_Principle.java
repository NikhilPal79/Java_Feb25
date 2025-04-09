package InterviewQuestions;

public class Solid_Principle {



    /// S ==> Single Responsibility principle
    /// O ==> Open/Closed principle
    /// L ==> Liskov Substitution principle
    /// I ==> Interface Segregation principle
    /// D ==> Dependency Inversion principle


    /// S ==> Single Responsibility principle
    // A class should have only one reason to change, meaning it should have only one responsibility or job.

    /// O ==> Open/Closed principle
    // Software entities (classes, modules, functions) should be open for extension but closed for modification.
    // This means you can add new functionality without altering existing code.

    /// L ==> Liskov Substitution principle
    // Objects of a superclass should be replaceable with objects of its subclasses without affecting the correctness of the program.
    // The derived class must be able to be used wherever the base class is used.

    /// I ==> Interface Segregation principle
    // No client should be forced to depend on methods it does not use.
    // In other words, create specific, smaller interfaces instead of one large, general-purpose interface.

    /// D ==> Dependency Inversion principle
    // High-level modules should not depend on low-level modules. Both should depend on abstractions (interfaces).
    // Also, abstractions should not depend on details; details should depend on abstractions.
}
