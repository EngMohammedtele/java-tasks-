public class Task376 {

    static void printUp(int n) {

        if (n <= 0) {
            return;
        }

        printUp(n - 1);

       IO.println(n);
    }

    public static void main(String[] args) {

        printUp(5);
    }
}