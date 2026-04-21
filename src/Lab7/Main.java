package Lab7;

public class Main {
    public static void main(String[] args){

//        Student stud= new Student(133,"Ammar","Haaan@gmail.com", "BSCS", 4);
//        stud.details();
//
//        Teacher teacher= new Teacher(444,"Hamza","HAnnma@gmail.com", 888.88, "IT");
//        teacher.details();

//        teacher.details();

//        Person[] persons={new Student(133,"Ammar","Haaan@gmail.com", "BSCS", 4),
//                new Teacher(444,"Hamza","HAnnma@gmail.com", 888.88, "IT"),
//                new Teacher(455,"Hamad","Hm@gmail.com", 88118, "IT"),
//                new Teacher(544,"hamdan","Hm@gmail.com", 11128, "IT"),
//                new Student(536,"Farrukh","Hfrn@gmail.com", "BSDS", 5),
//                new Student(783,"dddd","Hgsdn@gmail.com", "BSBA", 5)};
//
//        for(int i=0; i< persons.length; i++){
//            System.out.println("Person: "+(i+1));
//            persons[i].details();
//            System.out.println();
//        }

//        Person person = new Student(133,"Ammar","Haaan@gmail.com", "BSCS", 4);
//        person.details(); //it will call student's detail method bcz object that being passed is of student

        Shape shape= new Shape("Green",5,7);
        shape.shapeDetails();

        Circle circle= new Circle("Green",5,7, 88.8);
        circle.childDetails();

        Rectangle rectangle= new Rectangle("Purlpe",8,8, 89);
        rectangle.childDetails();
    }
}
