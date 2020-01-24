package ch.bbw.td.craps;

import java.util.Random;

/**
 * The dice class
 * @author Tim Dubath
 * @version 07.01.2019
 */

public class Dice
{
   private Random random;
   
   public Dice()
   {
      random = new Random();
   }
   
   public int roll()
   {
      return (random.nextInt(5)+1); 
   }
}
