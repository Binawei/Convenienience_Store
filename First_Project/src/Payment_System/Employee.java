package Payment_System;

public abstract class Employee implements Payee {
    private String name;
    private Integer bankAccount;
    protected Double grossWage;
    protected Double current_Bonus;

    public Employee(String name, Integer bankAccount, Double grossWage) {
        this.name = name;
        this.bankAccount = bankAccount;
        this.grossWage = grossWage;
        current_Bonus = 0.0;
    }
    protected  abstract void Give_bonus(Double percentage);
    protected Double DoCurrentBonus(){
        Double bonus = current_Bonus;
        current_Bonus = 0.0;
        return bonus;

    }

    public String name() {

        return name;
    }

    public Integer Account_Number() {

        return bankAccount;
    }
}
