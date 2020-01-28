package ch.bbw.td.craps;

import static org.junit.Assert.*;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;
import org.junit.Test;

public class CrapsTest {

	Craps testee;

	@Test
	//First Round Summe 7 -> Gewonnen
	public void testPlayDiceFirstRoundReturnsSumOf7ReturnsTrue() {
		System.out.println("");
		System.out.println("Test 1");
		Dice dice = mock(Dice.class);
		when(dice.roll()).thenReturn(3).thenReturn(4);
	
		testee = new Craps(dice);
		assertTrue(testee.play() == true);
	}
	
	@Test
	//First Round Summe 3 -> verloren
	public void testPlayDiceFirstRoundReturnsSumOf3ReturnsFalse() {
		System.out.println("");
		System.out.println("Test 2");
		Dice dice = mock(Dice.class);
		when(dice.roll()).thenReturn(2).thenReturn(1);
	
		testee = new Craps(dice);
		assertTrue(testee.play() == false);
	}
	
	
	//Erster Folgewurf
	
	@Test
	//First Round Summe 10 -> 
	//Second Round Summe 10 -> 10 gewonnen
	public void testPlayDiceSecondRoundReturnsSumOf10Second10ReturnsTrue() {
		System.out.println("");
		System.out.println("Test 3");
		Dice dice = mock(Dice.class);
		when(dice.roll()).thenReturn(5).thenReturn(5).thenReturn(5).thenReturn(5);
	
		testee = new Craps(dice);
		assertTrue(testee.play() == true);
	}
	

	@Test
	//First Round Summe 9 -> 
	//Second Round Summe 9 -> 7 -> verloren
	public void testPlayDiceSecondRoundReturnsSumOf9Second7ReturnsFalse() {
		System.out.println("");
		System.out.println("Test 4");
		Dice dice = mock(Dice.class);
		when(dice.roll()).thenReturn(4).thenReturn(5).thenReturn(3).thenReturn(4);
	
		testee = new Craps(dice);
		assertTrue(testee.play() == false);
	}
	
	
	
	//Zweiter Folgewurf
	
	@Test
	//First Round Summe 6 -> 
	//Second Round Summe 6 -> 8 
	//Third Round Summe 8 -> 8 Gewonnen
	public void testPlayDiceThirdRoundReturnsSumOf6Second8Third8ReturnsTrue() {
		System.out.println("");
		System.out.println("Test 5");
		Dice dice = mock(Dice.class);
		when(dice.roll()).thenReturn(3).thenReturn(3).thenReturn(6).thenReturn(2).thenReturn(4).thenReturn(4);
	
		testee = new Craps(dice);
		assertTrue(testee.play() == true);
	}
	

	@Test
	//First Round Summe 9 -> 
	//Second Round Summe 9 -> 8 
	//Third Round SUmme 8 -> 7 verloren
	public void testPlayDiceThirdRoundReturnsSumOf9Second8Third7ReturnsFalse() {
		System.out.println("");
		System.out.println("Test 6");
		Dice dice = mock(Dice.class);
		when(dice.roll()).thenReturn(4).thenReturn(5).thenReturn(3).thenReturn(5).thenReturn(4).thenReturn(3);
	
		testee = new Craps(dice);
		assertTrue(testee.play() == false);
	}
	
	
	//Vierter Folgewurf
	//Auch Fünfter Wurf genannt
	
	@Test
	//First Round Summe 5 -> 
	//Second Round Summe 5 -> 9 
	//Third Round Summe 9 -> 4 
	//Fourth Round 4 -> 2
	//Fift Round 2 -> 2 Gewonnen
	public void testPlayDiceFiftRoundReturnsSumOf5Second9Third4Fourth2Fift2ReturnsTrue() {
		System.out.println("");
		System.out.println("Test 7");
		Dice dice = mock(Dice.class);
		when(dice.roll()).thenReturn(2).thenReturn(3).thenReturn(6).thenReturn(3).thenReturn(2).thenReturn(2).thenReturn(1).thenReturn(1);
	
		testee = new Craps(dice);
		assertTrue(testee.play() == true);
	}
	

	@Test
	//First Round Summe 5 -> 
	//Second Round Summe 5 -> 9 
	//Third Round Summe 9 -> 4 
	//Fourth Round 4 -> 2
	//Fift Round 2 -> 7 verloren
	public void testPlayDiceFiftRoundReturnsSumOf5Second9Third4Fourth2Fift7Returnsfalse() {
		System.out.println("");
		System.out.println("Test 7");
		Dice dice = mock(Dice.class);
		when(dice.roll()).thenReturn(2).thenReturn(3).thenReturn(6).thenReturn(3).thenReturn(2).thenReturn(2).thenReturn(1).thenReturn(6);
	
		testee = new Craps(dice);
		assertTrue(testee.play() == false);
	}
	
}
