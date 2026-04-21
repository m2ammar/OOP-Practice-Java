package Lab8;

public class DebitCard extends Payment{

    @Override
    void pay(double amount){
        System.out.println("Paid amount: "+amount+" through DebitCard");
    }
}
