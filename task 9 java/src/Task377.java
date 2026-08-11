public class Task377 {

    static int countDigits(int n) {

        if (n < 10) {
            return 1;
        }

        return 1 + countDigits(n / 10);
    }

    public static void main(String[] args) {

        IO.println(countDigits(7));
        IO.println(countDigits(45));
        IO.println(countDigits(1000));
        IO.println(countDigits(999999));
    }
}