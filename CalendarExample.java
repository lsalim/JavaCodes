import java.util.Calendar;
import java.util.Date;

public class CalendarExample {
 
	public static void main(String[] args) {				
		Calendar cal = Calendar.getInstance();

		//Fields to build date '01/15/2017'
		int date = 15;							
		int month = 0;							
		int year = 2017;
		//Setting fields to Calendar
		cal.set(year, month, date);

		//Building a Date from a Calendar
		Date newDate = cal.getTime();

		//Print the result
		System.out.println("Date from Calendar fields : " + newDate.getTime());
	}
}

