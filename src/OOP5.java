import java.util.Random;

class Die{
    protected int outCome;
    Random random = new Random();
    public Die(){
        this.outCome=0;
    }
    public void throwDie(){
        this.outCome = random.nextInt(1,7);
    }
    public int getOutCome() {
        return outCome;
    }
}

class Dice extends Die{

    protected int outCome2;


    public Dice(){
        super();
        outCome=0;
        outCome2=0;
    }


    public void throwDice(){
        outCome=random.nextInt(1,7);
        outCome2=random.nextInt(1,7);
    }

    public int getOutCome2(){
        return this.outCome2;
    }

}

public class OOP5 {
    public static void main(String[] args){

    }
}
