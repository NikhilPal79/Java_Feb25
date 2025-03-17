package FEB15;

import java.util.Scanner;

public class SWITCH_CLCLTR {
    public static void main(String[] args) {

        System.out.println("****************");
        System.out.println("WELCOME TO MY CALCULATOR");
        System.out.println("****************");

        System.out.println("1. addition");
        System.out.println("2. subtraction");
        System.out.println("3. multiply");
        System.out.println("4. division");
        System.out.println("5. modulus");
        System.out.println("0. exit");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number");
        int n = scanner.nextInt();

        int input = n;
        switch (input) {
            case 1:
                int x= 10; // value of x & y is  fixed
                int y =20;
                int sum = x+y;
                System.out.println("sum of x and y" + " " + sum);
                break;
            case 2:
                int a=10;
                int b = 20;
                int sub= b-a;
                System.out.println("sub of a and b" +" " + sub);
                break;
            case 3:
                int l = 3;
                int m = 5;
                int multi = l * m;
                System.out.println("multi of l and m "+" "+ multi);
                break;
            case 4:
                int r =25;
                int t = 2;
                int div = r / t;
                System.out.println("div of r and t" + " " + div );
                break;
            case 5:
                int p = 8;
                int q = 4;
                int mod = p % q;
                System.out.println("mod of p and q" + " " +mod);
                break;
            case 0:
                System.out.println("exit");


        }


    }
}
