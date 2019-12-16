package utility;

/** *****************************************************************************
 *	Purpose: Functional Utility class.
 *  @author  :  Ritesh Yadav
 *  @version :  1.0
 *  @since   :  15-11-2019
 *
 ***************************************************************************** */
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class FunctionalPrograms {
	/**
	 * Define static function matrix
	 * 
	 * @param m
	 *            [][] -->int
	 * @param n
	 *            [][] -->int
	 * @return void
	 */
	public static void matrix(int[][] m, int[][] n) throws Exception {
		PrintWriter WRITE = new PrintWriter(new OutputStreamWriter(System.out, "UTF-8"));
		int mul[][] = new int[2][2];
		try {
			// Print Both Matrix
			for (int i = 0; i < 2; i++) {

				for (int j = 0; j < 2; j++) {
					WRITE.print(m[i][j] + " ");
				}
				WRITE.println();
			}
			for (int i = 0; i < 2; i++) {

				for (int j = 0; j < 2; j++) {
					WRITE.print(n[i][j] + " ");
				}
				WRITE.println();
			}
			// Multiply M*N Matrix
			for (int i = 0; i < 2; i++) {

				for (int j = 0; j < 2; j++) {
					mul[i][j] = m[i][j] * n[i][j];
				}
				WRITE.println();
			}
			// Print Matrix
			for (int i = 0; i < 2; i++) {
				for (int j = 0; j < 2; j++) {
					WRITE.print(mul[i][j] + " ");
				}
				WRITE.println();
			}
		} finally {
			WRITE.close();
		}
	}

	/**
	 * Define static function findTriplets
	 * 
	 * @param arr
	 *            [] -->int
	 * @return void
	 */
	public static void findTriplets(int arr[]) {
		boolean found = false;

		for (int i = 0; i < arr.length - 2; i++) {
			for (int j = i + 1; j < arr.length - 1; j++) {
				for (int k = j + 1; k < arr.length; k++) {
					if (arr[i] + arr[j] + arr[k] == 0) {
						System.out.println("Elements Are : =   " + arr[i] + " " + arr[j] + " " + arr[k]);
						found = true;
					}
				}
			}
		}
		if (found == false) {
			System.out.println("Not Found");
		}
	}

	/**
	 * Define static function distance()
	 * 
	 * @param x
	 *            -->double
	 * @param x1
	 *            -->double
	 * @param y
	 *            -->double
	 * @param y1
	 *            -->double
	 * @return void
	 */

	public static void distance(double x, double x1, double y, double y1) {
		double calculate;
		double cal = Math.pow(x - y, 2) + Math.pow(x1 - y1, 2);
		calculate = Math.sqrt(cal);
		System.out.println(calculate);
	}

	/**
	 * Define static function quardricEquation()
	 * 
	 * @param num1
	 *            -->double
	 * @param num2
	 *            -->double
	 * @param num3
	 *            -->double
	 * @return void
	 */
	public static void quadraticEquation(double num1, double num2, double num3) {
		if (num1 == 0) {
			System.out.println("Linear Equation ");
		} else {
			double delta = Math.sqrt(Math.abs(num2 * num2 - 4 * num1 * num3));
			double x1 = ((double) -num2 + (delta) / (2 * num1));
			double x2 = ((double) -num2 + (delta) / (2 * num1));
			System.out.println("X1 " + x1 + " X2 " + x2);
		}
	}

	/**
	 * Define static function windChill()
	 * 
	 * @param t
	 *            -->double
	 * @param v
	 *            -->double
	 * @return void
	 */
	public static void windChill(double t, double v) {
		if (Math.abs(t) < 50) {
			if (v > 120 || v < 3) {
				double w = 35.74 + 0.6215 * t + (0.4275 + 35.75) * Math.pow(v, 0.16);
				System.out.println(w);
			}
		}
	}
}