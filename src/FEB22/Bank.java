package FEB22;

import java.sql.SQLOutput;

public class Bank {
    // member variables,

    double balance;
    int number;

    // creating 3 methods

    public double currentBalance(){                                             // METHOD === CURRENT BALANCE
        return balance;
    }

    public double deposit(double amount){                                       // METHOD === DEPOSIT
         balance = balance + amount;
         return balance;
    }

    public double withdraw(double amount){                                      // METHOD === WITHDRAW
        // PUT A CONDITION SO THAT WE CAN NOT WITHDRAW MORE MONEY THAN EXISTING ONE
        if(amount > balance ){
            System.out.println("INSUFFICIENT BALANCE " + "your balance :" + balance);
        }else if(amount > 0 ){
            balance -= amount;
        }else {
            System.out.println("withdrawal amount must be greater than zero");
        }
        return balance;
    }

    /// adding constructor

    public Bank(double balance, int number) {
        this.balance = balance;
        this.number = number;
    }

    public static void main(String[] args) {
        // creating object of bank class

        Bank bank = new Bank(2000,498897);


        // current balance
        double myCurrentBalance = bank.currentBalance();   // GIVING IT TO VARIABLE (TYPE.V AT THE END OF bank.currentBalance()-HERE)
        System.out.println("your current balance is " + myCurrentBalance);


        // deposit some amount
        double balanceAfterDeposit = bank.deposit(500);
        System.out.println("your current balance after deposit is "+ balanceAfterDeposit);


        // withdraw some amount and print balance after
        double balanceAfterWithdraw = bank.withdraw(10000);
        System.out.println("your current balance after withdrawn is  " + balanceAfterWithdraw);

        // NOTE ======> HOW TO CREATE VARIABLE (IN LINE 40)

        // NOTE ======> ADDING CONDITION IN METHOD

        // NOTE ======> REMEMBER YOU CAN PASS PARAMETERS IN METHODS
    }

}
