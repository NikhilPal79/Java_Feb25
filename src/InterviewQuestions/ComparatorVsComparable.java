package InterviewQuestions;

public class ComparatorVsComparable {


    /// COMPARABLE
    /// Used to define natural/default sorting order of objects.
    /// You must implement it inside the class of the objects you're comparing.

    /// ✅ Key Points:
    /// Uses compareTo() method.
    /// Only one sorting logic can be defined.
    /// Modifies the class you're comparing.


    /// COMPARATOR
    /// Used to define custom sorting logic, outside the class.

    /// ✅ Key Points:
    /// Uses compare() method.
    /// Multiple comparison strategies can be written.
    /// Useful when you can't or don’t want to modify the class.


    ///Key Differences

    ///Feature	                               Comparable	                                         Comparator
    ///Package	                                java.lang	                                         java.util
    ///Method	                            compareTo(Object o)	                          compare(Object o1, Object o2)
    ///Sorting Logic	                     Only one (natural order)	                     Multiple (custom logic)
    ///Modifies Class	                          ✅ Yes	                                    ❌ No (separate class)
    ///Usage	                              Collections.sort(list)	                Collections.sort(list, comparator)



}
