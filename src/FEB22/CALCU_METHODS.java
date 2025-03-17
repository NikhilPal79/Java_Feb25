package FEB22;

import java.util.Scanner;

public class CALCU_METHODS {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int x ;

        do {

            System.out.println("****************");
            System.out.println("WELCOME TO MY CALCULATOR");
            System.out.println("****************");

            System.out.println("1. addition");
            System.out.println("2. subtraction");
            System.out.println("3. multiply");
            System.out.println("4. division");
            System.out.println("5. modulus");
            System.out.println("0. exit");


            System.out.println("enter the number ");
            x = scanner.nextInt();


            ArithmeticDemo arithmeticDemo = new ArithmeticDemo();

            switch (x) {
                case 1:
                    System.out.println("enter the first number");
                    int num1 = scanner.nextInt();

                    System.out.println("enter the second number");
                    int num2 = scanner.nextInt();

                    System.out.println(arithmeticDemo.sub(num1, num2));
                    break;

                case 2:
                    System.out.println("enter the first number");
                    int num3 = scanner.nextInt();

                    System.out.println("enter the second number");
                    int num4 = scanner.nextInt();

                    System.out.println(arithmeticDemo.sub(num3, num4));

                    break;

                case 3:
                    System.out.println("enter the first number");
                    int num5 = scanner.nextInt();

                    System.out.println("enter the second number");
                    int num6 = scanner.nextInt();

                    System.out.println(arithmeticDemo.multi(num5, num6));
                    break;

                case 4:
                    System.out.println("enter the first number");
                    int num7 = scanner.nextInt();

                    System.out.println("enter the second number");
                    int num8 = scanner.nextInt();

                    System.out.println(arithmeticDemo.div(num7, num8));

                    break;

                case 5:
                    System.out.println("enter the first number");
                    int num9 = scanner.nextInt();

                    System.out.println("enter the second number");
                    int num10 = scanner.nextInt();

                    System.out.println(arithmeticDemo.mod(num9, num10));

                    break;

                case 0:
                    System.out.println("exit");


            }
            if(x != 0){

                System.out.println("do you want to continue");

                System.out.println("press y");
                System.out.println("press n");

                char p = scanner.next().charAt(0);

                if(p == 'n' || p == 'N'){

                    x = 0;
                    System.out.println("exit");

                }

            }
        }while( x != 0 );

    }


}
