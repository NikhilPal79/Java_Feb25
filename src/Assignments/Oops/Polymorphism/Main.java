package Assignments.Oops.Polymorphism;

public class Main {
    public static void main(String[] args) {

        FullTime fullTime = new FullTime(5072,"NIKHIL",120,30);
        fullTime.EmployeeInfo();
        System.out.println("Monthly Pay " + fullTime.calculatePay() + " Canadian Dollars ");
        System.out.println();




        PartTime partTime = new PartTime(2122,"KARAN",80,22);
        partTime.EmployeeInfo();
        System.out.println("Monthly Pay " + partTime.calculatePay() + " Canadian Dollars ");

    }
}
