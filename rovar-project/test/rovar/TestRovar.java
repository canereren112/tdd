package rovar;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestRovar {
	
	@Test
	public void testEnrovLowerEquals(){		
		assertEquals(Rovar.enrov("srt"), "sosrortot");
	}
	
	@Test
	public void testEnrovLowerNotEquals(){	
		assertNotEquals(Rovar.enrov("srt"), "caner");
	}
	
	@Test
	public void testEnrovUpperEquals(){		
		assertEquals(Rovar.enrov("SRT"), "SOSRORTOT");
	}
	
	@Test
	public void testEnrovValidCombinedEquals(){		
		assertEquals(Rovar.enrov("BbCcFf"), "BOBbobCOCcocFOFfof");
	}
	
	@Test
	public void testEnrovValidAndUnvalidCombinedEquals(){	
		assertEquals(Rovar.enrov("BbCcDdFf"), "BOBbobCOCcocDdodFOFfof");
	}
	
	
	@Test
	public void testEnrovValidAndUnvalidWithVowelCombinedEquals(){	
		assertEquals(Rovar.enrov("aaBbCcEeDdFfAa"), "aaBOBbobCOCcocEeDdodFOFfofAa");
	}
	
	@Test
	public void testEnrovValidAndUnvalidWithVowelAndSpaceCombinedEquals(){	
		assertEquals(Rovar.enrov("  aaBbCcE   eDdFfAa  "), "  aaBOBbobCOCcocE   eDdodFOFfofAa  ");
	}
	
	@Test
	public void testEnrovOnlySpaceEquals(){	
		assertEquals(Rovar.enrov(" "), " ");
	}
	
	@Test
	public void testEnrovNull(){	
		assertNull(Rovar.enrov(null));
	}
	
	@Test
	public void testDerovLowerEquals(){	
		System.out.println(Rovar.derov("sosrortot"));
		assertEquals(Rovar.derov("sosrortot"), "srt");
	}
	
	@Test
	public void testDerovLowerNotEquals(){	
		assertNotEquals(Rovar.derov("caner"), "srt");
	}
	
	@Test
	public void testDerovUpperEquals(){		
		assertEquals(Rovar.derov("SOSRORTOT"), "SRT");
	}
	
	@Test
	public void testDerovValidCombinedEquals(){		
		assertEquals(Rovar.derov("BOBbobCOCcocFOFfof"), "BbCcFf");
	}
	
	@Test
	public void testDerovValidAndUnvalidCombinedEquals(){	
		assertEquals(Rovar.derov("BOBbobCOCcocDdodFOFfof"), "BbCcDdFf");
	}
	
	
	@Test
	public void testDerovValidAndUnvalidWithVowelCombinedEquals(){	
		assertEquals(Rovar.derov("aaBOBbobCOCcocEeDdodFOFfofAa"), "aaBbCcEeDdFfAa");
	}
	
	@Test
	public void testDerovValidAndUnvalidWithVowelAndSpaceCombinedEquals(){
		assertEquals(Rovar.derov("  aaBOBbobCOCcocE   eDdodFOFfofAa  "), "  aaBbCcE   eDdFfAa  ");
	}
	
	@Test
	public void testDerovOnlySepcialEquals(){
		assertEquals(Rovar.derov("ooo"), "ooo");
	}
	
	@Test
	public void testDerovOnlySepcialCombinedEquals(){
		assertEquals(Rovar.derov("OoO"), "OoO");
	}
	
	@Test
	public void testDerovMixSepcialCombinedEquals(){
		assertEquals(Rovar.derov("OososoO"), "OosoO");
	}
	
	@Test
	public void testDerovOnlySpaceEquals(){	
		assertEquals(Rovar.derov(" "), " ");
	}
	
	@Test
	public void testDerovNull(){	
		assertNull(Rovar.derov(null));
	}
}
