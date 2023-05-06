package Payment_System;

import java.util.ArrayList;
import java.util.List;

public class Pay_System {
    private List<Payee> payees;

    public Pay_System() {
        payees = new ArrayList<>();
    }

    public void add_Payee(Payee payee) {
        if (!payees.contains(payee)) {
            payees.add(payee);
        }
    }

    public void Process_Payments() {
        for (Payee payee : payees) {
            Double gross_payment = payee.GrossPayment();
            System.out.println("Paying to " + payee.name());
            System.out.println("Gross : " + gross_payment);
            System.out.println("Transferred to Account :" + payee.Account_Number());
        }
    }
}
