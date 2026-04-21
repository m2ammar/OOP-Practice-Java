import Lab8.Payment;
import org.w3c.dom.ls.LSOutput;

public class ee {
    public static void main(String[] args) {

    }
}
class Person{
    protected  String name;
    protected  int age;

    public  Person(String name, int age){
        if(age>0){
            this.age=age;
        }else if(age==0){
            this.age=1;// we were ask to do this
            System.out.println("Age cannot be zero");
        }else{
            this.age=Math.abs(age);
            System.out.println("Age cannot be negative");
        }

        this.name=name;
    }

}
class Patient extends Person{

    protected  static int totalPatients=1;
    //or
    //public int totalPatients=1;

    public Patient(String name, int age){
        super(name, age);
        totalPatients++;
    }

    public  static int getTotalPatients(){
        return totalPatients;
    }
    //or

    //public  int getTotalPatients(){
       // return totalPatients;
    //}

    //the error was here at the . in print statemet
    //System.out.println(Patient.getTotalPatient());
}