package Lab7;

public class Person {
    protected int id;
    protected String  name;
    protected String email;

    public  Person(){

    }
    public Person(int id, String name, String email){
        this.id=id;
        this.name=name;
        this.email=email;

    }

    public void details(){

        System.out.println("ID: "+id+" Name: "+name+" Email: "+email);
    }
}
