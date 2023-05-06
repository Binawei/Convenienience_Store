package Week_000_Task;

public class Manager extends Staff{
    public Manager(String name, String gender, String phone_number, double salary, int id) {
        super(name, gender, phone_number, salary, id);
    }

    public void Hire_Cashier(Manager manager,Cashier cashier)
    {
        System.out.println(manager.getName()+ " Hires " + cashier.getName());
    }
    public void Fire_Cashier(Manager manager, Cashier cashier)
    {
        System.out.println(manager.getName() + " Fires "+ cashier.getName());
    }
}
