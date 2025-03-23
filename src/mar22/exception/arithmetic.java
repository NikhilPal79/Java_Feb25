package mar22.exception;

import java.util.Scanner;

public class arithmetic {
    public static void main(String[] args) {


        try{


        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the first number ");
        int x = scanner.nextInt();

        System.out.println("enter the second number ");
        int y = scanner.nextInt();

        int result1 = x % y;


        System.out.println(result1);
            System.out.println("print in line 23");


        } catch (ArithmeticException e) {
            e.printStackTrace();
        }finally {
            System.out.println("Executed always ");
        }
    }

}

