// Class: CMSC: 203
// Instructor: Taveer, Ashique
//Due: 2/16/2024
//I pledge that I have completed the programming assignment 
//* independently. I have not copied the code from a student or   * any source. I have not given my code to any student.
// Name: Mihali Tsinonis


import java.util.Scanner;
import java.util.Random;

public class  ESPGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Constants for colors
        final String[] colors = {"Red", "Green", "Blue", "Orange", "Yellow"};
        int correctGuesses = 0;

        // User input for name, MC M#, and self-description
        System.out.println("Enter your name:");
        String name = scanner.nextLine();
        System.out.println("Describe yourself in a few words:");
        String description = scanner.nextLine();

        // Game starts
        System.out.println("Guess the color (Red, Green, Blue, Orange, Yellow). Type 'exit' to quit.");
        int i = 0;
        while (i < 11) {
            int index = random.nextInt(colors.length);
            String correctColor = colors[index];
            System.out.print("Round " + (i+1) + ": ");
            String userGuess = scanner.nextLine();

            // Check if user wants to exit
            if(userGuess.equalsIgnoreCase("exit")) {
                break;
            }

            // Validate user guess
            boolean validGuess = false;
            for (String color : colors) {
                if (userGuess.equalsIgnoreCase(color)) {
                    validGuess = true;
                    break;
                }
            }
            if (!validGuess) {
                System.out.println("Invalid color. Please guess again.");
                continue;
            }

            // Check for correct guess
            if (userGuess.equalsIgnoreCase(correctColor)) {
                System.out.println("Correct!");
                correctGuesses++;
            } else {
                System.out.println("Incorrect! The correct color was " + correctColor + ".");
            }
            i++;
        }

        // Summary of results
        System.out.println("Game Over! You had " + correctGuesses + " correct guesses.");
        System.out.println("User Info:");
        System.out.println("Name: " + name);
        System.out.println("Description: " + description);

        scanner.close();
    }
}
