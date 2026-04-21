class Course{

    private String courseName;
    private String instructor;
    private int capacity;
    private int enrolledStudents;

    public Course(String courseName, String instructor, int capacity){

        this.courseName=courseName;
        this.instructor=instructor;
        if(capacity<=0){
            this.capacity=10;
        }else {
            this.capacity = capacity;
        }
    }

    public void enrollStudent(){

        if(enrolledStudents<capacity){
            enrolledStudents +=1;
            return;
        }
        System.out.println("Course is full");
    }

    public void dropStudent(){

        if(enrolledStudents>0){
            enrolledStudents -=1;
            return;
        }
        System.out.println("No Student to drop");
    }

    public void mergeCourse(Course otherCourse) {

        int availableSeats = this.capacity - this.enrolledStudents;
        int studentsToMerge = Math.min(availableSeats, otherCourse.enrolledStudents);
        this.enrolledStudents += studentsToMerge;
        otherCourse.enrolledStudents -= studentsToMerge;
        System.out.println(studentsToMerge + " students merged from "
                + otherCourse.getCourseName() + " into "
                + this.getCourseName());
    }

    public String getCourseName(){
        return this.courseName;
    }

    public String getInstructor(){
        return this.instructor;
    }

    public int getAvailableSeats(){

        return this.capacity- enrolledStudents;
    }
}

public class Practice8 {
    public static void main(String[] args) {

        Course c1 = new Course("Java OOP", "Ammar", 5);
        Course c2 = new Course("Java OOP", "Hammad", 2);
        c1.enrollStudent();
        c1.dropStudent();
        System.out.println(c1.getAvailableSeats());

        c1.mergeCourse(c2);
    }
}
