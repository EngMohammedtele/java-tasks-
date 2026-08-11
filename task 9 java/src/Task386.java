public class Task386 {

    static int findMax(int[] numbers, int index) {

        if (index == numbers.length - 1) {
            return numbers[index];
        }

        int maxOfRest = findMax(numbers, index + 1);

        if (numbers[index] > maxOfRest) {
            return numbers[index];
        } else {
            return maxOfRest;
        }
    }

    public static void main(String[] args) {

        int[] numbers1 = {3, 7, 2, 9, 4};
        int[] numbers2 = {1, 1, 1};
        int[] numbers3 = {-5, -2, -8};
        int[] numbers4 = {42};

        IO.println(findMax(numbers1, 0));
        IO.println(findMax(numbers2, 0));
        IO.println(findMax(numbers3, 0));
        IO.println(findMax(numbers4, 0));
    }
}