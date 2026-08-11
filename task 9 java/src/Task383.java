public class Task383 {

    static boolean isPalindrome(String text) {

        if (text.length() <= 1) {
            return true;
        }

        if (text.charAt(0) != text.charAt(text.length() - 1)) {
            return false;
        }

        return isPalindrome(text.substring(1, text.length() - 1));
    }

    public static void main(String[] args) {

        IO.println(isPalindrome("level"));
        IO.println(isPalindrome("madam"));
        IO.println(isPalindrome("hello"));
        IO.println(isPalindrome("a"));
    }
}