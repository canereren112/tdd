package clock;

import java.time.DateTimeException;

public class MTime {
	private int hour;
	private int minute;
	private int second;
	
	public MTime() {
		setTime(0, 0, 0);
	}
	
	public String timeSet(int hour, int minute, int second){
		setTime(hour, minute,second);
		return createTimeString();
	}
	
	public String showTime(){
		return createTimeString();
	}
	private String createTimeString(){
		return "Hour: " + this.hour + ", Minute: " + this.minute + ", Second: " + this.second ;
	}
	
	public String reset(){
		setTime(0, 0, 0);
		return createTimeString();
	}
	
	private void setTime(int p1, int p2, int p3){
		checkTime(p1,p2,p3);
		this.hour = p1;
		this.minute = p2;
		this.second = p3;
	}
	
	private void checkTime(int p1, int p2, int p3){
		if(!(((0<=p1) &&(p1<=60)) && ((0<=p2) &&(p2<=60)) &&  ((0 <= p3) && (p3<=60)))){
			throw new DateTimeException("Wrong time format");
		}
	}
	
}
