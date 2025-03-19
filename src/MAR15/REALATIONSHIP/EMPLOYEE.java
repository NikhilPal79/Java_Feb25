package MAR15.REALATIONSHIP;

public class EMPLOYEE {
    private int id;
    private NAME name;
    private String email;
    private ADDRESS address;      ///
    private double salary;


    ///  creating constructor

    public EMPLOYEE(int id, NAME name, String email, ADDRESS address, double salary) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.address = address;
        this.salary = salary;
    }

    ///  creating getter and setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public NAME getName() {
        return name;
    }

    public void setName(NAME name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ADDRESS getAddress() {
        return address;
    }

    public void setAddress(ADDRESS address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    ///  creating toString
    @Override
    public String toString() {
        return "EMPLOYEE{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", address=" + address +
                ", salary=" + salary +
                '}';
    }


}
