import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0;
        
        System.out.println("--- Syntecxhub Restaurant Billing ---");
        
        while(true) {
            System.out.println("\n1.Pizza Rs.250  2.Burger Rs.120  3.Coke Rs.60  4.Bill  5.Exit");
            System.out.print("Choose item: ");
            int choice = sc.nextInt();
            
            if(choice == 1) { total += 250; System.out.println("Pizza added"); }
            else if(choice == 2) { total += 120; System.out.println("Burger added"); }
            else if(choice == 3) { total += 60; System.out.println("Coke added"); }
            else if(choice == 4) {
                double gst = total * 0.18;
                System.out.println("\n--- Final Bill - Syntecxhub ---");
                System.out.println("Subtotal: Rs." + total);
                System.out.println("GST 18%: Rs." + String.format("%.2f", gst));
                System.out.println("Total: Rs." + String.format("%.2f", total + gst));
                break;
            }
            else if(choice == 5) break;
            else System.out.println("Invalid choice");
        }
        sc.close();
    }
}
