package Assignments.Oops.Polymorphism;

public abstract class Employee {

    private int id;
    private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void EmployeeInfo(){
        System.out.println(" id : " + id );
        System.out.println(" name : " + name );
    }

    public abstract double calculatePay();
}
