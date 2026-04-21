package Lab8;

public class CreditCard extends Payment{

    @Override
    void pay(double amount){

        System.out.println("Paid amount: "+amount+" through CreditCard");
    }
}
