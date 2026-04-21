 class Car{

   private String brand;
   private int speed;
   private int fuel;

     public Car(String brand, int speed, int fuel){
      this.brand=brand;
      this.speed=speed;
         if(fuel < 0){
             this.fuel = 0;
         } else {
             this.fuel = fuel;
         }
     }


     public void accelerate(int amount) {
         if(amount <= 0) {
             System.out.println("Invalid acceleration");
             return;
         }

         int requiredFuel = amount / 10;
         if(requiredFuel > fuel) {
             System.out.println("Not enough fuel to accelerate");
             return;
         }
         speed += amount;
         fuel -= requiredFuel;
         System.out.println("Accelerated by " + amount + " units. Speed: " + speed + ", Fuel: " + fuel);
     }


     public void brake(int amount) {
         if(amount <= 0) {
             System.out.println("Invalid brake amount");
             return;
         }
         speed -= amount;
         if(speed < 0) speed = 0;
         System.out.println("Braked by " + amount + " units. Speed: " + speed);
     }


     public String getBrand(){
         return this.brand;
     }

     public int getFuel() {
         return this.fuel;
     }

     public int getSpeed(){
         return this.speed;
     }
 }

public class Practice6 {
    public static void main(String[] args) {

        Car c1= new Car("Toyota",77,80);

        c1.getBrand();
        c1.getSpeed();
        c1.getFuel();
        c1.accelerate(20);
        c1.accelerate(50);
        c1.brake(10);

    }
}
