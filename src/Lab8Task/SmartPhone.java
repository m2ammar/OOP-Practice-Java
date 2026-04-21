package Lab8Task;

public class SmartPhone extends SmartDevice{

    public SmartPhone(String brand){
        super(brand);
    }

    @Override
    void operate() {
        System.out.println(brand + " Smart Phone");
    }
}
