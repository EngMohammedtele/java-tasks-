import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ClinicQueue {

    private static final Scanner scanner = new Scanner(System.in);
    private static final List<Attendable> queue = new ArrayList<>();

    public static void main(String[] args) {
        startUp();
        runMenu();
    }

    private static void startUp() {
        IO.println("--- Single item created at startup ---");
        BookedPatient firstPatient = new BookedPatient("09:30");
        firstPatient.setName("Sarah Bennett");
        firstPatient.setAge(150); // invalid on purpose, to prove setAge() catches it
        firstPatient.printAllInfo();
        queue.add(firstPatient);
    }

    private static void runMenu() {
        boolean exit = false;
        while (exit == false) {
            IO.println("");
            IO.println("--- CLINIC MENU ---");
            IO.println("1. Add booked   2. Add walk-in   3. Print queue   4. Longest wait   5. Exit");
            IO.print("Choose: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    queue.add(addBooked());
                    IO.println("Added.");
                    break;
                case 2:
                    queue.add(addWalkIn());
                    IO.println("Added.");
                    break;
                case 3:
                    printQueue();
                    break;
                case 4:
                    showLongestWait();
                    break;
                case 5:
                    exit = true;
                    IO.println("Goodbye.");
                    break;
                default:
                    IO.println("Not a valid option.");
            }
        }
    }

    private static BookedPatient addBooked() {
        IO.print("Enter slot time: ");
        String slotTime = IO.readln();
        BookedPatient patient = new BookedPatient(slotTime);

        IO.print("Enter name: ");
        String name = IO.readln();
        patient.setName(name);

        IO.print("Enter age: ");
        int age = scanner.nextInt();
        patient.setAge(age);

        return patient;
    }

    private static WalkInVisitor addWalkIn() {
        IO.print("Enter name: ");
        String name = IO.readln();
        IO.print("Enter age: ");
        int age = scanner.nextInt();
        IO.print("Enter arrival order: ");
        int arrivalOrder = scanner.nextInt();

        WalkInVisitor visitor = new WalkInVisitor();
        visitor.setName(name);
        visitor.setAge(age);
        visitor.setArrivalOrder(arrivalOrder);
        return visitor;
    }

    private static void printQueue() {
        int index = 1;
        for (Attendable person : queue) {
            IO.print(index + ". ");
            person.printAllInfo();
            index++;
        }
    }

    private static void showLongestWait() {
        Attendable longestWaiter = null;
        for (Attendable person : queue) {
            if (longestWaiter == null || person.getWaitMinutes() > longestWaiter.getWaitMinutes()) {
                longestWaiter = person;
            }
        }
        if (longestWaiter != null) {
            IO.println("Longest wait: " + longestWaiter.getName() + " (" + longestWaiter.getWaitMinutes() + " min)");
        }
    }
}