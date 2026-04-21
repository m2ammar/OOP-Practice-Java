package Lab8;

public class Cash extends Payment{

    @Override
    void pay(double amount){
        System.out.println("Paid amount: "+amount+" through Cash");
    }
}
