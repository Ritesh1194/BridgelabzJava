
/** *****************************************************************************
 *11. his programme is used to manage a list of Doctors associated with the Clinique. 
 * 	This also manages the list of patients who use the clinique. 
 *	It manages Doctors by Name, Id, Specialization and Availability (AM,  PM or both).
 * 	It manages Patients by Name, ID, Mobile Number and Age. The Program allows users to search Doctor by name, id, Specialization or Availability.
 *  Also the programs allows users to search patient by name, mobile number or id. 
 *  The programs allows patients to take appointment with the doctor. A doctor at  any availability time can see only 5 patients.
 *  If exceeded the user can take appointment for patient at different date or availability time.
 *  Print the Doctor Patient Report. Also show which Specialization is popular in the Clinique as well as which Doctor is popular. 
 *  For .NET Engineers use the following

 *  @author  :  Ritesh Yadav
 *  @version :  1.0
 *  @since   :  02-12-2019
 *
 ***************************************************************************** */
package com.bridgelabz.oops.cliniquemanagement;

public class Appointment {
	int doctorId;
	int patientId;
	String doctorName;
	String patientName;
	String Availibility;
	String patientPhone;

	public String getAvailibility() {
		return Availibility;
	}

	public void setAvailibility(String Availibility) {
		this.Availibility = Availibility;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public int getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public String getPatientPhone() {
		return patientPhone;
	}

	public void setPatientPhone(String patientPhone) {
		this.patientPhone = patientPhone;
	}

	@Override
	public String toString() {
		return "Appointment [doctorName=" + doctorName + ", doctorId=" + doctorId + ", patientName=" + patientName
				+ ", patientId=" + patientId + ", Availibility=" + Availibility + ", patientPhone=" + patientPhone
				+ "]";
	}
}