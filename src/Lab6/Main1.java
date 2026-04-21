package Lab6;

public class Main1 {
      public static void main(String[] args){

//     CounterLab.increment();
//        CounterLab.increment();
//        CounterLab.increment();
//        System.out.println(CounterLab.value);
//        CounterLab.decrement();
//        System.out.println(CounterLab.value);
//        CounterLab.rest();
//        System.out.println(CounterLab.value);
//         CounterLab n2=new CounterLab();
//         CounterLab.increment(6);
//          System.out.println(CounterLab.value);
//
//        NewCounterLab n1 = new NewCounterLab();
//         n1.increment();
//         n1.increment();
//         n1.increment();
//         n1.increment();
//         n1.increment();
//         n1.increment();
//         n1.increment();
//         n1.increment();
//         n1.increment();
//         n1.increment();
//         n1.increment();
//         n1.increment();
//         n1.increment();
//         n1.increment();
//         n1.increment();
//         n1.increment();
//         n1.increment();
//         n1.increment();
//         n1.increment();
//         n1.increment();
//         n1.increment();
//         n1.increment();
//         n1.increment();
//         n1.increment();
//         n1.increment();
//         n1.increment();
//         n1.increment();
//         n1.increment();
//         n1.increment();
//         n1.increment();
//         n1.increment();
//
//
//         System.out.println(n1.value);
//         n1.increment();
//         n1.increment();
//         System.out.println(n1.value);
//         n1.decrement();
//         System.out.println(n1.value);

          StudentNew s1 = new StudentNew(1, "Ali");



          Library l1 = Library.makeObject("City Library", 500, "Karachi");
          Library l2 = Library.makeObject("City Library", 500, "Karachi");
          Library l3 = Library.makeObject("City Library", 500, "Karachi");
          Library l4 = Library.makeObject("City Library", 500, "Karachi");


          System.out.println(l1.getName() +" "+ l1.getNoOfBooks() +" "+ l1.getAddress());
          System.out.println(l2.getName() +" "+ l2.getNoOfBooks() +" "+ l2.getAddress());
          System.out.println(l3.getName() +" "+ l3.getNoOfBooks() +" "+ l3.getAddress());
          System.out.println(l4.getName() +" "+ l4.getNoOfBooks() +" "+ l4.getAddress());

      }
}



