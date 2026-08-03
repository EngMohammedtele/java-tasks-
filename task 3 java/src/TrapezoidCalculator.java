
import java.util.Scanner ;
public class TrapezoidCalculator {
    public static void main(String[] args) {
        double area = 0 ;
        double Perimeter =0;
        double length = 0;
        double base1=0;
        double base2=0;
        double height=0;
        double leg1=0;
        double leg2=0;
        String trapezoid = "";
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length: ");
        length = input.nextDouble();
        System.out.print("Enter the base1: ");
        base1= input.nextDouble();
        System.out.print("Enter base2: ");
        base2 = input.nextDouble();
        System.out.print("Enter height: ");
        height = input.nextDouble();
        System.out.print("Enter leg1: ");
        leg1 = input.nextDouble();
        System.out.print("Enter leg2: ");
        leg2 = input.nextDouble();
        if (length<= 0 || base1<= 0 || base2 <= 0 || height<= 0 || leg1<= 0 || leg2<= 0) {
            System.out.println("Invalid input. All values must be greater than zero.");
        }else {
            area = ((base1 + base2) * height) / 2;
            Perimeter = base1 + base2 + leg1 + leg2;
            if (Perimeter < 30) {
            trapezoid = "Small Trapezoid";
        }else if (Perimeter>= 30 && Perimeter <= 60){
        trapezoid ="Medium Trapezoid";
                } else {
                   trapezoid = "Large Trapezoid";
                }
            System.out.println("Area: " + area);
            System.out.println("Perimeter: " + Perimeter);
            System.out.println("Classification: " + trapezoid );
                }
        }}

