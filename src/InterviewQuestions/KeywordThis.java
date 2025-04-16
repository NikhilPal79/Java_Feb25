package InterviewQuestions;

public class KeywordThis {
    /// THIS

    /// The **this** keyword in Java is a reference variable that refers to the current object
    ///(i.e., the object on which the method or constructor is being called).


   /// ✅ 1. Differentiate Between Instance and Local Variables

   // When local variable names (like parameters) are the same as instance variables, this helps distinguish them.


   class Student {
       int id;

       Student(int id) {
           this.id = id;  // 'this.id' is instance variable, 'id' is parameter
       }
   }

   /// ✅ 2. Call Another Constructor in the Same Class

    // You can use this() to call another constructor in the same class (constructor chaining).

   class Book {
       String title;
       double price;

       Book() {
           this("Java Book", 299.99); // calls parameterized constructor
       }

       Book(String title, double price) {
           this.title = title;
           this.price = price;
       }
   }

   /// ✅ 3. Pass Current Object as a Parameter

   class A {
       void show(A obj) {
           System.out.println("Object received");
       }

       void callShow() {
           show(this);  // passing current object
       }
   }


   /// ✅ 4. Return Current Object

    // This is commonly used in method chaining.

   class Person {
       Person setName(String name) {
           // set value
           return this;
       }

       Person setAge(int age) {
           // set value
           return this;
       }
   }


   /// Summary
///this → refers to current object



}
