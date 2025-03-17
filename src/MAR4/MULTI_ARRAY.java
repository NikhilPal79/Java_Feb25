package MAR4;

public class MULTI_ARRAY {
    public static void main(String[] args) {
        /*types of array
1. Single dimension
2. Multi dimension array
         */
               //  0           1           2
//int[] arr = {{10,20,30}, {40,50,60}, {70,80,90}};

int[][] arr = new int[3][3];
arr[0][0] = 10;
arr[0][1] = 20;
arr[0][2] = 30;
arr[1][0] = 40;
arr[1][1] = 50;
arr[1][2] = 60;
arr[2][0] = 70;
arr[2][1] = 80;
arr[2][2] = 90;
        System.out.println(arr[1][2]);/// not a good way to print out the array
        System.out.println();/// just to make space in output
        ///  we can use nested loops
        // for each
        /// SYNTAX
        /*
        for(datatype variable : array ){
        sout (variable)
        }
         */

        ///  FOR 1-D ARRAY
        int[] myArray = {10,20,30,40,50,60};

        ///  for every integer element in given array printout the element

        for (int element : myArray){
            System.out.println(element); /// element can be any variable

        }
        System.out.println(); /// to make space

        ///  FOR 2-D ARRAY
        arr[0][0] = 10;
        arr[0][1] = 20;
        arr[0][2] = 30;
        arr[1][0] = 40;
        arr[1][1] = 50;
        arr[1][2] = 60;
        arr[2][0] = 70;
        arr[2][1] = 80;
        arr[2][2] = 90;

        /// for every array_element in given array printout the array

        for (int[] element : arr){
            for (int numbers : element ){     ///  inside array k elements ko numbers bol rhe hai
                System.out.println( numbers );

            }
        }
        System.out.println();

        ///  CREATING 2*3 ARRAY

        int[][] arr2 = new int[2][3];
        arr2[0][0]=10;
        arr2[0][1]=20;
        arr2[0][2]=30;
        arr2[1][0]=40;
        arr2[1][1]=50;
        arr2[1][2]=60;

        /// using nested loop
        for (int[] x :arr2){
            for (int y : x  ){
                System.out.println(y );

            }
        }

    }
}
