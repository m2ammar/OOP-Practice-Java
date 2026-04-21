package Lab7;

public class Shape {

    protected String color;
    protected double x;
    protected double y;

    public Shape(String color, double x, double y){
        this.color=color;
        this.x=x;
        this.y=y;
    }

    public void shapeDetails(){

        System.out.println("Color: "+color+" x- coordinate: "+x+" y-coordinate: "+y);
    }

}
