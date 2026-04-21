import java.util.Scanner;

class BankAccount {
    private double balance;
    private double interestRate;

    // Constructor
    public BankAccount(double balance){
        if(balance < 0) {
            System.out.println("Initial balance can't be negative. Setting to 0.");
            this.balance = 0;
        } else {
            this.balance = balance;
        }
        calcInterestRate(); // automatically calculate interest rate
    }

    // Calculate interest rate based on balance
    private void calcInterestRate(){
        if(this.balance < 1000){
            this.interestRate = 0.01; // 1%
        } else {
            this.interestRate = 0.02; // 2%
        }
    }

    // Setter: deposit money
    public void deposit(double amount){
        if(amount > 0){
            this.balance += amount;
            calcInterestRate();
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit must be positive!");
        }
    }

    // Setter: withdraw money
    public void withdraw(double amount){
        if(amount > 0 && amount <= this.balance){
            this.balance -= amount;
            calcInterestRate();
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Cannot withdraw: invalid amount");
        }
    }

    // Getters
    public double getBalance(){
        return this.balance;
    }

    public double getInterestRate(){
        return this.interestRate;
    }

    // Optional: nice display
    public String toString(){
        return "Balance: " + this.balance + ", Interest Rate: " + (this.interestRate*100) + "%";
    }
}

public class Practice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter initial balance: ");
        double bala = sc.nextDouble();

        BankAccount account = new BankAccount(bala);

        System.out.println(account);

        // Try deposit
        account.deposit(600);
        System.out.println(account);

        // Try with draw invalid
        account.withdraw(2000);
        System.out.println(account);

        // Withdraw valid
        account.withdraw(500);
        System.out.println(account);
    }
}
