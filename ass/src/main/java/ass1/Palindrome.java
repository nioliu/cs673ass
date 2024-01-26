package ass1;

import java.util.Scanner;

public class Palindrome {
    /**
     * determine if s is palindrome
     */
    public static boolean isPalindrome(String s) {
        for (int i = 0; i < s.length() >> 1; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        justifyCmdString();
    }

    private static void justifyCmdString() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input a string ...");
        while (scanner.hasNextLine()) {
            try {
                String cmd = scanner.nextLine();
                if (cmd.equals("q")) {
                    System.out.println("Thank you, bye~");
                    break;
                }
                System.out.printf("The string %s %s a palindrome\n", cmd, isPalindrome(cmd) ? "is" : "is not");
                System.out.println("You can do it again ...");
            } catch (Exception e) {
                System.out.println("catch a exception: " + e);
                break;
            }
        }
    }
}
