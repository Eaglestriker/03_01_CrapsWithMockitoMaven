package ch.bbw.td.craps;

/**
 * The craps game
 * 
 * @author Tim Dubath
 * @version 24.01.2020
 */
public class Craps {
	private Dice dice;

	public Craps(Dice dice) {
		this.dice = dice;
	}

	public boolean play() {
		int sum = 0;
		int oldSum = 0;
		boolean rueckgabe = true;

		// first round
		sum = dice.roll();
		sum = sum + dice.roll();

		if (sum == 7 || sum == 11) {
			System.out.println("gewonnen");
			System.out.println(sum);
			return true;
		} 
		else if (sum == 2 || sum == 3 || sum == 12) {
			System.out.println("verloren");
			System.out.println(sum);
			return false;
		} 
		else{
			while (true) {
				System.out.println("neuer Wurf");
				oldSum = sum;
				System.out.println("OldSum");
				System.out.println(oldSum);
				sum = dice.roll();
				sum = sum + dice.roll();
				System.out.println("New");
				System.out.println(sum);

				if (sum == 7) {
					return false;
				} 
				else if(sum == oldSum) {
					return true;
				}
				
			}

		}
		/*
		 * switch (sum) { 
		 * case 7: 
		 * System.out.println(sum); 
		 * return true; 
		 * case 2:
		 * System.out.println(sum); 
		 * return false; case 3: 
		 * System.out.println(sum);
		 * return false; case 12: 
		 * System.out.println(sum); 
		 * return false;
		 * 
		 * default: System.out.println(sum); break; }
		 */

		// second round
		/*while (true) {
			oldSum = sum;
			System.out.println("Old");
			System.out.println(oldSum);
			sum = dice.roll();
			sum = sum + dice.roll();
			System.out.println("New");
			System.out.println(sum);

			if (sum == oldSum) {
				return true;
			} else if (sum == 7) {
				return false;
			} else if (sum != oldSum && sum != 7 ) {
				while (sum != oldSum && true) {
					System.out.println("NeuerLoop");
					System.out.println(oldSum);
					sum = dice.roll();
					sum = sum + dice.roll();
					System.out.println("New");
					System.out.println(sum);

					if (sum == oldSum) {
						return true;
					} else if (sum == 7) {
						return false;
					}
				}
			}
			break;
		}*/
		//return false;
	}
}