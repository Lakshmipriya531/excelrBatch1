import java.util.Scanner;

public class Demo09 {
    
    private String custName = "Priya";
    private long accountNo = 123456;
    private double balance = 10000.00;

    
    void acceptDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        custName = sc.nextLine();

        System.out.print("Enter your account number: ");
        while (!sc.hasNextLong()) { 
            System.out.println("Invalid input. Please enter a valid account number:");
            sc.next(); 
        }
        accountNo = sc.nextLong();
        sc.nextLine(); 

        sc.close(); 
    }

    
    void displayDetails() {
        System.out.println("Hello " + custName);
        System.out.println("Your account number: " + accountNo);
        System.out.println("Your balance is: " + balance);
    }

    
    public static void main(String[] args) {
        Demo09 obj = new Demo09();
        obj.acceptDetails();
        obj.displayDetails();
    }
}
