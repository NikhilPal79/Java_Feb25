package apr1;

public class Read {

    //Recap
    /// Wrapper classes Autoboxing unboxing

    /// Immutable classes :
    /// we can not modify it

    /// all the wrapper classes Integer Double

    /// String are immutable ? why Strings are immutable ?

    /// How to make a class immutable
    /// class final all the fields should be private and final no setter methods. equals and hashcode implemented

    /// Strings

    /// string constant pool

    /// Literal - String s = "Pragra"; // where? SCP(String Constant Pool) inside the heap
    /// New keyword - String s1 = new String("Pragra"); // inside the heap memory but outside scp.
    /// Character array. sequence of characters.

    /// Intro to Collections Equals and Hashcode

    /// Generic Classes
    /// type safety and flexibility to work with any type

    /// Maven - Project management tool/ Build tool
    /// mvn clean install mvn package mvn test

    /// Lombok
    /// reduce the boilerplate code. @Annotations.

            /// File Handling : Skip-apr27.apr29.Optional

    ///@RequiredArgConstructor

    ///Collection - 60% interview




    ///List - ArrayList - LinkedList


            ///ArrayList


    ///internally it's backed by Array its dynamic in nature.

    /// elements are stored in order of insertion it also allows duplicate elements null is also supported.

    /// int[] arr = new int[5]; // size = 5

    /// Internal Implementation of arraylist


// Java 7 /* List list = new ArrayList<>(); a default array of size 10 is created // threashold // Load Factor. : 75%

    /// need to create a new array
    /// of size

  ///    10 + 10/2 + 1     = 16
  ///     n + n/2 + 1
          //  new array of size 16 is created.

            // if we know the size = array
    // if we don't know the size , it's going to grow dynamically = arraylist


// Java 8

            //  List<Integer> list = new ArrayList<>();
    /*

   /// ==================> Lazy Initialization of arrayList
    array of size 0 is created.
    when you insert first element
    then array of size 10 will be created.

     */
            ///LinkedList
/// 2 TYPES OF LINKEDLIST

    /// Singly linkedlist ====>
    /// doubly linkedlist ====>

///10 elements 100 1000 1M

/// for search operations ArrayList is preferred? with the index

    // FOR SEARCH OPERATION WE USE ==> ARRAYLIST

/// for insertion linkedList ArrayList

/// if we have to add element at first/first current in list which one we should use arraylist or linked list - 1M elements
    // WE CHOOSE LINKED LIST

/// 0 1 2.... 1M

    ///Search /read operations 10 - 1M - ArrayList manipulation/ insertions or deletions - LinkedList
}
