package Lab8;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius){
        this.radius=radius;
    }

    @Override
    void area(){
        double a= Math.PI*radius*radius;
        System.out.println("Area of Circle: "+a);
    }

    @Override
    void printDetails(){
        System.out.println("Radius: "+radius);
    }
}
