package Payment_System;

public class Salaried_Employee extends Employee {
    private String Name;
    private Integer Acct_Number;
    protected Double Gross_Wage;

    public Salaried_Employee(String name, Integer acct_Number, Double gross_Wage) {
        super(name, acct_Number, gross_Wage);
    }

    @Override
    protected void Give_bonus(Double percentage) {
        current_Bonus += grossWage * (percentage/100.0);
    }
/*
    public void Give_Bonus(Double percentage)
    {
        current_Bonus += grossWage * (percentage/100.0);
    }
 */

    public Double GrossPayment() {
        return Gross_Wage + DoCurrentBonus();
    }
}
