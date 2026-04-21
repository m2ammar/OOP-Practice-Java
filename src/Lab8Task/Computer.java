package Lab8Task;

public class Computer extends Device{

    public Computer(String brand) {
        super(brand);
    }

    @Override
    void operate(){

        System.out.println(brand+" Computer");
    }
}
