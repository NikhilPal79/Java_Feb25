package FEB18;

import java.util.Scanner;

public class DO_WHILE_EVEN {
    public static void main(String[] args) {
        // print out the n-even numbers
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the range");
        int n = scanner.nextInt();

        int x = 2;

        do{
            System.out.println(x);
            x = x + 2;
        }while(x<=n);
    }
}
