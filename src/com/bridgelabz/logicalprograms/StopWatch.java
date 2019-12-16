package com.bridgelabz.logicalprograms;

/** *****************************************************************************
 * 3.  Write a Stopwatch Program for measuring the time that elapses between the start and end clicks.
 *  
 *  @author  :  Ritesh Yadav
 *  @version :  1.0
 *  @since   :  15-11-2019
 *
 ***************************************************************************** */
import utility.Utility;

public class StopWatch {

	public static void main(String[] args) {
		String finish = new String();
		boolean started = true;
		StopWatch stopWatch = new StopWatch();
		long time = 0;
		long lastStart = System.currentTimeMillis();
		do {

			if (started) {
				System.out.println("press N to stop");
				finish = Utility.inputString();
				if (finish.equals("N")) {
					time = System.currentTimeMillis() - lastStart;
					System.out.println("Time is:" + (time % 1000) + " Second");
					started = false;
				}
			} else {
				System.out.println("press Y to start");
				finish = Utility.inputString();
				if (finish.equals("Y")) {
					lastStart = System.currentTimeMillis();
					started = true;
				}
			}
			System.out.println("Press C to continue");
			finish = Utility.inputString();
		} while (true);
	}
}