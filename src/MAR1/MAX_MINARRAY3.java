package MAR1;

public class MAX_MINARRAY3 {
    public static void main(String[] args) {

        int arr[] = {10,20,30,40,50,150,96,16,61,661};

        int max = arr[0]; //  assuming first element is the max
        // loop to find the max value
        for (int i = 1; i < arr.length ; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("maximum value of array is " + max);

        int min = arr[0]; // assuming first element is mini
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("minimum value of array is " + min);
    }
}
