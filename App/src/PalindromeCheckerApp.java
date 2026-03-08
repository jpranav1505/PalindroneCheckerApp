public class PalindromeService {

    public boolean isPalindrome(String word) {

        word = word.toLowerCase().replaceAll(" ", "");

        int start = 0;
        int end = word.length() - 1;

        while (start < end) {

            if (word.charAt(start) != word.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }
}