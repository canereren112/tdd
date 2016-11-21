package clock;

import enums.ClockState;

public class Clock {
	MDate mDate;
	MTime mTime;
	ClockState clockState;
	
	public Clock() {
		this.mDate = new MDate();
		this.mTime = new MTime();
		this.clockState = ClockState.TIME;//S1 state is default state TIME
	}
	
	public Clock(ClockState clockState) {
		this.mDate = new MDate();
		this.mTime = new MTime();
		this.clockState = clockState;
	}
	
	public String set(int p1, int p2, int p3){
		if(isStateTime()){
			return mTime.timeSet(p1, p2, p3);
		}else if(isStateDate()){
			return mDate.dateSet(p1, p2, p3);
		}
		return null;
	}

	public String reset(){
		if(isStateTime()){
			return mTime.reset();
		}else if(isStateDate()){
			return mDate.reset();
		}
		return null;
	}
	
	public String changeMode(){
		if(isStateTime()){
			this.clockState = ClockState.DATE;
			return mTime.showTime();
		}else if(isStateDate()){
			this.clockState = ClockState.TIME;
			return mDate.showDate();
		}else{
			return null;
		}
	}
	
	private boolean isStateDate(){
		if(this.clockState.equals(ClockState.DATE)){
			return true;
		}else{
			return false;
		}
	}
	
	private boolean isStateTime(){
		if(this.clockState.equals(ClockState.TIME)){
			return true;
		}else{
			return false;
		}
	}
}
