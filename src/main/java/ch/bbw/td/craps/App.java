package ch.bbw.td.craps;


/**
 * The craps game
 * @author Tim Dubath
 * @version 24.01.2020
 */
public class App
{
   public static void main(String[] args)
   {
      Dice myDice = new Dice();
      Craps myCraps = new Craps(myDice);
      if (myCraps.play())
      {
         System.out.println("Gewonnen");
      }
      else
      {
         System.out.println("verloren");
      }
   }
}