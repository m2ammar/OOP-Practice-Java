//import java.util.Scanner;
//
//class Counter1 {
//    int n;
//
//    int sum = 0;
//
//    public void add() {
//        sum += 1;
//        System.out.println(sum);
//    }
//
//    public void zero() {
//        sum = 0;
//        System.out.println(sum);
//    }
//
//    public Counter1(int n){
//        this.n=n;
//    }
//}
//
//public class OOP3 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        Counter c1 = new Counter(n);
//        String choice;
//
//        while(true) {
//            System.out.println("Type number to start, Reset, Exit");
//            choice = sc.nextLine();
//
//            if(choice.equalsIgnoreCase("Add")) {
//                c1.increment(n);
//            } else if(choice.equalsIgnoreCase("Reset")) {
//                c1.reset();
//            } else if(choice.equalsIgnoreCase("Exit")) {
//                System.out.println("Exiting...");
//                break;
//            } else {
//                System.out.println("Invalid input, try again!");
//            }
//        }
//    }
//}
//
//your main program should ask the user for starting value initializer the counter.
// then wait for the user to provide either or r or x
// to increment() or reset() the counter or exit the program