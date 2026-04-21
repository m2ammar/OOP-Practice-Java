class Courses{

    private String courseName;
    private int capacity, enrolledStudents;

    public Courses(String courseName, int capacity){
        this.courseName=courseName;
        if(capacity<=0){
            this.capacity=10;
            return;
        }
        this.capacity=capacity;
    }

    public boolean enrollStudent(){
        if (enrolledStudents<capacity){
            enrolledStudents++;
            return true;
        }
        return false;
    }

    public void dropStudent(){
        if(enrolledStudents>0){
            enrolledStudents--;
            System.out.println("Student dropped");
            return;
        }
        System.out.println("No students!");
    }

    public final void generateCourseCode(){
        //final means:
        // Child classes are NOT allowed to override this method.

        String prefix=getCourseName().substring(0,3).toUpperCase();
        int random = (int)(Math.random()*100);
        System.out.println("Course code: "+prefix+getCapacity()+random);
    }

    public void setCapacity(int cap){
        this.capacity=cap;
        System.out.println("Now we offer "+capacity+" seat for this course");
    }

    public String getCourseName(){
        return this.courseName;
    }

    public int getCapacity(){
        return this.capacity;
    }
    public int getAvailableSeats(){

        return this.capacity-enrolledStudents;
    }

    public int getEnrolledStudents(){
        return this.enrolledStudents;
    }
}

class OnlineCourses extends Courses{

    private String platform;

    public OnlineCourses(String courseName, int capacity,  String platform) {
        super(courseName, capacity );
        this.platform = platform;
    }

    public void setPlatform(String platform){
        this.platform=platform;
        System.out.println("Updated platform is: "+this.platform);
    }

    public String getPlatform(){
        return this.platform;
    }


    public void enrollViaPlatform(){

        System.out.println("Processing online enrollment...");
       if(super.enrollStudent()) {
           System.out.println("Enrolled Student via " + platform);
       }else{
           System.out.println("No Available seats");
       }
    }
}

class PaidOnlineCourse extends OnlineCourses{

    private double price;
    private double totalRevenue;

    public PaidOnlineCourse(String courseName, int capacity,  String platform, double price){
        super(courseName, capacity, platform);
        this.price=price;

    }

    @Override
    public void enrollViaPlatform(){

        if(super.enrollStudent()){//super tells that we are calling parent method
            System.out.println("Enrolled Student via " + getPlatform());
            totalRevenue+= price;
            System.out.println("Payment received "+price);
        }else{
            System.out.println("Enrollment Failed");
        }

    }

    public double getTotalRevenue(){
        return this.totalRevenue;
    }
}

public class Practice9 {
    public static void main(String[] args) {

        OnlineCourses oc=new OnlineCourses("OOP", 5,"Udemy");
        oc.enrollViaPlatform();
        oc.dropStudent();
        System.out.println("Course: "+oc.getCourseName());
        System.out.println("Platform: "+oc.getPlatform());
        System.out.println("Total Seats: "+oc.getCapacity());
        System.out.println("Available Seats: "+oc.getAvailableSeats());

    }
}
