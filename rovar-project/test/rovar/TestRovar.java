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
	public void testEnrovLowerDefectCharactersEquals(){	
		assertEquals(Rovar.enrov("gy"), "gogyoy");
	}
	
	@Test
	public void testEnrovUpperDefectCharactersEquals(){	
		assertEquals(Rovar.enrov("DY"), "DODYOY");
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
		assertEquals(Rovar.enrov("BbCcDdFf"), "BOBbobCOCcocDODdodFOFfof");
	}
	
	
	@Test
	public void testEnrovValidAndUnvalidWithVowelCombinedEquals(){	
		assertEquals(Rovar.enrov("aaBbCcEeDdFfAa"), "aaBOBbobCOCcocEeDODdodFOFfofAa");
	}
	
	@Test
	public void testEnrovValidAndUnvalidWithVowelAndSpaceCombinedEquals(){	
		assertEquals(Rovar.enrov("  aaBbCcE   eDdFfAa  "), "  aaBOBbobCOCcocE   eDODdodFOFfofAa  ");
	}
	
	@Test
	public void testEnrovValidAndUnvalidWithVowelSpaceSpecialCombinedEquals(){
		assertEquals(Rovar.enrov("  aaB11 &&bC23cE   eDdFf?+??? Aa  "), "  aaBOB11 &&bobCOC23cocE   eDODdodFOFfof?+??? Aa  ");
	}
	
	@Test
	public void testEnrovOnlyNumbersEquals(){
		assertEquals(Rovar.enrov("123666"), "123666");
	}
	
	@Test
	public void testEnrovOnlySpecialEquals(){
		assertEquals(Rovar.enrov("??&&//##öööö**"), "??&&//##öööö**");
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
	public void testDerovOnlyNumbersEquals(){
		assertEquals(Rovar.derov("1122312"), "1122312");
	}
	
	@Test
	public void testDerovOnlySpecialEquals(){
		assertEquals(Rovar.derov("??##**(())(("), "??##**(())((");
	}
	
	@Test
	public void testDerovNumberAndSpecialEquals(){
		assertEquals(Rovar.derov("??12#33#**782(11())3(1("), "??12#33#**782(11())3(1(");
	}
	
	@Test
	public void testDerovOnlySpaceEquals(){	
		assertEquals(Rovar.derov(" "), " ");
	}
	
	@Test
	public void testDerovLowerDefectCharactersEquals(){	
		assertEquals( "gy", Rovar.derov("gogyoy"));
	}
	
	@Test
	public void testDerovUpperDefectCharactersEquals(){	
		assertEquals("DY", Rovar.derov("DODYOY") );
	}
	
	@Test
	public void testDerovNull(){	
		assertNull(Rovar.derov(null));
	}
}
