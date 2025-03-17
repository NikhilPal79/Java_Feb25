package MAR1;

public class REVRSEARRAY2 {
    // ASSIGNMENT

    // MIN/MAX OF ARRAY
    // REVERSE THE ARRAY
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        int n = arr.length;
        for (int i = 0; i < arr.length / 2; i++) {
            /*
            int temp = x
            int x = int y
            int y = 20
             */
            int temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;

        }
        // print the reverse array

        System.out.println("reverse array");
        for (int num : arr) {

            System.out.print(num + " ");

        }


    }
}

