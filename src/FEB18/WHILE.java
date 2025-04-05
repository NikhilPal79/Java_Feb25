package FEB18;

import java.util.Scanner;

public class WHILE {
    public static void main(String[] args) {

        // print out the n natural numbers

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the number");


        int n = scanner.nextInt();

        int x = 1;

        while(x <=n){

            System.out.println(x);
            x++;
        }

    }
}
