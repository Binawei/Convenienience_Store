package Payment_System;

import java.util.concurrent.Callable;

public class Contracting_Companies implements Payee {
    private String name;
    private Integer Account_Number;
    protected Double Current_Balance;

    public Contracting_Companies(String name, Integer account_Number, Double current_Balance) {
        this.name = name;
        this.Account_Number = account_Number;
        Current_Balance = 0.0;
    }
    public String name()
    {
        return name;
    }
    public Double GrossPayment()
    {
        return DoPayment();
    }
    private Double DoPayment()
    {
        Double balance = Current_Balance;
        Current_Balance = 0.0;
        return  balance;
    }
    public Integer Account_Number()
    {
        return Account_Number;
    }
    public void PayForServices(Double amount)
    {
        Current_Balance += amount;
    }
}
