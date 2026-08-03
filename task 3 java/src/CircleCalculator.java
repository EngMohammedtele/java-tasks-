import java.util.Scanner ;

public class CircleCalculator {
    public static void main(String[] args) {
        double area = 0;
        double circumference = 0;
        double radius = 0;
        double pi = 3.14;
        String classification = "";
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        radius = input.nextDouble();
        if (radius <= 0) {
            IO.println("invalid radius Radius must be greater than zero");
        }
        area = pi * radius * radius;
        circumference = 2 * pi * radius;
        if (radius < 5) {
            classification = "Small Circle";
        } else if (radius <= 15) {
            classification = "Medium Circle";
        } else {
            classification = "Large Circle";
        }
        IO.println("area : " + area);
        IO.println("circumference : " + circumference);
        IO.println("radius : " + radius);
        IO.println("classification : " + classification);
    }}

