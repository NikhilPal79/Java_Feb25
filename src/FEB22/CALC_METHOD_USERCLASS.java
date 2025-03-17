package FEB22;

import java.util.Scanner;

public class CALC_METHOD_USERCLASS {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int x;

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

            METHOD_USERCLASS methodUserclass = new METHOD_USERCLASS();


            switch (x) {
                case 1:
                    methodUserclass.sum();
                    break;

                case 2:
                    methodUserclass.sub();

                    break;

                case 3:
                    methodUserclass.multi();
                    break;

                case 4:
                    methodUserclass.div();

                    break;

                case 5:
                    methodUserclass.mod();

                    break;

                case 0:
                    System.out.println("exit");


            }
            if (x != 0) {

                System.out.println("do you want to continue");

                System.out.println("press y");
                System.out.println("press n");

                char p = scanner.next().charAt(0);

                if (p == 'n' || p == 'N') {

                    x = 0;
                    System.out.println("exit");

                }

            }
        } while (x != 0);

    }
}
