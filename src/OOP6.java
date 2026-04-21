class MyClock {
    protected int hr;
    protected int mint;
    protected int sec;

    public MyClock() {
        hr = 0;
        mint = 0;
        sec = 0;
    }

    public void setHr(int hr) {
        if (hr >= 0 && hr < 24) {
            this.hr = hr;
        }
    }

    public void setMint(int mint) {
        if (mint >= 0 && mint <= 60) {
            this.mint = mint;
        }
    }

    public void setSec(int sec) {
        if (sec >= 0 && sec <= 60) {
            this.sec = sec;
        }
    }

    public void tickClock() {
        sec++;
        if (sec == 60) {
            sec = 0;
            mint++;
            if (mint == 60) {
                mint = 0;
                hr++;
                if (hr == 24) {
                    hr = 0;
                }
            }
        }
    }

    public int getHr() {
        return this.hr;
    }

    public int getMint() {
        return this.mint;

    }

    public int getSec() {
        return this.sec;
    }
}

class MyAlarmClock extends MyClock{
    protected int alarmHr;
    protected int alarmMint;
    protected boolean alarmStatus;

}

public class OOP6 {
    public static void main(String[] args) {

        MyClock m1= new MyClock();
        System.out.println(m1.getHr());

        m1.setHr(7);
        m1.setMint(43);
        m1.setSec(54);

        System.out.printf(m1.getHr()+" "+m1.getMint()+" "+ m1.getSec());
    }
}
