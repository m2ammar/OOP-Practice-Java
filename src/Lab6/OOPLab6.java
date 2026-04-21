package Lab6;

class Student{
    int id;
    String name;
    static  String batch;// here static means this batch is belongs to class not to object.
    static int count;
    int counter;

    public Student(int id, String name){
        this.id=id;
        this.name=name;
        count++;//calculate the no of object
        counter++;
    }
}

public class OOPLab6 {
    public static void main(String[] args) {

        Student s1= new Student(3,"Ammar");
        Student s2= new Student(4,"Hammad");
        Student s3= new Student(4,"Emad");
        Student.batch="Fall 2025";
        System.out.println(Student.batch);
        System.out.println(Student.count);
        System.out.println(s1.counter);
    }
}