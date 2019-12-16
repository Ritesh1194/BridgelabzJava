
package com.bridgelabz.basicprograms;

/** *****************************************************************************
 *  1 .User Input and Replace String Template �Hello <<UserName>>, How are you?�.
 *  @author  :  Ritesh Yadav
 *  @version :  1.0
 *  @since   :  15-11-2019
 *
 ***************************************************************************** */
import utility.BasicCorePrograms;
import utility.Utility;

public class StringReplace {

	public static void main(String[] args) {
		String userName;
		do {
			System.out.println("Enter Any UserName");
			userName = Utility.inputString();

		} while (BasicCorePrograms.replaceString1(userName));
		BasicCorePrograms.printUserName(userName);
	}
}