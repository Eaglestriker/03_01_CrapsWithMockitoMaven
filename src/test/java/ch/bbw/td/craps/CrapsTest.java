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
		Dice dice = mock(Dice.class);
		when(dice.roll()).thenReturn(3).thenReturn(4);
	
		testee = new Craps(dice);
		assertTrue(testee.play() == true);
	}
	
	@Test
	//First Round Summe 3 -> Verloren
	public void testPlayDiceFirstRoundReturnsSumOf3ReturnsFalse() {
		Dice dice = mock(Dice.class);
		when(dice.roll()).thenReturn(2).thenReturn(1);
	
		testee = new Craps(dice);
		assertTrue(testee.play() == false);
	}
	
	
	@Test
	//First Round Summe 10 -> Point
	//Second Round Summe 10 -> Gewonnen
	public void testPlayDiceSecondRoundReturnsSumOf10ReturnsTrue() {
		Dice dice = mock(Dice.class);
		when(dice.roll()).thenReturn(5).thenReturn(5).thenReturn(5).thenReturn(5);
	
		testee = new Craps(dice);
		assertTrue(testee.play() == true);
	}
	
	@Test
	//First Round Summe 10 -> Point
	//Second Round Summe 6 -> Verloren
	public void testPlayDiceSecondRoundReturnsSumOf10After6Returnsfalse() {
		Dice dice = mock(Dice.class);
		when(dice.roll()).thenReturn(5).thenReturn(5).thenReturn(5).thenReturn(1);
	
		testee = new Craps(dice);
		assertTrue(testee.play() == false);
	}
}
