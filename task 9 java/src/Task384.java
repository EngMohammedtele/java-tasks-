public class Task384 {

    static int countChar(String text, char target) {

        if (text.isEmpty()) {
            return 0;
        }

        int count = 0;

        if (text.charAt(0) == target) {
            count = 1;
        }

        return count + countChar(text.substring(1), target);
    }

    public static void main(String[] args) {

        IO.println(countChar("banana", 'a'));
        IO.println(countChar("hello", 'l'));
        IO.println(countChar("apple", 'z'));
        IO.println(countChar("mississippi", 's'));
    }
}