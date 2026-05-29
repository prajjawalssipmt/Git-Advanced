public class PalindromeChecker {

    // Method to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        if (str == null) {
            return false;
        }

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            // Compare characters at both pointers
            if (str.charAt(left) != str.charAt(right)) {
                return false; // Not a palindrome if characters mismatch
            }
            left++;
            right--;
        }
        return true; // Palindrome verified
    }

    public static void main(String[] args) {
        String test1 = "radar";
        String test2 = "hello";

        System.out.println(test1 + " is palindrome? " + isPalindrome(test1)); // true
        System.out.println(test2 + " is palindrome? " + isPalindrome(test2)); // false
    }
}