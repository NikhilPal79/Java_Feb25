package mar22.exception;

import java.util.Scanner;

public class LicenceAuthority {


    /// creating method

    public void carDrive(){
        checkValidAge();
    }

    public void checkValidAge() /*throws InvalidAge */{
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your age ");

        int age = scanner.nextInt();

        if(age < 18){
            throw new InvalidAge("not valid for driving");
        }else {
            System.out.println("valid for driving");
        }
    }
}
