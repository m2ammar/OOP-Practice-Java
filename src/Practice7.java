class BankAcc{

    private String accountHolder;
    private double balance;

    public BankAcc(String accountHolder, double balance){
        this.accountHolder=accountHolder;
        if(balance<0) this.balance=0;
        else {
            this.balance=balance;
        }
    }

    public void deposit(double amount){

        if(amount<=0) {
            System.out.println("Invalid amount");
            return;
        }
        balance += amount;
        System.out.println("New Balance  after deposit of " + amount + " is: " + balance);

    }

    public void withdraw(double amount){
        if(amount<=0) {
            System.out.println("Invalid withdrawal amount");
            return;
        }
        else if(amount>balance) {
            System.out.println("Insufficient balance");
            return;
        }
        balance -= amount;
        System.out.println("Remaining amount after the withdrawal of " + amount + " is: " + balance);

    }

    public String getAccountHolder(){
        return this.accountHolder;
    }
    public double getBalance(){
        return this.balance;
    }
}

public class Practice7 {
    public static void main(String[] args) {

        BankAcc b1= new BankAcc("Ammar",5555.9);

        b1.deposit(666);
        b1.withdraw(666666.8);
    }
}