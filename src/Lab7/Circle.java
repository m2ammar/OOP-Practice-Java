package Lab7;

public class Circle extends Shape {
    protected double radius;

    public Circle(String color, double x, double y, double radius){
        super(color, x, y);
        this.radius=radius;
    }

    public void childDetails(){
        shapeDetails();
        System.out.println("Radius: "+radius);
    }
}
