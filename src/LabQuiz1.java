//Quiz1
//Write a java program which contains a class rectangle with attributes height and width.
//rectangle class req at least width. if only width is given then height = width. but rectangle can also be created through both and height.

class Rectangle{
     double width;
     double height;

    public Rectangle(double width){
        this.width=width;
        this.height=width;
    }

    public Rectangle(double width, double height){
        this.width=width;
        this.height=height;
    }
}

public class LabQuiz1 {
    public static void main(String[] args) {
         Rectangle r1 = new Rectangle(33,88);
         Rectangle r2 = new Rectangle(44);

        System.out.println(r1.width);
        System.out.println(r1.height);

        System.out.println(r2.width);
        System.out.println(r2.height);
    }
}
