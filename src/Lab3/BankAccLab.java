package Lab3;

public class BankAccLab {
    String AccNo;
    String Name;
    double balance;

    public BankAccLab(String AccNo){
        this.AccNo=AccNo;

    }

    public BankAccLab(String AccNo, String Name){
//        this.AccNo=AccNo;
        this(AccNo);
        this.Name=Name;


    }

    public BankAccLab(String AccNo, String Name, double balance){
//        this.AccNo=AccNo;
//        this.Name=Name;
        this(AccNo, Name);
        this.balance=balance;
    }
}
