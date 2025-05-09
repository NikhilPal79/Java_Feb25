package InterviewQuestions;

public class StringVSStringBuilderVSStringBuffer {
    public static void main(String[] args) {

    }

    ///  String

    //Immutable → Once created, it cannot be changed.
    //Every modification (like concatenation) creates a new object in memory.
    //Thread-safe by default due to immutability


    // String str = "Hello";
    // str = str + " World";  // Creates a new String object

    /// StringBuilder

    // Mutable → You can modify the content without creating a new object.
    // Not thread-safe → No synchronization.
    // Faster than StringBuffer for single-threaded operations.

    // StringBuilder sb = new StringBuilder("Hello");
    // sb.append(" World");  // Modifies the same object
    // System.out.println(sb); // Output: Hello World


    /// StringBuffer

    // Mutable
    // Thread-safe → Synchronized methods.
    // Slightly slower than StringBuilder because of the overhead of synchronization

    // StringBuffer sbf = new StringBuffer("Hello");
    // sbf.append(" World");
    // System.out.println(sbf); // Output: Hello World

    /// Comparison Summary:
    ///
    /// Feature	               String	                     StringBuilder	                            StringBuffer
    /// Mutable?	           ❌ No	                     ✅ Yes	                                    ✅ Yes
    /// Thread-safe?	       ❌ No	                     ❌ No	                                    ✅ Yes
    /// Performance	           Slowest	                     Fastest (single thread)	                Slower (thread-safe)
    /// Use case	   When string won’t change often	     When string changes a lot in one thread    When string changes in multiple threads


}
