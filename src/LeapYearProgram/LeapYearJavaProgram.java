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
		int year = 0;
		int month = 0;


		while(true) {
			try {
				System.out.println("\nType a year: ");
				year = reader.nextInt();
				System.out.println("\nType a month: ");
				month = reader.nextInt();

				int days = daysinMonth(year,month);

				System.out.print(days);


				if (isLeapYear(year)) {
					System.out.print("\nIt is Leap Year");
				}
				else {
					System.out.print("\nIt is not Leap Year");
				}


			}catch (InputMismatchException | ArrayIndexOutOfBoundsException e) {
				System.out.println("\nType a year: " +e.toString());
				System.out.println("Pease Enter Valid Year");
				reader.next();
				System.out.println("\nType a month: " +e.toString());
				System.out.println("Pease Enter Valid Months[1-12]");
				reader.next();
				continue;

			}
			if(year == 2020 && month == 2) {
				System.out.println("\nYou entered: "+year);
				System.out.println("You entered: "+month);
				System.out.println("You met the last exact year and month of last data");
				break;
			}
			else {
				System.out.println("\nIt's not done yet, you still haven't provided yet the exact year and month of last data");
			}
		}
	}
}
