public class Task378 {

    static int multiply(int a, int b) {

        if (b == 0) {
            return 0;
        }

        return a + multiply(a, b - 1);
    }

    public static void main(String[] args) {

        IO.println(multiply(3, 4));
        IO.println(multiply(5, 2));
        IO.println(multiply(0, 9));
        IO.println(multiply(6, 1));
    }
}