package Payment_System;
public class Commissioned_Employee extends Employee {
    private Double grossCommission = 0.0;
    private static final Double bonusMultiplier = 1.5;


    public Commissioned_Employee(String name, Integer bankAccount, Double grossWage) {
        super(name, bankAccount, grossWage);
    }
    public Double GrossPayment(){
        return grossWage + doCurrentCommission() + DoCurrentBonus();
    }
    public void Give_bonus(Double percentage)
    {
        current_Bonus += grossWage * (percentage/100.0) * bonusMultiplier;
    }
    public Double doCurrentCommission() {
        Double commission = grossCommission;
        grossCommission = 0.0;
        return commission;
    }
    public void give_commission(Double amount)
    {
        grossCommission += amount;
    }
}
