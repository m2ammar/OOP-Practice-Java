class RandomNew{

    int var1;
    int var2;
    int var3;
    String var4;
    String var5;
    String var6;
    double var7;
    double var8;
    double var9;
    boolean var10;

    public RandomNew(int var1, int var2, int var3, String var4, String var5){

        this.var1=var1;
        this.var2=var2;
        this.var3=var3;
        this.var4=var4;
        this.var5=var5;
    }

    public RandomNew(String var6,double var7, double var8, double var9, boolean var10){

        this.var6=var6;
        this.var7=var7;
        this.var8=var8;
        this.var9=var9;
        this.var10=var10;
    }

    public RandomNew(int var1,int var2, int var3, String var4, String var5,String var6,double var7, double var8, double var9, boolean var10){

//       this(var1,var2,var3,var4,var5);//only one can be called directly and other needs to be called manually
//       this(var6,var7, var8, var9,var10);
        this.var1=var1;
        this.var2=var2;
        this.var3=var3;
        this.var4=var4;
        this.var5=var5;
        this.var6=var6;
        this.var7=var7;
        this.var8=var8;
        this.var9=var9;
        this.var10=var10;
    }

    @Override
    public String toString() {
        return "var1=" + var1 + ", var2=" + var2 + ", var3=" + var3 +
                ", var4=" + var4 + ", var5=" + var5 + ", var6=" + var6 +
                ", var7=" + var7 + ", var8=" + var8 + ", var9=" + var9 +
                ", var10=" + var10;
    }
}

public class OOPLab4 {
    public static void main(String[] args) {

        RandomNew r1 = new RandomNew(1,6,7,"Ammar","Hammad");
        RandomNew r2 = new RandomNew("Arr",77.7, 6.7, 7.9,true);
        RandomNew r3= new RandomNew(1,6,7,"Ammar","Hammad","Arr",77.7, 6.7, 7.9,true);

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);

    }
}
