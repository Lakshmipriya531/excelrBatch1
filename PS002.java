public class PS002 {
    public static int getNextMultipleOf100(int number) {
        if (number <= 0) {
            return -1;
        }
        return ((number / 100) +1) * 100;
    }
    public static void main(String[] args) {
        System.out.println(getNextMultipleOf100(899));
        System.out.println(getNextMultipleOf100(100));
        System.out.println(getNextMultipleOf100(1230));
        System.out.println(getNextMultipleOf100(-50));
        System.out.println(getNextMultipleOf100(0));
    }
}