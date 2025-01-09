import java.util.Scanner;
public class Demo019 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of years: ");
        int years = scanner.nextInt();

        int daysInYear = 365;
        int days = years * daysInYear;

        int minutesInDay = 24 * 60; 
        int minutes = days * minutesInDay;

        
        System.out.println(years + " years is approximately " + days + " days or " + minutes + " minutes.");

        scanner.close();
    }
}
