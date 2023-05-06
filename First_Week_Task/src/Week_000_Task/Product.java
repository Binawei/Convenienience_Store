package Week_000_Task;

public class Product extends BaseClass{
    private double price;
    private long stock;

    public Product(String name, long stock, double price) {
        super(name);
        this.stock = stock;
        this.price = price;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public long getStock() {
        return stock;
    }

    public void setStock(long stock) {
        this.stock = stock;
    }
}
