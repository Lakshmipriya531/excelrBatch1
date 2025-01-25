import java.util.Scanner;

    public class Demo043 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter an uppercase character: ");
        char ch = scanner.next().charAt(0);
        
        if (Character.isUpperCase(ch)) {
            char lowerCaseChar = Character.toLowerCase(ch);
            System.out.println("Lowercase character: " + lowerCaseChar);
        } else {
            System.out.println("The character is not an uppercase letter.");
        }
        
        
    }
}

    

