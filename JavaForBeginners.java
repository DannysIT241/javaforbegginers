import java.util.Scanner;

public class JavaForBeginners {

    public static void main(String[] args) {
        // Welcome message
        System.out.println("Welcome to Java for Beginners!");

        // Variables and Data Types
        int age = 25;
        double height = 5.9;
        String name = "John";

        // User Input/*
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String userInputName = scanner.nextLine();
        System.out.print("Please enter your age: ");
        int userInputAge = scanner.nextInt();

        // Conditional Statements
        if (userInputAge >= 18) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are a minor.");
        }

        // Loops
        System.out.println("Counting from 1 to 10:");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Goodbye message
        System.out.println("Thank you for learning Java with us. Happy coding!");
    }
}
