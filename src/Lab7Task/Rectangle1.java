package Lab7Task;

public class Rectangle1 extends Shape {
    protected double height;
    protected double width;


    public Rectangle1(String color, double x, double y, double height, double width) {
        super(color, x, y);
        this.height=height;
        this.width=width;

    }

    public void childDetails() {
        shapeDetails();
        System.out.println("Height: "+height);
        System.out.println(color);
    }

    @Override
    public void area() {
        double area = width * height;
        System.out.println("Rectangle Area: " + area);
    }
}
