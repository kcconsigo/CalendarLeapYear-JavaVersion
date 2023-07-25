package LeapYearProgram;


import java.util.InputMismatchException;
import java.util.Scanner;

public class LeapYearJavaProgram {

	public static boolean isLeapYear(int year) {

		if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {

			return true;
		}

		return false;
	}

	public static int daysinMonth(int year, int month) {
		int[] month_days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		if (isLeapYear(year) && month == 2) {
			return 29;

		}
		return month_days[month - 1];

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		
		Scanner reader = new Scanner(System.in);

		while(true) {
			try {
				System.out.println("\nType a year: ");
				int year = reader.nextInt();
				System.out.println("\nType a month: ");
				int month = reader.nextInt();

				int days = daysinMonth(year,month);

				System.out.print(days);


				if (isLeapYear(year)) {
					System.out.print("\nIt is Leap Year");
				}
				else {
					System.out.print("\nIt is not Leap Year");
				}

				if(year == 2020 && month == 2) {
					System.out.println("\nYou entered: "+year);
					System.out.println("\nYou entered: "+month); 
					break;
				}

			}catch (InputMismatchException e) {
				System.out.println("\nType a year: ");
				reader.nextInt();
				System.out.println("\nType a month: ");
				reader.nextInt();
				continue;

			}

		}


	}

}
