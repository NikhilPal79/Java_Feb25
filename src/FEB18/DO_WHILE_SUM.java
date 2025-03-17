package FEB18;

import java.util.Scanner;

public class DO_WHILE_SUM {
    public static void main(String[] args) {

        // PRINT OUT SUM OF THE 1-10 NATURAL NUMBERS

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the number");
        int n = scanner.nextInt();

        int sum = 0;
        int x = 1;
        do{
            sum = sum + x;
            x++;
        }while(x <= n);
        System.out.println("sum of n-even numbers" + " " + sum);
    }

}
