package mar29.ImmutableClass1;

public class EmpMain {
    public static void main(String[] args) {

        Employee employee = new Employee(5072, "nikhil", "nikhilchpr7@gmail.com");
        System.out.println(employee.getId());
        System.out.println(employee);
    }
}
