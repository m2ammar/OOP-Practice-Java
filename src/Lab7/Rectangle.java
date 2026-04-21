package Lab7;

public class Rectangle extends Shape {
    protected double height;

    public Rectangle(String color, double x, double y, double height) {
        super(color, x, y);
        this.height=height;
    }

    public void childDetails() {
        shapeDetails();
        System.out.println("Height: "+height);
        System.out.println(color);
    }
}
