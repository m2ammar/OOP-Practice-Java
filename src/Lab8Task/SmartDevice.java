package Lab8Task;

public class SmartDevice extends Device{

    public SmartDevice(String brand){
        super(brand);
    }

    @Override
    void operate(){
        System.out.println(brand+" Smart Device");
    }
}
