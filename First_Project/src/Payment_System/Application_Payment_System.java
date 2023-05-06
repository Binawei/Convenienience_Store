package Payment_System;

public class Application_Payment_System {
    public static void main(String[] args)
    {
        Pay_System system_pay = new Pay_System();
        Commissioned_Employee John = new Commissioned_Employee("John Smith", 38652456, 6573899.98);
        system_pay.add_Payee(John);
        Commissioned_Employee paulJones = new Commissioned_Employee("Paul Jones", 2222,350.0);
        system_pay.add_Payee(paulJones);
        Commissioned_Employee MiracleShaibu = new Commissioned_Employee("Miracle ", 11123344, 890000.98);
        system_pay.add_Payee(MiracleShaibu);
        Commissioned_Employee EmmanuelUsani = new Commissioned_Employee("Emmanuel Usani", 308752748, 5600000.99);

        Contracting_Companies Bina_G = new Contracting_Companies("Bina_G`S Ventures", 30864523,45600.00);
        system_pay.add_Payee(Bina_G);
        Contracting_Companies ABXY = new Contracting_Companies("ABXY", 45762301, 3450097.09);
        system_pay.add_Payee(ABXY);
        Salaried_Employee maryBrown = new Salaried_Employee("Mary Brown", 3333, 5000110.09);
        system_pay.add_Payee(maryBrown);
        paulJones.give_commission(0.77);
        paulJones.give_commission(0.77);
        paulJones.give_commission(0.77);
        paulJones.give_commission(0.77);
        paulJones.give_commission(0.77);

        John.give_commission(89.87);
        John.give_commission(89.87);
        John.give_commission(89.87);
        John.give_commission(89.87);

        MiracleShaibu.give_commission(56.89);
        MiracleShaibu.give_commission(23.67);
        MiracleShaibu.give_commission(45.67);
        MiracleShaibu.give_commission(34.67);

        EmmanuelUsani.give_commission(45.76);
        EmmanuelUsani.give_commission(34.76);
        EmmanuelUsani.give_commission(65.76);

        maryBrown.Give_bonus(30.0);
        ABXY.PayForServices(465.89);
        ABXY.PayForServices(47653.098);

        Bina_G.PayForServices(76543.0987);
        Bina_G.PayForServices(7543234567.098765);
        system_pay.Process_Payments();



    }
}
