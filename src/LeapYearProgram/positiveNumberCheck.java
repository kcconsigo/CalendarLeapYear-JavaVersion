package LeapYearProgram;

import java.util.Scanner;

public class positiveNumberCheck {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int year;

        while (true) {
            System.out.print("Enter a year: ");
            if (scanner.hasNextInt()) {
                year = scanner.nextInt();
                if (year > 0) {
                    break; // Exit the loop if the input is a positive integer
                } else {
                    System.out.println("Invalid input. Please enter a positive integer.");
                }
            } else {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.next(); // Consume the invalid input
            }
        }

        System.out.println("You entered the year: " + year);
        scanner.close();

	}

}
