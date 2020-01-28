package ch.bbw.td.craps;

import static org.junit.Assert.*;

import static org.mockito.Mockito.*;

import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;
import org.mockito.InOrder;

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
	//First Round Summe 3 -> verloren
	public void testPlayDiceFirstRoundReturnsSumOf3ReturnsFalse() {
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
		Dice dice = mock(Dice.class);
		when(dice.roll()).thenReturn(5).thenReturn(5).thenReturn(5).thenReturn(5);
	
		testee = new Craps(dice);
		assertTrue(testee.play() == true);
	}
	

	@Test
	//First Round Summe 9 -> 
	//Second Round Summe 9 -> 7 -> verloren
	public void testPlayDiceSecondRoundReturnsSumOf9Second7ReturnsFalse() {
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
		Dice dice = mock(Dice.class);
		when(dice.roll()).thenReturn(2).thenReturn(3).thenReturn(6).thenReturn(3).thenReturn(2).thenReturn(2).thenReturn(1).thenReturn(6);
	
		testee = new Craps(dice);
		assertTrue(testee.play() == false);
	}
	
	@Test
	public void testVerifySomeBehaviourisOk() {
		//mock creation
		 List mockedList = mock(List.class);

		 //using mock object
		 mockedList.add("one");
		 mockedList.clear();

		 //verification
		 verify(mockedList).add("one");
		 verify(mockedList).clear();
	}
	
	@Test (expected = RuntimeException.class)
	public void testStubbingIsOk() {
		//You can mock concrete classes, not just interfaces
		 LinkedList mockedList = mock(LinkedList.class);

		 //stubbing
		 when(mockedList.get(0)).thenReturn("first");
		 when(mockedList.get(1)).thenThrow(new RuntimeException());

		 //following prints "first"
		 System.out.println(mockedList.get(0));

		 //following throws runtime exception
		 System.out.println(mockedList.get(1));

		 //following prints "null" because get(999) was not stubbed
		 System.out.println(mockedList.get(999));

		 //Although it is possible to verify a stubbed invocation, usually it's just redundant
		 //If your code cares what get(0) returns, then something else breaks (often even before verify() gets executed).
		 //If your code doesn't care what get(0) returns, then it should not be stubbed.
		 verify(mockedList).get(0);
	}
	
	
	//Dies habe ich nicht verstanden. Muss P.Rutschmann danach fragen.
	@Ignore
	@Test
	public void testArgumentMatchersIsOk() {
		
		//You can mock concrete classes, not just interfaces
		 LinkedList mockedList = mock(LinkedList.class);

		 //stubbing
		 when(mockedList.get(0)).thenReturn("first");
		 when(mockedList.get(1)).thenThrow(new RuntimeException());

		 //following prints "first"
		 System.out.println(mockedList.get(0));

		 //following throws runtime exception
		 System.out.println(mockedList.get(1));

		 //following prints "null" because get(999) was not stubbed
		 System.out.println(mockedList.get(999));

		 //Although it is possible to verify a stubbed invocation, usually it's just redundant
		 //If your code cares what get(0) returns, then something else breaks (often even before verify() gets executed).
		 //If your code doesn't care what get(0) returns, then it should not be stubbed.
		 verify(mockedList).get(0);
		//stubbing using built-in anyInt() argument matcher
		 when(mockedList.get(anyInt())).thenReturn("element");

		 //stubbing using custom matcher (let's say isValid() returns your own matcher implementation):
		// when(mockedList.contains(argThat(isValid()))).thenReturn(true);

		 //following prints "element"
		 System.out.println(mockedList.get(999));

		 //you can also verify using an argument matcher
		 verify(mockedList).get(anyInt());

		 //argument matchers can also be written as Java 8 Lambdas
		// verify(mockedList).add(argThat(someString -> someString.length() > 5));
		 
		 //verify(mock).someMethod(anyInt(), anyString(), eq("third argument"));
		   //above is correct - eq() is also an argument matcher

		//   verify(mock).someMethod(anyInt(), anyString(), "third argument");
		   //above is incorrect - exception will be thrown because third argument is given without an argument matcher.
		 
	}
	
	
	@Test
	public void testVerifyingExactNumberIsOk() {
		LinkedList mockedList = mock(LinkedList.class);
		//using mock
		 mockedList.add("once");

		 mockedList.add("twice");
		 mockedList.add("twice");

		 mockedList.add("three times");
		 mockedList.add("three times");
		 mockedList.add("three times");

		 //following two verifications work exactly the same - times(1) is used by default
		 verify(mockedList).add("once");
		 verify(mockedList, times(1)).add("once");

		 //exact number of invocations verification
		 verify(mockedList, times(2)).add("twice");
		 verify(mockedList, times(3)).add("three times");

		 //verification using never(). never() is an alias to times(0)
		 verify(mockedList, never()).add("never happened");

		 //verification using atLeast()/atMost()
		 verify(mockedList, atMostOnce()).add("once");
		 verify(mockedList, atLeastOnce()).add("three times");
		 verify(mockedList, atLeast(2)).add("three times");
		 verify(mockedList, atMost(5)).add("three times");
	}
	
	@Test
	public void testVerificationInOrderIsOk() {
		// A. Single mock whose methods must be invoked in a particular order
		 List singleMock = mock(List.class);

		 //using a single mock
		 singleMock.add("was added first");
		 singleMock.add("was added second");

		 //create an inOrder verifier for a single mock
		 InOrder inOrder = inOrder(singleMock);

		 //following will make sure that add is first called with "was added first", then with "was added second"
		 inOrder.verify(singleMock).add("was added first");
		 inOrder.verify(singleMock).add("was added second");

		 // B. Multiple mocks that must be used in a particular order
		 List firstMock = mock(List.class);
		 List secondMock = mock(List.class);

		 //using mocks
		 firstMock.add("was called first");
		 secondMock.add("was called second");

		 //create inOrder object passing any mocks that need to be verified in order
		 InOrder inOrder1 = inOrder(firstMock, secondMock);

		 //following will make sure that firstMock was called before secondMock
		 inOrder1.verify(firstMock).add("was called first");
		 inOrder1.verify(secondMock).add("was called second");

		 // Oh, and A + B can be mixed together at will
	}
	
	@Test
	public void testInteractionsNeverHappendIsOk() {
		List mockOne = mock(List.class);
		List mockTwo = mock(List.class);
		List mockThree = mock(List.class);
		//using mocks - only mockOne is interacted
		 mockOne.add("one");

		 //ordinary verification
		 verify(mockOne).add("one");

		 //verify that method was never called on a mock
		 verify(mockOne, never()).add("two");

		 //verify that other mocks were not interacted
		 verifyZeroInteractions(mockTwo, mockThree);

	}
	
	
	
}
