package FEB18;

import java.util.Scanner;

public class WHILE_SUM_EVEN {
    public static void main(String[] args) {
        // print out the sum of n-even numbers

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the range");
        int n = scanner.nextInt();

        int sum = 0;
        int x = 2;

        while(x <= n){

            sum = sum + x;
            x = x + 2;

        }
        System.out.println("sum of n-even numbers " + " " + sum);
    }
}
