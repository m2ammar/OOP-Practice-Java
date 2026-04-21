class Counters{
     protected int count;

     public Counters(int count){
         this.count=count;
     }

     public void increment(){
         this.count++;
     }

     public void reset(){
         this.count=0;
     }

     public int getCount(){
         return this.count;
    }
}

class UpDownCounter extends Counters{
    public UpDownCounter(int count){
        super(count);
    }

    public void decrement(){
        this.count--;
    }
}

public class OOP4 {
     public static void main(String[] args) {

         Counters c1= new Counters(6);
         UpDownCounter u1=  new UpDownCounter(7);

         c1.increment();
         u1.decrement();

         System.out.println(c1.getCount());
         System.out.println(u1.getCount());
    }
}
