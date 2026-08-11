public class Task375 {

    static void countDownUp(int n) {

        if (n <= 0) {
            return;
        }

        IO.println(n);

        countDownUp(n - 1);

        IO.println(n);
    }

    public static void main(String[] args) {

        countDownUp(3);
    }
}