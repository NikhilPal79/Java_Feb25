package FEB22;

import java.util.Scanner;

public class METHOD_USERCLASS {

    public int sum(int a, int b) {
        return a + b;
    }

    public void sum() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the first number");
        int num1 = scanner.nextInt();

        System.out.println("enter the second number");
        int num2 = scanner.nextInt();

        System.out.println("the sum of 2 number is " + sum(num1, num2));

    }

    public int sub(int a, int b) {
        return a - b;
    }

    public void sub() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the first number");
        int num1 = scanner.nextInt();

        System.out.println("enter the second number");
        int num2 = scanner.nextInt();

        System.out.println("the sub of 2 number is " + sub(num1, num2));

    }

    public int multi(int a, int b) {
        return a * b;
    }

    public void multi() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the first number");
        int num1 = scanner.nextInt();

        System.out.println("enter the second number");
        int num2 = scanner.nextInt();

        System.out.println("the sub of 2 number is " + sub(num1, num2));


    }

    public int div(int a, int b) {
        return a / b;
    }

    public void div() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the first number");
        int num1 = scanner.nextInt();

        System.out.println("enter the second number");
        int num2 = scanner.nextInt();

        System.out.println("the div of 2 number is " + sub(num1, num2));
    }

    public int mod(int a, int b) {
        return a % b;
    }

    public void mod() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the first number");
        int num1 = scanner.nextInt();

        System.out.println("enter the second number");
        int num2 = scanner.nextInt();

        System.out.println("the mod of 2 number is " + sub(num1, num2));
    }
}
