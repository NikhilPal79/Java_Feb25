package mar22.exception;

import java.util.Scanner;

public class arithmatic2 {
    public static void main(String[] args) {

        try{

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the 1st number ");
        int a = scanner.nextInt();

        System.out.println("enter the 2nd number ");
        int b = scanner.nextInt();

        int result2 = a / b ;
        }

        catch ( ArithmeticException e ){
            e.printStackTrace();
        }finally {
            System.out.println("Executed always");
        }


    }
}
