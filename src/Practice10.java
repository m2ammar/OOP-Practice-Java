class BankingSys{
    // Encapsulation
    // Inheritance
    // Method Overriding
    // super
    // final method
    // Polymorphism in main

    private String accountHolder;
    private double balance;

    public BankingSys(String accountHolder, double balance){

        this.accountHolder=accountHolder;
        if(balance<=0){
            this.balance=200;
        }else {
            this.balance = balance;
        }
    }

    public double deposit(double amount){

        if(amount<=0) {
            return this.balance;
        }else{
            return this.balance += amount;
        }
    }

    public  double withdraw(double amount){

        if(amount<=0){
            return this.balance;
        }else{
           return this.balance -=amount;
        }
    }

    public double getBalance(){
        return this.balance;
    }

    public String getAccountHolder(){
        return this.accountHolder;
    }


    public final void accountType(){
        String pre=getAccountHolder().substring(0,4).toLowerCase();
        int generate= (int)(Math.random()*100);
        System.out.println("Account Code: "+pre+generate);
    }
}

class SavingAccount extends BankingSys{

    private double interestRate;

    public SavingAccount(String accountHolder, double balance, double interestRate){
        super(accountHolder, balance);
        this.interestRate=interestRate;

    }

    @Override
    public double withdraw(double amount){
        if(amount > getBalance()){
            System.out.println("Cannot withdraw beyond current balance!");
            return getBalance();
        }
        return super.withdraw(amount); // safe to call parent method
    }

    public double addInterest(){
        if(getBalance()>=10000){
            this.interestRate=getBalance() +(0.5*getBalance());
           return interestRate;
        }else {
            this.interestRate=getBalance() +(0.1*getBalance());
            return this.interestRate;
        }
    }
}

class CurrentAccount extends SavingAccount{

    private int overdraftLimit;

    public CurrentAccount(String accountHolder, double balance, double interestRate, int overdraftLimit){
        super(accountHolder, balance, interestRate);

        this.overdraftLimit=overdraftLimit;
    }

    @Override
    public double withdraw(double amount){
        if(getBalance() - amount < -overdraftLimit){
            System.out.println("Cannot exceed overdraft limit!");
            return getBalance();
        }
        return super.withdraw(amount);
    }
}

public class Practice10 {
    public static void main(String[] args) {

        BankingSys acc1 = new SavingAccount("Ammar",666.06,99.9);
        BankingSys acc2 = new CurrentAccount("Ahmed",77, 99.9, 8);

        acc1.accountType();
        acc2.accountType();

        System.out.println("Account Holder Name: "+acc1.getAccountHolder() +"Balance: "+acc1.getBalance());
        System.out.println("Ahmed deposit: "+acc2.deposit(777));
        System.out.println("Ammar withdraw: "+acc1.withdraw(779));
        System.out.println("Ahmed's  Balance of: "+acc2.getBalance());
        System.out.println("Ammar got interest of: "
                + ((SavingAccount) acc1).addInterest());



    }
}
