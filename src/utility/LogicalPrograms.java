
package utility;

/** *****************************************************************************
 *	  Purpose: Functional Utility class.
 *  @author  :  Ritesh Yadav
 *  @version :  1.0
 *  @since   :  15-11-2019
 *
 ***************************************************************************** */
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class LogicalPrograms {
	private static ArrayList<Integer> mListOfCupons = new ArrayList<Integer>();;
	private static int mCounter;

	/**
	 * Define static function randomNumberGenerator()
	 *
	 * @return int
	 */
	public static int randomNumberGenrator() {
		int randomNumber = ThreadLocalRandom.current().nextInt(0, 1000);
		if (randomNumber < 0)
			randomNumber = randomNumber * (-1);
		return randomNumber;
	}

	/**
	 * Define static function generateDistictCupons()
	 *
	 * @return int
	 */
	public static int genrateDistictCupons(int numberOfCupons) {
		while (mListOfCupons.size() != numberOfCupons) {

			int randomNumber = LogicalPrograms.randomNumberGenrator();
			// System.out.print(randomNumber+" ");
			if (mListOfCupons.contains(randomNumber)) {
				mCounter++;
			} else {
				mCounter++;
				mListOfCupons.add(numberOfCupons);
			}
		}
		return mCounter;
	}

	static double betPrice, stack, goal;
	static int numberOfPlay;

	/**
	 * Define static function winOrLoss()
	 *
	 * @return boolean
	 */
	public static boolean winOrloss() {
		if (Math.random() < 0.5)
			return true;
		else
			return false;
	}

	/**
	 * Define static function playGame()
	 *
	 * @return void
	 */
	public static void playGame() {
		numberOfPlay++;
		if (winOrloss())
			stack += betPrice;
		else
			stack -= betPrice;
		if (stack <= 0 || stack >= goal)
			return;
		else
			playGame(); // Calling Recursive Function
	}

	/**
	 * Define static function printResult()
	 *
	 * @return void
	 */
	public static void printResult() {
		System.out.println("Number of time Game play is:" + numberOfPlay);
		System.out.println("Stack is:" + stack);
		System.out.println("Goal is:" + goal);
		System.out.println("Bet Price is:" + betPrice);
	}
}