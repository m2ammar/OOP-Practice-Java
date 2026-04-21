public class LaB08 {
    public static void main(String[] args) {
        shape s1;
        s1=new Rectangle1(2,3);
        System.out.println(s1);
//        shape s2=new circle(5);
//        s2.area();
//        s2.printDetails();

    }
}
abstract class shape{
    abstract void area();
    abstract void printDetails();
}
class circle extends shape{
    double radius;
    public circle(double r){
        radius=r;
    }
    @Override
    public void area(){
        System.out.println(3.14*radius*radius);
    }
    @Override
    public void printDetails(){
        System.out.println(radius);
    }
}
class Rectangle1 extends shape{
    double height;
    double base;
    public Rectangle1(double h,double b){
        height=h;
        base=b;
    }
    @Override
    public void area(){
        System.out.println(base*height);
    }
    @Override
    public void printDetails(){
        System.out.println(height);
        System.out.println(base);
    }

    @Override
    public String toString(){
        return "height: " + height + "\nbase: " + base;
    }
}

