package Lab8Task;

public abstract class Device {

    protected String brand;

    public Device(String brand){
        this.brand=brand;
    }
    abstract void operate();

    void displayBrand(){
         System.out.println("Brand: "+brand);
    }
}
