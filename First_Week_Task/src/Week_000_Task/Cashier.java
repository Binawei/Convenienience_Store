package Week_000_Task;

public class Cashier extends Staff{
    public Cashier(String name, String gender, String phone_number, double salary, int id) {
        super(name, gender, phone_number, salary, id);
    }

    public void Sell_Product(Cashier cashier, Product product, Customer customer)
    {
        System.out.println(cashier.getName() + " Sells  "+ product.getName() + " to  "+ customer.getName());
    }
    public void Dispense_Receipt(Cashier cashier, Product product, Customer customer)
    {
        System.out.println(cashier.getName()+" Issues Receipt of "+ product.getStock()+ " " +product.getName() + " to " + customer.getName());
    }

}
