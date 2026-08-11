import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    static List<Sellable> stock = new ArrayList<>();

    public static Product addProduct() {

        Product product = new Product(0, 1);

        IO.println("Enter product name: ");
        product.setName(scanner.nextLine());

        IO.println("Enter price: ");
        product.setPrice(scanner.nextDouble());

        IO.println("Enter quantity: ");
        product.setQuantity(scanner.nextInt());
        scanner.nextLine();

        return product;
    }

    public static Service addService() {

        Service service = new Service();

        IO.println("Enter service name: ");
        service.setName(scanner.nextLine());

        IO.println("Enter price: ");
        service.setPrice(scanner.nextDouble());

        IO.println("Enter minutes: ");
        service.setMinutes(scanner.nextInt());
        scanner.nextLine();

        return service;
    }

    public static void menu() {

        boolean exit = false;

        while (!exit) {

            IO.println("\n--- SHOP MENU ---");
            IO.println("1. Add product");
            IO.println("2. Add service");
            IO.println("3. Print stock");
           IO.println("4. Total value");
            IO.println("5. Exit");
            IO.print("Choose: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    stock.add(addProduct());
                    break;

                case 2:
                    stock.add(addService());
                    break;

                case 3:
                    for (Sellable item : stock) {
                        item.printAllInfo();
                    }
                    break;

                case 4:
                    double total = 0;

                    for (Sellable item : stock) {
                        total += item.getPrice();
                    }

                    System.out.println("Total value: " + total + " OMR");
                    break;

                case 5:
                    exit = true;
                    System.out.println("Goodbye.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    public static void main(String[] args) {

        Product product = new Product(-5, 12);

        product.setName("Rice 5kg");

        System.out.println("--- Single item created at startup ---");
        product.printAllInfo();

        stock.add(product);

        menu();
    }
}