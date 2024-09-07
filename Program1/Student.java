package Task4.Program1;

public class Student {
    private String name;
    private int rollNo;
    private int age;
    private String course;

    // Paramaterise constructor to initialize the values
    public Student(int rollNo, String name, int age, String course) throws AgeNotWithinRangeException, NameNotValidException {
        this.name = name;
        this.rollNo = rollNo;
        this.age = age;
        this.course = course;
        // Check if age is within the range of 15 to 21
        if (age < 15 || age > 21) {
            throw new AgeNotWithinRangeException("Age is not within range (15-21).");
        }

        // Check if name contains numbers or special symbols
        if (!name.matches("[a-zA-Z]+")) {
            throw new NameNotValidException("Name contains invalid characters. Only alphabets are allowed.");
        }
    }

    // Method to display student details
    public void displayStudentDetails() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }

    public static void main(String[] args) {
        try {
            // Valid student creation
            Student student1 = new Student(101, "Ramesh", 18, "Computer Science");
            student1.displayStudentDetails();

            // Invalid age
            Student student2 = new Student(102, "Suresh", 25, "Electrical Engineering");
            student2.displayStudentDetails();

        } catch (AgeNotWithinRangeException | NameNotValidException e) {
            e.printStackTrace();
            System.out.println("Error: " + e.getMessage());
        }

        try {
            // Invalid name with special characters
            Student student3 = new Student(103, "An!ta", 19, "Mechanical Engineering");
            student3.displayStudentDetails();

        } catch (AgeNotWithinRangeException | NameNotValidException e) {
            e.printStackTrace();
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("To check if this line is getting executed");

    }
}

// Custom Exception for Invalid Name
class NameNotValidException extends Exception {
    public NameNotValidException(String message) {
        // passes the exception message onto the parent constructor
        super(message);
    }
}

// Custom Exception for Age Not Within Range
class AgeNotWithinRangeException extends Exception {
    public AgeNotWithinRangeException(String message) {
        // passes the exception message onto the parent constructor
        super(message);
    }
}
