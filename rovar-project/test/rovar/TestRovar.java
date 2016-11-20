package rovar;

import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestRovar {
	static String lowerInputString1;
	static String lowerExpectedString1;
	static String lowerExpectedString2;

	static String upperInputString1;
	static String upperExpectedString1;
	static String upperExpectedString2;
	
	static String vowelInputString1;
	static String vowelExpectedString1;
	static String vowelExpectedString2;
	

	@BeforeClass
	public static void initializeInputs(){
		lowerInputString1 = "srt";
		lowerExpectedString1 = "sosrortot";
		
		upperInputString1 = "SRT";
		upperExpectedString1 = "SOSRORTOT";
		
		vowelInputString1 = "ae";
		vowelExpectedString1 = "ae";

	}
	
	@Test
	public void testEnrovLowerEquals(){		
		assertEquals(Rovar.enrov(lowerInputString1), lowerExpectedString1);
	}
	
	@Test
	public void testEnrovLowerNotEquals(){	
		assertNotEquals(Rovar.enrov(lowerInputString1), lowerExpectedString2);
	}
	
	@Test
	public void testEnrovUpperEquals(){		
		assertEquals(Rovar.enrov(upperInputString1), upperExpectedString1);
	}
	
	@Test
	public void testEnrovUpperNotEquals(){	
		assertNotEquals(Rovar.enrov(upperInputString1), upperExpectedString2);
	}
	
	@Test
	public void testEnrovVowelEquals(){		
		assertEquals(Rovar.enrov(vowelInputString1), vowelExpectedString1);
	}
	
	@Test
	public void testEnrovVowelNotEquals(){	
		assertNotEquals(Rovar.enrov(vowelInputString1), vowelExpectedString2);
	}
	
	@Test
	public void testEnrovNull(){	
		assertNull(Rovar.enrov(null));
	}
}
