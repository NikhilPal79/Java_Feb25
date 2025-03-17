package FEB18;

import java.util.Scanner;

public class DO_WHILE_SUM_ODD {
    public static void main(String[] args) {
        //print out the n-odd numbers
        Scanner scanner = new Scanner(System.in);

        System.out.println(" enter the range ");
        int n = scanner.nextInt();

        int sum = 0;
        int x = 1;
        do{
            sum = sum + x;
            x = x + 2;
        }while(x<=n);
        System.out.println("sum of n-odd numbers " + " " + sum);
    }
}
