class Point2D{
    double x,y;
    Point2D(){
        x=0.0;
        y=0.0;
    }
    Point2D(double x,double y){
        this.x=x;
        this.y=y;
    }
    public double getX(){return x;}
    public double getY(){return y;}
}
class Triangle {
    private Point2D a,b,c;
    private double area;
    Triangle(Point2D a,Point2D b,Point2D c){
        if (a.getX()==b.getX() && a.getX()==c.getX()
        || a.getY()==b.getY() && a.getY()==c.getY())
        {
            a = new Point2D();
            b = new Point2D();
            c = new Point2D();
        }
        else {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }
    void calcArea(){
        double l1, l2, l3;
        double s;
        //distance=sqrt((x2-x1)^2+(y2-y1)^2)
        l1 = Math.sqrt(Math.pow(a.getX()-b.getX(),2)-
                Math.pow(a.getY()-b.getY(),2));
        l2 = Math.sqrt(Math.pow(a.getX()-c.getX(),2)-
                Math.pow(a.getY()-c.getY(),2));
        l3 = Math.sqrt(Math.pow(b.getX()-c.getX(),2)-
                Math.pow(b.getY()-c.getY(),2));
        //sqrt(s(s-a)(s-b)(s-c))
        //a,b,c are the three sides
        //s = (a+b+c)/2
        s=(l1+l2+l3)/2;
        area=Math.sqrt(s*(s-l1)*(s-l2)*(s-l3));


    }
    public double getArea(){return area;}
}
//A triangle has three points and an area.
//If three points are in one line, they cannot create a triangle
//in this case we will set all points to zero
//calculate the area
public class ObjectWithinClass {
    static void main() {
        Point2D p1,p2,p3;
        Triangle t;
        p1=new Point2D(0,0);
        p2=new Point2D(1,1);
        p3=new Point2D(2,2);

        t = new Triangle(p1,p2,p3);

        System.out.println(t.getArea());

    }
}
