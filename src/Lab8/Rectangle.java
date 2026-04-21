package Lab8;

public class Rectangle extends Shape{

    private double width;
    private double height;

    public Rectangle(double height, double width){
        this.height=height;
        this.width=width;
    }

    @Override
    void area(){
        System.out.println("Area of Rectangle: "+(height*width));
    }

    @Override
    void printDetails(){
        System.out.println("Height: "+height+"\n"+"Width: "+width);
    }

    public String toString(){
        return "Height: "+height+"\n"+"Width: "+width;

    }
}
