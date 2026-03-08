import java.util.Scanner;
import java.util.Stack;

public class PalindromeCheckerApp {

    // Reverse method
    public static boolean reverseCheck(String word) {

        String reverse = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reverse += word.charAt(i);
        }

        return word.equals(reverse);
    }


    // Array method
    public static boolean arrayCheck(String word) {

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


    // Stack method
    public static boolean stackCheck(String word) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < word.length(); i++) {
            stack.push(word.charAt(i));
        }

        String reverse = "";

        while (!stack.isEmpty()) {
            reverse += stack.pop();
        }

        return word.equals(reverse);
    }


    // Recursive method
    public static boolean recursiveCheck(String word, int start, int end) {

        if (start >= end) {
            return true;
        }

        if (word.charAt(start) != word.charAt(end)) {
            return false;
        }

        return recursiveCheck(word, start + 1, end - 1);
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter text:");
        String word = sc.nextLine();


        long startTime;
        long endTime;


        // Reverse
        startTime = System.nanoTime();
        boolean r1 = reverseCheck(word);
        endTime = System.nanoTime();
        System.out.println("Reverse: " + r1 + " Time: " + (endTime - startTime));


        // Array
        startTime = System.nanoTime();
        boolean r2 = arrayCheck(word);
        endTime = System.nanoTime();
        System.out.println("Array: " + r2 + " Time: " + (endTime - startTime));


        // Stack
        startTime = System.nanoTime();
        boolean r3 = stackCheck(word);
        endTime = System.nanoTime();
        System.out.println("Stack: " + r3 + " Time: " + (endTime - startTime));


        // Recursion
        startTime = System.nanoTime();
        boolean r4 = recursiveCheck(word, 0, word.length() - 1);
        endTime = System.nanoTime();
        System.out.println("Recursion: " + r4 + " Time: " + (endTime - startTime));


        sc.close();
    }
}