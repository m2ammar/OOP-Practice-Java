package Lab7;
public class Teacher extends Employee {

    protected double salary;
    protected String department;

    public Teacher(int id, String name, String email, double salary, String department) {
        super(id, name, email);
        this.salary = salary;
        this.department = department;
    }

    @Override
    public void details() {

//        System.out.println("ID: "+id);
//        System.out.println("Name: "+name);
//        System.out.println("Email: "+email);
       // details();
        System.out.println("ID: "+id+"\nName: "+name+"\nEmail: "+email);
        System.out.println("Program: "+salary);
        System.out.println("Semester: "+department);
      }
}
