class Student {
    private String name;
    //Left side:
//this.name → the object's private variable
//    Right side:
//    name → the parameter received by constructor
//    So you are saying:
//            “Object, take the value that was passed to you and store it inside your own variable.”
//    That’s initialization.
    private double average;
    private double math;
    private double english;
    private double science;


    //Constructor
    public Student(String name, double math, double english, double science) {

        this.name = name;
        this.math = math;
        this.english = english;
        this.science = science;
        calcAverage();
    }

    public void setMath(double math) {
        if (math >= 0 && math <= 100) {
            System.out.println("Math marks " + math);
            this.math = math;
            calcAverage();
        } else {
            System.out.println("Invalid maths marks");
        }
    }

    public void setEng(double english) {
        if (english >= 0 && english <= 100) {
            System.out.println("English marks " + english);
            this.english=english;
            calcAverage();
        } else {
            System.out.println("Invalid English marks");
        }
    }
    public void setScience(double science) {
        if (science >= 0 && science <= 100) {
            System.out.println("Science marks " + science);
            this.science=science;
            calcAverage();
        } else {
            System.out.println("Invalid Science marks");
        }
    }


    public void calcAverage() {
        this.average = (this.math + this.english + this.science) / 3;
        System.out.println("Th average is " + this.average);
    }


    public String getName() {
        return this.name;
    }

    public double getAverage() {
        return this.average;
    }
}

public class Practice2 {
    public static void main(String[] args) {

        Student s1 = new Student("Ammar", 55,44,66);
        System.out.println( "Average "+s1.getAverage());
        s1.setEng(77);s1.setEng(77);
    }
}
