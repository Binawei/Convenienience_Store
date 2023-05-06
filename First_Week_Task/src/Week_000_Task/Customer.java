package Week_000_Task;

public class Customer extends People{
    public Customer(String name, String gender, String phone_number) {
        super(name, gender, phone_number);
    }

    public void Buys_Product(Customer customer, Product product)
    {
        System.out.println(customer.getName()+ " Buys "+ product.getStock() + " " + product.getName() + " at #"+ product.getPrice());
    }
}
