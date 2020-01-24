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
}
