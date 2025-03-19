package MAR1;

import java.util.Scanner;

public class ARRAY1 {

    /*
    int rollno = 1;
    int rollno = 2;

    to store 100 roll no we need to used array

    ARRAY =====> COLLECTION OF HOMOGENOUS DATA TYPE

    index
    0 = 101
    1 = 102
    2 = 103

    array index starts with 0
    length of a array(0-9) = 10
     */
    public static void main(String[] args) {


        // int[] rollno = {101, 102, 103, 104, 105, 106, 107, 108, 109};

        int[] arr = new int[5];
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the element ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
            
        }
        System.out.println("print the element");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
    }
}
