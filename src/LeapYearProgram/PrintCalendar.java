package LeapYearProgram;

import java.text.DateFormatSymbols;
import java.util.Calendar;

public class PrintCalendar {
	
	public static void Run()
	{
		Calendar date = Calendar.getInstance();
		date.set(2020, 11, 01);
		
		String space = " ";
		DateFormatSymbols dfs = new DateFormatSymbols();
		String[] daysOfWeek = dfs.getShortMonths();
		for (int i = 0; i < daysOfWeek.length; i++) {
			daysOfWeek[i] = daysOfWeek[i] + space + space;
		}
		String monthName = dfs.getMonths()[ date.get(Calendar.MONTH)];
		String yearMonthStr = String.format("%s - %s", date.get(Calendar.YEAR), monthName);
	}

}
