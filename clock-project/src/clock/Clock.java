package clock;

public class Clock {
	MDate mDate;
	MTime mTime;
	
	public Clock() {
		this.mDate = new MDate();
		this.mTime = new MTime();
	}
	
	public String set(int p1, int p2, int p3){
		return this.mDate.dateSet(p1, p2, p3);
	}

}
