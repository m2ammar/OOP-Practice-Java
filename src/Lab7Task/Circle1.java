package Lab7Task;

public class Circle1 extends Shape {
    protected double radius;

    public Circle1(String color, double x, double y, double radius){
        super(color, x, y);
        this.radius=radius;
    }

    public Circle1(String color, double x, double y) {
        super(color, x, y);
    }

    public void childDetails(){
        shapeDetails();
        System.out.println("Radius: "+radius);
    }

    @Override
    public void area() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of circle: " + area);
    }
}
