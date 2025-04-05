package FEB18;

import java.util.Scanner;

public class WHILE_SUM_ODD {
    public static void main(String[] args) {
        // print out the n-odd numbers

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the range");
        int n = scanner.nextInt();

        int sum = 0;
        int x = 1;

        while(x <= n){
            sum = sum + x;
            x = x + 2;

        }
        System.out.println("sum of n-odd number " + " "+ sum );
    }
}
