package apr12;

public class MapRead {
    /// GO TO THE Maven_Feb_2025

    /// INTERVIEW QUESTION ===> WHAT IS HASHMAP, IS IT COMES UNDER COLLECTION ?


    /// Node[key, value, node ]

    // we store the key value and next node itself in node.

    /// linkedList ======> On()
    /// ArrayList =======> On()

    // which On is better ====> ArrayList On is better than LinkedList

    /// **************************      IMPLEMENTATION OF HASHMAP IS     *******************************************

    // HashMap is arraylist of linked list of node and node contains 4 values
    /// ArrayList < LinkedList < Node

    /// Node has 4 values [hashcode, value, key, address of next node ]

    // In the array list there are so many operation going on in the single key-value pair
    // comparison happen in number ie ASCI value and then converted to binary
    // in array list
    // is key value pair has
    /// let's suppose we have 1st entry S1
    // first name ==  yadav   =====> 5 operation to compare the key value pair to second entry
    // last name ==  yadav  =======> 5 operation same
    // email == yadav@email.com ===> 15 operation  same
    // total ===> 25 operation to compare just two entries

    // in arrayList of 1000 there will be 35,000 comparison operations

    ///  HOW TO FIX THE PROBLEMS

    // so the asci value of every element of yadav will be multiplied by Prime Number followed by some arithmetic operation
    // generate the HASHCODE(INTEGER NUMBER)

    // all the tree hashcode of fist name , last name and email will result in single hashcode that will be final hashcode
    // for entry S1

    ///  note ==> hashcode will remain same no matter how many calculation we did, cz arithmetic operation will not change.

    /// Hashcode value supposed to be unique but there is very rare chance we ll get same hashcode value or duplicated value
    /// because every element have specific ASCI value which is limited.


    /// IF WE HAVE TO FIND THE S ENTRY INTO 1000 ENTRY WE HAVE TO COMPARE THE HASHCODE OF S TO HASHCODE OF EVERY ENTRY
    /// RUNNING OPERATION BECOME LESS FROM 35000 TO 1000

    // lets s445 will have the same hashcode then only the physical comparison happening
    /// S445.equalsS

    
}
