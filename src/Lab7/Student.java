package Lab7;
public class Student extends Person{
     protected String program;
     protected int semester;

    public Student(int id, String name, String email, String program,  int semester){
        super(id, name, email);
        this.program=program;
        this.semester=semester;
    }
    @Override
    public void details(){
//        System.out.println("ID: "+id);
//        System.out.println("Name: "+name);
//        System.out.println("Email: "+email);
        //details();
        System.out.println("ID: "+id+"\nName: "+name+"\nEmail: "+email);
        System.out.println("Program: "+program);
        System.out.println("Semester: "+semester);
    }
}
