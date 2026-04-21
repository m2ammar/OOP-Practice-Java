class Vect{
   private double x;
   private double y;
   private double mag;
   private double angle;
   //constructor = special type of setter
    public Vect(double x, double y){
        this.x=x;
        this.y=y;
        calcMagnitude();
        calcAngle();
    }

    public void calcMagnitude(){
        this.mag= Math.sqrt(Math.pow(this.x,2)) +
                Math.sqrt(Math.pow(this.y,2));
    }
    public void calcAngle(){
        this.angle=Math.atan(this.y/this.x);
    }
    // when method is static it means it is independent no need of class and objects.
    //setter
    public void setX(double x) {
        this.x=x;// dot is access operator
    }

    public void setY(double y) {
        this.y=y;// dot is access operator
    }


    //getter
    public double getX(){// this is getter, so it means it will return value not void
        return x;
    }

    public double getY(){// this is getter, so it means it will return value not void
        return this.y;
    }

    public double getMagnitude(){
        return mag;
    }

    public double getAngle(){
        return angle;
    }
}
//
public class OOP1 {
    public static void main(String[] args) {

        Vect v= new Vect(1,1);
        System.out.println(v.getX());
        System.out.println(v.getY());
        System.out.println(v.getMagnitude());
        System.out.println(v.getAngle());
    }
}

