package FEB18;

import java.util.Scanner;

public class WHILE_EVEN {
    public static void main(String[] args) {

        // PRINT OUT THE  N- EVEN NUMBERS

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the even number"); // printing the user value
        int n = scanner.nextInt();

        int x = 2;

        while(x<=n){
            System.out.println(x);
            x = x +2;

        }





    }
}
