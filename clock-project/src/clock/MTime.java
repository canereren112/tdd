package clock;

public class MTime {
	private int hour;
	private int minute;
	private int second;
	
	public MTime() {
		this.hour = 0;
		this.minute = 0;
		this.second = 0;
	}
	public String timeSet(int hour, int minute, int second){
		this.hour = hour;
		this.minute = minute;
		this.second = second;
		return createTimeString();
	}
	
	public String showTime(){
		return createTimeString();
	}
	private String createTimeString(){
		return "Time; Hour : " + this.hour + ", Minute : " + this.minute + ", Second : " + this.second ;
	}
	
	
}
