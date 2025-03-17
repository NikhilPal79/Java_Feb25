package FEB22;


import java.util.Scanner;

public class ArithmeticDemo {

    // CREATING METHODS OF ADD, SUB, MULTI, DIV, MOD,

    public int sum(int a, int b) {
        Scanner scanner = new Scanner(System.in);
        return a + b;                                       // DONT USE SOUT HERE, ONLY RETURN
    }
    public int sub(int a, int b) {
        Scanner scanner = new Scanner(System.in);
        return a - b;
    }
    public int multi(int a, int b) {
        Scanner scanner = new Scanner(System.in);
        return a * b;
    }
    public int div(int a, int b) {
        Scanner scanner = new Scanner(System.in);
        return a / b;
    }
    public int mod(int a, int b) {
        Scanner scanner = new Scanner(System.in);
        return a % b;
    }


    public static void main(String[] args) {
        // CALLING 5 METHODS
        // TO CALL METHODS WE NEED TO CREATE OBJECT
        // CREATING OBJECTS

        ArithmeticDemo arithmeticDemo = new ArithmeticDemo(); //=====> object
        System.out.println(arithmeticDemo.sum(10, 20));

        System.out.println(arithmeticDemo.sub(80, 20));

        System.out.println(arithmeticDemo.multi(20, 20));

        System.out.println(arithmeticDemo.div(50, 10));

        System.out.println(arithmeticDemo.mod(20, 30));


    }
}
