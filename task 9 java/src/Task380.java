public class Task380 {

    static int sumDigits(int n) {

        if (n == 0) {
            return 0;
        }

        return (n % 10) + sumDigits(n / 10);
    }

    public static void main(String[] args) {

        IO.println(sumDigits(5));
        IO.println(sumDigits(123));
        IO.println(sumDigits(999));
        IO.println(sumDigits(4021));
    }
}