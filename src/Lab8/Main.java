package Lab8;

public class Main {
    public static void main(String[] args) {

        Shape shape;
        shape= new Circle(6);
        shape.area();
        shape.printDetails();
        System.out.println("-----------------------------");
        System.out.println();

        shape = new Rectangle(5,8);
        shape.area();
        shape.printDetails();
        System.out.println(shape);
        System.out.println("-----------------------------");

        Payment payment;
        payment=new CreditCard();
        payment.pay(999);

        payment= new DebitCard();
        payment.pay(66);

        payment= new Cash();
        payment.pay(44);
        System.out.println("-----------------------------");

    }
}
