package clock;

import org.junit.Test;

public class TestClock {
	
	@Test
	public void testdate(){
		Clock clock = new Clock();
		clock.set(2220, 121, 4);
	}
}
