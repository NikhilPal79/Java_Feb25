package FEB18;

import java.util.Scanner;

public class WHILE_ODD {
    public static void main(String[] args) {

        // print out the sum of n-odd numbers

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the range ");
        int n = scanner.nextInt();


        int x = 1;

        while(x <= n){

            System.out.println(x);
            x = x + 2;

        }

    }

}
