public class Main {
    public static void main(String[] args) {
        // Hardcoded integer value
        int numToExamine = 2;

        // Check if the number is even or odd using modulo
        if (numToExamine % 2 == 0) {
            System.out.println(numToExamine + " is Even.");
        } else {
            System.out.println(numToExamine + " is Odd.");
        }
    }
}