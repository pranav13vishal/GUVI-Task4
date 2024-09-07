package Task4.Program4;

import java.util.HashMap;
import java.util.Scanner;

public class StudentGrades {
    // HashMap to store student names and grades
    private HashMap<String, Integer> studentGrade = new HashMap<>();

    // Method to add a new student and grade
    public void addStudent(String name, int grade) {
        studentGrade.put(name, grade);
        System.out.println("Student " + name + " added with grade " + grade);
    }

    // Method to remove a student by name
    public void removeStudent(String name) {
        if (studentGrade.containsKey(name)) {
            studentGrade.remove(name);
            System.out.println("Student " + name + " removed.");
        } else {
            System.out.println("Student not found.");
        }
    }

    // Method to display a student's grade by name
    public void displayGrade(String name) {
        if (studentGrade.containsKey(name)) {
            System.out.println("Grade for " + name + " is " + studentGrade.get(name));
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentGrades studentGrades = new StudentGrades();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Display Student Grade");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter grade: ");
                    int grade = scanner.nextInt();
                    studentGrades.addStudent(name, grade);
                    break;

                case 2:
                    System.out.print("Enter student name to remove: ");
                    String removeName = scanner.nextLine();
                    studentGrades.removeStudent(removeName);
                    break;

                case 3:
                    System.out.print("Enter student name to display grade: ");
                    String displayName = scanner.nextLine();
                    studentGrades.displayGrade(displayName);
                    break;

                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
