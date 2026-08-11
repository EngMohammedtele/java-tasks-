public class Task382 {

    static boolean isEven(int n) {

        if (n == 0) {
            return true;
        }

        if (n == 1) {
            return false;
        }

        return isEven(n - 2);
    }

    public static void main(String[] args) {

        IO.println(isEven(0));
        IO.println(isEven(8));
        IO.println(isEven(7));
        IO.println(isEven(15));
        IO.println(isEven(100));
    }
}