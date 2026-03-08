import java.util.Scanner;
import java.util.LinkedList;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        LinkedList<Character> list = new LinkedList<>();

        System.out.println("Enter a word:");
        String word = sc.nextLine();

        // add characters to linked list
        for (int i = 0; i < word.length(); i++) {
            list.add(word.charAt(i));
        }

        boolean isPalindrome = true;

        int start = 0;
        int end = list.size() - 1;

        while (start < end) {

            if (list.get(start) != list.get(end)) {
                isPalindrome = false;
                break;
            }

            start++;
            end--;
        }

        if (isPalindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

        sc.close();
    }
}