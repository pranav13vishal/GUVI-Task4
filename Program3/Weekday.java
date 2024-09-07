package Task4.Program3;

import java.util.Scanner;

public class Weekday {
    public static void main(String[] args) {

        // Array to store the names of weekdays
        String[] weekdays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        // Get the input from the user
        int num = scanner.nextInt();

        try {
            // Print the corresponding day from the array
            System.out.println("Day: " + weekdays[num]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handle invalid index (outside the range 0-6)
            e.printStackTrace();
            System.out.println("Error: Invalid day number. Please enter a number between 0 and 6.");
        } catch (Exception e) {
            // Handle invalid input (non number input)
            System.out.println("Error: Please enter a valid number.");
        }

        System.out.println("To check if this line is getting executed");


    }
}
