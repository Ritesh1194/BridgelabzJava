package com.bridgelabz.oops.cliniquemanagement;

/******************************************************************************
 * 
 * Purpose: This programme is used to manage a list of Doctors associated with
 * the Clinique. This also manages the list of patients who use the clinique. It
 * manages Doctors by Name, Id, Specialization and Availability (AM, PM or
 * both). It manages Patients by Name, ID, Mobile Number and Age. The Program
 * allows users to search Doctor by name, id, Specialization or Availability.
 * Also the programs allows users to search patient by name, mobile number or
 * id.
 *
 * @author Ritesh Yadav
 * @version 1.2
 * @since 02-12-2019
 *
 ******************************************************************************/
import utility.Utility;

public class CliniqueController {
	static CliniqueInterface service = new CliniqueManagementImpl();

	public static void main(String[] args) {
		menu();
	}

	public static void menu() {
		System.out.println("Select option");
		System.out.println("1. Add Doctor Details : ");
		System.out.println("2. Search Doctor : ");
		System.out.println("3. Search Patient :");
		System.out.println("4. Exit");

		String choice = Utility.inputString();
		if (Utility.intChecker(choice)) {
			switch (choice) {
			case "1":
				service.doctorDetails();
				menu();
				break;
			case "2":
				doctorInput();
				break;
			case "3":
				patientInput();
				break;
			case "4":
				System.out.println("Thanks!!! Have a nice Day ");
				Utility.quit();
				break;
			default:
				System.out.println("Invalid option");
				menu();
				break;
			}
		} else {
			System.out.println("Enter Numbers Only ");
			menu();
		}
	}

	/**
	 * Define static function doctorInput()
	 * 
	 * @return void
	 */
	private static void doctorInput() {
		System.out.println("Search doctor by:");
		System.out.println("1. Name ");
		System.out.println("2. ID ");
		System.out.println("3. Specialization ");
		System.out.println("4. Availability ");
		String choice = Utility.inputString();
		if (Utility.intChecker(choice)) {
			doctorChoice(choice);
		} else {
			System.out.println("Enter numbers only");
			doctorInput();
		}
	}

	/**
	 * Define static function doctorChoice()
	 * 
	 * @param choice
	 *            ->String
	 * @return void
	 */
	public static void doctorChoice(String choice) {
		switch (choice) {
		case "1":
			System.out.print("Enter Name :");
			service.readDoctorData("Name", Utility.inputString(), choice);
			break;
		case "2":
			System.out.print("Enter ID :");
			service.readDoctorData("Id", Utility.inputString(), choice);
			break;
		case "3/**\n" + "	 * Define function send()\n" + "	 * \n" + "	 * @param msg\n"
				+ "	 *            --> String\n" + "	 * @return void\n" + "	 */":
			System.out.print("Enter Speacialization :");
			service.readDoctorData("Specialization", Utility.inputString(), choice);
			break;
		case "4":
			System.out.print("Enter Availability :");
			service.readDoctorData("Availability", Utility.inputString(), choice);
			break;
		default:
			System.out.println("Select valid option \n");
			doctorChoice(choice);
		}
	}

	/**
	 * Define static function patientInput()
	 * 
	 * @return void
	 */
	private static void patientInput() {
		System.out.println("Search patient by :");
		System.out.println("1. Name ");
		System.out.println("2. ID ");
		System.out.println("3. Mobile Number  ");
		String choice = Utility.inputString();
		if (Utility.intChecker(choice)) {
			patientChoice(choice);
		} else {
			System.out.println("Enter Numbers Only ");
			doctorInput();
		}
	}

	/**
	 * Define static function patientChoice()
	 * 
	 * @param choice
	 *            ->String
	 * @return void
	 */

	private static void patientChoice(String choice) {
		switch (choice) {
		case "1":
			Utility.inputString();
			System.out.print("Enter Name :");
			service.readPatientData("Name", Utility.inputString());
			break;
		case "2":
			System.out.print("Enter ID :");
			service.readPatientData("Id", Utility.inputString());
			break;
		case "3":
			System.out.print("Enter Mobile Number :");
			service.readPatientData("Mobile", Utility.inputString());
			break;
		default:
			System.out.println("Please select valid option");
			patientChoice(choice);
			break;
		}
	}
}