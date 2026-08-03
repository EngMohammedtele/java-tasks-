

import java.util.Scanner ;
public class TriangleCalculator {
    public static void main(String[] args) {
        double area = 0;
        double Perimeter = 0;
        double base = 0;
        double height = 0;
        double length1 = 0;
        double length2 = 0;
        double length3 = 0;
        String triangleType = "";
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the base: ");
        base = input.nextDouble();

        System.out.print("Enter the height: ");
        height = input.nextDouble();

        System.out.print("Enter length1: ");
        length1 = input.nextDouble();

        System.out.print("Enter length2: ");
        length2 = input.nextDouble();

        System.out.print("Enter length3: ");
        length3 = input.nextDouble();

        if (base <= 0 || height <= 0 || length1 <= 0 || length2<= 0 || length3 <= 0) {
            System.out.println("Invalid input. All values must be greater than zero.");
        }else{
            area = (base * height) / 2;
            Perimeter = (length1 + length2 + length3);
            if (length1 == length2 && length2 == length3) {
            triangleType = "Equilateral Triangle";
        }else if (length1 == length2 || length1 == length3 || length2 == length3) {
            triangleType = "Isosceles Triangle";
        } else {
            triangleType = "Scalene Triangle";
        }

        // Display the results
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + Perimeter);
        System.out.println("Triangle Type: " + triangleType);
    }
}}
