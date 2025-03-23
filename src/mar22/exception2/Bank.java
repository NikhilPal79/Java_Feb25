package mar22.exception2;

import java.util.Scanner;

public class Bank {

    // creating bank class methods

    int balance;
    int deposit;
    int withdraw;
    Scanner scanner = new Scanner(System.in);

    public void balance(){

        System.out.println("enter your balance");
        int balance = scanner.nextInt();
    }

    public  void deposit(){

        System.out.println("enter your deposit");
        int deposit = scanner.nextInt();
    }


    public void withdraw() throws InvalidBalanceException{

        System.out.println("enter your withdraw");
        int withdraw = scanner.nextInt();


        if (withdraw > balance ){
            throw new InvalidBalanceException("insufficient balance ");
        }else{
            System.out.println("sufficient balance");
        }
    }

}


