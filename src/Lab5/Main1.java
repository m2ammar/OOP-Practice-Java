package Lab5;

class Calculator{

    public int add(int a, int b){
        return a+b;
    }

    //method overloading by different no of parameters
    public int add(int a, int b, int c){
//        return a+b+c;
        return add(a,b)+c;
    }

    public double add(double a, double b){
        return a+b;
    }

    //method overloading by different data types of parameters
    public double add(double a, double b, double c){
//        return a+b+c;
        return add(a,b)+c;
    }

    //method overloading by different position
    public double multiply(int a, double b){
        return a*b;
    }

    public double multiply(double b, int a){
        return b*a;
    }

    public int add(int[] a){
    int sum=0;
        for(int i=0; i<a.length; i++){
             sum +=a[i];
        }
        return sum;
    }
}

public class Main1 {
     public static void main(String[] args){

        Calculator calc= new Calculator();
        int result=calc.add(1,2);
        System.out.println(result);

        int result1=calc.add(1,3,4);
        System.out.println(result1);

        double result2=calc.multiply(1.7,2);

//      System.out.println(calc.add(new int[] {3,5,6,7,8,8,9}));
        //or
        int[] a ={2,3,4,5,6,7,8};
         System.out.println(calc.add(a));

         int[] arr=new int[6];
         for(int i=0; i<arr.length; i++){
             System.out.println(arr[i]);
         }

    }
}
