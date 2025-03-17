package MAR8;

public class EMPLOYEE {


        int id;
        String name;
        double salary;

    public EMPLOYEE(int id, double salary, String name) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    /*public String toString(){
        return "id : " + id;
    }*/

    @Override
    public String toString() {
        return "EMPLOYEE{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
