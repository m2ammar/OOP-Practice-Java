
class Students{
    private String name;
    private int marks;
    private String medal;

    public Students(String name, int marks){
        this.name=name;
        this.marks=marks;
        this.medal=calcMedal(this.marks);
    }

    public String calcMedal(int marks){
        if(marks>=90 && marks<=100){
            return "Gold Medal";
        }else  if(marks>=70 && marks<=89){
            return"Silver Medal";
        }else  if(marks>=0 && marks<70)
            return "Bronze Medal";
        else
            return "Invalid Input";
    }

    public  void setMarks(int marks){
        if( marks >=0 && marks <=100){
            this.marks=marks;
            this.medal=calcMedal(marks);
        }else {
            System.out.println("Invalid marks");
        }
    }

    public String getName(){
        return this.name;
    }

    public int getMarks(){
        return this.marks;
    }
    public String getMedal(){return this.medal;}
}

public class Practice5 {
    public static void main(String[] args) {

        Students s1= new Students("Ammar",99);
        System.out.println(s1.getName());
        System.out.println(s1.getMarks());
        System.out.println(s1.getMedal());
        s1.setMarks(44);

    }
}


