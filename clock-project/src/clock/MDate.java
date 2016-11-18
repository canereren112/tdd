package clock;

import java.time.DateTimeException;
import java.time.Month;
import java.time.MonthDay;
import java.time.Year;
import java.util.Date;

public class MDate {
	private Year year;
	private Month month;
	private MonthDay day;

	public MDate() {
		this.year = Year.of(2000);
		this.month = Month.of(1);
		this.day = MonthDay.of(this.month, 1);
	}
	 
	public String dateSet(int year, int month, int day){
		try{
			checkYear(year);
			this.year = Year.of(year);
			this.month = Month.of(month);
			this.day = MonthDay.of(this.month, 1);		
		} catch(DateTimeException  e){
			e.printStackTrace();
		}
		return createDateString();
	}
	
	private void checkYear(int year) throws DateTimeException {
		if(year < 2000 && year > 2100){
			throw new DateTimeException("Invalid year..."); 
		}
	}
	
	private String createDateString(){
		return "Date; Year : " + this.year + ", Month : " + this.month + ", Day : " + this.day ;
	}
	
}
