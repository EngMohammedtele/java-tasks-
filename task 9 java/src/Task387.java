public class Task387 {

    static int countVowels(String text) {

        if (text.isEmpty()) {
            return 0;
        }

        char first = text.charAt(0);

        int count = 0;

        if (first == 'a' ||
                first == 'e' ||
                first == 'i' ||
                first == 'o' ||
                first == 'u') {

            count = 1;
        }

        return count + countVowels(text.substring(1));
    }

    public static void main(String[] args) {

        IO.println(countVowels("hello"));
        IO.println(countVowels("programming"));
        IO.println(countVowels("sky"));
        IO.println(countVowels("aeiou"));
    }
}