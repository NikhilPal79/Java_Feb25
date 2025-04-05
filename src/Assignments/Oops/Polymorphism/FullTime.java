package Assignments.Oops.Polymorphism;

public class FullTime extends Employee{

    private  int numberOfHours;
    private  double hourlyWage;


    public FullTime(int id, String name, int numberOfHours, double hourlyWage) {
        super(id, name);
        this.numberOfHours = numberOfHours;
        this.hourlyWage = hourlyWage;
    }

    @Override
    public void EmployeeInfo() {
        super.EmployeeInfo();
    }

    @Override
    public double calculatePay() {
        return numberOfHours*hourlyWage;
    }
}
