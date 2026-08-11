public class Task385 {

    static int sumArray(int[] numbers, int index) {

        if (index == numbers.length) {
            return 0;
        }

        return numbers[index] + sumArray(numbers, index + 1);
    }

    public static void main(String[] args) {

        int[] numbers1 = {1, 2, 3};
        int[] numbers2 = {10, 20, 30, 40};
        int[] numbers3 = {5};
        int[] numbers4 = {};

        IO.println(sumArray(numbers1, 0));
        IO.println(sumArray(numbers2, 0));
        IO.println(sumArray(numbers3, 0));
        IO.println(sumArray(numbers4, 0));
    }
}