package ruttedbus.util;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public final class SimpleIO {

    /* Do not allow creation of Utility Class */
    private SimpleIO() throws IllegalAccessException {
        throw new IllegalAccessException("Utility class cannot be instantiated!");
    }

    /**
     * @return Integer entered in console
     */
    public static int readInt() {
        int input;
        Scanner scanner;
        while(true) {
            try {
                scanner = new Scanner(System.in);
                //Getting input, exception occurs here
                input = scanner.nextInt();
                break;
            }
            catch(InputMismatchException e) {
                // Use out stream instead of error stream, since error stream does not allow for consistent printing
                System.out.println("Illegal integer format.");
            }
        }
        scanner.close();
        return input;
    }

    /**
     * Prompts user to enter an integer, until a valid integer is entered. Uses default radix.
     * @param prompt Prompt printed to console on each attempt to enter integer
     * @return Integer entered in console
     */
    public static int readInt(String prompt) {
        int input;
        Scanner scanner;
        while(true) {
            try {
                scanner = new Scanner(System.in);
                System.out.print(prompt);
                //Getting input, exception occurs here
                input = scanner.nextInt();
                break;
            }
            catch(InputMismatchException e) {
                // Use out stream instead of error stream, since error stream does not allow for consistent printing
                System.out.println("Illegal integer format.");
            }
        }
        scanner.close();
        return input;
    }

    /**
     * @return Double entered in console
     */
    public static double readDouble() {
        double input;
        Scanner scanner;
        while(true) {
            try {
                scanner = new Scanner(System.in);
                //Getting input, exception occurs here
                input = scanner.nextDouble();
                break;
            }
            catch(InputMismatchException e) {
                // Use out stream instead of error stream, since error stream does not allow for consistent printing
                System.out.println("Illegal double format.");
            }
        }
        scanner.close();
        return input;
    }

    /**
     * @param prompt Prompts user to enter a double, until a valid double is entered.
     * @return Double entered in console
     */
    public static double readDouble(String prompt) {
        double input;
        Scanner scanner;
        while(true) {
            try {
                scanner = new Scanner(System.in);
                System.out.print(prompt);
                //Getting input, exception occurs here
                input = scanner.nextDouble();
                break;
            }
            catch(InputMismatchException e) {
                // Use out stream instead of error stream, since error stream does not allow for consistent printing
                System.out.println("Illegal double format.");
            }
        }
        scanner.close();
        return input;
    }

    /**
     * @return Boolean entered in console
     */
    public static boolean readBoolean() {
        boolean input;
        Scanner scanner;
        while(true) {
            try {
                scanner = new Scanner(System.in);
                //Getting input, exception occurs here
                input = scanner.nextBoolean();
                break;
            }
            catch(InputMismatchException e) {
                // Use out stream instead of error stream, since error stream does not allow for consistent printing
                System.out.println("Illegal boolean.");
            }
        }
        scanner.close();
        return input;
    }
    /**
     * Prompts user to enter an boolean, until a valid boolean is entered.
     * @param prompt Prompt printed to console on each attempt to enter a boolean
     * @return Boolean entered in console
     */
    public static boolean readBoolean(String prompt) {
        boolean input;
        Scanner scanner;
        while(true) {
            try {
                scanner = new Scanner(System.in);
                System.out.print(prompt);
                //Getting input, exception occurs here
                input = scanner.nextBoolean();
                break;
            }
            catch(InputMismatchException e) {
                // Use out stream instead of error stream, since error stream does not allow for consistent printing
                System.out.println("Illegal boolean.");
            }
        }
        scanner.close();
        return input;
    }

    /**
     * @return Entered string in console
      */
    public static String readLine() {
        String input;
        Scanner scanner;
        while(true) {
            try {
                scanner = new Scanner(System.in);
                //Getting input, exception occurs here
                input = scanner.nextLine();
                break;
            }
            catch(NoSuchElementException e) {
                // Use out stream instead of error stream, since error stream does not allow for consistent printing
                System.out.println("Empty line is invalid.");
            }
        }
        scanner.close();
        return input;
    }
    /**
     * Prompts user to enter a string.
     * @param prompt Prompt printed to console on each attempt to enter a string
     * @return String entered in console
     */
    public static String readLine(String prompt) {
        String input;
        Scanner scanner;
        while(true) {
            try {
                scanner = new Scanner(System.in);
                System.out.print(prompt);
                //Getting input, exception occurs here
                input = scanner.nextLine();
                break;
            }
            catch(NoSuchElementException e) {
                // Use out stream instead of error stream, since error stream does not allow for consistent printing
                System.out.println("Empty line is invalid.");
            }
        }
        scanner.close();
        return input;
    }
}