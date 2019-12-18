package com.bridgelabz.oops.cliniquemanagement;

/**
 * *****************************************************************************
 * 11. his programme is used to manage a list of Doctors associated with the
 * Clinique. This also manages the list of patients who use the clinique. It
 * manages Doctors by Name, Id, Specialization and Availability (AM, PM or
 * both). It manages Patients by Name, ID, Mobile Number and Age. The Program
 * allows users to search Doctor byperson name, id, Specialization or
 * Availability. Also the programs allows users to search patient by name,
 * mobile number or id. The programs allows patients to take appointment with
 * the doctor. A doctor at any availability time can see only 5 patients. If
 * exceeded the user can take appointment for patient at different date or
 * availability time. Print the Doctor Patient Report. Also show which
 * Specialization is popular in the Clinique as well as which Doctor is popular.
 * For .NET Engineers use the following
 * 
 * @author : Ritesh Yadav
 * @version : 1.0
 * @since : 02-12-2019
 *
 */
public class Doctor {
	private String doctorName;
	private String doctorId;
	private String specialization;
	private String availability;
	private long numberOfPatients;

	public long getNumberOfPatients() {
		return numberOfPatients;
	}

	public void setNumberOfPatients(long numberOfPatients) {
		this.numberOfPatients = numberOfPatients;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public String getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(String doctorId) {
		this.doctorId = doctorId;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public String getAvailability() {
		return availability;
	}

	public void setAvailability(String availability) {
		this.availability = availability;
	}

	@Override
	public String toString() {
		return "Doctor [doctorName=" + doctorName + ", doctorId=" + doctorId + ", specialization=" + specialization
				+ ", availability=" + availability + ", numberOfPatients=" + numberOfPatients + "]";
	}
}