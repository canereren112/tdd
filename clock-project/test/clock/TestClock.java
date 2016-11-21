package clock;

import org.junit.Test;
import static org.junit.Assert.*;

import enums.ClockState;
import java.time.DateTimeException;
import java.time.DateTimeException;

public class TestClock extends ClockTester {
	/* Lecture Test Cases */
	//Test Case 1
	@Test
	public void testChangeClockModeTwice(){
		Clock clock = new Clock();//State s1
		assertEquals(createTimeString(0,0,0), clock.changeMode());	//State s2
		assertEquals(createDateString(2000,1,1), clock.changeMode());//State s1
	}
	
	//Test Case 2
	@Test
	public void testChangeChangeModeSet(){
		Clock clock = new Clock();//State s1
		assertEquals(createTimeString(0,0,0), clock.changeMode());	//State s2
		assertEquals(createDateString(2000,1,1), clock.reset());//State s4
	}
	
	//Test Case 3	
	@Test
	public void testSetTime(){
		Clock clock = new Clock();//Default state s1
		assertEquals(createTimeString(0,0,0),clock.reset());			//State s3	
		assertEquals(createTimeString(12,10,23), clock.set(12, 10, 23));  //State s1
	}
	
	//Test Case 4	
	@Test
	public void testSetTimeThenChangeMode(){
		Clock clock = new Clock();//Default state s1
		assertEquals(createTimeString(0,0,0),clock.reset());			//State s3	
		assertEquals(createTimeString(12,10,23), clock.set(12, 10, 23));  //State s1
		assertEquals(createTimeString(12,10,23), clock.changeMode());  //State s2
	}
	
	//Test Case 5	
	@Test
	public void testResetSetResetTime(){
		Clock clock = new Clock();//Default state s1
		assertEquals(createTimeString(0,0,0),clock.reset());			//State s3	
		assertEquals(createTimeString(12,10,23), clock.set(12, 10, 23));  //State s1
		assertEquals(createTimeString(0,0,0), clock.reset());  //State s2
	}
	
	//Test Case 6	
	@Test
	public void testChangeClockModeToTime(){
		Clock clock = new Clock(ClockState.DATE);//State s2
		assertEquals(createDateString(2000,1,1), clock.changeMode()); 		//State s1
	}
	
	//Test Case 7	
	@Test
	public void testChangeClockModeToTimeAndReset(){
		Clock clock = new Clock(ClockState.DATE);//State s2
		assertEquals(createDateString(2000,1,1), clock.changeMode()); 		//State s1
		assertEquals(createTimeString(0,0,0), clock.reset()); 		//State s3
	}
	
	//Test Case 8	-- Table was declaring the same transition maybe lectoure pdf is wrong
	@Test
	public void testChangeClockModeToTimeAndResetMistake(){
		Clock clock = new Clock(ClockState.DATE);//State s2
		assertEquals(createDateString(2000,1,1), clock.changeMode()); 		//State s1
		assertEquals(createTimeString(0,0,0), clock.reset()); 		//State s3
	}

	//Test Case 9	
	@Test
	public void testSetDateAndReset(){
		Clock clock = new Clock(ClockState.DATE);//State s2
		assertEquals(createDateString(2000,1,1), clock.reset()); 				//State s4		
		assertEquals(createDateString(2050,12,11),clock.set(2050, 12, 11)); 	//State s2
		assertEquals(createDateString(2000,1,1), clock.reset()); 				//State s4		
	}
	
	//Test Case 10	
	@Test
	public void testSetDateAndResetChangeMode(){
		Clock clock = new Clock(ClockState.DATE);//State s2
		assertEquals(createDateString(2000,1,1), clock.reset()); 				//State s4		
		assertEquals(createDateString(2050,12,11),clock.set(2050, 12, 11)); 	//State s2
		assertEquals(createDateString(2050,12,11), clock.changeMode()); 		//State s1

	}
	
	/* Individual Test Cases */
	@Test
	public void testResetTime(){
		Clock clock = new Clock();//Default state s1
		assertEquals(createTimeString(0,0,0), clock.reset());//State s3
	}
	
	
	@Test(expected = DateTimeException.class) 
	public void testSetTimeOutOfRangeException(){
		Clock clock = new Clock();//Default state s1
		assertEquals(createTimeString(0,0,0),clock.reset());		//State s3	
		clock.set(72, 10, 23);
	}
	
	@Test(expected = DateTimeException.class) 
	public void testSetTimeAllOutOfRangeException(){
		Clock clock = new Clock();//Default state s1
		assertEquals(createTimeString(0,0,0),clock.reset());		//State s3	
		clock.set(1, 99, 14512);
	}
	
	@Test(expected = DateTimeException.class) 
	public void testSetTimenNegativeException(){
		Clock clock = new Clock();//Default state s1
		assertEquals(createTimeString(0,0,0),clock.reset());		//State s3	
		clock.set(-11, -99, -14512);
	}
	
	@Test
	public void testChangeClockModeToDate(){
		Clock clock = new Clock();//Default state s1
		assertEquals(createTimeString(0,0,0), clock.changeMode()); 		//State s2
	}
	

	
	@Test
	public void testResetDate(){
		Clock clock = new Clock(ClockState.DATE);//State s2
		assertEquals(createDateString(2000,1,1), clock.reset()); 				//State s4
	}
	
	@Test
	public void testSetDate(){
		Clock clock = new Clock(ClockState.DATE);//State s2
		assertEquals(createDateString(2000,1,1), clock.reset()); 				//State s4		
		assertEquals(createDateString(2050,12,11),clock.set(2050, 12, 11)); 	//State s2
	}
	
	@Test(expected = DateTimeException.class)
	public void testSetDateYearException(){
		Clock clock = new Clock(ClockState.DATE);//State s2
		assertEquals(createDateString(2000,1,1), clock.reset()); 				//State s4		
		clock.set(1990, 12, 11); 	//State s2
	}
	
	@Test(expected = DateTimeException.class)
	public void testSetDateMonthException(){
		Clock clock = new Clock(ClockState.DATE);//State s2
		assertEquals(createDateString(2000,1,1), clock.reset()); 				//State s4		
		clock.set(2001, 15, 11); 	//State s2
	}

	@Test(expected = DateTimeException.class)
	public void testSetDateDayException(){
		Clock clock = new Clock(ClockState.DATE);//State s2
		assertEquals(createDateString(2000,1,1), clock.reset()); 				//State s4		
		clock.set(2001, 15, 32); 	//State s2
	}
	
	@Test(expected = DateTimeException.class)
	public void testSetDateNegativeValueException(){
		Clock clock = new Clock(ClockState.DATE);//State s2
		assertEquals(createDateString(2000,1,1), clock.reset()); 				//State s4		
		clock.set(-123, -90, -12); 	//State s2
	}
	

}
