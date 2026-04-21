class Book{
    private String title;
    private double price;

    public Book(String title, double price){
        this.title=title;
        this.price=price;
    }

    public double getPrice(){
        return this.price;
    }

    public String getTitle(){
        return this.title;
    }
}

public class Practice3 {
    public static void main(String[] args) {

        Book b1= new Book("Henry", 55.5);
        System.out.println(b1.getTitle());
        System.out.println(b1.getPrice());
    }
}
