class Student1{

    int id;
    String name;
    static int calc;

    public Student1(String name) {
        this.name=name;
        this.id =++calc;
        //OR
//        calc++;
//        add(calc);
    }
//    public int add(int calc){
//       return this.id=calc;
//    }
}

public class OOPLab7 {
    public static void main(String[] args) {
        Student1 s1= new Student1("Ammar");
        Student1 s2= new Student1("GGGHa");
        System.out.println(s1.name);
        System.out.println(s1.id);
        System.out.println(s2.name);
        System.out.println(s2.id);
    }
}
