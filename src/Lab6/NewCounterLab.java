package Lab6;

public class NewCounterLab {
     int value;
     public  void increment(){

         if (value < 31) {
             value++;
         }else{
             rest();
             value++;
         }
    }

    public void decrement(){
        if (value > 0) {
            value--;
        }
    }

    public void rest(){
        value=0;
    }
}