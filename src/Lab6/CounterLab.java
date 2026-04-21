package Lab6;

public class CounterLab {
    static int value;

    public static void increment(){

        if (value < 31) {
            value++;
        }else{
            rest();
        }
    }

    public static void increment(int value){

        value+=value;
    }

    public static void decrement(){
        value--;
    }

    public static void rest(){
        value=0;
    }
}