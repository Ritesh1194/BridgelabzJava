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
 * @version 1.0
 * @since 02-12-2019
 *
 ******************************************************************************/
public interface CliniqueInterface {

	void doctorDetails();

	void readDoctorData(String key, String value, String choice);

	void readPatientData(String key, String value);

}
