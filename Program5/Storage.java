package Task4.Program5;

import java.util.Stack;

public class Storage {
    // Stack to store integers
    private Stack<Integer> stack = new Stack<>();

    // Method to add an element onto the stack
    public void addElement(int element) {
        stack.add(element);
        System.out.println("Pushed: " + element);

    }

    // Method to pop an element from the stack
    public void popElement() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty. Cannot pop element.");
        } else {
            System.out.println("Popped: " + stack.pop());
        }
    }

    // Method to display the stack
    public void displayStack() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Stack contents: " + stack);
        }
    }

    // Main method to test the IntegerStack functionality
    public static void main(String[] args) {
        Storage intStack = new Storage();

        // Pushing elements onto the stack
        intStack.addElement(10);
        intStack.addElement(20);
        intStack.addElement(30);

        System.out.println("Stack contents");

        // Display stack contents
        intStack.displayStack();

        System.out.println("Stack poping");

        // Popping elements from the stack
        intStack.popElement();
        intStack.popElement();

        System.out.println("Stack contents after poping");

        // Display stack after popping
        intStack.displayStack();

        // Trying to pop from an empty stack
        intStack.popElement();
        intStack.popElement();  // Should show an error
    }
}
