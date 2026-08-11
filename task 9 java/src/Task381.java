public class Task381 {

    static boolean isPowerOfTwo(int n) {

        if (n == 1) {
            return true;
        }

        if (n == 0 || n % 2 != 0) {
            return false;
        }

        return isPowerOfTwo(n / 2);
    }

    public static void main(String[] args) {

        IO.println(isPowerOfTwo(1));
        IO.println(isPowerOfTwo(8));
        IO.println(isPowerOfTwo(16));
        IO.println(isPowerOfTwo(6));
        IO.println(isPowerOfTwo(20));
    }
}