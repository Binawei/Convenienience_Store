package Week_000_Task;

public class Convenience_Store {
    public static void main(String[] args) {
        Product Biscuit = new Product("Cabin Biscuit", 56, 300.89);
        Customer Customer1 = new Customer("Moris","Female", "081116749");
        Manager manager = new Manager("Binawei", "Male", "0902345", 56800.09, 123);
        Cashier cashier =new Cashier("Mary", "Female", "08123487", 50300.87, 003);

        cashier.Sell_Product(cashier,Biscuit, Customer1);
        manager.Hire_Cashier(manager, cashier);
        manager.Fire_Cashier(manager,cashier);
        cashier.Dispense_Receipt(cashier,Biscuit, Customer1);
        Customer1.Buys_Product(Customer1,Biscuit);

    }
}
