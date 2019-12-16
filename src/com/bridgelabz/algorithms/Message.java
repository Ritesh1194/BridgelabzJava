
package com.bridgelabz.algorithms;

/** *****************************************************************************
 * 	
 *   Read in the following message: Hello <<name>>, We have your full name as <<full name>> in our system. 
 *   your contact number is 91-xxxxxxxxxx.
 *    Please,let us know in case of any clarification Thank you BridgeLabz 01/01/2016.
 *    Use Regex to replace name, full name, Mobile#, and Date with proper value.
 *  @author  :  Ritesh Yadav
 *  @version :  1.0
 *  @since   :  15-11-2019
 *
 ***************************************************************************** */
import java.util.Date;
import utility.Algorithms;
import utility.Utility;

public class Message {

	public static void main(String[] args) {

		UserDetails userDetails = new UserDetails();

		System.out.println("Enter FirstName:");
		userDetails.setfName(Utility.inputString());

		System.out.println("Enter LastName:");
		userDetails.setfName(Utility.inputString());

		System.out.println("Enter MobileNumber:");
		userDetails.setfName(Utility.inputString());
		userDetails.setdate(Algorithms.getFormatedDate(new Date()));
		System.out.println(Algorithms.convertString(userDetails, Algorithms.getFileText("file.txt")));
	}
}