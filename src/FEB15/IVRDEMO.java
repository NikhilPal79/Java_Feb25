package FEB15;

import java.util.Scanner;

public class IVRDEMO {
    public static void main(String[] args) {


        System.out.println("*****************");
        System.out.println("WELCOME TO ROGERS");
        System.out.println("*****************");


        System.out.println("1. ENGLISH");
        System.out.println("2. FRENCH ");

        Scanner scanner = new Scanner(System.in);

        System.out.println("SELECT THE LANGUAGE ");
        int language = scanner.nextInt();

        if(language == 1) {
            System.out.println("1. BILLING");
            System.out.println("2. TECHNICAL SUPPORT ");
            System.out.println("3. SALES ");
            System.out.println("4. SPEAK TO AN AGENT ");
            System.out.println("5. GO BACK TO MAIN MENU");
            System.out.println("0. EXIT");
        }else {
            System.out.println("WELCOME TO FRENCH SECTION");
        }

        int option = scanner.nextInt();


        switch (option){

            case 1:
                System.out.println("YOU SELECTED: BILL");
                System.out.println("PRESS 1 TO PAY BILLS ");
                System.out.println("PRESS 2 FOR OVER CHARGE");

                int billoption = scanner.nextInt();

                if(billoption == 1){
                    System.out.println("REDIRECTING THE PAYMENT");

                }else if(billoption ==2){
                    System.out.println("FETCHING BILL DETAILS");

                }else {
                    System.out.println("INVALID SELECTION ");
                }
                break;

            case 2:
                System.out.println(" YOU SELECTED: TECHNICAL SUPPORT");
                System.out.println(" PRESS 1 FOR INTERNET ");
                System.out.println(" PRESS 2 FOR MOBILE  ");
                System.out.println(" PRESS 3 FOR TV ");

                int technicalsupport = scanner.nextInt();

                if (technicalsupport == 1){
                    System.out.println(" WELCOME TO INTERNET DEPARTMENT ");

                }else if(technicalsupport == 2){
                    System.out.println(" WELCOME TO MOBILE DEPARTMENT ");

                }else if( technicalsupport == 3){
                    System.out.println("WELCOME TO TV DEPARTMENT ");

                }else {
                    System.out.println("INVALID SECTION");
                }

                break;

            case 3:
                System.out.println("YOU SELECTED : SALES ");
                System.out.println("PRESS 1 FOR  EXISTING CUSTOMERS ");
                System.out.println("PRESS 2 FOR NEW CUSTOMERS ");

                int sales = scanner.nextInt();

                if(sales == 1 ){
                    System.out.println("EXISTING PLAN");
                }else if( sales ==2){
                    System.out.println("CURRENT PROMOTION GOING ON");
                }else {
                    System.out.println(" INVALID SELECTION");
                }

                break;

            case 4:
                System.out.println("YOU SELECT: SPEAK TO AN AGENT");
                System.out.println("HEY, MY NAME IS NICK, HOW CAN I HELP YOU");
                break;

            case 5:
                System.out.println("GO BACK TO MAIN MENU");

                break;
                
            case 6:
                System.out.println("EXIT");
                break;

        }



        }
    }

