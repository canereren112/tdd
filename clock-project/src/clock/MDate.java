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
		setDate(2000,1,1);
	}
	
	public String reset(){
		setDate(2000,1,1);		
		return createDateString();
	}
	
	public String dateSet(int year, int month, int day){
		setDate(year,month,day);		
		return createDateString();
	}
	
	public String showDate(){
		return createDateString();
	}
	
	private void checkYear(int year) throws DateTimeException {
		if(year < 2000 || year > 2100){
			throw new DateTimeException("Invalid date format..."); 
		}
	}
	
	private String createDateString(){
		return "Year: " + this.year + ", Month: " + this.month.getValue() + ", Day: " + this.day.getDayOfMonth() ;
	}
	
	private void setDate(int year, int month, int day){
			checkYear(year);
			this.year = Year.of(year);
			this.month = Month.of(month);
			this.day = MonthDay.of(this.month, day);
	}
	
	
	
	
}
