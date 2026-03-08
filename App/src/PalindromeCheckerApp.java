import java.util.Scanner;

/* Strategy Interface */
interface PalindromeStrategy {
    boolean isPalindrome(String word);
}


/* Reverse Strategy */
class ReverseStrategy implements PalindromeStrategy {

    public boolean isPalindrome(String word) {

        String reverse = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reverse += word.charAt(i);
        }

        return word.equals(reverse);
    }
}


/* Array Strategy */
class ArrayStrategy implements PalindromeStrategy {

    public boolean isPalindrome(String word) {

        char[] arr = word.toCharArray();

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {

            if (arr[start] != arr[end]) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }
}


/* Stack Strategy */
class StackStrategy implements PalindromeStrategy {

    public boolean isPalindrome(String word) {

        java.util.Stack<Character> stack = new java.util.Stack<>();

        for (int i = 0; i < word.length(); i++) {
            stack.push(word.charAt(i));
        }

        String reverse = "";

        while (!stack.isEmpty()) {
            reverse += stack.pop();
        }

        return word.equals(reverse);
    }
}


/* Main Class */
public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter text:");
        String word = sc.nextLine();

        PalindromeStrategy strategy;

        // choose strategy here
        strategy = new ReverseStrategy();
        // strategy = new ArrayStrategy();
        // strategy = new StackStrategy();

        boolean result = strategy.isPalindrome(word);

        if (result) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

        sc.close();
    }
}