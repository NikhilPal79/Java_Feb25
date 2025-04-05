package FEB18;

import java.util.Scanner;

public class WHILE_SUM {
    public static void main(String[] args) {

        // print out the sum of n- natural numbers


        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the number");
        int n = scanner.nextInt();


        int sum = 0;
        int x = 1;

        while(x <= n){

            sum = sum + x;
            x++;

        }
        System.out.println("the sum of n numbers " + " " + sum);
    }
}
