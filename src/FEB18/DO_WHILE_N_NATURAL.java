package FEB18;

import java.util.Scanner;

public class DO_WHILE_N_NATURAL {
    public static void main(String[] args) {
        // print out the n-natural numbers

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the range");
        int n = scanner.nextInt();
        int x = 0;

        do{
            System.out.println(x);
            x++;
        }while(x<=n);

    }
}
