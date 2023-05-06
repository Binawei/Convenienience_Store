package Week_000_Task;

public class Staff extends People{
    double Salary;
    int Id;

    public Staff(String name, String gender, String phone_number, double salary, int id) {
        super(name, gender, phone_number);
        Salary = salary;
        Id = id;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }
}
