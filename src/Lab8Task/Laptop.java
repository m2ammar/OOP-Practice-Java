package Lab8Task;

public class Laptop extends Computer{

    public Laptop(String brand) {
        super(brand);
    }

    @Override
    void operate(){
        System.out.println(brand+" Laptop");
    }
}
