package ch.bbw.td.craps;


/**
 * The craps game
 * @author Tim Dubath
 * @version 24.01.2020
 */
public class Craps
{
   private Dice dice;

   public Craps(Dice dice)
   {
      this.dice = dice;
   }

   public boolean play()
   {
      int sum=0;
      int oldSum=0;

      // first round
      sum = dice.roll();
      sum = sum + dice.roll();

      switch (sum)
      {
         case 7:
            return true;

         case 2:
         case 3:
         case 12:
            return false;

         default:
            break;
      }
      
      // second round
      while (true)
      {
         oldSum=sum;
         sum = dice.roll();
         sum = sum + dice.roll();
         
         if (sum == oldSum)
         {
            return true;
         }
         else if (sum == 7)
         {
            return false;
         }
		 break;
      }
	  return false;
   }
}