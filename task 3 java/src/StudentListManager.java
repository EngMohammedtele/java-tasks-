import java.util.ArrayList;
import java.util.List;
public class StudentListManager {
    public static void main(String[] args) {
        List<String> students = new ArrayList<>();
        students.add("mohed");
        students.add("Ahmed");
        students.add("Sara");
        students.add("Noor");
        students.add("Fatima");
        students.add("Omar");
        students.add("said");
        students.add("Hassan");
        students.add("saif");
        students.add("Aisha");
        System.out.println("Student List:");
        for (String student : students) {
            System.out.println(student);
        }
        System.out.println("Total Students: " + students.size());
        System.out.println("First Student: " + students.get(0));
        System.out.println("Last Student: " + students.get(students.size() - 1));
        if (students.contains("Sara")) {
            System.out.println("Sara is in the list.");
        } else {
            System.out.println("Sara is not in the list.");
        }
        students.remove("Omar");
        System.out.println("Updated Student List:");

        for (String student : students) {
            System.out.println(student);
        }

    }
}