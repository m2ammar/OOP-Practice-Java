package Lab7Task;

public class Main {
    public static void main(String[] args) {

        Shape shape = new Shape("Black", 6,6);
        shape.shapeDetails();
        shape.area();
        System.out.println();


        Circle1 circle1=new Circle1("Yellow", 6,8, 6);
        circle1.shapeDetails();
        circle1.area();
        System.out.println();

        Rectangle1 rectangle1= new Rectangle1("Blue",7,6, 8,4);
        rectangle1.childDetails();
        rectangle1.area();
    }
}
