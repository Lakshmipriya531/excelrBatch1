import java.util.Scanner;
    public class Demo041 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);
        
        if (Character.isLetter(ch)) {
            ch = Character.toLowerCase(ch);
            
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println("The character is a vowel.");
            } else {
                System.out.println("The character is a consonant.");
            }
        } else {
            System.out.println("The character is not a letter.");
        }
        
        
    }
}

    

