import java.util.Scanner;
import java.util.Stack;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Stack<Character> stack = new Stack<>();

        System.out.println("Enter a word:");
        String word = sc.nextLine();

        // push characters to stack
        for (int i = 0; i < word.length(); i++) {
            stack.push(word.charAt(i));
        }

        String reverse = "";

        // pop characters from stack
        while (!stack.isEmpty()) {
            reverse = reverse + stack.pop();
        }

        if (word.equals(reverse)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

        sc.close();
    }
}