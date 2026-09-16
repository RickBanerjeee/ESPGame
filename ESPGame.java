package Assignment1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

/*
 * Class: CMSC203
 * Instructor: Ahmed Tarek
 * Description: This program tests the user's extrasensory perception
 *              by having the user guess randomly selected colors.
 * Due: 09/16/2026
 * Platform/compiler: Eclipse / Java
 *
 * I pledge that I have completed the programming assignment
 * independently. I have not copied the code from a student or
 * any source. I have not given my code to any student.
 *
 * Print your Name here: Rick Banerjee
 */

public class ESPGame {

    public static void main(String[] args) throws FileNotFoundException {

        // Constants
        final String FILE_NAME = "colors.txt";
        final String OUTPUT_FILE = "EspGameResults.txt";

        final String MENU_1 = "1";
        final String MENU_2 = "2";
        final String MENU_3 = "3";
        final String MENU_4 = "4";

        final int SIXTEEN_COLORS = 16;
        final int TEN_COLORS = 10;
        final int FIVE_COLORS = 5;
        final int TOTAL_ROUNDS = 3;

        // Color constants
        final String COLOR_1 = "black";
        final String COLOR_2 = "white";
        final String COLOR_3 = "gray";
        final String COLOR_4 = "silver";
        final String COLOR_5 = "maroon";
        final String COLOR_6 = "red";
        final String COLOR_7 = "purple";
        final String COLOR_8 = "fuchsia";
        final String COLOR_9 = "green";
        final String COLOR_10 = "lime";
        final String COLOR_11 = "olive";
        final String COLOR_12 = "yellow";
        final String COLOR_13 = "navy";
        final String COLOR_14 = "blue";
        final String COLOR_15 = "teal";
        final String COLOR_16 = "aqua";

        Scanner keyboard = new Scanner(System.in);
        Random random = new Random();

        String color1 = "";
        String color2 = "";
        String color3 = "";
        String color4 = "";
        String color5 = "";
        String color6 = "";
        String color7 = "";
        String color8 = "";
        String color9 = "";
        String color10 = "";
        String color11 = "";
        String color12 = "";
        String color13 = "";
        String color14 = "";
        String color15 = "";
        String color16 = "";

        String option = "";
        String filename = "";
        String guess = "";
        String playAgain = "";

        int numberOfColors = 0;
        int randomNumber = 0;
        int correctGuesses = 0;
        int round = 0;

        String selectedColor = "";

        System.out.println("Welcome to ESP - extrasensory perception!");

        do {

            System.out.println();
            System.out.println("Would you please choose one of the 4 options from the menu:");
            System.out.println();
            System.out.println("1. read and display on the screen first 16 names of colors from a file colors.txt, so the player can select one of them names of colors.");
            System.out.println("2. read and display on the screen first 10 names of colors from a file colors.txt, so the player can select one of them names of colors.");
            System.out.println("3. read and display on the screen first 5 names of colors from a file colors.txt, so the player can select one of them names of colors.");
            System.out.println("4. Exit from a program");
            System.out.println();

            System.out.print("Enter the option: ");
            option = keyboard.nextLine().trim();

            while (!option.equals(MENU_1)
                    && !option.equals(MENU_2)
                    && !option.equals(MENU_3)
                    && !option.equals(MENU_4)) {

                System.out.println("Invalid option. Please enter 1, 2, 3, or 4.");
                System.out.print("Enter the option: ");
                option = keyboard.nextLine().trim();
            }

            if (option.equals(MENU_4)) {
                break;
            }

            if (option.equals(MENU_1)) {
                numberOfColors = SIXTEEN_COLORS;
            } else if (option.equals(MENU_2)) {
                numberOfColors = TEN_COLORS;
            } else {
                numberOfColors = FIVE_COLORS;
            }

            System.out.print("Enter the filename: ");
            filename = keyboard.nextLine().trim();

            File colorFile = new File(filename);

            while (!colorFile.exists()) {
                System.out.println("File not found.");
                System.out.print("Enter the filename: ");
                filename = keyboard.nextLine().trim();
                colorFile = new File(filename);
            }

            Scanner fileInput = new Scanner(colorFile);

            // Read the first 16 colors from the file.
            if (fileInput.hasNextLine()) {
                color1 = fileInput.nextLine().trim();
            }

            if (fileInput.hasNextLine()) {
                color2 = fileInput.nextLine().trim();
            }

            if (fileInput.hasNextLine()) {
                color3 = fileInput.nextLine().trim();
            }

            if (fileInput.hasNextLine()) {
                color4 = fileInput.nextLine().trim();
            }

            if (fileInput.hasNextLine()) {
                color5 = fileInput.nextLine().trim();
            }

            if (fileInput.hasNextLine()) {
                color6 = fileInput.nextLine().trim();
            }

            if (fileInput.hasNextLine()) {
                color7 = fileInput.nextLine().trim();
            }

            if (fileInput.hasNextLine()) {
                color8 = fileInput.nextLine().trim();
            }

            if (fileInput.hasNextLine()) {
                color9 = fileInput.nextLine().trim();
            }

            if (fileInput.hasNextLine()) {
                color10 = fileInput.nextLine().trim();
            }

            if (fileInput.hasNextLine()) {
                color11 = fileInput.nextLine().trim();
            }

            if (fileInput.hasNextLine()) {
                color12 = fileInput.nextLine().trim();
            }

            if (fileInput.hasNextLine()) {
                color13 = fileInput.nextLine().trim();
            }

            if (fileInput.hasNextLine()) {
                color14 = fileInput.nextLine().trim();
            }

            if (fileInput.hasNextLine()) {
                color15 = fileInput.nextLine().trim();
            }

            if (fileInput.hasNextLine()) {
                color16 = fileInput.nextLine().trim();
            }

            fileInput.close();

            System.out.println();
            System.out.println("There are " + numberOfColors + " colors from a file:");

            if (numberOfColors >= 1) {
                System.out.println("1 " + color1);
            }

            if (numberOfColors >= 2) {
                System.out.println("2 " + color2);
            }

            if (numberOfColors >= 3) {
                System.out.println("3 " + color3);
            }

            if (numberOfColors >= 4) {
                System.out.println("4 " + color4);
            }

            if (numberOfColors >= 5) {
                System.out.println("5 " + color5);
            }

            if (numberOfColors >= 6) {
                System.out.println("6 " + color6);
            }

            if (numberOfColors >= 7) {
                System.out.println("7 " + color7);
            }

            if (numberOfColors >= 8) {
                System.out.println("8 " + color8);
            }

            if (numberOfColors >= 9) {
                System.out.println("9 " + color9);
            }

            if (numberOfColors >= 10) {
                System.out.println("10 " + color10);
            }

            if (numberOfColors >= 11) {
                System.out.println("11 " + color11);
            }

            if (numberOfColors >= 12) {
                System.out.println("12 " + color12);
            }

            if (numberOfColors >= 13) {
                System.out.println("13 " + color13);
            }

            if (numberOfColors >= 14) {
                System.out.println("14 " + color14);
            }

            if (numberOfColors >= 15) {
                System.out.println("15 " + color15);
            }

            if (numberOfColors >= 16) {
                System.out.println("16 " + color16);
            }

            correctGuesses = 0;

            for (round = 1; round <= TOTAL_ROUNDS; round++) {

                System.out.println();
                System.out.println("Round " + round);
                System.out.println();
                System.out.println("I am thinking of a color.");
                System.out.println("Is it one of the list of colors above?");
                System.out.print("Enter your guess: ");

                guess = keyboard.nextLine().trim();

                // Validate the user's color.
                boolean validGuess = false;

                while (!validGuess) {

                    if (guess.equalsIgnoreCase(color1)
                            || (numberOfColors >= 2 && guess.equalsIgnoreCase(color2))
                            || (numberOfColors >= 3 && guess.equalsIgnoreCase(color3))
                            || (numberOfColors >= 4 && guess.equalsIgnoreCase(color4))
                            || (numberOfColors >= 5 && guess.equalsIgnoreCase(color5))
                            || (numberOfColors >= 6 && guess.equalsIgnoreCase(color6))
                            || (numberOfColors >= 7 && guess.equalsIgnoreCase(color7))
                            || (numberOfColors >= 8 && guess.equalsIgnoreCase(color8))
                            || (numberOfColors >= 9 && guess.equalsIgnoreCase(color9))
                            || (numberOfColors >= 10 && guess.equalsIgnoreCase(color10))
                            || (numberOfColors >= 11 && guess.equalsIgnoreCase(color11))
                            || (numberOfColors >= 12 && guess.equalsIgnoreCase(color12))
                            || (numberOfColors >= 13 && guess.equalsIgnoreCase(color13))
                            || (numberOfColors >= 14 && guess.equalsIgnoreCase(color14))
                            || (numberOfColors >= 15 && guess.equalsIgnoreCase(color15))
                            || (numberOfColors >= 16 && guess.equalsIgnoreCase(color16))) {

                        validGuess = true;

                    } else {

                        System.out.println("Invalid color. Please enter one of the colors displayed above.");
                        System.out.print("Enter your guess: ");
                        guess = keyboard.nextLine().trim();
                    }
                }

                // Generate a random number from 1 through the selected number of colors.
                randomNumber = random.nextInt(numberOfColors) + 1;

                if (randomNumber == 1) {
                    selectedColor = color1;
                } else if (randomNumber == 2) {
                    selectedColor = color2;
                } else if (randomNumber == 3) {
                    selectedColor = color3;
                } else if (randomNumber == 4) {
                    selectedColor = color4;
                } else if (randomNumber == 5) {
                    selectedColor = color5;
                } else if (randomNumber == 6) {
                    selectedColor = color6;
                } else if (randomNumber == 7) {
                    selectedColor = color7;
                } else if (randomNumber == 8) {
                    selectedColor = color8;
                } else if (randomNumber == 9) {
                    selectedColor = color9;
                } else if (randomNumber == 10) {
                    selectedColor = color10;
                } else if (randomNumber == 11) {
                    selectedColor = color11;
                } else if (randomNumber == 12) {
                    selectedColor = color12;
                } else if (randomNumber == 13) {
                    selectedColor = color13;
                } else if (randomNumber == 14) {
                    selectedColor = color14;
                } else if (randomNumber == 15) {
                    selectedColor = color15;
                } else {
                    selectedColor = color16;
                }

                System.out.println();
                System.out.println("I was thinking of " + selectedColor + ".");

                if (guess.equalsIgnoreCase(selectedColor)) {
                    correctGuesses++;
                }
            }

            System.out.println();
            System.out.println("Game Over");
            System.out.println();
            System.out.println("You guessed " + correctGuesses
                    + " out of " + TOTAL_ROUNDS + " colors correctly.");

            System.out.println();
            System.out.print("Would you like to continue a Game? Type Yes/No: ");
            playAgain = keyboard.nextLine().trim();

            while (!playAgain.equalsIgnoreCase("Yes")
                    && !playAgain.equalsIgnoreCase("No")) {

                System.out.println("Please enter Yes or No.");
                System.out.print("Would you like to continue a Game? Type Yes/No: ");
                playAgain = keyboard.nextLine().trim();
            }

        } while (playAgain.equalsIgnoreCase("Yes"));

        // Get user information when the game is finished.
        System.out.println();
        System.out.print("Enter your name: ");
        String userName = keyboard.nextLine().trim();

        System.out.print("Describe yourself: ");
        String userDescription = keyboard.nextLine().trim();

        System.out.print("Due Date: ");
        String dueDate = keyboard.nextLine().trim();

        System.out.println();
        System.out.println("Due Date: " + dueDate);
        System.out.println("Username: " + userName);
        System.out.println("User Description: " + userDescription);
        System.out.println("Date: " + dueDate);

        // Write the final results to the output file.
        PrintWriter output = new PrintWriter(OUTPUT_FILE);

        output.println("Game Over");
        output.println("You guessed " + correctGuesses
                + " out of " + TOTAL_ROUNDS + " colors correctly.");
        output.println("Due Date: " + dueDate);
        output.println("Username: " + userName);
        output.println("User Description: " + userDescription);
        output.println("Date: " + dueDate);

        output.close();

        keyboard.close();

        System.out.println();
        System.out.println("Results have been written to " + OUTPUT_FILE);
    }
}