package InterviewQuestions;

public class ArrayListVsLinkedList {

    /// Array ====> you have to specify the size of array ahead of time, and array is not dynamic.

    /// ArrayList ===> An ArrayList stores data in a resizable array, but it is dynamic in nature.



    ///  IMPLEMENTATION ===>
    /// Before Java 8, when an ArrayList was created, an array of default size ten was created internally.


    ///  Now, when an ArrayList is created, an array of size zero is created.
    ///  Only when the first element is inserted does the array size change to ten.
    /// This is called LAZY INITIALIZATION , and it saves a lot of memory.


    /// Before adding an element in ArrayList, its capacity is checked.
    /// If the internal array is full, then a new array of size (n + n/2 +1)  is created .

    // (e.g., if the capacity is ten,
    // then a new array of size 16 will be created). The elements from the old array will be copied to the new array.
    // This increases the capacity of an ArrayList, which is a time-consuming process.


    /// LinkedList ====> it is data structure, and it implements or inherits from the list interface internally.
    //  THERE ARE 2 TYPES OF LINKEDLIST.

    /// SINGLY LINKED LIST ===> its exits in node structure, every node contains two things, 1 element and 2nd address of the next
    /// node and so on forth and every node is connected to each other.


    /// DOUBLY LINKED LIST ===> its exits in node structure, every node contains 3 things, 1 element and 2nd address of the next
    ///  node,3rd address of the previous mode and so on forth and every node is connected to each other.





}
