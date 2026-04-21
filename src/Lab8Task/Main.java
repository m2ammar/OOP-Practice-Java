package Lab8Task;

public class Main {
    public static void main(String[] args) {

        Computer myComputer = new Computer("Lenovo");
        Laptop myLaptop = new Laptop("Mac");
        SmartDevice mySmartDevice = new SmartDevice("iPad");
        SmartPhone myPhone = new SmartPhone("Huawei");

        System.out.println();
        myComputer.displayBrand();
        myComputer.operate();

        System.out.println();
        myLaptop.displayBrand();
        myLaptop.operate();

        System.out.println();
        mySmartDevice.displayBrand();
        mySmartDevice.operate();

        System.out.println();
        myPhone.displayBrand();
        myPhone.operate();
    }
}
