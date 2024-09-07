package Task4.Program2;

import java.util.Scanner;

public class Voter {
    private int voterID;
    private String name;
    private int age;

    // Parameterized constructor to initialize values
    public Voter(int voterID, String name, int age) throws InvalidVoterAgeException {
        if (age < 18) {
            throw new InvalidVoterAgeException("invalid age for voter");
        }
        this.voterID = voterID;
        this.name = name;
        this.age = age;
    }

    public int getVoterID() {
        return voterID;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name");
        String name = scanner.nextLine();
        System.out.println("Enter voterID");
        int id = scanner.nextInt();
        System.out.println("Enter age");
        int age = scanner.nextInt();
        try {
            Voter voter = new Voter(id, name, age);
        } catch (InvalidVoterAgeException e) {
            // to print the error in terminal
            e.printStackTrace();
            // to print the custom error message
            System.out.println(e.getMessage());
        }
        System.out.println("To check if this line is getting executed");
    }
}

// Custom exception class
class InvalidVoterAgeException extends Exception {
    InvalidVoterAgeException(String message) {
        super(message);
    }

}