import java.util.ArrayList;
import java.util.List;
public class NumberListStatistics {
        public static void main(String[] args) {
            List<Integer> Numbers = new ArrayList<>();
            Numbers.add(1);
            Numbers.add(3);
            Numbers.add(-7);
            Numbers.add(-5);
            Numbers.add(22);
            Numbers.add(-90);
            Numbers.add(4);
            Numbers.add(43);
            Numbers.add(-100);
            Numbers.add(12);
            Numbers.add(65);
            Numbers.add(-65);
            Numbers.add(-77);
            Numbers.add(32);
            Numbers.add(88);
            Numbers.add(-642);
            Numbers.add(898);
            Numbers.add(3565);
            Numbers.add(1600);
            Numbers.add(122);
            int evenCount = 0;
            int oddCount = 0;
            int positiveCount = 0;
            int negativeCount = 0;
            int sum = 0;
            int largest = Numbers.get(0);
            int smallest = Numbers.get(0);
            for(int Number : Numbers){
                sum = sum + Number;
            if(Number %2==0) {
                evenCount++;
            } else {
                oddCount++;
                if (Number > 0) {
                    positiveCount++;
                } else if (Number < 0) {
                    negativeCount++;

                    if (Number > largest) {
                        largest = Number;
                    }
                    if (Number < smallest) {
                        smallest = Number;
                    }
                }
//
            }

        }
            System.out.println("Numbers: " + Numbers);
            System.out.println("Total Sum: " + sum);
            System.out.println("Even Numbers: " + evenCount);
            System.out.println("Odd Numbers: " + oddCount);
            System.out.println("Positive Numbers: " + positiveCount);
            System.out.println("Negative Numbers: " + negativeCount);
            System.out.println("Largest Number: " + largest);
            System.out.println("Smallest Number: " + smallest);}}




