package FEB20;

import java.util.Scanner;

public class CAL_WITH_LOOPS {
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


            switch (x) {
                case 1:
                    System.out.println("enter the value of a");     // value of x & y is given by user
                    int a = scanner.nextInt();
                    System.out.println("enter the value of b");
                    int b = scanner.nextInt();

                    int c = a + b;
                    System.out.println("sum of a and b" + " " + c);

                    break;

                case 2:
                    System.out.println("enter the value of d");
                    int d = scanner.nextInt();
                    System.out.println("enter the value of e");
                    int e = scanner.nextInt();

                    int f = d - e;
                    System.out.println("sub  of d and e" + " " + f);
                    break;

                case 3:

                    System.out.println("enter the value of g");
                    int g = scanner.nextInt();

                    System.out.println("enter the value of h");
                    int h = scanner.nextInt();

                    int i = g * h;
                    System.out.println("multi of g and h" + " " + i);
                    break;

                case 4:
                    System.out.println("enter the value of j");
                    int j = scanner.nextInt();

                    System.out.println("enter the value of k");
                    int k = scanner.nextInt();

                    int l = j / k;
                    System.out.println("div of k and l " + " " + l);
                    break;

                case 5:
                    System.out.println("enter the value of m");
                    int m = scanner.nextInt();

                    System.out.println("enter the value of n");
                    int n = scanner.nextInt();

                    int o = m % n;
                    System.out.println("mod of m and n " + " " + o);
                    break;
                case 0:
                    System.out.println("exit");


            }
            if(x != 0){

                System.out.println("do you want to continue");

                System.out.println("press y or Y");
                System.out.println("press n or N");

                char p = scanner.next().charAt(0);

                if(p == 'n' || p == 'N'){

                    x = 0;
                    System.out.println("exit");

                }

              }
            }while( x != 0 );

        }

    }
