import java.util.Scanner;

class Counter {
    int sum = 0;

    public void increment() {
        sum += 1;
        System.out.println(sum);
    }

    public void reset() {
        sum = 0;
        System.out.println(sum);
    }
}

public class OOP2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Counter c1 = new Counter();
        String choice;

        while(true) {
            System.out.println("Type Add, Reset, Exit");
            choice = sc.nextLine();

            if(choice.equalsIgnoreCase("Add")) {
                c1.increment();
            } else if(choice.equalsIgnoreCase("Reset")) {
                c1.reset();
            } else if(choice.equalsIgnoreCase("Exit")) {
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Invalid input, try again!");
            }
        }
    }
}
